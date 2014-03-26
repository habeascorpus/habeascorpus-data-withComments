/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ApplyXSLT.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ApplyXSLT.java 470245 2006-11-02 06:34:33Z minchau $ 
package	TokenNamepackage	
servlet	TokenNameIdentifier	 servlet
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
servlet	TokenNameIdentifier	 servlet
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
servlet	TokenNameIdentifier	 servlet
.	TokenNameDOT	
http	TokenNameIdentifier	 http
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URLConnection	TokenNameIdentifier	 URL Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
OutputKeys	TokenNameIdentifier	 Output Keys
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
;	TokenNameSEMICOLON	
// SAX2 Imports 	TokenNameCOMMENT_LINE	SAX2 Imports 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
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
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
DeclHandler	TokenNameIdentifier	 Decl Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XString	TokenNameIdentifier	 X String
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
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
XMLFilterImpl	TokenNameIdentifier	 XML Filter Impl
;	TokenNameSEMICOLON	
/***************************************************************************************************** * * ApplyXSLT supplies the basic * functions for transforming XML data using XSL stylesheets. * * @author Spencer Shepard (sshepard@us.ibm.com) * @author R. Adam King (rak@us.ibm.com) * @author Tom Rowe (trowe@us.ibm.com) * @author Don Leslie (donald_leslie@lotus.com) * *****************************************************************************************************/	TokenNameCOMMENT_JAVADOC	*************************************************************************************************** * ApplyXSLT supplies the basic functions for transforming XML data using XSL stylesheets. * @author Spencer Shepard (sshepard@us.ibm.com) @author R. Adam King (rak@us.ibm.com) @author Tom Rowe (trowe@us.ibm.com) @author Don Leslie (donald_leslie@lotus.com) ****************************************************************************************************
public	TokenNamepublic	
class	TokenNameclass	
ApplyXSLT	TokenNameIdentifier	 Apply XSLT
extends	TokenNameextends	
HttpServlet	TokenNameIdentifier	 Http Servlet
{	TokenNameLBRACE	
/** * Operational parameters for this class. * <p>Request-time values override init-time values which override class defaults.</p> * @see #init * @serial */	TokenNameCOMMENT_JAVADOC	 Operational parameters for this class. <p>Request-time values override init-time values which override class defaults.</p> @see #init @serial 
protected	TokenNameprotected	
ApplyXSLTProperties	TokenNameIdentifier	 Apply XSLT Properties
ourDefaultParameters	TokenNameIdentifier	 our Default Parameters
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * String representing the end of line characters for the System. */	TokenNameCOMMENT_JAVADOC	 String representing the end of line characters for the System. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
EOL	TokenNameIdentifier	 EOL
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * String representing the file separator characters for the System. */	TokenNameCOMMENT_JAVADOC	 String representing the file separator characters for the System. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
FS	TokenNameIdentifier	 FS
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"file.separator"	TokenNameStringLiteral	file.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * String representing the current directory for properties files. See init(). */	TokenNameCOMMENT_JAVADOC	 String representing the current directory for properties files. See init(). 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ROOT	TokenNameIdentifier	 ROOT
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"server.root"	TokenNameStringLiteral	server.root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CURRENTDIR	TokenNameIdentifier	 CURRENTDIR
;	TokenNameSEMICOLON	
/** * Initialize operational parameters from the configuration. * @param config Configuration * @exception ServletException Never thrown */	TokenNameCOMMENT_JAVADOC	 Initialize operational parameters from the configuration. @param config Configuration @exception ServletException Never thrown 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
ServletConfig	TokenNameIdentifier	 Servlet Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
throws	TokenNamethrows	
ServletException	TokenNameIdentifier	 Servlet Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the server.root property --see above-- is null, use current working directory 	TokenNameCOMMENT_LINE	If the server.root property --see above-- is null, use current working directory 
// as default location for media.properties. 	TokenNameCOMMENT_LINE	as default location for media.properties. 
if	TokenNameif	
(	TokenNameLPAREN	
ROOT	TokenNameIdentifier	 ROOT
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CURRENTDIR	TokenNameIdentifier	 CURRENTDIR
=	TokenNameEQUAL	
getServletContext	TokenNameIdentifier	 get Servlet Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRealPath	TokenNameIdentifier	 get Real Path
(	TokenNameLPAREN	
"/WEB-INF/classes/servlet/"	TokenNameStringLiteral	/WEB-INF/classes/servlet/
)	TokenNameRPAREN	
+	TokenNamePLUS	
FS	TokenNameIdentifier	 FS
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
CURRENTDIR	TokenNameIdentifier	 CURRENTDIR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
CURRENTDIR	TokenNameIdentifier	 CURRENTDIR
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
+	TokenNamePLUS	
FS	TokenNameIdentifier	 FS
;	TokenNameSEMICOLON	
setDefaultParameters	TokenNameIdentifier	 set Default Parameters
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMediaProps	TokenNameIdentifier	 set Media Props
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
getInitParameter	TokenNameIdentifier	 get Init Parameter
(	TokenNameLPAREN	
"mediaURL"	TokenNameStringLiteral	mediaURL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the default parameters for the servlet from the configuration. * Also sets required system properties until we figure out why servlet * sometimess fails to read properties from properties files. * @param config Configuration */	TokenNameCOMMENT_JAVADOC	 Sets the default parameters for the servlet from the configuration. Also sets required system properties until we figure out why servlet sometimess fails to read properties from properties files. @param config Configuration 
protected	TokenNameprotected	
void	TokenNamevoid	
setDefaultParameters	TokenNameIdentifier	 set Default Parameters
(	TokenNameLPAREN	
ServletConfig	TokenNameIdentifier	 Servlet Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ourDefaultParameters	TokenNameIdentifier	 our Default Parameters
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultApplyXSLTProperties	TokenNameIdentifier	 Default Apply XSLT Properties
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Loads the media properties file specified by the given string. * @param mediaURLstring Location of the media properties file. Can be either a full URL or a path relative * to the System's server.root /servlets directory. If this parameter is null, * server.root/servlets/media.properties will be used. * @see ApplyXSL#CURRENTDIR */	TokenNameCOMMENT_JAVADOC	 Loads the media properties file specified by the given string. @param mediaURLstring Location of the media properties file. Can be either a full URL or a path relative to the System's server.root /servlets directory. If this parameter is null, server.root/servlets/media.properties will be used. @see ApplyXSL#CURRENTDIR 
protected	TokenNameprotected	
void	TokenNamevoid	
setMediaProps	TokenNameIdentifier	 set Media Props
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mediaURLstring	TokenNameIdentifier	 media UR Lstring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mediaURLstring	TokenNameIdentifier	 media UR Lstring
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
mediaURLstring	TokenNameIdentifier	 media UR Lstring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue1	TokenNameIdentifier	 mue1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
CURRENTDIR	TokenNameIdentifier	 CURRENTDIR
+	TokenNamePLUS	
mediaURLstring	TokenNameIdentifier	 media UR Lstring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue2	TokenNameIdentifier	 mue2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
"Unable to find the media properties file based on parameter 'mediaURL' = "	TokenNameStringLiteral	Unable to find the media properties file based on parameter 'mediaURL' = 
+	TokenNamePLUS	
mediaURLstring	TokenNameIdentifier	 media UR Lstring
,	TokenNameCOMMA	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
.	TokenNameDOT	
SC_ACCEPTED	TokenNameIdentifier	 SC  ACCEPTED
,	TokenNameCOMMA	
mue2	TokenNameIdentifier	 mue2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ourMediaProps	TokenNameIdentifier	 our Media Props
=	TokenNameEQUAL	
new	TokenNamenew	
OrderedProps	TokenNameIdentifier	 Ordered Props
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe1	TokenNameIdentifier	 ioe1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
"Exception occurred while opening media properties file: "	TokenNameStringLiteral	Exception occurred while opening media properties file: 
+	TokenNamePLUS	
mediaURLstring	TokenNameIdentifier	 media UR Lstring
+	TokenNamePLUS	
". Media table may be invalid."	TokenNameStringLiteral	. Media table may be invalid.
,	TokenNameCOMMA	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
.	TokenNameDOT	
SC_ACCEPTED	TokenNameIdentifier	 SC  ACCEPTED
,	TokenNameCOMMA	
ioe1	TokenNameIdentifier	 ioe1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
defaultProp	TokenNameIdentifier	 default Prop
=	TokenNameEQUAL	
CURRENTDIR	TokenNameIdentifier	 CURRENTDIR
+	TokenNamePLUS	
"media.properties"	TokenNameStringLiteral	media.properties
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ourMediaProps	TokenNameIdentifier	 our Media Props
=	TokenNameEQUAL	
new	TokenNamenew	
OrderedProps	TokenNameIdentifier	 Ordered Props
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
defaultProp	TokenNameIdentifier	 default Prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe2	TokenNameIdentifier	 ioe2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
"Default media properties file "	TokenNameStringLiteral	Default media properties file 
+	TokenNamePLUS	
defaultProp	TokenNameIdentifier	 default Prop
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
,	TokenNameCOMMA	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
.	TokenNameDOT	
SC_ACCEPTED	TokenNameIdentifier	 SC  ACCEPTED
,	TokenNameCOMMA	
ioe2	TokenNameIdentifier	 ioe2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMedia	TokenNameIdentifier	 get Media
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ourMediaProps	TokenNameIdentifier	 our Media Props
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
HEADER_NAME	TokenNameIdentifier	 HEADER  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// doPost removed for security reasons due to the possibility of sending 	TokenNameCOMMENT_LINE	doPost removed for security reasons due to the possibility of sending 
// unsecure XML and XSL XSLTInputSources through the request input stream 	TokenNameCOMMENT_LINE	unsecure XML and XSL XSLTInputSources through the request input stream 
/** * HTTP Get method passed on to process(). * @param request The request * @param response The response * @see #process * @exception ServletException Never thrown * @exception IOException Never thrown */	TokenNameCOMMENT_JAVADOC	 HTTP Get method passed on to process(). @param request The request @param response The response @see #process @exception ServletException Never thrown @exception IOException Never thrown 
public	TokenNamepublic	
void	TokenNamevoid	
doGet	TokenNameIdentifier	 do Get
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
response	TokenNameIdentifier	 response
)	TokenNameRPAREN	
throws	TokenNamethrows	
ServletException	TokenNameIdentifier	 Servlet Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tFactory	TokenNameIdentifier	 t Factory
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
tFactory	TokenNameIdentifier	 t Factory
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
response	TokenNameIdentifier	 response
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Coordinates applying an XSL stylesheet to XML data using operational parameters. * <p>If successfully applied, the result tree will be streamed to the response object * and the content type set according to the XSL stylesheet's &lt;xsl:output> element(s).</p> * <p>If there is a problem in parsing the XML/XSL or if there is a problem in applying * the XSL to the XML, an exception will be streamed to the response object. The detail * of the information returned in the response object will depend on whether we're * running in debug mode or not.</p> * @param processor implementation of TRaX processor * @param request May contain information relevant to creating XML and XSL XSLTInputSource's * @param response Where to write the transformation result * @see #getDocument * @see #getStylesheet * @see #getContentType * @see #displayException * @see #setStylesheetParams * @exception ServletException Never thrown * @exception IOException Never thrown */	TokenNameCOMMENT_JAVADOC	 Coordinates applying an XSL stylesheet to XML data using operational parameters. <p>If successfully applied, the result tree will be streamed to the response object and the content type set according to the XSL stylesheet's &lt;xsl:output> element(s).</p> <p>If there is a problem in parsing the XML/XSL or if there is a problem in applying the XSL to the XML, an exception will be streamed to the response object. The detail of the information returned in the response object will depend on whether we're running in debug mode or not.</p> @param processor implementation of TRaX processor @param request May contain information relevant to creating XML and XSL XSLTInputSource's @param response Where to write the transformation result @see #getDocument @see #getStylesheet @see #getContentType @see #displayException @see #setStylesheetParams @exception ServletException Never thrown @exception IOException Never thrown 
public	TokenNamepublic	
void	TokenNamevoid	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tFactory	TokenNameIdentifier	 t Factory
,	TokenNameCOMMA	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
response	TokenNameIdentifier	 response
)	TokenNameRPAREN	
throws	TokenNamethrows	
ServletException	TokenNameIdentifier	 Servlet Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
ourDefaultParameters	TokenNameIdentifier	 our Default Parameters
.	TokenNameDOT	
isDebug	TokenNameIdentifier	 is Debug
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Listener to be used for all reporting 	TokenNameCOMMENT_LINE	Listener to be used for all reporting 
ApplyXSLTListener	TokenNameIdentifier	 Apply XSLT Listener
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
new	TokenNamenew	
ApplyXSLTListener	TokenNameIdentifier	 Apply XSLT Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"debug is "	TokenNameStringLiteral	debug is 
+	TokenNamePLUS	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamSource	TokenNameIdentifier	 Stream Source
xmlSource	TokenNameIdentifier	 xml Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
StreamSource	TokenNameIdentifier	 Stream Source
xslSource	TokenNameIdentifier	 xsl Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
"getDocument() returned null"	TokenNameStringLiteral	getDocument() returned null
,	TokenNameCOMMA	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
SC_NOT_FOUND	TokenNameIdentifier	 SC  NOT  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
axe	TokenNameIdentifier	 axe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
axe	TokenNameIdentifier	 axe
.	TokenNameDOT	
appendMessage	TokenNameIdentifier	 append Message
(	TokenNameLPAREN	
EOL	TokenNameIdentifier	 EOL
+	TokenNamePLUS	
"getDocument() resulted in ApplyXSLTException"	TokenNameStringLiteral	getDocument() resulted in ApplyXSLTException
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
+	TokenNamePLUS	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
axe	TokenNameIdentifier	 axe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
displayException	TokenNameIdentifier	 display Exception
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
axe	TokenNameIdentifier	 axe
,	TokenNameCOMMA	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlSource	TokenNameIdentifier	 xml Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// creating XSL Stylesheet 	TokenNameCOMMENT_LINE	creating XSL Stylesheet 
if	TokenNameif	
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xslSource	TokenNameIdentifier	 xsl Source
=	TokenNameEQUAL	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
tFactory	TokenNameIdentifier	 t Factory
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
"getStylesheet() returned null"	TokenNameStringLiteral	getStylesheet() returned null
,	TokenNameCOMMA	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
SC_NOT_FOUND	TokenNameIdentifier	 SC  NOT  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// For time being, must "reset" xmlSource after extracting stylesheet PI 	TokenNameCOMMENT_LINE	For time being, must "reset" xmlSource after extracting stylesheet PI 
xmlSource	TokenNameIdentifier	 xml Source
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
axe	TokenNameIdentifier	 axe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
axe	TokenNameIdentifier	 axe
.	TokenNameDOT	
appendMessage	TokenNameIdentifier	 append Message
(	TokenNameLPAREN	
EOL	TokenNameIdentifier	 EOL
+	TokenNamePLUS	
"getStylesheet() resulted in ApplyXSLTException"	TokenNameStringLiteral	getStylesheet() resulted in ApplyXSLTException
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
+	TokenNamePLUS	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
axe	TokenNameIdentifier	 axe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
displayException	TokenNameIdentifier	 display Exception
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
axe	TokenNameIdentifier	 axe
,	TokenNameCOMMA	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xslSource	TokenNameIdentifier	 xsl Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// perform Transformation 	TokenNameCOMMENT_LINE	perform Transformation 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
xslSource	TokenNameIdentifier	 xsl Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Performing transformation..."	TokenNameStringLiteral	Performing transformation...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
xslSource	TokenNameIdentifier	 xsl Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
setContentType	TokenNameIdentifier	 set Content Type
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
instanceof	TokenNameinstanceof	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformerImpl	TokenNameIdentifier	 transformer Impl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
transformerImpl	TokenNameIdentifier	 transformer Impl
.	TokenNameDOT	
setQuietConflictWarnings	TokenNameIdentifier	 set Quiet Conflict Warnings
(	TokenNameLPAREN	
ourDefaultParameters	TokenNameIdentifier	 our Default Parameters
.	TokenNameDOT	
isNoCW	TokenNameIdentifier	 is No CW
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setStylesheetParams	TokenNameIdentifier	 set Stylesheet Params
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
SC_OK	TokenNameIdentifier	 SC  OK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
axe	TokenNameIdentifier	 axe
=	TokenNameEQUAL	
new	TokenNamenew	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
"Exception occurred during Transformation:"	TokenNameStringLiteral	Exception occurred during Transformation:
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
+	TokenNamePLUS	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
+	TokenNamePLUS	
exc	TokenNameIdentifier	 exc
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exc	TokenNameIdentifier	 exc
,	TokenNameCOMMA	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
SC_INTERNAL_SERVER_ERROR	TokenNameIdentifier	 SC  INTERNAL  SERVER  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
axe	TokenNameIdentifier	 axe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
displayException	TokenNameIdentifier	 display Exception
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
axe	TokenNameIdentifier	 axe
,	TokenNameCOMMA	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// transformer.reset(); 	TokenNameCOMMENT_LINE	transformer.reset(); 
}	TokenNameRBRACE	
// end of try ... catch ... finally 	TokenNameCOMMENT_LINE	end of try ... catch ... finally 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
/*org.xml.sax.SAX*/	TokenNameCOMMENT_BLOCK	org.xml.sax.SAX
Exception	TokenNameIdentifier	 Exception
saxExc	TokenNameIdentifier	 sax Exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
axe	TokenNameIdentifier	 axe
=	TokenNameEQUAL	
new	TokenNamenew	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
"Exception occurred during ctor/Transformation:"	TokenNameStringLiteral	Exception occurred during ctor/Transformation:
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
+	TokenNamePLUS	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
+	TokenNamePLUS	
saxExc	TokenNameIdentifier	 sax Exc
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
saxExc	TokenNameIdentifier	 sax Exc
,	TokenNameCOMMA	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
SC_INTERNAL_SERVER_ERROR	TokenNameIdentifier	 SC  INTERNAL  SERVER  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
axe	TokenNameIdentifier	 axe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
displayException	TokenNameIdentifier	 display Exception
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
axe	TokenNameIdentifier	 axe
,	TokenNameCOMMA	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end of new try ... catch 	TokenNameCOMMENT_LINE	end of new try ... catch 
}	TokenNameRBRACE	
// end of if((stylesheetRoot != null) ... 	TokenNameCOMMENT_LINE	end of if((stylesheetRoot != null) ... 
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
" No Conflict Warnings = "	TokenNameStringLiteral	 No Conflict Warnings = 
+	TokenNamePLUS	
ourDefaultParameters	TokenNameIdentifier	 our Default Parameters
.	TokenNameDOT	
isNoCW	TokenNameIdentifier	 is No CW
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Transformation time: "	TokenNameStringLiteral	 Transformation time: 
+	TokenNamePLUS	
time	TokenNameIdentifier	 time
+	TokenNamePLUS	
" ms"	TokenNameStringLiteral	 ms
,	TokenNameCOMMA	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
SC_OK	TokenNameIdentifier	 SC  OK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns an XML XSLTInputSource DOM. Attempts will be make to create the DOM from the following * sources: * <ol> * <li>A relative URL specified in the HTTP request's path information. This capability is intended * for use by <b>servlet engines that map</b> some or all XML data to be processed at the server.</li> * <li>A URL specified in the HTTP request's <code>URL=</code> parameter. This capability * is intended for <b>clients wishing to selectively process</b> XML data at the server. For * security reasons, this URL will be forced to the local IP host.</li> * <li>The HTTP request's XML input stream. This capability is intended for use by chained servlets.</li> * </ol> * @param request May contain or point to the XML XSLTInputSource * @param listener To record detailed parsing messages for possible return to requestor * @return XML XSLTInputSource DOM, or null if the XSLTInputSource could not be parsed * @exception ApplyXSLTException Thrown if exception occurs while handling request */	TokenNameCOMMENT_JAVADOC	 Returns an XML XSLTInputSource DOM. Attempts will be make to create the DOM from the following sources: <ol> <li>A relative URL specified in the HTTP request's path information. This capability is intended for use by <b>servlet engines that map</b> some or all XML data to be processed at the server.</li> <li>A URL specified in the HTTP request's <code>URL=</code> parameter. This capability is intended for <b>clients wishing to selectively process</b> XML data at the server. For security reasons, this URL will be forced to the local IP host.</li> <li>The HTTP request's XML input stream. This capability is intended for use by chained servlets.</li> </ol> @param request May contain or point to the XML XSLTInputSource @param listener To record detailed parsing messages for possible return to requestor @return XML XSLTInputSource DOM, or null if the XSLTInputSource could not be parsed @exception ApplyXSLTException Thrown if exception occurs while handling request 
protected	TokenNameprotected	
StreamSource	TokenNameIdentifier	 Stream Source
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
ApplyXSLTListener	TokenNameIdentifier	 Apply XSLT Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
throws	TokenNamethrows	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
xmlURL	TokenNameIdentifier	 xml URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// document from PathInfo 	TokenNameCOMMENT_LINE	document from PathInfo 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xmlURL	TokenNameIdentifier	 xml URL
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getPathInfo	TokenNameIdentifier	 get Path Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parsing XML Document from PathInfo: "	TokenNameStringLiteral	Parsing XML Document from PathInfo: 
+	TokenNamePLUS	
xmlURL	TokenNameIdentifier	 xml URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
"http"	TokenNameStringLiteral	http
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DefaultApplyXSLTProperties	TokenNameIdentifier	 Default Apply XSLT Properties
)	TokenNameRPAREN	
ourDefaultParameters	TokenNameIdentifier	 our Default Parameters
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocalHost	TokenNameIdentifier	 get Local Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getServerPort	TokenNameIdentifier	 get Server Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xmlURL	TokenNameIdentifier	 xml URL
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// document from Request parameter 	TokenNameCOMMENT_LINE	document from Request parameter 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xmlURL	TokenNameIdentifier	 xml URL
=	TokenNameEQUAL	
ourDefaultParameters	TokenNameIdentifier	 our Default Parameters
.	TokenNameDOT	
getXMLurl	TokenNameIdentifier	 get XM Lurl
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parsing XML Document from request parameter: "	TokenNameStringLiteral	Parsing XML Document from request parameter: 
+	TokenNamePLUS	
xmlURL	TokenNameIdentifier	 xml URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
xmlURL	TokenNameIdentifier	 xml URL
)	TokenNameRPAREN	
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// document from chain 	TokenNameCOMMENT_LINE	document from chain 
String	TokenNameIdentifier	 String
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"text/xml"	TokenNameStringLiteral	text/xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parsing XML Document from request chain"	TokenNameStringLiteral	Parsing XML Document from request chain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
.	TokenNameDOT	
SC_NOT_FOUND	TokenNameIdentifier	 SC  NOT  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
.	TokenNameDOT	
SC_INTERNAL_SERVER_ERROR	TokenNameIdentifier	 SC  INTERNAL  SERVER  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Templates (StylesheetRoot) object. Attempts will be make to create the Stylesheet * from the followingsources: * <ol> * <li>A URL specified in the HTTP request's <code>xslURL=</code> parameter. This capability * is intended for clients wishing to selectively override the server algorithm for applying XSL * stylesheets. For security reasons, this URL will be forced to the local IP host.</li> * <li>XML association. XML documents may contain references to one or more stylesheets using * <a HREF="http://www.w3.org/TR/1999/PR-xml-stylesheet-19990114">this</a> W3C proposed recommendation. * If the XML document does contain such references, a best match will be chosen based on the browser * type making the request and the default association. This capability enables relationships to be * defined between client capabilities and stylesheets capable of acting on these capabilities.</li> * <li>A configured default stylesheet URL</li> * </ol> * @param request May contain or point to the XSL XSLTInputSource * @param xmlSource May point to the XSL XSLTInputSource * @param listener To record detailed parsing messages for possible return to requestor * @return XSL XSLTInputSource, or null if the request could not be parsed * @see #makeDocument * @see #getMedia * @see #STYLESHEET_ATTRIBUTE * @see #getXSLURLfromDoc * @see #toAcceptLanguageConnection * @exception ApplyXSLTException Thrown if exception occurs while handling request */	TokenNameCOMMENT_JAVADOC	 Returns a Templates (StylesheetRoot) object. Attempts will be make to create the Stylesheet from the followingsources: <ol> <li>A URL specified in the HTTP request's <code>xslURL=</code> parameter. This capability is intended for clients wishing to selectively override the server algorithm for applying XSL stylesheets. For security reasons, this URL will be forced to the local IP host.</li> <li>XML association. XML documents may contain references to one or more stylesheets using <a HREF="http://www.w3.org/TR/1999/PR-xml-stylesheet-19990114">this</a> W3C proposed recommendation. If the XML document does contain such references, a best match will be chosen based on the browser type making the request and the default association. This capability enables relationships to be defined between client capabilities and stylesheets capable of acting on these capabilities.</li> <li>A configured default stylesheet URL</li> </ol> @param request May contain or point to the XSL XSLTInputSource @param xmlSource May point to the XSL XSLTInputSource @param listener To record detailed parsing messages for possible return to requestor @return XSL XSLTInputSource, or null if the request could not be parsed @see #makeDocument @see #getMedia @see #STYLESHEET_ATTRIBUTE @see #getXSLURLfromDoc @see #toAcceptLanguageConnection @exception ApplyXSLTException Thrown if exception occurs while handling request 
protected	TokenNameprotected	
StreamSource	TokenNameIdentifier	 Stream Source
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tFactory	TokenNameIdentifier	 t Factory
,	TokenNameCOMMA	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
StreamSource	TokenNameIdentifier	 Stream Source
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
ApplyXSLTListener	TokenNameIdentifier	 Apply XSLT Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
throws	TokenNamethrows	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
//stylesheet URL from request 	TokenNameCOMMENT_LINE	stylesheet URL from request 
String	TokenNameIdentifier	 String
xslURL	TokenNameIdentifier	 xsl URL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DefaultApplyXSLTProperties	TokenNameIdentifier	 Default Apply XSLT Properties
)	TokenNameRPAREN	
ourDefaultParameters	TokenNameIdentifier	 our Default Parameters
)	TokenNameRPAREN	
.	TokenNameDOT	
getXSLRequestURL	TokenNameIdentifier	 get XSL Request URL
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xslURL	TokenNameIdentifier	 xsl URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parsing XSL Stylesheet Document from request parameter: "	TokenNameStringLiteral	Parsing XSL Stylesheet Document from request parameter: 
+	TokenNamePLUS	
xslURL	TokenNameIdentifier	 xsl URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// find stylesheet from XML Document, Media tag preference 	TokenNameCOMMENT_LINE	find stylesheet from XML Document, Media tag preference 
if	TokenNameif	
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"calling getXSLURLfromDoc and getMedia "	TokenNameStringLiteral	calling getXSLURLfromDoc and getMedia 
+	TokenNamePLUS	
getMedia	TokenNameIdentifier	 get Media
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xslURL	TokenNameIdentifier	 xsl URL
=	TokenNameEQUAL	
getXSLURLfromDoc	TokenNameIdentifier	 get XSLUR Lfrom Doc
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
STYLESHEET_ATTRIBUTE	TokenNameIdentifier	 STYLESHEET  ATTRIBUTE
,	TokenNameCOMMA	
getMedia	TokenNameIdentifier	 get Media
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tFactory	TokenNameIdentifier	 t Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xslURL	TokenNameIdentifier	 xsl URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parsing XSL Stylesheet Document from XML Document tag: "	TokenNameStringLiteral	Parsing XSL Stylesheet Document from XML Document tag: 
+	TokenNamePLUS	
xslURL	TokenNameIdentifier	 xsl URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
// Configuration Default 	TokenNameCOMMENT_LINE	Configuration Default 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xslURL	TokenNameIdentifier	 xsl URL
=	TokenNameEQUAL	
ourDefaultParameters	TokenNameIdentifier	 our Default Parameters
.	TokenNameDOT	
getXSLurl	TokenNameIdentifier	 get XS Lurl
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parsing XSL Stylesheet Document from configuration: "	TokenNameStringLiteral	Parsing XSL Stylesheet Document from configuration: 
+	TokenNamePLUS	
xslURL	TokenNameIdentifier	 xsl URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
xslURL	TokenNameIdentifier	 xsl URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
.	TokenNameDOT	
SC_NOT_FOUND	TokenNameIdentifier	 SC  NOT  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
.	TokenNameDOT	
SC_INTERNAL_SERVER_ERROR	TokenNameIdentifier	 SC  INTERNAL  SERVER  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the response content type specified by the media-type and encoding attributes of * the &lt;xsl:output> element(s) of the stylesheet. * @param xslSourceRoot XSL Stylesheet to be examined for &lt;xsl:output> elements. * @return The response content type (MIME type and charset) of the stylesheet output * @see #process */	TokenNameCOMMENT_JAVADOC	 Returns the response content type specified by the media-type and encoding attributes of the &lt;xsl:output> element(s) of the stylesheet. @param xslSourceRoot XSL Stylesheet to be examined for &lt;xsl:output> elements. @return The response content type (MIME type and charset) of the stylesheet output @see #process 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
oprops	TokenNameIdentifier	 oprops
=	TokenNameEQUAL	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
getOutputProperties	TokenNameIdentifier	 get Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
oprops	TokenNameIdentifier	 oprops
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
media	TokenNameIdentifier	 media
=	TokenNameEQUAL	
oprops	TokenNameIdentifier	 oprops
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
MEDIA_TYPE	TokenNameIdentifier	 MEDIA  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
media	TokenNameIdentifier	 media
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
media	TokenNameIdentifier	 media
+	TokenNamePLUS	
"; charset="	TokenNameStringLiteral	; charset=
+	TokenNamePLUS	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
return	TokenNamereturn	
media	TokenNameIdentifier	 media
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
oprops	TokenNameIdentifier	 oprops
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"html"	TokenNameStringLiteral	html
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"text/html"	TokenNameStringLiteral	text/html
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"text"	TokenNameStringLiteral	text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"text/plain"	TokenNameStringLiteral	text/plain
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
"text/xml"	TokenNameStringLiteral	text/xml
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Defines and sets select top-level XSL stylesheet variables from the HTTP request, which * can be evaluated using &lt;xsl:param-variable&gt;. The following variables will be * automatically set: * <dl> * <dt><i>ParameterName</i></dt> * <dd>Each non-reserved request parameter returned from request.getParameterNames(). If a * parameter contains more than a single value, only the first value is available.</dd> * <dt>servlet-RemoteAddr</dt> * <dd>Contains String output from request.getRemoteAddr(), which is the IP address * of the client machine.</dd> * <dt>servlet-RemoteHost</dt> * <dd>Contains String output from request.getRemoteHost(), which is the host name * of the client machine.</dd> * <dt>servlet-RemoteUser</dt> * <dd>Contains String output from request.getRemoteUser(), which was the user name * accepted by the server to grant access to this servlet.</dd> * <dt>servlet-Request</dt> * <dd>Contains the request object.</dd> * </dl> * @param xslprocessor Where to register parameters to be set * @param request Provides access to all meaningful parameters to set * @see #process */	TokenNameCOMMENT_JAVADOC	 Defines and sets select top-level XSL stylesheet variables from the HTTP request, which can be evaluated using &lt;xsl:param-variable&gt;. The following variables will be automatically set: <dl> <dt><i>ParameterName</i></dt> <dd>Each non-reserved request parameter returned from request.getParameterNames(). If a parameter contains more than a single value, only the first value is available.</dd> <dt>servlet-RemoteAddr</dt> <dd>Contains String output from request.getRemoteAddr(), which is the IP address of the client machine.</dd> <dt>servlet-RemoteHost</dt> <dd>Contains String output from request.getRemoteHost(), which is the host name of the client machine.</dd> <dt>servlet-RemoteUser</dt> <dd>Contains String output from request.getRemoteUser(), which was the user name accepted by the server to grant access to this servlet.</dd> <dt>servlet-Request</dt> <dd>Contains the request object.</dd> </dl> @param xslprocessor Where to register parameters to be set @param request Provides access to all meaningful parameters to set @see #process 
public	TokenNamepublic	
void	TokenNamevoid	
setStylesheetParams	TokenNameIdentifier	 set Stylesheet Params
(	TokenNameLPAREN	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
paramNames	TokenNameIdentifier	 param Names
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getParameterNames	TokenNameIdentifier	 get Parameter Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
paramNames	TokenNameIdentifier	 param Names
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
paramName	TokenNameIdentifier	 param Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
paramNames	TokenNameIdentifier	 param Names
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramVals	TokenNameIdentifier	 param Vals
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getParameterValues	TokenNameIdentifier	 get Parameter Values
(	TokenNameLPAREN	
paramName	TokenNameIdentifier	 param Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paramVals	TokenNameIdentifier	 param Vals
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
paramName	TokenNameIdentifier	 param Name
,	TokenNameCOMMA	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
paramVals	TokenNameIdentifier	 param Vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"servlet-RemoteAddr"	TokenNameStringLiteral	servlet-RemoteAddr
,	TokenNameCOMMA	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getRemoteAddr	TokenNameIdentifier	 get Remote Addr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"servlet-RemoteHost"	TokenNameStringLiteral	servlet-RemoteHost
,	TokenNameCOMMA	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getRemoteHost	TokenNameIdentifier	 get Remote Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"servlet-RemoteUser"	TokenNameStringLiteral	servlet-RemoteUser
,	TokenNameCOMMA	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getRemoteUser	TokenNameIdentifier	 get Remote User
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Writes the following information to the servlet log: * <ol> * <li>HTTP status code</li> * <li>Message</li> * <li>Stack trace</li> * </ol> * @param axe Contains valid HTTP status code, message, and stack trace (optional) */	TokenNameCOMMENT_JAVADOC	 Writes the following information to the servlet log: <ol> <li>HTTP status code</li> <li>Message</li> <li>Stack trace</li> </ol> @param axe Contains valid HTTP status code, message, and stack trace (optional) 
protected	TokenNameprotected	
void	TokenNamevoid	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
axe	TokenNameIdentifier	 axe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
axe	TokenNameIdentifier	 axe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
axe	TokenNameIdentifier	 axe
.	TokenNameDOT	
getStatusCode	TokenNameIdentifier	 get Status Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
axe	TokenNameIdentifier	 axe
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the following information to the servlet log: * <ol> * <li>HTTP status code</li> * <li>Message</li> * <li>Stack trace</li> * </ol> * @param msg Message to be logged * @param statusCode Valid status code from javax.servlet.http.HttpServletResponse * @param t Used to generate stack trace (may be =null to suppress stack trace) */	TokenNameCOMMENT_JAVADOC	 Writes the following information to the servlet log: <ol> <li>HTTP status code</li> <li>Message</li> <li>Stack trace</li> </ol> @param msg Message to be logged @param statusCode Valid status code from javax.servlet.http.HttpServletResponse @param t Used to generate stack trace (may be =null to suppress stack trace) 
protected	TokenNameprotected	
void	TokenNamevoid	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
int	TokenNameint	
statusCode	TokenNameIdentifier	 status Code
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
statusCode	TokenNameIdentifier	 status Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Exception is "	TokenNameStringLiteral	Exception is 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"HTTP Status Code: "	TokenNameStringLiteral	HTTP Status Code: 
+	TokenNamePLUS	
statusCode	TokenNameIdentifier	 status Code
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Writes the following information to the servlet log: * <ol> * <li>HTTP status code</li> * <li>Message</li> * </ol> * @param msg Message to be logged * @param statusCode Valid status code from javax.servlet.http.HttpServletResponse */	TokenNameCOMMENT_JAVADOC	 Writes the following information to the servlet log: <ol> <li>HTTP status code</li> <li>Message</li> </ol> @param msg Message to be logged @param statusCode Valid status code from javax.servlet.http.HttpServletResponse 
protected	TokenNameprotected	
void	TokenNamevoid	
writeLog	TokenNameIdentifier	 write Log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
int	TokenNameint	
statusCode	TokenNameIdentifier	 status Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"HTTP Status Code: "	TokenNameStringLiteral	HTTP Status Code: 
+	TokenNamePLUS	
statusCode	TokenNameIdentifier	 status Code
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invokes response.sendError setting an HTTP status code and optionally an error message * as an HTML page. * <p>If running in debug mode, also try to return a stack trace of the exception and * and xml/xsl processor messages.</p> * @param response Where to stream the exception to * @param xse The wrapper which contains the exception and its HTTP status code * @param debug Indicates whether to include stack trace, etc. */	TokenNameCOMMENT_JAVADOC	 Invokes response.sendError setting an HTTP status code and optionally an error message as an HTML page. <p>If running in debug mode, also try to return a stack trace of the exception and and xml/xsl processor messages.</p> @param response Where to stream the exception to @param xse The wrapper which contains the exception and its HTTP status code @param debug Indicates whether to include stack trace, etc. 
protected	TokenNameprotected	
void	TokenNamevoid	
displayException	TokenNameIdentifier	 display Exception
(	TokenNameLPAREN	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
xse	TokenNameIdentifier	 xse
,	TokenNameCOMMA	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
mesg	TokenNameIdentifier	 mesg
=	TokenNameEQUAL	
xse	TokenNameIdentifier	 xse
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mesg	TokenNameIdentifier	 mesg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
mesg	TokenNameIdentifier	 mesg
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
else	TokenNameelse	
mesg	TokenNameIdentifier	 mesg
=	TokenNameEQUAL	
"<B>"	TokenNameStringLiteral	<B>
+	TokenNamePLUS	
mesg	TokenNameIdentifier	 mesg
+	TokenNamePLUS	
"</B>"	TokenNameStringLiteral	</B>
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
mesg	TokenNameIdentifier	 mesg
,	TokenNameCOMMA	
EOL	TokenNameIdentifier	 EOL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
strBuf	TokenNameIdentifier	 str Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
strBuf	TokenNameIdentifier	 str Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
+	TokenNamePLUS	
"<BR>"	TokenNameStringLiteral	<BR>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mesg	TokenNameIdentifier	 mesg
=	TokenNameEQUAL	
strBuf	TokenNameIdentifier	 str Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xse	TokenNameIdentifier	 xse
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mesg	TokenNameIdentifier	 mesg
+=	TokenNamePLUS_EQUAL	
" <PRE> "	TokenNameStringLiteral	 <PRE> 
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" </PRE> "	TokenNameStringLiteral	 </PRE> 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
setContentType	TokenNameIdentifier	 set Content Type
(	TokenNameLPAREN	
"text/html"	TokenNameStringLiteral	text/html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
sendError	TokenNameIdentifier	 send Error
(	TokenNameLPAREN	
xse	TokenNameIdentifier	 xse
.	TokenNameDOT	
getStatusCode	TokenNameIdentifier	 get Status Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mesg	TokenNameIdentifier	 mesg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"IOException is occurring when sendError is called"	TokenNameStringLiteral	IOException is occurring when sendError is called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Mapping of HTTP request's user-Agent values to stylesheet media= values. * <p>This mapping is defined by a file pointed to by the operational parameter "mediaURL" which can * either contain a full URL or a path relative to the System's server.root /servlets directory.</p> * @see #setMediaProps * @see #getMedia * @serial */	TokenNameCOMMENT_JAVADOC	 Mapping of HTTP request's user-Agent values to stylesheet media= values. <p>This mapping is defined by a file pointed to by the operational parameter "mediaURL" which can either contain a full URL or a path relative to the System's server.root /servlets directory.</p> @see #setMediaProps @see #getMedia @serial 
protected	TokenNameprotected	
OrderedProps	TokenNameIdentifier	 Ordered Props
ourMediaProps	TokenNameIdentifier	 our Media Props
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Returns a connection which respects the Accept-Language header of the HTTP request. This * is useful when XSL files are internationalized for use with Web servers which respect this * header. * <p>For example, Apache 1.3.6 may be configured for multiviews. Under this configuration, * requests for http://myhost/index.html would return http://myhost/index.html.fr to French browsers * and http://myhost/index.html.en to English browsers.</p> * @param url Location to connect to * @param request Could contain an Accept-Language header * @return An Accept-Language-enabled URL connection * @see #getStylesheet */	TokenNameCOMMENT_JAVADOC	 Returns a connection which respects the Accept-Language header of the HTTP request. This is useful when XSL files are internationalized for use with Web servers which respect this header. <p>For example, Apache 1.3.6 may be configured for multiviews. Under this configuration, requests for http://myhost/index.html would return http://myhost/index.html.fr to French browsers and http://myhost/index.html.en to English browsers.</p> @param url Location to connect to @param request Could contain an Accept-Language header @return An Accept-Language-enabled URL connection @see #getStylesheet 
protected	TokenNameprotected	
URLConnection	TokenNameIdentifier	 URL Connection
toAcceptLanguageConnection	TokenNameIdentifier	 to Accept Language Connection
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
URLConnection	TokenNameIdentifier	 URL Connection
tempConnection	TokenNameIdentifier	 temp Connection
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempConnection	TokenNameIdentifier	 temp Connection
.	TokenNameDOT	
setRequestProperty	TokenNameIdentifier	 set Request Property
(	TokenNameLPAREN	
"Accept-Language"	TokenNameStringLiteral	Accept-Language
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
"Accept-Language"	TokenNameStringLiteral	Accept-Language
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tempConnection	TokenNameIdentifier	 temp Connection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the XSL stylesheet URL associated with the specified XML document. If multiple XSL * stylesheets are associated with the XML document, preference will be given to the stylesheet * which contains an attribute name/value pair that corresponds to the specified attributeName * and attributeValue. * @param xmlSource XML XSLTInputSource to be searched for associated XSL stylesheets * @param attributeName Attribute name to provide preferential matching * @param attributeValue Attribute value to provide preferential matching * @return The preferred XSL stylesheet URL, or null if no XSL stylesheet association is found * @see #getStylesheet */	TokenNameCOMMENT_JAVADOC	 Returns the XSL stylesheet URL associated with the specified XML document. If multiple XSL stylesheets are associated with the XML document, preference will be given to the stylesheet which contains an attribute name/value pair that corresponds to the specified attributeName and attributeValue. @param xmlSource XML XSLTInputSource to be searched for associated XSL stylesheets @param attributeName Attribute name to provide preferential matching @param attributeValue Attribute value to provide preferential matching @return The preferred XSL stylesheet URL, or null if no XSL stylesheet association is found @see #getStylesheet 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXSLURLfromDoc	TokenNameIdentifier	 get XSLUR Lfrom Doc
(	TokenNameLPAREN	
StreamSource	TokenNameIdentifier	 Stream Source
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeValue	TokenNameIdentifier	 attribute Value
,	TokenNameCOMMA	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tFactory	TokenNameIdentifier	 t Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tempURL	TokenNameIdentifier	 temp URL
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
returnURL	TokenNameIdentifier	 return URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
dfactory	TokenNameIdentifier	 dfactory
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilder	TokenNameIdentifier	 Document Builder
docBuilder	TokenNameIdentifier	 doc Builder
=	TokenNameEQUAL	
dfactory	TokenNameIdentifier	 dfactory
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
sourceTree	TokenNameIdentifier	 source Tree
=	TokenNameEQUAL	
docBuilder	TokenNameIdentifier	 doc Builder
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
sourceTree	TokenNameIdentifier	 source Tree
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
==	TokenNameEQUAL_EQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProcessingInstruction	TokenNameIdentifier	 Processing Instruction
pi	TokenNameIdentifier	 pi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ProcessingInstruction	TokenNameIdentifier	 Processing Instruction
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml-stylesheet"	TokenNameStringLiteral	xml-stylesheet
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PIA	TokenNameIdentifier	 PIA
pia	TokenNameIdentifier	 pia
=	TokenNameEQUAL	
new	TokenNamenew	
PIA	TokenNameIdentifier	 PIA
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"text/xsl"	TokenNameStringLiteral	text/xsl
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pia	TokenNameIdentifier	 pia
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"type"	TokenNameStringLiteral	type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempURL	TokenNameIdentifier	 temp URL
=	TokenNameEQUAL	
pia	TokenNameIdentifier	 pia
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"href"	TokenNameStringLiteral	href
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
pia	TokenNameIdentifier	 pia
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
attributeValue	TokenNameIdentifier	 attribute Value
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
tempURL	TokenNameIdentifier	 temp URL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"yes"	TokenNameStringLiteral	yes
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pia	TokenNameIdentifier	 pia
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"alternate"	TokenNameStringLiteral	alternate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
returnURL	TokenNameIdentifier	 return URL
=	TokenNameEQUAL	
tempURL	TokenNameIdentifier	 temp URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
saxExc	TokenNameIdentifier	 sax Exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
returnURL	TokenNameIdentifier	 return URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The attribute name in the <?xml-stylesheet> tag used in stylesheet selection. */	TokenNameCOMMENT_JAVADOC	 The attribute name in the <?xml-stylesheet> tag used in stylesheet selection. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STYLESHEET_ATTRIBUTE	TokenNameIdentifier	 STYLESHEET  ATTRIBUTE
=	TokenNameEQUAL	
"media"	TokenNameStringLiteral	media
;	TokenNameSEMICOLON	
/** * The HTTP Header used for matching the Stylesheet attribute via the * media properties file selected. */	TokenNameCOMMENT_JAVADOC	 The HTTP Header used for matching the Stylesheet attribute via the media properties file selected. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HEADER_NAME	TokenNameIdentifier	 HEADER  NAME
=	TokenNameEQUAL	
"user-Agent"	TokenNameStringLiteral	user-Agent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stores the keys and values from a file (similar to a properties file) and * can return the first value which has a key contained in its string. * File can have comment lines starting with '#" and for each line the entries are * separated by tabs and '=' char. */	TokenNameCOMMENT_JAVADOC	 Stores the keys and values from a file (similar to a properties file) and can return the first value which has a key contained in its string. File can have comment lines starting with '#" and for each line the entries are separated by tabs and '=' char. 
class	TokenNameclass	
OrderedProps	TokenNameIdentifier	 Ordered Props
{	TokenNameLBRACE	
/** * Stores the Key and Values as an array of Strings */	TokenNameCOMMENT_JAVADOC	 Stores the Key and Values as an array of Strings 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
attVec	TokenNameIdentifier	 att Vec
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructor. * @param inputStream Stream containing the properties file. * @exception IOException Thrown if unable to read from stream */	TokenNameCOMMENT_JAVADOC	 Constructor. @param inputStream Stream containing the properties file. @exception IOException Thrown if unable to read from stream 
OrderedProps	TokenNameIdentifier	 Ordered Props
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
currentLine	TokenNameIdentifier	 current Line
,	TokenNameCOMMA	
Key	TokenNameIdentifier	 Key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
currentTokens	TokenNameIdentifier	 current Tokens
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currentLine	TokenNameIdentifier	 current Line
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentTokens	TokenNameIdentifier	 current Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
currentLine	TokenNameIdentifier	 current Line
,	TokenNameCOMMA	
"= "	TokenNameStringLiteral	= 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentTokens	TokenNameIdentifier	 current Tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
Key	TokenNameIdentifier	 Key
=	TokenNameEQUAL	
currentTokens	TokenNameIdentifier	 current Tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Key	TokenNameIdentifier	 Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
Key	TokenNameIdentifier	 Key
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
currentTokens	TokenNameIdentifier	 current Tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
temp	TokenNameIdentifier	 temp
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
temp	TokenNameIdentifier	 temp
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Key	TokenNameIdentifier	 Key
;	TokenNameSEMICOLON	
temp	TokenNameIdentifier	 temp
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentTokens	TokenNameIdentifier	 current Tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attVec	TokenNameIdentifier	 att Vec
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Iterates through the Key list and returns the first value for whose * key the given string contains. Returns "unknown" if no key is contained * in the string. * @param s String being searched for a key. * @return Value for key found in string, otherwise "unknown" */	TokenNameCOMMENT_JAVADOC	 Iterates through the Key list and returns the first value for whose key the given string contains. Returns "unknown" if no key is contained in the string. @param s String being searched for a key. @return Value for key found in string, otherwise "unknown" 
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
attVec	TokenNameIdentifier	 att Vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
temp	TokenNameIdentifier	 temp
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
attVec	TokenNameIdentifier	 att Vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
temp	TokenNameIdentifier	 temp
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
"unknown"	TokenNameStringLiteral	unknown
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a processing instruction's (PI) attributes for easy retrieval. */	TokenNameCOMMENT_JAVADOC	 Parses a processing instruction's (PI) attributes for easy retrieval. 
class	TokenNameclass	
PIA	TokenNameIdentifier	 PIA
{	TokenNameLBRACE	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
piAttributes	TokenNameIdentifier	 pi Attributes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor. * @param pi The processing instruction whose attributes are to be parsed */	TokenNameCOMMENT_JAVADOC	 Constructor. @param pi The processing instruction whose attributes are to be parsed 
PIA	TokenNameIdentifier	 PIA
(	TokenNameLPAREN	
ProcessingInstruction	TokenNameIdentifier	 Processing Instruction
pi	TokenNameIdentifier	 pi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
piAttributes	TokenNameIdentifier	 pi Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
piAttributes	TokenNameIdentifier	 pi Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns value of specified attribute. * @param name Attribute name * @return Attribute value, or null if the attribute name does not exist */	TokenNameCOMMENT_JAVADOC	 Returns value of specified attribute. @param name Attribute name @return Attribute value, or null if the attribute name does not exist 
String	TokenNameIdentifier	 String
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
piAttributes	TokenNameIdentifier	 pi Attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
