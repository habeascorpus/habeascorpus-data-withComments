/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
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
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Service	TokenNameIdentifier	 Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
/** * A class allowing to create/query an {@link * org.apache.batik.script.Interpreter} corresponding to a particular * <tt>Document</tt> and scripting language. * * <p>By default, it is able to create interpreters for ECMAScript, * Python and Tcl scripting languages if you provide the right jar * files in your CLASSPATH (i.e. Rhino, JPython and Jacl jar * files).</p> * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: InterpreterPool.java 578701 2007-09-24 08:14:55Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class allowing to create/query an {@link org.apache.batik.script.Interpreter} corresponding to a particular <tt>Document</tt> and scripting language. * <p>By default, it is able to create interpreters for ECMAScript, Python and Tcl scripting languages if you provide the right jar files in your CLASSPATH (i.e. Rhino, JPython and Jacl jar files).</p> * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: InterpreterPool.java 578701 2007-09-24 08:14:55Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
InterpreterPool	TokenNameIdentifier	 Interpreter Pool
{	TokenNameLBRACE	
/** * Name of the "document" object when referenced by scripts */	TokenNameCOMMENT_JAVADOC	 Name of the "document" object when referenced by scripts 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BIND_NAME_DOCUMENT	TokenNameIdentifier	 BIND  NAME  DOCUMENT
=	TokenNameEQUAL	
"document"	TokenNameStringLiteral	document
;	TokenNameSEMICOLON	
/** * The default InterpreterFactory map. */	TokenNameCOMMENT_JAVADOC	 The default InterpreterFactory map. 
protected	TokenNameprotected	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
defaultFactories	TokenNameIdentifier	 default Factories
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The InterpreterFactory map. */	TokenNameCOMMENT_JAVADOC	 The InterpreterFactory map. 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
factories	TokenNameIdentifier	 factories
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
Service	TokenNameIdentifier	 Service
.	TokenNameDOT	
providers	TokenNameIdentifier	 providers
(	TokenNameLPAREN	
InterpreterFactory	TokenNameIdentifier	 Interpreter Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InterpreterFactory	TokenNameIdentifier	 Interpreter Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InterpreterFactory	TokenNameIdentifier	 Interpreter Factory
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mimeTypes	TokenNameIdentifier	 mime Types
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getMimeTypes	TokenNameIdentifier	 get Mime Types
(	TokenNameLPAREN	
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
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultFactories	TokenNameIdentifier	 default Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Constructs a new <tt>InterpreterPool</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>InterpreterPool</tt>. 
public	TokenNamepublic	
InterpreterPool	TokenNameIdentifier	 Interpreter Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
defaultFactories	TokenNameIdentifier	 default Factories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new interpreter for the specified document and * according to the specified language. This method can return * null if no interpreter has been found for the specified * language. * * @param document the document that needs the interpreter * @param language the scripting language */	TokenNameCOMMENT_JAVADOC	 Creates a new interpreter for the specified document and according to the specified language. This method can return null if no interpreter has been found for the specified language. * @param document the document that needs the interpreter @param language the scripting language 
public	TokenNamepublic	
Interpreter	TokenNameIdentifier	 Interpreter
createInterpreter	TokenNameIdentifier	 create Interpreter
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InterpreterFactory	TokenNameIdentifier	 Interpreter Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InterpreterFactory	TokenNameIdentifier	 Interpreter Factory
)	TokenNameRPAREN	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Interpreter	TokenNameIdentifier	 Interpreter
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
svgDoc	TokenNameIdentifier	 svg Doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
svgDoc	TokenNameIdentifier	 svg Doc
.	TokenNameDOT	
getDocumentURI	TokenNameIdentifier	 get Document URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createInterpreter	TokenNameIdentifier	 create Interpreter
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
svgDoc	TokenNameIdentifier	 svg Doc
.	TokenNameDOT	
isSVG12	TokenNameIdentifier	 is SV G12
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
interpreter	TokenNameIdentifier	 interpreter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
bindObject	TokenNameIdentifier	 bind Object
(	TokenNameLPAREN	
BIND_NAME_DOCUMENT	TokenNameIdentifier	 BIND  NAME  DOCUMENT
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds for the specified language, the specified Interpreter factory. * * @param language the language for which the factory is registered * @param factory the <code>InterpreterFactory</code> to register */	TokenNameCOMMENT_JAVADOC	 Adds for the specified language, the specified Interpreter factory. * @param language the language for which the factory is registered @param factory the <code>InterpreterFactory</code> to register 
public	TokenNamepublic	
void	TokenNamevoid	
putInterpreterFactory	TokenNameIdentifier	 put Interpreter Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
,	TokenNameCOMMA	
InterpreterFactory	TokenNameIdentifier	 Interpreter Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the InterpreterFactory associated to the specified language. * * @param language the language for which the factory should be removed. */	TokenNameCOMMENT_JAVADOC	 Removes the InterpreterFactory associated to the specified language. * @param language the language for which the factory should be removed. 
public	TokenNamepublic	
void	TokenNamevoid	
removeInterpreterFactory	TokenNameIdentifier	 remove Interpreter Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
{	TokenNameLBRACE	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
