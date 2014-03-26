/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
email	TokenNameIdentifier	 email
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
ProjectComponent	TokenNameIdentifier	 Project Component
;	TokenNameSEMICOLON	
/** * Class representing an email message. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Class representing an email message. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
Message	TokenNameIdentifier	 Message
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
messageSource	TokenNameIdentifier	 message Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
=	TokenNameEQUAL	
"text/plain"	TokenNameStringLiteral	text/plain
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Creates a new empty message */	TokenNameCOMMENT_JAVADOC	 Creates a new empty message 
public	TokenNamepublic	
Message	TokenNameIdentifier	 Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new message based on the given string * * @param text the message */	TokenNameCOMMENT_JAVADOC	 Creates a new message based on the given string * @param text the message 
public	TokenNamepublic	
Message	TokenNameIdentifier	 Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new message using the contents of the given file. * * @param file the source of the message */	TokenNameCOMMENT_JAVADOC	 Creates a new message using the contents of the given file. * @param file the source of the message 
public	TokenNamepublic	
Message	TokenNameIdentifier	 Message
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
messageSource	TokenNameIdentifier	 message Source
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a textual part of the message * * @param text some text to add */	TokenNameCOMMENT_JAVADOC	 Adds a textual part of the message * @param text some text to add 
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the source file of the message * * @param src the source of the message */	TokenNameCOMMENT_JAVADOC	 Sets the source file of the message * @param src the source of the message 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
messageSource	TokenNameIdentifier	 message Source
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the content type for the message * * @param mimeType a mime type e.g. "text/plain" */	TokenNameCOMMENT_JAVADOC	 Sets the content type for the message * @param mimeType a mime type e.g. "text/plain" 
public	TokenNamepublic	
void	TokenNamevoid	
setMimeType	TokenNameIdentifier	 set Mime Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mimeType	TokenNameIdentifier	 mime Type
=	TokenNameEQUAL	
mimeType	TokenNameIdentifier	 mime Type
;	TokenNameSEMICOLON	
specified	TokenNameIdentifier	 specified
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the content type * * @return the mime type */	TokenNameCOMMENT_JAVADOC	 Returns the content type * @return the mime type 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMimeType	TokenNameIdentifier	 get Mime Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mimeType	TokenNameIdentifier	 mime Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints the message onto an output stream * * @param ps The print stream to write to * @throws IOException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Prints the message onto an output stream * @param ps The print stream to write to @throws IOException if an error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// We need character encoding aware printing here. 	TokenNameCOMMENT_LINE	We need character encoding aware printing here. 
// So, using BufferedWriter over OutputStreamWriter instead of PrintStream 	TokenNameCOMMENT_LINE	So, using BufferedWriter over OutputStreamWriter instead of PrintStream 
BufferedWriter	TokenNameIdentifier	 Buffered Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
,	TokenNameCOMMA	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
messageSource	TokenNameIdentifier	 message Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Read message from a file 	TokenNameCOMMENT_LINE	Read message from a file 
FileReader	TokenNameIdentifier	 File Reader
freader	TokenNameIdentifier	 freader
=	TokenNameEQUAL	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
messageSource	TokenNameIdentifier	 message Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
freader	TokenNameIdentifier	 freader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
freader	TokenNameIdentifier	 freader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
//do not close the out writer as it is reused afterwards by the mail task 	TokenNameCOMMENT_LINE	do not close the out writer as it is reused afterwards by the mail task 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if the mimeType has been set. * * @return false if the default value is in use */	TokenNameCOMMENT_JAVADOC	 Returns true if the mimeType has been set. * @return false if the default value is in use 
public	TokenNamepublic	
boolean	TokenNameboolean	
isMimeTypeSpecified	TokenNameIdentifier	 is Mime Type Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
specified	TokenNameIdentifier	 specified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the character set of mail message. * Will be ignored if mimeType contains ....; Charset=... substring. * @param charset the character set name. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Sets the character set of mail message. Will be ignored if mimeType contains ....; Charset=... substring. @param charset the character set name. @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setCharset	TokenNameIdentifier	 set Charset
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the charset of mail message. * * @return Charset of mail message. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Returns the charset of mail message. * @return Charset of mail message. @since Ant 1.6 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCharset	TokenNameIdentifier	 get Charset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
