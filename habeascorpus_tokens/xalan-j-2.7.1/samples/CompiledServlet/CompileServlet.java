/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: CompileServlet.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: CompileServlet.java 470245 2006-11-02 06:34:33Z minchau $ 
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
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
servlet	TokenNameIdentifier	 servlet
.	TokenNameDOT	
ServletException	TokenNameIdentifier	 Servlet Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
servlet	TokenNameIdentifier	 servlet
.	TokenNameDOT	
http	TokenNameIdentifier	 http
.	TokenNameDOT	
HttpServlet	TokenNameIdentifier	 Http Servlet
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
servlet	TokenNameIdentifier	 servlet
.	TokenNameDOT	
http	TokenNameIdentifier	 http
.	TokenNameDOT	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
servlet	TokenNameIdentifier	 servlet
.	TokenNameDOT	
http	TokenNameIdentifier	 http
.	TokenNameDOT	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
XSLTC	TokenNameIdentifier	 XSLTC
;	TokenNameSEMICOLON	
/** * @author Morten Jorgensen * @author Jacek Ambroziak */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen @author Jacek Ambroziak 
public	TokenNamepublic	
class	TokenNameclass	
CompileServlet	TokenNameIdentifier	 Compile Servlet
extends	TokenNameextends	
HttpServlet	TokenNameIdentifier	 Http Servlet
{	TokenNameLBRACE	
/** * Main servlet entry point. The servlet reads a stylesheet from the * URI specified by the "sheet" parameter. The compiled Java class * ends up in the CWD of the web server (a better solution would be * to have an environment variable point to a translet directory). */	TokenNameCOMMENT_JAVADOC	 Main servlet entry point. The servlet reads a stylesheet from the URI specified by the "sheet" parameter. The compiled Java class ends up in the CWD of the web server (a better solution would be to have an environment variable point to a translet directory). 
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
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ServletException	TokenNameIdentifier	 Servlet Exception
{	TokenNameLBRACE	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
setContentType	TokenNameIdentifier	 set Content Type
(	TokenNameLPAREN	
"text/html"	TokenNameStringLiteral	text/html
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
String	TokenNameIdentifier	 String
stylesheetName	TokenNameIdentifier	 stylesheet Name
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
"sheet"	TokenNameStringLiteral	sheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<html><head>"	TokenNameStringLiteral	<html><head>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<title>Servlet Stylesheet Compilation</title>"	TokenNameStringLiteral	<title>Servlet Stylesheet Compilation</title>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"</head><body>"	TokenNameStringLiteral	</head><body>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stylesheetName	TokenNameIdentifier	 stylesheet Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<h1>Compilation error</h1>"	TokenNameStringLiteral	<h1>Compilation error</h1>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"The parameter <b><tt>sheet</tt></b> "	TokenNameStringLiteral	The parameter <b><tt>sheet</tt></b> 
+	TokenNamePLUS	
"must be specified"	TokenNameStringLiteral	must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
XSLTC	TokenNameIdentifier	 XSLTC
xsltc	TokenNameIdentifier	 xsltc
=	TokenNameEQUAL	
new	TokenNamenew	
XSLTC	TokenNameIdentifier	 XSLTC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
stylesheetName	TokenNameIdentifier	 stylesheet Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<h1>Compilation successful</h1>"	TokenNameStringLiteral	<h1>Compilation successful</h1>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"The stylesheet was compiled into the translet "	TokenNameStringLiteral	The stylesheet was compiled into the translet 
+	TokenNamePLUS	
"class "	TokenNameStringLiteral	class 
+	TokenNamePLUS	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" and is now "	TokenNameStringLiteral	 and is now 
+	TokenNamePLUS	
"available for transformations on this server."	TokenNameStringLiteral	available for transformations on this server.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"</body></html>"	TokenNameStringLiteral	</body></html>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
