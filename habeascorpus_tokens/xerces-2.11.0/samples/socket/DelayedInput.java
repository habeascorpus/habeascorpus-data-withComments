/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
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
InputStream	TokenNameIdentifier	 Input Stream
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
DefaultHandler	TokenNameIdentifier	 Default Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
ParserAdapter	TokenNameIdentifier	 Parser Adapter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
ParserFactory	TokenNameIdentifier	 Parser Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
;	TokenNameSEMICOLON	
/** * This sample delays the input to the SAX parser to simulate reading data * from a socket where data is not always immediately available. An XML * parser should be able to parse the input and perform the necessary * callbacks as data becomes available. So this is a good way to test * any parser that implements the SAX2 <code>XMLReader</code> interface * to see if it can parse data as it arrives. * <p> * <strong>Note:</strong> This sample uses NSGMLS-like output of elements * and attributes interspersed with information about how many bytes are * being read at a time. * * @author Andy Clark, IBM * * @version $Id: DelayedInput.java 447688 2006-09-19 02:39:49Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This sample delays the input to the SAX parser to simulate reading data from a socket where data is not always immediately available. An XML parser should be able to parse the input and perform the necessary callbacks as data becomes available. So this is a good way to test any parser that implements the SAX2 <code>XMLReader</code> interface to see if it can parse data as it arrives. <p> <strong>Note:</strong> This sample uses NSGMLS-like output of elements and attributes interspersed with information about how many bytes are being read at a time. * @author Andy Clark, IBM * @version $Id: DelayedInput.java 447688 2006-09-19 02:39:49Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DelayedInput	TokenNameIdentifier	 Delayed Input
extends	TokenNameextends	
DefaultHandler	TokenNameIdentifier	 Default Handler
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// feature ids 	TokenNameCOMMENT_LINE	feature ids 
/** Namespaces feature id (http://xml.org/sax/features/namespaces). */	TokenNameCOMMENT_JAVADOC	 Namespaces feature id (http://xml.org/sax/features/namespaces). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACES_FEATURE_ID	TokenNameIdentifier	 NAMESPACES  FEATURE  ID
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespaces"	TokenNameStringLiteral	http://xml.org/sax/features/namespaces
;	TokenNameSEMICOLON	
/** Validation feature id (http://xml.org/sax/features/validation). */	TokenNameCOMMENT_JAVADOC	 Validation feature id (http://xml.org/sax/features/validation). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATION_FEATURE_ID	TokenNameIdentifier	 VALIDATION  FEATURE  ID
=	TokenNameEQUAL	
"http://xml.org/sax/features/validation"	TokenNameStringLiteral	http://xml.org/sax/features/validation
;	TokenNameSEMICOLON	
/** Schema validation feature id (http://apache.org/xml/features/validation/schema). */	TokenNameCOMMENT_JAVADOC	 Schema validation feature id (http://apache.org/xml/features/validation/schema). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_VALIDATION_FEATURE_ID	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/validation/schema"	TokenNameStringLiteral	http://apache.org/xml/features/validation/schema
;	TokenNameSEMICOLON	
/** Schema full checking feature id (http://apache.org/xml/features/validation/schema-full-checking). */	TokenNameCOMMENT_JAVADOC	 Schema full checking feature id (http://apache.org/xml/features/validation/schema-full-checking). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_FULL_CHECKING_FEATURE_ID	TokenNameIdentifier	 SCHEMA  FULL  CHECKING  FEATURE  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/validation/schema-full-checking"	TokenNameStringLiteral	http://apache.org/xml/features/validation/schema-full-checking
;	TokenNameSEMICOLON	
// default settings 	TokenNameCOMMENT_LINE	default settings 
/** Default parser name. */	TokenNameCOMMENT_JAVADOC	 Default parser name. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
=	TokenNameEQUAL	
"org.apache.xerces.parsers.SAXParser"	TokenNameStringLiteral	org.apache.xerces.parsers.SAXParser
;	TokenNameSEMICOLON	
/** Default namespaces support (true). */	TokenNameCOMMENT_JAVADOC	 Default namespaces support (true). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_NAMESPACES	TokenNameIdentifier	 DEFAULT  NAMESPACES
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Default validation support (false). */	TokenNameCOMMENT_JAVADOC	 Default validation support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_VALIDATION	TokenNameIdentifier	 DEFAULT  VALIDATION
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default Schema validation support (false). */	TokenNameCOMMENT_JAVADOC	 Default Schema validation support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_SCHEMA_VALIDATION	TokenNameIdentifier	 DEFAULT  SCHEMA  VALIDATION
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default Schema full checking support (false). */	TokenNameCOMMENT_JAVADOC	 Default Schema full checking support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_SCHEMA_FULL_CHECKING	TokenNameIdentifier	 DEFAULT  SCHEMA  FULL  CHECKING
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
DelayedInput	TokenNameIdentifier	 Delayed Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// 	TokenNameCOMMENT_LINE	 
// ContentHandler methods 	TokenNameCOMMENT_LINE	ContentHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** Start element. */	TokenNameCOMMENT_JAVADOC	 Start element. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
+	TokenNamePLUS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// startElement(String,String,String,Attributes) 	TokenNameCOMMENT_LINE	startElement(String,String,String,Attributes) 
/** End element. */	TokenNameCOMMENT_JAVADOC	 End element. 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// endElement(String,String,String) 	TokenNameCOMMENT_LINE	endElement(String,String,String) 
// 	TokenNameCOMMENT_LINE	 
// ErrorHandler methods 	TokenNameCOMMENT_LINE	ErrorHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** Warning. */	TokenNameCOMMENT_JAVADOC	 Warning. 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
"Warning"	TokenNameStringLiteral	Warning
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// warning(SAXParseException) 	TokenNameCOMMENT_LINE	warning(SAXParseException) 
/** Error. */	TokenNameCOMMENT_JAVADOC	 Error. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
"Error"	TokenNameStringLiteral	Error
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// error(SAXParseException) 	TokenNameCOMMENT_LINE	error(SAXParseException) 
/** Fatal error. */	TokenNameCOMMENT_JAVADOC	 Fatal error. 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
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
// fatalError(SAXParseException) 	TokenNameCOMMENT_LINE	fatalError(SAXParseException) 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** Prints the error message. */	TokenNameCOMMENT_JAVADOC	 Prints the error message. 
protected	TokenNameprotected	
void	TokenNamevoid	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
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
getSystemId	TokenNameIdentifier	 get System Id
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// printError(String,SAXParseException) 	TokenNameCOMMENT_LINE	printError(String,SAXParseException) 
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * Delayed input stream filter. This class will limit block reads to a small * number of bytes (suitable for display on a standard 80 column terminal) * pausing in small increments, randomly. This lets you can verify that the * parser can parse the input and make the appropriate callbacks as the * data arrives. * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 Delayed input stream filter. This class will limit block reads to a small number of bytes (suitable for display on a standard 80 column terminal) pausing in small increments, randomly. This lets you can verify that the parser can parse the input and make the appropriate callbacks as the data arrives. * @author Andy Clark, IBM 
static	TokenNamestatic	
class	TokenNameclass	
DelayedInputStream	TokenNameIdentifier	 Delayed Input Stream
extends	TokenNameextends	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Random number generator. */	TokenNameCOMMENT_JAVADOC	 Random number generator. 
private	TokenNameprivate	
Random	TokenNameIdentifier	 Random
fRandom	TokenNameIdentifier	 f Random
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a delayed input stream from the specified input stream. */	TokenNameCOMMENT_JAVADOC	 Constructs a delayed input stream from the specified input stream. 
public	TokenNamepublic	
DelayedInputStream	TokenNameIdentifier	 Delayed Input Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream) 	TokenNameCOMMENT_LINE	<init>(InputStream) 
// 	TokenNameCOMMENT_LINE	 
// InputStream methods 	TokenNameCOMMENT_LINE	InputStream methods 
// 	TokenNameCOMMENT_LINE	 
/** Performs a delayed block read. */	TokenNameCOMMENT_JAVADOC	 Performs a delayed block read. 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// keep read small enough for display 	TokenNameCOMMENT_LINE	keep read small enough for display 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
48	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// read bytes and pause 	TokenNameCOMMENT_LINE	read bytes and pause 
long	TokenNamelong	
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
fRandom	TokenNameIdentifier	 f Random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// print output 	TokenNameCOMMENT_LINE	print output 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"read "	TokenNameStringLiteral	read 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
" bytes in "	TokenNameStringLiteral	 bytes in 
+	TokenNamePLUS	
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
-	TokenNameMINUS	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ms: "	TokenNameStringLiteral	 ms: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printBuffer	TokenNameIdentifier	 print Buffer
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return number of characters read 	TokenNameCOMMENT_LINE	return number of characters read 
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read(byte[],int,int):int 	TokenNameCOMMENT_LINE	read(byte[],int,int):int 
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** Prints the specified buffer. */	TokenNameCOMMENT_JAVADOC	 Prints the specified buffer. 
private	TokenNameprivate	
void	TokenNamevoid	
printBuffer	TokenNameIdentifier	 print Buffer
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is there anything to do? 	TokenNameCOMMENT_LINE	is there anything to do? 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"no data read"	TokenNameStringLiteral	no data read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// print buffer 	TokenNameCOMMENT_LINE	print buffer 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"\r"	TokenNameStringLiteral	\r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"\n"	TokenNameStringLiteral	\n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// printBuffer(byte[],int,int) 	TokenNameCOMMENT_LINE	printBuffer(byte[],int,int) 
}	TokenNameRBRACE	
// class DelayedInputStream 	TokenNameCOMMENT_LINE	class DelayedInputStream 
// 	TokenNameCOMMENT_LINE	 
// MAIN 	TokenNameCOMMENT_LINE	MAIN 
// 	TokenNameCOMMENT_LINE	 
/** Main program entry point. */	TokenNameCOMMENT_JAVADOC	 Main program entry point. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is there anything to do? 	TokenNameCOMMENT_LINE	is there anything to do? 
if	TokenNameif	
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// variables 	TokenNameCOMMENT_LINE	variables 
DefaultHandler	TokenNameIdentifier	 Default Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
DelayedInput	TokenNameIdentifier	 Delayed Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLReader	TokenNameIdentifier	 XML Reader
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
namespaces	TokenNameIdentifier	 namespaces
=	TokenNameEQUAL	
DEFAULT_NAMESPACES	TokenNameIdentifier	 DEFAULT  NAMESPACES
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
validation	TokenNameIdentifier	 validation
=	TokenNameEQUAL	
DEFAULT_VALIDATION	TokenNameIdentifier	 DEFAULT  VALIDATION
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
schemaValidation	TokenNameIdentifier	 schema Validation
=	TokenNameEQUAL	
DEFAULT_SCHEMA_VALIDATION	TokenNameIdentifier	 DEFAULT  SCHEMA  VALIDATION
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
=	TokenNameEQUAL	
DEFAULT_SCHEMA_FULL_CHECKING	TokenNameIdentifier	 DEFAULT  SCHEMA  FULL  CHECKING
;	TokenNameSEMICOLON	
// process arguments 	TokenNameCOMMENT_LINE	process arguments 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
option	TokenNameIdentifier	 option
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"p"	TokenNameStringLiteral	p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get parser name 	TokenNameCOMMENT_LINE	get parser name 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Missing argument to -p option."	TokenNameStringLiteral	error: Missing argument to -p option.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
parserName	TokenNameIdentifier	 parser Name
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// create parser 	TokenNameCOMMENT_LINE	create parser 
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
parserName	TokenNameIdentifier	 parser Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Parser	TokenNameIdentifier	 Parser
sax1Parser	TokenNameIdentifier	 sax1 Parser
=	TokenNameEQUAL	
ParserFactory	TokenNameIdentifier	 Parser Factory
.	TokenNameDOT	
makeParser	TokenNameIdentifier	 make Parser
(	TokenNameLPAREN	
parserName	TokenNameIdentifier	 parser Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
ParserAdapter	TokenNameIdentifier	 Parser Adapter
(	TokenNameLPAREN	
sax1Parser	TokenNameIdentifier	 sax1 Parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Features and properties not supported on SAX1 parsers."	TokenNameStringLiteral	warning: Features and properties not supported on SAX1 parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Unable to instantiate parser ("	TokenNameStringLiteral	error: Unable to instantiate parser (
+	TokenNamePLUS	
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"n"	TokenNameStringLiteral	n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespaces	TokenNameIdentifier	 namespaces
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"n"	TokenNameStringLiteral	n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validation	TokenNameIdentifier	 validation
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemaValidation	TokenNameIdentifier	 schema Validation
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"h"	TokenNameStringLiteral	h
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// use default parser? 	TokenNameCOMMENT_LINE	use default parser? 
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create parser 	TokenNameCOMMENT_LINE	create parser 
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Unable to instantiate parser ("	TokenNameStringLiteral	error: Unable to instantiate parser (
+	TokenNamePLUS	
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// set parser features 	TokenNameCOMMENT_LINE	set parser features 
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
NAMESPACES_FEATURE_ID	TokenNameIdentifier	 NAMESPACES  FEATURE  ID
,	TokenNameCOMMA	
namespaces	TokenNameIdentifier	 namespaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
NAMESPACES_FEATURE_ID	TokenNameIdentifier	 NAMESPACES  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
VALIDATION_FEATURE_ID	TokenNameIdentifier	 VALIDATION  FEATURE  ID
,	TokenNameCOMMA	
validation	TokenNameIdentifier	 validation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
VALIDATION_FEATURE_ID	TokenNameIdentifier	 VALIDATION  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
SCHEMA_VALIDATION_FEATURE_ID	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE  ID
,	TokenNameCOMMA	
schemaValidation	TokenNameIdentifier	 schema Validation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
SCHEMA_VALIDATION_FEATURE_ID	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
SCHEMA_FULL_CHECKING_FEATURE_ID	TokenNameIdentifier	 SCHEMA  FULL  CHECKING  FEATURE  ID
,	TokenNameCOMMA	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
SCHEMA_FULL_CHECKING_FEATURE_ID	TokenNameIdentifier	 SCHEMA  FULL  CHECKING  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// parse file 	TokenNameCOMMENT_LINE	parse file 
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"# filename: "	TokenNameStringLiteral	# filename: 
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
DelayedInputStream	TokenNameIdentifier	 Delayed Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Parse error occurred - "	TokenNameStringLiteral	error: Parse error occurred - 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
SAXException	TokenNameIdentifier	 SAX Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// main(String[]) 	TokenNameCOMMENT_LINE	main(String[]) 
// 	TokenNameCOMMENT_LINE	 
// Private static methods 	TokenNameCOMMENT_LINE	Private static methods 
// 	TokenNameCOMMENT_LINE	 
/** Prints the usage. */	TokenNameCOMMENT_JAVADOC	 Prints the usage. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: java socket.DelayedInput (options) filename ..."	TokenNameStringLiteral	usage: java socket.DelayedInput (options) filename ...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"options:"	TokenNameStringLiteral	options:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -p name Select parser by name."	TokenNameStringLiteral	 -p name Select parser by name.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -n | -N Turn on/off namespace processing."	TokenNameStringLiteral	 -n | -N Turn on/off namespace processing.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -v | -V Turn on/off validation."	TokenNameStringLiteral	 -v | -V Turn on/off validation.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -s | -S Turn on/off Schema validation support."	TokenNameStringLiteral	 -s | -S Turn on/off Schema validation support.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Not supported by all parsers."	TokenNameStringLiteral	 NOTE: Not supported by all parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -f | -F Turn on/off Schema full checking."	TokenNameStringLiteral	 -f | -F Turn on/off Schema full checking.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Requires use of -s and not supported by all parsers."	TokenNameStringLiteral	 NOTE: Requires use of -s and not supported by all parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -h This help screen."	TokenNameStringLiteral	 -h This help screen.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"defaults:"	TokenNameStringLiteral	defaults:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Parser: "	TokenNameStringLiteral	 Parser: 
+	TokenNamePLUS	
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Namespaces: "	TokenNameStringLiteral	 Namespaces: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_NAMESPACES	TokenNameIdentifier	 DEFAULT  NAMESPACES
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Validation: "	TokenNameStringLiteral	 Validation: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_VALIDATION	TokenNameIdentifier	 DEFAULT  VALIDATION
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Schema: "	TokenNameStringLiteral	 Schema: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_SCHEMA_VALIDATION	TokenNameIdentifier	 DEFAULT  SCHEMA  VALIDATION
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Schema full checking: "	TokenNameStringLiteral	 Schema full checking: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_SCHEMA_FULL_CHECKING	TokenNameIdentifier	 DEFAULT  SCHEMA  FULL  CHECKING
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// printUsage() 	TokenNameCOMMENT_LINE	printUsage() 
}	TokenNameRBRACE	
// class DelayedInput 	TokenNameCOMMENT_LINE	class DelayedInput 
