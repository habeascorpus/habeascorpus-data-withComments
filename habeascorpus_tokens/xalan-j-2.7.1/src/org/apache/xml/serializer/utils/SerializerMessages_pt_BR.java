/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerMessages_pt_BR.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerMessages_pt_BR.java 471981 2006-11-07 04:28:00Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
/** * An instance of this class is a ListResourceBundle that * has the required getContents() method that returns * an array of message-key/message associations. * <p> * The message keys are defined in {@link MsgKey}. The * messages that those keys map to are defined here. * <p> * The messages in the English version are intended to be * translated. * * This class is not a public API, it is only public because it is * used in org.apache.xml.serializer. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 An instance of this class is a ListResourceBundle that has the required getContents() method that returns an array of message-key/message associations. <p> The message keys are defined in {@link MsgKey}. The messages that those keys map to are defined here. <p> The messages in the English version are intended to be translated. * This class is not a public API, it is only public because it is used in org.apache.xml.serializer. * @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
SerializerMessages_pt_BR	TokenNameIdentifier	 Serializer Messages pt  BR
extends	TokenNameextends	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
{	TokenNameLBRACE	
/* * This file contains error and warning messages related to * Serializer Error Handling. * * General notes to translators: * 1) A stylesheet is a description of how to transform an input XML document * into a resultant XML document (or HTML document or text). The * stylesheet itself is described in the form of an XML document. * * 2) An element is a mark-up tag in an XML document; an attribute is a * modifier on the tag. For example, in <elem attr='val' attr2='val2'> * "elem" is an element name, "attr" and "attr2" are attribute names with * the values "val" and "val2", respectively. * * 3) A namespace declaration is a special attribute that is used to associate * a prefix with a URI (the namespace). The meanings of element names and * attribute names that use that prefix are defined with respect to that * namespace. * * */	TokenNameCOMMENT_BLOCK	 This file contains error and warning messages related to Serializer Error Handling. * General notes to translators: 1) A stylesheet is a description of how to transform an input XML document into a resultant XML document (or HTML document or text). The stylesheet itself is described in the form of an XML document. * 2) An element is a mark-up tag in an XML document; an attribute is a modifier on the tag. For example, in <elem attr='val' attr2='val2'> "elem" is an element name, "attr" and "attr2" are attribute names with the values "val" and "val2", respectively. * 3) A namespace declaration is a special attribute that is used to associate a prefix with a URI (the namespace). The meanings of element names and attribute names that use that prefix are defined with respect to that namespace. * 
/** The lookup table for error messages. */	TokenNameCOMMENT_JAVADOC	 The lookup table for error messages. 
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
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
BAD_MSGKEY	TokenNameIdentifier	 BAD  MSGKEY
,	TokenNameCOMMA	
"A chave de mensagem ''{0}'' n�o est� na classe de mensagem ''{1}''"	TokenNameStringLiteral	A chave de mensagem ''{0}'' n�o est� na classe de mensagem ''{1}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
BAD_MSGFORMAT	TokenNameIdentifier	 BAD  MSGFORMAT
,	TokenNameCOMMA	
"O formato da mensagem ''{0}'' na classe de mensagem ''{1}'' falhou."	TokenNameStringLiteral	O formato da mensagem ''{0}'' na classe de mensagem ''{1}'' falhou.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier	 ER  SERIALIZER  NOT  CONTENTHANDLER
,	TokenNameCOMMA	
"A classe de serializador ''{0}'' n�o implementa org.xml.sax.ContentHandler."	TokenNameStringLiteral	A classe de serializador ''{0}'' n�o implementa org.xml.sax.ContentHandler.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"O recurso [ {0} ] n�o p�de ser encontrado. {1}"	TokenNameStringLiteral	O recurso [ {0} ] n�o p�de ser encontrado. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"O recurso [ {0} ] n�o p�de carregar: {1} {2} {3}"	TokenNameStringLiteral	O recurso [ {0} ] n�o p�de carregar: {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Tamanho do buffer <=0"	TokenNameStringLiteral	Tamanho do buffer <=0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"Detectado substituto UTF-16 inv�lido: {0} ?"	TokenNameStringLiteral	Detectado substituto UTF-16 inv�lido: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
"Erro de E/S"	TokenNameStringLiteral	Erro de E/S
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"Imposs�vel incluir atributo {0} depois de n�s filhos ou antes da gera��o de um elemento. O atributo ser� ignorado."	TokenNameStringLiteral	Imposs�vel incluir atributo {0} depois de n�s filhos ou antes da gera��o de um elemento. O atributo ser� ignorado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained a reference to a * namespace prefix that was undefined. The value of the substitution * text is the name of the prefix. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained a reference to a namespace prefix that was undefined. The value of the substitution text is the name of the prefix. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NAMESPACE_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  PREFIX
,	TokenNameCOMMA	
"O espa�o de nomes do prefixo ''{0}'' n�o foi declarado. "	TokenNameStringLiteral	O espa�o de nomes do prefixo ''{0}'' n�o foi declarado. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is reported if the stylesheet * being processed attempted to construct an XML document with an * attribute in a place other than on an element. The substitution text * specifies the name of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is reported if the stylesheet being processed attempted to construct an XML document with an attribute in a place other than on an element. The substitution text specifies the name of the attribute. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRAY_ATTRIBUTE	TokenNameIdentifier	 ER  STRAY  ATTRIBUTE
,	TokenNameCOMMA	
"Atributo ''{0}'' fora do elemento. "	TokenNameStringLiteral	Atributo ''{0}'' fora do elemento. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: As with the preceding message, a namespace * declaration has the form of an attribute and is only permitted to * appear on an element. The substitution text {0} is the namespace * prefix and {1} is the URI that was being used in the erroneous * namespace declaration. */	TokenNameCOMMENT_BLOCK	 Note to translators: As with the preceding message, a namespace declaration has the form of an attribute and is only permitted to appear on an element. The substitution text {0} is the namespace prefix and {1} is the URI that was being used in the erroneous namespace declaration. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRAY_NAMESPACE	TokenNameIdentifier	 ER  STRAY  NAMESPACE
,	TokenNameCOMMA	
"Declara��o de espa�o de nomes ''{0}''=''{1}'' fora do elemento. "	TokenNameStringLiteral	Declara��o de espa�o de nomes ''{0}''=''{1}'' fora do elemento. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"N�o foi poss�vel carregar ''{0}'' (verifique CLASSPATH) agora , utilizando somente os padr�es"	TokenNameStringLiteral	N�o foi poss�vel carregar ''{0}'' (verifique CLASSPATH) agora , utilizando somente os padr�es
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ILLEGAL_CHARACTER	TokenNameIdentifier	 ER  ILLEGAL  CHARACTER
,	TokenNameCOMMA	
"Tentativa de processar o caractere de um valor integral {0} que n�o � representado na codifica��o de sa�da especificada de {1}."	TokenNameStringLiteral	Tentativa de processar o caractere de um valor integral {0} que n�o � representado na codifica��o de sa�da especificada de {1}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier	 ER  COULD  NOT  LOAD  METHOD  PROPERTY
,	TokenNameCOMMA	
"N�o foi poss�vel carregar o arquivo de propriedade ''{0}'' para o m�todo de sa�da ''{1}'' (verifique CLASSPATH)"	TokenNameStringLiteral	N�o foi poss�vel carregar o arquivo de propriedade ''{0}'' para o m�todo de sa�da ''{1}'' (verifique CLASSPATH)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_PORT	TokenNameIdentifier	 ER  INVALID  PORT
,	TokenNameCOMMA	
"N�mero de porta inv�lido"	TokenNameStringLiteral	N�mero de porta inv�lido
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
,	TokenNameCOMMA	
"A porta n�o pode ser definida quando o host � nulo"	TokenNameStringLiteral	A porta n�o pode ser definida quando o host � nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier	 ER  HOST  ADDRESS  NOT  WELLFORMED
,	TokenNameCOMMA	
"O host n�o � um endere�o formado corretamente"	TokenNameStringLiteral	O host n�o � um endere�o formado corretamente
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
,	TokenNameCOMMA	
"O esquema n�o est� em conformidade."	TokenNameStringLiteral	O esquema n�o est� em conformidade.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier	 ER  SCHEME  FROM  NULL  STRING
,	TokenNameCOMMA	
"Imposs�vel definir esquema a partir da cadeia nula"	TokenNameStringLiteral	Imposs�vel definir esquema a partir da cadeia nula
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
,	TokenNameCOMMA	
"O caminho cont�m seq��ncia de escape inv�lida"	TokenNameStringLiteral	O caminho cont�m seq��ncia de escape inv�lida
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
,	TokenNameCOMMA	
"O caminho cont�m caractere inv�lido: {0}"	TokenNameStringLiteral	O caminho cont�m caractere inv�lido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_INVALID_CHAR	TokenNameIdentifier	 ER  FRAG  INVALID  CHAR
,	TokenNameCOMMA	
"O fragmento cont�m caractere inv�lido"	TokenNameStringLiteral	O fragmento cont�m caractere inv�lido
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
,	TokenNameCOMMA	
"O fragmento n�o pode ser definido quando o caminho � nulo"	TokenNameStringLiteral	O fragmento n�o pode ser definido quando o caminho � nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier	 ER  FRAG  FOR  GENERIC  URI
,	TokenNameCOMMA	
"O fragmento s� pode ser definido para um URI gen�rico"	TokenNameStringLiteral	O fragmento s� pode ser definido para um URI gen�rico
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
,	TokenNameCOMMA	
"Nenhum esquema encontrado no URI"	TokenNameStringLiteral	Nenhum esquema encontrado no URI
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier	 ER  CANNOT  INIT  URI  EMPTY  PARMS
,	TokenNameCOMMA	
"Imposs�vel inicializar URI com par�metros vazios"	TokenNameStringLiteral	Imposs�vel inicializar URI com par�metros vazios
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
,	TokenNameCOMMA	
"O fragmento n�o pode ser especificado no caminho e fragmento"	TokenNameStringLiteral	O fragmento n�o pode ser especificado no caminho e fragmento
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  QUERY  STRING  IN  PATH
,	TokenNameCOMMA	
"A cadeia de consulta n�o pode ser especificada na cadeia de consulta e caminho"	TokenNameStringLiteral	A cadeia de consulta n�o pode ser especificada na cadeia de consulta e caminho
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
,	TokenNameCOMMA	
"Port n�o pode ser especificado se host n�o for especificado"	TokenNameStringLiteral	Port n�o pode ser especificado se host n�o for especificado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier	 ER  NO  USERINFO  IF  NO  HOST
,	TokenNameCOMMA	
"Userinfo n�o pode ser especificado se host n�o for especificado"	TokenNameStringLiteral	Userinfo n�o pode ser especificado se host n�o for especificado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier	 ER  XML  VERSION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Aviso: A vers�o do documento de sa�da precisa ser ''{0}''. Essa vers�o do XML n�o � suportada. A vers�o do documento de sa�da ser� ''1.0''."	TokenNameStringLiteral	Aviso: A vers�o do documento de sa�da precisa ser ''{0}''. Essa vers�o do XML n�o � suportada. A vers�o do documento de sa�da ser� ''1.0''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
,	TokenNameCOMMA	
"O esquema � obrigat�rio!"	TokenNameStringLiteral	O esquema � obrigat�rio!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The words 'Properties' and * 'SerializerFactory' in this message are Java class names * and should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: The words 'Properties' and 'SerializerFactory' in this message are Java class names and should not be translated. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier	 ER  FACTORY  PROPERTY  MISSING
,	TokenNameCOMMA	
"O objeto Properties transmitido para SerializerFactory n�o tem uma propriedade ''{0}''."	TokenNameStringLiteral	O objeto Properties transmitido para SerializerFactory n�o tem uma propriedade ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"Aviso: A codifica��o ''{0}'' n�o � suportada pelo Java Runtime."	TokenNameStringLiteral	Aviso: A codifica��o ''{0}'' n�o � suportada pelo Java Runtime.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FEATURE_NOT_FOUND	TokenNameIdentifier	 ER  FEATURE  NOT  FOUND
,	TokenNameCOMMA	
"O par�metro ''{0}'' n�o � reconhecido."	TokenNameStringLiteral	O par�metro ''{0}'' n�o � reconhecido.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier	 ER  FEATURE  NOT  SUPPORTED
,	TokenNameCOMMA	
"O par�metro ''{0}'' � reconhecido, mas o valor pedido n�o pode ser definido. "	TokenNameStringLiteral	O par�metro ''{0}'' � reconhecido, mas o valor pedido n�o pode ser definido. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRING_TOO_LONG	TokenNameIdentifier	 ER  STRING  TOO  LONG
,	TokenNameCOMMA	
"A cadeia resultante � muito longa para caber em uma DOMString: ''{0}''. "	TokenNameStringLiteral	A cadeia resultante � muito longa para caber em uma DOMString: ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier	 ER  TYPE  MISMATCH  ERR
,	TokenNameCOMMA	
"O tipo de valor para este nome de par�metro � incompat�vel com o tipo de valor esperado. "	TokenNameStringLiteral	O tipo de valor para este nome de par�metro � incompat�vel com o tipo de valor esperado. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"O destino de sa�da para os dados a serem gravados era nulo. "	TokenNameStringLiteral	O destino de sa�da para os dados a serem gravados era nulo. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier	 ER  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Uma codifica��o n�o suportada foi encontrada. "	TokenNameStringLiteral	Uma codifica��o n�o suportada foi encontrada. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier	 ER  UNABLE  TO  SERIALIZE  NODE
,	TokenNameCOMMA	
"O n� n�o p�de ser serializado."	TokenNameStringLiteral	O n� n�o p�de ser serializado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier	 ER  CDATA  SECTIONS  SPLIT
,	TokenNameCOMMA	
"A Se��o CDATA cont�m um ou mais marcadores de t�rmino ']]>'."	TokenNameStringLiteral	A Se��o CDATA cont�m um ou mais marcadores de t�rmino ']]>'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier	 ER  WARNING  WF  NOT  CHECKED
,	TokenNameCOMMA	
"Uma inst�ncia do verificador Well-Formedness n�o p�de ser criada. O par�metro well-formed foi definido como true, mas a verifica��o well-formedness n�o pode ser executada."	TokenNameStringLiteral	Uma inst�ncia do verificador Well-Formedness n�o p�de ser criada. O par�metro well-formed foi definido como true, mas a verifica��o well-formedness n�o pode ser executada.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER
,	TokenNameCOMMA	
"O n� ''{0}'' cont�m caracteres XML inv�lidos. "	TokenNameStringLiteral	O n� ''{0}'' cont�m caracteres XML inv�lidos. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  COMMENT
,	TokenNameCOMMA	
"Um caractere XML inv�lido (Unicode: 0x{0}) foi encontrado no coment�rio. "	TokenNameStringLiteral	Um caractere XML inv�lido (Unicode: 0x{0}) foi encontrado no coment�rio. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  PI
,	TokenNameCOMMA	
"Um caractere XML inv�lido (Unicode: 0x{0}) foi encontrado no processo instructiondata."	TokenNameStringLiteral	Um caractere XML inv�lido (Unicode: 0x{0}) foi encontrado no processo instructiondata.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  CDATA
,	TokenNameCOMMA	
"Um caractere XML inv�lido (Unicode: 0x{0}) foi encontrado nos conte�dos do CDATASection. "	TokenNameStringLiteral	Um caractere XML inv�lido (Unicode: 0x{0}) foi encontrado nos conte�dos do CDATASection. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  TEXT
,	TokenNameCOMMA	
"Um caractere XML inv�lido (Unicode: 0x{0}) foi encontrado no conte�do dos dados de caractere dos n�s. "	TokenNameStringLiteral	Um caractere XML inv�lido (Unicode: 0x{0}) foi encontrado no conte�do dos dados de caractere dos n�s. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  NODE  NAME
,	TokenNameCOMMA	
"Um caractere inv�lido foi encontrado no {0} do n� denominado ''{1}''."	TokenNameStringLiteral	Um caractere inv�lido foi encontrado no {0} do n� denominado ''{1}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier	 ER  WF  DASH  IN  COMMENT
,	TokenNameCOMMA	
"A cadeia "--" n�o � permitida dentro dos coment�rios. "	TokenNameStringLiteral	A cadeia "--" n�o � permitida dentro dos coment�rios. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier	 ER  WF  LT  IN  ATTVAL
,	TokenNameCOMMA	
"O valor do atributo "{1}" associado a um tipo de elemento "{0}" n�o deve conter o caractere ''<''. "	TokenNameStringLiteral	O valor do atributo "{1}" associado a um tipo de elemento "{0}" n�o deve conter o caractere ''<''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier	 ER  WF  REF  TO  UNPARSED  ENT
,	TokenNameCOMMA	
"A refer�ncia de entidade n�o analisada "&{0};" n�o � permitida. "	TokenNameStringLiteral	A refer�ncia de entidade n�o analisada "&{0};" n�o � permitida. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier	 ER  WF  REF  TO  EXTERNAL  ENT
,	TokenNameCOMMA	
"A refer�ncia de entidade externa "&{0};" n�o � permitida em um valor de atributo. "	TokenNameStringLiteral	A refer�ncia de entidade externa "&{0};" n�o � permitida em um valor de atributo. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier	 ER  NS  PREFIX  CANNOT  BE  BOUND
,	TokenNameCOMMA	
"O prefixo "{0}" n�o pode ser vinculado ao espa�o de nomes "{1}"."	TokenNameStringLiteral	O prefixo "{0}" n�o pode ser vinculado ao espa�o de nomes "{1}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ELEMENT  NAME
,	TokenNameCOMMA	
"O nome local do elemento "{0}" � nulo."	TokenNameStringLiteral	O nome local do elemento "{0}" � nulo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ATTR  NAME
,	TokenNameCOMMA	
"O nome local do atributo "{0}" � nulo."	TokenNameStringLiteral	O nome local do atributo "{0}" � nulo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ELEM  UNBOUND  PREFIX  IN  ENTREF
,	TokenNameCOMMA	
"O texto de substitui��o do n� de entidade "{0}" cont�m um n� de elemento "{1}" com um prefixo n�o vinculado "{2}"."	TokenNameStringLiteral	O texto de substitui��o do n� de entidade "{0}" cont�m um n� de elemento "{1}" com um prefixo n�o vinculado "{2}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ATTR  UNBOUND  PREFIX  IN  ENTREF
,	TokenNameCOMMA	
"O texto de substitui��o do n� de entidade "{0}" cont�m um n� de atributo "{1}" com um prefixo n�o vinculado "{2}"."	TokenNameStringLiteral	O texto de substitui��o do n� de entidade "{0}" cont�m um n� de atributo "{1}" com um prefixo n�o vinculado "{2}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
contents	TokenNameIdentifier	 contents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
