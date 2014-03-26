/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ErrorMessages_hu.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ErrorMessages_hu.java 468649 2006-10-28 07:00:55Z minchau $ 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
;	TokenNameSEMICOLON	
/** * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen 
public	TokenNamepublic	
class	TokenNameclass	
ErrorMessages_hu	TokenNameIdentifier	 Error Messages hu
extends	TokenNameextends	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
{	TokenNameLBRACE	
/* * XSLTC compile-time error messages. * * General notes to translators and definitions: * * 1) XSLTC is the name of the product. It is an acronym for "XSLT Compiler". * XSLT is an acronym for "XML Stylesheet Language: Transformations". * * 2) A stylesheet is a description of how to transform an input XML document * into a resultant XML document (or HTML document or text). The * stylesheet itself is described in the form of an XML document. * * 3) A template is a component of a stylesheet that is used to match a * particular portion of an input document and specifies the form of the * corresponding portion of the output document. * * 4) An axis is a particular "dimension" in a tree representation of an XML * document; the nodes in the tree are divided along different axes. * Traversing the "child" axis, for instance, means that the program * would visit each child of a particular node; traversing the "descendant" * axis means that the program would visit the child nodes of a particular * node, their children, and so on until the leaf nodes of the tree are * reached. * * 5) An iterator is an object that traverses nodes in a tree along a * particular axis, one at a time. * * 6) An element is a mark-up tag in an XML document; an attribute is a * modifier on the tag. For example, in <elem attr='val' attr2='val2'> * "elem" is an element name, "attr" and "attr2" are attribute names with * the values "val" and "val2", respectively. * * 7) A namespace declaration is a special attribute that is used to associate * a prefix with a URI (the namespace). The meanings of element names and * attribute names that use that prefix are defined with respect to that * namespace. * * 8) DOM is an acronym for Document Object Model. It is a tree * representation of an XML document. * * SAX is an acronym for the Simple API for XML processing. It is an API * used inform an XML processor (in this case XSLTC) of the structure and * content of an XML document. * * Input to the stylesheet processor can come from an XML parser in the * form of a DOM tree or through the SAX API. * * 9) DTD is a document type declaration. It is a way of specifying the * grammar for an XML file, the names and types of elements, attributes, * etc. * * 10) XPath is a specification that describes a notation for identifying * nodes in a tree-structured representation of an XML document. An * instance of that notation is referred to as an XPath expression. * * 11) Translet is an invented term that refers to the class file that contains * the compiled form of a stylesheet. */	TokenNameCOMMENT_BLOCK	 XSLTC compile-time error messages. * General notes to translators and definitions: * 1) XSLTC is the name of the product. It is an acronym for "XSLT Compiler". XSLT is an acronym for "XML Stylesheet Language: Transformations". * 2) A stylesheet is a description of how to transform an input XML document into a resultant XML document (or HTML document or text). The stylesheet itself is described in the form of an XML document. * 3) A template is a component of a stylesheet that is used to match a particular portion of an input document and specifies the form of the corresponding portion of the output document. * 4) An axis is a particular "dimension" in a tree representation of an XML document; the nodes in the tree are divided along different axes. Traversing the "child" axis, for instance, means that the program would visit each child of a particular node; traversing the "descendant" axis means that the program would visit the child nodes of a particular node, their children, and so on until the leaf nodes of the tree are reached. * 5) An iterator is an object that traverses nodes in a tree along a particular axis, one at a time. * 6) An element is a mark-up tag in an XML document; an attribute is a modifier on the tag. For example, in <elem attr='val' attr2='val2'> "elem" is an element name, "attr" and "attr2" are attribute names with the values "val" and "val2", respectively. * 7) A namespace declaration is a special attribute that is used to associate a prefix with a URI (the namespace). The meanings of element names and attribute names that use that prefix are defined with respect to that namespace. * 8) DOM is an acronym for Document Object Model. It is a tree representation of an XML document. * SAX is an acronym for the Simple API for XML processing. It is an API used inform an XML processor (in this case XSLTC) of the structure and content of an XML document. * Input to the stylesheet processor can come from an XML parser in the form of a DOM tree or through the SAX API. * 9) DTD is a document type declaration. It is a way of specifying the grammar for an XML file, the names and types of elements, attributes, etc. * 10) XPath is a specification that describes a notation for identifying nodes in a tree-structured representation of an XML document. An instance of that notation is referred to as an XPath expression. * 11) Translet is an invented term that refers to the class file that contains the compiled form of a stylesheet. 
// These message should be read from a locale-specific resource bundle 	TokenNameCOMMENT_LINE	These message should be read from a locale-specific resource bundle 
/** Get the lookup table for error messages. * * @return The message lookup table. */	TokenNameCOMMENT_JAVADOC	 Get the lookup table for error messages. * @return The message lookup table. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getContents	TokenNameIdentifier	 get Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MULTIPLE_STYLESHEET_ERR	TokenNameIdentifier	 MULTIPLE  STYLESHEET  ERR
,	TokenNameCOMMA	
"Egyn�l t�bb st�luslap van meghat�rozva ugyanabban a f�jlban."	TokenNameStringLiteral	Egyn�l t�bb st�luslap van meghat�rozva ugyanabban a f�jlban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a * template. The same name was used on two different templates in the * same stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a template. The same name was used on two different templates in the same stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TEMPLATE_REDEF_ERR	TokenNameIdentifier	 TEMPLATE  REDEF  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' sablon m�r meg van hat�rozva ebben a st�luslapban."	TokenNameStringLiteral	A(z) ''{0}'' sablon m�r meg van hat�rozva ebben a st�luslapban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a * template. A reference to the template name was encountered, but the * template is undefined. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a template. A reference to the template name was encountered, but the template is undefined. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TEMPLATE_UNDEF_ERR	TokenNameIdentifier	 TEMPLATE  UNDEF  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' sablon nincs meghat�rozva ebben a st�luslapban."	TokenNameStringLiteral	A(z) ''{0}'' sablon nincs meghat�rozva ebben a st�luslapban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a variable * that was defined more than once. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a variable that was defined more than once. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
VARIABLE_REDEF_ERR	TokenNameIdentifier	 VARIABLE  REDEF  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' v�ltoz� t�bbsz�r van meghat�rozva ugyanabban a hat�k�rben."	TokenNameStringLiteral	A(z) ''{0}'' v�ltoz� t�bbsz�r van meghat�rozva ugyanabban a hat�k�rben.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a variable * or parameter. A reference to the variable or parameter was found, * but it was never defined. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a variable or parameter. A reference to the variable or parameter was found, but it was never defined. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
VARIABLE_UNDEF_ERR	TokenNameIdentifier	 VARIABLE  UNDEF  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' v�ltoz� vagy param�ter nincs meghat�rozva."	TokenNameStringLiteral	A(z) ''{0}'' v�ltoz� vagy param�ter nincs meghat�rozva.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The word "class" here refers to a Java class. * Processing the stylesheet required a class to be loaded, but it could * not be found. The substitution text is the name of the class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The word "class" here refers to a Java class. Processing the stylesheet required a class to be loaded, but it could not be found. The substitution text is the name of the class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CLASS_NOT_FOUND_ERR	TokenNameIdentifier	 CLASS  NOT  FOUND  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' oszt�ly nem tal�lhat�."	TokenNameStringLiteral	A(z) ''{0}'' oszt�ly nem tal�lhat�.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The word "method" here refers to a Java method. * Processing the stylesheet required a reference to the method named by * the substitution text, but it could not be found. "public" is the * Java keyword. */	TokenNameCOMMENT_BLOCK	 Note to translators: The word "method" here refers to a Java method. Processing the stylesheet required a reference to the method named by the substitution text, but it could not be found. "public" is the Java keyword. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
METHOD_NOT_FOUND_ERR	TokenNameIdentifier	 METHOD  NOT  FOUND  ERR
,	TokenNameCOMMA	
"Nem tal�lhat� a(z) ''{0}'' k�ls? met�dus (nyilv�nosnak kell lennie)."	TokenNameStringLiteral	Nem tal�lhat� a(z) ''{0}'' k�ls? met�dus (nyilv�nosnak kell lennie).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The word "method" here refers to a Java method. * Processing the stylesheet required a reference to the method named by * the substitution text, but no method with the required types of * arguments or return type could be found. */	TokenNameCOMMENT_BLOCK	 Note to translators: The word "method" here refers to a Java method. Processing the stylesheet required a reference to the method named by the substitution text, but no method with the required types of arguments or return type could be found. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ARGUMENT_CONVERSION_ERR	TokenNameIdentifier	 ARGUMENT  CONVERSION  ERR
,	TokenNameCOMMA	
"Nem lehet �talak�tani az argumentum/visszat�r�si t�pust a(z) ''{0}'' met�dus h�v�s�ban."	TokenNameStringLiteral	Nem lehet �talak�tani az argumentum/visszat�r�si t�pust a(z) ''{0}'' met�dus h�v�s�ban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The file or URI named in the substitution text * is missing. */	TokenNameCOMMENT_BLOCK	 Note to translators: The file or URI named in the substitution text is missing. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FILE_NOT_FOUND_ERR	TokenNameIdentifier	 FILE  NOT  FOUND  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' f�jl vagy URI nem tal�lhat�."	TokenNameStringLiteral	A(z) ''{0}'' f�jl vagy URI nem tal�lhat�.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is displayed when the URI * mentioned in the substitution text is not well-formed syntactically. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is displayed when the URI mentioned in the substitution text is not well-formed syntactically. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_URI_ERR	TokenNameIdentifier	 INVALID  URI  ERR
,	TokenNameCOMMA	
"�rv�nytelen URI: ''{0}''."	TokenNameStringLiteral	�rv�nytelen URI: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The file or URI named in the substitution text * exists but could not be opened. */	TokenNameCOMMENT_BLOCK	 Note to translators: The file or URI named in the substitution text exists but could not be opened. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FILE_ACCESS_ERR	TokenNameIdentifier	 FILE  ACCESS  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' f�jlt vagy URI nem nyithat� meg. "	TokenNameStringLiteral	A(z) ''{0}'' f�jlt vagy URI nem nyithat� meg. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: <xsl:stylesheet> and <xsl:transform> are * keywords that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: <xsl:stylesheet> and <xsl:transform> are keywords that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_ROOT_ERR	TokenNameIdentifier	 MISSING  ROOT  ERR
,	TokenNameCOMMA	
"Hi�nyzik az <xsl:stylesheet> vagy <xsl:transform> elem."	TokenNameStringLiteral	Hi�nyzik az <xsl:stylesheet> vagy <xsl:transform> elem.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained a reference to a * namespace prefix that was undefined. The value of the substitution * text is the name of the prefix. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained a reference to a namespace prefix that was undefined. The value of the substitution text is the name of the prefix. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NAMESPACE_UNDEF_ERR	TokenNameIdentifier	 NAMESPACE  UNDEF  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' n�vt�r el?tag nincs deklar�lva."	TokenNameStringLiteral	A(z) ''{0}'' n�vt�r el?tag nincs deklar�lva.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The Java function named in the stylesheet could * not be found. */	TokenNameCOMMENT_BLOCK	 Note to translators: The Java function named in the stylesheet could not be found. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FUNCTION_RESOLVE_ERR	TokenNameIdentifier	 FUNCTION  RESOLVE  ERR
,	TokenNameCOMMA	
"Nem lehet feloldani a(z) ''{0}'' f�ggv�ny h�v�s�t."	TokenNameStringLiteral	Nem lehet feloldani a(z) ''{0}'' f�ggv�ny h�v�s�t.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a * function. A literal string here means a constant string value. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a function. A literal string here means a constant string value. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NEED_LITERAL_ERR	TokenNameIdentifier	 NEED  LITERAL  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' argumentum�nak egy liter�l karaktersorozatnak kell lennie."	TokenNameStringLiteral	A(z) ''{0}'' argumentum�nak egy liter�l karaktersorozatnak kell lennie.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message indicates there was a syntactic * error in the form of an XPath expression. The substitution text is * the expression. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message indicates there was a syntactic error in the form of an XPath expression. The substitution text is the expression. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XPATH_PARSER_ERR	TokenNameIdentifier	 XPATH  PARSER  ERR
,	TokenNameCOMMA	
"Hiba t�rt�nt a(z) ''{0}'' XPath kifejez�s �rtelmez�sekor."	TokenNameStringLiteral	Hiba t�rt�nt a(z) ''{0}'' XPath kifejez�s �rtelmez�sekor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An element in the stylesheet requires a * particular attribute named by the substitution text, but that * attribute was not specified in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: An element in the stylesheet requires a particular attribute named by the substitution text, but that attribute was not specified in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
REQUIRED_ATTR_ERR	TokenNameIdentifier	 REQUIRED  ATTR  ERR
,	TokenNameCOMMA	
"Hi�nyzik a(z) ''{0}'' k�telez? attrib�tum."	TokenNameStringLiteral	Hi�nyzik a(z) ''{0}'' k�telez? attrib�tum.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message indicates that a character not * permitted in an XPath expression was encountered. The substitution * text is the offending character. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message indicates that a character not permitted in an XPath expression was encountered. The substitution text is the offending character. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CHAR_ERR	TokenNameIdentifier	 ILLEGAL  CHAR  ERR
,	TokenNameCOMMA	
"Nem megengedett karakter (''{0}'') szerepel az XPath kifejez�sben."	TokenNameStringLiteral	Nem megengedett karakter (''{0}'') szerepel az XPath kifejez�sben.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: A processing instruction is a mark-up item in * an XML document that request some behaviour of an XML processor. The * form of the name of was invalid in this case, and the substitution * text is the name. */	TokenNameCOMMENT_BLOCK	 Note to translators: A processing instruction is a mark-up item in an XML document that request some behaviour of an XML processor. The form of the name of was invalid in this case, and the substitution text is the name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_PI_ERR	TokenNameIdentifier	 ILLEGAL  PI  ERR
,	TokenNameCOMMA	
"Nem megengedett n�v (''{0}'') szerepel a feldolgoz�si utas�t�sban."	TokenNameStringLiteral	Nem megengedett n�v (''{0}'') szerepel a feldolgoz�si utas�t�sban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is reported if the stylesheet * being processed attempted to construct an XML document with an * attribute in a place other than on an element. The substitution text * specifies the name of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is reported if the stylesheet being processed attempted to construct an XML document with an attribute in a place other than on an element. The substitution text specifies the name of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier	 STRAY  ATTRIBUTE  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' attrib�tum k�v�l esik az elemen."	TokenNameStringLiteral	A(z) ''{0}'' attrib�tum k�v�l esik az elemen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute that wasn't recognized was * specified on an element in the stylesheet. The attribute is named * by the substitution * text. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute that wasn't recognized was specified on an element in the stylesheet. The attribute is named by the substitution text. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ATTRIBUTE_ERR	TokenNameIdentifier	 ILLEGAL  ATTRIBUTE  ERR
,	TokenNameCOMMA	
"Illeg�lis attrib�tum: ''{0}''."	TokenNameStringLiteral	Illeg�lis attrib�tum: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "import" and "include" are keywords that should * not be translated. This messages indicates that the stylesheet * named in the substitution text imported or included itself either * directly or indirectly. */	TokenNameCOMMENT_BLOCK	 Note to translators: "import" and "include" are keywords that should not be translated. This messages indicates that the stylesheet named in the substitution text imported or included itself either directly or indirectly. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CIRCULAR_INCLUDE_ERR	TokenNameIdentifier	 CIRCULAR  INCLUDE  ERR
,	TokenNameCOMMA	
"K�rk�r�s import�l�s/tartalmaz�s. A(z) ''{0}'' st�luslap m�r be van t�ltve."	TokenNameStringLiteral	K�rk�r�s import�l�s/tartalmaz�s. A(z) ''{0}'' st�luslap m�r be van t�ltve.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: A result-tree fragment is a portion of a * resulting XML document represented as a tree. "<xsl:sort>" is a * keyword and should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: A result-tree fragment is a portion of a resulting XML document represented as a tree. "<xsl:sort>" is a keyword and should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
RESULT_TREE_SORT_ERR	TokenNameIdentifier	 RESULT  TREE  SORT  ERR
,	TokenNameCOMMA	
"Az eredm�nyfa-r�szleteket nem lehet rendezni (az <xsl:sort> elemek figyelmen k�v�l maradnak). Rendeznie kell a node-okat, amikor eredm�nyf�t hoz l�tre."	TokenNameStringLiteral	Az eredm�nyfa-r�szleteket nem lehet rendezni (az <xsl:sort> elemek figyelmen k�v�l maradnak). Rendeznie kell a node-okat, amikor eredm�nyf�t hoz l�tre.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: A name can be given to a particular style to be * used to format decimal values. The substitution text gives the name * of such a style for which more than one declaration was encountered. */	TokenNameCOMMENT_BLOCK	 Note to translators: A name can be given to a particular style to be used to format decimal values. The substitution text gives the name of such a style for which more than one declaration was encountered. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SYMBOLS_REDEF_ERR	TokenNameIdentifier	 SYMBOLS  REDEF  ERR
,	TokenNameCOMMA	
"M�r defini�lva van a(z) ''{0}'' decim�lis form�z�s."	TokenNameStringLiteral	M�r defini�lva van a(z) ''{0}'' decim�lis form�z�s.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet version named in the * substitution text is not supported. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet version named in the substitution text is not supported. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XSL_VERSION_ERR	TokenNameIdentifier	 XSL  VERSION  ERR
,	TokenNameCOMMA	
"Az XSLTC nem t�mogatja a(z) ''{0}'' XSL verzi�t."	TokenNameStringLiteral	Az XSLTC nem t�mogatja a(z) ''{0}'' XSL verzi�t.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The definitions of one or more variables or * parameters depend on one another. */	TokenNameCOMMENT_BLOCK	 Note to translators: The definitions of one or more variables or parameters depend on one another. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier	 CIRCULAR  VARIABLE  ERR
,	TokenNameCOMMA	
"K�rk�r�s v�ltoz�/param�ter hivatkoz�s a(z) ''{0}'' helyen."	TokenNameStringLiteral	K�rk�r�s v�ltoz�/param�ter hivatkoz�s a(z) ''{0}'' helyen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The operator in an expresion with two operands was * not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The operator in an expresion with two operands was not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier	 ILLEGAL  BINARY  OP  ERR
,	TokenNameCOMMA	
"Ismeretlen oper�tort haszn�lt a bin�ris kifejez�sben."	TokenNameStringLiteral	Ismeretlen oper�tort haszn�lt a bin�ris kifejez�sben.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is produced if a reference to a * function has too many or too few arguments. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is produced if a reference to a function has too many or too few arguments. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ARG_ERR	TokenNameIdentifier	 ILLEGAL  ARG  ERR
,	TokenNameCOMMA	
"Nem megengedett argumentumo(ka)t haszn�lt a f�ggv�nyh�v�sban."	TokenNameStringLiteral	Nem megengedett argumentumo(ka)t haszn�lt a f�ggv�nyh�v�sban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "document()" is the name of function and must * not be translated. A node-set is a set of the nodes in the tree * representation of an XML document. */	TokenNameCOMMENT_BLOCK	 Note to translators: "document()" is the name of function and must not be translated. A node-set is a set of the nodes in the tree representation of an XML document. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
DOCUMENT_ARG_ERR	TokenNameIdentifier	 DOCUMENT  ARG  ERR
,	TokenNameCOMMA	
"A document() f�ggv�ny m�sodik argumentuma egy node-k�szlet kell legyen."	TokenNameStringLiteral	A document() f�ggv�ny m�sodik argumentuma egy node-k�szlet kell legyen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords * and should not be translated. This message describes a syntax error * in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_WHEN_ERR	TokenNameIdentifier	 MISSING  WHEN  ERR
,	TokenNameCOMMA	
"Legal�bb egy <xsl:when> elem sz�ks�ges az <xsl:choose>-ban."	TokenNameStringLiteral	Legal�bb egy <xsl:when> elem sz�ks�ges az <xsl:choose>-ban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are * keywords and should not be translated. This message describes a * syntax error in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MULTIPLE_OTHERWISE_ERR	TokenNameIdentifier	 MULTIPLE  OTHERWISE  ERR
,	TokenNameCOMMA	
"Csak egy <xsl:otherwise> elem megengedett <xsl:choose>-ban."	TokenNameStringLiteral	Csak egy <xsl:otherwise> elem megengedett <xsl:choose>-ban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are * keywords and should not be translated. This message describes a * syntax error in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_OTHERWISE_ERR	TokenNameIdentifier	 STRAY  OTHERWISE  ERR
,	TokenNameCOMMA	
"Az <xsl:otherwise> csak <xsl:choose>-on bel�l haszn�lhat�."	TokenNameStringLiteral	Az <xsl:otherwise> csak <xsl:choose>-on bel�l haszn�lhat�.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords * and should not be translated. This message describes a syntax error * in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_WHEN_ERR	TokenNameIdentifier	 STRAY  WHEN  ERR
,	TokenNameCOMMA	
"Az <xsl:when> csak <xsl:choose>-on bel�l haszn�lhat�."	TokenNameStringLiteral	Az <xsl:when> csak <xsl:choose>-on bel�l haszn�lhat�.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:when>", "<xsl:otherwise>" and * "<xsl:choose>" are keywords and should not be translated. This * message describes a syntax error in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:when>", "<xsl:otherwise>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WHEN_ELEMENT_ERR	TokenNameIdentifier	 WHEN  ELEMENT  ERR
,	TokenNameCOMMA	
"Csak <xsl:when> �s <xsl:otherwise> elemek megengedettek az <xsl:choose>-ban."	TokenNameStringLiteral	Csak <xsl:when> �s <xsl:otherwise> elemek megengedettek az <xsl:choose>-ban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:attribute-set>" and "name" are keywords * that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:attribute-set>" and "name" are keywords that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNNAMED_ATTRIBSET_ERR	TokenNameIdentifier	 UNNAMED  ATTRIBSET  ERR
,	TokenNameCOMMA	
"Hi�nyzik az <xsl:attribute-set>-b?l a 'name' attrib�tum."	TokenNameStringLiteral	Hi�nyzik az <xsl:attribute-set>-b?l a 'name' attrib�tum.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An element in the stylesheet contained an * element of a type that it was not permitted to contain. */	TokenNameCOMMENT_BLOCK	 Note to translators: An element in the stylesheet contained an element of a type that it was not permitted to contain. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CHILD_ERR	TokenNameIdentifier	 ILLEGAL  CHILD  ERR
,	TokenNameCOMMA	
"Nem megengedett gyermek elem."	TokenNameStringLiteral	Nem megengedett gyermek elem.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet tried to create an element with * a name that was not a valid XML name. The substitution text contains * the name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet tried to create an element with a name that was not a valid XML name. The substitution text contains the name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ELEM_NAME_ERR	TokenNameIdentifier	 ILLEGAL  ELEM  NAME  ERR
,	TokenNameCOMMA	
"Az elem neve nem lehet ''{0}''."	TokenNameStringLiteral	Az elem neve nem lehet ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet tried to create an attribute * with a name that was not a valid XML name. The substitution text * contains the name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet tried to create an attribute with a name that was not a valid XML name. The substitution text contains the name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ATTR_NAME_ERR	TokenNameIdentifier	 ILLEGAL  ATTR  NAME  ERR
,	TokenNameCOMMA	
"Az attrib�tum neve nem lehet ''{0}''."	TokenNameStringLiteral	Az attrib�tum neve nem lehet ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The children of the outermost element of a * stylesheet are referred to as top-level elements. No text should * occur within that outermost element unless it is within a top-level * element. This message indicates that that constraint was violated. * "<xsl:stylesheet>" is a keyword that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: The children of the outermost element of a stylesheet are referred to as top-level elements. No text should occur within that outermost element unless it is within a top-level element. This message indicates that that constraint was violated. "<xsl:stylesheet>" is a keyword that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_TEXT_NODE_ERR	TokenNameIdentifier	 ILLEGAL  TEXT  NODE  ERR
,	TokenNameCOMMA	
"Sz�vegadat szerepel a fels? szint? <xsl:stylesheet> elemen k�v�l."	TokenNameStringLiteral	Sz�vegadat szerepel a fels? szint? <xsl:stylesheet> elemen k�v�l.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: JAXP is an acronym for the Java API for XML * Processing. This message indicates that the XML parser provided to * XSLTC to process the XML input document had a configuration problem. */	TokenNameCOMMENT_BLOCK	 Note to translators: JAXP is an acronym for the Java API for XML Processing. This message indicates that the XML parser provided to XSLTC to process the XML input document had a configuration problem. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SAX_PARSER_CONFIG_ERR	TokenNameIdentifier	 SAX  PARSER  CONFIG  ERR
,	TokenNameCOMMA	
"Nincs megfelel?en konfigur�lva a JAXP �rtelmez?."	TokenNameStringLiteral	Nincs megfelel?en konfigur�lva a JAXP �rtelmez?.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text names the internal error * encountered. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text names the internal error encountered. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INTERNAL_ERR	TokenNameIdentifier	 INTERNAL  ERR
,	TokenNameCOMMA	
"Helyrehozhatatlan bels? XSLTC hiba t�rt�nt: ''{0}'' "	TokenNameStringLiteral	Helyrehozhatatlan bels? XSLTC hiba t�rt�nt: ''{0}'' 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained an element that was * not recognized as part of the XSL syntax. The substitution text * gives the element name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained an element that was not recognized as part of the XSL syntax. The substitution text gives the element name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_XSL_ERR	TokenNameIdentifier	 UNSUPPORTED  XSL  ERR
,	TokenNameCOMMA	
"Nem t�mogatott XSL elem: ''{0}''."	TokenNameStringLiteral	Nem t�mogatott XSL elem: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet referred to an extension to the * XSL syntax and indicated that it was defined by XSLTC, but XSTLC does * not recognized the particular extension named. The substitution text * gives the extension name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet referred to an extension to the XSL syntax and indicated that it was defined by XSLTC, but XSTLC does not recognized the particular extension named. The substitution text gives the extension name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_EXT_ERR	TokenNameIdentifier	 UNSUPPORTED  EXT  ERR
,	TokenNameCOMMA	
"Ismeretlen XSLTC kiterjeszt�s: ''{0}''."	TokenNameStringLiteral	Ismeretlen XSLTC kiterjeszt�s: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The XML document given to XSLTC as a stylesheet * was not, in fact, a stylesheet. XSLTC is able to detect that in this * case because the outermost element in the stylesheet has to be * declared with respect to the XSL namespace URI, but no declaration * for that namespace was seen. */	TokenNameCOMMENT_BLOCK	 Note to translators: The XML document given to XSLTC as a stylesheet was not, in fact, a stylesheet. XSLTC is able to detect that in this case because the outermost element in the stylesheet has to be declared with respect to the XSL namespace URI, but no declaration for that namespace was seen. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_XSLT_URI_ERR	TokenNameIdentifier	 MISSING  XSLT  URI  ERR
,	TokenNameCOMMA	
"A bemen? dokumentum nem st�luslap (az XSL n�vt�r nincs deklar�lva a root elemben)."	TokenNameStringLiteral	A bemen? dokumentum nem st�luslap (az XSL n�vt�r nincs deklar�lva a root elemben).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: XSLTC could not find the stylesheet document * with the name specified by the substitution text. */	TokenNameCOMMENT_BLOCK	 Note to translators: XSLTC could not find the stylesheet document with the name specified by the substitution text. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_XSLT_TARGET_ERR	TokenNameIdentifier	 MISSING  XSLT  TARGET  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' st�luslap c�l nem tal�lhat�."	TokenNameStringLiteral	A(z) ''{0}'' st�luslap c�l nem tal�lhat�.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message represents an internal error in * condition in XSLTC. The substitution text is the class name in XSLTC * that is missing some functionality. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message represents an internal error in condition in XSLTC. The substitution text is the class name in XSLTC that is missing some functionality. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NOT_IMPLEMENTED_ERR	TokenNameIdentifier	 NOT  IMPLEMENTED  ERR
,	TokenNameCOMMA	
"Nincs megval�s�tva: ''{0}''."	TokenNameStringLiteral	Nincs megval�s�tva: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The XML document given to XSLTC as a stylesheet * was not, in fact, a stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: The XML document given to XSLTC as a stylesheet was not, in fact, a stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NOT_STYLESHEET_ERR	TokenNameIdentifier	 NOT  STYLESHEET  ERR
,	TokenNameCOMMA	
"A bemen? dokumentum nem tartalmaz XSL st�luslapot."	TokenNameStringLiteral	A bemen? dokumentum nem tartalmaz XSL st�luslapot.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The element named in the substitution text was * encountered in the stylesheet but is not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The element named in the substitution text was encountered in the stylesheet but is not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ELEMENT_PARSE_ERR	TokenNameIdentifier	 ELEMENT  PARSE  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' elem nem �rtelmezhet?. "	TokenNameStringLiteral	A(z) ''{0}'' elem nem �rtelmezhet?. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "use", "<key>", "node", "node-set", "string" * and "number" are keywords in this context and should not be * translated. This message indicates that the value of the "use" * attribute was not one of the permitted values. */	TokenNameCOMMENT_BLOCK	 Note to translators: "use", "<key>", "node", "node-set", "string" and "number" are keywords in this context and should not be translated. This message indicates that the value of the "use" attribute was not one of the permitted values. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
KEY_USE_ATTR_ERR	TokenNameIdentifier	 KEY  USE  ATTR  ERR
,	TokenNameCOMMA	
"A(z) <key> attrib�tuma node, node-k�szlet, sz�veg vagy sz�m lehet."	TokenNameStringLiteral	A(z) <key> attrib�tuma node, node-k�szlet, sz�veg vagy sz�m lehet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An XML document can specify the version of the * XML specification to which it adheres. This message indicates that * the version specified for the output document was not valid. */	TokenNameCOMMENT_BLOCK	 Note to translators: An XML document can specify the version of the XML specification to which it adheres. This message indicates that the version specified for the output document was not valid. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
OUTPUT_VERSION_ERR	TokenNameIdentifier	 OUTPUT  VERSION  ERR
,	TokenNameCOMMA	
"A kimen? XML dokumentum-verzi� 1.0 kell legyen."	TokenNameStringLiteral	A kimen? XML dokumentum-verzi� 1.0 kell legyen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The operator in a comparison operation was * not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The operator in a comparison operation was not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_RELAT_OP_ERR	TokenNameIdentifier	 ILLEGAL  RELAT  OP  ERR
,	TokenNameCOMMA	
"Ismeretlen oper�tort haszn�lt a rel�ci�s kifejez�sben."	TokenNameStringLiteral	Ismeretlen oper�tort haszn�lt a rel�ci�s kifejez�sben.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute set defines as a set of XML * attributes that can be added to an element in the output XML document * as a group. This message is reported if the name specified was not * used to declare an attribute set. The substitution text is the name * that is in error. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute set defines as a set of XML attributes that can be added to an element in the output XML document as a group. This message is reported if the name specified was not used to declare an attribute set. The substitution text is the name that is in error. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ATTRIBSET_UNDEF_ERR	TokenNameIdentifier	 ATTRIBSET  UNDEF  ERR
,	TokenNameCOMMA	
"Neml�tez? attrib�tumk�szletet (''{0}'') pr�b�lt haszn�lni."	TokenNameStringLiteral	Neml�tez? attrib�tumk�szletet (''{0}'') pr�b�lt haszn�lni.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The term "attribute value template" is a term * defined by XSLT which describes the value of an attribute that is * determined by an XPath expression. The message indicates that the * expression was syntactically incorrect; the substitution text * contains the expression that was in error. */	TokenNameCOMMENT_BLOCK	 Note to translators: The term "attribute value template" is a term defined by XSLT which describes the value of an attribute that is determined by an XPath expression. The message indicates that the expression was syntactically incorrect; the substitution text contains the expression that was in error. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ATTR_VAL_TEMPLATE_ERR	TokenNameIdentifier	 ATTR  VAL  TEMPLATE  ERR
,	TokenNameCOMMA	
"Nem lehet �rtelmezni a(z) ''{0}'' attrib�tum�rt�k-sablont."	TokenNameStringLiteral	Nem lehet �rtelmezni a(z) ''{0}'' attrib�tum�rt�k-sablont.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: ??? */	TokenNameCOMMENT_BLOCK	 Note to translators: ??? 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNKNOWN_SIG_TYPE_ERR	TokenNameIdentifier	 UNKNOWN  SIG  TYPE  ERR
,	TokenNameCOMMA	
"Ismeretlen adatt�pus szerepel a(z) ''{0}'' oszt�ly al��r�s�ban."	TokenNameStringLiteral	Ismeretlen adatt�pus szerepel a(z) ''{0}'' oszt�ly al��r�s�ban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text refers to data types. * The message is displayed if a value in a particular context needs to * be converted to type {1}, but that's not possible for a value of * type {0}. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text refers to data types. The message is displayed if a value in a particular context needs to be converted to type {1}, but that's not possible for a value of type {0}. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
DATA_CONVERSION_ERR	TokenNameIdentifier	 DATA  CONVERSION  ERR
,	TokenNameCOMMA	
"Nem lehet a(z) ''{0}'' adatt�pust ''{1}'' t�pusra konvert�lni."	TokenNameStringLiteral	Nem lehet a(z) ''{0}'' adatt�pust ''{1}'' t�pusra konvert�lni.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Templates" is a Java class name that should * not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Templates" is a Java class name that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_TRANSLET_CLASS_ERR	TokenNameIdentifier	 NO  TRANSLET  CLASS  ERR
,	TokenNameCOMMA	
"Ez a Templates oszt�ly nem tartalmaz �rv�nyes translet oszt�lymeghat�roz�st."	TokenNameStringLiteral	Ez a Templates oszt�ly nem tartalmaz �rv�nyes translet oszt�lymeghat�roz�st.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Templates" is a Java class name that should * not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Templates" is a Java class name that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_MAIN_TRANSLET_ERR	TokenNameIdentifier	 NO  MAIN  TRANSLET  ERR
,	TokenNameCOMMA	
"Ez a Templates oszt�ly nem tartalmaz ''{0}'' nev? oszt�lyt."	TokenNameStringLiteral	Ez a Templates oszt�ly nem tartalmaz ''{0}'' nev? oszt�lyt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_CLASS_ERR	TokenNameIdentifier	 TRANSLET  CLASS  ERR
,	TokenNameCOMMA	
"Nem lehet bet�lteni a(z) ''{0}'' translet oszt�lyt."	TokenNameStringLiteral	Nem lehet bet�lteni a(z) ''{0}'' translet oszt�lyt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_OBJECT_ERR	TokenNameIdentifier	 TRANSLET  OBJECT  ERR
,	TokenNameCOMMA	
"A translet oszt�ly bet�lt?d�tt, de nem siker�lt l�trehozni a translet p�ld�nyt."	TokenNameStringLiteral	A translet oszt�ly bet�lt?d�tt, de nem siker�lt l�trehozni a translet p�ld�nyt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "ErrorListener" is a Java interface name that * should not be translated. The message indicates that the user tried * to set an ErrorListener object on object of the class named in the * substitution text with "null" Java value. */	TokenNameCOMMENT_BLOCK	 Note to translators: "ErrorListener" is a Java interface name that should not be translated. The message indicates that the user tried to set an ErrorListener object on object of the class named in the substitution text with "null" Java value. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier	 ERROR  LISTENER  NULL  ERR
,	TokenNameCOMMA	
"Megpr�b�lta null�rt�kre �ll�tani a(z) ''{0}'' objektum ErrorListener fel�let�t."	TokenNameStringLiteral	Megpr�b�lta null�rt�kre �ll�tani a(z) ''{0}'' objektum ErrorListener fel�let�t.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: StreamSource, SAXSource and DOMSource are Java * interface names that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: StreamSource, SAXSource and DOMSource are Java interface names that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_SOURCE_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  SOURCE  ERR
,	TokenNameCOMMA	
"Az XSLTC csak a StreamSource, SAXSource �s DOMSource interf�szeket t�mogatja."	TokenNameStringLiteral	Az XSLTC csak a StreamSource, SAXSource �s DOMSource interf�szeket t�mogatja.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Source" is a Java class name that should not * be translated. The substitution text is the name of Java method. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Source" is a Java class name that should not be translated. The substitution text is the name of Java method. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_SOURCE_ERR	TokenNameIdentifier	 JAXP  NO  SOURCE  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' met�dusnak �tadott source objektumnak nincs tartalma."	TokenNameStringLiteral	A(z) ''{0}'' met�dusnak �tadott source objektumnak nincs tartalma.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The message indicates that XSLTC failed to * compile the stylesheet into a translet (class file). */	TokenNameCOMMENT_BLOCK	 Note to translators: The message indicates that XSLTC failed to compile the stylesheet into a translet (class file). 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_COMPILE_ERR	TokenNameIdentifier	 JAXP  COMPILE  ERR
,	TokenNameCOMMA	
"Nem siker�lt leford�tani a st�luslapot."	TokenNameStringLiteral	Nem siker�lt leford�tani a st�luslapot.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "TransformerFactory" is a class name. In this * context, an attribute is a property or setting of the * TransformerFactory object. The substitution text is the name of the * unrecognised attribute. The method used to retrieve the attribute is * "getAttribute", so it's not clear whether it would be best to * translate the term "attribute". */	TokenNameCOMMENT_BLOCK	 Note to translators: "TransformerFactory" is a class name. In this context, an attribute is a property or setting of the TransformerFactory object. The substitution text is the name of the unrecognised attribute. The method used to retrieve the attribute is "getAttribute", so it's not clear whether it would be best to translate the term "attribute". 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier	 JAXP  INVALID  ATTR  ERR
,	TokenNameCOMMA	
"A TransformerFactory oszt�ly nem simeri fel a(z) ''{0}'' attrib�tumot."	TokenNameStringLiteral	A TransformerFactory oszt�ly nem simeri fel a(z) ''{0}'' attrib�tumot.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "setResult()" and "startDocument()" are Java * method names that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "setResult()" and "startDocument()" are Java method names that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_SET_RESULT_ERR	TokenNameIdentifier	 JAXP  SET  RESULT  ERR
,	TokenNameCOMMA	
"A setResult() met�dust a startDocument() h�v�sa el?tt kell megh�vni."	TokenNameStringLiteral	A setResult() met�dust a startDocument() h�v�sa el?tt kell megh�vni.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Transformer" is a Java interface name that * should not be translated. A Transformer object should contained a * reference to a translet object in order to be used for * transformations; this message is produced if that requirement is not * met. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Transformer" is a Java interface name that should not be translated. A Transformer object should contained a reference to a translet object in order to be used for transformations; this message is produced if that requirement is not met. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier	 JAXP  NO  TRANSLET  ERR
,	TokenNameCOMMA	
"A transformer interf�sz nem tartalmaz be�gyazott translet objektumot."	TokenNameStringLiteral	A transformer interf�sz nem tartalmaz be�gyazott translet objektumot.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The XML document that results from a * transformation needs to be sent to an output handler object; this * message is produced if that requirement is not met. */	TokenNameCOMMENT_BLOCK	 Note to translators: The XML document that results from a transformation needs to be sent to an output handler object; this message is produced if that requirement is not met. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_HANDLER_ERR	TokenNameIdentifier	 JAXP  NO  HANDLER  ERR
,	TokenNameCOMMA	
"Nincs defini�lva kimenetkezel? az �talak�t�s eredm�ny�hez."	TokenNameStringLiteral	Nincs defini�lva kimenetkezel? az �talak�t�s eredm�ny�hez.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Result" is a Java interface name in this * context. The substitution text is a method name. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Result" is a Java interface name in this context. The substitution text is a method name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_RESULT_ERR	TokenNameIdentifier	 JAXP  NO  RESULT  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' met�dusnak �tadott result objektum �rv�nytelen."	TokenNameStringLiteral	A(z) ''{0}'' met�dusnak �tadott result objektum �rv�nytelen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Transformer" is a Java interface name. The * user's program attempted to access an unrecognized property with the * name specified in the substitution text. The method used to retrieve * the property is "getOutputProperty", so it's not clear whether it * would be best to translate the term "property". */	TokenNameCOMMENT_BLOCK	 Note to translators: "Transformer" is a Java interface name. The user's program attempted to access an unrecognized property with the name specified in the substitution text. The method used to retrieve the property is "getOutputProperty", so it's not clear whether it would be best to translate the term "property". 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  PROP  ERR
,	TokenNameCOMMA	
"�rv�nytelen Transformer tulajdons�got (''{0}'') pr�b�lt meg el�rni."	TokenNameStringLiteral	�rv�nytelen Transformer tulajdons�got (''{0}'') pr�b�lt meg el�rni.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: SAX2DOM is the name of a Java class that should * not be translated. This is an adapter in the sense that it takes a * DOM object and converts it to something that uses the SAX API. */	TokenNameCOMMENT_BLOCK	 Note to translators: SAX2DOM is the name of a Java class that should not be translated. This is an adapter in the sense that it takes a DOM object and converts it to something that uses the SAX API. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SAX2DOM_ADAPTER_ERR	TokenNameIdentifier	 SA X2 DOM  ADAPTER  ERR
,	TokenNameCOMMA	
"Nem lehet l�trehozni a SAX2DOM adaptert: ''{0}''."	TokenNameStringLiteral	Nem lehet l�trehozni a SAX2DOM adaptert: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "XSLTCSource.build()" is a Java method name. * "systemId" is an XML term that is short for "system identification". */	TokenNameCOMMENT_BLOCK	 Note to translators: "XSLTCSource.build()" is a Java method name. "systemId" is an XML term that is short for "system identification". 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XSLTC_SOURCE_ERR	TokenNameIdentifier	 XSLTC  SOURCE  ERR
,	TokenNameCOMMA	
"XSLTCSource.build() h�v�sa systemId be�ll�t�sa n�lk�l t�rt�nt."	TokenNameStringLiteral	XSLTCSource.build() h�v�sa systemId be�ll�t�sa n�lk�l t�rt�nt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
"Az eredm�ny nem lehet null"	TokenNameStringLiteral	Az eredm�ny nem lehet null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message indicates that the value argument * of setParameter must be a valid Java Object. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message indicates that the value argument of setParameter must be a valid Java Object. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 JAXP  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
"A(z) {0} param�ter �rt�ke egy �rv�nyes J�va objektum kell legyen"	TokenNameStringLiteral	A(z) {0} param�ter �rt�ke egy �rv�nyes J�va objektum kell legyen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILE_STDIN_ERR	TokenNameIdentifier	 COMPILE  STDIN  ERR
,	TokenNameCOMMA	
"A -i kapcsol�t a -o kapcsol�val egy�tt kell haszn�lni."	TokenNameStringLiteral	A -i kapcsol�t a -o kapcsol�val egy�tt kell haszn�lni.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message contains usage information for a * means of invoking XSLTC from the command-line. The message is * formatted for presentation in English. The strings <output>, * <directory>, etc. indicate user-specified argument values, and can * be translated - the argument <package> refers to a Java package, so * it should be handled in the same way the term is handled for JDK * documentation. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message contains usage information for a means of invoking XSLTC from the command-line. The message is formatted for presentation in English. The strings <output>, <directory>, etc. indicate user-specified argument values, and can be translated - the argument <package> refers to a Java package, so it should be handled in the same way the term is handled for JDK documentation. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILE_USAGE_STR	TokenNameIdentifier	 COMPILE  USAGE  STR
,	TokenNameCOMMA	
"Haszn�lat: java org.apache.xalan.xsltc.cmdline.Compile [-o <kimenet>] [-d <k�nyvt�r>] [-j <jar_f�jl>] [-p <csomag>] [-n] [-x] [-u] [-v] [-h] { <st�luslap> | -i } BE�LL�T�SOK -o <kimenet> hozz�rendeli a <kimenet> nevet az el?�ll�tott translethez. Alap�rtelmez�s szerint a translet neve a <st�luslap> nev�b?l sz�rmazik. Ez a be�ll�t�s figyelmen k�v�l marad, ha t�bb st�luslapot ford�t. -d <k�nyvt�r> meghat�rozza a translet c�lk�nyvt�r�t -j <jar_f�jl> a translet oszt�lyokat egy jar f�jlba csomagolja, aminek a nev�t a <jar_f�jl> attrib�tum adja meg -p <csomag> meghat�rozza az �sszes el?�ll�tott translet oszt�ly csomagn�v el?tagj�t. -n enged�lyezi a sablonbeemel�st (az alap�rtelmezett viselked�s �ltal�ban jobb). -x bekapcsolja a tov�bbi hibakeres�si �zeneteket -u �rtelmezi a <st�luslap> argumentumokat �s URL c�meket -i k�nyszer�ti a ford�t�t, hogy a st�luslapot az stdin bemenetr?l olvassa -v megjelen�ti a ford�t� verzi�sz�m�t -h megjelen�ti ezt a haszn�lati utas�t�st "	TokenNameStringLiteral	Haszn�lat: java org.apache.xalan.xsltc.cmdline.Compile [-o <kimenet>] [-d <k�nyvt�r>] [-j <jar_f�jl>] [-p <csomag>] [-n] [-x] [-u] [-v] [-h] { <st�luslap> | -i } BE�LL�T�SOK -o <kimenet> hozz�rendeli a <kimenet> nevet az el?�ll�tott translethez. Alap�rtelmez�s szerint a translet neve a <st�luslap> nev�b?l sz�rmazik. Ez a be�ll�t�s figyelmen k�v�l marad, ha t�bb st�luslapot ford�t. -d <k�nyvt�r> meghat�rozza a translet c�lk�nyvt�r�t -j <jar_f�jl> a translet oszt�lyokat egy jar f�jlba csomagolja, aminek a nev�t a <jar_f�jl> attrib�tum adja meg -p <csomag> meghat�rozza az �sszes el?�ll�tott translet oszt�ly csomagn�v el?tagj�t. -n enged�lyezi a sablonbeemel�st (az alap�rtelmezett viselked�s �ltal�ban jobb). -x bekapcsolja a tov�bbi hibakeres�si �zeneteket -u �rtelmezi a <st�luslap> argumentumokat �s URL c�meket -i k�nyszer�ti a ford�t�t, hogy a st�luslapot az stdin bemenetr?l olvassa -v megjelen�ti a ford�t� verzi�sz�m�t -h megjelen�ti ezt a haszn�lati utas�t�st 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message contains usage information for a * means of invoking XSLTC from the command-line. The message is * formatted for presentation in English. The strings <jarfile>, * <document>, etc. indicate user-specified argument values, and can * be translated - the argument <class> refers to a Java class, so it * should be handled in the same way the term is handled for JDK * documentation. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message contains usage information for a means of invoking XSLTC from the command-line. The message is formatted for presentation in English. The strings <jarfile>, <document>, etc. indicate user-specified argument values, and can be translated - the argument <class> refers to a Java class, so it should be handled in the same way the term is handled for JDK documentation. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_USAGE_STR	TokenNameIdentifier	 TRANSFORM  USAGE  STR
,	TokenNameCOMMA	
"HASZN�LAT: java org.apache.xalan.xsltc.cmdline.Transform [-j <jar_f�jl>] [-x] [-n <ism�tl�s>] {-u <dokumentum_url_c�me> | <dokumentum>} <oszt�ly> [<param1>=<�rt�k1> ...] a translet <oszt�ly> seg�ts�g�vel �talak�tja a <dokumentum> param�terben megadott dokumentumot. A translet <oszt�ly> vagy a felhaszn�l� CLASSPATH v�ltoz�ja alapj�n, vagy a megadott <jar_f�jl>-ban tal�lhat� meg. BE�LL�T�SOK -j <jar_f�jl> megadja a jar f�jlt a translet bet�lt�s�hez -x bekapcsolja a tov�bbi hibakeres�si �zeneteket -n <ism�tl�s> az �talak�t�st az <ism�tl�s> param�terben megadott alkalommal futtatja le, �s megjelen�ti a profiloz�si inform�ci�kat -u <dokumentum_url_c�me> megadja a bemeneti XML dokumentum URL c�m�t "	TokenNameStringLiteral	HASZN�LAT: java org.apache.xalan.xsltc.cmdline.Transform [-j <jar_f�jl>] [-x] [-n <ism�tl�s>] {-u <dokumentum_url_c�me> | <dokumentum>} <oszt�ly> [<param1>=<�rt�k1> ...] a translet <oszt�ly> seg�ts�g�vel �talak�tja a <dokumentum> param�terben megadott dokumentumot. A translet <oszt�ly> vagy a felhaszn�l� CLASSPATH v�ltoz�ja alapj�n, vagy a megadott <jar_f�jl>-ban tal�lhat� meg. BE�LL�T�SOK -j <jar_f�jl> megadja a jar f�jlt a translet bet�lt�s�hez -x bekapcsolja a tov�bbi hibakeres�si �zeneteket -n <ism�tl�s> az �talak�t�st az <ism�tl�s> param�terben megadott alkalommal futtatja le, �s megjelen�ti a profiloz�si inform�ci�kat -u <dokumentum_url_c�me> megadja a bemeneti XML dokumentum URL c�m�t 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:sort>", "<xsl:for-each>" and * "<xsl:apply-templates>" are keywords that should not be translated. * The message indicates that an xsl:sort element must be a child of * one of the other kinds of elements mentioned. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:sort>", "<xsl:for-each>" and "<xsl:apply-templates>" are keywords that should not be translated. The message indicates that an xsl:sort element must be a child of one of the other kinds of elements mentioned. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_SORT_ERR	TokenNameIdentifier	 STRAY  SORT  ERR
,	TokenNameCOMMA	
"Az <xsl:sort> csak <xsl:for-each>-en vagy <xsl:apply-templates>-en bel�l haszn�lhat�."	TokenNameStringLiteral	Az <xsl:sort> csak <xsl:for-each>-en vagy <xsl:apply-templates>-en bel�l haszn�lhat�.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The message indicates that the encoding * requested for the output document was on that requires support that * is not available from the Java Virtual Machine being used to execute * the program. */	TokenNameCOMMENT_BLOCK	 Note to translators: The message indicates that the encoding requested for the output document was on that requires support that is not available from the Java Virtual Machine being used to execute the program. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_ENCODING	TokenNameIdentifier	 UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"A(z) ''{0}'' kimeneti k�dol�st nem t�mogatja ez a JVM."	TokenNameStringLiteral	A(z) ''{0}'' kimeneti k�dol�st nem t�mogatja ez a JVM.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The message indicates that the XPath expression * named in the substitution text was not well formed syntactically. */	TokenNameCOMMENT_BLOCK	 Note to translators: The message indicates that the XPath expression named in the substitution text was not well formed syntactically. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SYNTAX_ERR	TokenNameIdentifier	 SYNTAX  ERR
,	TokenNameCOMMA	
"Szintaktikai hiba a(z) ''{0}'' kifejez�sben."	TokenNameStringLiteral	Szintaktikai hiba a(z) ''{0}'' kifejez�sben.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a Java * class. The term "constructor" here is the Java term. The message is * displayed if XSLTC could not find a constructor for the specified * class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a Java class. The term "constructor" here is the Java term. The message is displayed if XSLTC could not find a constructor for the specified class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CONSTRUCTOR_NOT_FOUND	TokenNameIdentifier	 CONSTRUCTOR  NOT  FOUND
,	TokenNameCOMMA	
"A(z) ''{0}'' k�ls? konstruktor nem tal�lhat�."	TokenNameStringLiteral	A(z) ''{0}'' k�ls? konstruktor nem tal�lhat�.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "static" is the Java keyword. The substitution * text is the name of a function. The first argument of that function * is not of the required type. */	TokenNameCOMMENT_BLOCK	 Note to translators: "static" is the Java keyword. The substitution text is the name of a function. The first argument of that function is not of the required type. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_JAVA_FUNCT_THIS_REF	TokenNameIdentifier	 NO  JAVA  FUNCT  THIS  REF
,	TokenNameCOMMA	
"A(z) ''{0}'' nem statikus Java f�ggv�ny els? argumentuma nem �rv�nyes objektumhivatkoz�s."	TokenNameStringLiteral	A(z) ''{0}'' nem statikus Java f�ggv�ny els? argumentuma nem �rv�nyes objektumhivatkoz�s.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An XPath expression was not of the type * required in a particular context. The substitution text is the * expression that was in error. */	TokenNameCOMMENT_BLOCK	 Note to translators: An XPath expression was not of the type required in a particular context. The substitution text is the expression that was in error. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TYPE_CHECK_ERR	TokenNameIdentifier	 TYPE  CHECK  ERR
,	TokenNameCOMMA	
"Hiba t�rt�nt a(z) ''{0}'' kifejez�s t�pus�nak ellen?rz�sekor."	TokenNameStringLiteral	Hiba t�rt�nt a(z) ''{0}'' kifejez�s t�pus�nak ellen?rz�sekor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An XPath expression was not of the type * required in a particular context. However, the location of the * problematic expression is unknown. */	TokenNameCOMMENT_BLOCK	 Note to translators: An XPath expression was not of the type required in a particular context. However, the location of the problematic expression is unknown. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TYPE_CHECK_UNK_LOC_ERR	TokenNameIdentifier	 TYPE  CHECK  UNK  LOC  ERR
,	TokenNameCOMMA	
"Hiba t�rt�nt egy ismeretlen helyen l�v? kifejez�s t�pus�nak ellen?rz�sekor."	TokenNameStringLiteral	Hiba t�rt�nt egy ismeretlen helyen l�v? kifejez�s t�pus�nak ellen?rz�sekor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a command- * line option that was not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a command- line option that was not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CMDLINE_OPTION_ERR	TokenNameIdentifier	 ILLEGAL  CMDLINE  OPTION  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' parancssori param�ter �rv�nytelen."	TokenNameStringLiteral	A(z) ''{0}'' parancssori param�ter �rv�nytelen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a command- * line option. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a command- line option. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CMDLINE_OPT_MISSING_ARG_ERR	TokenNameIdentifier	 CMDLINE  OPT  MISSING  ARG  ERR
,	TokenNameCOMMA	
"A(z) ''{0}'' parancssori param�terhez hi�nyzik egy k�telez? argumentum."	TokenNameStringLiteral	A(z) ''{0}'' parancssori param�terhez hi�nyzik egy k�telez? argumentum.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text contains two error * messages. The spacing before the second substitution text indents * it the same amount as the first in English. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text contains two error messages. The spacing before the second substitution text indents it the same amount as the first in English. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier	 WARNING  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
"FIGYELMEZTET�S: ''{0}'' :{1}"	TokenNameStringLiteral	FIGYELMEZTET�S: ''{0}'' :{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text is an error message. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text is an error message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WARNING_MSG	TokenNameIdentifier	 WARNING  MSG
,	TokenNameCOMMA	
"FIGYELMEZTET�S: ''{0}''"	TokenNameStringLiteral	FIGYELMEZTET�S: ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text contains two error * messages. The spacing before the second substitution text indents * it the same amount as the first in English. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text contains two error messages. The spacing before the second substitution text indents it the same amount as the first in English. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 FATAL  ERR  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
"S�LYOS HIBA: ''{0}'' :{1}"	TokenNameStringLiteral	S�LYOS HIBA: ''{0}'' :{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text is an error message. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text is an error message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FATAL_ERR_MSG	TokenNameIdentifier	 FATAL  ERR  MSG
,	TokenNameCOMMA	
"S�LYOS HIBA: ''{0}''"	TokenNameStringLiteral	S�LYOS HIBA: ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text contains two error * messages. The spacing before the second substitution text indents * it the same amount as the first in English. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text contains two error messages. The spacing before the second substitution text indents it the same amount as the first in English. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 ERROR  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
"HIBA: ''{0}'' :{1}"	TokenNameStringLiteral	HIBA: ''{0}'' :{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text is an error message. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text is an error message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_MSG	TokenNameIdentifier	 ERROR  MSG
,	TokenNameCOMMA	
"HIBA: ''{0}''"	TokenNameStringLiteral	HIBA: ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_WITH_TRANSLET_STR	TokenNameIdentifier	 TRANSFORM  WITH  TRANSLET  STR
,	TokenNameCOMMA	
"�talak�t�s a(z) ''{0}'' translet seg�ts�g�vel. "	TokenNameStringLiteral	�talak�t�s a(z) ''{0}'' translet seg�ts�g�vel. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The first substitution is the name of a class, * while the second substitution is the name of a jar file. */	TokenNameCOMMENT_BLOCK	 Note to translators: The first substitution is the name of a class, while the second substitution is the name of a jar file. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_WITH_JAR_STR	TokenNameIdentifier	 TRANSFORM  WITH  JAR  STR
,	TokenNameCOMMA	
"�talak�t�s a(z) ''{0}'' translet haszn�lat�val a(z) ''{1}'' jar f�jlb�l. "	TokenNameStringLiteral	�talak�t�s a(z) ''{0}'' translet haszn�lat�val a(z) ''{1}'' jar f�jlb�l. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "TransformerFactory" is the name of a Java * interface and must not be translated. The substitution text is * the name of the class that could not be instantiated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "TransformerFactory" is the name of a Java interface and must not be translated. The substitution text is the name of the class that could not be instantiated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COULD_NOT_CREATE_TRANS_FACT	TokenNameIdentifier	 COULD  NOT  CREATE  TRANS  FACT
,	TokenNameCOMMA	
"Nem lehet l�trehozni a(z) ''{0}'' TransformerFactory oszt�ly p�ld�ny�t."	TokenNameStringLiteral	Nem lehet l�trehozni a(z) ''{0}'' TransformerFactory oszt�ly p�ld�ny�t.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is produced when the user * specified a name for the translet class that contains characters * that are not permitted in a Java class name. The substitution * text "{0}" specifies the name the user requested, while "{1}" * specifies the name the processor used instead. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is produced when the user specified a name for the translet class that contains characters that are not permitted in a Java class name. The substitution text "{0}" specifies the name the user requested, while "{1}" specifies the name the processor used instead. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_NAME_JAVA_CONFLICT	TokenNameIdentifier	 TRANSLET  NAME  JAVA  CONFLICT
,	TokenNameCOMMA	
"A(z) ''{0}'' n�v nem haszn�lhat� a translet oszt�ly nevek�nt, mivel olyan karaktereket tartalmaz, amelyek nem megengedettek Java oszt�lyok nev�ben. A rendszer a(z) ''{1}'' nevet haszn�lta helyette. "	TokenNameStringLiteral	A(z) ''{0}'' n�v nem haszn�lhat� a translet oszt�ly nevek�nt, mivel olyan karaktereket tartalmaz, amelyek nem megengedettek Java oszt�lyok nev�ben. A rendszer a(z) ''{1}'' nevet haszn�lta helyette. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message is used as a header. * All the error messages are collected together and displayed beneath * this message. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message is used as a header. All the error messages are collected together and displayed beneath this message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILER_ERROR_KEY	TokenNameIdentifier	 COMPILER  ERROR  KEY
,	TokenNameCOMMA	
"Ford�t�s hib�k:"	TokenNameStringLiteral	Ford�t�s hib�k:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message is used as a header. * All the warning messages are collected together and displayed * beneath this message. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message is used as a header. All the warning messages are collected together and displayed beneath this message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILER_WARNING_KEY	TokenNameIdentifier	 COMPILER  WARNING  KEY
,	TokenNameCOMMA	
"Ford�t�si figyelmeztet�sek:"	TokenNameStringLiteral	Ford�t�si figyelmeztet�sek:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message is used as a header. * All the error messages that are produced when the stylesheet is * applied to an input document are collected together and displayed * beneath this message. A 'translet' is the compiled form of a * stylesheet (see above). */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message is used as a header. All the error messages that are produced when the stylesheet is applied to an input document are collected together and displayed beneath this message. A 'translet' is the compiled form of a stylesheet (see above). 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
RUNTIME_ERROR_KEY	TokenNameIdentifier	 RUNTIME  ERROR  KEY
,	TokenNameCOMMA	
"Translet hib�k:"	TokenNameStringLiteral	Translet hib�k:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute whose value is constrained to * be a "QName" or a list of "QNames" had a value that was incorrect. * 'QName' is an XML syntactic term that must not be translated. The * substitution text contains the actual value of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute whose value is constrained to be a "QName" or a list of "QNames" had a value that was incorrect. 'QName' is an XML syntactic term that must not be translated. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_QNAME_ERR	TokenNameIdentifier	 INVALID  QNAME  ERR
,	TokenNameCOMMA	
"Egy olyan attrib�tum, amelynek az �rt�ke csak QName vagy QName �rt�kek sz�k�zzel elv�lasztott list�ja lehet, ''{0}'' �rt�kkel rendelkezett."	TokenNameStringLiteral	Egy olyan attrib�tum, amelynek az �rt�ke csak QName vagy QName �rt�kek sz�k�zzel elv�lasztott list�ja lehet, ''{0}'' �rt�kkel rendelkezett.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute whose value is required to * be an "NCName". * 'NCName' is an XML syntactic term that must not be translated. The * substitution text contains the actual value of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute whose value is required to be an "NCName". 'NCName' is an XML syntactic term that must not be translated. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_NCNAME_ERR	TokenNameIdentifier	 INVALID  NCNAME  ERR
,	TokenNameCOMMA	
"Egy olyan attrib�tum, amelynek �rt�ke csak NCName lehet, ''{0}'' �rt�kkel rendelkezett."	TokenNameStringLiteral	Egy olyan attrib�tum, amelynek �rt�ke csak NCName lehet, ''{0}'' �rt�kkel rendelkezett.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute with an incorrect value was * encountered. The permitted value is one of the literal values * "xml", "html" or "text"; it is also permitted to have the form of * a QName that is not also an NCName. The terms "method", * "xsl:output", "xml", "html" and "text" are keywords that must not * be translated. The term "qname-but-not-ncname" is an XML syntactic * term. The substitution text contains the actual value of the * attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute with an incorrect value was encountered. The permitted value is one of the literal values "xml", "html" or "text"; it is also permitted to have the form of a QName that is not also an NCName. The terms "method", "xsl:output", "xml", "html" and "text" are keywords that must not be translated. The term "qname-but-not-ncname" is an XML syntactic term. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_METHOD_IN_OUTPUT	TokenNameIdentifier	 INVALID  METHOD  IN  OUTPUT
,	TokenNameCOMMA	
"Egy <xsl:output> elem met�dus attrib�tum�nak �rt�ke ''{0}'' volt. Az �rt�k csak ''xml'', ''html'', ''text'' vagy qname-but-not-ncname lehet."	TokenNameStringLiteral	Egy <xsl:output> elem met�dus attrib�tum�nak �rt�ke ''{0}'' volt. Az �rt�k csak ''xml'', ''html'', ''text'' vagy qname-but-not-ncname lehet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 JAXP  GET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"A szolg�ltat�s neve nem lehet null a TransformerFactory.getFeature(String name) met�dusban."	TokenNameStringLiteral	A szolg�ltat�s neve nem lehet null a TransformerFactory.getFeature(String name) met�dusban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 JAXP  SET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"A szolg�ltat�s neve nem lehet null a TransformerFactory.setFeature(String name, boolean value) met�dusban."	TokenNameStringLiteral	A szolg�ltat�s neve nem lehet null a TransformerFactory.setFeature(String name, boolean value) met�dusban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNSUPPORTED_FEATURE	TokenNameIdentifier	 JAXP  UNSUPPORTED  FEATURE
,	TokenNameCOMMA	
"A(z) ''{0}'' szolg�ltat�s nem �ll�that� be ehhez a TransformerFactory oszt�lyhoz."	TokenNameStringLiteral	A(z) ''{0}'' szolg�ltat�s nem �ll�that� be ehhez a TransformerFactory oszt�lyhoz.
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
