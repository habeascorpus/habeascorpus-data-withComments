/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xpointer	TokenNameIdentifier	 xpointer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
;	TokenNameSEMICOLON	
/** * The Default XPointer error handler used by the XInclude implementation. * XPointer error's are thrown so that they may be caught by the XInclude * implementation and reported as resource errors. * * @version $Id: XPointerErrorHandler.java 603808 2007-12-13 03:44:48Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The Default XPointer error handler used by the XInclude implementation. XPointer error's are thrown so that they may be caught by the XInclude implementation and reported as resource errors. * @version $Id: XPointerErrorHandler.java 603808 2007-12-13 03:44:48Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
XPointerErrorHandler	TokenNameIdentifier	 X Pointer Error Handler
implements	TokenNameimplements	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Print writer. */	TokenNameCOMMENT_JAVADOC	 Print writer. 
protected	TokenNameprotected	
PrintWriter	TokenNameIdentifier	 Print Writer
fOut	TokenNameIdentifier	 f Out
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs an error handler that prints error messages to * <code>System.err</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an error handler that prints error messages to <code>System.err</code>. 
public	TokenNamepublic	
XPointerErrorHandler	TokenNameIdentifier	 X Pointer Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * Constructs an error handler that prints error messages to the * specified <code>PrintWriter</code. */	TokenNameCOMMENT_JAVADOC	 Constructs an error handler that prints error messages to the specified <code>PrintWriter</code. 
public	TokenNamepublic	
XPointerErrorHandler	TokenNameIdentifier	 X Pointer Error Handler
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOut	TokenNameIdentifier	 f Out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(PrintWriter) 	TokenNameCOMMENT_LINE	<init>(PrintWriter) 
// 	TokenNameCOMMENT_LINE	 
// ErrorHandler methods 	TokenNameCOMMENT_LINE	ErrorHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** Warning. */	TokenNameCOMMENT_JAVADOC	 Warning. 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
"Warning"	TokenNameStringLiteral	Warning
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// warning(XMLParseException) 	TokenNameCOMMENT_LINE	warning(XMLParseException) 
/** Error. */	TokenNameCOMMENT_JAVADOC	 Error. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
"Error"	TokenNameStringLiteral	Error
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//throw ex; 	TokenNameCOMMENT_LINE	throw ex; 
}	TokenNameRBRACE	
// error(XMLParseException) 	TokenNameCOMMENT_LINE	error(XMLParseException) 
/** Fatal error. */	TokenNameCOMMENT_JAVADOC	 Fatal error. 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
"Fatal Error"	TokenNameStringLiteral	Fatal Error
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fatalError(XMLParseException) 	TokenNameCOMMENT_LINE	fatalError(XMLParseException) 
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** Prints the error message. */	TokenNameCOMMENT_JAVADOC	 Prints the error message. 
private	TokenNameprivate	
void	TokenNamevoid	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
XMLParseException	TokenNameIdentifier	 XML Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOut	TokenNameIdentifier	 f Out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// printError(String,SAXParseException) 	TokenNameCOMMENT_LINE	printError(String,SAXParseException) 
}	TokenNameRBRACE	
// class DefaultErrorHandler 	TokenNameCOMMENT_LINE	class DefaultErrorHandler 
