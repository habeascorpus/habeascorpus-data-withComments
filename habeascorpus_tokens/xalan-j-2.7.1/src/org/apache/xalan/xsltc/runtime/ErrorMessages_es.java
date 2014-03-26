/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ErrorMessages_es.java 468652 2006-10-28 07:05:17Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ErrorMessages_es.java 468652 2006-10-28 07:05:17Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
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
ErrorMessages_es	TokenNameIdentifier	 Error Messages es
extends	TokenNameextends	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
{	TokenNameLBRACE	
/* * XSLTC run-time error messages. * * General notes to translators and definitions: * * 1) XSLTC is the name of the product. It is an acronym for XML Stylesheet: * Transformations Compiler * * 2) A stylesheet is a description of how to transform an input XML document * into a resultant output XML document (or HTML document or text) * * 3) An axis is a particular "dimension" in a tree representation of an XML * document; the nodes in the tree are divided along different axes. * Traversing the "child" axis, for instance, means that the program * would visit each child of a particular node; traversing the "descendant" * axis means that the program would visit the child nodes of a particular * node, their children, and so on until the leaf nodes of the tree are * reached. * * 4) An iterator is an object that traverses nodes in a tree along a * particular axis, one at a time. * * 5) An element is a mark-up tag in an XML document; an attribute is a * modifier on the tag. For example, in <elem attr='val' attr2='val2'> * "elem" is an element name, "attr" and "attr2" are attribute names with * the values "val" and "val2", respectively. * * 6) A namespace declaration is a special attribute that is used to associate * a prefix with a URI (the namespace). The meanings of element names and * attribute names that use that prefix are defined with respect to that * namespace. * * 7) DOM is an acronym for Document Object Model. It is a tree * representation of an XML document. * * SAX is an acronym for the Simple API for XML processing. It is an API * used inform an XML processor (in this case XSLTC) of the structure and * content of an XML document. * * Input to the stylesheet processor can come from an XML parser in the * form of a DOM tree or through the SAX API. * * 8) DTD is a document type declaration. It is a way of specifying the * grammar for an XML file, the names and types of elements, attributes, * etc. * * 9) Translet is an invented term that refers to the class file that contains * the compiled form of a stylesheet. */	TokenNameCOMMENT_BLOCK	 XSLTC run-time error messages. * General notes to translators and definitions: * 1) XSLTC is the name of the product. It is an acronym for XML Stylesheet: Transformations Compiler * 2) A stylesheet is a description of how to transform an input XML document into a resultant output XML document (or HTML document or text) * 3) An axis is a particular "dimension" in a tree representation of an XML document; the nodes in the tree are divided along different axes. Traversing the "child" axis, for instance, means that the program would visit each child of a particular node; traversing the "descendant" axis means that the program would visit the child nodes of a particular node, their children, and so on until the leaf nodes of the tree are reached. * 4) An iterator is an object that traverses nodes in a tree along a particular axis, one at a time. * 5) An element is a mark-up tag in an XML document; an attribute is a modifier on the tag. For example, in <elem attr='val' attr2='val2'> "elem" is an element name, "attr" and "attr2" are attribute names with the values "val" and "val2", respectively. * 6) A namespace declaration is a special attribute that is used to associate a prefix with a URI (the namespace). The meanings of element names and attribute names that use that prefix are defined with respect to that namespace. * 7) DOM is an acronym for Document Object Model. It is a tree representation of an XML document. * SAX is an acronym for the Simple API for XML processing. It is an API used inform an XML processor (in this case XSLTC) of the structure and content of an XML document. * Input to the stylesheet processor can come from an XML parser in the form of a DOM tree or through the SAX API. * 8) DTD is a document type declaration. It is a way of specifying the grammar for an XML file, the names and types of elements, attributes, etc. * 9) Translet is an invented term that refers to the class file that contains the compiled form of a stylesheet. 
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
/* * Note to translators: the substitution text in the following message * is a class name. Used for internal errors in the processor. */	TokenNameCOMMENT_BLOCK	 Note to translators: the substitution text in the following message is a class name. Used for internal errors in the processor. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
RUN_TIME_INTERNAL_ERR	TokenNameIdentifier	 RUN  TIME  INTERNAL  ERR
,	TokenNameCOMMA	
"Error interno de ejecuci—n en ''{0}''"	TokenNameStringLiteral	Error interno de ejecuci—n en ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: <xsl:copy> is a keyword that should not be * translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: <xsl:copy> is a keyword that should not be translated. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
RUN_TIME_COPY_ERR	TokenNameIdentifier	 RUN  TIME  COPY  ERR
,	TokenNameCOMMA	
"Error de ejecuci—n al ejecutar <xsl:copy>."	TokenNameStringLiteral	Error de ejecuci—n al ejecutar <xsl:copy>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text refers to data types. * The message is displayed if a value in a particular context needs to * be converted to type {1}, but that's not possible for a value of type * {0}. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text refers to data types. The message is displayed if a value in a particular context needs to be converted to type {1}, but that's not possible for a value of type {0}. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
DATA_CONVERSION_ERR	TokenNameIdentifier	 DATA  CONVERSION  ERR
,	TokenNameCOMMA	
"Conversi—n no v‡lida de ''{0}'' a ''{1}''."	TokenNameStringLiteral	Conversi—n no v‡lida de ''{0}'' a ''{1}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is displayed if the function named * by the substitution text is not a function that is supported. XSLTC * is the acronym naming the product. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is displayed if the function named by the substitution text is not a function that is supported. XSLTC is the acronym naming the product. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
EXTERNAL_FUNC_ERR	TokenNameIdentifier	 EXTERNAL  FUNC  ERR
,	TokenNameCOMMA	
"Funci—n externa ''{0}'' no soportada por XSLTC."	TokenNameStringLiteral	Funci—n externa ''{0}'' no soportada por XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is displayed if two values are * compared for equality, but the data type of one of the values is * unknown. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is displayed if two values are compared for equality, but the data type of one of the values is unknown. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
EQUALITY_EXPR_ERR	TokenNameIdentifier	 EQUALITY  EXPR  ERR
,	TokenNameCOMMA	
"Tipo de argumento desconocido en expresi—n de igualdad."	TokenNameStringLiteral	Tipo de argumento desconocido en expresi—n de igualdad.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text for {0} will be a data * type; the substitution text for {1} will be the name of a function. * This is displayed if an argument of the particular data type is not * permitted for a call to this function. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text for {0} will be a data type; the substitution text for {1} will be the name of a function. This is displayed if an argument of the particular data type is not permitted for a call to this function. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
INVALID_ARGUMENT_ERR	TokenNameIdentifier	 INVALID  ARGUMENT  ERR
,	TokenNameCOMMA	
"Tipo de argumento ''{0}'' no v‡lido en la llamada a ''{1}''"	TokenNameStringLiteral	Tipo de argumento ''{0}'' no v‡lido en la llamada a ''{1}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: There is way of specifying a format for a * number using a pattern; the processor was unable to format the * particular value using the specified pattern. */	TokenNameCOMMENT_BLOCK	 Note to translators: There is way of specifying a format for a number using a pattern; the processor was unable to format the particular value using the specified pattern. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
FORMAT_NUMBER_ERR	TokenNameIdentifier	 FORMAT  NUMBER  ERR
,	TokenNameCOMMA	
"Se intenta dar formato al nœmero ''{0}'' con el patr—n ''{1}''."	TokenNameStringLiteral	Se intenta dar formato al nœmero ''{0}'' con el patr—n ''{1}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following represents an internal error * situation in XSLTC. The processor was unable to create a copy of an * iterator. (See definition of iterator above.) */	TokenNameCOMMENT_BLOCK	 Note to translators: The following represents an internal error situation in XSLTC. The processor was unable to create a copy of an iterator. (See definition of iterator above.) 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
ITERATOR_CLONE_ERR	TokenNameIdentifier	 ITERATOR  CLONE  ERR
,	TokenNameCOMMA	
"No se puede replicar el iterador ''{0}''."	TokenNameStringLiteral	No se puede replicar el iterador ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following represents an internal error * situation in XSLTC. The processor attempted to create an iterator * for a particular axis (see definition above) that it does not * support. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following represents an internal error situation in XSLTC. The processor attempted to create an iterator for a particular axis (see definition above) that it does not support. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
AXIS_SUPPORT_ERR	TokenNameIdentifier	 AXIS  SUPPORT  ERR
,	TokenNameCOMMA	
"Iterador para el eje ''{0}'' no soportado."	TokenNameStringLiteral	Iterador para el eje ''{0}'' no soportado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following represents an internal error * situation in XSLTC. The processor attempted to create an iterator * for a particular axis (see definition above) that it does not * support. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following represents an internal error situation in XSLTC. The processor attempted to create an iterator for a particular axis (see definition above) that it does not support. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
TYPED_AXIS_SUPPORT_ERR	TokenNameIdentifier	 TYPED  AXIS  SUPPORT  ERR
,	TokenNameCOMMA	
"Iterador para el eje escrito ''{0}'' no soportado."	TokenNameStringLiteral	Iterador para el eje escrito ''{0}'' no soportado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is reported if the stylesheet * being processed attempted to construct an XML document with an * attribute in a place other than on an element. The substitution text * specifies the name of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is reported if the stylesheet being processed attempted to construct an XML document with an attribute in a place other than on an element. The substitution text specifies the name of the attribute. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier	 STRAY  ATTRIBUTE  ERR
,	TokenNameCOMMA	
"Atributo ''{0}'' fuera del elemento."	TokenNameStringLiteral	Atributo ''{0}'' fuera del elemento.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: As with the preceding message, a namespace * declaration has the form of an attribute and is only permitted to * appear on an element. The substitution text {0} is the namespace * prefix and {1} is the URI that was being used in the erroneous * namespace declaration. */	TokenNameCOMMENT_BLOCK	 Note to translators: As with the preceding message, a namespace declaration has the form of an attribute and is only permitted to appear on an element. The substitution text {0} is the namespace prefix and {1} is the URI that was being used in the erroneous namespace declaration. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
STRAY_NAMESPACE_ERR	TokenNameIdentifier	 STRAY  NAMESPACE  ERR
,	TokenNameCOMMA	
"Declaraci—n del espacio de nombres ''{0}''=''{1}'' fuera del elemento."	TokenNameStringLiteral	Declaraci—n del espacio de nombres ''{0}''=''{1}'' fuera del elemento.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained a reference to a * namespace prefix that was undefined. The value of the substitution * text is the name of the prefix. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained a reference to a namespace prefix that was undefined. The value of the substitution text is the name of the prefix. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
NAMESPACE_PREFIX_ERR	TokenNameIdentifier	 NAMESPACE  PREFIX  ERR
,	TokenNameCOMMA	
"No se ha declarado el espacio de nombres para el prefijo ''{0}''."	TokenNameStringLiteral	No se ha declarado el espacio de nombres para el prefijo ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following represents an internal error. * DOMAdapter is a Java class in XSLTC. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following represents an internal error. DOMAdapter is a Java class in XSLTC. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
DOM_ADAPTER_INIT_ERR	TokenNameIdentifier	 DOM  ADAPTER  INIT  ERR
,	TokenNameCOMMA	
"DOMAdapter creado mediante un tipo incorrecto de DOM origen."	TokenNameStringLiteral	DOMAdapter creado mediante un tipo incorrecto de DOM origen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message indicates that the XML * parser that is providing input to XSLTC cannot be used because it * does not describe to XSLTC the structure of the input XML document's * DTD. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message indicates that the XML parser that is providing input to XSLTC cannot be used because it does not describe to XSLTC the structure of the input XML document's DTD. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
PARSER_DTD_SUPPORT_ERR	TokenNameIdentifier	 PARSER  DTD  SUPPORT  ERR
,	TokenNameCOMMA	
"El analizador SAX utilizado no maneja sucesos de declaraci—n DTD."	TokenNameStringLiteral	El analizador SAX utilizado no maneja sucesos de declaraci—n DTD.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The following message indicates that the XML * parser that is providing input to XSLTC cannot be used because it * does not distinguish between ordinary XML attributes and namespace * declarations. */	TokenNameCOMMENT_BLOCK	 Note to translators: The following message indicates that the XML parser that is providing input to XSLTC cannot be used because it does not distinguish between ordinary XML attributes and namespace declarations. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
NAMESPACES_SUPPORT_ERR	TokenNameIdentifier	 NAMESPACES  SUPPORT  ERR
,	TokenNameCOMMA	
"El analizador SAX utilizado no tiene soporte de espacios de nombres XML."	TokenNameStringLiteral	El analizador SAX utilizado no tiene soporte de espacios de nombres XML.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The substitution text is the URI that was in * error. */	TokenNameCOMMENT_BLOCK	 Note to translators: The substitution text is the URI that was in error. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
CANT_RESOLVE_RELATIVE_URI_ERR	TokenNameIdentifier	 CANT  RESOLVE  RELATIVE  URI  ERR
,	TokenNameCOMMA	
"No se ha podido resolver la referencia de URI ''{0}''."	TokenNameStringLiteral	No se ha podido resolver la referencia de URI ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained an element that was * not recognized as part of the XSL syntax. The substitution text * gives the element name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained an element that was not recognized as part of the XSL syntax. The substitution text gives the element name. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
UNSUPPORTED_XSL_ERR	TokenNameIdentifier	 UNSUPPORTED  XSL  ERR
,	TokenNameCOMMA	
"Elemento XSL ''{0}'' no soportado."	TokenNameStringLiteral	Elemento XSL ''{0}'' no soportado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet referred to an extension to the * XSL syntax and indicated that it was defined by XSLTC, but XSLTC does * not recognize the particular extension named. The substitution text * gives the extension name. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet referred to an extension to the XSL syntax and indicated that it was defined by XSLTC, but XSLTC does not recognize the particular extension named. The substitution text gives the extension name. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
UNSUPPORTED_EXT_ERR	TokenNameIdentifier	 UNSUPPORTED  EXT  ERR
,	TokenNameCOMMA	
"Extensi—n XSLTC ''{0}'' no reconocida."	TokenNameStringLiteral	Extensi—n XSLTC ''{0}'' no reconocida.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This error message is produced if the translet * class was compiled using a newer version of XSLTC and deployed for * execution with an older version of XSLTC. The substitution text is * the name of the translet class. */	TokenNameCOMMENT_BLOCK	 Note to translators: This error message is produced if the translet class was compiled using a newer version of XSLTC and deployed for execution with an older version of XSLTC. The substitution text is the name of the translet class. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
UNKNOWN_TRANSLET_VERSION_ERR	TokenNameIdentifier	 UNKNOWN  TRANSLET  VERSION  ERR
,	TokenNameCOMMA	
"El translet especificado, ''{0}'', se ha creado utilizando una versi—n de XSLTC m‡s reciente que la versi—n de ejecuci—n de XSLTC que est‡ en uso. Debe recompilar la hoja de estilos o utilizar una versi—n m‡s reciente de XSLTC para ejecutar este translet."	TokenNameStringLiteral	El translet especificado, ''{0}'', se ha creado utilizando una versi—n de XSLTC m‡s reciente que la versi—n de ejecuci—n de XSLTC que est‡ en uso. Debe recompilar la hoja de estilos o utilizar una versi—n m‡s reciente de XSLTC para ejecutar este translet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute whose effective value is required * to be a "QName" had a value that was incorrect. * 'QName' is an XML syntactic term that must not be translated. The * substitution text contains the actual value of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute whose effective value is required to be a "QName" had a value that was incorrect. 'QName' is an XML syntactic term that must not be translated. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
INVALID_QNAME_ERR	TokenNameIdentifier	 INVALID  QNAME  ERR
,	TokenNameCOMMA	
"Un atributo cuyo valor debe ser un QName tiene el valor ''{0}''"	TokenNameStringLiteral	Un atributo cuyo valor debe ser un QName tiene el valor ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: An attribute whose effective value is required * to be a "NCName" had a value that was incorrect. * 'NCName' is an XML syntactic term that must not be translated. The * substitution text contains the actual value of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: An attribute whose effective value is required to be a "NCName" had a value that was incorrect. 'NCName' is an XML syntactic term that must not be translated. The substitution text contains the actual value of the attribute. 
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
INVALID_NCNAME_ERR	TokenNameIdentifier	 INVALID  NCNAME  ERR
,	TokenNameCOMMA	
"Un atributo cuyo valor debe ser un NCName tiene el valor ''{0}''"	TokenNameStringLiteral	Un atributo cuyo valor debe ser un NCName tiene el valor ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
UNALLOWED_EXTENSION_FUNCTION_ERR	TokenNameIdentifier	 UNALLOWED  EXTENSION  FUNCTION  ERR
,	TokenNameCOMMA	
"No se permite el uso de la funci—n de extensi—n ''{0}'' cuando la caracter’stica de proceso seguro est‡ establecida en true."	TokenNameStringLiteral	No se permite el uso de la funci—n de extensi—n ''{0}'' cuando la caracter’stica de proceso seguro est‡ establecida en true.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
UNALLOWED_EXTENSION_ELEMENT_ERR	TokenNameIdentifier	 UNALLOWED  EXTENSION  ELEMENT  ERR
,	TokenNameCOMMA	
"No se permite el uso del elemento de extensi—n ''{0}'' cuando la caracter’stica de proceso seguro est‡ establecida en true."	TokenNameStringLiteral	No se permite el uso del elemento de extensi—n ''{0}'' cuando la caracter’stica de proceso seguro est‡ establecida en true.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
