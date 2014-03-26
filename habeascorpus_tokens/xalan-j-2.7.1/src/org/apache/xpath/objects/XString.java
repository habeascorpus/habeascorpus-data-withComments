/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XString.java 570108 2007-08-27 13:30:57Z zongaro $ */	TokenNameCOMMENT_BLOCK	 $Id: XString.java 570108 2007-08-27 13:30:57Z zongaro $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
;	TokenNameSEMICOLON	
/** * This class represents an XPath string object, and is capable of * converting the string to other types, such as a number. * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class represents an XPath string object, and is capable of converting the string to other types, such as a number. @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
XString	TokenNameIdentifier	 X String
extends	TokenNameextends	
XObject	TokenNameIdentifier	 X Object
implements	TokenNameimplements	
XMLString	TokenNameIdentifier	 XML String
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2020470518395094525L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Empty string XString object */	TokenNameCOMMENT_JAVADOC	 Empty string XString object 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XString	TokenNameIdentifier	 X String
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
=	TokenNameEQUAL	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Construct a XString object. This constructor exists for derived classes. * * @param val String object this will wrap. */	TokenNameCOMMENT_JAVADOC	 Construct a XString object. This constructor exists for derived classes. * @param val String object this will wrap. 
protected	TokenNameprotected	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a XNodeSet object. * * @param val String object this will wrap. */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object. * @param val String object this will wrap. 
public	TokenNamepublic	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell that this is a CLASS_STRING. * * @return type CLASS_STRING */	TokenNameCOMMENT_JAVADOC	 Tell that this is a CLASS_STRING. * @return type CLASS_STRING 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CLASS_STRING	TokenNameIdentifier	 CLASS  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a request type, return the equivalent string. * For diagnostic purposes. * * @return type string "#STRING" */	TokenNameCOMMENT_JAVADOC	 Given a request type, return the equivalent string. For diagnostic purposes. * @return type string "#STRING" 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#STRING"	TokenNameStringLiteral	#STRING
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
/** * Cast result object to a number. * * @return 0.0 if this string is null, numeric value of this string * or NaN */	TokenNameCOMMENT_JAVADOC	 Cast result object to a number. * @return 0.0 if this string is null, numeric value of this string or NaN 
public	TokenNamepublic	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a string to a double -- Allowed input is in fixed * notation ddd.fff. * * @return A double value representation of the string, or return Double.NaN * if the string can not be converted. */	TokenNameCOMMENT_JAVADOC	 Convert a string to a double -- Allowed input is in fixed notation ddd.fff. * @return A double value representation of the string, or return Double.NaN if the string can not be converted. 
public	TokenNamepublic	
double	TokenNamedouble	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* XMLCharacterRecognizer.isWhiteSpace(char c) methods treats the following * characters as white space characters. * ht - horizontal tab, nl - newline , cr - carriage return and sp - space * trim() methods by default also takes care of these white space characters * So trim() method is used to remove leading and trailing white spaces. */	TokenNameCOMMENT_BLOCK	 XMLCharacterRecognizer.isWhiteSpace(char c) methods treats the following characters as white space characters. ht - horizontal tab, nl - newline , cr - carriage return and sp - space trim() methods by default also takes care of these white space characters So trim() method is used to remove leading and trailing white spaces. 
XMLString	TokenNameIdentifier	 XML String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'.'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0X30	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0x39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The character is not a '-' or a '.' or a digit 	TokenNameCOMMENT_LINE	The character is not a '-' or a '.' or a digit 
// then return NaN because something is wrong. 	TokenNameCOMMENT_LINE	then return NaN because something is wrong. 
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a boolean. * * @return True if the length of this string object is greater * than 0. */	TokenNameCOMMENT_JAVADOC	 Cast result object to a boolean. * @return True if the length of this string object is greater than 0. 
public	TokenNamepublic	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The string this wraps or the empty string if null */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The string this wraps or the empty string if null 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The string this wraps or the empty string if null */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The string this wraps or the empty string if null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a result tree fragment. * * @param support Xpath context to use for the conversion * * @return A document fragment with this string as a child node */	TokenNameCOMMENT_JAVADOC	 Cast result object to a result tree fragment. * @param support Xpath context to use for the conversion * @return A document fragment with this string as a child node 
public	TokenNamepublic	
int	TokenNameint	
rtf	TokenNameIdentifier	 rtf
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
support	TokenNameIdentifier	 support
.	TokenNameDOT	
createDocumentFragment	TokenNameIdentifier	 create Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendTextChild	TokenNameIdentifier	 append Text Child
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lh	TokenNameIdentifier	 lh
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
srcBegin	TokenNameIdentifier	 src Begin
,	TokenNameCOMMA	
srcEnd	TokenNameIdentifier	 src End
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
dstBegin	TokenNameIdentifier	 dst Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if two objects are functionally equal. * * @param obj2 Object to compare this to * * @return true if the two objects are equal * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if two objects are functionally equal. * @param obj2 Object to compare this to * @return true if the two objects are equal * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. 	TokenNameCOMMENT_LINE	nodeset function. 
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If at least one object to be compared is a boolean, then each object 	TokenNameCOMMENT_LINE	If at least one object to be compared is a boolean, then each object 
// to be compared is converted to a boolean as if by applying the 	TokenNameCOMMENT_LINE	to be compared is converted to a boolean as if by applying the 
// boolean function. 	TokenNameCOMMENT_LINE	boolean function. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_BOOLEAN	TokenNameIdentifier	 CLASS  BOOLEAN
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Otherwise, if at least one object to be compared is a number, then each object 	TokenNameCOMMENT_LINE	Otherwise, if at least one object to be compared is a number, then each object 
// to be compared is converted to a number as if by applying the number function. 	TokenNameCOMMENT_LINE	to be compared is converted to a number as if by applying the number function. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Otherwise, both objects to be compared are converted to strings as 	TokenNameCOMMENT_LINE	Otherwise, both objects to be compared are converted to strings as 
// if by applying the string function. 	TokenNameCOMMENT_LINE	if by applying the string function. 
return	TokenNamereturn	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares this string to the specified object. * The result is <code>true</code> if and only if the argument is not * <code>null</code> and is a <code>String</code> object that represents * the same sequence of characters as this object. * * @param obj2 the object to compare this <code>String</code> * against. * @return <code>true</code> if the <code>String </code>are equal; * <code>false</code> otherwise. * @see java.lang.String#compareTo(java.lang.String) * @see java.lang.String#equalsIgnoreCase(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Compares this string to the specified object. The result is <code>true</code> if and only if the argument is not <code>null</code> and is a <code>String</code> object that represents the same sequence of characters as this object. * @param obj2 the object to compare this <code>String</code> against. @return <code>true</code> if the <code>String </code>are equal; <code>false</code> otherwise. @see java.lang.String#compareTo(java.lang.String) @see java.lang.String#equalsIgnoreCase(java.lang.String) 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
hasString	TokenNameIdentifier	 has String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares this string to the specified object. * The result is <code>true</code> if and only if the argument is not * <code>null</code> and is a <code>String</code> object that represents * the same sequence of characters as this object. * * @param obj2 the object to compare this <code>String</code> * against. * @return <code>true</code> if the <code>String </code>are equal; * <code>false</code> otherwise. * @see java.lang.String#compareTo(java.lang.String) * @see java.lang.String#equalsIgnoreCase(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Compares this string to the specified object. The result is <code>true</code> if and only if the argument is not <code>null</code> and is a <code>String</code> object that represents the same sequence of characters as this object. * @param obj2 the object to compare this <code>String</code> against. @return <code>true</code> if the <code>String </code>are equal; <code>false</code> otherwise. @see java.lang.String#compareTo(java.lang.String) @see java.lang.String#equalsIgnoreCase(java.lang.String) 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. 	TokenNameCOMMENT_LINE	nodeset function. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
instanceof	TokenNameinstanceof	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
instanceof	TokenNameinstanceof	
XNumber	TokenNameIdentifier	 X Number
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
anotherString	TokenNameIdentifier	 another String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares two strings lexicographically. * * @param xstr the <code>String</code> to be compared. * * @return the value <code>0</code> if the argument string is equal to * this string; a value less than <code>0</code> if this string * is lexicographically less than the string argument; and a * value greater than <code>0</code> if this string is * lexicographically greater than the string argument. * @exception java.lang.NullPointerException if <code>anotherString</code> * is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Compares two strings lexicographically. * @param xstr the <code>String</code> to be compared. * @return the value <code>0</code> if the argument string is equal to this string; a value less than <code>0</code> if this string is lexicographically less than the string argument; and a value greater than <code>0</code> if this string is lexicographically greater than the string argument. @exception java.lang.NullPointerException if <code>anotherString</code> is <code>null</code>. 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
xstr	TokenNameIdentifier	 xstr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len1	TokenNameIdentifier	 len1
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len2	TokenNameIdentifier	 len2
=	TokenNameEQUAL	
xstr	TokenNameIdentifier	 xstr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
,	TokenNameCOMMA	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
--	TokenNameMINUS_MINUS	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
xstr	TokenNameIdentifier	 xstr
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
!=	TokenNameNOT_EQUAL	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c1	TokenNameIdentifier	 c1
-	TokenNameMINUS	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
len1	TokenNameIdentifier	 len1
-	TokenNameMINUS	
len2	TokenNameIdentifier	 len2
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
// %REVIEW% Like it says, @since 1.2. Doesn't exist in earlier 	TokenNameCOMMENT_LINE	%REVIEW% Like it says, @since 1.2. Doesn't exist in earlier 
// versions of Java, hence we can't yet shell out to it. We can implement 	TokenNameCOMMENT_LINE	versions of Java, hence we can't yet shell out to it. We can implement 
// it as character-by-character compare, but doing so efficiently 	TokenNameCOMMENT_LINE	it as character-by-character compare, but doing so efficiently 
// is likely to be (ahem) interesting. 	TokenNameCOMMENT_LINE	is likely to be (ahem) interesting. 
// 	TokenNameCOMMENT_LINE	 
// However, since nobody is actually _using_ this method yet: 	TokenNameCOMMENT_LINE	However, since nobody is actually _using_ this method yet: 
// return str().compareToIgnoreCase(str.toString()); 	TokenNameCOMMENT_LINE	return str().compareToIgnoreCase(str.toString()); 
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
(	TokenNameLPAREN	
"Java 1.2 method, not yet implemented"	TokenNameStringLiteral	Java 1.2 method, not yet implemented
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
toffset	TokenNameIdentifier	 toffset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this string starts with the specified prefix. * * @param prefix the prefix. * @return <code>true</code> if the character sequence represented by the * argument is a prefix of the character sequence represented by * this string; <code>false</code> otherwise. * Note also that <code>true</code> will be returned if the * argument is an empty string or is equal to this * <code>String</code> object as determined by the * {@link #equals(Object)} method. * @exception java.lang.NullPointerException if <code>prefix</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Tests if this string starts with the specified prefix. * @param prefix the prefix. @return <code>true</code> if the character sequence represented by the argument is a prefix of the character sequence represented by this string; <code>false</code> otherwise. Note also that <code>true</code> will be returned if the argument is an empty string or is equal to this <code>String</code> object as determined by the {@link #equals(Object)} method. @exception java.lang.NullPointerException if <code>prefix</code> is <code>null</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
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
int	TokenNameint	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
toffset	TokenNameIdentifier	 toffset
;	TokenNameSEMICOLON	
int	TokenNameint	
tlim	TokenNameIdentifier	 tlim
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
po	TokenNameIdentifier	 po
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note: toffset might be near -1>>>1. 	TokenNameCOMMENT_LINE	Note: toffset might be near -1>>>1. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
toffset	TokenNameIdentifier	 toffset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
toffset	TokenNameIdentifier	 toffset
>	TokenNameGREATER	
tlim	TokenNameIdentifier	 tlim
-	TokenNameMINUS	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
pc	TokenNameIdentifier	 pc
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
po	TokenNameIdentifier	 po
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
to	TokenNameIdentifier	 to
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
po	TokenNameIdentifier	 po
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this string starts with the specified prefix. * * @param prefix the prefix. * @return <code>true</code> if the character sequence represented by the * argument is a prefix of the character sequence represented by * this string; <code>false</code> otherwise. * Note also that <code>true</code> will be returned if the * argument is an empty string or is equal to this * <code>String</code> object as determined by the * {@link #equals(Object)} method. * @exception java.lang.NullPointerException if <code>prefix</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Tests if this string starts with the specified prefix. * @param prefix the prefix. @return <code>true</code> if the character sequence represented by the argument is a prefix of the character sequence represented by this string; <code>false</code> otherwise. Note also that <code>true</code> will be returned if the argument is an empty string or is equal to this <code>String</code> object as determined by the {@link #equals(Object)} method. @exception java.lang.NullPointerException if <code>prefix</code> is <code>null</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// %REVIEW% Make an FSB here? 	TokenNameCOMMENT_LINE	%REVIEW% Make an FSB here? 
return	TokenNamereturn	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes white space from both ends of this string. * * @return this string, with white space removed from the front and end. */	TokenNameCOMMENT_JAVADOC	 Removes white space from both ends of this string. * @return this string, with white space removed from the front and end. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the specified <var>ch</var> conforms to the XML 1.0 definition * of whitespace. Refer to <A href="http://www.w3.org/TR/1998/REC-xml-19980210#NT-S"> * the definition of <CODE>S</CODE></A> for details. * @param ch Character to check as XML whitespace. * @return =true if <var>ch</var> is XML whitespace; otherwise =false. */	TokenNameCOMMENT_JAVADOC	 Returns whether the specified <var>ch</var> conforms to the XML 1.0 definition of whitespace. Refer to <A href="http://www.w3.org/TR/1998/REC-xml-19980210#NT-S"> the definition of <CODE>S</CODE></A> for details. @param ch Character to check as XML whitespace. @return =true if <var>ch</var> is XML whitespace; otherwise =false. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Take the easy way out for now. 	TokenNameCOMMENT_LINE	Take the easy way out for now. 
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
// %OPT% !!!!!!! 	TokenNameCOMMENT_LINE	%OPT% !!!!!!! 
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
edit	TokenNameIdentifier	 edit
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* replace S to ' '. and ' '+ -> single ' '. */	TokenNameCOMMENT_BLOCK	 replace S to ' '. and ' '+ -> single ' '. 
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
pres	TokenNameIdentifier	 pres
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pres	TokenNameIdentifier	 pres
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
!=	TokenNameNOT_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
edit	TokenNameIdentifier	 edit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
d	TokenNameIdentifier	 d
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doublePunctuationSpaces	TokenNameIdentifier	 double Punctuation Spaces
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
prevChar	TokenNameIdentifier	 prev Char
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prevChar	TokenNameIdentifier	 prev Char
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
prevChar	TokenNameIdentifier	 prev Char
==	TokenNameEQUAL_EQUAL	
'!'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
prevChar	TokenNameIdentifier	 prev Char
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pres	TokenNameIdentifier	 pres
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pres	TokenNameIdentifier	 pres
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
edit	TokenNameIdentifier	 edit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
pres	TokenNameIdentifier	 pres
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
d	TokenNameIdentifier	 d
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
pres	TokenNameIdentifier	 pres
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trimTail	TokenNameIdentifier	 trim Tail
&&	TokenNameAND_AND	
1	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
d	TokenNameIdentifier	 d
&&	TokenNameAND_AND	
' '	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
d	TokenNameIdentifier	 d
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
edit	TokenNameIdentifier	 edit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trimHead	TokenNameIdentifier	 trim Head
&&	TokenNameAND_AND	
0	TokenNameIntegerLiteral	
<	TokenNameLESS	
d	TokenNameIdentifier	 d
&&	TokenNameAND_AND	
' '	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
edit	TokenNameIdentifier	 edit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
xsf	TokenNameIdentifier	 xsf
=	TokenNameEQUAL	
XMLStringFactoryImpl	TokenNameIdentifier	 XML String Factory Impl
.	TokenNameDOT	
getFactory	TokenNameIdentifier	 get Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
edit	TokenNameIdentifier	 edit
?	TokenNameQUESTION	
xsf	TokenNameIdentifier	 xsf
.	TokenNameDOT	
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitStringLiteral	TokenNameIdentifier	 visit String Literal
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
