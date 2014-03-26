/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformHandler.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformHandler.java 470245 2006-11-02 06:34:33Z minchau $ 
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
import	TokenNameimport	
sunlabs	TokenNameIdentifier	 sunlabs
.	TokenNameDOT	
brazil	TokenNameIdentifier	 brazil
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
Handler	TokenNameIdentifier	 Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
sunlabs	TokenNameIdentifier	 sunlabs
.	TokenNameDOT	
brazil	TokenNameIdentifier	 brazil
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
Request	TokenNameIdentifier	 Request
;	TokenNameSEMICOLON	
import	TokenNameimport	
sunlabs	TokenNameIdentifier	 sunlabs
.	TokenNameDOT	
brazil	TokenNameIdentifier	 brazil
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
Server	TokenNameIdentifier	 Server
;	TokenNameSEMICOLON	
/** * This Brazil handler demonstrates how XSL transformations can be made * available as a web service without using a full web server. This class * implements the Handler interface from the Brazil project, see: * http://www.sun.com/research/brazil/ * * Note that the XSLTC transformation engine is invoked through the JAXP * interface, using the XSLTC "use-classpath" attribute. The * "use-from-classpath" attribute specifies to the XSLTC TransformerFactory * that a precompiled version of the stylesheet (translet) may be available, * and that should be used in preference to recompiling the stylesheet. * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 This Brazil handler demonstrates how XSL transformations can be made available as a web service without using a full web server. This class implements the Handler interface from the Brazil project, see: http://www.sun.com/research/brazil/ * Note that the XSLTC transformation engine is invoked through the JAXP interface, using the XSLTC "use-classpath" attribute. The "use-from-classpath" attribute specifies to the XSLTC TransformerFactory that a precompiled version of the stylesheet (translet) may be available, and that should be used in preference to recompiling the stylesheet. @author Morten Jorgensen 
public	TokenNamepublic	
class	TokenNameclass	
TransformHandler	TokenNameIdentifier	 Transform Handler
implements	TokenNameimplements	
Handler	TokenNameIdentifier	 Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
m_tf	TokenNameIdentifier	 m tf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// These two are used while parsing the parameters in the URL 	TokenNameCOMMENT_LINE	These two are used while parsing the parameters in the URL 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PARAM_TRANSLET	TokenNameIdentifier	 PARAM  TRANSLET
=	TokenNameEQUAL	
"translet="	TokenNameStringLiteral	translet=
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PARAM_DOCUMENT	TokenNameIdentifier	 PARAM  DOCUMENT
=	TokenNameEQUAL	
"document="	TokenNameStringLiteral	document=
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PARAM_STATS	TokenNameIdentifier	 PARAM  STATS
=	TokenNameEQUAL	
"stats="	TokenNameStringLiteral	stats=
;	TokenNameSEMICOLON	
// All output goes here: 	TokenNameCOMMENT_LINE	All output goes here: 
private	TokenNameprivate	
PrintWriter	TokenNameIdentifier	 Print Writer
m_out	TokenNameIdentifier	 m out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Dump an error message to output */	TokenNameCOMMENT_JAVADOC	 Dump an error message to output 
public	TokenNamepublic	
void	TokenNamevoid	
errorMessage	TokenNameIdentifier	 error Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_out	TokenNameIdentifier	 m out
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_out	TokenNameIdentifier	 m out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<h1>XSL transformation error</h1>"	TokenNameStringLiteral	<h1>XSL transformation error</h1>
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_out	TokenNameIdentifier	 m out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<br>Exception:</br>"	TokenNameStringLiteral	<br>Exception:</br>
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
errorMessage	TokenNameIdentifier	 error Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_out	TokenNameIdentifier	 m out
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
m_out	TokenNameIdentifier	 m out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<h1>XSL transformation error</h1>"	TokenNameStringLiteral	<h1>XSL transformation error</h1>
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is run when the Brazil proxy is loaded */	TokenNameCOMMENT_JAVADOC	 This method is run when the Brazil proxy is loaded 
public	TokenNamepublic	
boolean	TokenNameboolean	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
Server	TokenNameIdentifier	 Server
server	TokenNameIdentifier	 server
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is run for every HTTP request sent to the proxy */	TokenNameCOMMENT_JAVADOC	 This method is run for every HTTP request sent to the proxy 
public	TokenNamepublic	
boolean	TokenNameboolean	
respond	TokenNameIdentifier	 respond
(	TokenNameLPAREN	
Request	TokenNameIdentifier	 Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Initialise the output buffer 	TokenNameCOMMENT_LINE	Initialise the output buffer 
final	TokenNamefinal	
StringWriter	TokenNameIdentifier	 String Writer
sout	TokenNameIdentifier	 sout
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_out	TokenNameIdentifier	 m out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sout	TokenNameIdentifier	 sout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These two hold the parameters from the URL 'translet' and 'document' 	TokenNameCOMMENT_LINE	These two hold the parameters from the URL 'translet' and 'document' 
String	TokenNameIdentifier	 String
transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
stats	TokenNameIdentifier	 stats
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Get the parameters from the URL 	TokenNameCOMMENT_LINE	Get the parameters from the URL 
final	TokenNamefinal	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
"&"	TokenNameStringLiteral	&
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
PARAM_TRANSLET	TokenNameIdentifier	 PARAM  TRANSLET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
PARAM_TRANSLET	TokenNameIdentifier	 PARAM  TRANSLET
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
PARAM_DOCUMENT	TokenNameIdentifier	 PARAM  DOCUMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
PARAM_DOCUMENT	TokenNameIdentifier	 PARAM  DOCUMENT
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
PARAM_STATS	TokenNameIdentifier	 PARAM  STATS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stats	TokenNameIdentifier	 stats
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
PARAM_STATS	TokenNameIdentifier	 PARAM  STATS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Make sure that both parameters were specified 	TokenNameCOMMENT_LINE	Make sure that both parameters were specified 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
transletName	TokenNameIdentifier	 translet Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorMessage	TokenNameIdentifier	 error Message
(	TokenNameLPAREN	
"Parameters <b><tt>translet</tt></b> and/or "	TokenNameStringLiteral	Parameters <b><tt>translet</tt></b> and/or 
+	TokenNamePLUS	
"<b><tt>document</tt></b> not specified."	TokenNameStringLiteral	<b><tt>document</tt></b> not specified.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_tf	TokenNameIdentifier	 m tf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_tf	TokenNameIdentifier	 m tf
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m_tf	TokenNameIdentifier	 m tf
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
"Could not set XSLTC-specific TransformerFactory "	TokenNameStringLiteral	Could not set XSLTC-specific TransformerFactory 
+	TokenNamePLUS	
"attributes. Transformation failed."	TokenNameStringLiteral	attributes. Transformation failed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Transformer	TokenNameIdentifier	 Transformer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
m_tf	TokenNameIdentifier	 m tf
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
transletName	TokenNameIdentifier	 translet Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Do the actual transformation 	TokenNameCOMMENT_LINE	Do the actual transformation 
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
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
m_out	TokenNameIdentifier	 m out
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
m_out	TokenNameIdentifier	 m out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<!-- transformed by XSLTC in "	TokenNameStringLiteral	<!-- transformed by XSLTC in 
+	TokenNamePLUS	
done	TokenNameIdentifier	 done
+	TokenNamePLUS	
"ms -->"	TokenNameStringLiteral	ms -->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorMessage	TokenNameIdentifier	 error Message
(	TokenNameLPAREN	
"Internal error."	TokenNameStringLiteral	Internal error.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Pass the transformation output as the HTTP response 	TokenNameCOMMENT_LINE	Pass the transformation output as the HTTP response 
request	TokenNameIdentifier	 request
.	TokenNameDOT	
sendResponse	TokenNameIdentifier	 send Response
(	TokenNameLPAREN	
sout	TokenNameIdentifier	 sout
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
