/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
;	TokenNameSEMICOLON	
/** * XMLString is a structure used to pass character arrays. However, * XMLStringBuffer is a buffer in which characters can be appended * and extends XMLString so that it can be passed to methods * expecting an XMLString object. This is a safe operation because * it is assumed that any callee will <strong>not</strong> modify * the contents of the XMLString structure. * <p> * The contents of the string are managed by the string buffer. As * characters are appended, the string buffer will grow as needed. * <p> * <strong>Note:</strong> Never set the <code>ch</code>, * <code>offset</code>, and <code>length</code> fields directly. * These fields are managed by the string buffer. In order to reset * the buffer, call <code>clear()</code>. * * @author Andy Clark, IBM * @author Eric Ye, IBM * * @version $Id: XMLStringBuffer.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 XMLString is a structure used to pass character arrays. However, XMLStringBuffer is a buffer in which characters can be appended and extends XMLString so that it can be passed to methods expecting an XMLString object. This is a safe operation because it is assumed that any callee will <strong>not</strong> modify the contents of the XMLString structure. <p> The contents of the string are managed by the string buffer. As characters are appended, the string buffer will grow as needed. <p> <strong>Note:</strong> Never set the <code>ch</code>, <code>offset</code>, and <code>length</code> fields directly. These fields are managed by the string buffer. In order to reset the buffer, call <code>clear()</code>. * @author Andy Clark, IBM @author Eric Ye, IBM * @version $Id: XMLStringBuffer.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
extends	TokenNameextends	
XMLString	TokenNameIdentifier	 XML String
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default buffer size (32). */	TokenNameCOMMENT_JAVADOC	 Default buffer size (32). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * * * @param size */	TokenNameCOMMENT_JAVADOC	 * @param size 
public	TokenNamepublic	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(int) 	TokenNameCOMMENT_LINE	<init>(int) 
/** Constructs a string buffer from a char. */	TokenNameCOMMENT_JAVADOC	 Constructs a string buffer from a char. 
public	TokenNamepublic	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(char) 	TokenNameCOMMENT_LINE	<init>(char) 
/** Constructs a string buffer from a String. */	TokenNameCOMMENT_JAVADOC	 Constructs a string buffer from a String. 
public	TokenNamepublic	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String) 	TokenNameCOMMENT_LINE	<init>(String) 
/** Constructs a string buffer from the specified character array. */	TokenNameCOMMENT_JAVADOC	 Constructs a string buffer from the specified character array. 
public	TokenNamepublic	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(char[],int,int) 	TokenNameCOMMENT_LINE	<init>(char[],int,int) 
/** Constructs a string buffer from the specified XMLString. */	TokenNameCOMMENT_JAVADOC	 Constructs a string buffer from the specified XMLString. 
public	TokenNamepublic	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(XMLString) 	TokenNameCOMMENT_LINE	<init>(XMLString) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Clears the string buffer. */	TokenNameCOMMENT_JAVADOC	 Clears the string buffer. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * append * * @param c */	TokenNameCOMMENT_JAVADOC	 append * @param c 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newLength	TokenNameIdentifier	 new Length
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newLength	TokenNameIdentifier	 new Length
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
)	TokenNameRPAREN	
newLength	TokenNameIdentifier	 new Length
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newch	TokenNameIdentifier	 newch
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
newLength	TokenNameIdentifier	 new Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newch	TokenNameIdentifier	 newch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
newch	TokenNameIdentifier	 newch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// append(char) 	TokenNameCOMMENT_LINE	append(char) 
/** * append * * @param s */	TokenNameCOMMENT_JAVADOC	 append * @param s 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newLength	TokenNameIdentifier	 new Length
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newLength	TokenNameIdentifier	 new Length
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
)	TokenNameRPAREN	
newLength	TokenNameIdentifier	 new Length
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newch	TokenNameIdentifier	 newch
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
newLength	TokenNameIdentifier	 new Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newch	TokenNameIdentifier	 newch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
newch	TokenNameIdentifier	 newch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// append(String) 	TokenNameCOMMENT_LINE	append(String) 
/** * append * * @param ch * @param offset * @param length */	TokenNameCOMMENT_JAVADOC	 append * @param ch @param offset @param length 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newch	TokenNameIdentifier	 newch
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newch	TokenNameIdentifier	 newch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
newch	TokenNameIdentifier	 newch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// append(char[],int,int) 	TokenNameCOMMENT_LINE	append(char[],int,int) 
/** * append * * @param s */	TokenNameCOMMENT_JAVADOC	 append * @param s 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// append(XMLString) 	TokenNameCOMMENT_LINE	append(XMLString) 
}	TokenNameRBRACE	
// class XMLStringBuffer 	TokenNameCOMMENT_LINE	class XMLStringBuffer 
