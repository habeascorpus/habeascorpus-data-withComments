/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerMessages_hu.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerMessages_hu.java 471981 2006-11-07 04:28:00Z minchau $ 
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
SerializerMessages_hu	TokenNameIdentifier	 Serializer Messages hu
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
"A(z) ''{0}'' �zenetkulcs nem tal�lhat� a(z) ''{1}'' �zenetoszt�lyban."	TokenNameStringLiteral	A(z) ''{0}'' �zenetkulcs nem tal�lhat� a(z) ''{1}'' �zenetoszt�lyban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
BAD_MSGFORMAT	TokenNameIdentifier	 BAD  MSGFORMAT
,	TokenNameCOMMA	
"A(z) ''{1}'' �zenetoszt�ly ''{0}'' �zenet�nek form�tuma hib�s."	TokenNameStringLiteral	A(z) ''{1}'' �zenetoszt�ly ''{0}'' �zenet�nek form�tuma hib�s.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier	 ER  SERIALIZER  NOT  CONTENTHANDLER
,	TokenNameCOMMA	
"A(z) ''{0}'' p�ld�nyos�t� oszt�ly nem val�s�tja meg az org.xml.sax.ContentHandler f�ggv�nyt."	TokenNameStringLiteral	A(z) ''{0}'' p�ld�nyos�t� oszt�ly nem val�s�tja meg az org.xml.sax.ContentHandler f�ggv�nyt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"A(z) [ {0} ] er?forr�s nem tal�lhat�. {1}"	TokenNameStringLiteral	A(z) [ {0} ] er?forr�s nem tal�lhat�. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"A(z) [ {0} ] er?forr�st nem lehet bet�lteni: {1} {2} {3}"	TokenNameStringLiteral	A(z) [ {0} ] er?forr�st nem lehet bet�lteni: {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Pufferm�ret <= 0"	TokenNameStringLiteral	Pufferm�ret <= 0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"�rv�nytelen UTF-16 helyettes�t�s: {0} ?"	TokenNameStringLiteral	�rv�nytelen UTF-16 helyettes�t�s: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
"IO hiba"	TokenNameStringLiteral	IO hiba
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"Nem lehet {0} attrib�tumot hozz�adni ut�d csom�pontok ut�n vagy egy elem el?�ll�t�sa el?tt. Az attrib�tum figyelmen k�v�l marad."	TokenNameStringLiteral	Nem lehet {0} attrib�tumot hozz�adni ut�d csom�pontok ut�n vagy egy elem el?�ll�t�sa el?tt. Az attrib�tum figyelmen k�v�l marad.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The stylesheet contained a reference to a * namespace prefix that was undefined. The value of the substitution * text is the name of the prefix. */	TokenNameCOMMENT_BLOCK	 Note to translators: The stylesheet contained a reference to a namespace prefix that was undefined. The value of the substitution text is the name of the prefix. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NAMESPACE_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  PREFIX
,	TokenNameCOMMA	
"A(z) ''{0}'' el?tag n�vtere nincs deklar�lva."	TokenNameStringLiteral	A(z) ''{0}'' el?tag n�vtere nincs deklar�lva.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: This message is reported if the stylesheet * being processed attempted to construct an XML document with an * attribute in a place other than on an element. The substitution text * specifies the name of the attribute. */	TokenNameCOMMENT_BLOCK	 Note to translators: This message is reported if the stylesheet being processed attempted to construct an XML document with an attribute in a place other than on an element. The substitution text specifies the name of the attribute. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRAY_ATTRIBUTE	TokenNameIdentifier	 ER  STRAY  ATTRIBUTE
,	TokenNameCOMMA	
"A(z) ''{0}'' attrib�tum k�v�l esik az elemen."	TokenNameStringLiteral	A(z) ''{0}'' attrib�tum k�v�l esik az elemen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: As with the preceding message, a namespace * declaration has the form of an attribute and is only permitted to * appear on an element. The substitution text {0} is the namespace * prefix and {1} is the URI that was being used in the erroneous * namespace declaration. */	TokenNameCOMMENT_BLOCK	 Note to translators: As with the preceding message, a namespace declaration has the form of an attribute and is only permitted to appear on an element. The substitution text {0} is the namespace prefix and {1} is the URI that was being used in the erroneous namespace declaration. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRAY_NAMESPACE	TokenNameIdentifier	 ER  STRAY  NAMESPACE
,	TokenNameCOMMA	
"A(z) ''{0}''=''{1}'' n�vt�rdeklar�ci� k�v�l esik az elemen."	TokenNameStringLiteral	A(z) ''{0}''=''{1}'' n�vt�rdeklar�ci� k�v�l esik az elemen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"Nem lehet bet�lteni ''{0}'' er?forr�st (ellen?rizze a CLASSPATH be�ll�t�st), a rendszer az alap�rtelmez�seket haszn�lja."	TokenNameStringLiteral	Nem lehet bet�lteni ''{0}'' er?forr�st (ellen?rizze a CLASSPATH be�ll�t�st), a rendszer az alap�rtelmez�seket haszn�lja.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ILLEGAL_CHARACTER	TokenNameIdentifier	 ER  ILLEGAL  CHARACTER
,	TokenNameCOMMA	
"K�s�rletet tett {0} �rt�k�nek karakteres ki�r�s�ra, de nem jelen�thet? meg a megadott {1} kimeneti k�dol�ssal."	TokenNameStringLiteral	K�s�rletet tett {0} �rt�k�nek karakteres ki�r�s�ra, de nem jelen�thet? meg a megadott {1} kimeneti k�dol�ssal.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier	 ER  COULD  NOT  LOAD  METHOD  PROPERTY
,	TokenNameCOMMA	
"Nem lehet bet�lteni a(z) ''{0}'' tulajdons�gf�jlt a(z) ''{1}'' met�dushoz (ellen?rizze a CLASSPATH be�ll�t�st)"	TokenNameStringLiteral	Nem lehet bet�lteni a(z) ''{0}'' tulajdons�gf�jlt a(z) ''{1}'' met�dushoz (ellen?rizze a CLASSPATH be�ll�t�st)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_PORT	TokenNameIdentifier	 ER  INVALID  PORT
,	TokenNameCOMMA	
"�rv�nytelen portsz�m"	TokenNameStringLiteral	�rv�nytelen portsz�m
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
,	TokenNameCOMMA	
"A portot nem �ll�thatja be, ha a hoszt null"	TokenNameStringLiteral	A portot nem �ll�thatja be, ha a hoszt null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier	 ER  HOST  ADDRESS  NOT  WELLFORMED
,	TokenNameCOMMA	
"A hoszt nem j�l form�zott c�m"	TokenNameStringLiteral	A hoszt nem j�l form�zott c�m
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
,	TokenNameCOMMA	
"A s�ma nem megfelel?."	TokenNameStringLiteral	A s�ma nem megfelel?.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier	 ER  SCHEME  FROM  NULL  STRING
,	TokenNameCOMMA	
"Nem lehet be�ll�tani a s�m�t null karaktersorozatb�l"	TokenNameStringLiteral	Nem lehet be�ll�tani a s�m�t null karaktersorozatb�l
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
,	TokenNameCOMMA	
"Az el�r�si �t �rv�nytelen vez�rl? jelsorozatot tartalmaz"	TokenNameStringLiteral	Az el�r�si �t �rv�nytelen vez�rl? jelsorozatot tartalmaz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
,	TokenNameCOMMA	
"Az el�r�si �t �rv�nytelen karaktert tartalmaz: {0}"	TokenNameStringLiteral	Az el�r�si �t �rv�nytelen karaktert tartalmaz: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_INVALID_CHAR	TokenNameIdentifier	 ER  FRAG  INVALID  CHAR
,	TokenNameCOMMA	
"A t�red�k �rv�nytelen karaktert tartalmaz"	TokenNameStringLiteral	A t�red�k �rv�nytelen karaktert tartalmaz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
,	TokenNameCOMMA	
"A t�red�ket nem �ll�thatja be, ha az el�r�si �t null"	TokenNameStringLiteral	A t�red�ket nem �ll�thatja be, ha az el�r�si �t null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier	 ER  FRAG  FOR  GENERIC  URI
,	TokenNameCOMMA	
"Csak �ltal�nos URI-hoz �ll�that be t�red�ket"	TokenNameStringLiteral	Csak �ltal�nos URI-hoz �ll�that be t�red�ket
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
,	TokenNameCOMMA	
"Nem tal�lhat� s�ma az URI-ban"	TokenNameStringLiteral	Nem tal�lhat� s�ma az URI-ban
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier	 ER  CANNOT  INIT  URI  EMPTY  PARMS
,	TokenNameCOMMA	
"Az URI nem inicializ�lhat� �res param�terekkel"	TokenNameStringLiteral	Az URI nem inicializ�lhat� �res param�terekkel
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
,	TokenNameCOMMA	
"Nem adhat meg t�red�ket az el�r�si �tban �s a t�red�kben is"	TokenNameStringLiteral	Nem adhat meg t�red�ket az el�r�si �tban �s a t�red�kben is
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  QUERY  STRING  IN  PATH
,	TokenNameCOMMA	
"Nem adhat meg lek�rdez�si karaktersorozatot az el�r�si �tban �s a lek�rdez�si karaktersorozatban"	TokenNameStringLiteral	Nem adhat meg lek�rdez�si karaktersorozatot az el�r�si �tban �s a lek�rdez�si karaktersorozatban
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
,	TokenNameCOMMA	
"Nem adhatja meg a portot, ha nincs megadva hoszt"	TokenNameStringLiteral	Nem adhatja meg a portot, ha nincs megadva hoszt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier	 ER  NO  USERINFO  IF  NO  HOST
,	TokenNameCOMMA	
"Nem adhatja meg a felhaszn�l�i inform�ci�kat, ha nincs megadva hoszt"	TokenNameStringLiteral	Nem adhatja meg a felhaszn�l�i inform�ci�kat, ha nincs megadva hoszt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier	 ER  XML  VERSION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Figyelmeztet�s: A kimeneti dokumentum k�rt verzi�ja ''{0}''. Az XML ezen verzi�ja nem t�mogatott. A kimeneti dokumentum verzi�ja ''1.0'' lesz."	TokenNameStringLiteral	Figyelmeztet�s: A kimeneti dokumentum k�rt verzi�ja ''{0}''. Az XML ezen verzi�ja nem t�mogatott. A kimeneti dokumentum verzi�ja ''1.0'' lesz.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
,	TokenNameCOMMA	
"S�m�ra van sz�ks�g!"	TokenNameStringLiteral	S�m�ra van sz�ks�g!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* * Note to translators: The words 'Properties' and * 'SerializerFactory' in this message are Java class names * and should not be translated. */	TokenNameCOMMENT_BLOCK	 Note to translators: The words 'Properties' and 'SerializerFactory' in this message are Java class names and should not be translated. 
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier	 ER  FACTORY  PROPERTY  MISSING
,	TokenNameCOMMA	
"A SerializerFactory oszt�lynak �tadott Properties objektumnak nincs ''{0}'' tulajdons�ga."	TokenNameStringLiteral	A SerializerFactory oszt�lynak �tadott Properties objektumnak nincs ''{0}'' tulajdons�ga.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"Figyelmeztet�s: A(z) ''{0}'' k�dol�st nem t�mogatja a Java fut�si k�rnyezet."	TokenNameStringLiteral	Figyelmeztet�s: A(z) ''{0}'' k�dol�st nem t�mogatja a Java fut�si k�rnyezet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FEATURE_NOT_FOUND	TokenNameIdentifier	 ER  FEATURE  NOT  FOUND
,	TokenNameCOMMA	
"A(z) ''{0}'' param�ter nem ismerhet? fel."	TokenNameStringLiteral	A(z) ''{0}'' param�ter nem ismerhet? fel.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier	 ER  FEATURE  NOT  SUPPORTED
,	TokenNameCOMMA	
"A(z) ''{0}'' param�ter ismert, de a k�rt �rt�k nem �ll�that� be."	TokenNameStringLiteral	A(z) ''{0}'' param�ter ismert, de a k�rt �rt�k nem �ll�that� be.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_STRING_TOO_LONG	TokenNameIdentifier	 ER  STRING  TOO  LONG
,	TokenNameCOMMA	
"A l�trej�v? karaktersorozat t�l hossz�, nem f�r el egy DOMString-ben: ''{0}''."	TokenNameStringLiteral	A l�trej�v? karaktersorozat t�l hossz�, nem f�r el egy DOMString-ben: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier	 ER  TYPE  MISMATCH  ERR
,	TokenNameCOMMA	
"A param�tern�v �rt�k�nek t�pusa nem kompatibilis a v�rt t�pussal."	TokenNameStringLiteral	A param�tern�v �rt�k�nek t�pusa nem kompatibilis a v�rt t�pussal.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"Az adatki�r�s c�ljak�nt megadott �rt�k �res volt."	TokenNameStringLiteral	Az adatki�r�s c�ljak�nt megadott �rt�k �res volt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier	 ER  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Nem t�mogatott k�dol�s."	TokenNameStringLiteral	Nem t�mogatott k�dol�s.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier	 ER  UNABLE  TO  SERIALIZE  NODE
,	TokenNameCOMMA	
"A csom�pont nem p�ld�nyos�that�."	TokenNameStringLiteral	A csom�pont nem p�ld�nyos�that�.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier	 ER  CDATA  SECTIONS  SPLIT
,	TokenNameCOMMA	
"A CDATA szakasz legal�bb egy ']]>' lez�r� jelz?t tartalmaz."	TokenNameStringLiteral	A CDATA szakasz legal�bb egy ']]>' lez�r� jelz?t tartalmaz.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier	 ER  WARNING  WF  NOT  CHECKED
,	TokenNameCOMMA	
"A szab�lyos form�z�st ellen?rz? p�ld�nyt nem siker�lt l�trehozni. A well-formed param�ter �rt�ke true, de a szab�lyos form�z�st nem lehet ellen?rizni."	TokenNameStringLiteral	A szab�lyos form�z�st ellen?rz? p�ld�nyt nem siker�lt l�trehozni. A well-formed param�ter �rt�ke true, de a szab�lyos form�z�st nem lehet ellen?rizni.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER
,	TokenNameCOMMA	
"A(z) ''{0}'' csom�pont �rv�nytelen XML karaktereket tartalmaz."	TokenNameStringLiteral	A(z) ''{0}'' csom�pont �rv�nytelen XML karaktereket tartalmaz.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  COMMENT
,	TokenNameCOMMA	
"�rv�nytelen XML karakter (Unicode: 0x{0}) szerepelt a megjegyz�sben."	TokenNameStringLiteral	�rv�nytelen XML karakter (Unicode: 0x{0}) szerepelt a megjegyz�sben.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  PI
,	TokenNameCOMMA	
"�rv�nytelen XML karakter (Unicode: 0x{0}) szerepelt a feldolgoz�si utas�t�sadatokban."	TokenNameStringLiteral	�rv�nytelen XML karakter (Unicode: 0x{0}) szerepelt a feldolgoz�si utas�t�sadatokban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  CDATA
,	TokenNameCOMMA	
"�rv�nytelen XML karakter (Unicode: 0x{0}) szerepelt a CDATASection tartalm�ban."	TokenNameStringLiteral	�rv�nytelen XML karakter (Unicode: 0x{0}) szerepelt a CDATASection tartalm�ban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  TEXT
,	TokenNameCOMMA	
"�rv�nytelen XML karakter (Unicode: 0x{0}) szerepelt a csom�pont karakteradat tartalm�ban."	TokenNameStringLiteral	�rv�nytelen XML karakter (Unicode: 0x{0}) szerepelt a csom�pont karakteradat tartalm�ban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  NODE  NAME
,	TokenNameCOMMA	
"�rv�nytelen XML karakter tal�lhat� a(z) ''{1}'' nev? {0} csom�pontban."	TokenNameStringLiteral	�rv�nytelen XML karakter tal�lhat� a(z) ''{1}'' nev? {0} csom�pontban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier	 ER  WF  DASH  IN  COMMENT
,	TokenNameCOMMA	
"A "--" karaktersorozat nem megengedett a megjegyz�sekben."	TokenNameStringLiteral	A "--" karaktersorozat nem megengedett a megjegyz�sekben.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier	 ER  WF  LT  IN  ATTVAL
,	TokenNameCOMMA	
"A(z) "{0}" elemt�pussal t�rs�tott "{1}" attrib�tum �rt�ke nem tartalmazhat ''<'' karaktert."	TokenNameStringLiteral	A(z) "{0}" elemt�pussal t�rs�tott "{1}" attrib�tum �rt�ke nem tartalmazhat ''<'' karaktert.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier	 ER  WF  REF  TO  UNPARSED  ENT
,	TokenNameCOMMA	
"Az �rtelmez�s n�lk�li "&{0};" entit�shivatkoz�s nem megengedett."	TokenNameStringLiteral	Az �rtelmez�s n�lk�li "&{0};" entit�shivatkoz�s nem megengedett.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier	 ER  WF  REF  TO  EXTERNAL  ENT
,	TokenNameCOMMA	
"A(z) "&{0};" k�ls? entit�shivatkoz�s nem megengedett egy attrib�tum�rt�kben."	TokenNameStringLiteral	A(z) "&{0};" k�ls? entit�shivatkoz�s nem megengedett egy attrib�tum�rt�kben.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier	 ER  NS  PREFIX  CANNOT  BE  BOUND
,	TokenNameCOMMA	
"A(z) "{0}" el?tag nem k�thet? a(z) "{1}" n�vt�rhez."	TokenNameStringLiteral	A(z) "{0}" el?tag nem k�thet? a(z) "{1}" n�vt�rhez.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ELEMENT  NAME
,	TokenNameCOMMA	
"A(z) "{0}" elem helyi neve null."	TokenNameStringLiteral	A(z) "{0}" elem helyi neve null.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ATTR  NAME
,	TokenNameCOMMA	
"A(z) "{0}" attrib�tum helyi neve null."	TokenNameStringLiteral	A(z) "{0}" attrib�tum helyi neve null.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ELEM  UNBOUND  PREFIX  IN  ENTREF
,	TokenNameCOMMA	
"A(z) "{0}" entit�scsom�pont helyettes�t? sz�vege a(z) "{1}" elemcsom�pontot tartalmazza, amelynek nem k�t�tt el?tagja "{2}"."	TokenNameStringLiteral	A(z) "{0}" entit�scsom�pont helyettes�t? sz�vege a(z) "{1}" elemcsom�pontot tartalmazza, amelynek nem k�t�tt el?tagja "{2}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ATTR  UNBOUND  PREFIX  IN  ENTREF
,	TokenNameCOMMA	
"A(z) "{0}" entit�scsom�pont helyettes�t? sz�vege a(z) "{1}" attrib�tum-csom�pontot tartalmazza, amelynek nem k�t�tt el?tagja "{2}"."	TokenNameStringLiteral	A(z) "{0}" entit�scsom�pont helyettes�t? sz�vege a(z) "{1}" attrib�tum-csom�pontot tartalmazza, amelynek nem k�t�tt el?tagja "{2}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
contents	TokenNameIdentifier	 contents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
