/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * THIS IS A COPY OF THE XERCES-2J CLASS org.apache.xerces.utls.XMLChar * * This class defines the basic properties of characters in XML 1.1. The data * in this class can be used to verify that a character is a valid * XML 1.1 character or if the character is a space, name start, or name * character. * <p> * A series of convenience methods are supplied to ease the burden * of the developer. Using the character as an index into the <code>XML11CHARS</code> * array and applying the appropriate mask flag (e.g. * <code>MASK_VALID</code>), yields the same results as calling the * convenience methods. There is one exception: check the comments * for the <code>isValid</code> method for details. * * @version $Id: XML11Char.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_JAVADOC	 THIS IS A COPY OF THE XERCES-2J CLASS org.apache.xerces.utls.XMLChar * This class defines the basic properties of characters in XML 1.1. The data in this class can be used to verify that a character is a valid XML 1.1 character or if the character is a space, name start, or name character. <p> A series of convenience methods are supplied to ease the burden of the developer. Using the character as an index into the <code>XML11CHARS</code> array and applying the appropriate mask flag (e.g. <code>MASK_VALID</code>), yields the same results as calling the convenience methods. There is one exception: check the comments for the <code>isValid</code> method for details. * @version $Id: XML11Char.java 468655 2006-10-28 07:12:06Z minchau $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11Char	TokenNameIdentifier	 XM L11 Char
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Character flags for XML 1.1. */	TokenNameCOMMENT_JAVADOC	 Character flags for XML 1.1. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** XML 1.1 Valid character mask. */	TokenNameCOMMENT_JAVADOC	 XML 1.1 Valid character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_XML11_VALID	TokenNameIdentifier	 MASK  XM L11  VALID
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** XML 1.1 Space character mask. */	TokenNameCOMMENT_JAVADOC	 XML 1.1 Space character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_XML11_SPACE	TokenNameIdentifier	 MASK  XM L11  SPACE
=	TokenNameEQUAL	
0x02	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** XML 1.1 Name start character mask. */	TokenNameCOMMENT_JAVADOC	 XML 1.1 Name start character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_XML11_NAME_START	TokenNameIdentifier	 MASK  XM L11  NAME  START
=	TokenNameEQUAL	
0x04	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** XML 1.1 Name character mask. */	TokenNameCOMMENT_JAVADOC	 XML 1.1 Name character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_XML11_NAME	TokenNameIdentifier	 MASK  XM L11  NAME
=	TokenNameEQUAL	
0x08	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** XML 1.1 control character mask */	TokenNameCOMMENT_JAVADOC	 XML 1.1 control character mask 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_XML11_CONTROL	TokenNameIdentifier	 MASK  XM L11  CONTROL
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** XML 1.1 content for external entities (valid - "special" chars - control chars) */	TokenNameCOMMENT_JAVADOC	 XML 1.1 content for external entities (valid - "special" chars - control chars) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_XML11_CONTENT	TokenNameIdentifier	 MASK  XM L11  CONTENT
=	TokenNameEQUAL	
0x20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** XML namespaces 1.1 NCNameStart */	TokenNameCOMMENT_JAVADOC	 XML namespaces 1.1 NCNameStart 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_XML11_NCNAME_START	TokenNameIdentifier	 MASK  XM L11  NCNAME  START
=	TokenNameEQUAL	
0x40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** XML namespaces 1.1 NCName */	TokenNameCOMMENT_JAVADOC	 XML namespaces 1.1 NCName 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_XML11_NCNAME	TokenNameIdentifier	 MASK  XM L11  NCNAME
=	TokenNameEQUAL	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** XML 1.1 content for internal entities (valid - "special" chars) */	TokenNameCOMMENT_JAVADOC	 XML 1.1 content for internal entities (valid - "special" chars) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_XML11_CONTENT_INTERNAL	TokenNameIdentifier	 MASK  XM L11  CONTENT  INTERNAL
=	TokenNameEQUAL	
MASK_XML11_CONTROL	TokenNameIdentifier	 MASK  XM L11  CONTROL
|	TokenNameOR	
MASK_XML11_CONTENT	TokenNameIdentifier	 MASK  XM L11  CONTENT
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Static initialization 	TokenNameCOMMENT_LINE	Static initialization 
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
{	TokenNameLBRACE	
// Initializing the Character Flag Array 	TokenNameCOMMENT_LINE	Initializing the Character Flag Array 
// Code generated by: XML11CharGenerator. 	TokenNameCOMMENT_LINE	Code generated by: XML11CharGenerator. 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 8 of value (byte) 17 	TokenNameCOMMENT_LINE	Fill 8 of value (byte) 17 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
9	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 2 of value (byte) 17 	TokenNameCOMMENT_LINE	Fill 2 of value (byte) 17 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
13	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 18 of value (byte) 17 	TokenNameCOMMENT_LINE	Fill 18 of value (byte) 17 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 5 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 5 of value (byte) 33 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
38	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 6 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 6 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
87	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 2 of value (byte) -87 	TokenNameCOMMENT_LINE	Fill 2 of value (byte) -87 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
47	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
58	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
87	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 10 of value (byte) -87 	TokenNameCOMMENT_LINE	Fill 10 of value (byte) -87 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
58	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
45	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
59	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
60	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 4 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 4 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
91	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 26 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 26 of value (byte) -19 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
91	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
93	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 2 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 2 of value (byte) 33 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
93	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
94	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
95	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
96	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
97	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
123	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 26 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 26 of value (byte) -19 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
123	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
127	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 4 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 4 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
127	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
133	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 6 of value (byte) 17 	TokenNameCOMMENT_LINE	Fill 6 of value (byte) 17 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
133	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
134	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
160	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 26 of value (byte) 17 	TokenNameCOMMENT_LINE	Fill 26 of value (byte) 17 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
160	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
183	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 23 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 23 of value (byte) 33 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
183	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
87	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
184	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
192	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 8 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 8 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
192	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
215	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 23 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 23 of value (byte) -19 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
215	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
216	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
247	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 31 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 31 of value (byte) -19 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
247	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
248	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
768	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 520 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 520 of value (byte) -19 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
768	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
880	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
87	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 112 of value (byte) -87 	TokenNameCOMMENT_LINE	Fill 112 of value (byte) -87 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
880	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
894	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 14 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 14 of value (byte) -19 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
894	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
895	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8192	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 7297 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 7297 of value (byte) -19 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
8192	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8204	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 12 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 12 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
8204	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8206	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 2 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 2 of value (byte) -19 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
8206	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 26 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 26 of value (byte) 33 
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
8232	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
8233	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 22 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 22 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
8255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8257	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
87	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 2 of value (byte) -87 	TokenNameCOMMENT_LINE	Fill 2 of value (byte) -87 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
8257	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8304	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 47 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 47 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
8304	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8592	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 288 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 288 of value (byte) -19 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
8592	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11264	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 2672 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 2672 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
11264	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12272	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 1008 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 1008 of value (byte) -19 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
12272	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12289	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 17 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 17 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
12289	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
55296	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 43007 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 43007 of value (byte) -19 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
57344	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63744	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 6400 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 6400 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
63744	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
64976	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 1232 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 1232 of value (byte) -19 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
64976	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
65008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 32 of value (byte) 33 	TokenNameCOMMENT_LINE	Fill 32 of value (byte) 33 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
,	TokenNameCOMMA	
65008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
65534	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill 526 of value (byte) -19 	TokenNameCOMMENT_LINE	Fill 526 of value (byte) -19 
}	TokenNameRBRACE	
// <clinit>() 	TokenNameCOMMENT_LINE	<clinit>() 
// 	TokenNameCOMMENT_LINE	 
// Public static methods 	TokenNameCOMMENT_LINE	Public static methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns true if the specified character is a space character * as amdended in the XML 1.1 specification. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a space character as amdended in the XML 1.1 specification. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11Space	TokenNameIdentifier	 is XM L11 Space
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_XML11_SPACE	TokenNameIdentifier	 MASK  XM L11  SPACE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11Space(int):boolean 	TokenNameCOMMENT_LINE	isXML11Space(int):boolean 
/** * Returns true if the specified character is valid. This method * also checks the surrogate character range from 0x10000 to 0x10FFFF. * <p> * If the program chooses to apply the mask directly to the * <code>XML11CHARS</code> array, then they are responsible for checking * the surrogate character range. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is valid. This method also checks the surrogate character range from 0x10000 to 0x10FFFF. <p> If the program chooses to apply the mask directly to the <code>XML11CHARS</code> array, then they are responsible for checking the surrogate character range. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_XML11_VALID	TokenNameIdentifier	 MASK  XM L11  VALID
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
0x10000	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0x10FFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11Valid(int):boolean 	TokenNameCOMMENT_LINE	isXML11Valid(int):boolean 
/** * Returns true if the specified character is invalid. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is invalid. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11Invalid	TokenNameIdentifier	 is XM L11 Invalid
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11Invalid(int):boolean 	TokenNameCOMMENT_LINE	isXML11Invalid(int):boolean 
/** * Returns true if the specified character is valid and permitted outside * of a character reference. * That is, this method will return false for the same set as * isXML11Valid, except it also reports false for "control characters". * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is valid and permitted outside of a character reference. That is, this method will return false for the same set as isXML11Valid, except it also reports false for "control characters". * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11ValidLiteral	TokenNameIdentifier	 is XM L11 Valid Literal
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_XML11_VALID	TokenNameIdentifier	 MASK  XM L11  VALID
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_XML11_CONTROL	TokenNameIdentifier	 MASK  XM L11  CONTROL
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
0x10000	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0x10FFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11ValidLiteral(int):boolean 	TokenNameCOMMENT_LINE	isXML11ValidLiteral(int):boolean 
/** * Returns true if the specified character can be considered * content in an external parsed entity. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character can be considered content in an external parsed entity. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11Content	TokenNameIdentifier	 is XM L11 Content
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_XML11_CONTENT	TokenNameIdentifier	 MASK  XM L11  CONTENT
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
0x10000	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0x10FFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11Content(int):boolean 	TokenNameCOMMENT_LINE	isXML11Content(int):boolean 
/** * Returns true if the specified character can be considered * content in an internal parsed entity. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character can be considered content in an internal parsed entity. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11InternalEntityContent	TokenNameIdentifier	 is XM L11 Internal Entity Content
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_XML11_CONTENT_INTERNAL	TokenNameIdentifier	 MASK  XM L11  CONTENT  INTERNAL
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
0x10000	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0x10FFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11InternalEntityContent(int):boolean 	TokenNameCOMMENT_LINE	isXML11InternalEntityContent(int):boolean 
/** * Returns true if the specified character is a valid name start * character as defined by production [4] in the XML 1.1 * specification. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a valid name start character as defined by production [4] in the XML 1.1 specification. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11NameStart	TokenNameIdentifier	 is XM L11 Name Start
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_XML11_NAME_START	TokenNameIdentifier	 MASK  XM L11  NAME  START
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
0x10000	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0xF0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11NameStart(int):boolean 	TokenNameCOMMENT_LINE	isXML11NameStart(int):boolean 
/** * Returns true if the specified character is a valid name * character as defined by production [4a] in the XML 1.1 * specification. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a valid name character as defined by production [4a] in the XML 1.1 specification. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_XML11_NAME	TokenNameIdentifier	 MASK  XM L11  NAME
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0xF0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11Name(int):boolean 	TokenNameCOMMENT_LINE	isXML11Name(int):boolean 
/** * Returns true if the specified character is a valid NCName start * character as defined by production [4] in Namespaces in XML * 1.1 recommendation. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a valid NCName start character as defined by production [4] in Namespaces in XML 1.1 recommendation. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11NCNameStart	TokenNameIdentifier	 is XM L11 NC Name Start
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_XML11_NCNAME_START	TokenNameIdentifier	 MASK  XM L11  NCNAME  START
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
0x10000	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0xF0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11NCNameStart(int):boolean 	TokenNameCOMMENT_LINE	isXML11NCNameStart(int):boolean 
/** * Returns true if the specified character is a valid NCName * character as defined by production [5] in Namespaces in XML * 1.1 recommendation. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a valid NCName character as defined by production [5] in Namespaces in XML 1.1 recommendation. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11NCName	TokenNameIdentifier	 is XM L11 NC Name
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
XML11CHARS	TokenNameIdentifier	 XM L11 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_XML11_NCNAME	TokenNameIdentifier	 MASK  XM L11  NCNAME
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
0x10000	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0xF0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11NCName(int):boolean 	TokenNameCOMMENT_LINE	isXML11NCName(int):boolean 
/** * Returns whether the given character is a valid * high surrogate for a name character. This includes * all high surrogates for characters [0x10000-0xEFFFF]. * In other words everything excluding planes 15 and 16. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given character is a valid high surrogate for a name character. This includes all high surrogates for characters [0x10000-0xEFFFF]. In other words everything excluding planes 15 and 16. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
0xD800	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0xDB7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * [5] Name ::= NameStartChar NameChar* */	TokenNameCOMMENT_BLOCK	 [5] Name ::= NameStartChar NameChar* 
/** * Check to see if a string is a valid Name according to [5] * in the XML 1.1 Recommendation * * @param name string to check * @return true if name is a valid Name */	TokenNameCOMMENT_JAVADOC	 Check to see if a string is a valid Name according to [5] in the XML 1.1 Recommendation * @param name string to check @return true if name is a valid Name 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11ValidName	TokenNameIdentifier	 is XM L11 Valid Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isXML11NameStart	TokenNameIdentifier	 is XM L11 Name Start
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isXML11NameStart	TokenNameIdentifier	 is XM L11 Name Start
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11ValidName(String):boolean 	TokenNameCOMMENT_LINE	isXML11ValidName(String):boolean 
/* * from the namespace 1.1 rec * [4] NCName ::= NCNameStartChar NCNameChar* */	TokenNameCOMMENT_BLOCK	 from the namespace 1.1 rec [4] NCName ::= NCNameStartChar NCNameChar* 
/** * Check to see if a string is a valid NCName according to [4] * from the XML Namespaces 1.1 Recommendation * * @param ncName string to check * @return true if name is a valid NCName */	TokenNameCOMMENT_JAVADOC	 Check to see if a string is a valid NCName according to [4] from the XML Namespaces 1.1 Recommendation * @param ncName string to check @return true if name is a valid NCName 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ncName	TokenNameIdentifier	 nc Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
ncName	TokenNameIdentifier	 nc Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
ncName	TokenNameIdentifier	 nc Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isXML11NCNameStart	TokenNameIdentifier	 is XM L11 NC Name Start
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
ncName	TokenNameIdentifier	 nc Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isXML11NCNameStart	TokenNameIdentifier	 is XM L11 NC Name Start
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
ncName	TokenNameIdentifier	 nc Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isXML11NCName	TokenNameIdentifier	 is XM L11 NC Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
ncName	TokenNameIdentifier	 nc Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isXML11NCName	TokenNameIdentifier	 is XM L11 NC Name
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11ValidNCName(String):boolean 	TokenNameCOMMENT_LINE	isXML11ValidNCName(String):boolean 
/* * [7] Nmtoken ::= (NameChar)+ */	TokenNameCOMMENT_BLOCK	 [7] Nmtoken ::= (NameChar)+ 
/** * Check to see if a string is a valid Nmtoken according to [7] * in the XML 1.1 Recommendation * * @param nmtoken string to check * @return true if nmtoken is a valid Nmtoken */	TokenNameCOMMENT_JAVADOC	 Check to see if a string is a valid Nmtoken according to [7] in the XML 1.1 Recommendation * @param nmtoken string to check @return true if nmtoken is a valid Nmtoken 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11ValidNmtoken	TokenNameIdentifier	 is XM L11 Valid Nmtoken
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nmtoken	TokenNameIdentifier	 nmtoken
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
nmtoken	TokenNameIdentifier	 nmtoken
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
nmtoken	TokenNameIdentifier	 nmtoken
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
nmtoken	TokenNameIdentifier	 nmtoken
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isXML11ValidName(String):boolean 	TokenNameCOMMENT_LINE	isXML11ValidName(String):boolean 
/** * Simple check to determine if qname is legal. If it returns false * then <param>str</param> is illegal; if it returns true then * <param>str</param> is legal. */	TokenNameCOMMENT_JAVADOC	 Simple check to determine if qname is legal. If it returns false then <param>str</param> is illegal; if it returns true then <param>str</param> is legal. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXML11ValidQName	TokenNameIdentifier	 is XM L11 Valid Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
colon	TokenNameIdentifier	 colon
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
colon	TokenNameIdentifier	 colon
==	TokenNameEQUAL_EQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colon	TokenNameIdentifier	 colon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XML11Char 	TokenNameCOMMENT_LINE	class XML11Char 
