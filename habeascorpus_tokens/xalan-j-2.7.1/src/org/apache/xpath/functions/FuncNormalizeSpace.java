/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FuncNormalizeSpace.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FuncNormalizeSpace.java 468655 2006-10-28 07:12:06Z minchau $ 
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
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
XMLString	TokenNameIdentifier	 XML String
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XString	TokenNameIdentifier	 X String
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
/** * Execute the normalize-space() function. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Execute the normalize-space() function. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
FuncNormalizeSpace	TokenNameIdentifier	 Func Normalize Space
extends	TokenNameextends	
FunctionDef1Arg	TokenNameIdentifier	 Function Def1 Arg
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
3377956872032190880L	TokenNameLongLiteral	
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
XMLString	TokenNameIdentifier	 XML String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
getArg0AsString	TokenNameIdentifier	 get Arg0 As String
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
XString	TokenNameIdentifier	 X String
)	TokenNameRPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
fixWhiteSpace	TokenNameIdentifier	 fix White Space
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute an expression in the XPath runtime context, and return the * result of the expression. * * * @param xctxt The XPath runtime context. * * @return The result of the expression in the form of a <code>XObject</code>. * * @throws javax.xml.transform.TransformerException if a runtime exception * occurs. */	TokenNameCOMMENT_JAVADOC	 Execute an expression in the XPath runtime context, and return the result of the expression. * @param xctxt The XPath runtime context. * @return The result of the expression in the form of a <code>XObject</code>. * @throws javax.xml.transform.TransformerException if a runtime exception occurs. 
public	TokenNamepublic	
void	TokenNamevoid	
executeCharsToContentHandler	TokenNameIdentifier	 execute Chars To Content Handler
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Arg0IsNodesetExpr	TokenNameIdentifier	 Arg0 Is Nodeset Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getArg0AsNode	TokenNameIdentifier	 get Arg0 As Node
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
