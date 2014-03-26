/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerMessages_cs.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerMessages_cs.java 471981 2006-11-07 04:28:00Z minchau $ 
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
SerializerMessages_cs	TokenNameIdentifier	 Serializer Messages cs
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
"Klí? zprávy ''{0}'' není obsa?en ve t?íd? zpráv ''{1}''"	TokenNameStringLiteral	Klí? zprávy ''{0}'' není obsa?en ve t?íd? zpráv ''{1}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
BAD_MSGFORMAT	TokenNameIdentifier	 BAD  MSGFORMAT
,	TokenNameCOMMA	
"Formát zprávy ''{0}'' ve t?íd? zpráv ''{1}'' selhal. "	TokenNameStringLiteral	Formát zprávy ''{0}'' ve t?íd? zpráv ''{1}'' selhal. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier	 ER  SERIALIZER  NOT  CONTENTHANDLER
,	TokenNameCOMMA	
"T?ída serializace ''{0}'' neimplementuje obslu?n? program org.xml.sax.ContentHandler."	TokenNameStringLiteral	T?ída serializace ''{0}'' neimplementuje obslu?n? program org.xml.sax.ContentHandler.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"Nelze najít zdroj [ {0} ]. {1}"	TokenNameStringLiteral	Nelze najít zdroj [ {0} ]. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"Nelze zavést zdroj [ {0} ]: {1} {2} {3}"	TokenNameStringLiteral	Nelze zavést zdroj [ {0} ]: {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Velikost vyrovnávací pam?ti <=0"	TokenNameStringLiteral	Velikost vyrovnávací pam?ti <=0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"Byla zji?t?na neplatná náhrada UTF-16: {0} ?"	TokenNameStringLiteral	Byla zji?t?na neplatná náhrada UTF-16: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
"Chyba vstupu/v?stupu"	TokenNameStringLiteral	Chyba vstupu/v?stupu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"Nelze p?idat atribut {0} po uzlech potomk? ani p?ed tím, ne? je vytvo?en prvek. Atribut bude ignorován."	TokenNameStringLiteral	Nelze p?idat atribut {0} po uzlech potomk? ani p?ed tím, ne? je vytvo?en prvek. Atribut bude ignorován.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained a reference to a * namespace prefix that was undefined. The value of the substitution * text is the name of the prefix. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained a reference to a namespace prefix that was undefined. The value of the substitution text is the name of the prefix. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NAMESPACE_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  PREFIX
,	TokenNameCOMMA	
"Obor názv? pro p?edponu ''{0}'' nebyl deklarován."	TokenNameStringLiteral	Obor názv? pro p?edponu ''{0}'' nebyl deklarován.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is reported if the stylesheet * being processed attempted to construct an XML document with an * attribute in a place other than on an element. The substitution text * specifies the name of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is reported if the stylesheet being processed attempted to construct an XML document with an attribute in a place other than on an element. The substitution text specifies the name of the attribute. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRAY_ATTRIBUTE	TokenNameIdentifier	 ER  STRAY  ATTRIBUTE
,	TokenNameCOMMA	
"Atribut ''{0}'' se nachází vn? prvku."	TokenNameStringLiteral	Atribut ''{0}'' se nachází vn? prvku.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: As with the preceding message, a namespace * declaration has the form of an attribute and is only permitted to * appear on an element. The substitution text {0} is the namespace * prefix and {1} is the URI that was being used in the erroneous * namespace declaration. */	TokenNameCOMMENT_BLOCK	 Note to translators: As with the preceding message, a namespace declaration has the form of an attribute and is only permitted to appear on an element. The substitution text {0} is the namespace prefix and {1} is the URI that was being used in the erroneous namespace declaration. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRAY_NAMESPACE	TokenNameIdentifier	 ER  STRAY  NAMESPACE
,	TokenNameCOMMA	
"Deklarace oboru názv? ''{0}''=''{1}'' se nachází vn? prvku."	TokenNameStringLiteral	Deklarace oboru názv? ''{0}''=''{1}'' se nachází vn? prvku.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"Nelze zavést prost?edek ''{0}'' (zkontrolujte prom?nnou CLASSPATH) - budou pou?ity pouze v?chozí prost?edky"	TokenNameStringLiteral	Nelze zavést prost?edek ''{0}'' (zkontrolujte prom?nnou CLASSPATH) - budou pou?ity pouze v?chozí prost?edky
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ILLEGAL_CHARACTER	TokenNameIdentifier	 ER  ILLEGAL  CHARACTER
,	TokenNameCOMMA	
"Byl proveden pokus o v?stup znaku s celo?íselnou hodnotou {0}, která není reprezentována v ur?eném v?stupním kódování {1}."	TokenNameStringLiteral	Byl proveden pokus o v?stup znaku s celo?íselnou hodnotou {0}, která není reprezentována v ur?eném v?stupním kódování {1}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier	 ER  COULD  NOT  LOAD  METHOD  PROPERTY
,	TokenNameCOMMA	
"Nelze na?íst soubor vlastností ''{0}'' pro v?stupní metodu ''{1}'' (zkontrolujte prom?nnou CLASSPATH)."	TokenNameStringLiteral	Nelze na?íst soubor vlastností ''{0}'' pro v?stupní metodu ''{1}'' (zkontrolujte prom?nnou CLASSPATH).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_PORT	TokenNameIdentifier	 ER  INVALID  PORT
,	TokenNameCOMMA	
"Neplatné ?íslo portu."	TokenNameStringLiteral	Neplatné ?íslo portu.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
,	TokenNameCOMMA	
"Má-li hostitel hodnotu null, nelze nastavit port."	TokenNameStringLiteral	Má-li hostitel hodnotu null, nelze nastavit port.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier	 ER  HOST  ADDRESS  NOT  WELLFORMED
,	TokenNameCOMMA	
"Adresa hostitele má nesprávn? formát."	TokenNameStringLiteral	Adresa hostitele má nesprávn? formát.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
,	TokenNameCOMMA	
"Schéma nevyhovuje."	TokenNameStringLiteral	Schéma nevyhovuje.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier	 ER  SCHEME  FROM  NULL  STRING
,	TokenNameCOMMA	
"Nelze nastavit schéma ?et?zce s hodnotou null."	TokenNameStringLiteral	Nelze nastavit schéma ?et?zce s hodnotou null.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
,	TokenNameCOMMA	
"Cesta obsahuje neplatnou escape sekvenci"	TokenNameStringLiteral	Cesta obsahuje neplatnou escape sekvenci
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
,	TokenNameCOMMA	
"Cesta obsahuje neplatn? znak: {0}"	TokenNameStringLiteral	Cesta obsahuje neplatn? znak: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_INVALID_CHAR	TokenNameIdentifier	 ER  FRAG  INVALID  CHAR
,	TokenNameCOMMA	
"Fragment obsahuje neplatn? znak."	TokenNameStringLiteral	Fragment obsahuje neplatn? znak.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
,	TokenNameCOMMA	
"Má-li cesta hodnotu null, nelze nastavit fragment."	TokenNameStringLiteral	Má-li cesta hodnotu null, nelze nastavit fragment.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier	 ER  FRAG  FOR  GENERIC  URI
,	TokenNameCOMMA	
"Fragment lze nastavit jen u generického URI."	TokenNameStringLiteral	Fragment lze nastavit jen u generického URI.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
,	TokenNameCOMMA	
"V URI nebylo nalezeno ?ádné schéma"	TokenNameStringLiteral	V URI nebylo nalezeno ?ádné schéma
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier	 ER  CANNOT  INIT  URI  EMPTY  PARMS
,	TokenNameCOMMA	
"URI nelze inicializovat s prázdn?mi parametry."	TokenNameStringLiteral	URI nelze inicializovat s prázdn?mi parametry.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
,	TokenNameCOMMA	
"Fragment nelze ur?it zárove? v cest? i ve fragmentu."	TokenNameStringLiteral	Fragment nelze ur?it zárove? v cest? i ve fragmentu.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  QUERY  STRING  IN  PATH
,	TokenNameCOMMA	
"V ?et?zci cesty a dotazu nelze zadat ?et?zec dotazu."	TokenNameStringLiteral	V ?et?zci cesty a dotazu nelze zadat ?et?zec dotazu.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
,	TokenNameCOMMA	
"Není-li ur?en hostitel, nelze zadat port."	TokenNameStringLiteral	Není-li ur?en hostitel, nelze zadat port.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier	 ER  NO  USERINFO  IF  NO  HOST
,	TokenNameCOMMA	
"Není-li ur?en hostitel, nelze zadat údaje o u?ivateli."	TokenNameStringLiteral	Není-li ur?en hostitel, nelze zadat údaje o u?ivateli.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier	 ER  XML  VERSION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Varování: Je po?adována verze ''{0}'' v?stupního dokumentu. Tato verze formátu XML není podporována. Bude pou?ita verze ''1.0'' v?stupního dokumentu. "	TokenNameStringLiteral	Varování: Je po?adována verze ''{0}'' v?stupního dokumentu. Tato verze formátu XML není podporována. Bude pou?ita verze ''1.0'' v?stupního dokumentu. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
,	TokenNameCOMMA	
"Je vy?adováno schéma!"	TokenNameStringLiteral	Je vy?adováno schéma!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The words 'Properties' and * 'SerializerFactory' in this message are Java class names * and should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: The words 'Properties' and 'SerializerFactory' in this message are Java class names and should not be translated. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier	 ER  FACTORY  PROPERTY  MISSING
,	TokenNameCOMMA	
"Objekt vlastností p?edan? faktorii SerializerFactory neobsahuje vlastnost ''{0}''. "	TokenNameStringLiteral	Objekt vlastností p?edan? faktorii SerializerFactory neobsahuje vlastnost ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"Varování: Kódování ''{0}'' není v b?hovém prost?edí Java podporováno."	TokenNameStringLiteral	Varování: Kódování ''{0}'' není v b?hovém prost?edí Java podporováno.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FEATURE_NOT_FOUND	TokenNameIdentifier	 ER  FEATURE  NOT  FOUND
,	TokenNameCOMMA	
"Parametr ''{0}'' nebyl rozpoznán."	TokenNameStringLiteral	Parametr ''{0}'' nebyl rozpoznán.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier	 ER  FEATURE  NOT  SUPPORTED
,	TokenNameCOMMA	
"Parametr ''{0}'' byl rozpoznán, ale nelze nastavit po?adovanou hodnotu."	TokenNameStringLiteral	Parametr ''{0}'' byl rozpoznán, ale nelze nastavit po?adovanou hodnotu.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRING_TOO_LONG	TokenNameIdentifier	 ER  STRING  TOO  LONG
,	TokenNameCOMMA	
"V?sledn? ?et?zec je p?íli? dlouh? pro ?et?zec DOMString: ''{0}''."	TokenNameStringLiteral	V?sledn? ?et?zec je p?íli? dlouh? pro ?et?zec DOMString: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier	 ER  TYPE  MISMATCH  ERR
,	TokenNameCOMMA	
"Typ hodnoty pro tento název parametru není kompatibilní s o?ekávan?m typem hodnoty."	TokenNameStringLiteral	Typ hodnoty pro tento název parametru není kompatibilní s o?ekávan?m typem hodnoty.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"Cílové umíst?ní v?stupu pro data ur?ená k zápisu je rovno hodnot? Null. "	TokenNameStringLiteral	Cílové umíst?ní v?stupu pro data ur?ená k zápisu je rovno hodnot? Null. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier	 ER  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Bylo nalezeno nepodporované kódování."	TokenNameStringLiteral	Bylo nalezeno nepodporované kódování.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier	 ER  UNABLE  TO  SERIALIZE  NODE
,	TokenNameCOMMA	
"Nelze provést serializaci uzlu. "	TokenNameStringLiteral	Nelze provést serializaci uzlu. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier	 ER  CDATA  SECTIONS  SPLIT
,	TokenNameCOMMA	
"Sekce CDATA obsahuje jednu nebo více ukon?ovacích zna?ek ']]>'."	TokenNameStringLiteral	Sekce CDATA obsahuje jednu nebo více ukon?ovacích zna?ek ']]>'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier	 ER  WARNING  WF  NOT  CHECKED
,	TokenNameCOMMA	
"Nelze vytvo?it instanci modulu pro kontrolu správného utvo?ení. Parametr správného utvo?ení byl nastaven na hodnotu true, nepoda?ilo se v?ak zkontrolovat správnost utvo?ení. "	TokenNameStringLiteral	Nelze vytvo?it instanci modulu pro kontrolu správného utvo?ení. Parametr správného utvo?ení byl nastaven na hodnotu true, nepoda?ilo se v?ak zkontrolovat správnost utvo?ení. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER
,	TokenNameCOMMA	
"Uzel ''{0}'' obsahuje neplatné znaky XML. "	TokenNameStringLiteral	Uzel ''{0}'' obsahuje neplatné znaky XML. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  COMMENT
,	TokenNameCOMMA	
"V poznámce byl zji?t?n neplatn? znak XML (Unicode: 0x{0})."	TokenNameStringLiteral	V poznámce byl zji?t?n neplatn? znak XML (Unicode: 0x{0}).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  PI
,	TokenNameCOMMA	
"V datech instrukce zpracování byl nalezen neplatn? znak XML (Unicode: 0x{0})."	TokenNameStringLiteral	V datech instrukce zpracování byl nalezen neplatn? znak XML (Unicode: 0x{0}).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  CDATA
,	TokenNameCOMMA	
"V oddílu CDATASection byl nalezen neplatn? znak XML (Unicode: 0x{0})."	TokenNameStringLiteral	V oddílu CDATASection byl nalezen neplatn? znak XML (Unicode: 0x{0}).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  TEXT
,	TokenNameCOMMA	
"V obsahu znakov?ch dat uzlu byl nalezen neplatn? znak XML (Unicode: 0x{0})."	TokenNameStringLiteral	V obsahu znakov?ch dat uzlu byl nalezen neplatn? znak XML (Unicode: 0x{0}).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  NODE  NAME
,	TokenNameCOMMA	
"V objektu {0} s názvem ''{1}'' byl nalezen neplatn? znak XML. "	TokenNameStringLiteral	V objektu {0} s názvem ''{1}'' byl nalezen neplatn? znak XML. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier	 ER  WF  DASH  IN  COMMENT
,	TokenNameCOMMA	
"V poznámkách není povolen ?et?zec "--"."	TokenNameStringLiteral	V poznámkách není povolen ?et?zec "--".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier	 ER  WF  LT  IN  ATTVAL
,	TokenNameCOMMA	
"Hodnota atributu "{1}" souvisejícího s typem prvku "{0}" nesmí obsahovat znak ''<''."	TokenNameStringLiteral	Hodnota atributu "{1}" souvisejícího s typem prvku "{0}" nesmí obsahovat znak ''<''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier	 ER  WF  REF  TO  UNPARSED  ENT
,	TokenNameCOMMA	
"Odkaz na neanalyzovanou entitu "&{0};" není povolen."	TokenNameStringLiteral	Odkaz na neanalyzovanou entitu "&{0};" není povolen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier	 ER  WF  REF  TO  EXTERNAL  ENT
,	TokenNameCOMMA	
"Externí odkaz na entitu "&{0};" není v hodnot? atributu povolen."	TokenNameStringLiteral	Externí odkaz na entitu "&{0};" není v hodnot? atributu povolen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier	 ER  NS  PREFIX  CANNOT  BE  BOUND
,	TokenNameCOMMA	
"P?edpona "{0}" nesmí b?t vázaná k oboru názv? "{1}"."	TokenNameStringLiteral	P?edpona "{0}" nesmí b?t vázaná k oboru názv? "{1}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ELEMENT  NAME
,	TokenNameCOMMA	
"Lokální název prvku "{0}" má hodnotu Null. "	TokenNameStringLiteral	Lokální název prvku "{0}" má hodnotu Null. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ATTR  NAME
,	TokenNameCOMMA	
"Lokální název atributu "{0}" má hodnotu Null. "	TokenNameStringLiteral	Lokální název atributu "{0}" má hodnotu Null. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ELEM  UNBOUND  PREFIX  IN  ENTREF
,	TokenNameCOMMA	
"Nov? text uzlu entity "{0}" obsahuje uzel prvku "{1}" s nesvázanou p?edponou "{2}"."	TokenNameStringLiteral	Nov? text uzlu entity "{0}" obsahuje uzel prvku "{1}" s nesvázanou p?edponou "{2}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ATTR  UNBOUND  PREFIX  IN  ENTREF
,	TokenNameCOMMA	
"Nov? text uzlu entity "{0}" obsahuje uzel atributu "{1}" s nesvázanou p?edponou "{2}". "	TokenNameStringLiteral	Nov? text uzlu entity "{0}" obsahuje uzel atributu "{1}" s nesvázanou p?edponou "{2}". 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
contents	TokenNameIdentifier	 contents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
