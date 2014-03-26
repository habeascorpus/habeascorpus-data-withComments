/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XUnresolvedVariableSimple.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XUnresolvedVariableSimple.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
Expression	TokenNameIdentifier	 Expression
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
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * This is the same as XUnresolvedVariable, but it assumes that the * context is already set up. For use with psuedo variables. * Also, it holds an Expression object, instead of an ElemVariable. * It must only hold static context, since a single copy will be * held in the template. */	TokenNameCOMMENT_JAVADOC	 This is the same as XUnresolvedVariable, but it assumes that the context is already set up. For use with psuedo variables. Also, it holds an Expression object, instead of an ElemVariable. It must only hold static context, since a single copy will be held in the template. 
public	TokenNamepublic	
class	TokenNameclass	
XUnresolvedVariableSimple	TokenNameIdentifier	 X Unresolved Variable Simple
extends	TokenNameextends	
XObject	TokenNameIdentifier	 X Object
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1224413807443958985L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XUnresolvedVariableSimple	TokenNameIdentifier	 X Unresolved Variable Simple
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For support of literal objects in xpaths. * * @param xctxt The XPath execution context. * * @return This object. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 For support of literal objects in xpaths. * @param xctxt The XPath execution context. * @return This object. * @throws javax.xml.transform.TransformerException 
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
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
.	TokenNameDOT	
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell what kind of class this is. * * @return CLASS_UNRESOLVEDVARIABLE */	TokenNameCOMMENT_JAVADOC	 Tell what kind of class this is. * @return CLASS_UNRESOLVEDVARIABLE 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CLASS_UNRESOLVEDVARIABLE	TokenNameIdentifier	 CLASS  UNRESOLVEDVARIABLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a request type, return the equivalent string. * For diagnostic purposes. * * @return An informational string. */	TokenNameCOMMENT_JAVADOC	 Given a request type, return the equivalent string. For diagnostic purposes. * @return An informational string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"XUnresolvedVariableSimple ("	TokenNameStringLiteral	XUnresolvedVariableSimple (
+	TokenNamePLUS	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
