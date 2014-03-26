/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Compile.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Compile.java 470245 2006-11-02 06:34:33Z minchau $ 
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Templates	TokenNameIdentifier	 Templates
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
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Compile	TokenNameIdentifier	 Compile
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Compile	TokenNameIdentifier	 Compile
app	TokenNameIdentifier	 app
=	TokenNameEQUAL	
new	TokenNamenew	
Compile	TokenNameIdentifier	 Compile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
app	TokenNameIdentifier	 app
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compiles an XSL stylesheet into a translet, wraps the translet * inside a Templates object and dumps it to a file. */	TokenNameCOMMENT_JAVADOC	 Compiles an XSL stylesheet into a translet, wraps the translet inside a Templates object and dumps it to a file. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xsl	TokenNameIdentifier	 xsl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Set XSLTC's TransformerFactory implementation as the default 	TokenNameCOMMENT_LINE	Set XSLTC's TransformerFactory implementation as the default 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"javax.xml.transform.TransformerFactory"	TokenNameStringLiteral	javax.xml.transform.TransformerFactory
,	TokenNameCOMMA	
"org.apache.xalan.xsltc.trax.TransformerFactoryImpl"	TokenNameStringLiteral	org.apache.xalan.xsltc.trax.TransformerFactoryImpl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get an input stream for the XSL stylesheet 	TokenNameCOMMENT_LINE	Get an input stream for the XSL stylesheet 
StreamSource	TokenNameIdentifier	 Stream Source
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
xsl	TokenNameIdentifier	 xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The TransformerFactory will compile the stylesheet and 	TokenNameCOMMENT_LINE	The TransformerFactory will compile the stylesheet and 
// put the translet classes inside the Templates object 	TokenNameCOMMENT_LINE	put the translet classes inside the Templates object 
TransformerFactory	TokenNameIdentifier	 Transformer Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"generate-translet"	TokenNameStringLiteral	generate-translet
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
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
"Exception: "	TokenNameStringLiteral	Exception: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: compile <xsl_file>"	TokenNameStringLiteral	Usage: compile <xsl_file>
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
}	TokenNameRBRACE	
