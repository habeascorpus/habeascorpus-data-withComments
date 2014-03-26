/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ClassGenerator.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ClassGenerator.java 468649 2006-10-28 07:00:55Z minchau $ 
package	TokenNamepackage	
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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
ALOAD	TokenNameIdentifier	 ALOAD
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
ClassGen	TokenNameIdentifier	 Class Gen
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Instruction	TokenNameIdentifier	 Instruction
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
Constants	TokenNameIdentifier	 Constants
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
Parser	TokenNameIdentifier	 Parser
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
Stylesheet	TokenNameIdentifier	 Stylesheet
;	TokenNameSEMICOLON	
/** * The class that implements any class that inherits from * <tt>AbstractTranslet</tt>, i.e. any translet. Methods in this * class may be of the following kinds: * * 1. Main method: applyTemplates, implemented by intances of * <tt>MethodGenerator</tt>. * * 2. Named methods: for named templates, implemented by instances * of <tt>NamedMethodGenerator</tt>. * * 3. Rt methods: for result tree fragments, implemented by * instances of <tt>RtMethodGenerator</tt>. * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 The class that implements any class that inherits from <tt>AbstractTranslet</tt>, i.e. any translet. Methods in this class may be of the following kinds: * 1. Main method: applyTemplates, implemented by intances of <tt>MethodGenerator</tt>. * 2. Named methods: for named templates, implemented by instances of <tt>NamedMethodGenerator</tt>. * 3. Rt methods: for result tree fragments, implemented by instances of <tt>RtMethodGenerator</tt>. @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
class	TokenNameclass	
ClassGenerator	TokenNameIdentifier	 Class Generator
extends	TokenNameextends	
ClassGen	TokenNameIdentifier	 Class Gen
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
TRANSLET_INDEX	TokenNameIdentifier	 TRANSLET  INDEX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Stylesheet	TokenNameIdentifier	 Stylesheet
_stylesheet	TokenNameIdentifier	 stylesheet
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Parser	TokenNameIdentifier	 Parser
_parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
// --> can be moved to XSLT 	TokenNameCOMMENT_LINE	--> can be moved to XSLT 
// a single instance cached here 	TokenNameCOMMENT_LINE	a single instance cached here 
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_aloadTranslet	TokenNameIdentifier	 aload Translet
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
_domClass	TokenNameIdentifier	 dom Class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
_domClassSig	TokenNameIdentifier	 dom Class Sig
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
_applyTemplatesSig	TokenNameIdentifier	 apply Templates Sig
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
_applyTemplatesSigForImport	TokenNameIdentifier	 apply Templates Sig For Import
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClassGenerator	TokenNameIdentifier	 Class Generator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
class_name	TokenNameIdentifier	 class name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
super_class_name	TokenNameIdentifier	 super class name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
file_name	TokenNameIdentifier	 file name
,	TokenNameCOMMA	
int	TokenNameint	
access_flags	TokenNameIdentifier	 access flags
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
interfaces	TokenNameIdentifier	 interfaces
,	TokenNameCOMMA	
Stylesheet	TokenNameIdentifier	 Stylesheet
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
class_name	TokenNameIdentifier	 class name
,	TokenNameCOMMA	
super_class_name	TokenNameIdentifier	 super class name
,	TokenNameCOMMA	
file_name	TokenNameIdentifier	 file name
,	TokenNameCOMMA	
access_flags	TokenNameIdentifier	 access flags
,	TokenNameCOMMA	
interfaces	TokenNameIdentifier	 interfaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
stylesheet	TokenNameIdentifier	 stylesheet
;	TokenNameSEMICOLON	
_parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_aloadTranslet	TokenNameIdentifier	 aload Translet
=	TokenNameEQUAL	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
TRANSLET_INDEX	TokenNameIdentifier	 TRANSLET  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
isMultiDocument	TokenNameIdentifier	 is Multi Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_domClass	TokenNameIdentifier	 dom Class
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.MultiDOM"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.MultiDOM
;	TokenNameSEMICOLON	
_domClassSig	TokenNameIdentifier	 dom Class Sig
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/MultiDOM;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/MultiDOM;
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_domClass	TokenNameIdentifier	 dom Class
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.DOMAdapter"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.DOMAdapter
;	TokenNameSEMICOLON	
_domClassSig	TokenNameIdentifier	 dom Class Sig
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/DOMAdapter;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/DOMAdapter;
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_applyTemplatesSig	TokenNameIdentifier	 apply Templates Sig
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
DOM_INTF_SIG	TokenNameIdentifier	 DOM  INTF  SIG
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
TRANSLET_OUTPUT_SIG	TokenNameIdentifier	 TRANSLET  OUTPUT  SIG
+	TokenNamePLUS	
")V"	TokenNameStringLiteral	)V
;	TokenNameSEMICOLON	
_applyTemplatesSigForImport	TokenNameIdentifier	 apply Templates Sig For Import
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
DOM_INTF_SIG	TokenNameIdentifier	 DOM  INTF  SIG
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
TRANSLET_OUTPUT_SIG	TokenNameIdentifier	 TRANSLET  OUTPUT  SIG
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
NODE_FIELD_SIG	TokenNameIdentifier	 NODE  FIELD  SIG
+	TokenNamePLUS	
")V"	TokenNameStringLiteral	)V
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Parser	TokenNameIdentifier	 Parser
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Stylesheet	TokenNameIdentifier	 Stylesheet
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_stylesheet	TokenNameIdentifier	 stylesheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pretend this is the stylesheet class. Useful when compiling * references to global variables inside a predicate. */	TokenNameCOMMENT_JAVADOC	 Pretend this is the stylesheet class. Useful when compiling references to global variables inside a predicate. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadTranslet	TokenNameIdentifier	 load Translet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_aloadTranslet	TokenNameIdentifier	 aload Translet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getDOMClass	TokenNameIdentifier	 get DOM Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_domClass	TokenNameIdentifier	 dom Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getDOMClassSig	TokenNameIdentifier	 get DOM Class Sig
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_domClassSig	TokenNameIdentifier	 dom Class Sig
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getApplyTemplatesSig	TokenNameIdentifier	 get Apply Templates Sig
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_applyTemplatesSig	TokenNameIdentifier	 apply Templates Sig
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getApplyTemplatesSigForImport	TokenNameIdentifier	 get Apply Templates Sig For Import
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_applyTemplatesSigForImport	TokenNameIdentifier	 apply Templates Sig For Import
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <tt>true</tt> or <tt>false</tt> depending on whether * this class inherits from <tt>AbstractTranslet</tt> or not. */	TokenNameCOMMENT_JAVADOC	 Returns <tt>true</tt> or <tt>false</tt> depending on whether this class inherits from <tt>AbstractTranslet</tt> or not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addMethod	TokenNameIdentifier	 add Method
(	TokenNameLPAREN	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methodsToAdd	TokenNameIdentifier	 methods To Add
=	TokenNameEQUAL	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
getGeneratedMethods	TokenNameIdentifier	 get Generated Methods
(	TokenNameLPAREN	
this	TokenNamethis	
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
methodsToAdd	TokenNameIdentifier	 methods To Add
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addMethod	TokenNameIdentifier	 add Method
(	TokenNameLPAREN	
methodsToAdd	TokenNameIdentifier	 methods To Add
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
