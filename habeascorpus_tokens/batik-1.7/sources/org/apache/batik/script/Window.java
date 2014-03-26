/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
BridgeContext	TokenNameIdentifier	 Bridge Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This interface represents the 'window' object defined in the global * environment of a SVG document. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: Window.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This interface represents the 'window' object defined in the global environment of a SVG document. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: Window.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
Window	TokenNameIdentifier	 Window
{	TokenNameLBRACE	
/** * Evaluates the given string repeatedly after the given amount of * time. This method does not stall the script: the evaluation is * scheduled and the script continues its execution. * @return an object representing the interval created. */	TokenNameCOMMENT_JAVADOC	 Evaluates the given string repeatedly after the given amount of time. This method does not stall the script: the evaluation is scheduled and the script continues its execution. @return an object representing the interval created. 
Object	TokenNameIdentifier	 Object
setInterval	TokenNameIdentifier	 set Interval
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
script	TokenNameIdentifier	 script
,	TokenNameCOMMA	
long	TokenNamelong	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Calls the 'run' method of the given Runnable repeatedly after * the given amount of time. This method does not stall the * script: the evaluation is scheduled and the script continues * its execution. * @return an object representing the interval created. */	TokenNameCOMMENT_JAVADOC	 Calls the 'run' method of the given Runnable repeatedly after the given amount of time. This method does not stall the script: the evaluation is scheduled and the script continues its execution. @return an object representing the interval created. 
Object	TokenNameIdentifier	 Object
setInterval	TokenNameIdentifier	 set Interval
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
long	TokenNamelong	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Cancels an interval that was set by a call to 'setInterval'. */	TokenNameCOMMENT_JAVADOC	 Cancels an interval that was set by a call to 'setInterval'. 
void	TokenNamevoid	
clearInterval	TokenNameIdentifier	 clear Interval
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Evaluates the given string after the given amount of time. * This method does not stall the script: the evaluation is * scheduled and the script continues its execution. * @return an object representing the timeout created. */	TokenNameCOMMENT_JAVADOC	 Evaluates the given string after the given amount of time. This method does not stall the script: the evaluation is scheduled and the script continues its execution. @return an object representing the timeout created. 
Object	TokenNameIdentifier	 Object
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
script	TokenNameIdentifier	 script
,	TokenNameCOMMA	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Calls the 'run' method of the given Runnable after the given * amount of time. This method does not stall the script: the * evaluation is scheduled and the script continues its execution. * @return an object representing the timeout created. */	TokenNameCOMMENT_JAVADOC	 Calls the 'run' method of the given Runnable after the given amount of time. This method does not stall the script: the evaluation is scheduled and the script continues its execution. @return an object representing the timeout created. 
Object	TokenNameIdentifier	 Object
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Cancels an timeout that was set by a call to 'setTimeout'. */	TokenNameCOMMENT_JAVADOC	 Cancels an timeout that was set by a call to 'setTimeout'. 
void	TokenNamevoid	
clearTimeout	TokenNameIdentifier	 clear Timeout
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parses the given XML string into a DocumentFragment of the * given document or a new document if 'doc' is null. * @return The document fragment or null on error. */	TokenNameCOMMENT_JAVADOC	 Parses the given XML string into a DocumentFragment of the given document or a new document if 'doc' is null. @return The document fragment or null on error. 
Node	TokenNameIdentifier	 Node
parseXML	TokenNameIdentifier	 parse XML
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets data from the given URI. * @param uri The URI where the data is located. * @param h A handler called when the data is available. */	TokenNameCOMMENT_JAVADOC	 Gets data from the given URI. @param uri The URI where the data is located. @param h A handler called when the data is available. 
void	TokenNamevoid	
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets data from the given URI. * @param uri The URI where the data is located. * @param h A handler called when the data is available. * @param enc The character encoding of the data. */	TokenNameCOMMENT_JAVADOC	 Gets data from the given URI. @param uri The URI where the data is located. @param h A handler called when the data is available. @param enc The character encoding of the data. 
void	TokenNamevoid	
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Posts data to the given URI. * @param uri The URI where the data is located. * @param content The data to post to the server. * @param h A handler called when the data is available. */	TokenNameCOMMENT_JAVADOC	 Posts data to the given URI. @param uri The URI where the data is located. @param content The data to post to the server. @param h A handler called when the data is available. 
void	TokenNamevoid	
postURL	TokenNameIdentifier	 post URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Posts data to the given URI. * @param uri The URI where the data is located. * @param content The data to post to the server. * @param h A handler called when the data is available. * @param mimeType The mimeType to asscoiate with post. */	TokenNameCOMMENT_JAVADOC	 Posts data to the given URI. @param uri The URI where the data is located. @param content The data to post to the server. @param h A handler called when the data is available. @param mimeType The mimeType to asscoiate with post. 
void	TokenNamevoid	
postURL	TokenNameIdentifier	 post URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Posts data to the given URI. * @param uri The URI where the data is located. * @param content The data to post to the server. * @param h A handler called when the data is available. * @param mimeType The mimeType to asscoiate with post. * @param enc The encoding to apply to <tt>content</tt> * may be "gzip", "deflate", or <tt>null</tt>. */	TokenNameCOMMENT_JAVADOC	 Posts data to the given URI. @param uri The URI where the data is located. @param content The data to post to the server. @param h A handler called when the data is available. @param mimeType The mimeType to asscoiate with post. @param enc The encoding to apply to <tt>content</tt> may be "gzip", "deflate", or <tt>null</tt>. 
void	TokenNamevoid	
postURL	TokenNameIdentifier	 post URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * To handle the completion of a 'getURL()' or 'postURL' call. */	TokenNameCOMMENT_JAVADOC	 To handle the completion of a 'getURL()' or 'postURL' call. 
interface	TokenNameinterface	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
{	TokenNameLBRACE	
/** * Called when the response is recieved. * @param success Whether the data was successfully retreived. * @param mime The data MIME type. * @param content The data. */	TokenNameCOMMENT_JAVADOC	 Called when the response is recieved. @param success Whether the data was successfully retreived. @param mime The data MIME type. @param content The data. 
void	TokenNamevoid	
getURLDone	TokenNameIdentifier	 get URL Done
(	TokenNameLPAREN	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mime	TokenNameIdentifier	 mime
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To handle the completion of a 'getURL()' call. public interface GetURLHandler extends URLResponseHandler { } */	TokenNameCOMMENT_JAVADOC	 To handle the completion of a 'getURL()' call. public interface GetURLHandler extends URLResponseHandler { } 
/** * Displays an alert dialog box. */	TokenNameCOMMENT_JAVADOC	 Displays an alert dialog box. 
void	TokenNamevoid	
alert	TokenNameIdentifier	 alert
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Displays a confirm dialog box. */	TokenNameCOMMENT_JAVADOC	 Displays a confirm dialog box. 
boolean	TokenNameboolean	
confirm	TokenNameIdentifier	 confirm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Displays an input dialog box. * @return The input of the user, or null if the dialog was cancelled. */	TokenNameCOMMENT_JAVADOC	 Displays an input dialog box. @return The input of the user, or null if the dialog was cancelled. 
String	TokenNameIdentifier	 String
prompt	TokenNameIdentifier	 prompt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Displays an input dialog box, given the default value. * @return The input of the user, or null if the dialog was cancelled. */	TokenNameCOMMENT_JAVADOC	 Displays an input dialog box, given the default value. @return The input of the user, or null if the dialog was cancelled. 
String	TokenNameIdentifier	 String
prompt	TokenNameIdentifier	 prompt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defVal	TokenNameIdentifier	 def Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the current BridgeContext. This object given a deep * access to the viewer internals. */	TokenNameCOMMENT_JAVADOC	 Returns the current BridgeContext. This object given a deep access to the viewer internals. 
BridgeContext	TokenNameIdentifier	 Bridge Context
getBridgeContext	TokenNameIdentifier	 get Bridge Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the associated interpreter. */	TokenNameCOMMENT_JAVADOC	 Returns the associated interpreter. 
Interpreter	TokenNameIdentifier	 Interpreter
getInterpreter	TokenNameIdentifier	 get Interpreter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
