/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
;	TokenNameSEMICOLON	
/** * The XMLAttributes interface defines a collection of attributes for * an element. In the parser, the document source would scan the entire * start element and collect the attributes. The attributes are * communicated to the document handler in the startElement method. * <p> * The attributes are read-write so that subsequent stages in the document * pipeline can modify the values or change the attributes that are * propagated to the next stage. * * @see XMLDocumentHandler#startElement * * @author Andy Clark, IBM * * @version $Id: XMLAttributes.java 570130 2007-08-27 14:10:55Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The XMLAttributes interface defines a collection of attributes for an element. In the parser, the document source would scan the entire start element and collect the attributes. The attributes are communicated to the document handler in the startElement method. <p> The attributes are read-write so that subsequent stages in the document pipeline can modify the values or change the attributes that are propagated to the next stage. * @see XMLDocumentHandler#startElement * @author Andy Clark, IBM * @version $Id: XMLAttributes.java 570130 2007-08-27 14:10:55Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLAttributes	TokenNameIdentifier	 XML Attributes
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLAttributes methods 	TokenNameCOMMENT_LINE	XMLAttributes methods 
// 	TokenNameCOMMENT_LINE	 
/** * Adds an attribute. The attribute's non-normalized value of the * attribute will have the same value as the attribute value until * set using the <code>setNonNormalizedValue</code> method. Also, * the added attribute will be marked as specified in the XML instance * document unless set otherwise using the <code>setSpecified</code> * method. * <p> * <strong>Note:</strong> If an attribute of the same name already * exists, the old values for the attribute are replaced by the new * values. * * @param attrName The attribute name. * @param attrType The attribute type. The type name is determined by * the type specified for this attribute in the DTD. * For example: "CDATA", "ID", "NMTOKEN", etc. However, * attributes of type enumeration will have the type * value specified as the pipe ('|') separated list of * the enumeration values prefixed by an open * parenthesis and suffixed by a close parenthesis. * For example: "(true|false)". * @param attrValue The attribute value. * * @return Returns the attribute index. * * @see #setNonNormalizedValue * @see #setSpecified */	TokenNameCOMMENT_JAVADOC	 Adds an attribute. The attribute's non-normalized value of the attribute will have the same value as the attribute value until set using the <code>setNonNormalizedValue</code> method. Also, the added attribute will be marked as specified in the XML instance document unless set otherwise using the <code>setSpecified</code> method. <p> <strong>Note:</strong> If an attribute of the same name already exists, the old values for the attribute are replaced by the new values. * @param attrName The attribute name. @param attrType The attribute type. The type name is determined by the type specified for this attribute in the DTD. For example: "CDATA", "ID", "NMTOKEN", etc. However, attributes of type enumeration will have the type value specified as the pipe ('|') separated list of the enumeration values prefixed by an open parenthesis and suffixed by a close parenthesis. For example: "(true|false)". @param attrValue The attribute value. * @return Returns the attribute index. * @see #setNonNormalizedValue @see #setSpecified 
public	TokenNamepublic	
int	TokenNameint	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrType	TokenNameIdentifier	 attr Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes all of the attributes. This method will also remove all * entities associated to the attributes. */	TokenNameCOMMENT_JAVADOC	 Removes all of the attributes. This method will also remove all entities associated to the attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllAttributes	TokenNameIdentifier	 remove All Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes the attribute at the specified index. * <p> * <strong>Note:</strong> This operation changes the indexes of all * attributes following the attribute at the specified index. * * @param attrIndex The attribute index. */	TokenNameCOMMENT_JAVADOC	 Removes the attribute at the specified index. <p> <strong>Note:</strong> This operation changes the indexes of all attributes following the attribute at the specified index. * @param attrIndex The attribute index. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAttributeAt	TokenNameIdentifier	 remove Attribute At
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the number of attributes in the list. * <p> * Once you know the number of attributes, you can iterate * through the list. * * @see #getURI(int) * @see #getLocalName(int) * @see #getQName(int) * @see #getType(int) * @see #getValue(int) */	TokenNameCOMMENT_JAVADOC	 Returns the number of attributes in the list. <p> Once you know the number of attributes, you can iterate through the list. * @see #getURI(int) @see #getLocalName(int) @see #getQName(int) @see #getType(int) @see #getValue(int) 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up the index of an attribute by XML 1.0 qualified name. * * @param qName The qualified (prefixed) name. * * @return The index of the attribute, or -1 if it does not * appear in the list. */	TokenNameCOMMENT_JAVADOC	 Look up the index of an attribute by XML 1.0 qualified name. * @param qName The qualified (prefixed) name. * @return The index of the attribute, or -1 if it does not appear in the list. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up the index of an attribute by Namespace name. * * @param uri The Namespace URI, or the empty string if * the name has no Namespace URI. * @param localPart The attribute's local name. * * @return The index of the attribute, or -1 if it does not * appear in the list. */	TokenNameCOMMENT_JAVADOC	 Look up the index of an attribute by Namespace name. * @param uri The Namespace URI, or the empty string if the name has no Namespace URI. @param localPart The attribute's local name. * @return The index of the attribute, or -1 if it does not appear in the list. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the name of the attribute at the specified index. * * @param attrIndex The attribute index. * @param attrName The new attribute name. */	TokenNameCOMMENT_JAVADOC	 Sets the name of the attribute at the specified index. * @param attrIndex The attribute index. @param attrName The new attribute name. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the fields in the given QName structure with the values * of the attribute name at the specified index. * * @param attrIndex The attribute index. * @param attrName The attribute name structure to fill in. */	TokenNameCOMMENT_JAVADOC	 Sets the fields in the given QName structure with the values of the attribute name at the specified index. * @param attrIndex The attribute index. @param attrName The attribute name structure to fill in. 
public	TokenNamepublic	
void	TokenNamevoid	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the prefix of the attribute at the specified index. * * @param index The index of the attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the prefix of the attribute at the specified index. * @param index The index of the attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an attribute's Namespace URI by index. * * @param index The attribute index (zero-based). * * @return The Namespace URI, or the empty string if none * is available, or null if the index is out of * range. * * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's Namespace URI by index. * @param index The attribute index (zero-based). * @return The Namespace URI, or the empty string if none is available, or null if the index is out of range. * @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an attribute's local name by index. * * @param index The attribute index (zero-based). * * @return The local name, or the empty string if Namespace * processing is not being performed, or null * if the index is out of range. * * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's local name by index. * @param index The attribute index (zero-based). * @return The local name, or the empty string if Namespace processing is not being performed, or null if the index is out of range. * @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an attribute's XML 1.0 qualified name by index. * * @param index The attribute index (zero-based). * * @return The XML 1.0 qualified name, or the empty string * if none is available, or null if the index * is out of range. * * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's XML 1.0 qualified name by index. * @param index The attribute index (zero-based). * @return The XML 1.0 qualified name, or the empty string if none is available, or null if the index is out of range. * @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the type of the attribute at the specified index. * * @param attrIndex The attribute index. * @param attrType The attribute type. The type name is determined by * the type specified for this attribute in the DTD. * For example: "CDATA", "ID", "NMTOKEN", etc. However, * attributes of type enumeration will have the type * value specified as the pipe ('|') separated list of * the enumeration values prefixed by an open * parenthesis and suffixed by a close parenthesis. * For example: "(true|false)". */	TokenNameCOMMENT_JAVADOC	 Sets the type of the attribute at the specified index. * @param attrIndex The attribute index. @param attrType The attribute type. The type name is determined by the type specified for this attribute in the DTD. For example: "CDATA", "ID", "NMTOKEN", etc. However, attributes of type enumeration will have the type value specified as the pipe ('|') separated list of the enumeration values prefixed by an open parenthesis and suffixed by a close parenthesis. For example: "(true|false)". 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrType	TokenNameIdentifier	 attr Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an attribute's type by index. * <p> * The attribute type is one of the strings "CDATA", "ID", * "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES", * or "NOTATION" (always in upper case). * <p> * If the parser has not read a declaration for the attribute, * or if the parser does not report attribute types, then it must * return the value "CDATA" as stated in the XML 1.0 Recommendation * (clause 3.3.3, "Attribute-Value Normalization"). * <p> * For an enumerated attribute that is not a notation, the * parser will report the type as "NMTOKEN". * * @param index The attribute index (zero-based). * * @return The attribute's type as a string, or null if the * index is out of range. * * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's type by index. <p> The attribute type is one of the strings "CDATA", "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES", or "NOTATION" (always in upper case). <p> If the parser has not read a declaration for the attribute, or if the parser does not report attribute types, then it must return the value "CDATA" as stated in the XML 1.0 Recommendation (clause 3.3.3, "Attribute-Value Normalization"). <p> For an enumerated attribute that is not a notation, the parser will report the type as "NMTOKEN". * @param index The attribute index (zero-based). * @return The attribute's type as a string, or null if the index is out of range. * @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an attribute's type by XML 1.0 qualified name. * <p> * See {@link #getType(int) getType(int)} for a description * of the possible types. * * @param qName The XML 1.0 qualified name. * * @return The attribute type as a string, or null if the * attribute is not in the list or if qualified names * are not available. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's type by XML 1.0 qualified name. <p> See {@link #getType(int) getType(int)} for a description of the possible types. * @param qName The XML 1.0 qualified name. * @return The attribute type as a string, or null if the attribute is not in the list or if qualified names are not available. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an attribute's type by Namespace name. * <p> * See {@link #getType(int) getType(int)} for a description * of the possible types. * * @param uri The Namespace URI, or the empty String if the * name has no Namespace URI. * @param localName The local name of the attribute. * * @return The attribute type as a string, or null if the * attribute is not in the list or if Namespace * processing is not being performed. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's type by Namespace name. <p> See {@link #getType(int) getType(int)} for a description of the possible types. * @param uri The Namespace URI, or the empty String if the name has no Namespace URI. @param localName The local name of the attribute. * @return The attribute type as a string, or null if the attribute is not in the list or if Namespace processing is not being performed. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the value of the attribute at the specified index. This * method will overwrite the non-normalized value of the attribute. * * @param attrIndex The attribute index. * @param attrValue The new attribute value. * * @see #setNonNormalizedValue */	TokenNameCOMMENT_JAVADOC	 Sets the value of the attribute at the specified index. This method will overwrite the non-normalized value of the attribute. * @param attrIndex The attribute index. @param attrValue The new attribute value. * @see #setNonNormalizedValue 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an attribute's value by index. * <p> * If the attribute value is a list of tokens (IDREFS, * ENTITIES, or NMTOKENS), the tokens will be concatenated * into a single string with each token separated by a * single space. * * @param index The attribute index (zero-based). * * @return The attribute's value as a string, or null if the * index is out of range. * * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's value by index. <p> If the attribute value is a list of tokens (IDREFS, ENTITIES, or NMTOKENS), the tokens will be concatenated into a single string with each token separated by a single space. * @param index The attribute index (zero-based). * @return The attribute's value as a string, or null if the index is out of range. * @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an attribute's value by XML 1.0 qualified name. * <p> * See {@link #getValue(int) getValue(int)} for a description * of the possible values. * * @param qName The XML 1.0 qualified name. * * @return The attribute value as a string, or null if the * attribute is not in the list or if qualified names * are not available. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's value by XML 1.0 qualified name. <p> See {@link #getValue(int) getValue(int)} for a description of the possible values. * @param qName The XML 1.0 qualified name. * @return The attribute value as a string, or null if the attribute is not in the list or if qualified names are not available. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an attribute's value by Namespace name. * <p> * See {@link #getValue(int) getValue(int)} for a description * of the possible values. * * @param uri The Namespace URI, or the empty String if the * name has no Namespace URI. * @param localName The local name of the attribute. * * @return The attribute value as a string, or null if the * attribute is not in the list. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's value by Namespace name. <p> See {@link #getValue(int) getValue(int)} for a description of the possible values. * @param uri The Namespace URI, or the empty String if the name has no Namespace URI. @param localName The local name of the attribute. * @return The attribute value as a string, or null if the attribute is not in the list. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the non-normalized value of the attribute at the specified * index. * * @param attrIndex The attribute index. * @param attrValue The new non-normalized attribute value. */	TokenNameCOMMENT_JAVADOC	 Sets the non-normalized value of the attribute at the specified index. * @param attrIndex The attribute index. @param attrValue The new non-normalized attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setNonNormalizedValue	TokenNameIdentifier	 set Non Normalized Value
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the non-normalized value of the attribute at the specified * index. If no non-normalized value is set, this method will return * the same value as the <code>getValue(int)</code> method. * * @param attrIndex The attribute index. */	TokenNameCOMMENT_JAVADOC	 Returns the non-normalized value of the attribute at the specified index. If no non-normalized value is set, this method will return the same value as the <code>getValue(int)</code> method. * @param attrIndex The attribute index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNonNormalizedValue	TokenNameIdentifier	 get Non Normalized Value
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets whether an attribute is specified in the instance document * or not. * * @param attrIndex The attribute index. * @param specified True if the attribute is specified in the instance * document. */	TokenNameCOMMENT_JAVADOC	 Sets whether an attribute is specified in the instance document or not. * @param attrIndex The attribute index. @param specified True if the attribute is specified in the instance document. 
public	TokenNamepublic	
void	TokenNamevoid	
setSpecified	TokenNameIdentifier	 set Specified
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the attribute is specified in the instance document. * * @param attrIndex The attribute index. */	TokenNameCOMMENT_JAVADOC	 Returns true if the attribute is specified in the instance document. * @param attrIndex The attribute index. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an augmentation by attribute's index. * * @param attributeIndex The attribute index. * @return Augmentations */	TokenNameCOMMENT_JAVADOC	 Look up an augmentation by attribute's index. * @param attributeIndex The attribute index. @return Augmentations 
public	TokenNamepublic	
Augmentations	TokenNameIdentifier	 Augmentations
getAugmentations	TokenNameIdentifier	 get Augmentations
(	TokenNameLPAREN	
int	TokenNameint	
attributeIndex	TokenNameIdentifier	 attribute Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an augmentation by namespace name. * * @param uri The Namespace URI, or the empty string if * the name has no Namespace URI. * @param localPart * @return Augmentations */	TokenNameCOMMENT_JAVADOC	 Look up an augmentation by namespace name. * @param uri The Namespace URI, or the empty string if the name has no Namespace URI. @param localPart @return Augmentations 
public	TokenNamepublic	
Augmentations	TokenNameIdentifier	 Augmentations
getAugmentations	TokenNameIdentifier	 get Augmentations
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Look up an augmentation by XML 1.0 qualified name. * <p> * * @param qName The XML 1.0 qualified name. * * @return Augmentations * */	TokenNameCOMMENT_JAVADOC	 Look up an augmentation by XML 1.0 qualified name. <p> * @param qName The XML 1.0 qualified name. * @return Augmentations 
public	TokenNamepublic	
Augmentations	TokenNameIdentifier	 Augmentations
getAugmentations	TokenNameIdentifier	 get Augmentations
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the augmentations of the attribute at the specified index. * * @param attrIndex The attribute index. * @param augs The augmentations. */	TokenNameCOMMENT_JAVADOC	 Sets the augmentations of the attribute at the specified index. * @param attrIndex The attribute index. @param augs The augmentations. 
public	TokenNamepublic	
void	TokenNamevoid	
setAugmentations	TokenNameIdentifier	 set Augmentations
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLAttributes 	TokenNameCOMMENT_LINE	interface XMLAttributes 
