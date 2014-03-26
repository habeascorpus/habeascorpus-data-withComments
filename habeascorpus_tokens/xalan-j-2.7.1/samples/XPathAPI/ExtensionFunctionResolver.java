/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathConstants	TokenNameIdentifier	 X Path Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFactory	TokenNameIdentifier	 X Path Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
XPathFunctionResolverImpl	TokenNameIdentifier	 X Path Function Resolver Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
ExtensionNamespaceContext	TokenNameIdentifier	 Extension Namespace Context
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
/** * JAXP 1.3 XPath API sample. * * This sample shows how to use the sample XPathFunctionResolver to evaluate * XPath expressions containing Java or EXSLT extension functions. * * To support extension functions in XPath expressions, you have to set an * XPathFunctionResolver on the XPath object. You can provide your implementation * of XPathFunctionResolver or use sample XPathFunctionResolver in * org.apache.xalan.extensions.XPathFunctionResolverImpl, which supports * the usage of Java and EXSLT extension functions. * * You also need to provide a NamespaceContext for the XPath evaluation. You * can provide your own implementation of NamespaceContext, or use the sample * implementation in org.apache.xalan.extensions.ExtensionNamespaceContext, * which supports the following namespace prefix to URI mappings: * * java --> http://xml.apache.org/xalan/java * exslt --> http://exslt.org/common * math --> http://exslt.org/math * set --> http://exslt.org/sets * str --> http://exslt.org/strings * dyn --> http://exslt.org/dynamic * datetime --> http://exslt.org/dates-and-times * * To run this sample, you have to put the directory containing ExtensionTest.class * on your classpath. */	TokenNameCOMMENT_JAVADOC	 JAXP 1.3 XPath API sample. * This sample shows how to use the sample XPathFunctionResolver to evaluate XPath expressions containing Java or EXSLT extension functions. * To support extension functions in XPath expressions, you have to set an XPathFunctionResolver on the XPath object. You can provide your implementation of XPathFunctionResolver or use sample XPathFunctionResolver in org.apache.xalan.extensions.XPathFunctionResolverImpl, which supports the usage of Java and EXSLT extension functions. * You also need to provide a NamespaceContext for the XPath evaluation. You can provide your own implementation of NamespaceContext, or use the sample implementation in org.apache.xalan.extensions.ExtensionNamespaceContext, which supports the following namespace prefix to URI mappings: * java --> http://xml.apache.org/xalan/java exslt --> http://exslt.org/common math --> http://exslt.org/math set --> http://exslt.org/sets str --> http://exslt.org/strings dyn --> http://exslt.org/dynamic datetime --> http://exslt.org/dates-and-times * To run this sample, you have to put the directory containing ExtensionTest.class on your classpath. 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionFunctionResolver	TokenNameIdentifier	 Extension Function Resolver
{	TokenNameLBRACE	
// An XPath expression containing an EXSLT extension function call. 	TokenNameCOMMENT_LINE	An XPath expression containing an EXSLT extension function call. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXPR1	TokenNameIdentifier	 EXP R1
=	TokenNameEQUAL	
"math:max(/doc/num)"	TokenNameStringLiteral	math:max(/doc/num)
;	TokenNameSEMICOLON	
// An XPath expression containing a Java extension function call. 	TokenNameCOMMENT_LINE	An XPath expression containing a Java extension function call. 
// You have to compile the Java source file ExtensionTest.java and put 	TokenNameCOMMENT_LINE	You have to compile the Java source file ExtensionTest.java and put 
// the directory containing ExtensionTest.class on your classpath. 	TokenNameCOMMENT_LINE	the directory containing ExtensionTest.class on your classpath. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXPR2	TokenNameIdentifier	 EXP R2
=	TokenNameEQUAL	
"java:ExtensionTest.test('Bob')"	TokenNameStringLiteral	java:ExtensionTest.test('Bob')
;	TokenNameSEMICOLON	
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
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
XPathFactory	TokenNameIdentifier	 X Path Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
XPathFactory	TokenNameIdentifier	 X Path Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newXPath	TokenNameIdentifier	 new X Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the NamespaceContext to 	TokenNameCOMMENT_LINE	set the NamespaceContext to 
// org.apache.xalan.extensions.ExtensionNamespaceContext 	TokenNameCOMMENT_LINE	org.apache.xalan.extensions.ExtensionNamespaceContext 
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
setNamespaceContext	TokenNameIdentifier	 set Namespace Context
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceContext	TokenNameIdentifier	 Extension Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the XPathFunctionResolver to 	TokenNameCOMMENT_LINE	set the XPathFunctionResolver to 
// org.apache.xalan.extensions.XPathFunctionResolverImpl 	TokenNameCOMMENT_LINE	org.apache.xalan.extensions.XPathFunctionResolverImpl 
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
setXPathFunctionResolver	TokenNameIdentifier	 set X Path Function Resolver
(	TokenNameLPAREN	
new	TokenNamenew	
XPathFunctionResolverImpl	TokenNameIdentifier	 X Path Function Resolver Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Evaluate the XPath expression "math:max(/doc/num)" against 	TokenNameCOMMENT_LINE	Evaluate the XPath expression "math:max(/doc/num)" against 
// the input document numlist.xml 	TokenNameCOMMENT_LINE	the input document numlist.xml 
InputSource	TokenNameIdentifier	 Input Source
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
"numlist.xml"	TokenNameStringLiteral	numlist.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
EXPR1	TokenNameIdentifier	 EXP R1
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
EXPR1	TokenNameIdentifier	 EXP R1
+	TokenNamePLUS	
" = "	TokenNameStringLiteral	 = 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Evaluate the XPath expression "java:ExtensionTest.test('Bob')" 	TokenNameCOMMENT_LINE	Evaluate the XPath expression "java:ExtensionTest.test('Bob')" 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
EXPR2	TokenNameIdentifier	 EXP R2
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
EXPR2	TokenNameIdentifier	 EXP R2
+	TokenNamePLUS	
" = "	TokenNameStringLiteral	 = 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
