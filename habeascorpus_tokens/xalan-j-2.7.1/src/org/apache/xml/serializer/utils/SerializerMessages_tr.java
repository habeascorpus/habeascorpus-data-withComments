/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerMessages_tr.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerMessages_tr.java 471981 2006-11-07 04:28:00Z minchau $ 
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
SerializerMessages_tr	TokenNameIdentifier	 Serializer Messages tr
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
"''{0}'' ileti anahtarı ''{1}'' ileti sınıfında yok"	TokenNameStringLiteral	''{0}'' ileti anahtarı ''{1}'' ileti sınıfında yok
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
BAD_MSGFORMAT	TokenNameIdentifier	 BAD  MSGFORMAT
,	TokenNameCOMMA	
"''{1}'' ileti sınıfındaki ''{0}'' iletisinin biçimi ba?arısız."	TokenNameStringLiteral	''{1}'' ileti sınıfındaki ''{0}'' iletisinin biçimi ba?arısız.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier	 ER  SERIALIZER  NOT  CONTENTHANDLER
,	TokenNameCOMMA	
"''{0}'' diziselle?tirme sınıfı org.xml.sax.ContentHandler sınıfını gerçekle?tirmiyor."	TokenNameStringLiteral	''{0}'' diziselle?tirme sınıfı org.xml.sax.ContentHandler sınıfını gerçekle?tirmiyor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"Kaynak [ {0} ] bulunamadı. {1}"	TokenNameStringLiteral	Kaynak [ {0} ] bulunamadı. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"Kaynak [ {0} ] yükleyemedi: {1} {2} {3}"	TokenNameStringLiteral	Kaynak [ {0} ] yükleyemedi: {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Arabellek büyüklü?ü <=0"	TokenNameStringLiteral	Arabellek büyüklü?ü <=0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"UTF-16 yerine kullanılan de?er geçersiz: {0} ?"	TokenNameStringLiteral	UTF-16 yerine kullanılan de?er geçersiz: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
"GÇ hatası"	TokenNameStringLiteral	GÇ hatası
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"Alt dü?ümlerden sonra ya da bir ö?e üretilmeden önce {0} özniteli?i eklenemez. Öznitelik yoksayılacak."	TokenNameStringLiteral	Alt dü?ümlerden sonra ya da bir ö?e üretilmeden önce {0} özniteli?i eklenemez. Öznitelik yoksayılacak.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained a reference to a * namespace prefix that was undefined. The value of the substitution * text is the name of the prefix. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained a reference to a namespace prefix that was undefined. The value of the substitution text is the name of the prefix. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NAMESPACE_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  PREFIX
,	TokenNameCOMMA	
"''{0}'' önekine ili?kin ad alanı bildirilmedi."	TokenNameStringLiteral	''{0}'' önekine ili?kin ad alanı bildirilmedi.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is reported if the stylesheet * being processed attempted to construct an XML document with an * attribute in a place other than on an element. The substitution text * specifies the name of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is reported if the stylesheet being processed attempted to construct an XML document with an attribute in a place other than on an element. The substitution text specifies the name of the attribute. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRAY_ATTRIBUTE	TokenNameIdentifier	 ER  STRAY  ATTRIBUTE
,	TokenNameCOMMA	
"''{0}'' özniteli?i ö?enin dı?ında."	TokenNameStringLiteral	''{0}'' özniteli?i ö?enin dı?ında.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: As with the preceding message, a namespace * declaration has the form of an attribute and is only permitted to * appear on an element. The substitution text {0} is the namespace * prefix and {1} is the URI that was being used in the erroneous * namespace declaration. */	TokenNameCOMMENT_BLOCK	 Note to translators: As with the preceding message, a namespace declaration has the form of an attribute and is only permitted to appear on an element. The substitution text {0} is the namespace prefix and {1} is the URI that was being used in the erroneous namespace declaration. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRAY_NAMESPACE	TokenNameIdentifier	 ER  STRAY  NAMESPACE
,	TokenNameCOMMA	
"''{0}''=''{1}'' ad alanı bildirimi ö?enin dı?ında."	TokenNameStringLiteral	''{0}''=''{1}'' ad alanı bildirimi ö?enin dı?ında.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"''{0}'' yüklenemedi (CLASSPATH de?i?keninizi inceleyin), yalnızca varsayılanlar kullanılıyor"	TokenNameStringLiteral	''{0}'' yüklenemedi (CLASSPATH de?i?keninizi inceleyin), yalnızca varsayılanlar kullanılıyor
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ILLEGAL_CHARACTER	TokenNameIdentifier	 ER  ILLEGAL  CHARACTER
,	TokenNameCOMMA	
"Belirtilen {1} çıkı? kodlamasında gösterilmeyen {0} tümlev de?eri karakteri çıkı? giri?imi."	TokenNameStringLiteral	Belirtilen {1} çıkı? kodlamasında gösterilmeyen {0} tümlev de?eri karakteri çıkı? giri?imi.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier	 ER  COULD  NOT  LOAD  METHOD  PROPERTY
,	TokenNameCOMMA	
"''{1}'' çıkı? yöntemi için ''{0}'' özellik dosyası yüklenemedi (CLASSPATH de?i?kenini inceleyin)"	TokenNameStringLiteral	''{1}'' çıkı? yöntemi için ''{0}'' özellik dosyası yüklenemedi (CLASSPATH de?i?kenini inceleyin)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_PORT	TokenNameIdentifier	 ER  INVALID  PORT
,	TokenNameCOMMA	
"Kapı numarası geçersiz"	TokenNameStringLiteral	Kapı numarası geçersiz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
,	TokenNameCOMMA	
"Anasistem bo? de?erliyken kapı tanımlanamaz"	TokenNameStringLiteral	Anasistem bo? de?erliyken kapı tanımlanamaz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier	 ER  HOST  ADDRESS  NOT  WELLFORMED
,	TokenNameCOMMA	
"Anasistem do?ru biçimli bir adres de?il"	TokenNameStringLiteral	Anasistem do?ru biçimli bir adres de?il
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
,	TokenNameCOMMA	
"?ema uyumlu de?il."	TokenNameStringLiteral	?ema uyumlu de?il.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier	 ER  SCHEME  FROM  NULL  STRING
,	TokenNameCOMMA	
"Bo? de?erli dizgiden ?ema tanımlanamaz"	TokenNameStringLiteral	Bo? de?erli dizgiden ?ema tanımlanamaz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
,	TokenNameCOMMA	
"Yol geçersiz kaçı? dizisi içeriyor"	TokenNameStringLiteral	Yol geçersiz kaçı? dizisi içeriyor
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
,	TokenNameCOMMA	
"Yol geçersiz karakter içeriyor: {0}"	TokenNameStringLiteral	Yol geçersiz karakter içeriyor: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_INVALID_CHAR	TokenNameIdentifier	 ER  FRAG  INVALID  CHAR
,	TokenNameCOMMA	
"Parça geçersiz karakter içeriyor"	TokenNameStringLiteral	Parça geçersiz karakter içeriyor
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
,	TokenNameCOMMA	
"Yol bo? de?erliyken parça tanımlanamaz"	TokenNameStringLiteral	Yol bo? de?erliyken parça tanımlanamaz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier	 ER  FRAG  FOR  GENERIC  URI
,	TokenNameCOMMA	
"Parça yalnızca soysal URI için tanımlanabilir"	TokenNameStringLiteral	Parça yalnızca soysal URI için tanımlanabilir
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
,	TokenNameCOMMA	
"URI içinde ?ema bulunamadı"	TokenNameStringLiteral	URI içinde ?ema bulunamadı
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier	 ER  CANNOT  INIT  URI  EMPTY  PARMS
,	TokenNameCOMMA	
"Bo? de?i?tirgelerle URI kullanıma hazırlanamaz"	TokenNameStringLiteral	Bo? de?i?tirgelerle URI kullanıma hazırlanamaz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
,	TokenNameCOMMA	
"Parça hem yolda, hem de parçada belirtilemez"	TokenNameStringLiteral	Parça hem yolda, hem de parçada belirtilemez
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  QUERY  STRING  IN  PATH
,	TokenNameCOMMA	
"Yol ve sorgu dizgisinde sorgu dizgisi belirtilemez"	TokenNameStringLiteral	Yol ve sorgu dizgisinde sorgu dizgisi belirtilemez
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
,	TokenNameCOMMA	
"Anasistem belirtilmediyse kapı belirtilemez"	TokenNameStringLiteral	Anasistem belirtilmediyse kapı belirtilemez
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier	 ER  NO  USERINFO  IF  NO  HOST
,	TokenNameCOMMA	
"Anasistem belirtilmediyse kullanıcı bilgisi belirtilemez"	TokenNameStringLiteral	Anasistem belirtilmediyse kullanıcı bilgisi belirtilemez
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier	 ER  XML  VERSION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Uyarı: Çıkı? belgesinin sürümünün ''{0}'' olması isteniyor. Bu XML sürümü desteklenmez. Çıkı? dosyasının sürümü ''1.0'' olacak."	TokenNameStringLiteral	Uyarı: Çıkı? belgesinin sürümünün ''{0}'' olması isteniyor. Bu XML sürümü desteklenmez. Çıkı? dosyasının sürümü ''1.0'' olacak.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
,	TokenNameCOMMA	
"?ema gerekli!"	TokenNameStringLiteral	?ema gerekli!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The words 'Properties' and * 'SerializerFactory' in this message are Java class names * and should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: The words 'Properties' and 'SerializerFactory' in this message are Java class names and should not be translated. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier	 ER  FACTORY  PROPERTY  MISSING
,	TokenNameCOMMA	
"SerializerFactory''ye geçirilen Properties nesnesinin bir ''{0}'' özelli?i yok."	TokenNameStringLiteral	SerializerFactory''ye geçirilen Properties nesnesinin bir ''{0}'' özelli?i yok.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"Uyarı: ''{0}'' kodlaması Java Runtime tarafından desteklenmiyor."	TokenNameStringLiteral	Uyarı: ''{0}'' kodlaması Java Runtime tarafından desteklenmiyor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FEATURE_NOT_FOUND	TokenNameIdentifier	 ER  FEATURE  NOT  FOUND
,	TokenNameCOMMA	
"''{0}'' de?i?tirgesi tanınmıyor."	TokenNameStringLiteral	''{0}'' de?i?tirgesi tanınmıyor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier	 ER  FEATURE  NOT  SUPPORTED
,	TokenNameCOMMA	
"''{0}'' de?i?tirgesi tanınıyor, ancak istenen de?er tanımlanamıyor."	TokenNameStringLiteral	''{0}'' de?i?tirgesi tanınıyor, ancak istenen de?er tanımlanamıyor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRING_TOO_LONG	TokenNameIdentifier	 ER  STRING  TOO  LONG
,	TokenNameCOMMA	
"Sonuç dizgisi DOMString için çok uzun: ''{0}''."	TokenNameStringLiteral	Sonuç dizgisi DOMString için çok uzun: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier	 ER  TYPE  MISMATCH  ERR
,	TokenNameCOMMA	
"Bu de?i?tirge adına ili?kin de?er tipi, beklenen de?er tipiyle uyumlu de?il."	TokenNameStringLiteral	Bu de?i?tirge adına ili?kin de?er tipi, beklenen de?er tipiyle uyumlu de?il.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"Yazılacak verilerin çıkı? hedefi bo? de?erli."	TokenNameStringLiteral	Yazılacak verilerin çıkı? hedefi bo? de?erli.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier	 ER  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Desteklenmeyen bir kodlama saptandı."	TokenNameStringLiteral	Desteklenmeyen bir kodlama saptandı.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier	 ER  UNABLE  TO  SERIALIZE  NODE
,	TokenNameCOMMA	
"Dü?üm diziselle?tirilemedi."	TokenNameStringLiteral	Dü?üm diziselle?tirilemedi.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier	 ER  CDATA  SECTIONS  SPLIT
,	TokenNameCOMMA	
"CDATA kısmında bir ya da daha çok ']]>' sonlandırma imleyicisi var."	TokenNameStringLiteral	CDATA kısmında bir ya da daha çok ']]>' sonlandırma imleyicisi var.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier	 ER  WARNING  WF  NOT  CHECKED
,	TokenNameCOMMA	
"Well-Formedness denet?eyicisinin somut örne?i yaratılamadı. well-formed de?i?tirgesi true de?erine ayarlandı, ancak do?ru biçim denetimi gerçekle?tirilemiyor."	TokenNameStringLiteral	Well-Formedness denet?eyicisinin somut örne?i yaratılamadı. well-formed de?i?tirgesi true de?erine ayarlandı, ancak do?ru biçim denetimi gerçekle?tirilemiyor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER
,	TokenNameCOMMA	
"''{0}'' dü?ümü geçersiz XML karakterleri içeriyor."	TokenNameStringLiteral	''{0}'' dü?ümü geçersiz XML karakterleri içeriyor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  COMMENT
,	TokenNameCOMMA	
"Açıklamada geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı."	TokenNameStringLiteral	Açıklamada geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  PI
,	TokenNameCOMMA	
"??leme yönergesi verilerinde geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı."	TokenNameStringLiteral	??leme yönergesi verilerinde geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  CDATA
,	TokenNameCOMMA	
"CDATASection içeri?inde geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı."	TokenNameStringLiteral	CDATASection içeri?inde geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  TEXT
,	TokenNameCOMMA	
"Dü?ümün karakter verileri içeri?inde geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı."	TokenNameStringLiteral	Dü?ümün karakter verileri içeri?inde geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  NODE  NAME
,	TokenNameCOMMA	
"''{1}'' adlı {0} dü?ümünde geçersiz XML karakteri saptandı."	TokenNameStringLiteral	''{1}'' adlı {0} dü?ümünde geçersiz XML karakteri saptandı.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier	 ER  WF  DASH  IN  COMMENT
,	TokenNameCOMMA	
"Açıklamalar içinde "--" dizgisine izin verilmez."	TokenNameStringLiteral	Açıklamalar içinde "--" dizgisine izin verilmez.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier	 ER  WF  LT  IN  ATTVAL
,	TokenNameCOMMA	
""{0}" ö?e tipiyle ili?kilendirilen "{1}" özniteli?inin de?eri ''<'' karakteri içermemelidir."	TokenNameStringLiteral	"{0}" ö?e tipiyle ili?kilendirilen "{1}" özniteli?inin de?eri ''<'' karakteri içermemelidir.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier	 ER  WF  REF  TO  UNPARSED  ENT
,	TokenNameCOMMA	
""&{0};" ayrı?tırılmamı? varlık ba?vurusuna izin verilmez."	TokenNameStringLiteral	"&{0};" ayrı?tırılmamı? varlık ba?vurusuna izin verilmez.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier	 ER  WF  REF  TO  EXTERNAL  ENT
,	TokenNameCOMMA	
"Öznitelik de?erinde "&{0};" dı? varlık ba?vurusuna izin verilmez."	TokenNameStringLiteral	Öznitelik de?erinde "&{0};" dı? varlık ba?vurusuna izin verilmez.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier	 ER  NS  PREFIX  CANNOT  BE  BOUND
,	TokenNameCOMMA	
""{0}" öneki "{1}" ad alanına ba?lanamıyor."	TokenNameStringLiteral	"{0}" öneki "{1}" ad alanına ba?lanamıyor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ELEMENT  NAME
,	TokenNameCOMMA	
""{0}" ö?esinin yerel adı bo? de?erli."	TokenNameStringLiteral	"{0}" ö?esinin yerel adı bo? de?erli.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ATTR  NAME
,	TokenNameCOMMA	
""{0}" özniteli?inin yerel adı bo? de?erli."	TokenNameStringLiteral	"{0}" özniteli?inin yerel adı bo? de?erli.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ELEM  UNBOUND  PREFIX  IN  ENTREF
,	TokenNameCOMMA	
""{0}" varlık dü?ümünün yerine koyma metninde, ba?lanmamı? "{2}" öneki bulunan bir ö?e dü?ümü ("{1}") var."	TokenNameStringLiteral	"{0}" varlık dü?ümünün yerine koyma metninde, ba?lanmamı? "{2}" öneki bulunan bir ö?e dü?ümü ("{1}") var.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ATTR  UNBOUND  PREFIX  IN  ENTREF
,	TokenNameCOMMA	
""{0}" varlık dü?ümünün yerine koyma metninde, ba?lanmamı? "{2}" öneki bulunan bir öznitelik dü?ümü ("{1}") var."	TokenNameStringLiteral	"{0}" varlık dü?ümünün yerine koyma metninde, ba?lanmamı? "{2}" öneki bulunan bir öznitelik dü?ümü ("{1}") var.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
contents	TokenNameIdentifier	 contents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
