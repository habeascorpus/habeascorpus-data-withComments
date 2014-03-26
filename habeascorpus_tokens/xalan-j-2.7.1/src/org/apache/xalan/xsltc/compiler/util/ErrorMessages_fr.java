/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ErrorMessages_fr.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ErrorMessages_fr.java 468649 2006-10-28 07:00:55Z minchau $ 
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
ErrorMessages_fr	TokenNameIdentifier	 Error Messages fr
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
"Plusieurs feuilles de style ont été définies dans le même fichier."	TokenNameStringLiteral	Plusieurs feuilles de style ont été définies dans le même fichier.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a * template. The same name was used on two different templates in the * same stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a template. The same name was used on two different templates in the same stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TEMPLATE_REDEF_ERR	TokenNameIdentifier	 TEMPLATE  REDEF  ERR
,	TokenNameCOMMA	
"Le modèle ''{0}'' est déjà défini dans cette feuille de style."	TokenNameStringLiteral	Le modèle ''{0}'' est déjà défini dans cette feuille de style.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a * template. A reference to the template name was encountered, but the * template is undefined. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a template. A reference to the template name was encountered, but the template is undefined. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TEMPLATE_UNDEF_ERR	TokenNameIdentifier	 TEMPLATE  UNDEF  ERR
,	TokenNameCOMMA	
"Le modèle ''{0}'' n''est pas défini dans cette feuille de style."	TokenNameStringLiteral	Le modèle ''{0}'' n''est pas défini dans cette feuille de style.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a variable * that was defined more than once. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a variable that was defined more than once. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
VARIABLE_REDEF_ERR	TokenNameIdentifier	 VARIABLE  REDEF  ERR
,	TokenNameCOMMA	
"La variable ''{0}'' est définie plusieurs fois dans la même portée."	TokenNameStringLiteral	La variable ''{0}'' est définie plusieurs fois dans la même portée.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a variable * or parameter. A reference to the variable or parameter was found, * but it was never defined. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a variable or parameter. A reference to the variable or parameter was found, but it was never defined. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
VARIABLE_UNDEF_ERR	TokenNameIdentifier	 VARIABLE  UNDEF  ERR
,	TokenNameCOMMA	
"La variable ou le paramètre ''{0}'' n''est pas défini."	TokenNameStringLiteral	La variable ou le paramètre ''{0}'' n''est pas défini.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The word "class" here refers to a Java class. * Processing the stylesheet required a class to be loaded, but it could * not be found. The substitution text is the name of the class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The word "class" here refers to a Java class. Processing the stylesheet required a class to be loaded, but it could not be found. The substitution text is the name of the class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CLASS_NOT_FOUND_ERR	TokenNameIdentifier	 CLASS  NOT  FOUND  ERR
,	TokenNameCOMMA	
"La classe ''{0}'' est introuvable."	TokenNameStringLiteral	La classe ''{0}'' est introuvable.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The word "method" here refers to a Java method. * Processing the stylesheet required a reference to the method named by * the substitution text, but it could not be found. "public" is the * Java keyword. */	TokenNameCOMMENT_BLOCK	 Note to translators: The word "method" here refers to a Java method. Processing the stylesheet required a reference to the method named by the substitution text, but it could not be found. "public" is the Java keyword. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
METHOD_NOT_FOUND_ERR	TokenNameIdentifier	 METHOD  NOT  FOUND  ERR
,	TokenNameCOMMA	
"La méthode externe ''{0}'' est introuvable (doit être public)."	TokenNameStringLiteral	La méthode externe ''{0}'' est introuvable (doit être public).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The word "method" here refers to a Java method. * Processing the stylesheet required a reference to the method named by * the substitution text, but no method with the required types of * arguments or return type could be found. */	TokenNameCOMMENT_BLOCK	 Note to translators: The word "method" here refers to a Java method. Processing the stylesheet required a reference to the method named by the substitution text, but no method with the required types of arguments or return type could be found. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ARGUMENT_CONVERSION_ERR	TokenNameIdentifier	 ARGUMENT  CONVERSION  ERR
,	TokenNameCOMMA	
"Impossible de convertir le type d''argument/de retour lors de l''appel de la méthode ''{0}''"	TokenNameStringLiteral	Impossible de convertir le type d''argument/de retour lors de l''appel de la méthode ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The file or URI named in the substitution text * is missing. */	TokenNameCOMMENT_BLOCK	 Note to translators: The file or URI named in the substitution text is missing. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FILE_NOT_FOUND_ERR	TokenNameIdentifier	 FILE  NOT  FOUND  ERR
,	TokenNameCOMMA	
"Le fichier ou l'' URI ''{0}'' est introuvable."	TokenNameStringLiteral	Le fichier ou l'' URI ''{0}'' est introuvable.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is displayed when the URI * mentioned in the substitution text is not well-formed syntactically. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is displayed when the URI mentioned in the substitution text is not well-formed syntactically. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_URI_ERR	TokenNameIdentifier	 INVALID  URI  ERR
,	TokenNameCOMMA	
"URI non valide ''{0}''."	TokenNameStringLiteral	URI non valide ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The file or URI named in the substitution text * exists but could not be opened. */	TokenNameCOMMENT_BLOCK	 Note to translators: The file or URI named in the substitution text exists but could not be opened. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FILE_ACCESS_ERR	TokenNameIdentifier	 FILE  ACCESS  ERR
,	TokenNameCOMMA	
"Impossible d''ouvrir le fichier ou l''URI ''{0}''."	TokenNameStringLiteral	Impossible d''ouvrir le fichier ou l''URI ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: <xsl:stylesheet> and <xsl:transform> are * keywords that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: <xsl:stylesheet> and <xsl:transform> are keywords that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_ROOT_ERR	TokenNameIdentifier	 MISSING  ROOT  ERR
,	TokenNameCOMMA	
"L'élément <xsl:stylesheet> ou <xsl:transform> est attendu."	TokenNameStringLiteral	L'élément <xsl:stylesheet> ou <xsl:transform> est attendu.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained a reference to a * namespace prefix that was undefined. The value of the substitution * text is the name of the prefix. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained a reference to a namespace prefix that was undefined. The value of the substitution text is the name of the prefix. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NAMESPACE_UNDEF_ERR	TokenNameIdentifier	 NAMESPACE  UNDEF  ERR
,	TokenNameCOMMA	
"Le préfixe de l''espace de noms ''{0}'' n''est pas déclaré."	TokenNameStringLiteral	Le préfixe de l''espace de noms ''{0}'' n''est pas déclaré.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The Java function named in the stylesheet could * not be found. */	TokenNameCOMMENT_BLOCK	 Note to translators: The Java function named in the stylesheet could not be found. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FUNCTION_RESOLVE_ERR	TokenNameIdentifier	 FUNCTION  RESOLVE  ERR
,	TokenNameCOMMA	
"Impossible de résoudre l''appel à la fonction ''{0}''."	TokenNameStringLiteral	Impossible de résoudre l''appel à la fonction ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a * function. A literal string here means a constant string value. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a function. A literal string here means a constant string value. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NEED_LITERAL_ERR	TokenNameIdentifier	 NEED  LITERAL  ERR
,	TokenNameCOMMA	
"L''argument de ''{0}'' doit être une chaîne littérale."	TokenNameStringLiteral	L''argument de ''{0}'' doit être une chaîne littérale.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message indicates there was a syntactic * error in the form of an XPath expression. The substitution text is * the expression. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message indicates there was a syntactic error in the form of an XPath expression. The substitution text is the expression. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XPATH_PARSER_ERR	TokenNameIdentifier	 XPATH  PARSER  ERR
,	TokenNameCOMMA	
"Erreur lors de l''analyse de l''expression XPath ''{0}''."	TokenNameStringLiteral	Erreur lors de l''analyse de l''expression XPath ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An element in the stylesheet requires a * particular attribute named by the substitution text, but that * attribute was not specified in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: An element in the stylesheet requires a particular attribute named by the substitution text, but that attribute was not specified in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
REQUIRED_ATTR_ERR	TokenNameIdentifier	 REQUIRED  ATTR  ERR
,	TokenNameCOMMA	
"L''attribut obligatoire ''{0}'' est absent."	TokenNameStringLiteral	L''attribut obligatoire ''{0}'' est absent.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message indicates that a character not * permitted in an XPath expression was encountered. The substitution * text is the offending character. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message indicates that a character not permitted in an XPath expression was encountered. The substitution text is the offending character. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CHAR_ERR	TokenNameIdentifier	 ILLEGAL  CHAR  ERR
,	TokenNameCOMMA	
"Caractère ''{0}'' non conforme dans l''expression XPath."	TokenNameStringLiteral	Caractère ''{0}'' non conforme dans l''expression XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: A processing instruction is a mark-up item in * an XML document that request some behaviour of an XML processor. The * form of the name of was invalid in this case, and the substitution * text is the name. */	TokenNameCOMMENT_BLOCK	 Note to translators: A processing instruction is a mark-up item in an XML document that request some behaviour of an XML processor. The form of the name of was invalid in this case, and the substitution text is the name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_PI_ERR	TokenNameIdentifier	 ILLEGAL  PI  ERR
,	TokenNameCOMMA	
"Nom ''{0}'' non conforme dans l''instruction de traitement."	TokenNameStringLiteral	Nom ''{0}'' non conforme dans l''instruction de traitement.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is reported if the stylesheet * being processed attempted to construct an XML document with an * attribute in a place other than on an element. The substitution text * specifies the name of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is reported if the stylesheet being processed attempted to construct an XML document with an attribute in a place other than on an element. The substitution text specifies the name of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier	 STRAY  ATTRIBUTE  ERR
,	TokenNameCOMMA	
"L''attribut ''{0}'' est à l''extérieur de l''élément."	TokenNameStringLiteral	L''attribut ''{0}'' est à l''extérieur de l''élément.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute that wasn't recognized was * specified on an element in the stylesheet. The attribute is named * by the substitution * text. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute that wasn't recognized was specified on an element in the stylesheet. The attribute is named by the substitution text. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ATTRIBUTE_ERR	TokenNameIdentifier	 ILLEGAL  ATTRIBUTE  ERR
,	TokenNameCOMMA	
"Attribut ''{0}'' non conforme."	TokenNameStringLiteral	Attribut ''{0}'' non conforme.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "import" and "include" are keywords that should * not be translated. This messages indicates that the stylesheet * named in the substitution text imported or included itself either * directly or indirectly. */	TokenNameCOMMENT_BLOCK	 Note to translators: "import" and "include" are keywords that should not be translated. This messages indicates that the stylesheet named in the substitution text imported or included itself either directly or indirectly. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CIRCULAR_INCLUDE_ERR	TokenNameIdentifier	 CIRCULAR  INCLUDE  ERR
,	TokenNameCOMMA	
"import/include circulaire. La feuille de style ''{0}'' est déjà chargée."	TokenNameStringLiteral	import/include circulaire. La feuille de style ''{0}'' est déjà chargée.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: A result-tree fragment is a portion of a * resulting XML document represented as a tree. "<xsl:sort>" is a * keyword and should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: A result-tree fragment is a portion of a resulting XML document represented as a tree. "<xsl:sort>" is a keyword and should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
RESULT_TREE_SORT_ERR	TokenNameIdentifier	 RESULT  TREE  SORT  ERR
,	TokenNameCOMMA	
"Tri impossible des fragments de l'arborescence de résultats (les éléments <xsl:sort> sont ignorés). Vous devez trier les noeuds lors de la création de l'arborescence de résultats."	TokenNameStringLiteral	Tri impossible des fragments de l'arborescence de résultats (les éléments <xsl:sort> sont ignorés). Vous devez trier les noeuds lors de la création de l'arborescence de résultats.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: A name can be given to a particular style to be * used to format decimal values. The substitution text gives the name * of such a style for which more than one declaration was encountered. */	TokenNameCOMMENT_BLOCK	 Note to translators: A name can be given to a particular style to be used to format decimal values. The substitution text gives the name of such a style for which more than one declaration was encountered. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SYMBOLS_REDEF_ERR	TokenNameIdentifier	 SYMBOLS  REDEF  ERR
,	TokenNameCOMMA	
"Le formatage décimal ''{0}'' est déjà défini."	TokenNameStringLiteral	Le formatage décimal ''{0}'' est déjà défini.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet version named in the * substitution text is not supported. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet version named in the substitution text is not supported. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XSL_VERSION_ERR	TokenNameIdentifier	 XSL  VERSION  ERR
,	TokenNameCOMMA	
"La version XSL ''{0}'' n''est pas prise en charge par XSLTC."	TokenNameStringLiteral	La version XSL ''{0}'' n''est pas prise en charge par XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The definitions of one or more variables or * parameters depend on one another. */	TokenNameCOMMENT_BLOCK	 Note to translators: The definitions of one or more variables or parameters depend on one another. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier	 CIRCULAR  VARIABLE  ERR
,	TokenNameCOMMA	
"Référence variable/paramètre circulaire dans ''{0}''."	TokenNameStringLiteral	Référence variable/paramètre circulaire dans ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The operator in an expresion with two operands was * not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The operator in an expresion with two operands was not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier	 ILLEGAL  BINARY  OP  ERR
,	TokenNameCOMMA	
"Opérateur inconnu dans une expression binaire."	TokenNameStringLiteral	Opérateur inconnu dans une expression binaire.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is produced if a reference to a * function has too many or too few arguments. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is produced if a reference to a function has too many or too few arguments. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ARG_ERR	TokenNameIdentifier	 ILLEGAL  ARG  ERR
,	TokenNameCOMMA	
"Argument(s) incorrect(s) pour l'appel de fonction."	TokenNameStringLiteral	Argument(s) incorrect(s) pour l'appel de fonction.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "document()" is the name of function and must * not be translated. A node-set is a set of the nodes in the tree * representation of an XML document. */	TokenNameCOMMENT_BLOCK	 Note to translators: "document()" is the name of function and must not be translated. A node-set is a set of the nodes in the tree representation of an XML document. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
DOCUMENT_ARG_ERR	TokenNameIdentifier	 DOCUMENT  ARG  ERR
,	TokenNameCOMMA	
"Le deuxième argument de la fonction document() doit être un ensemble de noeuds."	TokenNameStringLiteral	Le deuxième argument de la fonction document() doit être un ensemble de noeuds.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords * and should not be translated. This message describes a syntax error * in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_WHEN_ERR	TokenNameIdentifier	 MISSING  WHEN  ERR
,	TokenNameCOMMA	
"Au moins un élément <xsl:when> est requis dans <xsl:choose>."	TokenNameStringLiteral	Au moins un élément <xsl:when> est requis dans <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are * keywords and should not be translated. This message describes a * syntax error in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MULTIPLE_OTHERWISE_ERR	TokenNameIdentifier	 MULTIPLE  OTHERWISE  ERR
,	TokenNameCOMMA	
"Un seul élément <xsl:otherwise> est autorisé dans <xsl:choose>."	TokenNameStringLiteral	Un seul élément <xsl:otherwise> est autorisé dans <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are * keywords and should not be translated. This message describes a * syntax error in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:otherwise>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_OTHERWISE_ERR	TokenNameIdentifier	 STRAY  OTHERWISE  ERR
,	TokenNameCOMMA	
"<xsl:otherwise> peut être utilisé uniquement dans <xsl:choose>."	TokenNameStringLiteral	<xsl:otherwise> peut être utilisé uniquement dans <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords * and should not be translated. This message describes a syntax error * in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:when>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_WHEN_ERR	TokenNameIdentifier	 STRAY  WHEN  ERR
,	TokenNameCOMMA	
"<xsl:when> peut être utilisé uniquement dans <xsl:choose>."	TokenNameStringLiteral	<xsl:when> peut être utilisé uniquement dans <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:when>", "<xsl:otherwise>" and * "<xsl:choose>" are keywords and should not be translated. This * message describes a syntax error in the stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:when>", "<xsl:otherwise>" and "<xsl:choose>" are keywords and should not be translated. This message describes a syntax error in the stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WHEN_ELEMENT_ERR	TokenNameIdentifier	 WHEN  ELEMENT  ERR
,	TokenNameCOMMA	
"Seuls les éléments <xsl:when> et <xsl:otherwise> sont autorisés dans <xsl:choose>."	TokenNameStringLiteral	Seuls les éléments <xsl:when> et <xsl:otherwise> sont autorisés dans <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:attribute-set>" and "name" are keywords * that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:attribute-set>" and "name" are keywords that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNNAMED_ATTRIBSET_ERR	TokenNameIdentifier	 UNNAMED  ATTRIBSET  ERR
,	TokenNameCOMMA	
"Attribut 'name' absent de <xsl:attribute-set>."	TokenNameStringLiteral	Attribut 'name' absent de <xsl:attribute-set>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An element in the stylesheet contained an * element of a type that it was not permitted to contain. */	TokenNameCOMMENT_BLOCK	 Note to translators: An element in the stylesheet contained an element of a type that it was not permitted to contain. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CHILD_ERR	TokenNameIdentifier	 ILLEGAL  CHILD  ERR
,	TokenNameCOMMA	
"Elément enfant incorrect."	TokenNameStringLiteral	Elément enfant incorrect.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet tried to create an element with * a name that was not a valid XML name. The substitution text contains * the name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet tried to create an element with a name that was not a valid XML name. The substitution text contains the name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ELEM_NAME_ERR	TokenNameIdentifier	 ILLEGAL  ELEM  NAME  ERR
,	TokenNameCOMMA	
"Vous ne pouvez pas appeler un élément ''{0}''"	TokenNameStringLiteral	Vous ne pouvez pas appeler un élément ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet tried to create an attribute * with a name that was not a valid XML name. The substitution text * contains the name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet tried to create an attribute with a name that was not a valid XML name. The substitution text contains the name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ATTR_NAME_ERR	TokenNameIdentifier	 ILLEGAL  ATTR  NAME  ERR
,	TokenNameCOMMA	
"Vous ne pouvez pas appeler un attribut ''{0}''"	TokenNameStringLiteral	Vous ne pouvez pas appeler un attribut ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The children of the outermost element of a * stylesheet are referred to as top-level elements. No text should * occur within that outermost element unless it is within a top-level * element. This message indicates that that constraint was violated. * "<xsl:stylesheet>" is a keyword that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: The children of the outermost element of a stylesheet are referred to as top-level elements. No text should occur within that outermost element unless it is within a top-level element. This message indicates that that constraint was violated. "<xsl:stylesheet>" is a keyword that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_TEXT_NODE_ERR	TokenNameIdentifier	 ILLEGAL  TEXT  NODE  ERR
,	TokenNameCOMMA	
"Données textuelles à l'extérieur de l'élément de niveau supérieur <xsl:stylesheet>."	TokenNameStringLiteral	Données textuelles à l'extérieur de l'élément de niveau supérieur <xsl:stylesheet>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: JAXP is an acronym for the Java API for XML * Processing. This message indicates that the XML parser provided to * XSLTC to process the XML input document had a configuration problem. */	TokenNameCOMMENT_BLOCK	 Note to translators: JAXP is an acronym for the Java API for XML Processing. This message indicates that the XML parser provided to XSLTC to process the XML input document had a configuration problem. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SAX_PARSER_CONFIG_ERR	TokenNameIdentifier	 SAX  PARSER  CONFIG  ERR
,	TokenNameCOMMA	
"L'analyseur JAXP n'est pas configuré correctement"	TokenNameStringLiteral	L'analyseur JAXP n'est pas configuré correctement
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text names the internal error * encountered. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text names the internal error encountered. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INTERNAL_ERR	TokenNameIdentifier	 INTERNAL  ERR
,	TokenNameCOMMA	
"Erreur interne à XSLTC irrémédiable : ''{0}''"	TokenNameStringLiteral	Erreur interne à XSLTC irrémédiable : ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained an element that was * not recognized as part of the XSL syntax. The substitution text * gives the element name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained an element that was not recognized as part of the XSL syntax. The substitution text gives the element name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_XSL_ERR	TokenNameIdentifier	 UNSUPPORTED  XSL  ERR
,	TokenNameCOMMA	
"Elément XSL non pris en charge ''{0}''."	TokenNameStringLiteral	Elément XSL non pris en charge ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet referred to an extension to the * XSL syntax and indicated that it was defined by XSLTC, but XSTLC does * not recognized the particular extension named. The substitution text * gives the extension name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet referred to an extension to the XSL syntax and indicated that it was defined by XSLTC, but XSTLC does not recognized the particular extension named. The substitution text gives the extension name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_EXT_ERR	TokenNameIdentifier	 UNSUPPORTED  EXT  ERR
,	TokenNameCOMMA	
"Extension XSLTC ''{0}'' non reconnue."	TokenNameStringLiteral	Extension XSLTC ''{0}'' non reconnue.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The XML document given to XSLTC as a stylesheet * was not, in fact, a stylesheet. XSLTC is able to detect that in this * case because the outermost element in the stylesheet has to be * declared with respect to the XSL namespace URI, but no declaration * for that namespace was seen. */	TokenNameCOMMENT_BLOCK	 Note to translators: The XML document given to XSLTC as a stylesheet was not, in fact, a stylesheet. XSLTC is able to detect that in this case because the outermost element in the stylesheet has to be declared with respect to the XSL namespace URI, but no declaration for that namespace was seen. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_XSLT_URI_ERR	TokenNameIdentifier	 MISSING  XSLT  URI  ERR
,	TokenNameCOMMA	
"Le document de base n'est pas une feuille de style (l'espace de noms XSL n'est pas déclaré dans l'élément root)."	TokenNameStringLiteral	Le document de base n'est pas une feuille de style (l'espace de noms XSL n'est pas déclaré dans l'élément root).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: XSLTC could not find the stylesheet document * with the name specified by the substitution text. */	TokenNameCOMMENT_BLOCK	 Note to translators: XSLTC could not find the stylesheet document with the name specified by the substitution text. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_XSLT_TARGET_ERR	TokenNameIdentifier	 MISSING  XSLT  TARGET  ERR
,	TokenNameCOMMA	
"La feuille de style cible ''{0}'' est introuvable."	TokenNameStringLiteral	La feuille de style cible ''{0}'' est introuvable.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message represents an internal error in * condition in XSLTC. The substitution text is the class name in XSLTC * that is missing some functionality. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message represents an internal error in condition in XSLTC. The substitution text is the class name in XSLTC that is missing some functionality. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NOT_IMPLEMENTED_ERR	TokenNameIdentifier	 NOT  IMPLEMENTED  ERR
,	TokenNameCOMMA	
"Non implémenté : ''{0}''."	TokenNameStringLiteral	Non implémenté : ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The XML document given to XSLTC as a stylesheet * was not, in fact, a stylesheet. */	TokenNameCOMMENT_BLOCK	 Note to translators: The XML document given to XSLTC as a stylesheet was not, in fact, a stylesheet. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NOT_STYLESHEET_ERR	TokenNameIdentifier	 NOT  STYLESHEET  ERR
,	TokenNameCOMMA	
"Le document de base ne contient pas de feuille de style XSL."	TokenNameStringLiteral	Le document de base ne contient pas de feuille de style XSL.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The element named in the substitution text was * encountered in the stylesheet but is not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The element named in the substitution text was encountered in the stylesheet but is not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ELEMENT_PARSE_ERR	TokenNameIdentifier	 ELEMENT  PARSE  ERR
,	TokenNameCOMMA	
"Impossible d''analyser l''élément ''{0}''"	TokenNameStringLiteral	Impossible d''analyser l''élément ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "use", "<key>", "node", "node-set", "string" * and "number" are keywords in this context and should not be * translated. This message indicates that the value of the "use" * attribute was not one of the permitted values. */	TokenNameCOMMENT_BLOCK	 Note to translators: "use", "<key>", "node", "node-set", "string" and "number" are keywords in this context and should not be translated. This message indicates that the value of the "use" attribute was not one of the permitted values. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
KEY_USE_ATTR_ERR	TokenNameIdentifier	 KEY  USE  ATTR  ERR
,	TokenNameCOMMA	
"L'attribut use de <key> doit avoir la valeur node, node-set, string ou number."	TokenNameStringLiteral	L'attribut use de <key> doit avoir la valeur node, node-set, string ou number.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An XML document can specify the version of the * XML specification to which it adheres. This message indicates that * the version specified for the output document was not valid. */	TokenNameCOMMENT_BLOCK	 Note to translators: An XML document can specify the version of the XML specification to which it adheres. This message indicates that the version specified for the output document was not valid. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
OUTPUT_VERSION_ERR	TokenNameIdentifier	 OUTPUT  VERSION  ERR
,	TokenNameCOMMA	
"La version du document XML de sortie doit être 1.0"	TokenNameStringLiteral	La version du document XML de sortie doit être 1.0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The operator in a comparison operation was * not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The operator in a comparison operation was not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_RELAT_OP_ERR	TokenNameIdentifier	 ILLEGAL  RELAT  OP  ERR
,	TokenNameCOMMA	
"Opérateur inconnu dans une expression relationnelle."	TokenNameStringLiteral	Opérateur inconnu dans une expression relationnelle.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute set defines as a set of XML * attributes that can be added to an element in the output XML document * as a group. This message is reported if the name specified was not * used to declare an attribute set. The substitution text is the name * that is in error. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute set defines as a set of XML attributes that can be added to an element in the output XML document as a group. This message is reported if the name specified was not used to declare an attribute set. The substitution text is the name that is in error. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ATTRIBSET_UNDEF_ERR	TokenNameIdentifier	 ATTRIBSET  UNDEF  ERR
,	TokenNameCOMMA	
"Tentative d''utilisation d''un jeu d''attributs ''{0}'' inexistant."	TokenNameStringLiteral	Tentative d''utilisation d''un jeu d''attributs ''{0}'' inexistant.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The term "attribute value template" is a term * defined by XSLT which describes the value of an attribute that is * determined by an XPath expression. The message indicates that the * expression was syntactically incorrect; the substitution text * contains the expression that was in error. */	TokenNameCOMMENT_BLOCK	 Note to translators: The term "attribute value template" is a term defined by XSLT which describes the value of an attribute that is determined by an XPath expression. The message indicates that the expression was syntactically incorrect; the substitution text contains the expression that was in error. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ATTR_VAL_TEMPLATE_ERR	TokenNameIdentifier	 ATTR  VAL  TEMPLATE  ERR
,	TokenNameCOMMA	
"Impossible d''analyser le modèle de valeur d''attribut ''{0}''."	TokenNameStringLiteral	Impossible d''analyser le modèle de valeur d''attribut ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: ??? */	TokenNameCOMMENT_BLOCK	 Note to translators: ??? 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNKNOWN_SIG_TYPE_ERR	TokenNameIdentifier	 UNKNOWN  SIG  TYPE  ERR
,	TokenNameCOMMA	
"Type de données inconnu dans la signature pour la classe ''{0}''."	TokenNameStringLiteral	Type de données inconnu dans la signature pour la classe ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text refers to data types. * The message is displayed if a value in a particular context needs to * be converted to type {1}, but that's not possible for a value of * type {0}. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text refers to data types. The message is displayed if a value in a particular context needs to be converted to type {1}, but that's not possible for a value of type {0}. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
DATA_CONVERSION_ERR	TokenNameIdentifier	 DATA  CONVERSION  ERR
,	TokenNameCOMMA	
"Impossible de convertir le type de données ''{0}'' en ''{1}''."	TokenNameStringLiteral	Impossible de convertir le type de données ''{0}'' en ''{1}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Templates" is a Java class name that should * not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Templates" is a Java class name that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_TRANSLET_CLASS_ERR	TokenNameIdentifier	 NO  TRANSLET  CLASS  ERR
,	TokenNameCOMMA	
"Cette classe Templates ne contient pas de définition de classe translet valide."	TokenNameStringLiteral	Cette classe Templates ne contient pas de définition de classe translet valide.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Templates" is a Java class name that should * not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Templates" is a Java class name that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_MAIN_TRANSLET_ERR	TokenNameIdentifier	 NO  MAIN  TRANSLET  ERR
,	TokenNameCOMMA	
"Cette classe Templates ne contient pas de classe portant le nom ''{0}''."	TokenNameStringLiteral	Cette classe Templates ne contient pas de classe portant le nom ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_CLASS_ERR	TokenNameIdentifier	 TRANSLET  CLASS  ERR
,	TokenNameCOMMA	
"Impossible de charger la classe translet ''{0}''."	TokenNameStringLiteral	Impossible de charger la classe translet ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_OBJECT_ERR	TokenNameIdentifier	 TRANSLET  OBJECT  ERR
,	TokenNameCOMMA	
"La classe translet est chargée, mais il est impossible de créer une instance translet."	TokenNameStringLiteral	La classe translet est chargée, mais il est impossible de créer une instance translet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "ErrorListener" is a Java interface name that * should not be translated. The message indicates that the user tried * to set an ErrorListener object on object of the class named in the * substitution text with "null" Java value. */	TokenNameCOMMENT_BLOCK	 Note to translators: "ErrorListener" is a Java interface name that should not be translated. The message indicates that the user tried to set an ErrorListener object on object of the class named in the substitution text with "null" Java value. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier	 ERROR  LISTENER  NULL  ERR
,	TokenNameCOMMA	
"Tentative de définition de l''élément ErrorListener pour ''{0}'' à une valeur null"	TokenNameStringLiteral	Tentative de définition de l''élément ErrorListener pour ''{0}'' à une valeur null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: StreamSource, SAXSource and DOMSource are Java * interface names that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: StreamSource, SAXSource and DOMSource are Java interface names that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_SOURCE_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  SOURCE  ERR
,	TokenNameCOMMA	
"Seuls StreamSource, SAXSource et DOMSource sont pris en charge par XSLTC"	TokenNameStringLiteral	Seuls StreamSource, SAXSource et DOMSource sont pris en charge par XSLTC
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Source" is a Java class name that should not * be translated. The substitution text is the name of Java method. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Source" is a Java class name that should not be translated. The substitution text is the name of Java method. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_SOURCE_ERR	TokenNameIdentifier	 JAXP  NO  SOURCE  ERR
,	TokenNameCOMMA	
"L''objet source transmis à ''{0}'' est vide."	TokenNameStringLiteral	L''objet source transmis à ''{0}'' est vide.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The message indicates that XSLTC failed to * compile the stylesheet into a translet (class file). */	TokenNameCOMMENT_BLOCK	 Note to translators: The message indicates that XSLTC failed to compile the stylesheet into a translet (class file). 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_COMPILE_ERR	TokenNameIdentifier	 JAXP  COMPILE  ERR
,	TokenNameCOMMA	
"Impossible de compiler la feuille de style"	TokenNameStringLiteral	Impossible de compiler la feuille de style
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "TransformerFactory" is a class name. In this * context, an attribute is a property or setting of the * TransformerFactory object. The substitution text is the name of the * unrecognised attribute. The method used to retrieve the attribute is * "getAttribute", so it's not clear whether it would be best to * translate the term "attribute". */	TokenNameCOMMENT_BLOCK	 Note to translators: "TransformerFactory" is a class name. In this context, an attribute is a property or setting of the TransformerFactory object. The substitution text is the name of the unrecognised attribute. The method used to retrieve the attribute is "getAttribute", so it's not clear whether it would be best to translate the term "attribute". 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier	 JAXP  INVALID  ATTR  ERR
,	TokenNameCOMMA	
"TransformerFactory ne reconnaît pas l''attribut ''{0}''."	TokenNameStringLiteral	TransformerFactory ne reconnaît pas l''attribut ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "setResult()" and "startDocument()" are Java * method names that should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "setResult()" and "startDocument()" are Java method names that should not be translated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_SET_RESULT_ERR	TokenNameIdentifier	 JAXP  SET  RESULT  ERR
,	TokenNameCOMMA	
"setResult() doit être appelé avant startDocument()."	TokenNameStringLiteral	setResult() doit être appelé avant startDocument().
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Transformer" is a Java interface name that * should not be translated. A Transformer object should contained a * reference to a translet object in order to be used for * transformations; this message is produced if that requirement is not * met. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Transformer" is a Java interface name that should not be translated. A Transformer object should contained a reference to a translet object in order to be used for transformations; this message is produced if that requirement is not met. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier	 JAXP  NO  TRANSLET  ERR
,	TokenNameCOMMA	
"Transformer ne comporte pas d'objet translet encapsulé."	TokenNameStringLiteral	Transformer ne comporte pas d'objet translet encapsulé.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The XML document that results from a * transformation needs to be sent to an output handler object; this * message is produced if that requirement is not met. */	TokenNameCOMMENT_BLOCK	 Note to translators: The XML document that results from a transformation needs to be sent to an output handler object; this message is produced if that requirement is not met. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_HANDLER_ERR	TokenNameIdentifier	 JAXP  NO  HANDLER  ERR
,	TokenNameCOMMA	
"Aucun gestionnaire de sortie n'a été défini pour le résultat de la transformation."	TokenNameStringLiteral	Aucun gestionnaire de sortie n'a été défini pour le résultat de la transformation.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Result" is a Java interface name in this * context. The substitution text is a method name. */	TokenNameCOMMENT_BLOCK	 Note to translators: "Result" is a Java interface name in this context. The substitution text is a method name. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_RESULT_ERR	TokenNameIdentifier	 JAXP  NO  RESULT  ERR
,	TokenNameCOMMA	
"L''objet Result object transmis à ''{0}'' n''est pas valide."	TokenNameStringLiteral	L''objet Result object transmis à ''{0}'' n''est pas valide.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "Transformer" is a Java interface name. The * user's program attempted to access an unrecognized property with the * name specified in the substitution text. The method used to retrieve * the property is "getOutputProperty", so it's not clear whether it * would be best to translate the term "property". */	TokenNameCOMMENT_BLOCK	 Note to translators: "Transformer" is a Java interface name. The user's program attempted to access an unrecognized property with the name specified in the substitution text. The method used to retrieve the property is "getOutputProperty", so it's not clear whether it would be best to translate the term "property". 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  PROP  ERR
,	TokenNameCOMMA	
"Tentative d''accès à une propriété Transformer non valide ''{0}''."	TokenNameStringLiteral	Tentative d''accès à une propriété Transformer non valide ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: SAX2DOM is the name of a Java class that should * not be translated. This is an adapter in the sense that it takes a * DOM object and converts it to something that uses the SAX API. */	TokenNameCOMMENT_BLOCK	 Note to translators: SAX2DOM is the name of a Java class that should not be translated. This is an adapter in the sense that it takes a DOM object and converts it to something that uses the SAX API. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SAX2DOM_ADAPTER_ERR	TokenNameIdentifier	 SA X2 DOM  ADAPTER  ERR
,	TokenNameCOMMA	
"Impossible de créer l''adaptateur SAX2DOM : ''{0}''."	TokenNameStringLiteral	Impossible de créer l''adaptateur SAX2DOM : ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "XSLTCSource.build()" is a Java method name. * "systemId" is an XML term that is short for "system identification". */	TokenNameCOMMENT_BLOCK	 Note to translators: "XSLTCSource.build()" is a Java method name. "systemId" is an XML term that is short for "system identification". 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XSLTC_SOURCE_ERR	TokenNameIdentifier	 XSLTC  SOURCE  ERR
,	TokenNameCOMMA	
"Appel de la part de XSLTCSource.build() sans définition d'identification du système."	TokenNameStringLiteral	Appel de la part de XSLTCSource.build() sans définition d'identification du système.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
"Le résultat doit être vide"	TokenNameStringLiteral	Le résultat doit être vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message indicates that the value argument * of setParameter must be a valid Java Object. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message indicates that the value argument of setParameter must be a valid Java Object. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 JAXP  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
"La valeur du paramètre {0} doit être un objet Java valide"	TokenNameStringLiteral	La valeur du paramètre {0} doit être un objet Java valide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILE_STDIN_ERR	TokenNameIdentifier	 COMPILE  STDIN  ERR
,	TokenNameCOMMA	
"L'option -i doit être utilisée avec l'option -o."	TokenNameStringLiteral	L'option -i doit être utilisée avec l'option -o.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message contains usage information for a * means of invoking XSLTC from the command-line. The message is * formatted for presentation in English. The strings <output>, * <directory>, etc. indicate user-specified argument values, and can * be translated - the argument <package> refers to a Java package, so * it should be handled in the same way the term is handled for JDK * documentation. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message contains usage information for a means of invoking XSLTC from the command-line. The message is formatted for presentation in English. The strings <output>, <directory>, etc. indicate user-specified argument values, and can be translated - the argument <package> refers to a Java package, so it should be handled in the same way the term is handled for JDK documentation. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILE_USAGE_STR	TokenNameIdentifier	 COMPILE  USAGE  STR
,	TokenNameCOMMA	
"SYNOPSIS java org.apache.xalan.xsltc.cmdline.Compile [-o <sortie>] [-d <répertoire>] [-j <fichierjar>] [-p <package>] [-n] [-x] [-u] [-v] [-h] { <feuille_de_style> | -i } OPTIONS -o <sortie> attribue le nom <sortie> au translet généré. Par défaut, le nom du translet est dérivé du nom <feuille_de_style>. Cette option est ignorée si plusieurs feuilles de style sont compilées. -d <répertoire> spécifie un répertoire de destination pour translet -j <fichier_jar> rassemble les classes translet dans le fichier <fichier_jar> -p <module> spécifie un préfixe de nom de module pour toutes les classes translet générées. -n active la mise en ligne de modèle (comportement par défaut - préférable on en moyenne). -x active le débogage supplémentaire de sortie de message -u interprète les arguments <feuille_de_style> comme des adresses URL -i force le compilateur à lire la feuille de style dans stdin -v imprime la version du compilateur -h imprime cette instruction de syntaxe "	TokenNameStringLiteral	SYNOPSIS java org.apache.xalan.xsltc.cmdline.Compile [-o <sortie>] [-d <répertoire>] [-j <fichierjar>] [-p <package>] [-n] [-x] [-u] [-v] [-h] { <feuille_de_style> | -i } OPTIONS -o <sortie> attribue le nom <sortie> au translet généré. Par défaut, le nom du translet est dérivé du nom <feuille_de_style>. Cette option est ignorée si plusieurs feuilles de style sont compilées. -d <répertoire> spécifie un répertoire de destination pour translet -j <fichier_jar> rassemble les classes translet dans le fichier <fichier_jar> -p <module> spécifie un préfixe de nom de module pour toutes les classes translet générées. -n active la mise en ligne de modèle (comportement par défaut - préférable on en moyenne). -x active le débogage supplémentaire de sortie de message -u interprète les arguments <feuille_de_style> comme des adresses URL -i force le compilateur à lire la feuille de style dans stdin -v imprime la version du compilateur -h imprime cette instruction de syntaxe 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message contains usage information for a * means of invoking XSLTC from the command-line. The message is * formatted for presentation in English. The strings <jarfile>, * <document>, etc. indicate user-specified argument values, and can * be translated - the argument <class> refers to a Java class, so it * should be handled in the same way the term is handled for JDK * documentation. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message contains usage information for a means of invoking XSLTC from the command-line. The message is formatted for presentation in English. The strings <jarfile>, <document>, etc. indicate user-specified argument values, and can be translated - the argument <class> refers to a Java class, so it should be handled in the same way the term is handled for JDK documentation. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_USAGE_STR	TokenNameIdentifier	 TRANSFORM  USAGE  STR
,	TokenNameCOMMA	
"SYNOPSIS java org.apache.xalan.xsltc.cmdline.Transform [-j <fichierjar>] [-x] [-n <itérations>] {-u <url_document> | <document>} <classe> [<param1>=<valeur1> ...] utilise la <classe> translet pour transformer un document XML défini comme <document>. La <classe> translet se trouve dans la fonction CLASSPATH de l'utilisateur ou dans le <fichier_jar> indiqué en option. OPTIONS -j <fichierjar> spécifie un fichier jar à partir duquel charger le translet -x active le débogage supplémentaire de sortie de message -n <itérations> exécute la transformation <itérations> fois et affiche des informations de profil -u <url_document> définit le document d'entrée XML comme une URL "	TokenNameStringLiteral	SYNOPSIS java org.apache.xalan.xsltc.cmdline.Transform [-j <fichierjar>] [-x] [-n <itérations>] {-u <url_document> | <document>} <classe> [<param1>=<valeur1> ...] utilise la <classe> translet pour transformer un document XML défini comme <document>. La <classe> translet se trouve dans la fonction CLASSPATH de l'utilisateur ou dans le <fichier_jar> indiqué en option. OPTIONS -j <fichierjar> spécifie un fichier jar à partir duquel charger le translet -x active le débogage supplémentaire de sortie de message -n <itérations> exécute la transformation <itérations> fois et affiche des informations de profil -u <url_document> définit le document d'entrée XML comme une URL 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "<xsl:sort>", "<xsl:for-each>" and * "<xsl:apply-templates>" are keywords that should not be translated. * The message indicates that an xsl:sort element must be a child of * one of the other kinds of elements mentioned. */	TokenNameCOMMENT_BLOCK	 Note to translators: "<xsl:sort>", "<xsl:for-each>" and "<xsl:apply-templates>" are keywords that should not be translated. The message indicates that an xsl:sort element must be a child of one of the other kinds of elements mentioned. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_SORT_ERR	TokenNameIdentifier	 STRAY  SORT  ERR
,	TokenNameCOMMA	
"<xsl:sort> peut être utilisé uniquement dans <xsl:for-each> ou <xsl:apply-templates>."	TokenNameStringLiteral	<xsl:sort> peut être utilisé uniquement dans <xsl:for-each> ou <xsl:apply-templates>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The message indicates that the encoding * requested for the output document was on that requires support that * is not available from the Java Virtual Machine being used to execute * the program. */	TokenNameCOMMENT_BLOCK	 Note to translators: The message indicates that the encoding requested for the output document was on that requires support that is not available from the Java Virtual Machine being used to execute the program. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_ENCODING	TokenNameIdentifier	 UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Le codage de sortie ''{0}'' n''est pas pris en charge dans cette JVM."	TokenNameStringLiteral	Le codage de sortie ''{0}'' n''est pas pris en charge dans cette JVM.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The message indicates that the XPath expression * named in the substitution text was not well formed syntactically. */	TokenNameCOMMENT_BLOCK	 Note to translators: The message indicates that the XPath expression named in the substitution text was not well formed syntactically. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SYNTAX_ERR	TokenNameIdentifier	 SYNTAX  ERR
,	TokenNameCOMMA	
"Erreur de syntaxe dans ''{0}''."	TokenNameStringLiteral	Erreur de syntaxe dans ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a Java * class. The term "constructor" here is the Java term. The message is * displayed if XSLTC could not find a constructor for the specified * class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a Java class. The term "constructor" here is the Java term. The message is displayed if XSLTC could not find a constructor for the specified class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CONSTRUCTOR_NOT_FOUND	TokenNameIdentifier	 CONSTRUCTOR  NOT  FOUND
,	TokenNameCOMMA	
"Impossible de trouver le constructeur externe ''{0}''."	TokenNameStringLiteral	Impossible de trouver le constructeur externe ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "static" is the Java keyword. The substitution * text is the name of a function. The first argument of that function * is not of the required type. */	TokenNameCOMMENT_BLOCK	 Note to translators: "static" is the Java keyword. The substitution text is the name of a function. The first argument of that function is not of the required type. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_JAVA_FUNCT_THIS_REF	TokenNameIdentifier	 NO  JAVA  FUNCT  THIS  REF
,	TokenNameCOMMA	
"Le premier argument de la fonction Java non static ''{0}'' n''est pas une référence d''objet valide."	TokenNameStringLiteral	Le premier argument de la fonction Java non static ''{0}'' n''est pas une référence d''objet valide.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An XPath expression was not of the type * required in a particular context. The substitution text is the * expression that was in error. */	TokenNameCOMMENT_BLOCK	 Note to translators: An XPath expression was not of the type required in a particular context. The substitution text is the expression that was in error. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TYPE_CHECK_ERR	TokenNameIdentifier	 TYPE  CHECK  ERR
,	TokenNameCOMMA	
"Erreur lors de la vérification du type de l''expression ''{0}''."	TokenNameStringLiteral	Erreur lors de la vérification du type de l''expression ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An XPath expression was not of the type * required in a particular context. However, the location of the * problematic expression is unknown. */	TokenNameCOMMENT_BLOCK	 Note to translators: An XPath expression was not of the type required in a particular context. However, the location of the problematic expression is unknown. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TYPE_CHECK_UNK_LOC_ERR	TokenNameIdentifier	 TYPE  CHECK  UNK  LOC  ERR
,	TokenNameCOMMA	
"Erreur de contrôle du type d'une expression se trouvant dans un emplacement inconnu."	TokenNameStringLiteral	Erreur de contrôle du type d'une expression se trouvant dans un emplacement inconnu.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a command- * line option that was not recognized. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a command- line option that was not recognized. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CMDLINE_OPTION_ERR	TokenNameIdentifier	 ILLEGAL  CMDLINE  OPTION  ERR
,	TokenNameCOMMA	
"L''option de ligne de commande ''{0}'' n''est pas valide."	TokenNameStringLiteral	L''option de ligne de commande ''{0}'' n''est pas valide.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a command- * line option. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a command- line option. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CMDLINE_OPT_MISSING_ARG_ERR	TokenNameIdentifier	 CMDLINE  OPT  MISSING  ARG  ERR
,	TokenNameCOMMA	
"Un argument obligatoire est absent de l''option de ligne de commande ''{0}''."	TokenNameStringLiteral	Un argument obligatoire est absent de l''option de ligne de commande ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text contains two error * messages. The spacing before the second substitution text indents * it the same amount as the first in English. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text contains two error messages. The spacing before the second substitution text indents it the same amount as the first in English. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier	 WARNING  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
"AVERTISSEMENT : ''{0}'' :{1}"	TokenNameStringLiteral	AVERTISSEMENT : ''{0}'' :{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text is an error message. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text is an error message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WARNING_MSG	TokenNameIdentifier	 WARNING  MSG
,	TokenNameCOMMA	
"AVERTISSEMENT : ''{0}''"	TokenNameStringLiteral	AVERTISSEMENT : ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text contains two error * messages. The spacing before the second substitution text indents * it the same amount as the first in English. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text contains two error messages. The spacing before the second substitution text indents it the same amount as the first in English. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 FATAL  ERR  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
"ERREUR BLOQUANTE : ''{0}'' :{1}"	TokenNameStringLiteral	ERREUR BLOQUANTE : ''{0}'' :{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text is an error message. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text is an error message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FATAL_ERR_MSG	TokenNameIdentifier	 FATAL  ERR  MSG
,	TokenNameCOMMA	
"ERREUR BLOQUANTE : ''{0}''"	TokenNameStringLiteral	ERREUR BLOQUANTE : ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text contains two error * messages. The spacing before the second substitution text indents * it the same amount as the first in English. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text contains two error messages. The spacing before the second substitution text indents it the same amount as the first in English. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 ERROR  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
"ERREUR : ''{0}'' :{1}"	TokenNameStringLiteral	ERREUR : ''{0}'' :{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is used to indicate the severity * of another message. The substitution text is an error message. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is used to indicate the severity of another message. The substitution text is an error message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_MSG	TokenNameIdentifier	 ERROR  MSG
,	TokenNameCOMMA	
"ERREUR : ''{0}''"	TokenNameStringLiteral	ERREUR : ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the name of a class. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the name of a class. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_WITH_TRANSLET_STR	TokenNameIdentifier	 TRANSFORM  WITH  TRANSLET  STR
,	TokenNameCOMMA	
"Transformation à l''aide du translet ''{0}'' "	TokenNameStringLiteral	Transformation à l''aide du translet ''{0}'' 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The first substitution is the name of a class, * while the second substitution is the name of a jar file. */	TokenNameCOMMENT_BLOCK	 Note to translators: The first substitution is the name of a class, while the second substitution is the name of a jar file. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_WITH_JAR_STR	TokenNameIdentifier	 TRANSFORM  WITH  JAR  STR
,	TokenNameCOMMA	
"Transformation à l''aide du translet ''{0}'' à partir du fichier jar ''{1}''"	TokenNameStringLiteral	Transformation à l''aide du translet ''{0}'' à partir du fichier jar ''{1}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: "TransformerFactory" is the name of a Java * interface and must not be translated. The substitution text is * the name of the class that could not be instantiated. */	TokenNameCOMMENT_BLOCK	 Note to translators: "TransformerFactory" is the name of a Java interface and must not be translated. The substitution text is the name of the class that could not be instantiated. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COULD_NOT_CREATE_TRANS_FACT	TokenNameIdentifier	 COULD  NOT  CREATE  TRANS  FACT
,	TokenNameCOMMA	
"Impossible de créer une instance de la classe TransformerFactory ''{0}''."	TokenNameStringLiteral	Impossible de créer une instance de la classe TransformerFactory ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is produced when the user * specified a name for the translet class that contains characters * that are not permitted in a Java class name. The substitution * text "{0}" specifies the name the user requested, while "{1}" * specifies the name the processor used instead. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is produced when the user specified a name for the translet class that contains characters that are not permitted in a Java class name. The substitution text "{0}" specifies the name the user requested, while "{1}" specifies the name the processor used instead. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_NAME_JAVA_CONFLICT	TokenNameIdentifier	 TRANSLET  NAME  JAVA  CONFLICT
,	TokenNameCOMMA	
"Le nom ''{0}'' ne peut pas être utilisé pour la classe translet du fait qu''elle contient des caractères qui ne sont pas admis dans le nom d''une classe Java. Le nom ''{1}'' a été utilisé à la place."	TokenNameStringLiteral	Le nom ''{0}'' ne peut pas être utilisé pour la classe translet du fait qu''elle contient des caractères qui ne sont pas admis dans le nom d''une classe Java. Le nom ''{1}'' a été utilisé à la place.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message is used as a header. * All the error messages are collected together and displayed beneath * this message. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message is used as a header. All the error messages are collected together and displayed beneath this message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILER_ERROR_KEY	TokenNameIdentifier	 COMPILER  ERROR  KEY
,	TokenNameCOMMA	
"Erreurs de compilation :"	TokenNameStringLiteral	Erreurs de compilation :
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message is used as a header. * All the warning messages are collected together and displayed * beneath this message. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message is used as a header. All the warning messages are collected together and displayed beneath this message. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILER_WARNING_KEY	TokenNameIdentifier	 COMPILER  WARNING  KEY
,	TokenNameCOMMA	
"Avertissements de compilation :"	TokenNameStringLiteral	Avertissements de compilation :
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message is used as a header. * All the error messages that are produced when the stylesheet is * applied to an input document are collected together and displayed * beneath this message. A 'translet' is the compiled form of a * stylesheet (see above). */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message is used as a header. All the error messages that are produced when the stylesheet is applied to an input document are collected together and displayed beneath this message. A 'translet' is the compiled form of a stylesheet (see above). 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
RUNTIME_ERROR_KEY	TokenNameIdentifier	 RUNTIME  ERROR  KEY
,	TokenNameCOMMA	
"Erreurs de translet :"	TokenNameStringLiteral	Erreurs de translet :
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute whose value is constrained to * be a "QName" or a list of "QNames" had a value that was incorrect. * 'QName' is an XML syntactic term that must not be translated. The * substitution text contains the actual value of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute whose value is constrained to be a "QName" or a list of "QNames" had a value that was incorrect. 'QName' is an XML syntactic term that must not be translated. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_QNAME_ERR	TokenNameIdentifier	 INVALID  QNAME  ERR
,	TokenNameCOMMA	
"Un attribut dont la valeur doit être un QName ou une liste de QName délimitée par des espaces possède la valeur ''{0}''"	TokenNameStringLiteral	Un attribut dont la valeur doit être un QName ou une liste de QName délimitée par des espaces possède la valeur ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute whose value is required to * be an "NCName". * 'NCName' is an XML syntactic term that must not be translated. The * substitution text contains the actual value of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute whose value is required to be an "NCName". 'NCName' is an XML syntactic term that must not be translated. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_NCNAME_ERR	TokenNameIdentifier	 INVALID  NCNAME  ERR
,	TokenNameCOMMA	
"Un attribut dont la valeur doit être un NCName possède la valeur ''{0}''"	TokenNameStringLiteral	Un attribut dont la valeur doit être un NCName possède la valeur ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute with an incorrect value was * encountered. The permitted value is one of the literal values * "xml", "html" or "text"; it is also permitted to have the form of * a QName that is not also an NCName. The terms "method", * "xsl:output", "xml", "html" and "text" are keywords that must not * be translated. The term "qname-but-not-ncname" is an XML syntactic * term. The substitution text contains the actual value of the * attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute with an incorrect value was encountered. The permitted value is one of the literal values "xml", "html" or "text"; it is also permitted to have the form of a QName that is not also an NCName. The terms "method", "xsl:output", "xml", "html" and "text" are keywords that must not be translated. The term "qname-but-not-ncname" is an XML syntactic term. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_METHOD_IN_OUTPUT	TokenNameIdentifier	 INVALID  METHOD  IN  OUTPUT
,	TokenNameCOMMA	
"L''attribut method d''un élément <xsl:output> possède la valeur ''{0}''. La valeur doit être ''xml'', ''html'', ''text'' ou qname-but-not-ncname"	TokenNameStringLiteral	L''attribut method d''un élément <xsl:output> possède la valeur ''{0}''. La valeur doit être ''xml'', ''html'', ''text'' ou qname-but-not-ncname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 JAXP  GET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"Le nom de la fonction ne peut pas avoir une valeur null dans TransformerFactory.getFeature (nom chaîne)."	TokenNameStringLiteral	Le nom de la fonction ne peut pas avoir une valeur null dans TransformerFactory.getFeature (nom chaîne).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 JAXP  SET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"Le nom de la fonction ne peut pas avoir la valeur null dans TransformerFactory.setFeature (nom chaîne, valeur boolénne)."	TokenNameStringLiteral	Le nom de la fonction ne peut pas avoir la valeur null dans TransformerFactory.setFeature (nom chaîne, valeur boolénne).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNSUPPORTED_FEATURE	TokenNameIdentifier	 JAXP  UNSUPPORTED  FEATURE
,	TokenNameCOMMA	
"Impossible de définir la fonction ''{0}'' sur cet élément TransformerFactory."	TokenNameStringLiteral	Impossible de définir la fonction ''{0}'' sur cet élément TransformerFactory.
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
