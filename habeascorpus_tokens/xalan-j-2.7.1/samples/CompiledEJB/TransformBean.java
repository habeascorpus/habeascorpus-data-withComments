/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformBean.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformBean.java 470245 2006-11-02 06:34:33Z minchau $ 
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
ejb	TokenNameIdentifier	 ejb
.	TokenNameDOT	
SessionBean	TokenNameIdentifier	 Session Bean
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
ejb	TokenNameIdentifier	 ejb
.	TokenNameDOT	
SessionContext	TokenNameIdentifier	 Session Context
;	TokenNameSEMICOLON	
/** * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen 
public	TokenNamepublic	
class	TokenNameclass	
TransformBean	TokenNameIdentifier	 Transform Bean
implements	TokenNameimplements	
SessionBean	TokenNameIdentifier	 Session Bean
{	TokenNameLBRACE	
private	TokenNameprivate	
SessionContext	TokenNameIdentifier	 Session Context
m_context	TokenNameIdentifier	 m context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
nullErrorMsg	TokenNameIdentifier	 null Error Msg
=	TokenNameEQUAL	
"<h1>XSL transformation error</h1>"	TokenNameStringLiteral	<h1>XSL transformation error</h1>
+	TokenNamePLUS	
"<p>'null' parameters sent to the XSL transformation bean's "	TokenNameStringLiteral	<p>'null' parameters sent to the XSL transformation bean's 
+	TokenNamePLUS	
"<tt>transform(String document, String translet)</tt> method.</p>"	TokenNameStringLiteral	<tt>transform(String document, String translet)</tt> method.</p>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_FEATURE	TokenNameIdentifier	 NAMESPACE  FEATURE
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespaces"	TokenNameStringLiteral	http://xml.org/sax/features/namespaces
;	TokenNameSEMICOLON	
/** * Generates HTML from a basic error message and an exception */	TokenNameCOMMENT_JAVADOC	 Generates HTML from a basic error message and an exception 
private	TokenNameprivate	
void	TokenNamevoid	
errorMsg	TokenNameIdentifier	 error Msg
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<h1>Error</h1>"	TokenNameStringLiteral	<h1>Error</h1>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<p>"	TokenNameStringLiteral	<p>
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
"</p><br>"	TokenNameStringLiteral	</p><br>
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
}	TokenNameRBRACE	
/** * Main bean entry point */	TokenNameCOMMENT_JAVADOC	 Main bean entry point 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
transletName	TokenNameIdentifier	 translet Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Initialise the output stream 	TokenNameCOMMENT_LINE	Initialise the output stream 
final	TokenNamefinal	
StringWriter	TokenNameIdentifier	 String Writer
sout	TokenNameIdentifier	 sout
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sout	TokenNameIdentifier	 sout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
transletName	TokenNameIdentifier	 translet Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
nullErrorMsg	TokenNameIdentifier	 null Error Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
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
"Could not set XSLTC-specific TransformerFactory "	TokenNameStringLiteral	Could not set XSLTC-specific TransformerFactory 
+	TokenNamePLUS	
"attributes. Transformation failed."	TokenNameStringLiteral	attributes. Transformation failed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorMsg	TokenNameIdentifier	 error Msg
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"Impossible state reached."	TokenNameStringLiteral	Impossible state reached.
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
return	TokenNamereturn	
sout	TokenNameIdentifier	 sout
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
void	TokenNamevoid	
setSessionContext	TokenNameIdentifier	 set Session Context
(	TokenNameLPAREN	
SessionContext	TokenNameIdentifier	 Session Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_context	TokenNameIdentifier	 m context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// General EJB entry points 	TokenNameCOMMENT_LINE	General EJB entry points 
public	TokenNamepublic	
void	TokenNamevoid	
ejbCreate	TokenNameIdentifier	 ejb Create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ejbRemove	TokenNameIdentifier	 ejb Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ejbActivate	TokenNameIdentifier	 ejb Activate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ejbPassivate	TokenNameIdentifier	 ejb Passivate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ejbLoad	TokenNameIdentifier	 ejb Load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ejbStore	TokenNameIdentifier	 ejb Store
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
