/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformServlet.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformServlet.java 470245 2006-11-02 06:34:33Z minchau $ 
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
naming	TokenNameIdentifier	 naming
.	TokenNameDOT	
InitialContext	TokenNameIdentifier	 Initial Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
PortableRemoteObject	TokenNameIdentifier	 Portable Remote Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
servlet	TokenNameIdentifier	 servlet
.	TokenNameDOT	
ServletConfig	TokenNameIdentifier	 Servlet Config
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
/** * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen 
public	TokenNamepublic	
class	TokenNameclass	
TransformServlet	TokenNameIdentifier	 Transform Servlet
extends	TokenNameextends	
HttpServlet	TokenNameIdentifier	 Http Servlet
{	TokenNameLBRACE	
// Error message used when the XSL transformation bean cannot be created 	TokenNameCOMMENT_LINE	Error message used when the XSL transformation bean cannot be created 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
createErrorMsg	TokenNameIdentifier	 create Error Msg
=	TokenNameEQUAL	
"<h1>XSL transformation bean error</h1>"	TokenNameStringLiteral	<h1>XSL transformation bean error</h1>
+	TokenNamePLUS	
"<p>An XSL transformation bean could not be created.</p>"	TokenNameStringLiteral	<p>An XSL transformation bean could not be created.</p>
;	TokenNameSEMICOLON	
// Transformer - "more than meets the eye". 	TokenNameCOMMENT_LINE	Transformer - "more than meets the eye". 
private	TokenNameprivate	
TransformHome	TokenNameIdentifier	 Transform Home
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
/** * Servlet initializer - look up the bean's home interface */	TokenNameCOMMENT_JAVADOC	 Servlet initializer - look up the bean's home interface 
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
try	TokenNametry	
{	TokenNameLBRACE	
InitialContext	TokenNameIdentifier	 Initial Context
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
InitialContext	TokenNameIdentifier	 Initial Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
transformRef	TokenNameIdentifier	 transform Ref
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"transform"	TokenNameStringLiteral	transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformHome	TokenNameIdentifier	 Transform Home
)	TokenNameRPAREN	
PortableRemoteObject	TokenNameIdentifier	 Portable Remote Object
.	TokenNameDOT	
narrow	TokenNameIdentifier	 narrow
(	TokenNameLPAREN	
transformRef	TokenNameIdentifier	 transform Ref
,	TokenNameCOMMA	
TransformHome	TokenNameIdentifier	 Transform Home
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
NamingException	TokenNameIdentifier	 Naming Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamingException	TokenNameIdentifier	 Naming Exception
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Handles "GET" HTTP requests - ie. runs the actual transformation */	TokenNameCOMMENT_JAVADOC	 Handles "GET" HTTP requests - ie. runs the actual transformation 
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
String	TokenNameIdentifier	 String
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
"document"	TokenNameStringLiteral	document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
"translet"	TokenNameStringLiteral	translet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
try	TokenNametry	
{	TokenNameLBRACE	
// Get the insult from the bean 	TokenNameCOMMENT_LINE	Get the insult from the bean 
TransformRemote	TokenNameIdentifier	 Transform Remote
xslt	TokenNameIdentifier	 xslt
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
xslt	TokenNameIdentifier	 xslt
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
CreateException	TokenNameIdentifier	 Create Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
createErrorMsg	TokenNameIdentifier	 create Error Msg
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
public	TokenNamepublic	
void	TokenNamevoid	
destroy	TokenNameIdentifier	 destroy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Destroy"	TokenNameStringLiteral	Destroy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
