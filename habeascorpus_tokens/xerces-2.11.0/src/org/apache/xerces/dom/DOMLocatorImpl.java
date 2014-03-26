/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMLocator	TokenNameIdentifier	 DOM Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * <code>DOMLocatorImpl</code> is an implementaion that describes a location (e.g. * where an error occured). * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010913'>Document Object Model (DOM) Level 3 Core Specification</a>. * * @xerces.internal * * @author Gopal Sharma, SUN Microsystems Inc. * @version $Id: DOMLocatorImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <code>DOMLocatorImpl</code> is an implementaion that describes a location (e.g. where an error occured). <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010913'>Document Object Model (DOM) Level 3 Core Specification</a>. * @xerces.internal * @author Gopal Sharma, SUN Microsystems Inc. @version $Id: DOMLocatorImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
implements	TokenNameimplements	
DOMLocator	TokenNameIdentifier	 DOM Locator
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** * The column number where the error occured, * or -1 if there is no column number available. */	TokenNameCOMMENT_JAVADOC	 The column number where the error occured, or -1 if there is no column number available. 
public	TokenNamepublic	
int	TokenNameint	
fColumnNumber	TokenNameIdentifier	 f Column Number
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The line number where the error occured, * or -1 if there is no line number available. */	TokenNameCOMMENT_JAVADOC	 The line number where the error occured, or -1 if there is no line number available. 
public	TokenNamepublic	
int	TokenNameint	
fLineNumber	TokenNameIdentifier	 f Line Number
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** related data node*/	TokenNameCOMMENT_JAVADOC	 related data node
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
fRelatedNode	TokenNameIdentifier	 f Related Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The URI where the error occured, * or null if there is no URI available. */	TokenNameCOMMENT_JAVADOC	 The URI where the error occured, or null if there is no URI available. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fUri	TokenNameIdentifier	 f Uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The byte offset into the input source this locator is pointing to or -1 * if there is no byte offset available */	TokenNameCOMMENT_JAVADOC	 The byte offset into the input source this locator is pointing to or -1 if there is no byte offset available 
public	TokenNamepublic	
int	TokenNameint	
fByteOffset	TokenNameIdentifier	 f Byte Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The UTF-16, as defined in [Unicode] and Amendment 1 of [ISO/IEC 10646], * offset into the input source this locator is pointing to or -1 if there * is no UTF-16 offset available. */	TokenNameCOMMENT_JAVADOC	 The UTF-16, as defined in [Unicode] and Amendment 1 of [ISO/IEC 10646], offset into the input source this locator is pointing to or -1 if there is no UTF-16 offset available. 
public	TokenNamepublic	
int	TokenNameint	
fUtf16Offset	TokenNameIdentifier	 f Utf16 Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
(	TokenNameLPAREN	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
,	TokenNameCOMMA	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLineNumber	TokenNameIdentifier	 f Line Number
=	TokenNameEQUAL	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
fColumnNumber	TokenNameIdentifier	 f Column Number
=	TokenNameEQUAL	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
fUri	TokenNameIdentifier	 f Uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOMLocatorImpl (int lineNumber, int columnNumber, String uri ) 	TokenNameCOMMENT_LINE	DOMLocatorImpl (int lineNumber, int columnNumber, String uri ) 
public	TokenNamepublic	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
(	TokenNameLPAREN	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
,	TokenNameCOMMA	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
,	TokenNameCOMMA	
int	TokenNameint	
utf16Offset	TokenNameIdentifier	 utf16 Offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLineNumber	TokenNameIdentifier	 f Line Number
=	TokenNameEQUAL	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
fColumnNumber	TokenNameIdentifier	 f Column Number
=	TokenNameEQUAL	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
fUri	TokenNameIdentifier	 f Uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
fUtf16Offset	TokenNameIdentifier	 f Utf16 Offset
=	TokenNameEQUAL	
utf16Offset	TokenNameIdentifier	 utf16 Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOMLocatorImpl (int lineNumber, int columnNumber, int utf16Offset, String uri ) 	TokenNameCOMMENT_LINE	DOMLocatorImpl (int lineNumber, int columnNumber, int utf16Offset, String uri ) 
public	TokenNamepublic	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
(	TokenNameLPAREN	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
,	TokenNameCOMMA	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
,	TokenNameCOMMA	
int	TokenNameint	
byteoffset	TokenNameIdentifier	 byteoffset
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
relatedData	TokenNameIdentifier	 related Data
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLineNumber	TokenNameIdentifier	 f Line Number
=	TokenNameEQUAL	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
fColumnNumber	TokenNameIdentifier	 f Column Number
=	TokenNameEQUAL	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
fByteOffset	TokenNameIdentifier	 f Byte Offset
=	TokenNameEQUAL	
byteoffset	TokenNameIdentifier	 byteoffset
;	TokenNameSEMICOLON	
fRelatedNode	TokenNameIdentifier	 f Related Node
=	TokenNameEQUAL	
relatedData	TokenNameIdentifier	 related Data
;	TokenNameSEMICOLON	
fUri	TokenNameIdentifier	 f Uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOMLocatorImpl (int lineNumber, int columnNumber, int offset, Node errorNode, String uri ) 	TokenNameCOMMENT_LINE	DOMLocatorImpl (int lineNumber, int columnNumber, int offset, Node errorNode, String uri ) 
public	TokenNamepublic	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
(	TokenNameLPAREN	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
,	TokenNameCOMMA	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
,	TokenNameCOMMA	
int	TokenNameint	
byteoffset	TokenNameIdentifier	 byteoffset
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
relatedData	TokenNameIdentifier	 related Data
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
int	TokenNameint	
utf16Offset	TokenNameIdentifier	 utf16 Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLineNumber	TokenNameIdentifier	 f Line Number
=	TokenNameEQUAL	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
fColumnNumber	TokenNameIdentifier	 f Column Number
=	TokenNameEQUAL	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
fByteOffset	TokenNameIdentifier	 f Byte Offset
=	TokenNameEQUAL	
byteoffset	TokenNameIdentifier	 byteoffset
;	TokenNameSEMICOLON	
fRelatedNode	TokenNameIdentifier	 f Related Node
=	TokenNameEQUAL	
relatedData	TokenNameIdentifier	 related Data
;	TokenNameSEMICOLON	
fUri	TokenNameIdentifier	 f Uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
fUtf16Offset	TokenNameIdentifier	 f Utf16 Offset
=	TokenNameEQUAL	
utf16Offset	TokenNameIdentifier	 utf16 Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOMLocatorImpl (int lineNumber, int columnNumber, int offset, Node errorNode, String uri ) 	TokenNameCOMMENT_LINE	DOMLocatorImpl (int lineNumber, int columnNumber, int offset, Node errorNode, String uri ) 
/** * The line number where the error occured, or -1 if there is no line * number available. */	TokenNameCOMMENT_JAVADOC	 The line number where the error occured, or -1 if there is no line number available. 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLineNumber	TokenNameIdentifier	 f Line Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The column number where the error occured, or -1 if there is no column * number available. */	TokenNameCOMMENT_JAVADOC	 The column number where the error occured, or -1 if there is no column number available. 
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fColumnNumber	TokenNameIdentifier	 f Column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The URI where the error occured, or null if there is no URI available. */	TokenNameCOMMENT_JAVADOC	 The URI where the error occured, or null if there is no URI available. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUri	TokenNameIdentifier	 get Uri
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fUri	TokenNameIdentifier	 f Uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getRelatedNode	TokenNameIdentifier	 get Related Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fRelatedNode	TokenNameIdentifier	 f Related Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The byte offset into the input source this locator is pointing to or -1 * if there is no byte offset available */	TokenNameCOMMENT_JAVADOC	 The byte offset into the input source this locator is pointing to or -1 if there is no byte offset available 
public	TokenNamepublic	
int	TokenNameint	
getByteOffset	TokenNameIdentifier	 get Byte Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fByteOffset	TokenNameIdentifier	 f Byte Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The UTF-16, as defined in [Unicode] and Amendment 1 of [ISO/IEC 10646], * offset into the input source this locator is pointing to or -1 if there * is no UTF-16 offset available. */	TokenNameCOMMENT_JAVADOC	 The UTF-16, as defined in [Unicode] and Amendment 1 of [ISO/IEC 10646], offset into the input source this locator is pointing to or -1 if there is no UTF-16 offset available. 
public	TokenNamepublic	
int	TokenNameint	
getUtf16Offset	TokenNameIdentifier	 get Utf16 Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fUtf16Offset	TokenNameIdentifier	 f Utf16 Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DOMLocatorImpl 	TokenNameCOMMENT_LINE	class DOMLocatorImpl 