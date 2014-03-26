/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformApplet.java 478660 2006-11-23 20:43:59Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformApplet.java 478660 2006-11-23 20:43:59Z minchau $ 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
applet	TokenNameIdentifier	 applet
.	TokenNameDOT	
Applet	TokenNameIdentifier	 Applet
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
BorderLayout	TokenNameIdentifier	 Border Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Button	TokenNameIdentifier	 Button
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Frame	TokenNameIdentifier	 Frame
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Label	TokenNameIdentifier	 Label
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Panel	TokenNameIdentifier	 Panel
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionEvent	TokenNameIdentifier	 Action Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionListener	TokenNameIdentifier	 Action Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamResult	TokenNameIdentifier	 Stream Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
;	TokenNameSEMICOLON	
/** * This applet demonstrates how XSL transformations can be made to run in * browsers without native XSLT support. * * Note that the XSLTC transformation engine is invoked through the JAXP * interface, using the XSLTC "use-classpath" attribute. The * "use-classpath" attribute specifies to the XSLTC TransformerFactory * that a precompiled version of the stylesheet (translet) may be available, * and that that should be used in preference to recompiling the stylesheet. * @author Morten Jorgensen * @author Jacek Ambroziak */	TokenNameCOMMENT_JAVADOC	 This applet demonstrates how XSL transformations can be made to run in browsers without native XSLT support. * Note that the XSLTC transformation engine is invoked through the JAXP interface, using the XSLTC "use-classpath" attribute. The "use-classpath" attribute specifies to the XSLTC TransformerFactory that a precompiled version of the stylesheet (translet) may be available, and that that should be used in preference to recompiling the stylesheet. @author Morten Jorgensen @author Jacek Ambroziak 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TransformApplet	TokenNameIdentifier	 Transform Applet
extends	TokenNameextends	
Applet	TokenNameIdentifier	 Applet
{	TokenNameLBRACE	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tf	TokenNameIdentifier	 tf
;	TokenNameSEMICOLON	
TransformDelegate	TokenNameIdentifier	 Transform Delegate
transformThread	TokenNameIdentifier	 transform Thread
;	TokenNameSEMICOLON	
/** * This class implements a dialog box used for XSL messages/comments */	TokenNameCOMMENT_JAVADOC	 This class implements a dialog box used for XSL messages/comments 
public	TokenNamepublic	
class	TokenNameclass	
MessageFrame	TokenNameIdentifier	 Message Frame
extends	TokenNameextends	
Frame	TokenNameIdentifier	 Frame
{	TokenNameLBRACE	
public	TokenNamepublic	
Frame	TokenNameIdentifier	 Frame
frame	TokenNameIdentifier	 frame
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ButtonHandler	TokenNameIdentifier	 Button Handler
implements	TokenNameimplements	
ActionListener	TokenNameIdentifier	 Action Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method handles xml:message and xsl:comment by displaying * the message/comment in a dialog box. */	TokenNameCOMMENT_JAVADOC	 This method handles xml:message and xsl:comment by displaying the message/comment in a dialog box. 
public	TokenNamepublic	
MessageFrame	TokenNameIdentifier	 Message Frame
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// Make visible to ButtonHandler 	TokenNameCOMMENT_LINE	Make visible to ButtonHandler 
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
320	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a panel for the message itself 	TokenNameCOMMENT_LINE	Create a panel for the message itself 
Panel	TokenNameIdentifier	 Panel
center	TokenNameIdentifier	 center
=	TokenNameEQUAL	
new	TokenNamenew	
Panel	TokenNameIdentifier	 Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Label	TokenNameIdentifier	 Label
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a panel for the 'OK' button 	TokenNameCOMMENT_LINE	Create a panel for the 'OK' button 
Panel	TokenNameIdentifier	 Panel
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
new	TokenNamenew	
Panel	TokenNameIdentifier	 Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Button	TokenNameIdentifier	 Button
okButton	TokenNameIdentifier	 ok Button
=	TokenNameEQUAL	
new	TokenNamenew	
Button	TokenNameIdentifier	 Button
(	TokenNameLPAREN	
" OK "	TokenNameStringLiteral	 OK 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
okButton	TokenNameIdentifier	 ok Button
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ButtonHandler	TokenNameIdentifier	 Button Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
okButton	TokenNameIdentifier	 ok Button
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the two panels to the window/frame 	TokenNameCOMMENT_LINE	Add the two panels to the window/frame 
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
CENTER	TokenNameIdentifier	 CENTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
SOUTH	TokenNameIdentifier	 SOUTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Show the whole thing 	TokenNameCOMMENT_LINE	Show the whole thing 
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The applet uses this method to display messages and comments * generated by xsl:message and xsl:comment elements. */	TokenNameCOMMENT_JAVADOC	 The applet uses this method to display messages and comments generated by xsl:message and xsl:comment elements. 
public	TokenNamepublic	
class	TokenNameclass	
AppletErrorListener	TokenNameIdentifier	 Applet Error Listener
implements	TokenNameimplements	
ErrorListener	TokenNameIdentifier	 Error Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
displayMessage	TokenNameIdentifier	 display Message
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MessageFrame	TokenNameIdentifier	 Message Frame
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
new	TokenNamenew	
MessageFrame	TokenNameIdentifier	 Message Frame
(	TokenNameLPAREN	
"XSL transformation alert"	TokenNameStringLiteral	XSL transformation alert
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
displayMessage	TokenNameIdentifier	 display Message
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
displayMessage	TokenNameIdentifier	 display Message
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
displayMessage	TokenNameIdentifier	 display Message
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method is the main body of the applet. The method is called * by some JavaScript code in an HTML document. */	TokenNameCOMMENT_JAVADOC	 This method is the main body of the applet. The method is called by some JavaScript code in an HTML document. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
stylesheetURL	TokenNameIdentifier	 stylesheet URL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
arg1	TokenNameIdentifier	 arg1
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
documentURL	TokenNameIdentifier	 document URL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
arg2	TokenNameIdentifier	 arg2
;	TokenNameSEMICOLON	
transformThread	TokenNameIdentifier	 transform Thread
.	TokenNameDOT	
setStylesheetURL	TokenNameIdentifier	 set Stylesheet URL
(	TokenNameLPAREN	
stylesheetURL	TokenNameIdentifier	 stylesheet URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformThread	TokenNameIdentifier	 transform Thread
.	TokenNameDOT	
setDocumentURL	TokenNameIdentifier	 set Document URL
(	TokenNameLPAREN	
documentURL	TokenNameIdentifier	 document URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformThread	TokenNameIdentifier	 transform Thread
.	TokenNameDOT	
setWaiting	TokenNameIdentifier	 set Waiting
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformThread	TokenNameIdentifier	 transform Thread
.	TokenNameDOT	
wakeUp	TokenNameIdentifier	 wake Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
transformThread	TokenNameIdentifier	 transform Thread
.	TokenNameDOT	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
"stylesheet-name"	TokenNameStringLiteral	stylesheet-name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
"input-document"	TokenNameStringLiteral	input-document
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
destroy	TokenNameIdentifier	 destroy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformThread	TokenNameIdentifier	 transform Thread
.	TokenNameDOT	
destroy	TokenNameIdentifier	 destroy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"use-classpath"	TokenNameStringLiteral	use-classpath
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Could not set XSLTC-specific TransformerFactory"	TokenNameStringLiteral	Could not set XSLTC-specific TransformerFactory
+	TokenNamePLUS	
" attributes. Transformation failed."	TokenNameStringLiteral	 attributes. Transformation failed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Another thread is created to keep the context class loader 	TokenNameCOMMENT_LINE	Another thread is created to keep the context class loader 
// information. When use JDK 1.4 plugin for browser, to get around the 	TokenNameCOMMENT_LINE	information. When use JDK 1.4 plugin for browser, to get around the 
// problem with the bundled old version of xalan and endorsed class 	TokenNameCOMMENT_LINE	problem with the bundled old version of xalan and endorsed class 
// loading mechanism 	TokenNameCOMMENT_LINE	loading mechanism 
transformThread	TokenNameIdentifier	 transform Thread
=	TokenNameEQUAL	
new	TokenNamenew	
TransformDelegate	TokenNameIdentifier	 Transform Delegate
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
transformThread	TokenNameIdentifier	 transform Thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"transformThread"	TokenNameStringLiteral	transformThread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transformThread	TokenNameIdentifier	 transform Thread
.	TokenNameDOT	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
wakeUp	TokenNameIdentifier	 wake Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
TransformDelegate	TokenNameIdentifier	 Transform Delegate
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isRunning	TokenNameIdentifier	 is Running
,	TokenNameCOMMA	
isWaiting	TokenNameIdentifier	 is Waiting
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
stylesheetURL	TokenNameIdentifier	 stylesheet URL
,	TokenNameCOMMA	
documentURL	TokenNameIdentifier	 document URL
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
outPut	TokenNameIdentifier	 out Put
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TransformDelegate	TokenNameIdentifier	 Transform Delegate
(	TokenNameLPAREN	
boolean	TokenNameboolean	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isRunning	TokenNameIdentifier	 is Running
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
isWaiting	TokenNameIdentifier	 is Waiting
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
isRunning	TokenNameIdentifier	 is Running
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
isWaiting	TokenNameIdentifier	 is Waiting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isWaiting	TokenNameIdentifier	 is Waiting
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
TransformApplet	TokenNameIdentifier	 Transform Applet
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
wakeUp	TokenNameIdentifier	 wake Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStylesheetURL	TokenNameIdentifier	 set Stylesheet URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stylesheetURL	TokenNameIdentifier	 stylesheet URL
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentURL	TokenNameIdentifier	 set Document URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
documentURL	TokenNameIdentifier	 document URL
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStylesheetURL	TokenNameIdentifier	 get Stylesheet URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stylesheetURL	TokenNameIdentifier	 stylesheet URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentURL	TokenNameIdentifier	 get Document URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentURL	TokenNameIdentifier	 document URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setWaiting	TokenNameIdentifier	 set Waiting
(	TokenNameLPAREN	
boolean	TokenNameboolean	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isWaiting	TokenNameIdentifier	 is Waiting
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
destroy	TokenNameIdentifier	 destroy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isRunning	TokenNameIdentifier	 is Running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
wakeUp	TokenNameIdentifier	 wake Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outPut	TokenNameIdentifier	 out Put
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
xslURL	TokenNameIdentifier	 xsl URL
=	TokenNameEQUAL	
getStylesheetURL	TokenNameIdentifier	 get Stylesheet URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
docURL	TokenNameIdentifier	 doc URL
=	TokenNameEQUAL	
getDocumentURL	TokenNameIdentifier	 get Document URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Initialise the output stream 	TokenNameCOMMENT_LINE	Initialise the output stream 
StringWriter	TokenNameIdentifier	 String Writer
sout	TokenNameIdentifier	 sout
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sout	TokenNameIdentifier	 sout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check that the parameters are valid 	TokenNameCOMMENT_LINE	Check that the parameters are valid 
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xslURL	TokenNameIdentifier	 xsl URL
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
docURL	TokenNameIdentifier	 doc URL
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<h1>Transformation error</h1>"	TokenNameStringLiteral	<h1>Transformation error</h1>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"The parameters <b><tt>stylesheetURL</tt></b> "	TokenNameStringLiteral	The parameters <b><tt>stylesheetURL</tt></b> 
+	TokenNamePLUS	
"and <b><tt>source</tt></b> must be specified"	TokenNameStringLiteral	and <b><tt>source</tt></b> must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Transformer	TokenNameIdentifier	 Transformer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
xslURL	TokenNameIdentifier	 xsl URL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
new	TokenNamenew	
AppletErrorListener	TokenNameIdentifier	 Applet Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<!-- transformed by XSLTC in "	TokenNameStringLiteral	<!-- transformed by XSLTC in 
+	TokenNamePLUS	
done	TokenNameIdentifier	 done
+	TokenNamePLUS	
"msecs -->"	TokenNameStringLiteral	msecs -->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now close up the sink, and return the HTML output in the 	TokenNameCOMMENT_LINE	Now close up the sink, and return the HTML output in the 
// StringWrite object as a string. 	TokenNameCOMMENT_LINE	StringWrite object as a string. 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Transformation complete!"	TokenNameStringLiteral	Transformation complete!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sout	TokenNameIdentifier	 sout
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outPut	TokenNameIdentifier	 out Put
=	TokenNameEQUAL	
sout	TokenNameIdentifier	 sout
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sout	TokenNameIdentifier	 sout
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<h1>RTE</h1>"	TokenNameStringLiteral	<h1>RTE</h1>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outPut	TokenNameIdentifier	 out Put
=	TokenNameEQUAL	
sout	TokenNameIdentifier	 sout
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<h1>exception</h1>"	TokenNameStringLiteral	<h1>exception</h1>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outPut	TokenNameIdentifier	 out Put
=	TokenNameEQUAL	
sout	TokenNameIdentifier	 sout
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
