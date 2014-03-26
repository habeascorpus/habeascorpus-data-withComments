/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
jaxp	TokenNameIdentifier	 jaxp
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
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
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
Schema	TokenNameIdentifier	 Schema
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
SchemaFactory	TokenNameIdentifier	 Schema Factory
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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
DefaultHandler	TokenNameIdentifier	 Default Handler
;	TokenNameSEMICOLON	
/** * <p>A sample which demonstrates usage of the JAXP 1.3 Parser API.</p> * * @author Michael Glavassevich, IBM * @author Ankit Pasricha, IBM * * @version $Id: ParserAPIUsage.java 447685 2006-09-19 02:37:49Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>A sample which demonstrates usage of the JAXP 1.3 Parser API.</p> * @author Michael Glavassevich, IBM @author Ankit Pasricha, IBM * @version $Id: ParserAPIUsage.java 447685 2006-09-19 02:37:49Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ParserAPIUsage	TokenNameIdentifier	 Parser API Usage
extends	TokenNameextends	
DefaultHandler	TokenNameIdentifier	 Default Handler
{	TokenNameLBRACE	
// default settings 	TokenNameCOMMENT_LINE	default settings 
/** Default API to use. */	TokenNameCOMMENT_JAVADOC	 Default API to use. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_API_TO_USE	TokenNameIdentifier	 DEFAULT  API  TO  USE
=	TokenNameEQUAL	
"sax"	TokenNameStringLiteral	sax
;	TokenNameSEMICOLON	
/** Default XInclude processing support (false). */	TokenNameCOMMENT_JAVADOC	 Default XInclude processing support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_XINCLUDE	TokenNameIdentifier	 DEFAULT  XINCLUDE
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default secure processing support (false). */	TokenNameCOMMENT_JAVADOC	 Default secure processing support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_SECURE_PROCESSING	TokenNameIdentifier	 DEFAULT  SECURE  PROCESSING
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
ParserAPIUsage	TokenNameIdentifier	 Parser API Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
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
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argv	TokenNameIdentifier	 argv
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
ParserAPIUsage	TokenNameIdentifier	 Parser API Usage
parserAPIUsage	TokenNameIdentifier	 parser API Usage
=	TokenNameEQUAL	
new	TokenNamenew	
ParserAPIUsage	TokenNameIdentifier	 Parser API Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
schemas	TokenNameIdentifier	 schemas
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
docURI	TokenNameIdentifier	 doc URI
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
apiToUse	TokenNameIdentifier	 api To Use
=	TokenNameEQUAL	
DEFAULT_API_TO_USE	TokenNameIdentifier	 DEFAULT  API  TO  USE
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
xincludeProcessing	TokenNameIdentifier	 xinclude Processing
=	TokenNameEQUAL	
DEFAULT_XINCLUDE	TokenNameIdentifier	 DEFAULT  XINCLUDE
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
secureProcessing	TokenNameIdentifier	 secure Processing
=	TokenNameEQUAL	
DEFAULT_SECURE_PROCESSING	TokenNameIdentifier	 DEFAULT  SECURE  PROCESSING
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
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
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
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-a"	TokenNameStringLiteral	-a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// process -a: schema documents 	TokenNameCOMMENT_LINE	process -a: schema documents 
if	TokenNameif	
(	TokenNameLPAREN	
schemas	TokenNameIdentifier	 schemas
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemas	TokenNameIdentifier	 schemas
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-api"	TokenNameStringLiteral	-api
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"sax"	TokenNameStringLiteral	sax
)	TokenNameRPAREN	
||	TokenNameOR_OR	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"dom"	TokenNameStringLiteral	dom
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
apiToUse	TokenNameIdentifier	 api To Use
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: unknown source type ("	TokenNameStringLiteral	error: unknown source type (
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
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
"xi"	TokenNameStringLiteral	xi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xincludeProcessing	TokenNameIdentifier	 xinclude Processing
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xi"	TokenNameStringLiteral	xi
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
"sp"	TokenNameStringLiteral	sp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
secureProcessing	TokenNameIdentifier	 secure Processing
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"sp"	TokenNameStringLiteral	sp
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: unknown option ("	TokenNameStringLiteral	error: unknown option (
+	TokenNamePLUS	
option	TokenNameIdentifier	 option
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Build Schema from sources if there are any 	TokenNameCOMMENT_LINE	Build Schema from sources if there are any 
Schema	TokenNameIdentifier	 Schema
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
schemas	TokenNameIdentifier	 schemas
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SchemaFactory	TokenNameIdentifier	 Schema Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
SchemaFactory	TokenNameIdentifier	 Schema Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
W3C_XML_SCHEMA_NS_URI	TokenNameIdentifier	 W3 C  XML  SCHEMA  NS  URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
parserAPIUsage	TokenNameIdentifier	 parser API Usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamSource	TokenNameIdentifier	 Stream Source
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sources	TokenNameIdentifier	 sources
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sources	TokenNameIdentifier	 sources
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newSchema	TokenNameIdentifier	 new Schema
(	TokenNameLPAREN	
sources	TokenNameIdentifier	 sources
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"dom"	TokenNameStringLiteral	dom
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
apiToUse	TokenNameIdentifier	 api To Use
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Create a DocumentBuilderFactory 	TokenNameCOMMENT_LINE	Create a DocumentBuilderFactory 
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
dbf	TokenNameIdentifier	 dbf
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setXIncludeAware	TokenNameIdentifier	 set X Include Aware
(	TokenNameLPAREN	
xincludeProcessing	TokenNameIdentifier	 xinclude Processing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
,	TokenNameCOMMA	
secureProcessing	TokenNameIdentifier	 secure Processing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a DocumentBuilder 	TokenNameCOMMENT_LINE	Create a DocumentBuilder 
DocumentBuilder	TokenNameIdentifier	 Document Builder
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Parse, reset the parser and then parse again. 	TokenNameCOMMENT_LINE	Parse, reset the parser and then parse again. 
db	TokenNameIdentifier	 db
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
parserAPIUsage	TokenNameIdentifier	 parser API Usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
docURI	TokenNameIdentifier	 doc URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
parserAPIUsage	TokenNameIdentifier	 parser API Usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
docURI	TokenNameIdentifier	 doc URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// "sax".equals(apiToUse) 	TokenNameCOMMENT_LINE	"sax".equals(apiToUse) 
else	TokenNameelse	
{	TokenNameLBRACE	
// Create a SAXParserFactory 	TokenNameCOMMENT_LINE	Create a SAXParserFactory 
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
spf	TokenNameIdentifier	 spf
=	TokenNameEQUAL	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spf	TokenNameIdentifier	 spf
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spf	TokenNameIdentifier	 spf
.	TokenNameDOT	
setXIncludeAware	TokenNameIdentifier	 set X Include Aware
(	TokenNameLPAREN	
xincludeProcessing	TokenNameIdentifier	 xinclude Processing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spf	TokenNameIdentifier	 spf
.	TokenNameDOT	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spf	TokenNameIdentifier	 spf
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
,	TokenNameCOMMA	
secureProcessing	TokenNameIdentifier	 secure Processing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a SAXParser 	TokenNameCOMMENT_LINE	Create a SAXParser 
SAXParser	TokenNameIdentifier	 SAX Parser
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
spf	TokenNameIdentifier	 spf
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Parse, reset the parser and then parse again. 	TokenNameCOMMENT_LINE	Parse, reset the parser and then parse again. 
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
docURI	TokenNameIdentifier	 doc URI
,	TokenNameCOMMA	
parserAPIUsage	TokenNameIdentifier	 parser API Usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
docURI	TokenNameIdentifier	 doc URI
,	TokenNameCOMMA	
parserAPIUsage	TokenNameIdentifier	 parser API Usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Exception	TokenNameIdentifier	 Exception
nested	TokenNameIdentifier	 nested
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
if	TokenNameif	
(	TokenNameLPAREN	
nested	TokenNameIdentifier	 nested
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
nested	TokenNameIdentifier	 nested
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// main(String[]) 	TokenNameCOMMENT_LINE	main(String[]) 
// 	TokenNameCOMMENT_LINE	 
// Private static methods 	TokenNameCOMMENT_LINE	Private static methods 
// 	TokenNameCOMMENT_LINE	 
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
"usage: java jaxp.ParserAPIUsage (options) uri"	TokenNameStringLiteral	usage: java jaxp.ParserAPIUsage (options) uri
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
" -a uri ... Provide a list of schema documents."	TokenNameStringLiteral	 -a uri ... Provide a list of schema documents.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -api (sax|dom) Select API to use (sax|dom)."	TokenNameStringLiteral	 -api (sax|dom) Select API to use (sax|dom).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -xi | -XI Turn on/off XInclude processing."	TokenNameStringLiteral	 -xi | -XI Turn on/off XInclude processing.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -sp | -SP Turn on/off secure processing."	TokenNameStringLiteral	 -sp | -SP Turn on/off secure processing.
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
" API to use: "	TokenNameStringLiteral	 API to use: 
+	TokenNamePLUS	
DEFAULT_API_TO_USE	TokenNameIdentifier	 DEFAULT  API  TO  USE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" XInclude: "	TokenNameStringLiteral	 XInclude: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_XINCLUDE	TokenNameIdentifier	 DEFAULT  XINCLUDE
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
" Secure processing: "	TokenNameStringLiteral	 Secure processing: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_SECURE_PROCESSING	TokenNameIdentifier	 DEFAULT  SECURE  PROCESSING
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// printUsage() 	TokenNameCOMMENT_LINE	printUsage() 
}	TokenNameRBRACE	
// ParserAPIUsage 	TokenNameCOMMENT_LINE	ParserAPIUsage 
