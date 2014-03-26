/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTServletWithParams.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTServletWithParams.java 470245 2006-11-02 06:34:33Z minchau $ 
package	TokenNamepackage	
servlet	TokenNameIdentifier	 servlet
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
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
TransformerFactory	TokenNameIdentifier	 Transformer Factory
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
Source	TokenNameIdentifier	 Source
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
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamResult	TokenNameIdentifier	 Stream Result
;	TokenNameSEMICOLON	
/* * This sample takes input parameters in the request URL: a URL * parameter for the XML input, an xslURL parameter for the stylesheet, * and optional stylesheet parameters. * To run the equivalent of SimplestXSLServlet (with the documents in the * servlet document root directory), the request URL is * http://<server/servletpath>servlet.SimpleXSLServlet?URL=file:todo.xml&xslURL=file:todo.xsl * * Using a stylesheet Processing Instruction: * If the XML document includes a stylesheet PI that you want to use, * omit the xslURL parameter. * * Sending stylesheet parameters: * If, for example, a servlet takes a stylesheet parameter named param1 * param1 that you want to set to foo, include param1=foo in the URL. */	TokenNameCOMMENT_BLOCK	 This sample takes input parameters in the request URL: a URL parameter for the XML input, an xslURL parameter for the stylesheet, and optional stylesheet parameters. To run the equivalent of SimplestXSLServlet (with the documents in the servlet document root directory), the request URL is http://<server/servletpath>servlet.SimpleXSLServlet?URL=file:todo.xml&xslURL=file:todo.xsl * Using a stylesheet Processing Instruction: If the XML document includes a stylesheet PI that you want to use, omit the xslURL parameter. * Sending stylesheet parameters: If, for example, a servlet takes a stylesheet parameter named param1 param1 that you want to set to foo, include param1=foo in the URL. 
public	TokenNamepublic	
class	TokenNameclass	
XSLTServletWithParams	TokenNameIdentifier	 XSLT Servlet With Params
extends	TokenNameextends	
HttpServlet	TokenNameIdentifier	 Http Servlet
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
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
// The servlet returns HTML; charset is UTF8. 	TokenNameCOMMENT_LINE	The servlet returns HTML; charset is UTF8. 
// See ApplyXSLT.getContentType() to get output properties from <xsl:output>. 	TokenNameCOMMENT_LINE	See ApplyXSLT.getContentType() to get output properties from <xsl:output>. 
response	TokenNameIdentifier	 response
.	TokenNameDOT	
setContentType	TokenNameIdentifier	 set Content Type
(	TokenNameLPAREN	
"text/html; charset=UTF-8"	TokenNameStringLiteral	text/html; charset=UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// Get params from URL. 	TokenNameCOMMENT_LINE	Get params from URL. 
String	TokenNameIdentifier	 String
xml	TokenNameIdentifier	 xml
=	TokenNameEQUAL	
getRequestParam	TokenNameIdentifier	 get Request Param
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
"URL"	TokenNameStringLiteral	URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xsl	TokenNameIdentifier	 xsl
=	TokenNameEQUAL	
getRequestParam	TokenNameIdentifier	 get Request Param
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
"xslURL"	TokenNameStringLiteral	xslURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Source	TokenNameIdentifier	 Source
xmlSource	TokenNameIdentifier	 xml Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Source	TokenNameIdentifier	 Source
xslSource	TokenNameIdentifier	 xsl Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//get the real path for xml and xsl files. 	TokenNameCOMMENT_LINE	get the real path for xml and xsl files. 
String	TokenNameIdentifier	 String
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
getServletContext	TokenNameIdentifier	 get Servlet Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRealPath	TokenNameIdentifier	 get Real Path
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
+	TokenNamePLUS	
FS	TokenNameIdentifier	 FS
;	TokenNameSEMICOLON	
// Get the XML input document. 	TokenNameCOMMENT_LINE	Get the XML input document. 
if	TokenNameif	
(	TokenNameLPAREN	
xml	TokenNameIdentifier	 xml
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
xmlSource	TokenNameIdentifier	 xml Source
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
+	TokenNamePLUS	
xml	TokenNameIdentifier	 xml
)	TokenNameRPAREN	
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the stylesheet. 	TokenNameCOMMENT_LINE	Get the stylesheet. 
if	TokenNameif	
(	TokenNameLPAREN	
xsl	TokenNameIdentifier	 xsl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
xsl	TokenNameIdentifier	 xsl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
xslSource	TokenNameIdentifier	 xsl Source
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
+	TokenNamePLUS	
xsl	TokenNameIdentifier	 xsl
)	TokenNameRPAREN	
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// We have an XML input document. 	TokenNameCOMMENT_LINE	We have an XML input document. 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xslSource	TokenNameIdentifier	 xsl Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// If no stylesheet, look for PI in XML input document. 	TokenNameCOMMENT_LINE	If no stylesheet, look for PI in XML input document. 
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
media	TokenNameIdentifier	 media
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
xslSource	TokenNameIdentifier	 xsl Source
=	TokenNameEQUAL	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
getAssociatedStylesheet	TokenNameIdentifier	 get Associated Stylesheet
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
media	TokenNameIdentifier	 media
,	TokenNameCOMMA	
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xslSource	TokenNameIdentifier	 xsl Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// Now do we have a stylesheet? 	TokenNameCOMMENT_LINE	Now do we have a stylesheet? 
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
xslSource	TokenNameIdentifier	 xsl Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set stylesheet params. 	TokenNameCOMMENT_LINE	Set stylesheet params. 
// Perform the transformation. 	TokenNameCOMMENT_LINE	Perform the transformation. 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"No Stylesheet!"	TokenNameStringLiteral	No Stylesheet!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"No XML Input Document!"	TokenNameStringLiteral	No XML Input Document!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get parameters from the request URL. 	TokenNameCOMMENT_LINE	Get parameters from the request URL. 
String	TokenNameIdentifier	 String
getRequestParam	TokenNameIdentifier	 get Request Param
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
paramVal	TokenNameIdentifier	 param Val
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paramVal	TokenNameIdentifier	 param Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set stylesheet parameters from the request URL. 	TokenNameCOMMENT_LINE	Set stylesheet parameters from the request URL. 
void	TokenNamevoid	
setParameters	TokenNameIdentifier	 set Parameters
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
paramVal	TokenNameIdentifier	 param Val
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
paramName	TokenNameIdentifier	 param Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paramVal	TokenNameIdentifier	 param Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
paramName	TokenNameIdentifier	 param Name
,	TokenNameCOMMA	
paramVal	TokenNameIdentifier	 param Val
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
