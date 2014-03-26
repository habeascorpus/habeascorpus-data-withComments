/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id$ */	TokenNameCOMMENT_BLOCK	 $Id$ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * This class defines the basic XML character properties. The data * in this class can be used to verify that a character is a valid * XML character or if the character is a space, name start, or name * character. * <p> * A series of convenience methods are supplied to ease the burden * of the developer. Because inlining the checks can improve per * character performance, the tables of character properties are * public. Using the character as an index into the <code>CHARS</code> * array and applying the appropriate mask flag (e.g. * <code>MASK_VALID</code>), yields the same results as calling the * convenience methods. There is one exception: check the comments * for the <code>isValid</code> method for details. * * @author Glenn Marcy, IBM * @author Andy Clark, IBM * @author Eric Ye, IBM * @author Arnaud Le Hors, IBM * @author Rahul Srivastava, Sun Microsystems Inc. * * @version $Id: XMLChar.java,v 1.7 2002/01/29 01:15:18 lehors Exp $ */	TokenNameCOMMENT_JAVADOC	 This class defines the basic XML character properties. The data in this class can be used to verify that a character is a valid XML character or if the character is a space, name start, or name character. <p> A series of convenience methods are supplied to ease the burden of the developer. Because inlining the checks can improve per character performance, the tables of character properties are public. Using the character as an index into the <code>CHARS</code> array and applying the appropriate mask flag (e.g. <code>MASK_VALID</code>), yields the same results as calling the convenience methods. There is one exception: check the comments for the <code>isValid</code> method for details. * @author Glenn Marcy, IBM @author Andy Clark, IBM @author Eric Ye, IBM @author Arnaud Le Hors, IBM @author Rahul Srivastava, Sun Microsystems Inc. * @version $Id: XMLChar.java,v 1.7 2002/01/29 01:15:18 lehors Exp $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLChar	TokenNameIdentifier	 XML Char
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Character flags. */	TokenNameCOMMENT_JAVADOC	 Character flags. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
CHARS	TokenNameIdentifier	 CHARS
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Valid character mask. */	TokenNameCOMMENT_JAVADOC	 Valid character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_VALID	TokenNameIdentifier	 MASK  VALID
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Space character mask. */	TokenNameCOMMENT_JAVADOC	 Space character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_SPACE	TokenNameIdentifier	 MASK  SPACE
=	TokenNameEQUAL	
0x02	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Name start character mask. */	TokenNameCOMMENT_JAVADOC	 Name start character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_NAME_START	TokenNameIdentifier	 MASK  NAME  START
=	TokenNameEQUAL	
0x04	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Name character mask. */	TokenNameCOMMENT_JAVADOC	 Name character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
=	TokenNameEQUAL	
0x08	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Pubid character mask. */	TokenNameCOMMENT_JAVADOC	 Pubid character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_PUBID	TokenNameIdentifier	 MASK  PUBID
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Content character mask. Special characters are those that can * be considered the start of markup, such as '&lt;' and '&amp;'. * The various newline characters are considered special as well. * All other valid XML characters can be considered content. * <p> * This is an optimization for the inner loop of character scanning. */	TokenNameCOMMENT_JAVADOC	 Content character mask. Special characters are those that can be considered the start of markup, such as '&lt;' and '&amp;'. The various newline characters are considered special as well. All other valid XML characters can be considered content. <p> This is an optimization for the inner loop of character scanning. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_CONTENT	TokenNameIdentifier	 MASK  CONTENT
=	TokenNameEQUAL	
0x20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** NCName start character mask. */	TokenNameCOMMENT_JAVADOC	 NCName start character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_NCNAME_START	TokenNameIdentifier	 MASK  NCNAME  START
=	TokenNameEQUAL	
0x40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** NCName character mask. */	TokenNameCOMMENT_JAVADOC	 NCName character mask. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
=	TokenNameEQUAL	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Static initialization 	TokenNameCOMMENT_LINE	Static initialization 
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// [2] Char ::= #x9 | #xA | #xD | [#x20-#xD7FF] | 	TokenNameCOMMENT_LINE	[2] Char ::= #x9 | #xA | #xD | [#x20-#xD7FF] | 
// [#xE000-#xFFFD] | [#x10000-#x10FFFF] 	TokenNameCOMMENT_LINE	[#xE000-#xFFFD] | [#x10000-#x10FFFF] 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
charRange	TokenNameIdentifier	 char Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x0009	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xD7FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xE000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [3] S ::= (#x20 | #x9 | #xD | #xA)+ 	TokenNameCOMMENT_LINE	[3] S ::= (#x20 | #x9 | #xD | #xA)+ 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
spaceChar	TokenNameIdentifier	 space Char
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0009	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [4] NameChar ::= Letter | Digit | '.' | '-' | '_' | ':' | 	TokenNameCOMMENT_LINE	[4] NameChar ::= Letter | Digit | '.' | '-' | '_' | ':' | 
// CombiningChar | Extender 	TokenNameCOMMENT_LINE	CombiningChar | Extender 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
nameChar	TokenNameIdentifier	 name Char
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x002D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '-' and '.' 	TokenNameCOMMENT_LINE	'-' and '.' 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [5] Name ::= (Letter | '_' | ':') (NameChar)* 	TokenNameCOMMENT_LINE	[5] Name ::= (Letter | '_' | ':') (NameChar)* 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
nameStartChar	TokenNameIdentifier	 name Start Char
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x003A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// ':' and '_' 	TokenNameCOMMENT_LINE	':' and '_' 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [13] PubidChar ::= #x20 | 0xD | 0xA | [a-zA-Z0-9] | [-'()+,./:=?;!*#@$_%] 	TokenNameCOMMENT_LINE	[13] PubidChar ::= #x20 | 0xD | 0xA | [a-zA-Z0-9] | [-'()+,./:=?;!*#@$_%] 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
pubidChar	TokenNameIdentifier	 pubid Char
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x000A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0021	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0023	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0024	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0025	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x003D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005F	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
pubidRange	TokenNameIdentifier	 pubid Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x0027	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x003B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x003F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007A	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [84] Letter ::= BaseChar | Ideographic 	TokenNameCOMMENT_LINE	[84] Letter ::= BaseChar | Ideographic 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
letterRange	TokenNameIdentifier	 letter Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// BaseChar 	TokenNameCOMMENT_LINE	BaseChar 
0x0041	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00C0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00D6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00D8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0131	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0134	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x013E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0141	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0148	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x014A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x017E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0180	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01C3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01CD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01F4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01F5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01FA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0217	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0250	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02A8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02BB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02C1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0388	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x038A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x038E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03A1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03A3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03CE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03D6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03E2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03F3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0401	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x040C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x040E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x044F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0451	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x045C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x045E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0481	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04C4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04C7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04C8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04CB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04CC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04EB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04EE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04F5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04F8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04F9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0531	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0561	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0586	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05EA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05F2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0621	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x063A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0641	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x064A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0671	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06B7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06BA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06BE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06C0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06CE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06D3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0905	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0939	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0958	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0961	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0985	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x098C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x098F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0990	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0993	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09A8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09AA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09B0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09B6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09B9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09DD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09DF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09E1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09F1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A0A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A2A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A5C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A74	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A8B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A8F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A91	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A93	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AA8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AAA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AB0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AB2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AB3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AB5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AB9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B0C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B2A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B5C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B5D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B5F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B8A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B8E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B90	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B92	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B95	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B99	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B9A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B9E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B9F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BA3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BA4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BA8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BAA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BAE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BB5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BB7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BB9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C0C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C0E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C2A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C8C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C8E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C90	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C92	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CA8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CAA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CB3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CB5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CB9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CE0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CE1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D0C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D0E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D2A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E2E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E88	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E94	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E97	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E99	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E9F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EA1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EA3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EAA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EAB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EAD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EAE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EC0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EC4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10A0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10C5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10F6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1102	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1103	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1105	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x110B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x110C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x110E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1112	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1154	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1155	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x115F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1161	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x116D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x116E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1172	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1173	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11AE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11AF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11B7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11B8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11BC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11C2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1E00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1E9B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1EA0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1EF9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F1D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F5F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F7D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FB4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FB6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FBC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FC2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FC4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FC6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FCC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FD0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FD3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FD6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FDB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FE0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FEC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FF2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FF4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FF6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FFC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x212A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x212B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2180	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2182	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3041	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3094	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3105	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x312C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xAC00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xD7A3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// Ideographic 	TokenNameCOMMENT_LINE	Ideographic 
0x3021	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3029	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4E00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x9FA5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
letterChar	TokenNameIdentifier	 letter Char
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// BaseChar 	TokenNameCOMMENT_LINE	BaseChar 
0x0386	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x038C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03DA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03DE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03E0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0559	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06D5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x093D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09B2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A5E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A8D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ABD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AE0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B9C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CDE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E8A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E8D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EA5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EA7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EBD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1109	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x113C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x113E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1140	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x114C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x114E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1150	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1159	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1163	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1165	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1167	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1169	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1175	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x119E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11A8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11AB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11BA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11EB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11F9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F5B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F5D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FBE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2126	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x212E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// Ideographic 	TokenNameCOMMENT_LINE	Ideographic 
0x3007	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [87] CombiningChar ::= ... 	TokenNameCOMMENT_LINE	[87] CombiningChar ::= ... 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
combiningCharRange	TokenNameIdentifier	 combining Char Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x0300	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0345	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0360	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0361	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0483	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0486	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0591	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05A1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05A3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05B9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05BB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05BD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x064B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0652	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06D6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06DD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06DF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06EA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06ED	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0901	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0903	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x093E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x094C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0951	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0954	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0962	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0963	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0981	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0983	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09C0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09C4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09C7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09C8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09CB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09CD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09E2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09E3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A4B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ABE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AC5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AC7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AC9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ACB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ACD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B4B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BBE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BC2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BC6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BC8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BCA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BCD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C4A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CBE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CC4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CC6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CC8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CCA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CCD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CD5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CD6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D02	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D4A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E3A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E4E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EBB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EBC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EC8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ECD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F8B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F90	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F95	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F99	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FAD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FB1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FB7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x302A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x302F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
combiningCharChar	TokenNameIdentifier	 combining Char Char
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x05BF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0670	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x093C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x094D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09BC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09BE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09BF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09D7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A02	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ABC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BD7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F97	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FB9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20E1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3099	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x309A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [88] Digit ::= ... 	TokenNameCOMMENT_LINE	[88] Digit ::= ... 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
digitRange	TokenNameIdentifier	 digit Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x0030	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0039	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0660	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0669	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06F9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0966	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x096F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09EF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A6F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AE6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AEF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B6F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BE7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BEF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C6F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CE6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CEF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D6F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ED0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ED9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [89] Extender ::= ... 	TokenNameCOMMENT_LINE	[89] Extender ::= ... 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
extenderRange	TokenNameIdentifier	 extender Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x3031	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3035	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x309D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x309E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
extenderChar	TokenNameIdentifier	 extender Char
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x00B7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02D1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0387	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0640	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EC6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3005	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// SpecialChar ::= '<', '&', '\n', '\r', ']' 	TokenNameCOMMENT_LINE	SpecialChar ::= '<', '&', '\n', '\r', ']' 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
specialChar	TokenNameIdentifier	 special Char
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'<'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'&'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\r'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
']'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Initialize 	TokenNameCOMMENT_LINE	Initialize 
// 	TokenNameCOMMENT_LINE	 
// set valid characters 	TokenNameCOMMENT_LINE	set valid characters 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
charRange	TokenNameIdentifier	 char Range
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
charRange	TokenNameIdentifier	 char Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
charRange	TokenNameIdentifier	 char Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_VALID	TokenNameIdentifier	 MASK  VALID
|	TokenNameOR	
MASK_CONTENT	TokenNameIdentifier	 MASK  CONTENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// remove special characters 	TokenNameCOMMENT_LINE	remove special characters 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
specialChar	TokenNameIdentifier	 special Char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
specialChar	TokenNameIdentifier	 special Char
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
specialChar	TokenNameIdentifier	 special Char
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
MASK_CONTENT	TokenNameIdentifier	 MASK  CONTENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set space characters 	TokenNameCOMMENT_LINE	set space characters 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
spaceChar	TokenNameIdentifier	 space Char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
spaceChar	TokenNameIdentifier	 space Char
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_SPACE	TokenNameIdentifier	 MASK  SPACE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set name start characters 	TokenNameCOMMENT_LINE	set name start characters 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nameStartChar	TokenNameIdentifier	 name Start Char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
nameStartChar	TokenNameIdentifier	 name Start Char
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_NAME_START	TokenNameIdentifier	 MASK  NAME  START
|	TokenNameOR	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
|	TokenNameOR	
MASK_NCNAME_START	TokenNameIdentifier	 MASK  NCNAME  START
|	TokenNameOR	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
letterRange	TokenNameIdentifier	 letter Range
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
letterRange	TokenNameIdentifier	 letter Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
letterRange	TokenNameIdentifier	 letter Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_NAME_START	TokenNameIdentifier	 MASK  NAME  START
|	TokenNameOR	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
|	TokenNameOR	
MASK_NCNAME_START	TokenNameIdentifier	 MASK  NCNAME  START
|	TokenNameOR	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
letterChar	TokenNameIdentifier	 letter Char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
letterChar	TokenNameIdentifier	 letter Char
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_NAME_START	TokenNameIdentifier	 MASK  NAME  START
|	TokenNameOR	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
|	TokenNameOR	
MASK_NCNAME_START	TokenNameIdentifier	 MASK  NCNAME  START
|	TokenNameOR	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set name characters 	TokenNameCOMMENT_LINE	set name characters 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nameChar	TokenNameIdentifier	 name Char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
nameChar	TokenNameIdentifier	 name Char
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
|	TokenNameOR	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
digitRange	TokenNameIdentifier	 digit Range
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
digitRange	TokenNameIdentifier	 digit Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
digitRange	TokenNameIdentifier	 digit Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
|	TokenNameOR	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
combiningCharRange	TokenNameIdentifier	 combining Char Range
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
combiningCharRange	TokenNameIdentifier	 combining Char Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
combiningCharRange	TokenNameIdentifier	 combining Char Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
|	TokenNameOR	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
combiningCharChar	TokenNameIdentifier	 combining Char Char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
combiningCharChar	TokenNameIdentifier	 combining Char Char
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
|	TokenNameOR	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
extenderRange	TokenNameIdentifier	 extender Range
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
extenderRange	TokenNameIdentifier	 extender Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
extenderRange	TokenNameIdentifier	 extender Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
|	TokenNameOR	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
extenderChar	TokenNameIdentifier	 extender Char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
extenderChar	TokenNameIdentifier	 extender Char
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
|	TokenNameOR	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// remove ':' from allowable MASK_NCNAME_START and MASK_NCNAME chars 	TokenNameCOMMENT_LINE	remove ':' from allowable MASK_NCNAME_START and MASK_NCNAME chars 
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
':'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
(	TokenNameLPAREN	
MASK_NCNAME_START	TokenNameIdentifier	 MASK  NCNAME  START
|	TokenNameOR	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set Pubid characters 	TokenNameCOMMENT_LINE	set Pubid characters 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
pubidChar	TokenNameIdentifier	 pubid Char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
pubidChar	TokenNameIdentifier	 pubid Char
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_PUBID	TokenNameIdentifier	 MASK  PUBID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
pubidRange	TokenNameIdentifier	 pubid Range
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
pubidRange	TokenNameIdentifier	 pubid Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
pubidRange	TokenNameIdentifier	 pubid Range
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MASK_PUBID	TokenNameIdentifier	 MASK  PUBID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// <clinit>() 	TokenNameCOMMENT_LINE	<clinit>() 
// 	TokenNameCOMMENT_LINE	 
// Public static methods 	TokenNameCOMMENT_LINE	Public static methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns true if the specified character is a supplemental character. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a supplemental character. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSupplemental	TokenNameIdentifier	 is Supplemental
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0x10FFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true the supplemental character corresponding to the given * surrogates. * * @param h The high surrogate. * @param l The low surrogate. */	TokenNameCOMMENT_JAVADOC	 Returns true the supplemental character corresponding to the given surrogates. * @param h The high surrogate. @param l The low surrogate. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
char	TokenNamechar	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
char	TokenNamechar	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
0xD800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0x400	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
-	TokenNameMINUS	
0xDC00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the high surrogate of a supplemental character * * @param c The supplemental character to "split". */	TokenNameCOMMENT_JAVADOC	 Returns the high surrogate of a supplemental character * @param c The supplemental character to "split". 
public	TokenNamepublic	
static	TokenNamestatic	
char	TokenNamechar	
highSurrogate	TokenNameIdentifier	 high Surrogate
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
0x00010000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0xD800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the low surrogate of a supplemental character * * @param c The supplemental character to "split". */	TokenNameCOMMENT_JAVADOC	 Returns the low surrogate of a supplemental character * @param c The supplemental character to "split". 
public	TokenNamepublic	
static	TokenNamestatic	
char	TokenNamechar	
lowSurrogate	TokenNameIdentifier	 low Surrogate
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
0x00010000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0xDC00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the given character is a high surrogate * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given character is a high surrogate * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
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
0xDBFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the given character is a low surrogate * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given character is a low surrogate * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
0xDC00	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0xDFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the specified character is valid. This method * also checks the surrogate character range from 0x10000 to 0x10FFFF. * <p> * If the program chooses to apply the mask directly to the * <code>CHARS</code> array, then they are responsible for checking * the surrogate character range. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is valid. This method also checks the surrogate character range from 0x10000 to 0x10FFFF. <p> If the program chooses to apply the mask directly to the <code>CHARS</code> array, then they are responsible for checking the surrogate character range. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
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
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_VALID	TokenNameIdentifier	 MASK  VALID
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
// isValid(int):boolean 	TokenNameCOMMENT_LINE	isValid(int):boolean 
/** * Returns true if the specified character is invalid. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is invalid. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isInvalid	TokenNameIdentifier	 is Invalid
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isInvalid(int):boolean 	TokenNameCOMMENT_LINE	isInvalid(int):boolean 
/** * Returns true if the specified character can be considered content. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character can be considered content. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isContent	TokenNameIdentifier	 is Content
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
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_CONTENT	TokenNameIdentifier	 MASK  CONTENT
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
// isContent(int):boolean 	TokenNameCOMMENT_LINE	isContent(int):boolean 
/** * Returns true if the specified character can be considered markup. * Markup characters include '&lt;', '&amp;', and '%'. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character can be considered markup. Markup characters include '&lt;', '&amp;', and '%'. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isMarkup	TokenNameIdentifier	 is Markup
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isMarkup(int):boolean 	TokenNameCOMMENT_LINE	isMarkup(int):boolean 
/** * Returns true if the specified character is a space character * as defined by production [3] in the XML 1.0 specification. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a space character as defined by production [3] in the XML 1.0 specification. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_SPACE	TokenNameIdentifier	 MASK  SPACE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isSpace(int):boolean 	TokenNameCOMMENT_LINE	isSpace(int):boolean 
/** * Returns true if the specified character is a valid name start * character as defined by production [5] in the XML 1.0 * specification. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a valid name start character as defined by production [5] in the XML 1.0 specification. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isNameStart	TokenNameIdentifier	 is Name Start
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_NAME_START	TokenNameIdentifier	 MASK  NAME  START
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isNameStart(int):boolean 	TokenNameCOMMENT_LINE	isNameStart(int):boolean 
/** * Returns true if the specified character is a valid name * character as defined by production [4] in the XML 1.0 * specification. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a valid name character as defined by production [4] in the XML 1.0 specification. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_NAME	TokenNameIdentifier	 MASK  NAME
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isName(int):boolean 	TokenNameCOMMENT_LINE	isName(int):boolean 
/** * Returns true if the specified character is a valid NCName start * character as defined by production [4] in Namespaces in XML * recommendation. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a valid NCName start character as defined by production [4] in Namespaces in XML recommendation. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isNCNameStart	TokenNameIdentifier	 is NC Name Start
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_NCNAME_START	TokenNameIdentifier	 MASK  NCNAME  START
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isNCNameStart(int):boolean 	TokenNameCOMMENT_LINE	isNCNameStart(int):boolean 
/** * Returns true if the specified character is a valid NCName * character as defined by production [5] in Namespaces in XML * recommendation. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a valid NCName character as defined by production [5] in Namespaces in XML recommendation. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isNCName	TokenNameIdentifier	 is NC Name
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_NCNAME	TokenNameIdentifier	 MASK  NCNAME
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isNCName(int):boolean 	TokenNameCOMMENT_LINE	isNCName(int):boolean 
/** * Returns true if the specified character is a valid Pubid * character as defined by production [13] in the XML 1.0 * specification. * * @param c The character to check. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified character is a valid Pubid character as defined by production [13] in the XML 1.0 specification. * @param c The character to check. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isPubid	TokenNameIdentifier	 is Pubid
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
CHARS	TokenNameIdentifier	 CHARS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_PUBID	TokenNameIdentifier	 MASK  PUBID
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isPubid(int):boolean 	TokenNameCOMMENT_LINE	isPubid(int):boolean 
/* * [5] Name ::= (Letter | '_' | ':') (NameChar)* */	TokenNameCOMMENT_BLOCK	 [5] Name ::= (Letter | '_' | ':') (NameChar)* 
/** * Check to see if a string is a valid Name according to [5] * in the XML 1.0 Recommendation * * @param name string to check * @return true if name is a valid Name */	TokenNameCOMMENT_JAVADOC	 Check to see if a string is a valid Name according to [5] in the XML 1.0 Recommendation * @param name string to check @return true if name is a valid Name 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isValidName	TokenNameIdentifier	 is Valid Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
isNameStart	TokenNameIdentifier	 is Name Start
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
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
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidName(String):boolean 	TokenNameCOMMENT_LINE	isValidName(String):boolean 
/* * from the namespace rec * [4] NCName ::= (Letter | '_') (NCNameChar)* */	TokenNameCOMMENT_BLOCK	 from the namespace rec [4] NCName ::= (Letter | '_') (NCNameChar)* 
/** * Check to see if a string is a valid NCName according to [4] * from the XML Namespaces 1.0 Recommendation * * @param ncName string to check * @return true if name is a valid NCName */	TokenNameCOMMENT_JAVADOC	 Check to see if a string is a valid NCName according to [4] from the XML Namespaces 1.0 Recommendation * @param ncName string to check @return true if name is a valid NCName 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isValidNCName	TokenNameIdentifier	 is Valid NC Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ncName	TokenNameIdentifier	 nc Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncName	TokenNameIdentifier	 nc Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
isNCNameStart	TokenNameIdentifier	 is NC Name Start
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ncName	TokenNameIdentifier	 nc Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
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
isNCName	TokenNameIdentifier	 is NC Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidNCName(String):boolean 	TokenNameCOMMENT_LINE	isValidNCName(String):boolean 
/* * [7] Nmtoken ::= (NameChar)+ */	TokenNameCOMMENT_BLOCK	 [7] Nmtoken ::= (NameChar)+ 
/** * Check to see if a string is a valid Nmtoken according to [7] * in the XML 1.0 Recommendation * * @param nmtoken string to check * @return true if nmtoken is a valid Nmtoken */	TokenNameCOMMENT_JAVADOC	 Check to see if a string is a valid Nmtoken according to [7] in the XML 1.0 Recommendation * @param nmtoken string to check @return true if nmtoken is a valid Nmtoken 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isValidNmtoken	TokenNameIdentifier	 is Valid Nmtoken
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nmtoken	TokenNameIdentifier	 nmtoken
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nmtoken	TokenNameIdentifier	 nmtoken
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
nmtoken	TokenNameIdentifier	 nmtoken
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
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidName(String):boolean 	TokenNameCOMMENT_LINE	isValidName(String):boolean 
// encodings 	TokenNameCOMMENT_LINE	encodings 
/** * Returns true if the encoding name is a valid IANA encoding. * This method does not verify that there is a decoder available * for this encoding, only that the characters are valid for an * IANA encoding name. * * @param ianaEncoding The IANA encoding name. */	TokenNameCOMMENT_JAVADOC	 Returns true if the encoding name is a valid IANA encoding. This method does not verify that there is a decoder available for this encoding, only that the characters are valid for an IANA encoding name. * @param ianaEncoding The IANA encoding name. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isValidIANAEncoding	TokenNameIdentifier	 is Valid IANA Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ianaEncoding	TokenNameIdentifier	 iana Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ianaEncoding	TokenNameIdentifier	 iana Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
ianaEncoding	TokenNameIdentifier	 iana Encoding
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ianaEncoding	TokenNameIdentifier	 iana Encoding
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ianaEncoding	TokenNameIdentifier	 iana Encoding
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
'A'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
'a'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
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
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'.'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'_'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidIANAEncoding(String):boolean 	TokenNameCOMMENT_LINE	isValidIANAEncoding(String):boolean 
/** * Returns true if the encoding name is a valid Java encoding. * This method does not verify that there is a decoder available * for this encoding, only that the characters are valid for an * Java encoding name. * * @param javaEncoding The Java encoding name. */	TokenNameCOMMENT_JAVADOC	 Returns true if the encoding name is a valid Java encoding. This method does not verify that there is a decoder available for this encoding, only that the characters are valid for an Java encoding name. * @param javaEncoding The Java encoding name. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isValidJavaEncoding	TokenNameIdentifier	 is Valid Java Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
javaEncoding	TokenNameIdentifier	 java Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
javaEncoding	TokenNameIdentifier	 java Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
javaEncoding	TokenNameIdentifier	 java Encoding
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
javaEncoding	TokenNameIdentifier	 java Encoding
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
'A'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
'a'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
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
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'.'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'_'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidIANAEncoding(String):boolean 	TokenNameCOMMENT_LINE	isValidIANAEncoding(String):boolean 
/** * Simple check to determine if qname is legal. If it returns false * then <param>str</param> is illegal; if it returns true then * <param>str</param> is legal. */	TokenNameCOMMENT_JAVADOC	 Simple check to determine if qname is legal. If it returns false then <param>str</param> is illegal; if it returns true then <param>str</param> is legal. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isValidQName	TokenNameIdentifier	 is Valid Q Name
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
isValidNCName	TokenNameIdentifier	 is Valid NC Name
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isValidNCName	TokenNameIdentifier	 is Valid NC Name
(	TokenNameLPAREN	
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
isValidNCName	TokenNameIdentifier	 is Valid NC Name
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XMLChar 	TokenNameCOMMENT_LINE	class XMLChar 
