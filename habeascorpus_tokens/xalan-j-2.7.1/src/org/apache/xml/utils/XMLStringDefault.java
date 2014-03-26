/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XMLStringDefault.java 570109 2007-08-27 13:31:35Z zongaro $ */	TokenNameCOMMENT_BLOCK	 $Id: XMLStringDefault.java 570109 2007-08-27 13:31:35Z zongaro $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * The default implementation of the XMLString interface, * which is just a simple wrapper of a String object. */	TokenNameCOMMENT_JAVADOC	 The default implementation of the XMLString interface, which is just a simple wrapper of a String object. 
public	TokenNamepublic	
class	TokenNameclass	
XMLStringDefault	TokenNameIdentifier	 XML String Default
implements	TokenNameimplements	
XMLString	TokenNameIdentifier	 XML String
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_str	TokenNameIdentifier	 m str
;	TokenNameSEMICOLON	
/** * Create a XMLStringDefault object from a String */	TokenNameCOMMENT_JAVADOC	 Create a XMLStringDefault object from a String 
public	TokenNamepublic	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_str	TokenNameIdentifier	 m str
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Directly call the * characters method on the passed ContentHandler for the * string-value. Multiple calls to the * ContentHandler's characters methods may well occur for a single call to * this method. * * @param ch A non-null reference to a ContentHandler. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Directly call the characters method on the passed ContentHandler for the string-value. Multiple calls to the ContentHandler's characters methods may well occur for a single call to this method. * @param ch A non-null reference to a ContentHandler. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Directly call the * comment method on the passed LexicalHandler for the * string-value. * * @param lh A non-null reference to a LexicalHandler. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Directly call the comment method on the passed LexicalHandler for the string-value. * @param lh A non-null reference to a LexicalHandler. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
dispatchAsComment	TokenNameIdentifier	 dispatch As Comment
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lh	TokenNameIdentifier	 lh
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Conditionally trim all leading and trailing whitespace in the specified String. * All strings of white space are * replaced by a single space character (#x20), except spaces after punctuation which * receive double spaces if doublePunctuationSpaces is true. * This function may be useful to a formatter, but to get first class * results, the formatter should probably do it's own white space handling * based on the semantics of the formatting object. * * @param trimHead Trim leading whitespace? * @param trimTail Trim trailing whitespace? * @param doublePunctuationSpaces Use double spaces for punctuation? * @return The trimmed string. */	TokenNameCOMMENT_JAVADOC	 Conditionally trim all leading and trailing whitespace in the specified String. All strings of white space are replaced by a single space character (#x20), except spaces after punctuation which receive double spaces if doublePunctuationSpaces is true. This function may be useful to a formatter, but to get first class results, the formatter should probably do it's own white space handling based on the semantics of the formatting object. * @param trimHead Trim leading whitespace? @param trimTail Trim trailing whitespace? @param doublePunctuationSpaces Use double spaces for punctuation? @return The trimmed string. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
fixWhiteSpace	TokenNameIdentifier	 fix White Space
(	TokenNameLPAREN	
boolean	TokenNameboolean	
trimHead	TokenNameIdentifier	 trim Head
,	TokenNameCOMMA	
boolean	TokenNameboolean	
trimTail	TokenNameIdentifier	 trim Tail
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doublePunctuationSpaces	TokenNameIdentifier	 double Punctuation Spaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the length of this string. * * @return the length of the sequence of characters represented by this * object. */	TokenNameCOMMENT_JAVADOC	 Returns the length of this string. * @return the length of the sequence of characters represented by this object. 
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the character at the specified index. An index ranges * from <code>0</code> to <code>length() - 1</code>. The first character * of the sequence is at index <code>0</code>, the next at index * <code>1</code>, and so on, as for array indexing. * * @param index the index of the character. * @return the character at the specified index of this string. * The first character is at index <code>0</code>. * @exception IndexOutOfBoundsException if the <code>index</code> * argument is negative or not less than the length of this * string. */	TokenNameCOMMENT_JAVADOC	 Returns the character at the specified index. An index ranges from <code>0</code> to <code>length() - 1</code>. The first character of the sequence is at index <code>0</code>, the next at index <code>1</code>, and so on, as for array indexing. * @param index the index of the character. @return the character at the specified index of this string. The first character is at index <code>0</code>. @exception IndexOutOfBoundsException if the <code>index</code> argument is negative or not less than the length of this string. 
public	TokenNamepublic	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies characters from this string into the destination character * array. * * @param srcBegin index of the first character in the string * to copy. * @param srcEnd index after the last character in the string * to copy. * @param dst the destination array. * @param dstBegin the start offset in the destination array. * @exception IndexOutOfBoundsException If any of the following * is true: * <ul><li><code>srcBegin</code> is negative. * <li><code>srcBegin</code> is greater than <code>srcEnd</code> * <li><code>srcEnd</code> is greater than the length of this * string * <li><code>dstBegin</code> is negative * <li><code>dstBegin+(srcEnd-srcBegin)</code> is larger than * <code>dst.length</code></ul> * @exception NullPointerException if <code>dst</code> is <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Copies characters from this string into the destination character array. * @param srcBegin index of the first character in the string to copy. @param srcEnd index after the last character in the string to copy. @param dst the destination array. @param dstBegin the start offset in the destination array. @exception IndexOutOfBoundsException If any of the following is true: <ul><li><code>srcBegin</code> is negative. <li><code>srcBegin</code> is greater than <code>srcEnd</code> <li><code>srcEnd</code> is greater than the length of this string <li><code>dstBegin</code> is negative <li><code>dstBegin+(srcEnd-srcBegin)</code> is larger than <code>dst.length</code></ul> @exception NullPointerException if <code>dst</code> is <code>null</code> 
public	TokenNamepublic	
void	TokenNamevoid	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
int	TokenNameint	
srcBegin	TokenNameIdentifier	 src Begin
,	TokenNameCOMMA	
int	TokenNameint	
srcEnd	TokenNameIdentifier	 src End
,	TokenNameCOMMA	
char	TokenNamechar	
dst	TokenNameIdentifier	 dst
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
dstBegin	TokenNameIdentifier	 dst Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
destIndex	TokenNameIdentifier	 dest Index
=	TokenNameEQUAL	
dstBegin	TokenNameIdentifier	 dst Begin
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
srcBegin	TokenNameIdentifier	 src Begin
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
srcEnd	TokenNameIdentifier	 src End
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dst	TokenNameIdentifier	 dst
[	TokenNameLBRACKET	
destIndex	TokenNameIdentifier	 dest Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Compares this string to the specified <code>String</code>. * The result is <code>true</code> if and only if the argument is not * <code>null</code> and is a <code>String</code> object that represents * the same sequence of characters as this object. * * @param obj2 the object to compare this <code>String</code> against. * @return <code>true</code> if the <code>String</code>s are equal; * <code>false</code> otherwise. * @see java.lang.String#compareTo(java.lang.String) * @see java.lang.String#equalsIgnoreCase(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Compares this string to the specified <code>String</code>. The result is <code>true</code> if and only if the argument is not <code>null</code> and is a <code>String</code> object that represents the same sequence of characters as this object. * @param obj2 the object to compare this <code>String</code> against. @return <code>true</code> if the <code>String</code>s are equal; <code>false</code> otherwise. @see java.lang.String#compareTo(java.lang.String) @see java.lang.String#equalsIgnoreCase(java.lang.String) 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares this string to the specified object. * The result is <code>true</code> if and only if the argument is not * <code>null</code> and is a <code>String</code> object that represents * the same sequence of characters as this object. * * @param anObject the object to compare this <code>String</code> * against. * @return <code>true</code> if the <code>String </code>are equal; * <code>false</code> otherwise. * @see java.lang.String#compareTo(java.lang.String) * @see java.lang.String#equalsIgnoreCase(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Compares this string to the specified object. The result is <code>true</code> if and only if the argument is not <code>null</code> and is a <code>String</code> object that represents the same sequence of characters as this object. * @param anObject the object to compare this <code>String</code> against. @return <code>true</code> if the <code>String </code>are equal; <code>false</code> otherwise. @see java.lang.String#compareTo(java.lang.String) @see java.lang.String#equalsIgnoreCase(java.lang.String) 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
anObject	TokenNameIdentifier	 an Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
anObject	TokenNameIdentifier	 an Object
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares this string to the specified object. * The result is <code>true</code> if and only if the argument is not * <code>null</code> and is a <code>String</code> object that represents * the same sequence of characters as this object. * * @param anObject the object to compare this <code>String</code> * against. * @return <code>true</code> if the <code>String </code>are equal; * <code>false</code> otherwise. * @see java.lang.String#compareTo(java.lang.String) * @see java.lang.String#equalsIgnoreCase(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Compares this string to the specified object. The result is <code>true</code> if and only if the argument is not <code>null</code> and is a <code>String</code> object that represents the same sequence of characters as this object. * @param anObject the object to compare this <code>String</code> against. @return <code>true</code> if the <code>String </code>are equal; <code>false</code> otherwise. @see java.lang.String#compareTo(java.lang.String) @see java.lang.String#equalsIgnoreCase(java.lang.String) 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
anObject	TokenNameIdentifier	 an Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
anObject	TokenNameIdentifier	 an Object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares this <code>String</code> to another <code>String</code>, * ignoring case considerations. Two strings are considered equal * ignoring case if they are of the same length, and corresponding * characters in the two strings are equal ignoring case. * * @param anotherString the <code>String</code> to compare this * <code>String</code> against. * @return <code>true</code> if the argument is not <code>null</code> * and the <code>String</code>s are equal, * ignoring case; <code>false</code> otherwise. * @see #equals(Object) * @see java.lang.Character#toLowerCase(char) * @see java.lang.Character#toUpperCase(char) */	TokenNameCOMMENT_JAVADOC	 Compares this <code>String</code> to another <code>String</code>, ignoring case considerations. Two strings are considered equal ignoring case if they are of the same length, and corresponding characters in the two strings are equal ignoring case. * @param anotherString the <code>String</code> to compare this <code>String</code> against. @return <code>true</code> if the argument is not <code>null</code> and the <code>String</code>s are equal, ignoring case; <code>false</code> otherwise. @see #equals(Object) @see java.lang.Character#toLowerCase(char) @see java.lang.Character#toUpperCase(char) 
public	TokenNamepublic	
boolean	TokenNameboolean	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
anotherString	TokenNameIdentifier	 another String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
anotherString	TokenNameIdentifier	 another String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares two strings lexicographically. * * @param anotherString the <code>String</code> to be compared. * @return the value <code>0</code> if the argument string is equal to * this string; a value less than <code>0</code> if this string * is lexicographically less than the string argument; and a * value greater than <code>0</code> if this string is * lexicographically greater than the string argument. * @exception java.lang.NullPointerException if <code>anotherString</code> * is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Compares two strings lexicographically. * @param anotherString the <code>String</code> to be compared. @return the value <code>0</code> if the argument string is equal to this string; a value less than <code>0</code> if this string is lexicographically less than the string argument; and a value greater than <code>0</code> if this string is lexicographically greater than the string argument. @exception java.lang.NullPointerException if <code>anotherString</code> is <code>null</code>. 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
anotherString	TokenNameIdentifier	 another String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
anotherString	TokenNameIdentifier	 another String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares two strings lexicographically, ignoring case considerations. * This method returns an integer whose sign is that of * <code>this.toUpperCase().toLowerCase().compareTo( * str.toUpperCase().toLowerCase())</code>. * <p> * Note that this method does <em>not</em> take locale into account, * and will result in an unsatisfactory ordering for certain locales. * The java.text package provides <em>collators</em> to allow * locale-sensitive ordering. * * @param str the <code>String</code> to be compared. * @return a negative integer, zero, or a positive integer as the * the specified String is greater than, equal to, or less * than this String, ignoring case considerations. * @see java.text.Collator#compare(String, String) * @since 1.2 */	TokenNameCOMMENT_JAVADOC	 Compares two strings lexicographically, ignoring case considerations. This method returns an integer whose sign is that of <code>this.toUpperCase().toLowerCase().compareTo( str.toUpperCase().toLowerCase())</code>. <p> Note that this method does <em>not</em> take locale into account, and will result in an unsatisfactory ordering for certain locales. The java.text package provides <em>collators</em> to allow locale-sensitive ordering. * @param str the <code>String</code> to be compared. @return a negative integer, zero, or a positive integer as the the specified String is greater than, equal to, or less than this String, ignoring case considerations. @see java.text.Collator#compare(String, String) @since 1.2 
public	TokenNamepublic	
int	TokenNameint	
compareToIgnoreCase	TokenNameIdentifier	 compare To Ignore Case
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
compareToIgnoreCase	TokenNameIdentifier	 compare To Ignore Case
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this string starts with the specified prefix beginning * a specified index. * * @param prefix the prefix. * @param toffset where to begin looking in the string. * @return <code>true</code> if the character sequence represented by the * argument is a prefix of the substring of this object starting * at index <code>toffset</code>; <code>false</code> otherwise. * The result is <code>false</code> if <code>toffset</code> is * negative or greater than the length of this * <code>String</code> object; otherwise the result is the same * as the result of the expression * <pre> * this.subString(toffset).startsWith(prefix) * </pre> * @exception java.lang.NullPointerException if <code>prefix</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Tests if this string starts with the specified prefix beginning a specified index. * @param prefix the prefix. @param toffset where to begin looking in the string. @return <code>true</code> if the character sequence represented by the argument is a prefix of the substring of this object starting at index <code>toffset</code>; <code>false</code> otherwise. The result is <code>false</code> if <code>toffset</code> is negative or greater than the length of this <code>String</code> object; otherwise the result is the same as the result of the expression <pre> this.subString(toffset).startsWith(prefix) </pre> @exception java.lang.NullPointerException if <code>prefix</code> is <code>null</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
int	TokenNameint	
toffset	TokenNameIdentifier	 toffset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
toffset	TokenNameIdentifier	 toffset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this string starts with the specified prefix beginning * a specified index. * * @param prefix the prefix. * @param toffset where to begin looking in the string. * @return <code>true</code> if the character sequence represented by the * argument is a prefix of the substring of this object starting * at index <code>toffset</code>; <code>false</code> otherwise. * The result is <code>false</code> if <code>toffset</code> is * negative or greater than the length of this * <code>String</code> object; otherwise the result is the same * as the result of the expression * <pre> * this.subString(toffset).startsWith(prefix) * </pre> * @exception java.lang.NullPointerException if <code>prefix</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Tests if this string starts with the specified prefix beginning a specified index. * @param prefix the prefix. @param toffset where to begin looking in the string. @return <code>true</code> if the character sequence represented by the argument is a prefix of the substring of this object starting at index <code>toffset</code>; <code>false</code> otherwise. The result is <code>false</code> if <code>toffset</code> is negative or greater than the length of this <code>String</code> object; otherwise the result is the same as the result of the expression <pre> this.subString(toffset).startsWith(prefix) </pre> @exception java.lang.NullPointerException if <code>prefix</code> is <code>null</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
int	TokenNameint	
toffset	TokenNameIdentifier	 toffset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toffset	TokenNameIdentifier	 toffset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this string starts with the specified prefix. * * @param prefix the prefix. * @return <code>true</code> if the character sequence represented by the * argument is a prefix of the character sequence represented by * this string; <code>false</code> otherwise. * Note also that <code>true</code> will be returned if the * argument is an empty string or is equal to this * <code>String</code> object as determined by the * {@link #equals(Object)} method. * @exception java.lang.NullPointerException if <code>prefix</code> is * <code>null</code>. * @since JDK1. 0 */	TokenNameCOMMENT_JAVADOC	 Tests if this string starts with the specified prefix. * @param prefix the prefix. @return <code>true</code> if the character sequence represented by the argument is a prefix of the character sequence represented by this string; <code>false</code> otherwise. Note also that <code>true</code> will be returned if the argument is an empty string or is equal to this <code>String</code> object as determined by the {@link #equals(Object)} method. @exception java.lang.NullPointerException if <code>prefix</code> is <code>null</code>. @since JDK1. 0 
public	TokenNamepublic	
boolean	TokenNameboolean	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this string starts with the specified prefix. * * @param prefix the prefix. * @return <code>true</code> if the character sequence represented by the * argument is a prefix of the character sequence represented by * this string; <code>false</code> otherwise. * Note also that <code>true</code> will be returned if the * argument is an empty string or is equal to this * <code>String</code> object as determined by the * {@link #equals(Object)} method. * @exception java.lang.NullPointerException if <code>prefix</code> is * <code>null</code>. * @since JDK1. 0 */	TokenNameCOMMENT_JAVADOC	 Tests if this string starts with the specified prefix. * @param prefix the prefix. @return <code>true</code> if the character sequence represented by the argument is a prefix of the character sequence represented by this string; <code>false</code> otherwise. Note also that <code>true</code> will be returned if the argument is an empty string or is equal to this <code>String</code> object as determined by the {@link #equals(Object)} method. @exception java.lang.NullPointerException if <code>prefix</code> is <code>null</code>. @since JDK1. 0 
public	TokenNamepublic	
boolean	TokenNameboolean	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this string ends with the specified suffix. * * @param suffix the suffix. * @return <code>true</code> if the character sequence represented by the * argument is a suffix of the character sequence represented by * this object; <code>false</code> otherwise. Note that the * result will be <code>true</code> if the argument is the * empty string or is equal to this <code>String</code> object * as determined by the {@link #equals(Object)} method. * @exception java.lang.NullPointerException if <code>suffix</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Tests if this string ends with the specified suffix. * @param suffix the suffix. @return <code>true</code> if the character sequence represented by the argument is a suffix of the character sequence represented by this object; <code>false</code> otherwise. Note that the result will be <code>true</code> if the argument is the empty string or is equal to this <code>String</code> object as determined by the {@link #equals(Object)} method. @exception java.lang.NullPointerException if <code>suffix</code> is <code>null</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a hashcode for this string. The hashcode for a * <code>String</code> object is computed as * <blockquote><pre> * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1] * </pre></blockquote> * using <code>int</code> arithmetic, where <code>s[i]</code> is the * <i>i</i>th character of the string, <code>n</code> is the length of * the string, and <code>^</code> indicates exponentiation. * (The hash value of the empty string is zero.) * * @return a hash code value for this object. */	TokenNameCOMMENT_JAVADOC	 Returns a hashcode for this string. The hashcode for a <code>String</code> object is computed as <blockquote><pre> s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1] </pre></blockquote> using <code>int</code> arithmetic, where <code>s[i]</code> is the <i>i</i>th character of the string, <code>n</code> is the length of the string, and <code>^</code> indicates exponentiation. (The hash value of the empty string is zero.) * @return a hash code value for this object. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index within this string of the first occurrence of the * specified character. If a character with value <code>ch</code> occurs * in the character sequence represented by this <code>String</code> * object, then the index of the first such occurrence is returned -- * that is, the smallest value <i>k</i> such that: * <blockquote><pre> * this.charAt(<i>k</i>) == ch * </pre></blockquote> * is <code>true</code>. If no such character occurs in this string, * then <code>-1</code> is returned. * * @param ch a character. * @return the index of the first occurrence of the character in the * character sequence represented by this object, or * <code>-1</code> if the character does not occur. */	TokenNameCOMMENT_JAVADOC	 Returns the index within this string of the first occurrence of the specified character. If a character with value <code>ch</code> occurs in the character sequence represented by this <code>String</code> object, then the index of the first such occurrence is returned -- that is, the smallest value <i>k</i> such that: <blockquote><pre> this.charAt(<i>k</i>) == ch </pre></blockquote> is <code>true</code>. If no such character occurs in this string, then <code>-1</code> is returned. * @param ch a character. @return the index of the first occurrence of the character in the character sequence represented by this object, or <code>-1</code> if the character does not occur. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index within this string of the first occurrence of the * specified character, starting the search at the specified index. * <p> * If a character with value <code>ch</code> occurs in the character * sequence represented by this <code>String</code> object at an index * no smaller than <code>fromIndex</code>, then the index of the first * such occurrence is returned--that is, the smallest value <i>k</i> * such that: * <blockquote><pre> * (this.charAt(<i>k</i>) == ch) && (<i>k</i> >= fromIndex) * </pre></blockquote> * is true. If no such character occurs in this string at or after * position <code>fromIndex</code>, then <code>-1</code> is returned. * <p> * There is no restriction on the value of <code>fromIndex</code>. If it * is negative, it has the same effect as if it were zero: this entire * string may be searched. If it is greater than the length of this * string, it has the same effect as if it were equal to the length of * this string: <code>-1</code> is returned. * * @param ch a character. * @param fromIndex the index to start the search from. * @return the index of the first occurrence of the character in the * character sequence represented by this object that is greater * than or equal to <code>fromIndex</code>, or <code>-1</code> * if the character does not occur. */	TokenNameCOMMENT_JAVADOC	 Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index. <p> If a character with value <code>ch</code> occurs in the character sequence represented by this <code>String</code> object at an index no smaller than <code>fromIndex</code>, then the index of the first such occurrence is returned--that is, the smallest value <i>k</i> such that: <blockquote><pre> (this.charAt(<i>k</i>) == ch) && (<i>k</i> >= fromIndex) </pre></blockquote> is true. If no such character occurs in this string at or after position <code>fromIndex</code>, then <code>-1</code> is returned. <p> There is no restriction on the value of <code>fromIndex</code>. If it is negative, it has the same effect as if it were zero: this entire string may be searched. If it is greater than the length of this string, it has the same effect as if it were equal to the length of this string: <code>-1</code> is returned. * @param ch a character. @param fromIndex the index to start the search from. @return the index of the first occurrence of the character in the character sequence represented by this object that is greater than or equal to <code>fromIndex</code>, or <code>-1</code> if the character does not occur. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index within this string of the last occurrence of the * specified character. That is, the index returned is the largest * value <i>k</i> such that: * <blockquote><pre> * this.charAt(<i>k</i>) == ch * </pre></blockquote> * is true. * The String is searched backwards starting at the last character. * * @param ch a character. * @return the index of the last occurrence of the character in the * character sequence represented by this object, or * <code>-1</code> if the character does not occur. */	TokenNameCOMMENT_JAVADOC	 Returns the index within this string of the last occurrence of the specified character. That is, the index returned is the largest value <i>k</i> such that: <blockquote><pre> this.charAt(<i>k</i>) == ch </pre></blockquote> is true. The String is searched backwards starting at the last character. * @param ch a character. @return the index of the last occurrence of the character in the character sequence represented by this object, or <code>-1</code> if the character does not occur. 
public	TokenNamepublic	
int	TokenNameint	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index within this string of the last occurrence of the * specified character, searching backward starting at the specified * index. That is, the index returned is the largest value <i>k</i> * such that: * <blockquote><pre> * this.charAt(k) == ch) && (k <= fromIndex) * </pre></blockquote> * is true. * * @param ch a character. * @param fromIndex the index to start the search from. There is no * restriction on the value of <code>fromIndex</code>. If it is * greater than or equal to the length of this string, it has * the same effect as if it were equal to one less than the * length of this string: this entire string may be searched. * If it is negative, it has the same effect as if it were -1: * -1 is returned. * @return the index of the last occurrence of the character in the * character sequence represented by this object that is less * than or equal to <code>fromIndex</code>, or <code>-1</code> * if the character does not occur before that point. */	TokenNameCOMMENT_JAVADOC	 Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index. That is, the index returned is the largest value <i>k</i> such that: <blockquote><pre> this.charAt(k) == ch) && (k <= fromIndex) </pre></blockquote> is true. * @param ch a character. @param fromIndex the index to start the search from. There is no restriction on the value of <code>fromIndex</code>. If it is greater than or equal to the length of this string, it has the same effect as if it were equal to one less than the length of this string: this entire string may be searched. If it is negative, it has the same effect as if it were -1: -1 is returned. @return the index of the last occurrence of the character in the character sequence represented by this object that is less than or equal to <code>fromIndex</code>, or <code>-1</code> if the character does not occur before that point. 
public	TokenNamepublic	
int	TokenNameint	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index within this string of the first occurrence of the * specified substring. The integer returned is the smallest value * <i>k</i> such that: * <blockquote><pre> * this.startsWith(str, <i>k</i>) * </pre></blockquote> * is <code>true</code>. * * @param str any string. * @return if the string argument occurs as a substring within this * object, then the index of the first character of the first * such substring is returned; if it does not occur as a * substring, <code>-1</code> is returned. * @exception java.lang.NullPointerException if <code>str</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the index within this string of the first occurrence of the specified substring. The integer returned is the smallest value <i>k</i> such that: <blockquote><pre> this.startsWith(str, <i>k</i>) </pre></blockquote> is <code>true</code>. * @param str any string. @return if the string argument occurs as a substring within this object, then the index of the first character of the first such substring is returned; if it does not occur as a substring, <code>-1</code> is returned. @exception java.lang.NullPointerException if <code>str</code> is <code>null</code>. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index within this string of the first occurrence of the * specified substring. The integer returned is the smallest value * <i>k</i> such that: * <blockquote><pre> * this.startsWith(str, <i>k</i>) * </pre></blockquote> * is <code>true</code>. * * @param str any string. * @return if the string argument occurs as a substring within this * object, then the index of the first character of the first * such substring is returned; if it does not occur as a * substring, <code>-1</code> is returned. * @exception java.lang.NullPointerException if <code>str</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the index within this string of the first occurrence of the specified substring. The integer returned is the smallest value <i>k</i> such that: <blockquote><pre> this.startsWith(str, <i>k</i>) </pre></blockquote> is <code>true</code>. * @param str any string. @return if the string argument occurs as a substring within this object, then the index of the first character of the first such substring is returned; if it does not occur as a substring, <code>-1</code> is returned. @exception java.lang.NullPointerException if <code>str</code> is <code>null</code>. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index within this string of the first occurrence of the * specified substring, starting at the specified index. The integer * returned is the smallest value <i>k</i> such that: * <blockquote><pre> * this.startsWith(str, <i>k</i>) && (<i>k</i> >= fromIndex) * </pre></blockquote> * is <code>true</code>. * <p> * There is no restriction on the value of <code>fromIndex</code>. If * it is negative, it has the same effect as if it were zero: this entire * string may be searched. If it is greater than the length of this * string, it has the same effect as if it were equal to the length of * this string: <code>-1</code> is returned. * * @param str the substring to search for. * @param fromIndex the index to start the search from. * @return If the string argument occurs as a substring within this * object at a starting index no smaller than * <code>fromIndex</code>, then the index of the first character * of the first such substring is returned. If it does not occur * as a substring starting at <code>fromIndex</code> or beyond, * <code>-1</code> is returned. * @exception java.lang.NullPointerException if <code>str</code> is * <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Returns the index within this string of the first occurrence of the specified substring, starting at the specified index. The integer returned is the smallest value <i>k</i> such that: <blockquote><pre> this.startsWith(str, <i>k</i>) && (<i>k</i> >= fromIndex) </pre></blockquote> is <code>true</code>. <p> There is no restriction on the value of <code>fromIndex</code>. If it is negative, it has the same effect as if it were zero: this entire string may be searched. If it is greater than the length of this string, it has the same effect as if it were equal to the length of this string: <code>-1</code> is returned. * @param str the substring to search for. @param fromIndex the index to start the search from. @return If the string argument occurs as a substring within this object at a starting index no smaller than <code>fromIndex</code>, then the index of the first character of the first such substring is returned. If it does not occur as a substring starting at <code>fromIndex</code> or beyond, <code>-1</code> is returned. @exception java.lang.NullPointerException if <code>str</code> is <code>null</code> 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index within this string of the rightmost occurrence * of the specified substring. The rightmost empty string "" is * considered to occur at the index value <code>this.length()</code>. * The returned index is the largest value <i>k</i> such that * <blockquote><pre> * this.startsWith(str, k) * </pre></blockquote> * is true. * * @param str the substring to search for. * @return if the string argument occurs one or more times as a substring * within this object, then the index of the first character of * the last such substring is returned. If it does not occur as * a substring, <code>-1</code> is returned. * @exception java.lang.NullPointerException if <code>str</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the index within this string of the rightmost occurrence of the specified substring. The rightmost empty string "" is considered to occur at the index value <code>this.length()</code>. The returned index is the largest value <i>k</i> such that <blockquote><pre> this.startsWith(str, k) </pre></blockquote> is true. * @param str the substring to search for. @return if the string argument occurs one or more times as a substring within this object, then the index of the first character of the last such substring is returned. If it does not occur as a substring, <code>-1</code> is returned. @exception java.lang.NullPointerException if <code>str</code> is <code>null</code>. 
public	TokenNamepublic	
int	TokenNameint	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index within this string of the last occurrence of * the specified substring. * * @param str the substring to search for. * @param fromIndex the index to start the search from. There is no * restriction on the value of fromIndex. If it is greater than * the length of this string, it has the same effect as if it * were equal to the length of this string: this entire string * may be searched. If it is negative, it has the same effect * as if it were -1: -1 is returned. * @return If the string argument occurs one or more times as a substring * within this object at a starting index no greater than * <code>fromIndex</code>, then the index of the first character of * the last such substring is returned. If it does not occur as a * substring starting at <code>fromIndex</code> or earlier, * <code>-1</code> is returned. * @exception java.lang.NullPointerException if <code>str</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the index within this string of the last occurrence of the specified substring. * @param str the substring to search for. @param fromIndex the index to start the search from. There is no restriction on the value of fromIndex. If it is greater than the length of this string, it has the same effect as if it were equal to the length of this string: this entire string may be searched. If it is negative, it has the same effect as if it were -1: -1 is returned. @return If the string argument occurs one or more times as a substring within this object at a starting index no greater than <code>fromIndex</code>, then the index of the first character of the last such substring is returned. If it does not occur as a substring starting at <code>fromIndex</code> or earlier, <code>-1</code> is returned. @exception java.lang.NullPointerException if <code>str</code> is <code>null</code>. 
public	TokenNamepublic	
int	TokenNameint	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new string that is a substring of this string. The * substring begins with the character at the specified index and * extends to the end of this string. <p> * Examples: * <blockquote><pre> * "unhappy".substring(2) returns "happy" * "Harbison".substring(3) returns "bison" * "emptiness".substring(9) returns "" (an empty string) * </pre></blockquote> * * @param beginIndex the beginning index, inclusive. * @return the specified substring. * @exception IndexOutOfBoundsException if * <code>beginIndex</code> is negative or larger than the * length of this <code>String</code> object. */	TokenNameCOMMENT_JAVADOC	 Returns a new string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string. <p> Examples: <blockquote><pre> "unhappy".substring(2) returns "happy" "Harbison".substring(3) returns "bison" "emptiness".substring(9) returns "" (an empty string) </pre></blockquote> * @param beginIndex the beginning index, inclusive. @return the specified substring. @exception IndexOutOfBoundsException if <code>beginIndex</code> is negative or larger than the length of this <code>String</code> object. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
int	TokenNameint	
beginIndex	TokenNameIdentifier	 begin Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
beginIndex	TokenNameIdentifier	 begin Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new string that is a substring of this string. The * substring begins at the specified <code>beginIndex</code> and * extends to the character at index <code>endIndex - 1</code>. * Thus the length of the substring is <code>endIndex-beginIndex</code>. * * @param beginIndex the beginning index, inclusive. * @param endIndex the ending index, exclusive. * @return the specified substring. * @exception IndexOutOfBoundsException if the * <code>beginIndex</code> is negative, or * <code>endIndex</code> is larger than the length of * this <code>String</code> object, or * <code>beginIndex</code> is larger than * <code>endIndex</code>. */	TokenNameCOMMENT_JAVADOC	 Returns a new string that is a substring of this string. The substring begins at the specified <code>beginIndex</code> and extends to the character at index <code>endIndex - 1</code>. Thus the length of the substring is <code>endIndex-beginIndex</code>. * @param beginIndex the beginning index, inclusive. @param endIndex the ending index, exclusive. @return the specified substring. @exception IndexOutOfBoundsException if the <code>beginIndex</code> is negative, or <code>endIndex</code> is larger than the length of this <code>String</code> object, or <code>beginIndex</code> is larger than <code>endIndex</code>. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
int	TokenNameint	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Concatenates the specified string to the end of this string. * * @param str the <code>String</code> that is concatenated to the end * of this <code>String</code>. * @return a string that represents the concatenation of this object's * characters followed by the string argument's characters. * @exception java.lang.NullPointerException if <code>str</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Concatenates the specified string to the end of this string. * @param str the <code>String</code> that is concatenated to the end of this <code>String</code>. @return a string that represents the concatenation of this object's characters followed by the string argument's characters. @exception java.lang.NullPointerException if <code>str</code> is <code>null</code>. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts all of the characters in this <code>String</code> to lower * case using the rules of the given <code>Locale</code>. * * @param locale use the case transformation rules for this locale * @return the String, converted to lowercase. * @see java.lang.Character#toLowerCase(char) * @see java.lang.String#toUpperCase(Locale) */	TokenNameCOMMENT_JAVADOC	 Converts all of the characters in this <code>String</code> to lower case using the rules of the given <code>Locale</code>. * @param locale use the case transformation rules for this locale @return the String, converted to lowercase. @see java.lang.Character#toLowerCase(char) @see java.lang.String#toUpperCase(Locale) 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts all of the characters in this <code>String</code> to lower * case using the rules of the default locale, which is returned * by <code>Locale.getDefault</code>. * <p> * * @return the string, converted to lowercase. * @see java.lang.Character#toLowerCase(char) * @see java.lang.String#toLowerCase(Locale) */	TokenNameCOMMENT_JAVADOC	 Converts all of the characters in this <code>String</code> to lower case using the rules of the default locale, which is returned by <code>Locale.getDefault</code>. <p> * @return the string, converted to lowercase. @see java.lang.Character#toLowerCase(char) @see java.lang.String#toLowerCase(Locale) 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts all of the characters in this <code>String</code> to upper * case using the rules of the given locale. * @param locale use the case transformation rules for this locale * @return the String, converted to uppercase. * @see java.lang.Character#toUpperCase(char) * @see java.lang.String#toLowerCase(Locale) */	TokenNameCOMMENT_JAVADOC	 Converts all of the characters in this <code>String</code> to upper case using the rules of the given locale. @param locale use the case transformation rules for this locale @return the String, converted to uppercase. @see java.lang.Character#toUpperCase(char) @see java.lang.String#toLowerCase(Locale) 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts all of the characters in this <code>String</code> to upper * case using the rules of the default locale, which is returned * by <code>Locale.getDefault</code>. * * <p> * If no character in this string has a different uppercase version, * based on calling the <code>toUpperCase</code> method defined by * <code>Character</code>, then the original string is returned. * <p> * Otherwise, this method creates a new <code>String</code> object * representing a character sequence identical in length to the * character sequence represented by this <code>String</code> object and * with every character equal to the result of applying the method * <code>Character.toUpperCase</code> to the corresponding character of * this <code>String</code> object. <p> * Examples: * <blockquote><pre> * "Fahrvergn&uuml;gen".toUpperCase() returns "FAHRVERGN&Uuml;GEN" * "Visit Ljubinje!".toUpperCase() returns "VISIT LJUBINJE!" * </pre></blockquote> * * @return the string, converted to uppercase. * @see java.lang.Character#toUpperCase(char) * @see java.lang.String#toUpperCase(Locale) */	TokenNameCOMMENT_JAVADOC	 Converts all of the characters in this <code>String</code> to upper case using the rules of the default locale, which is returned by <code>Locale.getDefault</code>. * <p> If no character in this string has a different uppercase version, based on calling the <code>toUpperCase</code> method defined by <code>Character</code>, then the original string is returned. <p> Otherwise, this method creates a new <code>String</code> object representing a character sequence identical in length to the character sequence represented by this <code>String</code> object and with every character equal to the result of applying the method <code>Character.toUpperCase</code> to the corresponding character of this <code>String</code> object. <p> Examples: <blockquote><pre> "Fahrvergn&uuml;gen".toUpperCase() returns "FAHRVERGN&Uuml;GEN" "Visit Ljubinje!".toUpperCase() returns "VISIT LJUBINJE!" </pre></blockquote> * @return the string, converted to uppercase. @see java.lang.Character#toUpperCase(char) @see java.lang.String#toUpperCase(Locale) 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes white space from both ends of this string. * <p> * If this <code>String</code> object represents an empty character * sequence, or the first and last characters of character sequence * represented by this <code>String</code> object both have codes * greater than <code>'&#92;u0020'</code> (the space character), then a * reference to this <code>String</code> object is returned. * <p> * Otherwise, if there is no character with a code greater than * <code>'&#92;u0020'</code> in the string, then a new * <code>String</code> object representing an empty string is created * and returned. * <p> * Otherwise, let <i>k</i> be the index of the first character in the * string whose code is greater than <code>'&#92;u0020'</code>, and let * <i>m</i> be the index of the last character in the string whose code * is greater than <code>'&#92;u0020'</code>. A new <code>String</code> * object is created, representing the substring of this string that * begins with the character at index <i>k</i> and ends with the * character at index <i>m</i>-that is, the result of * <code>this.substring(<i>k</i>,&nbsp;<i>m</i>+1)</code>. * <p> * This method may be used to trim * {@link Character#isSpace(char) whitespace} from the beginning and end * of a string; in fact, it trims all ASCII control characters as well. * * @return this string, with white space removed from the front and end. */	TokenNameCOMMENT_JAVADOC	 Removes white space from both ends of this string. <p> If this <code>String</code> object represents an empty character sequence, or the first and last characters of character sequence represented by this <code>String</code> object both have codes greater than <code>'&#92;u0020'</code> (the space character), then a reference to this <code>String</code> object is returned. <p> Otherwise, if there is no character with a code greater than <code>'&#92;u0020'</code> in the string, then a new <code>String</code> object representing an empty string is created and returned. <p> Otherwise, let <i>k</i> be the index of the first character in the string whose code is greater than <code>'&#92;u0020'</code>, and let <i>m</i> be the index of the last character in the string whose code is greater than <code>'&#92;u0020'</code>. A new <code>String</code> object is created, representing the substring of this string that begins with the character at index <i>k</i> and ends with the character at index <i>m</i>-that is, the result of <code>this.substring(<i>k</i>,&nbsp;<i>m</i>+1)</code>. <p> This method may be used to trim {@link Character#isSpace(char) whitespace} from the beginning and end of a string; in fact, it trims all ASCII control characters as well. * @return this string, with white space removed from the front and end. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_str	TokenNameIdentifier	 m str
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This object (which is already a string!) is itself returned. * * @return the string itself. */	TokenNameCOMMENT_JAVADOC	 This object (which is already a string!) is itself returned. * @return the string itself. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this object contains a java String object. * * @return true if this XMLString can return a string without creating one. */	TokenNameCOMMENT_JAVADOC	 Tell if this object contains a java String object. * @return true if this XMLString can return a string without creating one. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasString	TokenNameIdentifier	 has String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a string to a double -- Allowed input is in fixed * notation ddd.fff. * * @return A double value representation of the string, or return Double.NaN * if the string can not be converted. */	TokenNameCOMMENT_JAVADOC	 Convert a string to a double -- Allowed input is in fixed notation ddd.fff. * @return A double value representation of the string, or return Double.NaN if the string can not be converted. 
public	TokenNamepublic	
double	TokenNamedouble	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
m_str	TokenNameIdentifier	 m str
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	