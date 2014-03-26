/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerMessages_pl.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerMessages_pl.java 471981 2006-11-07 04:28:00Z minchau $ 
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
SerializerMessages_pl	TokenNameIdentifier	 Serializer Messages pl
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
"Klucz komunikatu ''{0}'' nie znajduje si? w klasie komunikat—w ''{1}''"	TokenNameStringLiteral	Klucz komunikatu ''{0}'' nie znajduje si? w klasie komunikat—w ''{1}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
BAD_MSGFORMAT	TokenNameIdentifier	 BAD  MSGFORMAT
,	TokenNameCOMMA	
"Nie powiod?o si? sformatowanie komunikatu ''{0}'' w klasie komunikat—w ''{1}''."	TokenNameStringLiteral	Nie powiod?o si? sformatowanie komunikatu ''{0}'' w klasie komunikat—w ''{1}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier	 ER  SERIALIZER  NOT  CONTENTHANDLER
,	TokenNameCOMMA	
"Klasa szereguj?ca ''{0}'' nie implementuje org.xml.sax.ContentHandler."	TokenNameStringLiteral	Klasa szereguj?ca ''{0}'' nie implementuje org.xml.sax.ContentHandler.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"Nie mo?na znale?? zasobu [ {0} ]. {1}"	TokenNameStringLiteral	Nie mo?na znale?? zasobu [ {0} ]. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"Zas—b [ {0} ] nie m—g? za?adowa?: {1} {2} {3}"	TokenNameStringLiteral	Zas—b [ {0} ] nie m—g? za?adowa?: {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Wielko?? buforu <=0"	TokenNameStringLiteral	Wielko?? buforu <=0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"Wykryto niepoprawny odpowiednik UTF-16: {0} ?"	TokenNameStringLiteral	Wykryto niepoprawny odpowiednik UTF-16: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
"B??d we/wy"	TokenNameStringLiteral	B??d we/wy
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"Nie mo?na doda? atrybutu {0} po bezpo?rednich w?z?ach potomnych ani przed wyprodukowaniem elementu. Atrybut zostanie zignorowany."	TokenNameStringLiteral	Nie mo?na doda? atrybutu {0} po bezpo?rednich w?z?ach potomnych ani przed wyprodukowaniem elementu. Atrybut zostanie zignorowany.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained a reference to a * namespace prefix that was undefined. The value of the substitution * text is the name of the prefix. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained a reference to a namespace prefix that was undefined. The value of the substitution text is the name of the prefix. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NAMESPACE_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  PREFIX
,	TokenNameCOMMA	
"Nie zadeklarowano przestrzeni nazw dla przedrostka ''{0}''."	TokenNameStringLiteral	Nie zadeklarowano przestrzeni nazw dla przedrostka ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is reported if the stylesheet * being processed attempted to construct an XML document with an * attribute in a place other than on an element. The substitution text * specifies the name of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is reported if the stylesheet being processed attempted to construct an XML document with an attribute in a place other than on an element. The substitution text specifies the name of the attribute. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRAY_ATTRIBUTE	TokenNameIdentifier	 ER  STRAY  ATTRIBUTE
,	TokenNameCOMMA	
"Atrybut ''{0}'' znajduje si? poza elementem."	TokenNameStringLiteral	Atrybut ''{0}'' znajduje si? poza elementem.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: As with the preceding message, a namespace * declaration has the form of an attribute and is only permitted to * appear on an element. The substitution text {0} is the namespace * prefix and {1} is the URI that was being used in the erroneous * namespace declaration. */	TokenNameCOMMENT_BLOCK	 Note to translators: As with the preceding message, a namespace declaration has the form of an attribute and is only permitted to appear on an element. The substitution text {0} is the namespace prefix and {1} is the URI that was being used in the erroneous namespace declaration. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRAY_NAMESPACE	TokenNameIdentifier	 ER  STRAY  NAMESPACE
,	TokenNameCOMMA	
"Deklaracja przestrzeni nazw ''{0}''=''{1}'' znajduje si? poza elementem."	TokenNameStringLiteral	Deklaracja przestrzeni nazw ''{0}''=''{1}'' znajduje si? poza elementem.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"Nie mo?na za?adowa? ''{0}'' (sprawd? CLASSPATH) - u?ywane s? teraz warto?ci domy?lne"	TokenNameStringLiteral	Nie mo?na za?adowa? ''{0}'' (sprawd? CLASSPATH) - u?ywane s? teraz warto?ci domy?lne
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ILLEGAL_CHARACTER	TokenNameIdentifier	 ER  ILLEGAL  CHARACTER
,	TokenNameCOMMA	
"Pr—ba wyprowadzenia znaku warto?ci ca?kowitej {0}, kt—ry nie jest reprezentowany w podanym kodowaniu wyj?ciowym {1}."	TokenNameStringLiteral	Pr—ba wyprowadzenia znaku warto?ci ca?kowitej {0}, kt—ry nie jest reprezentowany w podanym kodowaniu wyj?ciowym {1}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier	 ER  COULD  NOT  LOAD  METHOD  PROPERTY
,	TokenNameCOMMA	
"Nie mo?na za?adowa? pliku w?a?ciwo?ci ''{0}'' dla metody wyj?ciowej ''{1}'' (sprawd? CLASSPATH)"	TokenNameStringLiteral	Nie mo?na za?adowa? pliku w?a?ciwo?ci ''{0}'' dla metody wyj?ciowej ''{1}'' (sprawd? CLASSPATH)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_PORT	TokenNameIdentifier	 ER  INVALID  PORT
,	TokenNameCOMMA	
"Niepoprawny numer portu"	TokenNameStringLiteral	Niepoprawny numer portu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
,	TokenNameCOMMA	
"Nie mo?na ustawi? portu, kiedy host jest pusty"	TokenNameStringLiteral	Nie mo?na ustawi? portu, kiedy host jest pusty
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier	 ER  HOST  ADDRESS  NOT  WELLFORMED
,	TokenNameCOMMA	
"Host nie jest poprawnie skonstruowanym adresem"	TokenNameStringLiteral	Host nie jest poprawnie skonstruowanym adresem
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
,	TokenNameCOMMA	
"Schemat nie jest zgodny."	TokenNameStringLiteral	Schemat nie jest zgodny.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier	 ER  SCHEME  FROM  NULL  STRING
,	TokenNameCOMMA	
"Nie mo?na ustawi? schematu z pustego ci?gu znak—w"	TokenNameStringLiteral	Nie mo?na ustawi? schematu z pustego ci?gu znak—w
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
,	TokenNameCOMMA	
"?cie?ka zawiera nieznan? sekwencj? o zmienionym znaczeniu"	TokenNameStringLiteral	?cie?ka zawiera nieznan? sekwencj? o zmienionym znaczeniu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
,	TokenNameCOMMA	
"?cie?ka zawiera niepoprawny znak {0}"	TokenNameStringLiteral	?cie?ka zawiera niepoprawny znak {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_INVALID_CHAR	TokenNameIdentifier	 ER  FRAG  INVALID  CHAR
,	TokenNameCOMMA	
"Fragment zawiera niepoprawny znak"	TokenNameStringLiteral	Fragment zawiera niepoprawny znak
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
,	TokenNameCOMMA	
"Nie mo?na ustawi? fragmentu, kiedy ?cie?ka jest pusta"	TokenNameStringLiteral	Nie mo?na ustawi? fragmentu, kiedy ?cie?ka jest pusta
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier	 ER  FRAG  FOR  GENERIC  URI
,	TokenNameCOMMA	
"Fragment mo?na ustawi? tylko dla og—lnego URI"	TokenNameStringLiteral	Fragment mo?na ustawi? tylko dla og—lnego URI
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
,	TokenNameCOMMA	
"Nie znaleziono schematu w URI"	TokenNameStringLiteral	Nie znaleziono schematu w URI
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier	 ER  CANNOT  INIT  URI  EMPTY  PARMS
,	TokenNameCOMMA	
"Nie mo?na zainicjowa? URI z pustymi parametrami"	TokenNameStringLiteral	Nie mo?na zainicjowa? URI z pustymi parametrami
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
,	TokenNameCOMMA	
"Nie mo?na poda? fragmentu jednocze?nie w ?cie?ce i fragmencie"	TokenNameStringLiteral	Nie mo?na poda? fragmentu jednocze?nie w ?cie?ce i fragmencie
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  QUERY  STRING  IN  PATH
,	TokenNameCOMMA	
"Tekstu zapytania nie mo?na poda? w tek?cie ?cie?ki i zapytania"	TokenNameStringLiteral	Tekstu zapytania nie mo?na poda? w tek?cie ?cie?ki i zapytania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
,	TokenNameCOMMA	
"Nie mo?na poda? portu, je?li nie podano hosta"	TokenNameStringLiteral	Nie mo?na poda? portu, je?li nie podano hosta
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier	 ER  NO  USERINFO  IF  NO  HOST
,	TokenNameCOMMA	
"Nie mo?na poda? informacji o u?ytkowniku, je?li nie podano hosta"	TokenNameStringLiteral	Nie mo?na poda? informacji o u?ytkowniku, je?li nie podano hosta
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier	 ER  XML  VERSION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Ostrze?enie: Wymagan? wersj? dokumentu wyj?ciowego jest ''{0}''. Ta wersja XML nie jest obs?ugiwana. Wersj? dokumentu wyj?ciowego b?dzie ''1.0''."	TokenNameStringLiteral	Ostrze?enie: Wymagan? wersj? dokumentu wyj?ciowego jest ''{0}''. Ta wersja XML nie jest obs?ugiwana. Wersj? dokumentu wyj?ciowego b?dzie ''1.0''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
,	TokenNameCOMMA	
"Schemat jest wymagany!"	TokenNameStringLiteral	Schemat jest wymagany!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The words 'Properties' and * 'SerializerFactory' in this message are Java class names * and should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: The words 'Properties' and 'SerializerFactory' in this message are Java class names and should not be translated. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier	 ER  FACTORY  PROPERTY  MISSING
,	TokenNameCOMMA	
"Obiekt klasy Properties przekazany do klasy SerializerFactory nie ma w?a?ciwo?ci ''{0}''."	TokenNameStringLiteral	Obiekt klasy Properties przekazany do klasy SerializerFactory nie ma w?a?ciwo?ci ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"Ostrze?enie: dekodowany ''{0}'' nie jest obs?ugiwany przez ?rodowisko wykonawcze Java."	TokenNameStringLiteral	Ostrze?enie: dekodowany ''{0}'' nie jest obs?ugiwany przez ?rodowisko wykonawcze Java.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FEATURE_NOT_FOUND	TokenNameIdentifier	 ER  FEATURE  NOT  FOUND
,	TokenNameCOMMA	
"Parametr ''{0}'' nie zosta? rozpoznany."	TokenNameStringLiteral	Parametr ''{0}'' nie zosta? rozpoznany.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier	 ER  FEATURE  NOT  SUPPORTED
,	TokenNameCOMMA	
"Parametr ''{0}'' zosta? rozpoznany, ale nie mo?na ustawi? ??danej warto?ci."	TokenNameStringLiteral	Parametr ''{0}'' zosta? rozpoznany, ale nie mo?na ustawi? ??danej warto?ci.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRING_TOO_LONG	TokenNameIdentifier	 ER  STRING  TOO  LONG
,	TokenNameCOMMA	
"Wynikowy ?a?cuch jest zbyt d?ugi, aby si? zmie?ci? w obiekcie DOMString: ''{0}''."	TokenNameStringLiteral	Wynikowy ?a?cuch jest zbyt d?ugi, aby si? zmie?ci? w obiekcie DOMString: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier	 ER  TYPE  MISMATCH  ERR
,	TokenNameCOMMA	
"Typ warto?ci parametru o tej nazwie jest niezgodny z oczekiwanym typem warto?ci. "	TokenNameStringLiteral	Typ warto?ci parametru o tej nazwie jest niezgodny z oczekiwanym typem warto?ci. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"Docelowe miejsce zapisu danych wyj?ciowych by?o puste (null)."	TokenNameStringLiteral	Docelowe miejsce zapisu danych wyj?ciowych by?o puste (null).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier	 ER  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Napotkano nieobs?ugiwane kodowanie."	TokenNameStringLiteral	Napotkano nieobs?ugiwane kodowanie.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier	 ER  UNABLE  TO  SERIALIZE  NODE
,	TokenNameCOMMA	
"Nie mo?na przekszta?ci? w?z?a do postaci szeregowej."	TokenNameStringLiteral	Nie mo?na przekszta?ci? w?z?a do postaci szeregowej.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier	 ER  CDATA  SECTIONS  SPLIT
,	TokenNameCOMMA	
"Sekcja CDATA zawiera jeden lub kilka znacznik—w zako?czenia ']]>'."	TokenNameStringLiteral	Sekcja CDATA zawiera jeden lub kilka znacznik—w zako?czenia ']]>'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier	 ER  WARNING  WF  NOT  CHECKED
,	TokenNameCOMMA	
"Nie mo?na utworzy? instancji obiektu sprawdzaj?cego Well-Formedness. Parametr well-formed ustawiono na warto?? true, ale nie mo?na by?o dokona? sprawdzenia poprawno?ci konstrukcji."	TokenNameStringLiteral	Nie mo?na utworzy? instancji obiektu sprawdzaj?cego Well-Formedness. Parametr well-formed ustawiono na warto?? true, ale nie mo?na by?o dokona? sprawdzenia poprawno?ci konstrukcji.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER
,	TokenNameCOMMA	
"W?ze? ''{0}'' zawiera niepoprawne znaki XML."	TokenNameStringLiteral	W?ze? ''{0}'' zawiera niepoprawne znaki XML.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  COMMENT
,	TokenNameCOMMA	
"W komentarzu znaleziono niepoprawny znak XML (Unicode: 0x{0})."	TokenNameStringLiteral	W komentarzu znaleziono niepoprawny znak XML (Unicode: 0x{0}).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  PI
,	TokenNameCOMMA	
"W danych instrukcji przetwarzania znaleziono niepoprawny znak XML (Unicode: 0x{0})."	TokenNameStringLiteral	W danych instrukcji przetwarzania znaleziono niepoprawny znak XML (Unicode: 0x{0}).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  CDATA
,	TokenNameCOMMA	
"W sekcji CDATA znaleziono niepoprawny znak XML (Unicode: 0x{0})."	TokenNameStringLiteral	W sekcji CDATA znaleziono niepoprawny znak XML (Unicode: 0x{0}).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  TEXT
,	TokenNameCOMMA	
"W tre?ci danych znakowych w?z?a znaleziono niepoprawny znak XML (Unicode: 0x{0})."	TokenNameStringLiteral	W tre?ci danych znakowych w?z?a znaleziono niepoprawny znak XML (Unicode: 0x{0}).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  NODE  NAME
,	TokenNameCOMMA	
"W {0} o nazwie ''{1}'' znaleziono niepoprawne znaki XML."	TokenNameStringLiteral	W {0} o nazwie ''{1}'' znaleziono niepoprawne znaki XML.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier	 ER  WF  DASH  IN  COMMENT
,	TokenNameCOMMA	
"Ci?g znak—w "--" jest niedozwolony w komentarzu."	TokenNameStringLiteral	Ci?g znak—w "--" jest niedozwolony w komentarzu.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier	 ER  WF  LT  IN  ATTVAL
,	TokenNameCOMMA	
"Warto?? atrybutu "{1}" zwi?zanego z typem elementu "{0}" nie mo?e zawiera? znaku ''<''."	TokenNameStringLiteral	Warto?? atrybutu "{1}" zwi?zanego z typem elementu "{0}" nie mo?e zawiera? znaku ''<''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier	 ER  WF  REF  TO  UNPARSED  ENT
,	TokenNameCOMMA	
"Odwo?anie do encji nieprzetwarzanej "&{0};" jest niedozwolone."	TokenNameStringLiteral	Odwo?anie do encji nieprzetwarzanej "&{0};" jest niedozwolone.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier	 ER  WF  REF  TO  EXTERNAL  ENT
,	TokenNameCOMMA	
"Odwo?anie do zewn?trznej encji "&{0};" jest niedozwolone w warto?ci atrybutu."	TokenNameStringLiteral	Odwo?anie do zewn?trznej encji "&{0};" jest niedozwolone w warto?ci atrybutu.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier	 ER  NS  PREFIX  CANNOT  BE  BOUND
,	TokenNameCOMMA	
"Nie mo?na zwi?za? przedrostka "{0}" z przestrzeni? nazw "{1}"."	TokenNameStringLiteral	Nie mo?na zwi?za? przedrostka "{0}" z przestrzeni? nazw "{1}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ELEMENT  NAME
,	TokenNameCOMMA	
"Nazwa lokalna elementu "{0}" jest pusta (null)."	TokenNameStringLiteral	Nazwa lokalna elementu "{0}" jest pusta (null).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ATTR  NAME
,	TokenNameCOMMA	
"Nazwa lokalna atrybutu "{0}" jest pusta (null)."	TokenNameStringLiteral	Nazwa lokalna atrybutu "{0}" jest pusta (null).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ELEM  UNBOUND  PREFIX  IN  ENTREF
,	TokenNameCOMMA	
"Tekst zast?puj?cy w?z?a encji "{0}" zawiera w?ze? elementu "{1}" o niezwi?zanym przedrostku "{2}"."	TokenNameStringLiteral	Tekst zast?puj?cy w?z?a encji "{0}" zawiera w?ze? elementu "{1}" o niezwi?zanym przedrostku "{2}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ATTR  UNBOUND  PREFIX  IN  ENTREF
,	TokenNameCOMMA	
"Tekst zast?puj?cy w?z?a encji "{0}" zawiera w?ze? atrybutu "{1}" o niezwi?zanym przedrostku "{2}"."	TokenNameStringLiteral	Tekst zast?puj?cy w?z?a encji "{0}" zawiera w?ze? atrybutu "{1}" o niezwi?zanym przedrostku "{2}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
contents	TokenNameIdentifier	 contents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
