/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ErrorMessages_cs.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ErrorMessages_cs.java 468649 2006-10-28 07:00:55Z minchau $ 
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
ErrorMessages_cs	TokenNameIdentifier	 Error Messages cs
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
"V�ce ne? jedna p?edloha stylu je definov�na ve stejn�m souboru."	TokenNameStringLiteral	V�ce ne? jedna p?edloha stylu je definov�na ve stejn�m souboru.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a * template. The same name was used on two different templates in the * same stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a template. The same name was used on two different templates in the same stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TEMPLATE_REDEF_ERR	TokenNameIdentifier	 TEMPLATE  REDEF  ERR
,	TokenNameCOMMA	
"?ablona ''{0}'' je ji? v t�to p?edloze stylu definov�na. "	TokenNameStringLiteral	?ablona ''{0}'' je ji? v t�to p?edloze stylu definov�na. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a * template. A reference to the template name was encountered, but the * template is undefined. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a template. A reference to the template name was encountered, but the template is undefined. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TEMPLATE_UNDEF_ERR	TokenNameIdentifier	 TEMPLATE  UNDEF  ERR
,	TokenNameCOMMA	
"?ablona ''{0}'' nen� v t�to p?edloze stylu definov�na."	TokenNameStringLiteral	?ablona ''{0}'' nen� v t�to p?edloze stylu definov�na.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a variable * that was defined more than once. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a variable that was defined more than once. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
VARIABLE_REDEF_ERR	TokenNameIdentifier	 VARIABLE  REDEF  ERR
,	TokenNameCOMMA	
"Prom?nn� ''{0}'' je n?kolikan�sobn? definov�na ve stejn�m oboru."	TokenNameStringLiteral	Prom?nn� ''{0}'' je n?kolikan�sobn? definov�na ve stejn�m oboru.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a variable * or parameter. A reference to the variable or parameter was found, * but it was never defined. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a variable or parameter. A reference to the variable or parameter was found, but it was never defined. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
VARIABLE_UNDEF_ERR	TokenNameIdentifier	 VARIABLE  UNDEF  ERR
,	TokenNameCOMMA	
"Prom?nn� nebo parametr ''{0}'' nejsou definov�ny."	TokenNameStringLiteral	Prom?nn� nebo parametr ''{0}'' nejsou definov�ny.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The word "class" here refers to a Java class. * Processing the stylesheet required a class to be loaded, but it could * not be found. The substitution text is the name of the class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The word "class" here refers to a Java class. Processing the stylesheet required a class to be loaded, but it could not be found. The substitution text is the name of the class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CLASS_NOT_FOUND_ERR	TokenNameIdentifier	 CLASS  NOT  FOUND  ERR
,	TokenNameCOMMA	
"Nelze naj�t t?�du ''{0}''."	TokenNameStringLiteral	Nelze naj�t t?�du ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The word "method" here refers to a Java method. * Processing the stylesheet required a reference to the method named by * the substitution text, but it could not be found. "public" is the * Java keyword. */	TokenNameCOMMENT_BLOCK	 Note to translators: The word "method" here refers to a Java method. Processing the stylesheet required a reference to the method named by the substitution text, but it could not be found. "public" is the Java keyword. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
METHOD_NOT_FOUND_ERR	TokenNameIdentifier	 METHOD  NOT  FOUND  ERR
,	TokenNameCOMMA	
"Nelze naj�t extern� metodu ''{0}'' (mus� b?t ve?ejn�)."	TokenNameStringLiteral	Nelze naj�t extern� metodu ''{0}'' (mus� b?t ve?ejn�).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The word "method" here refers to a Java method. * Processing the stylesheet required a reference to the method named by * the substitution text, but no method with the required types of * arguments or return type could be found. */	TokenNameCOMMENT_BLOCK	 Note to translators: The word "method" here refers to a Java method. Processing the stylesheet required a reference to the method named by the substitution text, but no method with the required types of arguments or return type could be found. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ARGUMENT_CONVERSION_ERR	TokenNameIdentifier	 ARGUMENT  CONVERSION  ERR
,	TokenNameCOMMA	
"Nelze p?ev�st argument/n�vratov? typ ve vol�n� metody ''{0}''"	TokenNameStringLiteral	Nelze p?ev�st argument/n�vratov? typ ve vol�n� metody ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The file or URI named in the substitution text * is missing. */	TokenNameCOMMENT_BLOCK	 Note to translators: The file or URI named in the substitution text is missing. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FILE_NOT_FOUND_ERR	TokenNameIdentifier	 FILE  NOT  FOUND  ERR
,	TokenNameCOMMA	
"Soubor nebo identifik�tor URI ''{0}'' nebyl nalezen."	TokenNameStringLiteral	Soubor nebo identifik�tor URI ''{0}'' nebyl nalezen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is displayed when the URI * mentioned in the substitution text is not well-formed syntactically. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is displayed when the URI mentioned in the substitution text is not well-formed syntactically. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_URI_ERR	TokenNameIdentifier	 INVALID  URI  ERR
,	TokenNameCOMMA	
"Neplatn? identifik�tor URI ''{0}''."	TokenNameStringLiteral	Neplatn? identifik�tor URI ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The file or URI named in the substitution text * exists but could not be opened. */	TokenNameCOMMENT_BLOCK	 Note to translators: The file or URI named in the substitution text exists but could not be opened. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FILE_ACCESS_ERR	TokenNameIdentifier	 FILE  ACCESS  ERR
,	TokenNameCOMMA	
"Nelze otev?�t soubor nebo identifik�tor URI ''{0}''."	TokenNameStringLiteral	Nelze otev?�t soubor nebo identifik�tor URI ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: <xsl:stylesheet> and <xsl:transform> are * keywords that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: <xsl:stylesheet> and <xsl:transform> are keywords that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_ROOT_ERR	TokenNameIdentifier	 MISSING  ROOT  ERR
,	TokenNameCOMMA	
"Byl o?ek�v�n prvek <xsl:stylesheet> nebo <xsl:transform>."	TokenNameStringLiteral	Byl o?ek�v�n prvek <xsl:stylesheet> nebo <xsl:transform>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained a reference to a * namespace prefix that was undefined. The value of the substitution * text is the name of the prefix. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained a reference to a namespace prefix that was undefined. The value of the substitution text is the name of the prefix. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NAMESPACE_UNDEF_ERR	TokenNameIdentifier	 NAMESPACE  UNDEF  ERR
,	TokenNameCOMMA	
"P?edpona oboru n�zv? ''{0}'' nen� deklarov�na."	TokenNameStringLiteral	P?edpona oboru n�zv? ''{0}'' nen� deklarov�na.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The Java function named in the stylesheet could * not be found. */	TokenNameCOMMENT_BLOCK	 Note to translators: The Java function named in the stylesheet could not be found. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FUNCTION_RESOLVE_ERR	TokenNameIdentifier	 FUNCTION  RESOLVE  ERR
,	TokenNameCOMMA	
"Nelze vy?e?it vol�n� funkce ''{0}''."	TokenNameStringLiteral	Nelze vy?e?it vol�n� funkce ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a * function. A literal string here means a constant string value. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a function. A literal string here means a constant string value. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NEED_LITERAL_ERR	TokenNameIdentifier	 NEED  LITERAL  ERR
,	TokenNameCOMMA	
"Argumentem funkce ''{0}'' mus� b?t ?et?zcov? liter�l."	TokenNameStringLiteral	Argumentem funkce ''{0}'' mus� b?t ?et?zcov? liter�l.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message indicates there was a syntactic * error in the form of an XPath expression. The substitution text is * the expression. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message indicates there was a syntactic error in the form of an XPath expression. The substitution text is the expression. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XPATH_PARSER_ERR	TokenNameIdentifier	 XPATH  PARSER  ERR
,	TokenNameCOMMA	
"Chyba p?i anal?ze v?razu XPath ''{0}''."	TokenNameStringLiteral	Chyba p?i anal?ze v?razu XPath ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An element in the stylesheet requires a * particular attribute named by the substitution text, but that * attribute was not specified in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: An element in the stylesheet requires a particular attribute named by the substitution text, but that attribute was not specified in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
REQUIRED_ATTR_ERR	TokenNameIdentifier	 REQUIRED  ATTR  ERR
,	TokenNameCOMMA	
"Po?adovan? atribut ''{0}'' chyb�."	TokenNameStringLiteral	Po?adovan? atribut ''{0}'' chyb�.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message indicates that a character not * permitted in an XPath expression was encountered. The substitution * text is the offending character. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message indicates that a character not permitted in an XPath expression was encountered. The substitution text is the offending character. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CHAR_ERR	TokenNameIdentifier	 ILLEGAL  CHAR  ERR
,	TokenNameCOMMA	
"Neplatn? znak ''{0}'' ve v?razu XPath."	TokenNameStringLiteral	Neplatn? znak ''{0}'' ve v?razu XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: A processing instruction is a mark-up item in * an XML document that request some behaviour of an XML processor. The * form of the name of was invalid in this case, and the substitution * text is the name. */	TokenNameCOMMENT_BLOCK	 Note to translators: A processing instruction is a mark-up item in an XML document that request some behaviour of an XML processor. The form of the name of was invalid in this case, and the substitution text is the name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_PI_ERR	TokenNameIdentifier	 ILLEGAL  PI  ERR
,	TokenNameCOMMA	
"Neplatn? n�zev ''{0}'' pro instrukci zpracov�n�. "	TokenNameStringLiteral	Neplatn? n�zev ''{0}'' pro instrukci zpracov�n�. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is reported if the stylesheet * being processed attempted to construct an XML document with an * attribute in a place other than on an element. The substitution text * specifies the name of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is reported if the stylesheet being processed attempted to construct an XML document with an attribute in a place other than on an element. The substitution text specifies the name of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier	 STRAY  ATTRIBUTE  ERR
,	TokenNameCOMMA	
"Atribut ''{0}'' se nach�z� vn? prvku."	TokenNameStringLiteral	Atribut ''{0}'' se nach�z� vn? prvku.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute that wasn't recognized was * specified on an element in the stylesheet. The attribute is named * by the substitution * text. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute that wasn't recognized was specified on an element in the stylesheet. The attribute is named by the substitution text. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ATTRIBUTE_ERR	TokenNameIdentifier	 ILLEGAL  ATTRIBUTE  ERR
,	TokenNameCOMMA	
"Neplatn? atribut ''{0}''."	TokenNameStringLiteral	Neplatn? atribut ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "import" and "include" are keywords that should * not be translated. This messages indicates that the stylesheet * named in the substitution text imported or included itself either * directly or indirectly. */	TokenNameCOMMENT_BLOCK	 Note to translators: "import" and "include" are keywords that should not be translated. This messages indicates that the stylesheet named in the substitution text imported or included itself either directly or indirectly. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CIRCULAR_INCLUDE_ERR	TokenNameIdentifier	 CIRCULAR  INCLUDE  ERR
,	TokenNameCOMMA	
"Cyklick? import/zahrnut�. P?edloha stylu ''{0}'' je ji? zavedena."	TokenNameStringLiteral	Cyklick? import/zahrnut�. P?edloha stylu ''{0}'' je ji? zavedena.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: A result-tree fragment is a portion of a * resulting XML document represented as a tree. "<xsl:sort>" is a * keyword and should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: A result-tree fragment is a portion of a resulting XML document represented as a tree. "<xsl:sort>" is a keyword and should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
RESULT_TREE_SORT_ERR	TokenNameIdentifier	 RESULT  TREE  SORT  ERR
,	TokenNameCOMMA	
"Fragmenty stromu v?sledk? nemohou b?t ?azeny (prvky <xsl:sort> se ignoruj�). P?i vytv�?en� stromu v?sledk? mus�te se?adit uzly."	TokenNameStringLiteral	Fragmenty stromu v?sledk? nemohou b?t ?azeny (prvky <xsl:sort> se ignoruj�). P?i vytv�?en� stromu v?sledk? mus�te se?adit uzly.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: A name can be given to a particular style to be * used to format decimal values. The substitution text gives the name * of such a style for which more than one declaration was encountered. */	TokenNameCOMMENT_BLOCK	 Note to translators: A name can be given to a particular style to be used to format decimal values. The substitution text gives the name of such a style for which more than one declaration was encountered. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SYMBOLS_REDEF_ERR	TokenNameIdentifier	 SYMBOLS  REDEF  ERR
,	TokenNameCOMMA	
"Desetinn� form�tov�n� ''{0}'' je ji? definov�no."	TokenNameStringLiteral	Desetinn� form�tov�n� ''{0}'' je ji? definov�no.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet version named in the * substitution text is not supported. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet version named in the substitution text is not supported. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XSL_VERSION_ERR	TokenNameIdentifier	 XSL  VERSION  ERR
,	TokenNameCOMMA	
"Verze XSL ''{0}'' nen� produktem XSLTC podporov�na."	TokenNameStringLiteral	Verze XSL ''{0}'' nen� produktem XSLTC podporov�na.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The definitions of one or more variables or * parameters depend on one another. */	TokenNameCOMMENT_BLOCK	 Note to translators: The definitions of one or more variables or parameters depend on one another. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier	 CIRCULAR  VARIABLE  ERR
,	TokenNameCOMMA	
"Cyklick? odkaz na prom?nnou/parametr ve funkci ''{0}''."	TokenNameStringLiteral	Cyklick? odkaz na prom?nnou/parametr ve funkci ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The operator in an expresion with two operands was * not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The operator in an expresion with two operands was not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier	 ILLEGAL  BINARY  OP  ERR
,	TokenNameCOMMA	
"Nezn�m? oper�tor pro bin�rn� v?raz."	TokenNameStringLiteral	Nezn�m? oper�tor pro bin�rn� v?raz.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is produced if a reference to a * function has too many or too few arguments. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is produced if a reference to a function has too many or too few arguments. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ARG_ERR	TokenNameIdentifier	 ILLEGAL  ARG  ERR
,	TokenNameCOMMA	
"Neplatn? argument pro vol�n� funkce."	TokenNameStringLiteral	Neplatn? argument pro vol�n� funkce.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "document()" is the name of function and must * not be translated. A node-set is a set of the nodes in the tree * representation of an XML document. */	TokenNameCOMMENT_BLOCK	 Note to translators: "document()" is the name of function and must not be translated. A node-set is a set of the nodes in the tree representation of an XML document. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
DOCUMENT_ARG_ERR	TokenNameIdentifier	 DOCUMENT  ARG  ERR
,	TokenNameCOMMA	
"Druh? argument pro funkci document() mus� b?t node-set."	TokenNameStringLiteral	Druh? argument pro funkci document() mus� b?t node-set.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords * and should not be translated. This message describes a syntax error * in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_WHEN_ERR	TokenNameIdentifier	 MISSING  WHEN  ERR
,	TokenNameCOMMA	
"Alespo? jeden prvek <xsl:when> se vy?aduje v <xsl:choose>."	TokenNameStringLiteral	Alespo? jeden prvek <xsl:when> se vy?aduje v <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are * keywords and should not be translated. This message describes a * syntax error in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MULTIPLE_OTHERWISE_ERR	TokenNameIdentifier	 MULTIPLE  OTHERWISE  ERR
,	TokenNameCOMMA	
"Jen jeden prvek <xsl:otherwise> je povolen v <xsl:choose>."	TokenNameStringLiteral	Jen jeden prvek <xsl:otherwise> je povolen v <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are * keywords and should not be translated. This message describes a * syntax error in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_OTHERWISE_ERR	TokenNameIdentifier	 STRAY  OTHERWISE  ERR
,	TokenNameCOMMA	
"Prvek <xsl:otherwise> m??e b?t pou?it jen v <xsl:choose>."	TokenNameStringLiteral	Prvek <xsl:otherwise> m??e b?t pou?it jen v <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords * and should not be translated. This message describes a syntax error * in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_WHEN_ERR	TokenNameIdentifier	 STRAY  WHEN  ERR
,	TokenNameCOMMA	
"Prvek <xsl:when> m??e b?t pou?it jen v <xsl:choose>."	TokenNameStringLiteral	Prvek <xsl:when> m??e b?t pou?it jen v <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:when>", "<xsl:otherwise>" and * "<xsl:choose>" are keywords and should not be translated. This * message describes a syntax error in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:when>", "<xsl:otherwise>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WHEN_ELEMENT_ERR	TokenNameIdentifier	 WHEN  ELEMENT  ERR
,	TokenNameCOMMA	
"Pouze prvky <xsl:when> a <xsl:otherwise> jsou povoleny v <xsl:choose>."	TokenNameStringLiteral	Pouze prvky <xsl:when> a <xsl:otherwise> jsou povoleny v <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:attribute-set>" and "name" are keywords * that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:attribute-set>" and "name" are keywords that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNNAMED_ATTRIBSET_ERR	TokenNameIdentifier	 UNNAMED  ATTRIBSET  ERR
,	TokenNameCOMMA	
"V prvku <xsl:attribute-set> chyb� atribut 'name'."	TokenNameStringLiteral	V prvku <xsl:attribute-set> chyb� atribut 'name'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An element in the stylesheet contained an * element of a type that it was not permitted to contain. */	TokenNameCOMMENT_BLOCK	 Note to translators: An element in the stylesheet contained an element of a type that it was not permitted to contain. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CHILD_ERR	TokenNameIdentifier	 ILLEGAL  CHILD  ERR
,	TokenNameCOMMA	
"Neplatn? prvek potomka."	TokenNameStringLiteral	Neplatn? prvek potomka.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet tried to create an element with * a name that was not a valid XML name. The substitution text contains * the name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet tried to create an element with a name that was not a valid XML name. The substitution text contains the name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ELEM_NAME_ERR	TokenNameIdentifier	 ILLEGAL  ELEM  NAME  ERR
,	TokenNameCOMMA	
"Nelze volat prvek ''{0}''"	TokenNameStringLiteral	Nelze volat prvek ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet tried to create an attribute * with a name that was not a valid XML name. The substitution text * contains the name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet tried to create an attribute with a name that was not a valid XML name. The substitution text contains the name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ATTR_NAME_ERR	TokenNameIdentifier	 ILLEGAL  ATTR  NAME  ERR
,	TokenNameCOMMA	
"Nelze volat atribut ''{0}''"	TokenNameStringLiteral	Nelze volat atribut ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The children of the outermost element of a * stylesheet are referred to as top-level elements. No text should * occur within that outermost element unless it is within a top-level * element. This message indicates that that constraint was violated. * "<xsl:stylesheet>" is a keyword that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: The children of the outermost element of a stylesheet are referred to as top-level elements. No text should occur within that outermost element unless it is within a top-level element. This message indicates that that constraint was violated. "<xsl:stylesheet>" is a keyword that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_TEXT_NODE_ERR	TokenNameIdentifier	 ILLEGAL  TEXT  NODE  ERR
,	TokenNameCOMMA	
"Textov� data jsou vn? prvku nejvy??� �rovn? <xsl:stylesheet>."	TokenNameStringLiteral	Textov� data jsou vn? prvku nejvy??� �rovn? <xsl:stylesheet>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: JAXP is an acronym for the Java API for XML * Processing. This message indicates that the XML parser provided to * XSLTC to process the XML input document had a configuration problem. */	TokenNameCOMMENT_BLOCK	 Note to translators: JAXP is an acronym for the Java API for XML Processing. This message indicates that the XML parser provided to XSLTC to process the XML input document had a configuration problem. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SAX_PARSER_CONFIG_ERR	TokenNameIdentifier	 SAX  PARSER  CONFIG  ERR
,	TokenNameCOMMA	
"Analyz�tor JAXP je nespr�vn? konfigurov�n."	TokenNameStringLiteral	Analyz�tor JAXP je nespr�vn? konfigurov�n.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text names the internal error * encountered. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text names the internal error encountered. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INTERNAL_ERR	TokenNameIdentifier	 INTERNAL  ERR
,	TokenNameCOMMA	
"Neopraviteln� intern� chyba XSLTC: ''{0}''"	TokenNameStringLiteral	Neopraviteln� intern� chyba XSLTC: ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained an element that was * not recognized as part of the XSL syntax. The substitution text * gives the element name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained an element that was not recognized as part of the XSL syntax. The substitution text gives the element name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_XSL_ERR	TokenNameIdentifier	 UNSUPPORTED  XSL  ERR
,	TokenNameCOMMA	
"Nepodporovan? prvek XSL ''{0}''."	TokenNameStringLiteral	Nepodporovan? prvek XSL ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet referred to an extension to the * XSL syntax and indicated that it was defined by XSLTC, but XSTLC does * not recognized the particular extension named. The substitution text * gives the extension name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet referred to an extension to the XSL syntax and indicated that it was defined by XSLTC, but XSTLC does not recognized the particular extension named. The substitution text gives the extension name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_EXT_ERR	TokenNameIdentifier	 UNSUPPORTED  EXT  ERR
,	TokenNameCOMMA	
"Nerozpoznan� p?�pona XSLTC ''{0}''."	TokenNameStringLiteral	Nerozpoznan� p?�pona XSLTC ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The XML document given to XSLTC as a stylesheet * was not, in fact, a stylesheet. XSLTC is able to detect that in this * case because the outermost element in the stylesheet has to be * declared with respect to the XSL namespace URI, but no declaration * for that namespace was seen. */	TokenNameCOMMENT_BLOCK	 Note to translators: The XML document given to XSLTC as a stylesheet was not, in fact, a stylesheet. XSLTC is able to detect that in this case because the outermost element in the stylesheet has to be declared with respect to the XSL namespace URI, but no declaration for that namespace was seen. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_XSLT_URI_ERR	TokenNameIdentifier	 MISSING  XSLT  URI  ERR
,	TokenNameCOMMA	
"Vstupn� dokument nen� p?edloha stylu (obor n�zv? XSL nen� deklarov�n v ko?enov�m elementu)."	TokenNameStringLiteral	Vstupn� dokument nen� p?edloha stylu (obor n�zv? XSL nen� deklarov�n v ko?enov�m elementu).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: XSLTC could not find the stylesheet document * with the name specified by the substitution text. */	TokenNameCOMMENT_BLOCK	 Note to translators: XSLTC could not find the stylesheet document with the name specified by the substitution text. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_XSLT_TARGET_ERR	TokenNameIdentifier	 MISSING  XSLT  TARGET  ERR
,	TokenNameCOMMA	
"Nelze naj�t c�lovou p?edlohu se stylem ''{0}''."	TokenNameStringLiteral	Nelze naj�t c�lovou p?edlohu se stylem ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message represents an internal error in * condition in XSLTC. The substitution text is the class name in XSLTC * that is missing some functionality. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message represents an internal error in condition in XSLTC. The substitution text is the class name in XSLTC that is missing some functionality. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NOT_IMPLEMENTED_ERR	TokenNameIdentifier	 NOT  IMPLEMENTED  ERR
,	TokenNameCOMMA	
"Neimplementov�no: ''{0}''."	TokenNameStringLiteral	Neimplementov�no: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The XML document given to XSLTC as a stylesheet * was not, in fact, a stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: The XML document given to XSLTC as a stylesheet was not, in fact, a stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NOT_STYLESHEET_ERR	TokenNameIdentifier	 NOT  STYLESHEET  ERR
,	TokenNameCOMMA	
"Vstupn� dokument neobsahuje p?edlohu stylu XSL."	TokenNameStringLiteral	Vstupn� dokument neobsahuje p?edlohu stylu XSL.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The element named in the substitution text was * encountered in the stylesheet but is not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The element named in the substitution text was encountered in the stylesheet but is not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ELEMENT_PARSE_ERR	TokenNameIdentifier	 ELEMENT  PARSE  ERR
,	TokenNameCOMMA	
"Nelze analyzovat prvek ''{0}''"	TokenNameStringLiteral	Nelze analyzovat prvek ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "use", "<key>", "node", "node-set", "string" * and "number" are keywords in this context and should not be * translated. This message indicates that the value of the "use" * attribute was not one of the permitted values. */	TokenNameCOMMENT_BLOCK	 Note to translators: "use", "<key>", "node", "node-set", "string" and "number" are keywords in this context and should not be translated. This message indicates that the value of the "use" attribute was not one of the permitted values. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
KEY_USE_ATTR_ERR	TokenNameIdentifier	 KEY  USE  ATTR  ERR
,	TokenNameCOMMA	
"Atribut use prom?nn� <key> mus� b?t typu node, node-set, string nebo number."	TokenNameStringLiteral	Atribut use prom?nn� <key> mus� b?t typu node, node-set, string nebo number.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An XML document can specify the version of the * XML specification to which it adheres. This message indicates that * the version specified for the output document was not valid. */	TokenNameCOMMENT_BLOCK	 Note to translators: An XML document can specify the version of the XML specification to which it adheres. This message indicates that the version specified for the output document was not valid. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
OUTPUT_VERSION_ERR	TokenNameIdentifier	 OUTPUT  VERSION  ERR
,	TokenNameCOMMA	
"V?stupn� verze dokumentu XML by m?la b?t 1.0"	TokenNameStringLiteral	V?stupn� verze dokumentu XML by m?la b?t 1.0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The operator in a comparison operation was * not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The operator in a comparison operation was not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_RELAT_OP_ERR	TokenNameIdentifier	 ILLEGAL  RELAT  OP  ERR
,	TokenNameCOMMA	
"Nezn�m? oper�tor pro rela?n� v?raz"	TokenNameStringLiteral	Nezn�m? oper�tor pro rela?n� v?raz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute set defines as a set of XML * attributes that can be added to an element in the output XML document * as a group. This message is reported if the name specified was not * used to declare an attribute set. The substitution text is the name * that is in error. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute set defines as a set of XML attributes that can be added to an element in the output XML document as a group. This message is reported if the name specified was not used to declare an attribute set. The substitution text is the name that is in error. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ATTRIBSET_UNDEF_ERR	TokenNameIdentifier	 ATTRIBSET  UNDEF  ERR
,	TokenNameCOMMA	
"Pokus pou?�t neexistuj�c� sadu atribut? ''{0}''."	TokenNameStringLiteral	Pokus pou?�t neexistuj�c� sadu atribut? ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The term "attribute value template" is a term * defined by XSLT which describes the value of an attribute that is * determined by an XPath expression. The message indicates that the * expression was syntactically incorrect; the substitution text * contains the expression that was in error. */	TokenNameCOMMENT_BLOCK	 Note to translators: The term "attribute value template" is a term defined by XSLT which describes the value of an attribute that is determined by an XPath expression. The message indicates that the expression was syntactically incorrect; the substitution text contains the expression that was in error. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ATTR_VAL_TEMPLATE_ERR	TokenNameIdentifier	 ATTR  VAL  TEMPLATE  ERR
,	TokenNameCOMMA	
"Nelze analyzovat ?ablonu hodnoty atributu ''{0}''."	TokenNameStringLiteral	Nelze analyzovat ?ablonu hodnoty atributu ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: ??? */	TokenNameCOMMENT_BLOCK	 Note to translators: ??? 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNKNOWN_SIG_TYPE_ERR	TokenNameIdentifier	 UNKNOWN  SIG  TYPE  ERR
,	TokenNameCOMMA	
"Nezn�m? datov? typ v podpisu pro t?�du ''{0}''. "	TokenNameStringLiteral	Nezn�m? datov? typ v podpisu pro t?�du ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text refers to data types. * The message is displayed if a value in a particular context needs to * be converted to type {1}, but that's not possible for a value of * type {0}. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text refers to data types. The message is displayed if a value in a particular context needs to be converted to type {1}, but that's not possible for a value of type {0}. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
DATA_CONVERSION_ERR	TokenNameIdentifier	 DATA  CONVERSION  ERR
,	TokenNameCOMMA	
"Nelze p?ev�st datov? typ ''{0}'' na ''{1}''."	TokenNameStringLiteral	Nelze p?ev�st datov? typ ''{0}'' na ''{1}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Templates" is a Java class name that should * not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Templates" is a Java class name that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_TRANSLET_CLASS_ERR	TokenNameIdentifier	 NO  TRANSLET  CLASS  ERR
,	TokenNameCOMMA	
"Tato ?ablona neobsahuje platnou definici t?�dy translet."	TokenNameStringLiteral	Tato ?ablona neobsahuje platnou definici t?�dy translet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Templates" is a Java class name that should * not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Templates" is a Java class name that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_MAIN_TRANSLET_ERR	TokenNameIdentifier	 NO  MAIN  TRANSLET  ERR
,	TokenNameCOMMA	
"Tato ?ablona neobsahuje t?�du s n�zvem ''{0}''. "	TokenNameStringLiteral	Tato ?ablona neobsahuje t?�du s n�zvem ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_CLASS_ERR	TokenNameIdentifier	 TRANSLET  CLASS  ERR
,	TokenNameCOMMA	
"Nelze zav�st t?�du translet ''{0}''. "	TokenNameStringLiteral	Nelze zav�st t?�du translet ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_OBJECT_ERR	TokenNameIdentifier	 TRANSLET  OBJECT  ERR
,	TokenNameCOMMA	
"T?�da translet byla zavedena, av?ak nelze vytvo?it instanci translet."	TokenNameStringLiteral	T?�da translet byla zavedena, av?ak nelze vytvo?it instanci translet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "ErrorListener" is a Java interface name that * should not be translated. The message indicates that the user tried * to set an ErrorListener object on object of the class named in the * substitution text with "null" Java value. */	TokenNameCOMMENT_BLOCK	 Note to translators: "ErrorListener" is a Java interface name that should not be translated. The message indicates that the user tried to set an ErrorListener object on object of the class named in the substitution text with "null" Java value. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier	 ERROR  LISTENER  NULL  ERR
,	TokenNameCOMMA	
"Pokus nastavit objekt ErrorListener pro t?�du ''{0}'' na hodnotu Null"	TokenNameStringLiteral	Pokus nastavit objekt ErrorListener pro t?�du ''{0}'' na hodnotu Null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: StreamSource, SAXSource and DOMSource are Java * interface names that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: StreamSource, SAXSource and DOMSource are Java interface names that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_SOURCE_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  SOURCE  ERR
,	TokenNameCOMMA	
"Pouze prom?nn� StreamSource, SAXSource a DOMSource jsou podporov�ny produktem XSLTC"	TokenNameStringLiteral	Pouze prom?nn� StreamSource, SAXSource a DOMSource jsou podporov�ny produktem XSLTC
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Source" is a Java class name that should not * be translated. The substitution text is the name of Java method. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Source" is a Java class name that should not be translated. The substitution text is the name of Java method. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_SOURCE_ERR	TokenNameIdentifier	 JAXP  NO  SOURCE  ERR
,	TokenNameCOMMA	
"Zdrojov? objekt p?edan? metod? ''{0}'' nem� ?�dn? obsah."	TokenNameStringLiteral	Zdrojov? objekt p?edan? metod? ''{0}'' nem� ?�dn? obsah.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The message indicates that XSLTC failed to * compile the stylesheet into a translet (class file). */	TokenNameCOMMENT_BLOCK	 Note to translators: The message indicates that XSLTC failed to compile the stylesheet into a translet (class file). 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_COMPILE_ERR	TokenNameIdentifier	 JAXP  COMPILE  ERR
,	TokenNameCOMMA	
"Nelze kompilovat p?edlohu se stylem"	TokenNameStringLiteral	Nelze kompilovat p?edlohu se stylem
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "TransformerFactory" is a class name. In this * context, an attribute is a property or setting of the * TransformerFactory object. The substitution text is the name of the * unrecognised attribute. The method used to retrieve the attribute is * "getAttribute", so it's not clear whether it would be best to * translate the term "attribute". */	TokenNameCOMMENT_BLOCK	 Note to translators: "TransformerFactory" is a class name. In this context, an attribute is a property or setting of the TransformerFactory object. The substitution text is the name of the unrecognised attribute. The method used to retrieve the attribute is "getAttribute", so it's not clear whether it would be best to translate the term "attribute". 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier	 JAXP  INVALID  ATTR  ERR
,	TokenNameCOMMA	
"T?�da TransformerFactory nerozpoznala atribut ''{0}''. "	TokenNameStringLiteral	T?�da TransformerFactory nerozpoznala atribut ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "setResult()" and "startDocument()" are Java * method names that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "setResult()" and "startDocument()" are Java method names that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_SET_RESULT_ERR	TokenNameIdentifier	 JAXP  SET  RESULT  ERR
,	TokenNameCOMMA	
"Metoda setResult() mus� b?t vol�na p?ed metodou startDocument()."	TokenNameStringLiteral	Metoda setResult() mus� b?t vol�na p?ed metodou startDocument().
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Transformer" is a Java interface name that * should not be translated. A Transformer object should contained a * reference to a translet object in order to be used for * transformations; this message is produced if that requirement is not * met. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Transformer" is a Java interface name that should not be translated. A Transformer object should contained a reference to a translet object in order to be used for transformations; this message is produced if that requirement is not met. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier	 JAXP  NO  TRANSLET  ERR
,	TokenNameCOMMA	
"Objekt Transformer nem� ?�dn? zapouzd?en? objekt translet."	TokenNameStringLiteral	Objekt Transformer nem� ?�dn? zapouzd?en? objekt translet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The XML document that results from a * transformation needs to be sent to an output handler object; this * message is produced if that requirement is not met. */	TokenNameCOMMENT_BLOCK	 Note to translators: The XML document that results from a transformation needs to be sent to an output handler object; this message is produced if that requirement is not met. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_HANDLER_ERR	TokenNameIdentifier	 JAXP  NO  HANDLER  ERR
,	TokenNameCOMMA	
"Neexistuje ?�dn? definovan? v?stupn� obslu?n? program pro v?sledek transformace."	TokenNameStringLiteral	Neexistuje ?�dn? definovan? v?stupn� obslu?n? program pro v?sledek transformace.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Result" is a Java interface name in this * context. The substitution text is a method name. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Result" is a Java interface name in this context. The substitution text is a method name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_RESULT_ERR	TokenNameIdentifier	 JAXP  NO  RESULT  ERR
,	TokenNameCOMMA	
"V?sledn? objekt p?edan? metod? ''{0}'' je neplatn?."	TokenNameStringLiteral	V?sledn? objekt p?edan? metod? ''{0}'' je neplatn?.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Transformer" is a Java interface name. The * user's program attempted to access an unrecognized property with the * name specified in the substitution text. The method used to retrieve * the property is "getOutputProperty", so it's not clear whether it * would be best to translate the term "property". */	TokenNameCOMMENT_BLOCK	 Note to translators: "Transformer" is a Java interface name. The user's program attempted to access an unrecognized property with the name specified in the substitution text. The method used to retrieve the property is "getOutputProperty", so it's not clear whether it would be best to translate the term "property". 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  PROP  ERR
,	TokenNameCOMMA	
"Pokus o p?�stup k neplatn� vlastnosti objektu Transformer: ''{0}''. "	TokenNameStringLiteral	Pokus o p?�stup k neplatn� vlastnosti objektu Transformer: ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: SAX2DOM is the name of a Java class that should * not be translated. This is an adapter in the sense that it takes a * DOM object and converts it to something that uses the SAX API. */	TokenNameCOMMENT_BLOCK	 Note to translators: SAX2DOM is the name of a Java class that should not be translated. This is an adapter in the sense that it takes a DOM object and converts it to something that uses the SAX API. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SAX2DOM_ADAPTER_ERR	TokenNameIdentifier	 SA X2 DOM  ADAPTER  ERR
,	TokenNameCOMMA	
"Nelze vytvo?it adapt�r SAX2DOM: ''{0}''. "	TokenNameStringLiteral	Nelze vytvo?it adapt�r SAX2DOM: ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "XSLTCSource.build()" is a Java method name. * "systemId" is an XML term that is short for "system identification". */	TokenNameCOMMENT_BLOCK	 Note to translators: "XSLTCSource.build()" is a Java method name. "systemId" is an XML term that is short for "system identification". 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XSLTC_SOURCE_ERR	TokenNameIdentifier	 XSLTC  SOURCE  ERR
,	TokenNameCOMMA	
"Byla vol�na metoda XSLTCSource.build(), ani? by byla nastavena hodnota systemId."	TokenNameStringLiteral	Byla vol�na metoda XSLTCSource.build(), ani? by byla nastavena hodnota systemId.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
"V?sledek by nem?l m�t hodnotu null"	TokenNameStringLiteral	V?sledek by nem?l m�t hodnotu null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message indicates that the value argument * of setParameter must be a valid Java Object. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message indicates that the value argument of setParameter must be a valid Java Object. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 JAXP  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
"Hodnota parametru {0} mus� b?t platn?m objektem technologie Java."	TokenNameStringLiteral	Hodnota parametru {0} mus� b?t platn?m objektem technologie Java.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILE_STDIN_ERR	TokenNameIdentifier	 COMPILE  STDIN  ERR
,	TokenNameCOMMA	
"Volba -i mus� b?t pou?ita s volbou -o."	TokenNameStringLiteral	Volba -i mus� b?t pou?ita s volbou -o.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message contains usage information for a * means of invoking XSLTC from the command-line. The message is * formatted for presentation in English. The strings <output>, * <directory>, etc. indicate user-specified argument values, and can * be translated - the argument <package> refers to a Java package, so * it should be handled in the same way the term is handled for JDK * documentation. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message contains usage information for a means of invoking XSLTC from the command-line. The message is formatted for presentation in English. The strings <output>, <directory>, etc. indicate user-specified argument values, and can be translated - the argument <package> refers to a Java package, so it should be handled in the same way the term is handled for JDK documentation. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILE_USAGE_STR	TokenNameIdentifier	 COMPILE  USAGE  STR
,	TokenNameCOMMA	
"SYNOPSE java org.apache.xalan.xsltc.cmdline.Compile [-o <v?stup>] [-d <adres�?>] [-j <soubor_jar>] [-p <bal�k>] [-n] [-x] [-u] [-v] [-h] { <p?edloha_stylu> | -i } VOLBY -o <v?stup> p?i?ad� k vygenerovan�mu transletu n�zev <v?stup>. Podle v?choz�ho nastaven� je jm�no transletu odvozeno z n�zvu <p?edloha_stylu>. Tato volba se ignoruje, pokud se kompiluj� n�sobn� p?edlohy styl?. -d <adres�?> ur?uje v?choz� adres�? pro translet -j <soubor_jar> zabal� t?�du transletu do souboru jar pojmenovan�ho jako <soubor_jar> -p <bal�k> ur?uje p?edponu n�zvu bal�?ku pro v?echny generovan� t?�dy transletu. -n povoluje zarovn�n� ?ablony (v?choz� chov�n� je v pr?m?ru lep?�) -x zapne dal?� v?stup zpr�vy lad?n� -u interpretuje argumenty <p?edloha_stylu> jako URL -i vynut� ?ten� p?edlohy styl? kompil�torem ze vstupu stdin -v tiskne verzi kompil�toru -h tiskne tyto pokyny k pou?it� "	TokenNameStringLiteral	SYNOPSE java org.apache.xalan.xsltc.cmdline.Compile [-o <v?stup>] [-d <adres�?>] [-j <soubor_jar>] [-p <bal�k>] [-n] [-x] [-u] [-v] [-h] { <p?edloha_stylu> | -i } VOLBY -o <v?stup> p?i?ad� k vygenerovan�mu transletu n�zev <v?stup>. Podle v?choz�ho nastaven� je jm�no transletu odvozeno z n�zvu <p?edloha_stylu>. Tato volba se ignoruje, pokud se kompiluj� n�sobn� p?edlohy styl?. -d <adres�?> ur?uje v?choz� adres�? pro translet -j <soubor_jar> zabal� t?�du transletu do souboru jar pojmenovan�ho jako <soubor_jar> -p <bal�k> ur?uje p?edponu n�zvu bal�?ku pro v?echny generovan� t?�dy transletu. -n povoluje zarovn�n� ?ablony (v?choz� chov�n� je v pr?m?ru lep?�) -x zapne dal?� v?stup zpr�vy lad?n� -u interpretuje argumenty <p?edloha_stylu> jako URL -i vynut� ?ten� p?edlohy styl? kompil�torem ze vstupu stdin -v tiskne verzi kompil�toru -h tiskne tyto pokyny k pou?it� 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message contains usage information for a * means of invoking XSLTC from the command-line. The message is * formatted for presentation in English. The strings <jarfile>, * <document>, etc. indicate user-specified argument values, and can * be translated - the argument <class> refers to a Java class, so it * should be handled in the same way the term is handled for JDK * documentation. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message contains usage information for a means of invoking XSLTC from the command-line. The message is formatted for presentation in English. The strings <jarfile>, <document>, etc. indicate user-specified argument values, and can be translated - the argument <class> refers to a Java class, so it should be handled in the same way the term is handled for JDK documentation. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_USAGE_STR	TokenNameIdentifier	 TRANSFORM  USAGE  STR
,	TokenNameCOMMA	
"SYNOPSE java org.apache.xalan.xsltc.cmdline.Transform [-j <soubor_jar>] [-x] [-n <iterace>] {-u <URL_dokumentu> | <dokument>} <t?�da> [<param1>=<hodn1>...] Pou?�v� translet <t?�da> k transformaci dokumentu XML ur?en�ho parametrem <dokument>. Translet <t?�da> je bu? v u?ivatelsk� cest? CLASSPATH, nebo ve voliteln? ur?en�m souboru <soubor_jar>. VOLBY -j <soubor_jar> ur?uje soubor jar, z n?j? m� b?t translet na?ten -x zap�n� v?stup dal?�ch ladic�ch zpr�v -n <iterace> spou?t� transformaci opakovan?, parametr <iterace> ur?uje po?et opakov�n�, a zobraz� informace o profilu -u <URL_dokumentu> ur?uje adresu URL vstupn�ho dokumentu XML "	TokenNameStringLiteral	SYNOPSE java org.apache.xalan.xsltc.cmdline.Transform [-j <soubor_jar>] [-x] [-n <iterace>] {-u <URL_dokumentu> | <dokument>} <t?�da> [<param1>=<hodn1>...] Pou?�v� translet <t?�da> k transformaci dokumentu XML ur?en�ho parametrem <dokument>. Translet <t?�da> je bu? v u?ivatelsk� cest? CLASSPATH, nebo ve voliteln? ur?en�m souboru <soubor_jar>. VOLBY -j <soubor_jar> ur?uje soubor jar, z n?j? m� b?t translet na?ten -x zap�n� v?stup dal?�ch ladic�ch zpr�v -n <iterace> spou?t� transformaci opakovan?, parametr <iterace> ur?uje po?et opakov�n�, a zobraz� informace o profilu -u <URL_dokumentu> ur?uje adresu URL vstupn�ho dokumentu XML 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:sort>", "<xsl:for-each>" and * "<xsl:apply-templates>" are keywords that should not be translated. * The message indicates that an xsl:sort element must be a child of * one of the other kinds of elements mentioned. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:sort>", "<xsl:for-each>" and "<xsl:apply-templates>" are keywords that should not be translated. The message indicates that an xsl:sort element must be a child of one of the other kinds of elements mentioned. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_SORT_ERR	TokenNameIdentifier	 STRAY  SORT  ERR
,	TokenNameCOMMA	
"Prvek <xsl:sort> m??e b?t pou?it jen v <xsl:for-each> nebo <xsl:apply-templates>."	TokenNameStringLiteral	Prvek <xsl:sort> m??e b?t pou?it jen v <xsl:for-each> nebo <xsl:apply-templates>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The message indicates that the encoding * requested for the output document was on that requires support that * is not available from the Java Virtual Machine being used to execute * the program. */	TokenNameCOMMENT_BLOCK	 Note to translators: The message indicates that the encoding requested for the output document was on that requires support that is not available from the Java Virtual Machine being used to execute the program. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_ENCODING	TokenNameIdentifier	 UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"V?stupn� k�dov�n� ''{0}'' nen� v tomto prost?ed� JVM podporov�no."	TokenNameStringLiteral	V?stupn� k�dov�n� ''{0}'' nen� v tomto prost?ed� JVM podporov�no.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The message indicates that the XPath expression * named in the substitution text was not well formed syntactically. */	TokenNameCOMMENT_BLOCK	 Note to translators: The message indicates that the XPath expression named in the substitution text was not well formed syntactically. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SYNTAX_ERR	TokenNameIdentifier	 SYNTAX  ERR
,	TokenNameCOMMA	
"Chyba syntaxe ve v?razu ''{0}''."	TokenNameStringLiteral	Chyba syntaxe ve v?razu ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a Java * class. The term "constructor" here is the Java term. The message is * displayed if XSLTC could not find a constructor for the specified * class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a Java class. The term "constructor" here is the Java term. The message is displayed if XSLTC could not find a constructor for the specified class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CONSTRUCTOR_NOT_FOUND	TokenNameIdentifier	 CONSTRUCTOR  NOT  FOUND
,	TokenNameCOMMA	
"Nelze naj�t extern� konstruktor ''{0}''."	TokenNameStringLiteral	Nelze naj�t extern� konstruktor ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "static" is the Java keyword. The substitution * text is the name of a function. The first argument of that function * is not of the required type. */	TokenNameCOMMENT_BLOCK	 Note to translators: "static" is the Java keyword. The substitution text is the name of a function. The first argument of that function is not of the required type. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_JAVA_FUNCT_THIS_REF	TokenNameIdentifier	 NO  JAVA  FUNCT  THIS  REF
,	TokenNameCOMMA	
"Prvn� argument nestatick� funkce Java ''{0}'' nen� platn?m odkazem na objekt."	TokenNameStringLiteral	Prvn� argument nestatick� funkce Java ''{0}'' nen� platn?m odkazem na objekt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An XPath expression was not of the type * required in a particular context. The substitution text is the * expression that was in error. */	TokenNameCOMMENT_BLOCK	 Note to translators: An XPath expression was not of the type required in a particular context. The substitution text is the expression that was in error. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TYPE_CHECK_ERR	TokenNameIdentifier	 TYPE  CHECK  ERR
,	TokenNameCOMMA	
"Chyba p?i kontrole typu v?razu ''{0}''. "	TokenNameStringLiteral	Chyba p?i kontrole typu v?razu ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An XPath expression was not of the type * required in a particular context. However, the location of the * problematic expression is unknown. */	TokenNameCOMMENT_BLOCK	 Note to translators: An XPath expression was not of the type required in a particular context. However, the location of the problematic expression is unknown. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TYPE_CHECK_UNK_LOC_ERR	TokenNameIdentifier	 TYPE  CHECK  UNK  LOC  ERR
,	TokenNameCOMMA	
"Chyba p?i kontrole typu v?razu na nezn�m�m m�st?."	TokenNameStringLiteral	Chyba p?i kontrole typu v?razu na nezn�m�m m�st?.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a command- * line option that was not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a command- line option that was not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CMDLINE_OPTION_ERR	TokenNameIdentifier	 ILLEGAL  CMDLINE  OPTION  ERR
,	TokenNameCOMMA	
"Volba p?�kazov�ho ?�dku ''{0}'' nen� platn�."	TokenNameStringLiteral	Volba p?�kazov�ho ?�dku ''{0}'' nen� platn�.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a command- * line option. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a command- line option. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CMDLINE_OPT_MISSING_ARG_ERR	TokenNameIdentifier	 CMDLINE  OPT  MISSING  ARG  ERR
,	TokenNameCOMMA	
"Ve volb? p?�kazov�ho ?�dku ''{0}'' chyb� po?adovan? argument."	TokenNameStringLiteral	Ve volb? p?�kazov�ho ?�dku ''{0}'' chyb� po?adovan? argument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text contains two error * messages. The spacing before the second substitution text indents * it the same amount as the first in English. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text contains two error messages. The spacing before the second substitution text indents it the same amount as the first in English. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier	 WARNING  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
"VAROV�N�: ''{0}'' :{1}"	TokenNameStringLiteral	VAROV�N�: ''{0}'' :{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text is an error message. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text is an error message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WARNING_MSG	TokenNameIdentifier	 WARNING  MSG
,	TokenNameCOMMA	
"VAROV�N�: ''{0}''"	TokenNameStringLiteral	VAROV�N�: ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text contains two error * messages. The spacing before the second substitution text indents * it the same amount as the first in English. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text contains two error messages. The spacing before the second substitution text indents it the same amount as the first in English. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 FATAL  ERR  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
"Z�VA?N� CHYBA:''{0}'' :{1}"	TokenNameStringLiteral	Z�VA?N� CHYBA:''{0}'' :{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text is an error message. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text is an error message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FATAL_ERR_MSG	TokenNameIdentifier	 FATAL  ERR  MSG
,	TokenNameCOMMA	
"Z�VA?N� CHYBA:''{0}''"	TokenNameStringLiteral	Z�VA?N� CHYBA:''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text contains two error * messages. The spacing before the second substitution text indents * it the same amount as the first in English. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text contains two error messages. The spacing before the second substitution text indents it the same amount as the first in English. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 ERROR  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
"CHYBA: ''{0}'' :{1}"	TokenNameStringLiteral	CHYBA: ''{0}'' :{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text is an error message. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text is an error message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_MSG	TokenNameIdentifier	 ERROR  MSG
,	TokenNameCOMMA	
"CHYBA: ''{0}''"	TokenNameStringLiteral	CHYBA: ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_WITH_TRANSLET_STR	TokenNameIdentifier	 TRANSFORM  WITH  TRANSLET  STR
,	TokenNameCOMMA	
"Transformace s pou?it�m transletu ''{0}'' "	TokenNameStringLiteral	Transformace s pou?it�m transletu ''{0}'' 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The first substitution is the name of a class, * while the second substitution is the name of a jar file. */	TokenNameCOMMENT_BLOCK	 Note to translators: The first substitution is the name of a class, while the second substitution is the name of a jar file. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_WITH_JAR_STR	TokenNameIdentifier	 TRANSFORM  WITH  JAR  STR
,	TokenNameCOMMA	
"Transformace s pou?it�m transletu ''{0}'' ze souboru JAR ''{1}'' "	TokenNameStringLiteral	Transformace s pou?it�m transletu ''{0}'' ze souboru JAR ''{1}'' 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "TransformerFactory" is the name of a Java * interface and must not be translated. The substitution text is * the name of the class that could not be instantiated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "TransformerFactory" is the name of a Java interface and must not be translated. The substitution text is the name of the class that could not be instantiated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COULD_NOT_CREATE_TRANS_FACT	TokenNameIdentifier	 COULD  NOT  CREATE  TRANS  FACT
,	TokenNameCOMMA	
"Nelze vytvo?it instanci t?�dy TransformerFactory ''{0}''."	TokenNameStringLiteral	Nelze vytvo?it instanci t?�dy TransformerFactory ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is produced when the user * specified a name for the translet class that contains characters * that are not permitted in a Java class name. The substitution * text "{0}" specifies the name the user requested, while "{1}" * specifies the name the processor used instead. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is produced when the user specified a name for the translet class that contains characters that are not permitted in a Java class name. The substitution text "{0}" specifies the name the user requested, while "{1}" specifies the name the processor used instead. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_NAME_JAVA_CONFLICT	TokenNameIdentifier	 TRANSLET  NAME  JAVA  CONFLICT
,	TokenNameCOMMA	
"Jm�no ''{0}'' nelze pou?�t jako jm�no t?�dy translet?, proto?e obsahuje znaky, kter� nejsou ve jm�nu t?�dy jazyka Java povoleny. Pou?ito bylo jm�no ''{1}''."	TokenNameStringLiteral	Jm�no ''{0}'' nelze pou?�t jako jm�no t?�dy translet?, proto?e obsahuje znaky, kter� nejsou ve jm�nu t?�dy jazyka Java povoleny. Pou?ito bylo jm�no ''{1}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message is used as a header. * All the error messages are collected together and displayed beneath * this message. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message is used as a header. All the error messages are collected together and displayed beneath this message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILER_ERROR_KEY	TokenNameIdentifier	 COMPILER  ERROR  KEY
,	TokenNameCOMMA	
"Chyby kompil�toru:"	TokenNameStringLiteral	Chyby kompil�toru:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message is used as a header. * All the warning messages are collected together and displayed * beneath this message. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message is used as a header. All the warning messages are collected together and displayed beneath this message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILER_WARNING_KEY	TokenNameIdentifier	 COMPILER  WARNING  KEY
,	TokenNameCOMMA	
"Varov�n� kompil�toru:"	TokenNameStringLiteral	Varov�n� kompil�toru:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message is used as a header. * All the error messages that are produced when the stylesheet is * applied to an input document are collected together and displayed * beneath this message. A 'translet' is the compiled form of a * stylesheet (see above). */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message is used as a header. All the error messages that are produced when the stylesheet is applied to an input document are collected together and displayed beneath this message. A 'translet' is the compiled form of a stylesheet (see above). 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
RUNTIME_ERROR_KEY	TokenNameIdentifier	 RUNTIME  ERROR  KEY
,	TokenNameCOMMA	
"Chyby transletu:"	TokenNameStringLiteral	Chyby transletu:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute whose value is constrained to * be a "QName" or a list of "QNames" had a value that was incorrect. * 'QName' is an XML syntactic term that must not be translated. The * substitution text contains the actual value of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute whose value is constrained to be a "QName" or a list of "QNames" had a value that was incorrect. 'QName' is an XML syntactic term that must not be translated. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_QNAME_ERR	TokenNameIdentifier	 INVALID  QNAME  ERR
,	TokenNameCOMMA	
"Atribut, jeho? hodnota mus� b?t jm�no QName nebo seznam jmen QName odd?len?ch mezerami, m� hodnotu ''{0}''. "	TokenNameStringLiteral	Atribut, jeho? hodnota mus� b?t jm�no QName nebo seznam jmen QName odd?len?ch mezerami, m� hodnotu ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute whose value is required to * be an "NCName". * 'NCName' is an XML syntactic term that must not be translated. The * substitution text contains the actual value of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute whose value is required to be an "NCName". 'NCName' is an XML syntactic term that must not be translated. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_NCNAME_ERR	TokenNameIdentifier	 INVALID  NCNAME  ERR
,	TokenNameCOMMA	
"Atribut, jeho? hodnota mus� b?t jm�no NCName, m� hodnotu ''{0}''. "	TokenNameStringLiteral	Atribut, jeho? hodnota mus� b?t jm�no NCName, m� hodnotu ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute with an incorrect value was * encountered. The permitted value is one of the literal values * "xml", "html" or "text"; it is also permitted to have the form of * a QName that is not also an NCName. The terms "method", * "xsl:output", "xml", "html" and "text" are keywords that must not * be translated. The term "qname-but-not-ncname" is an XML syntactic * term. The substitution text contains the actual value of the * attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute with an incorrect value was encountered. The permitted value is one of the literal values "xml", "html" or "text"; it is also permitted to have the form of a QName that is not also an NCName. The terms "method", "xsl:output", "xml", "html" and "text" are keywords that must not be translated. The term "qname-but-not-ncname" is an XML syntactic term. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_METHOD_IN_OUTPUT	TokenNameIdentifier	 INVALID  METHOD  IN  OUTPUT
,	TokenNameCOMMA	
"Atribut metody prvku <xsl:output> m� hodnotu ''{0}''. Hodnotou mus� b?t ?et?zec ''xml'', ''html'', ''text'' nebo jm�no QName, kter� nen� jm�nem NCName."	TokenNameStringLiteral	Atribut metody prvku <xsl:output> m� hodnotu ''{0}''. Hodnotou mus� b?t ?et?zec ''xml'', ''html'', ''text'' nebo jm�no QName, kter� nen� jm�nem NCName.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 JAXP  GET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"N�zev funkce pou?it? ve vol�n� TransformerFactory.getFeature(?et?zec n�zvu) nesm� m�t hodnotu Null. "	TokenNameStringLiteral	N�zev funkce pou?it? ve vol�n� TransformerFactory.getFeature(?et?zec n�zvu) nesm� m�t hodnotu Null. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 JAXP  SET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"N�zev funkce pou?it? ve vol�n� TransformerFactory.setFeature(?et?zec n�zvu, booleovsk� hodnota) nesm� m�t hodnotu Null. "	TokenNameStringLiteral	N�zev funkce pou?it? ve vol�n� TransformerFactory.setFeature(?et?zec n�zvu, booleovsk� hodnota) nesm� m�t hodnotu Null. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNSUPPORTED_FEATURE	TokenNameIdentifier	 JAXP  UNSUPPORTED  FEATURE
,	TokenNameCOMMA	
"Nelze nastavit funkci ''{0}'' pro tuto t?�du TransformerFactory. "	TokenNameStringLiteral	Nelze nastavit funkci ''{0}'' pro tuto t?�du TransformerFactory. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
