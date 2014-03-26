/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XStringForFSB.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XStringForFSB.java 468655 2006-10-28 07:12:06Z minchau $ 
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
/** * This class will wrap a FastStringBuffer and allow for */	TokenNameCOMMENT_JAVADOC	 This class will wrap a FastStringBuffer and allow for 
public	TokenNamepublic	
class	TokenNameclass	
XStringForFSB	TokenNameIdentifier	 X String For FSB
extends	TokenNameextends	
XString	TokenNameIdentifier	 X String
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1533039186550674548L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The start position in the fsb. */	TokenNameCOMMENT_JAVADOC	 The start position in the fsb. 
int	TokenNameint	
m_start	TokenNameIdentifier	 m start
;	TokenNameSEMICOLON	
/** The length of the string. */	TokenNameCOMMENT_JAVADOC	 The length of the string. 
int	TokenNameint	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
/** If the str() function is called, the string will be cached here. */	TokenNameCOMMENT_JAVADOC	 If the str() function is called, the string will be cached here. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_strCache	TokenNameIdentifier	 m str Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** cached hash code */	TokenNameCOMMENT_JAVADOC	 cached hash code 
protected	TokenNameprotected	
int	TokenNameint	
m_hash	TokenNameIdentifier	 m hash
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Construct a XNodeSet object. * * @param val FastStringBuffer object this will wrap, must be non-null. * @param start The start position in the array. * @param length The number of characters to read from the array. */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object. * @param val FastStringBuffer object this will wrap, must be non-null. @param start The start position in the array. @param length The number of characters to read from the array. 
public	TokenNamepublic	
XStringForFSB	TokenNameIdentifier	 X String For FSB
(	TokenNameLPAREN	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
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
}	TokenNameRBRACE	
/** * Construct a XNodeSet object. * * @param val String object this will wrap. */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object. * @param val String object this will wrap. 
private	TokenNameprivate	
XStringForFSB	TokenNameIdentifier	 X String For FSB
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
ER_FSB_CANNOT_TAKE_STRING	TokenNameIdentifier	 ER  FSB  CANNOT  TAKE  STRING
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "XStringForFSB can not take a string for an argument!"); 	TokenNameCOMMENT_LINE	"XStringForFSB can not take a string for an argument!"); 
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The string this wraps or the empty string if null */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The string this wraps or the empty string if null 
public	TokenNamepublic	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// %OPT% !!! FSB has to be updated to take partial fsb's for append. 	TokenNameCOMMENT_LINE	%OPT% !!! FSB has to be updated to take partial fsb's for append. 
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// /** NEEDSDOC Field strCount */ 	TokenNameCOMMENT_LINE	/** NEEDSDOC Field strCount */ 
// public static int strCount = 0; 	TokenNameCOMMENT_LINE	public static int strCount = 0; 
// 	TokenNameCOMMENT_LINE	 
// /** NEEDSDOC Field xtable */ 	TokenNameCOMMENT_LINE	/** NEEDSDOC Field xtable */ 
// static java.util.Hashtable xtable = new java.util.Hashtable(); 	TokenNameCOMMENT_LINE	static java.util.Hashtable xtable = new java.util.Hashtable(); 
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
{	TokenNameLBRACE	
m_strCache	TokenNameIdentifier	 m str Cache
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
m_start	TokenNameIdentifier	 m start
,	TokenNameCOMMA	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// strCount++; 	TokenNameCOMMENT_LINE	strCount++; 
// 	TokenNameCOMMENT_LINE	 
// RuntimeException e = new RuntimeException("Bad! Bad!"); 	TokenNameCOMMENT_LINE	RuntimeException e = new RuntimeException("Bad! Bad!"); 
// java.io.CharArrayWriter writer = new java.io.CharArrayWriter(); 	TokenNameCOMMENT_LINE	java.io.CharArrayWriter writer = new java.io.CharArrayWriter(); 
// java.io.PrintWriter pw = new java.io.PrintWriter(writer); 	TokenNameCOMMENT_LINE	java.io.PrintWriter pw = new java.io.PrintWriter(writer); 
// 	TokenNameCOMMENT_LINE	 
// e.printStackTrace(pw); 	TokenNameCOMMENT_LINE	e.printStackTrace(pw); 
// 	TokenNameCOMMENT_LINE	 
// String str = writer.toString(); 	TokenNameCOMMENT_LINE	String str = writer.toString(); 
// 	TokenNameCOMMENT_LINE	 
// str = str.substring(0, 600); 	TokenNameCOMMENT_LINE	str = str.substring(0, 600); 
// 	TokenNameCOMMENT_LINE	 
// if (null == xtable.get(str)) 	TokenNameCOMMENT_LINE	if (null == xtable.get(str)) 
// { 	TokenNameCOMMENT_LINE	{ 
// xtable.put(str, str); 	TokenNameCOMMENT_LINE	xtable.put(str, str); 
// System.out.println(str); 	TokenNameCOMMENT_LINE	System.out.println(str); 
// } 	TokenNameCOMMENT_LINE	} 
// System.out.println("strCount: " + strCount); 	TokenNameCOMMENT_LINE	System.out.println("strCount: " + strCount); 
// throw e; 	TokenNameCOMMENT_LINE	throw e; 
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
// System.exit(-1); 	TokenNameCOMMENT_LINE	System.exit(-1); 
}	TokenNameRBRACE	
return	TokenNamereturn	
m_strCache	TokenNameIdentifier	 m str Cache
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
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
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
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sendSAXComment	TokenNameIdentifier	 send SAX Comment
(	TokenNameLPAREN	
lh	TokenNameIdentifier	 lh
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
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
m_start	TokenNameIdentifier	 m start
+	TokenNamePLUS	
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
// %OPT% Need to call this on FSB when it is implemented. 	TokenNameCOMMENT_LINE	%OPT% Need to call this on FSB when it is implemented. 
// %UNTESTED% (I don't think anyone calls this yet?) 	TokenNameCOMMENT_LINE	%UNTESTED% (I don't think anyone calls this yet?) 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
srcEnd	TokenNameIdentifier	 src End
-	TokenNameMINUS	
srcBegin	TokenNameIdentifier	 src Begin
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
(	TokenNameLPAREN	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
dstBegin	TokenNameIdentifier	 dst Begin
)	TokenNameRPAREN	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
dstBegin	TokenNameIdentifier	 dst Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
srcBegin	TokenNameIdentifier	 src Begin
+	TokenNamePLUS	
m_start	TokenNameIdentifier	 m start
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
dstBegin	TokenNameIdentifier	 dst Begin
;	TokenNameSEMICOLON	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
srcBegin	TokenNameIdentifier	 src Begin
+	TokenNamePLUS	
m_start	TokenNameIdentifier	 m start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dst	TokenNameIdentifier	 dst
[	TokenNameLBRACKET	
d	TokenNameIdentifier	 d
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Compares this string to the specified object. * The result is <code>true</code> if and only if the argument is not * <code>null</code> and is a <code>String</code> object that represents * the same sequence of characters as this object. * * @param obj2 the object to compare this <code>String</code> * against. * * @return <code>true</code> if the <code>String </code>are equal; * <code>false</code> otherwise. * @see java.lang.String#compareTo(java.lang.String) * @see java.lang.String#equalsIgnoreCase(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Compares this string to the specified object. The result is <code>true</code> if and only if the argument is not <code>null</code> and is a <code>String</code> object that represents the same sequence of characters as this object. * @param obj2 the object to compare this <code>String</code> against. * @return <code>true</code> if the <code>String </code>are equal; <code>false</code> otherwise. @see java.lang.String#compareTo(java.lang.String) @see java.lang.String#equalsIgnoreCase(java.lang.String) 
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
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
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
if	TokenNameif	
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
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
if	TokenNameif	
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if two objects are functionally equal. * * @param anotherString Object to compare this to * * @return true if the two objects are equal * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if two objects are functionally equal. * @param anotherString Object to compare this to * @return true if the two objects are equal * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
anotherString	TokenNameIdentifier	 another String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
anotherString	TokenNameIdentifier	 another String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
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
if	TokenNameif	
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
anotherString	TokenNameIdentifier	 another String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares this string to the specified object. * The result is <code>true</code> if and only if the argument is not * <code>null</code> and is a <code>String</code> object that represents * the same sequence of characters as this object. * * @param obj2 the object to compare this <code>String</code> * against. * * @return <code>true</code> if the <code>String </code>are equal; * <code>false</code> otherwise. * @see java.lang.String#compareTo(java.lang.String) * @see java.lang.String#equalsIgnoreCase(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Compares this string to the specified object. The result is <code>true</code> if and only if the argument is not <code>null</code> and is a <code>String</code> object that represents the same sequence of characters as this object. * @param obj2 the object to compare this <code>String</code> against. * @return <code>true</code> if the <code>String </code>are equal; <code>false</code> otherwise. @see java.lang.String#compareTo(java.lang.String) @see java.lang.String#equalsIgnoreCase(java.lang.String) 
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
XStringForFSB	TokenNameIdentifier	 X String For FSB
)	TokenNameRPAREN	
return	TokenNamereturn	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
)	TokenNameRPAREN	
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
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
(	TokenNameLPAREN	
m_length	TokenNameIdentifier	 m length
==	TokenNameEQUAL_EQUAL	
anotherString	TokenNameIdentifier	 another String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
anotherString	TokenNameIdentifier	 another String
)	TokenNameRPAREN	
:	TokenNameCOLON	
false	TokenNamefalse	
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
m_length	TokenNameIdentifier	 m length
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
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
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
fsb	TokenNameIdentifier	 fsb
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
/** * Compares two strings lexicographically, ignoring case considerations. * This method returns an integer whose sign is that of * <code>this.toUpperCase().toLowerCase().compareTo( * str.toUpperCase().toLowerCase())</code>. * <p> * Note that this method does <em>not</em> take locale into account, * and will result in an unsatisfactory ordering for certain locales. * The java.text package provides <em>collators</em> to allow * locale-sensitive ordering. * * @param xstr the <code>String</code> to be compared. * * @return a negative integer, zero, or a positive integer as the * the specified String is greater than, equal to, or less * than this String, ignoring case considerations. * @see java.text.Collator#compare(String, String) * @since 1.2 */	TokenNameCOMMENT_JAVADOC	 Compares two strings lexicographically, ignoring case considerations. This method returns an integer whose sign is that of <code>this.toUpperCase().toLowerCase().compareTo( str.toUpperCase().toLowerCase())</code>. <p> Note that this method does <em>not</em> take locale into account, and will result in an unsatisfactory ordering for certain locales. The java.text package provides <em>collators</em> to allow locale-sensitive ordering. * @param xstr the <code>String</code> to be compared. * @return a negative integer, zero, or a positive integer as the the specified String is greater than, equal to, or less than this String, ignoring case considerations. @see java.text.Collator#compare(String, String) @since 1.2 
public	TokenNamepublic	
int	TokenNameint	
compareToIgnoreCase	TokenNameIdentifier	 compare To Ignore Case
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
xstr	TokenNameIdentifier	 xstr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len1	TokenNameIdentifier	 len1
=	TokenNameEQUAL	
m_length	TokenNameIdentifier	 m length
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
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
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
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
xstr	TokenNameIdentifier	 xstr
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
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
/** * Returns a hashcode for this string. The hashcode for a * <code>String</code> object is computed as * <blockquote><pre> * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1] * </pre></blockquote> * using <code>int</code> arithmetic, where <code>s[i]</code> is the * <i>i</i>th character of the string, <code>n</code> is the length of * the string, and <code>^</code> indicates exponentiation. * (The hash value of the empty string is zero.) * * @return a hash code value for this object. */	TokenNameCOMMENT_JAVADOC	 Returns a hashcode for this string. The hashcode for a <code>String</code> object is computed as <blockquote><pre> s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1] </pre></blockquote> using <code>int</code> arithmetic, where <code>s[i]</code> is the <i>i</i>th character of the string, <code>n</code> is the length of the string, and <code>^</code> indicates exponentiation. (The hash value of the empty string is zero.) * @return a hash code value for this object. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Commenting this out because in JDK1.1.8 and VJ++ 	TokenNameCOMMENT_LINE	Commenting this out because in JDK1.1.8 and VJ++ 
// we don't match XMLStrings. Defaulting to the super 	TokenNameCOMMENT_LINE	we don't match XMLStrings. Defaulting to the super 
// causes us to create a string, but at this point 	TokenNameCOMMENT_LINE	causes us to create a string, but at this point 
// this only seems to get called in key processing. 	TokenNameCOMMENT_LINE	this only seems to get called in key processing. 
// Maybe we can live with it? 	TokenNameCOMMENT_LINE	Maybe we can live with it? 
/* int h = m_hash; if (h == 0) { int off = m_start; int len = m_length; FastStringBuffer fsb = fsb(); for (int i = 0; i < len; i++) { h = 31 * h + fsb.charAt(off); off++; } m_hash = h; } */	TokenNameCOMMENT_BLOCK	 int h = m_hash; if (h == 0) { int off = m_start; int len = m_length; FastStringBuffer fsb = fsb(); for (int i = 0; i < len; i++) { h = 31 h + fsb.charAt(off); off++; } m_hash = h; } 
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// h; 	TokenNameCOMMENT_LINE	h; 
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
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
+	TokenNamePLUS	
toffset	TokenNameIdentifier	 toffset
;	TokenNameSEMICOLON	
int	TokenNameint	
tlim	TokenNameIdentifier	 tlim
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
+	TokenNamePLUS	
m_length	TokenNameIdentifier	 m length
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
m_length	TokenNameIdentifier	 m length
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
fsb	TokenNameIdentifier	 fsb
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
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
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
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
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
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
+	TokenNamePLUS	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fromIndex	TokenNameIdentifier	 from Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
>=	TokenNameGREATER_EQUAL	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note: fromIndex might be near -1>>>1. 	TokenNameCOMMENT_LINE	Note: fromIndex might be near -1>>>1. 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
+	TokenNamePLUS	
fromIndex	TokenNameIdentifier	 from Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
m_start	TokenNameIdentifier	 m start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
m_length	TokenNameIdentifier	 m length
-	TokenNameMINUS	
beginIndex	TokenNameIdentifier	 begin Index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
XString	TokenNameIdentifier	 X String
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
+	TokenNamePLUS	
beginIndex	TokenNameIdentifier	 begin Index
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XStringForFSB	TokenNameIdentifier	 X String For FSB
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
beginIndex	TokenNameIdentifier	 begin Index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
XString	TokenNameIdentifier	 X String
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
+	TokenNamePLUS	
beginIndex	TokenNameIdentifier	 begin Index
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XStringForFSB	TokenNameIdentifier	 X String For FSB
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// %OPT% Make an FSB here? 	TokenNameCOMMENT_LINE	%OPT% Make an FSB here? 
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
/** * Removes white space from both ends of this string. * * @return this string, with white space removed from the front and end. */	TokenNameCOMMENT_JAVADOC	 Removes white space from both ends of this string. * @return this string, with white space removed from the front and end. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fixWhiteSpace	TokenNameIdentifier	 fix White Space
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
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
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
m_length	TokenNameIdentifier	 m length
+	TokenNamePLUS	
m_start	TokenNameIdentifier	 m start
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
m_length	TokenNameIdentifier	 m length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
edit	TokenNameIdentifier	 edit
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/* replace S to ' '. and ' '+ -> single ' '. */	TokenNameCOMMENT_BLOCK	 replace S to ' '. and ' '+ -> single ' '. 
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
pres	TokenNameIdentifier	 pres
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
m_start	TokenNameIdentifier	 m start
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
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
d	TokenNameIdentifier	 d
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
d	TokenNameIdentifier	 d
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
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
:	TokenNameCOLON	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a string to a double -- Allowed input is in fixed * notation ddd.fff. * * %OPT% CHECK PERFORMANCE against generating a Java String and * converting it to double. The advantage of running in native * machine code -- perhaps even microcode, on some systems -- may * more than make up for the cost of allocating and discarding the * additional object. We need to benchmark this. * * %OPT% More importantly, we need to decide whether we _care_ about * the performance of this operation. Does XString.toDouble constitute * any measurable percentage of our typical runtime? I suspect not! * * @return A double value representation of the string, or return Double.NaN * if the string can not be converted. */	TokenNameCOMMENT_JAVADOC	 Convert a string to a double -- Allowed input is in fixed notation ddd.fff. * %OPT% CHECK PERFORMANCE against generating a Java String and converting it to double. The advantage of running in native machine code -- perhaps even microcode, on some systems -- may more than make up for the cost of allocating and discarding the additional object. We need to benchmark this. * %OPT% More importantly, we need to decide whether we _care_ about the performance of this operation. Does XString.toDouble constitute any measurable percentage of our typical runtime? I suspect not! * @return A double value representation of the string, or return Double.NaN if the string can not be converted. 
public	TokenNamepublic	
double	TokenNamedouble	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_length	TokenNameIdentifier	 m length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
valueString	TokenNameIdentifier	 value String
=	TokenNameEQUAL	
fsb	TokenNameIdentifier	 fsb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
m_start	TokenNameIdentifier	 m start
,	TokenNameCOMMA	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The following are permitted in the Double.valueOf, but not by the XPath spec: 	TokenNameCOMMENT_LINE	The following are permitted in the Double.valueOf, but not by the XPath spec: 
// - a plus sign 	TokenNameCOMMENT_LINE	- a plus sign 
// - The use of e or E to indicate exponents 	TokenNameCOMMENT_LINE	- The use of e or E to indicate exponents 
// - trailing f, F, d, or D 	TokenNameCOMMENT_LINE	- trailing f, F, d, or D 
// See function comments; not sure if this is slower than actually doing the 	TokenNameCOMMENT_LINE	See function comments; not sure if this is slower than actually doing the 
// conversion ourselves (as was before). 	TokenNameCOMMENT_LINE	conversion ourselves (as was before). 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
valueString	TokenNameIdentifier	 value String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
valueString	TokenNameIdentifier	 value String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
valueString	TokenNameIdentifier	 value String
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
'.'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
'0'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
valueString	TokenNameIdentifier	 value String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
valueString	TokenNameIdentifier	 value String
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
// This should catch double periods, empty strings. 	TokenNameCOMMENT_LINE	This should catch double periods, empty strings. 
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
