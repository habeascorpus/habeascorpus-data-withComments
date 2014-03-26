/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTVisitor.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTVisitor.java 468643 2006-10-28 06:56:03Z minchau $ 
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
XPathVisitor	TokenNameIdentifier	 X Path Visitor
;	TokenNameSEMICOLON	
/** * A derivation from this class can be passed to a class that implements * the XSLTVisitable interface, to have the appropriate method called * for each component of an XSLT stylesheet. Aside from possible other uses, * the main intention is to provide a reasonable means to perform expression * rewriting. */	TokenNameCOMMENT_JAVADOC	 A derivation from this class can be passed to a class that implements the XSLTVisitable interface, to have the appropriate method called for each component of an XSLT stylesheet. Aside from possible other uses, the main intention is to provide a reasonable means to perform expression rewriting. 
public	TokenNamepublic	
class	TokenNameclass	
XSLTVisitor	TokenNameIdentifier	 XSLT Visitor
extends	TokenNameextends	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
{	TokenNameLBRACE	
/** * Visit an XSLT instruction. Any element that isn't called by one * of the other visit methods, will be called by this method. * * @param elem The xsl instruction element object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit an XSLT instruction. Any element that isn't called by one of the other visit methods, will be called by this method. * @param elem The xsl instruction element object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitInstruction	TokenNameIdentifier	 visit Instruction
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit an XSLT stylesheet instruction. * * @param elem The xsl instruction element object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit an XSLT stylesheet instruction. * @param elem The xsl instruction element object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitStylesheet	TokenNameIdentifier	 visit Stylesheet
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit an XSLT top-level instruction. * * @param elem The xsl instruction element object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit an XSLT top-level instruction. * @param elem The xsl instruction element object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit an XSLT top-level instruction. * * @param elem The xsl instruction element object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit an XSLT top-level instruction. * @param elem The xsl instruction element object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitTopLevelVariableOrParamDecl	TokenNameIdentifier	 visit Top Level Variable Or Param Decl
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit an XSLT variable or parameter declaration. * * @param elem The xsl instruction element object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit an XSLT variable or parameter declaration. * @param elem The xsl instruction element object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitVariableOrParamDecl	TokenNameIdentifier	 visit Variable Or Param Decl
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a LiteralResultElement. * * @param elem The literal result object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a LiteralResultElement. * @param elem The literal result object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitLiteralResultElement	TokenNameIdentifier	 visit Literal Result Element
(	TokenNameLPAREN	
ElemLiteralResult	TokenNameIdentifier	 Elem Literal Result
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit an Attribute Value Template (at the top level). * * @param elem The attribute value template object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit an Attribute Value Template (at the top level). * @param elem The attribute value template object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitAVT	TokenNameIdentifier	 visit AVT
(	TokenNameLPAREN	
AVT	TokenNameIdentifier	 AVT
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit an extension element. * @param elem The extension object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit an extension element. @param elem The extension object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitExtensionElement	TokenNameIdentifier	 visit Extension Element
(	TokenNameLPAREN	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
