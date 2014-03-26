/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XStringForChars.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XStringForChars.java 468655 2006-10-28 07:12:06Z minchau $ 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
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
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
/** * This class will wrap a FastStringBuffer and allow for */	TokenNameCOMMENT_JAVADOC	 This class will wrap a FastStringBuffer and allow for 
public	TokenNamepublic	
class	TokenNameclass	
XStringForChars	TokenNameIdentifier	 X String For Chars
extends	TokenNameextends	
XString	TokenNameIdentifier	 X String
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
2235248887220850467L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The start position in the fsb. */	TokenNameCOMMENT_JAVADOC	 The start position in the fsb. 
int	TokenNameint	
m_start	TokenNameIdentifier	 m start
;	TokenNameSEMICOLON	
/** The length of the string. */	TokenNameCOMMENT_JAVADOC	 The length of the string. 
int	TokenNameint	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_strCache	TokenNameIdentifier	 m str Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Construct a XNodeSet object. * * @param val FastStringBuffer object this will wrap, must be non-null. * @param start The start position in the array. * @param length The number of characters to read from the array. */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object. * @param val FastStringBuffer object this will wrap, must be non-null. @param start The start position in the array. @param length The number of characters to read from the array. 
public	TokenNamepublic	
XStringForChars	TokenNameIdentifier	 X String For Chars
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_start	TokenNameIdentifier	 m start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
m_length	TokenNameIdentifier	 m length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_FASTSTRINGBUFFER_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FASTSTRINGBUFFER  CANNOT  BE  NULL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"The FastStringBuffer argument can not be null!!"); 	TokenNameCOMMENT_LINE	"The FastStringBuffer argument can not be null!!"); 
}	TokenNameRBRACE	
/** * Construct a XNodeSet object. * * @param val String object this will wrap. */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object. * @param val String object this will wrap. 
private	TokenNameprivate	
XStringForChars	TokenNameIdentifier	 X String For Chars
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
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING	TokenNameIdentifier	 ER  XSTRINGFORCHARS  CANNOT  TAKE  STRING
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"XStringForChars can not take a string for an argument!"); 	TokenNameCOMMENT_LINE	"XStringForChars can not take a string for an argument!"); 
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The string this wraps or the empty string if null */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The string this wraps or the empty string if null 
public	TokenNamepublic	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS	TokenNameIdentifier	 ER  FSB  NOT  SUPPORTED  XSTRINGFORCHARS
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"fsb() not supported for XStringForChars!"); 	TokenNameCOMMENT_LINE	"fsb() not supported for XStringForChars!"); 
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The string this wraps or the empty string if null */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The string this wraps or the empty string if null 
public	TokenNamepublic	
void	TokenNamevoid	
appendToFsb	TokenNameIdentifier	 append To Fsb
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
,	TokenNameCOMMA	
m_start	TokenNameIdentifier	 m start
,	TokenNameCOMMA	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
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
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_strCache	TokenNameIdentifier	 m str Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The string this wraps or the empty string if null */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The string this wraps or the empty string if null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_strCache	TokenNameIdentifier	 m str Cache
)	TokenNameRPAREN	
m_strCache	TokenNameIdentifier	 m str Cache
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
,	TokenNameCOMMA	
m_start	TokenNameIdentifier	 m start
,	TokenNameCOMMA	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_strCache	TokenNameIdentifier	 m str Cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Since this object is incomplete without the length and the offset, we * have to convert to a string when this function is called. * * @return The java String representation of this object. */	TokenNameCOMMENT_JAVADOC	 Since this object is incomplete without the length and the offset, we have to convert to a string when this function is called. * @return The java String representation of this object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
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
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
,	TokenNameCOMMA	
m_start	TokenNameIdentifier	 m start
,	TokenNameCOMMA	
m_length	TokenNameIdentifier	 m length
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
lh	TokenNameIdentifier	 lh
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
,	TokenNameCOMMA	
m_start	TokenNameIdentifier	 m start
,	TokenNameCOMMA	
m_length	TokenNameIdentifier	 m length
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
m_length	TokenNameIdentifier	 m length
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
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
m_start	TokenNameIdentifier	 m start
]	TokenNameRBRACKET	
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
,	TokenNameCOMMA	
m_start	TokenNameIdentifier	 m start
+	TokenNamePLUS	
srcBegin	TokenNameIdentifier	 src Begin
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
dstBegin	TokenNameIdentifier	 dst Begin
,	TokenNameCOMMA	
srcEnd	TokenNameIdentifier	 src End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
