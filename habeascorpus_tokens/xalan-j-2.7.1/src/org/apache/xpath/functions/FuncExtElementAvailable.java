/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FuncExtElementAvailable.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FuncExtElementAvailable.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
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
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExtensionsProvider	TokenNameIdentifier	 Extensions Provider
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
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
XBoolean	TokenNameIdentifier	 X Boolean
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
/** * Execute the ExtElementAvailable() function. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Execute the ExtElementAvailable() function. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
FuncExtElementAvailable	TokenNameIdentifier	 Func Ext Element Available
extends	TokenNameextends	
FunctionOneArg	TokenNameIdentifier	 Function One Arg
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
472533699257968546L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Execute the function. The function must return * a valid object. * @param xctxt The current execution context. * @return A valid XObject. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the function. The function must return a valid object. @param xctxt The current execution context. @return A valid XObject. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
methName	TokenNameIdentifier	 meth Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
m_arg0	TokenNameIdentifier	 m arg0
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
=	TokenNameEQUAL	
fullName	TokenNameIdentifier	 full Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_XSLNAMESPACEURL	TokenNameIdentifier	 S  XSLNAMESPACEURL
;	TokenNameSEMICOLON	
methName	TokenNameIdentifier	 meth Name
=	TokenNameEQUAL	
fullName	TokenNameIdentifier	 full Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fullName	TokenNameIdentifier	 full Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
return	TokenNamereturn	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_FALSE	TokenNameIdentifier	 S  FALSE
;	TokenNameSEMICOLON	
methName	TokenNameIdentifier	 meth Name
=	TokenNameEQUAL	
fullName	TokenNameIdentifier	 full Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_XSLNAMESPACEURL	TokenNameIdentifier	 S  XSLNAMESPACEURL
)	TokenNameRPAREN	
||	TokenNameOR_OR	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_BUILTIN_EXTENSIONS_URL	TokenNameIdentifier	 S  BUILTIN  EXTENSIONS  URL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getOwnerObject	TokenNameIdentifier	 get Owner Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAvailableElements	TokenNameIdentifier	 get Available Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
methName	TokenNameIdentifier	 meth Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_TRUE	TokenNameIdentifier	 S  TRUE
:	TokenNameCOLON	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_FALSE	TokenNameIdentifier	 S  FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_FALSE	TokenNameIdentifier	 S  FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//dml 	TokenNameCOMMENT_LINE	dml 
ExtensionsProvider	TokenNameIdentifier	 Extensions Provider
extProvider	TokenNameIdentifier	 ext Provider
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionsProvider	TokenNameIdentifier	 Extensions Provider
)	TokenNameRPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getOwnerObject	TokenNameIdentifier	 get Owner Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
extProvider	TokenNameIdentifier	 ext Provider
.	TokenNameDOT	
elementAvailable	TokenNameIdentifier	 element Available
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
methName	TokenNameIdentifier	 meth Name
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_TRUE	TokenNameIdentifier	 S  TRUE
:	TokenNameCOLON	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_FALSE	TokenNameIdentifier	 S  FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
