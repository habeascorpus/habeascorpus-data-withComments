/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ToHTMLStream.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ToHTMLStream.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
MsgKey	TokenNameIdentifier	 Msg Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Utils	TokenNameIdentifier	 Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This serializer takes a series of SAX or * SAX-like events and writes its output * to the given stream. * * This class is not a public API, it is public * because it is used from another package. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This serializer takes a series of SAX or SAX-like events and writes its output to the given stream. * This class is not a public API, it is public because it is used from another package. * @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ToHTMLStream	TokenNameIdentifier	 To HTML Stream
extends	TokenNameextends	
ToStream	TokenNameIdentifier	 To Stream
{	TokenNameLBRACE	
/** This flag is set while receiving events from the DTD */	TokenNameCOMMENT_JAVADOC	 This flag is set while receiving events from the DTD 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_inDTD	TokenNameIdentifier	 m in DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** True if the current element is a block element. (seems like * this needs to be a stack. -sb). */	TokenNameCOMMENT_JAVADOC	 True if the current element is a block element. (seems like this needs to be a stack. -sb). 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_inBlockElem	TokenNameIdentifier	 m in Block Elem
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Map that tells which XML characters should have special treatment, and it * provides character to entity name lookup. */	TokenNameCOMMENT_JAVADOC	 Map that tells which XML characters should have special treatment, and it provides character to entity name lookup. 
private	TokenNameprivate	
final	TokenNamefinal	
CharInfo	TokenNameIdentifier	 Char Info
m_htmlcharInfo	TokenNameIdentifier	 m htmlchar Info
=	TokenNameEQUAL	
// new CharInfo(CharInfo.HTML_ENTITIES_RESOURCE); 	TokenNameCOMMENT_LINE	new CharInfo(CharInfo.HTML_ENTITIES_RESOURCE); 
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
getCharInfo	TokenNameIdentifier	 get Char Info
(	TokenNameLPAREN	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
HTML_ENTITIES_RESOURCE	TokenNameIdentifier	 HTML  ENTITIES  RESOURCE
,	TokenNameCOMMA	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A digital search trie for fast, case insensitive lookup of ElemDesc objects. */	TokenNameCOMMENT_JAVADOC	 A digital search trie for fast, case insensitive lookup of ElemDesc objects. 
static	TokenNamestatic	
final	TokenNamefinal	
Trie	TokenNameIdentifier	 Trie
m_elementFlags	TokenNameIdentifier	 m element Flags
=	TokenNameEQUAL	
new	TokenNamenew	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
initTagReference	TokenNameIdentifier	 init Tag Reference
(	TokenNameLPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
initTagReference	TokenNameIdentifier	 init Tag Reference
(	TokenNameLPAREN	
Trie	TokenNameIdentifier	 Trie
m_elementFlags	TokenNameIdentifier	 m element Flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// HTML 4.0 loose DTD 	TokenNameCOMMENT_LINE	HTML 4.0 loose DTD 
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BASEFONT"	TokenNameStringLiteral	BASEFONT
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"FRAME"	TokenNameStringLiteral	FRAME
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"FRAMESET"	TokenNameStringLiteral	FRAMESET
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"NOFRAMES"	TokenNameStringLiteral	NOFRAMES
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISINDEX"	TokenNameStringLiteral	ISINDEX
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"APPLET"	TokenNameStringLiteral	APPLET
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
WHITESPACESENSITIVE	TokenNameIdentifier	 WHITESPACESENSITIVE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CENTER"	TokenNameStringLiteral	CENTER
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"DIR"	TokenNameStringLiteral	DIR
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"MENU"	TokenNameStringLiteral	MENU
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// HTML 4.0 strict DTD 	TokenNameCOMMENT_LINE	HTML 4.0 strict DTD 
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TT"	TokenNameStringLiteral	TT
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"I"	TokenNameStringLiteral	I
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BIG"	TokenNameStringLiteral	BIG
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SMALL"	TokenNameStringLiteral	SMALL
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EM"	TokenNameStringLiteral	EM
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PHRASE	TokenNameIdentifier	 PHRASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"STRONG"	TokenNameStringLiteral	STRONG
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PHRASE	TokenNameIdentifier	 PHRASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"DFN"	TokenNameStringLiteral	DFN
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PHRASE	TokenNameIdentifier	 PHRASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CODE"	TokenNameStringLiteral	CODE
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PHRASE	TokenNameIdentifier	 PHRASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SAMP"	TokenNameStringLiteral	SAMP
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PHRASE	TokenNameIdentifier	 PHRASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"KBD"	TokenNameStringLiteral	KBD
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PHRASE	TokenNameIdentifier	 PHRASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"VAR"	TokenNameStringLiteral	VAR
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PHRASE	TokenNameIdentifier	 PHRASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CITE"	TokenNameStringLiteral	CITE
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PHRASE	TokenNameIdentifier	 PHRASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ABBR"	TokenNameStringLiteral	ABBR
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PHRASE	TokenNameIdentifier	 PHRASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ACRONYM"	TokenNameStringLiteral	ACRONYM
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PHRASE	TokenNameIdentifier	 PHRASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SUP"	TokenNameStringLiteral	SUP
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SUB"	TokenNameStringLiteral	SUB
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SPAN"	TokenNameStringLiteral	SPAN
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BDO"	TokenNameStringLiteral	BDO
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BR"	TokenNameStringLiteral	BR
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BODY"	TokenNameStringLiteral	BODY
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ADDRESS"	TokenNameStringLiteral	ADDRESS
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"DIV"	TokenNameStringLiteral	DIV
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"MAP"	TokenNameStringLiteral	MAP
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"AREA"	TokenNameStringLiteral	AREA
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LINK"	TokenNameStringLiteral	LINK
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEADMISC	TokenNameIdentifier	 HEADMISC
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IMG"	TokenNameStringLiteral	IMG
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
WHITESPACESENSITIVE	TokenNameIdentifier	 WHITESPACESENSITIVE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"OBJECT"	TokenNameStringLiteral	OBJECT
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEADMISC	TokenNameIdentifier	 HEADMISC
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
WHITESPACESENSITIVE	TokenNameIdentifier	 WHITESPACESENSITIVE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"PARAM"	TokenNameStringLiteral	PARAM
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"HR"	TokenNameStringLiteral	HR
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"P"	TokenNameStringLiteral	P
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"H1"	TokenNameStringLiteral	H1
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEAD	TokenNameIdentifier	 HEAD
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"H2"	TokenNameStringLiteral	H2
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEAD	TokenNameIdentifier	 HEAD
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"H3"	TokenNameStringLiteral	H3
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEAD	TokenNameIdentifier	 HEAD
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"H4"	TokenNameStringLiteral	H4
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEAD	TokenNameIdentifier	 HEAD
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"H5"	TokenNameStringLiteral	H5
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEAD	TokenNameIdentifier	 HEAD
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"H6"	TokenNameStringLiteral	H6
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEAD	TokenNameIdentifier	 HEAD
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"PRE"	TokenNameStringLiteral	PRE
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
PREFORMATTED	TokenNameIdentifier	 PREFORMATTED
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"Q"	TokenNameStringLiteral	Q
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BLOCKQUOTE"	TokenNameStringLiteral	BLOCKQUOTE
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"INS"	TokenNameStringLiteral	INS
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"DEL"	TokenNameStringLiteral	DEL
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"DL"	TokenNameStringLiteral	DL
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"DT"	TokenNameStringLiteral	DT
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"DD"	TokenNameStringLiteral	DD
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"OL"	TokenNameStringLiteral	OL
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
LIST	TokenNameIdentifier	 LIST
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UL"	TokenNameStringLiteral	UL
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
LIST	TokenNameIdentifier	 LIST
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LI"	TokenNameStringLiteral	LI
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"FORM"	TokenNameStringLiteral	FORM
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LABEL"	TokenNameStringLiteral	LABEL
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FORMCTRL	TokenNameIdentifier	 FORMCTRL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"INPUT"	TokenNameStringLiteral	INPUT
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FORMCTRL	TokenNameIdentifier	 FORMCTRL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
INLINELABEL	TokenNameIdentifier	 INLINELABEL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SELECT"	TokenNameStringLiteral	SELECT
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FORMCTRL	TokenNameIdentifier	 FORMCTRL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
INLINELABEL	TokenNameIdentifier	 INLINELABEL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"OPTGROUP"	TokenNameStringLiteral	OPTGROUP
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"OPTION"	TokenNameStringLiteral	OPTION
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TEXTAREA"	TokenNameStringLiteral	TEXTAREA
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FORMCTRL	TokenNameIdentifier	 FORMCTRL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
INLINELABEL	TokenNameIdentifier	 INLINELABEL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"FIELDSET"	TokenNameStringLiteral	FIELDSET
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LEGEND"	TokenNameStringLiteral	LEGEND
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BUTTON"	TokenNameStringLiteral	BUTTON
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FORMCTRL	TokenNameIdentifier	 FORMCTRL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
INLINELABEL	TokenNameIdentifier	 INLINELABEL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TABLE"	TokenNameStringLiteral	TABLE
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CAPTION"	TokenNameStringLiteral	CAPTION
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"THEAD"	TokenNameStringLiteral	THEAD
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TFOOT"	TokenNameStringLiteral	TFOOT
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TBODY"	TokenNameStringLiteral	TBODY
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"COLGROUP"	TokenNameStringLiteral	COLGROUP
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"COL"	TokenNameStringLiteral	COL
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TR"	TokenNameStringLiteral	TR
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TH"	TokenNameStringLiteral	TH
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TD"	TokenNameStringLiteral	TD
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"HEAD"	TokenNameStringLiteral	HEAD
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEADELEM	TokenNameIdentifier	 HEADELEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TITLE"	TokenNameStringLiteral	TITLE
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BASE"	TokenNameStringLiteral	BASE
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"META"	TokenNameStringLiteral	META
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEADMISC	TokenNameIdentifier	 HEADMISC
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"STYLE"	TokenNameStringLiteral	STYLE
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEADMISC	TokenNameIdentifier	 HEADMISC
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
RAW	TokenNameIdentifier	 RAW
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SCRIPT"	TokenNameStringLiteral	SCRIPT
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
SPECIAL	TokenNameIdentifier	 SPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEADMISC	TokenNameIdentifier	 HEADMISC
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
RAW	TokenNameIdentifier	 RAW
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"NOSCRIPT"	TokenNameStringLiteral	NOSCRIPT
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"HTML"	TokenNameStringLiteral	HTML
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HTMLELEM	TokenNameIdentifier	 HTMLELEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// From "John Ky" <hand@syd.speednet.com.au 	TokenNameCOMMENT_LINE	From "John Ky" <hand@syd.speednet.com.au 
// Transitional Document Type Definition () 	TokenNameCOMMENT_LINE	Transitional Document Type Definition () 
// file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/sgml/loosedtd.html#basefont 	TokenNameCOMMENT_LINE	file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/sgml/loosedtd.html#basefont 
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"FONT"	TokenNameStringLiteral	FONT
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/present/graphics.html#edef-STRIKE 	TokenNameCOMMENT_LINE	file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/present/graphics.html#edef-STRIKE 
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"S"	TokenNameStringLiteral	S
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"STRIKE"	TokenNameStringLiteral	STRIKE
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/present/graphics.html#edef-U 	TokenNameCOMMENT_LINE	file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/present/graphics.html#edef-U 
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"U"	TokenNameStringLiteral	U
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// From "John Ky" <hand@syd.speednet.com.au 	TokenNameCOMMENT_LINE	From "John Ky" <hand@syd.speednet.com.au 
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"NOBR"	TokenNameStringLiteral	NOBR
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// HTML 4.0, section 16.5 	TokenNameCOMMENT_LINE	HTML 4.0, section 16.5 
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IFRAME"	TokenNameStringLiteral	IFRAME
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Netscape 4 extension 	TokenNameCOMMENT_LINE	Netscape 4 extension 
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LAYER"	TokenNameStringLiteral	LAYER
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Netscape 4 extension 	TokenNameCOMMENT_LINE	Netscape 4 extension 
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ILAYER"	TokenNameStringLiteral	ILAYER
,	TokenNameCOMMA	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOW FOR ATTRIBUTE INFORMATION . . . 	TokenNameCOMMENT_LINE	NOW FOR ATTRIBUTE INFORMATION . . . 
ElemDesc	TokenNameIdentifier	 Elem Desc
elemDesc	TokenNameIdentifier	 elem Desc
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"HREF"	TokenNameStringLiteral	HREF
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"NAME"	TokenNameStringLiteral	NAME
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"area"	TokenNameStringLiteral	area
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"HREF"	TokenNameStringLiteral	HREF
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"NOHREF"	TokenNameStringLiteral	NOHREF
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"base"	TokenNameStringLiteral	base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"HREF"	TokenNameStringLiteral	HREF
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"button"	TokenNameStringLiteral	button
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"DISABLED"	TokenNameStringLiteral	DISABLED
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"blockquote"	TokenNameStringLiteral	blockquote
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"CITE"	TokenNameStringLiteral	CITE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"del"	TokenNameStringLiteral	del
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"CITE"	TokenNameStringLiteral	CITE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"dir"	TokenNameStringLiteral	dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"COMPACT"	TokenNameStringLiteral	COMPACT
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"div"	TokenNameStringLiteral	div
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"SRC"	TokenNameStringLiteral	SRC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Netscape 4 extension 	TokenNameCOMMENT_LINE	Netscape 4 extension 
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"NOWRAP"	TokenNameStringLiteral	NOWRAP
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Internet-Explorer extension 	TokenNameCOMMENT_LINE	Internet-Explorer extension 
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"dl"	TokenNameStringLiteral	dl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"COMPACT"	TokenNameStringLiteral	COMPACT
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"form"	TokenNameStringLiteral	form
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"ACTION"	TokenNameStringLiteral	ACTION
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
// Attribution to: "Voytenko, Dimitry" <DVoytenko@SECTORBASE.COM> 	TokenNameCOMMENT_LINE	Attribution to: "Voytenko, Dimitry" <DVoytenko@SECTORBASE.COM> 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"frame"	TokenNameStringLiteral	frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"SRC"	TokenNameStringLiteral	SRC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"LONGDESC"	TokenNameStringLiteral	LONGDESC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"NORESIZE"	TokenNameStringLiteral	NORESIZE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"head"	TokenNameStringLiteral	head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"PROFILE"	TokenNameStringLiteral	PROFILE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"hr"	TokenNameStringLiteral	hr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"NOSHADE"	TokenNameStringLiteral	NOSHADE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
// HTML 4.0, section 16.5 	TokenNameCOMMENT_LINE	HTML 4.0, section 16.5 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"iframe"	TokenNameStringLiteral	iframe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"SRC"	TokenNameStringLiteral	SRC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"LONGDESC"	TokenNameStringLiteral	LONGDESC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
// Netscape 4 extension 	TokenNameCOMMENT_LINE	Netscape 4 extension 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"ilayer"	TokenNameStringLiteral	ilayer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"SRC"	TokenNameStringLiteral	SRC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"img"	TokenNameStringLiteral	img
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"SRC"	TokenNameStringLiteral	SRC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"LONGDESC"	TokenNameStringLiteral	LONGDESC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"USEMAP"	TokenNameStringLiteral	USEMAP
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"ISMAP"	TokenNameStringLiteral	ISMAP
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"input"	TokenNameStringLiteral	input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"SRC"	TokenNameStringLiteral	SRC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"USEMAP"	TokenNameStringLiteral	USEMAP
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"CHECKED"	TokenNameStringLiteral	CHECKED
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"DISABLED"	TokenNameStringLiteral	DISABLED
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"ISMAP"	TokenNameStringLiteral	ISMAP
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"READONLY"	TokenNameStringLiteral	READONLY
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"ins"	TokenNameStringLiteral	ins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"CITE"	TokenNameStringLiteral	CITE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
// Netscape 4 extension 	TokenNameCOMMENT_LINE	Netscape 4 extension 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"layer"	TokenNameStringLiteral	layer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"SRC"	TokenNameStringLiteral	SRC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"link"	TokenNameStringLiteral	link
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"HREF"	TokenNameStringLiteral	HREF
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"menu"	TokenNameStringLiteral	menu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"COMPACT"	TokenNameStringLiteral	COMPACT
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"object"	TokenNameStringLiteral	object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"CLASSID"	TokenNameStringLiteral	CLASSID
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"CODEBASE"	TokenNameStringLiteral	CODEBASE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"DATA"	TokenNameStringLiteral	DATA
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"ARCHIVE"	TokenNameStringLiteral	ARCHIVE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"USEMAP"	TokenNameStringLiteral	USEMAP
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"DECLARE"	TokenNameStringLiteral	DECLARE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"ol"	TokenNameStringLiteral	ol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"COMPACT"	TokenNameStringLiteral	COMPACT
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"optgroup"	TokenNameStringLiteral	optgroup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"DISABLED"	TokenNameStringLiteral	DISABLED
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"option"	TokenNameStringLiteral	option
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"SELECTED"	TokenNameStringLiteral	SELECTED
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"DISABLED"	TokenNameStringLiteral	DISABLED
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"q"	TokenNameStringLiteral	q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"CITE"	TokenNameStringLiteral	CITE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"script"	TokenNameStringLiteral	script
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"SRC"	TokenNameStringLiteral	SRC
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"FOR"	TokenNameStringLiteral	FOR
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"DEFER"	TokenNameStringLiteral	DEFER
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"select"	TokenNameStringLiteral	select
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"DISABLED"	TokenNameStringLiteral	DISABLED
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"MULTIPLE"	TokenNameStringLiteral	MULTIPLE
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"table"	TokenNameStringLiteral	table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"NOWRAP"	TokenNameStringLiteral	NOWRAP
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Internet-Explorer extension 	TokenNameCOMMENT_LINE	Internet-Explorer extension 
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"td"	TokenNameStringLiteral	td
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"NOWRAP"	TokenNameStringLiteral	NOWRAP
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"textarea"	TokenNameStringLiteral	textarea
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"DISABLED"	TokenNameStringLiteral	DISABLED
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"READONLY"	TokenNameStringLiteral	READONLY
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"th"	TokenNameStringLiteral	th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"NOWRAP"	TokenNameStringLiteral	NOWRAP
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
// The nowrap attribute of a tr element is both 	TokenNameCOMMENT_LINE	The nowrap attribute of a tr element is both 
// a Netscape and Internet-Explorer extension 	TokenNameCOMMENT_LINE	a Netscape and Internet-Explorer extension 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"tr"	TokenNameStringLiteral	tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"NOWRAP"	TokenNameStringLiteral	NOWRAP
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------- 
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"ul"	TokenNameStringLiteral	ul
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
"COMPACT"	TokenNameStringLiteral	COMPACT
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dummy element for elements not found. */	TokenNameCOMMENT_JAVADOC	 Dummy element for elements not found. 
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
ElemDesc	TokenNameIdentifier	 Elem Desc
m_dummy	TokenNameIdentifier	 m dummy
=	TokenNameEQUAL	
new	TokenNamenew	
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
|	TokenNameOR	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** True if URLs should be specially escaped with the %xx form. */	TokenNameCOMMENT_JAVADOC	 True if URLs should be specially escaped with the %xx form. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_specialEscapeURLs	TokenNameIdentifier	 m special Escape UR Ls
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** True if the META tag should be omitted. */	TokenNameCOMMENT_JAVADOC	 True if the META tag should be omitted. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_omitMetaTag	TokenNameIdentifier	 m omit Meta Tag
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Tells if the formatter should use special URL escaping. * * @param bool True if URLs should be specially escaped with the %xx form. */	TokenNameCOMMENT_JAVADOC	 Tells if the formatter should use special URL escaping. * @param bool True if URLs should be specially escaped with the %xx form. 
public	TokenNamepublic	
void	TokenNamevoid	
setSpecialEscapeURLs	TokenNameIdentifier	 set Special Escape UR Ls
(	TokenNameLPAREN	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_specialEscapeURLs	TokenNameIdentifier	 m special Escape UR Ls
=	TokenNameEQUAL	
bool	TokenNameIdentifier	 bool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if the formatter should omit the META tag. * * @param bool True if the META tag should be omitted. */	TokenNameCOMMENT_JAVADOC	 Tells if the formatter should omit the META tag. * @param bool True if the META tag should be omitted. 
public	TokenNamepublic	
void	TokenNamevoid	
setOmitMetaTag	TokenNameIdentifier	 set Omit Meta Tag
(	TokenNameLPAREN	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_omitMetaTag	TokenNameIdentifier	 m omit Meta Tag
=	TokenNameEQUAL	
bool	TokenNameIdentifier	 bool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specifies an output format for this serializer. It the * serializer has already been associated with an output format, * it will switch to the new format. This method should not be * called while the serializer is in the process of serializing * a document. * * This method can be called multiple times before starting * the serialization of a particular result-tree. In principle * all serialization parameters can be changed, with the exception * of method="html" (it must be method="html" otherwise we * shouldn't even have a ToHTMLStream object here!) * * @param format The output format or serialzation parameters * to use. */	TokenNameCOMMENT_JAVADOC	 Specifies an output format for this serializer. It the serializer has already been associated with an output format, it will switch to the new format. This method should not be called while the serializer is in the process of serializing a document. * This method can be called multiple times before starting the serialization of a particular result-tree. In principle all serialization parameters can be changed, with the exception of method="html" (it must be method="html" otherwise we shouldn't even have a ToHTMLStream object here!) * @param format The output format or serialzation parameters to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * If "format" does not contain the property * S_USE_URL_ESCAPING, then don't set this value at all, * just leave as-is rather than explicitly setting it. */	TokenNameCOMMENT_BLOCK	 If "format" does not contain the property S_USE_URL_ESCAPING, then don't set this value at all, just leave as-is rather than explicitly setting it. 
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_USE_URL_ESCAPING	TokenNameIdentifier	 S  USE  URL  ESCAPING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_specialEscapeURLs	TokenNameIdentifier	 m special Escape UR Ls
=	TokenNameEQUAL	
OutputPropertyUtils	TokenNameIdentifier	 Output Property Utils
.	TokenNameDOT	
getBooleanProperty	TokenNameIdentifier	 get Boolean Property
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_USE_URL_ESCAPING	TokenNameIdentifier	 S  USE  URL  ESCAPING
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * If "format" does not contain the property * S_OMIT_META_TAG, then don't set this value at all, * just leave as-is rather than explicitly setting it. */	TokenNameCOMMENT_BLOCK	 If "format" does not contain the property S_OMIT_META_TAG, then don't set this value at all, just leave as-is rather than explicitly setting it. 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_OMIT_META_TAG	TokenNameIdentifier	 S  OMIT  META  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_omitMetaTag	TokenNameIdentifier	 m omit Meta Tag
=	TokenNameEQUAL	
OutputPropertyUtils	TokenNameIdentifier	 Output Property Utils
.	TokenNameDOT	
getBooleanProperty	TokenNameIdentifier	 get Boolean Property
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_OMIT_META_TAG	TokenNameIdentifier	 S  OMIT  META  TAG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if the formatter should use special URL escaping. * * @return True if URLs should be specially escaped with the %xx form. */	TokenNameCOMMENT_JAVADOC	 Tells if the formatter should use special URL escaping. * @return True if URLs should be specially escaped with the %xx form. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
getSpecialEscapeURLs	TokenNameIdentifier	 get Special Escape UR Ls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_specialEscapeURLs	TokenNameIdentifier	 m special Escape UR Ls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if the formatter should omit the META tag. * * @return True if the META tag should be omitted. */	TokenNameCOMMENT_JAVADOC	 Tells if the formatter should omit the META tag. * @return True if the META tag should be omitted. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
getOmitMetaTag	TokenNameIdentifier	 get Omit Meta Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_omitMetaTag	TokenNameIdentifier	 m omit Meta Tag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a description of the given element. * * @param name non-null name of element, case insensitive. * * @return non-null reference to ElemDesc, which may be m_dummy if no * element description matches the given name. */	TokenNameCOMMENT_JAVADOC	 Get a description of the given element. * @param name non-null name of element, case insensitive. * @return non-null reference to ElemDesc, which may be m_dummy if no element description matches the given name. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ElemDesc	TokenNameIdentifier	 Elem Desc
getElemDesc	TokenNameIdentifier	 get Elem Desc
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* this method used to return m_dummy when name was null * but now it doesn't check and and requires non-null name. */	TokenNameCOMMENT_BLOCK	 this method used to return m_dummy when name was null but now it doesn't check and and requires non-null name. 
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
m_elementFlags	TokenNameIdentifier	 m element Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_dummy	TokenNameIdentifier	 m dummy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A Trie that is just a copy of the "static" one. * We need this one to be able to use the faster, but not thread-safe * method Trie.get2(name) */	TokenNameCOMMENT_JAVADOC	 A Trie that is just a copy of the "static" one. We need this one to be able to use the faster, but not thread-safe method Trie.get2(name) 
private	TokenNameprivate	
Trie	TokenNameIdentifier	 Trie
m_htmlInfo	TokenNameIdentifier	 m html Info
=	TokenNameEQUAL	
new	TokenNamenew	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
m_elementFlags	TokenNameIdentifier	 m element Flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Calls to this method could be replaced with calls to * getElemDesc(name), but this one should be faster. */	TokenNameCOMMENT_JAVADOC	 Calls to this method could be replaced with calls to getElemDesc(name), but this one should be faster. 
private	TokenNameprivate	
ElemDesc	TokenNameIdentifier	 Elem Desc
getElemDesc2	TokenNameIdentifier	 get Elem Desc2
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
m_htmlInfo	TokenNameIdentifier	 m html Info
.	TokenNameDOT	
get2	TokenNameIdentifier	 get2
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemDesc	TokenNameIdentifier	 Elem Desc
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_dummy	TokenNameIdentifier	 m dummy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
ToHTMLStream	TokenNameIdentifier	 To HTML Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we are just constructing this thing, no output properties 	TokenNameCOMMENT_LINE	we are just constructing this thing, no output properties 
// have been used, so we will set the right default for 	TokenNameCOMMENT_LINE	have been used, so we will set the right default for 
// indenting anyways 	TokenNameCOMMENT_LINE	indenting anyways 
m_doIndent	TokenNameIdentifier	 m do Indent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_charInfo	TokenNameIdentifier	 m char Info
=	TokenNameEQUAL	
m_htmlcharInfo	TokenNameIdentifier	 m htmlchar Info
;	TokenNameSEMICOLON	
// initialize namespaces 	TokenNameCOMMENT_LINE	initialize namespaces 
m_prefixMap	TokenNameIdentifier	 m prefix Map
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The name of the current element. */	TokenNameCOMMENT_JAVADOC	 The name of the current element. 
// private String m_currentElementName = null; 	TokenNameCOMMENT_LINE	private String m_currentElementName = null; 
/** * Receive notification of the beginning of a document. * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of a document. * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
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
super	TokenNamesuper	
.	TokenNameDOT	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_startNewLine	TokenNameIdentifier	 m start New Line
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
setOmitXMLDeclaration	TokenNameIdentifier	 set Omit XML Declaration
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method should only get called once. * If a DOCTYPE declaration needs to get written out, it will * be written out. If it doesn't need to be written out, then * the call to this method has no effect. */	TokenNameCOMMENT_JAVADOC	 This method should only get called once. If a DOCTYPE declaration needs to get written out, it will be written out. If it doesn't need to be written out, then the call to this method has no effect. 
private	TokenNameprivate	
void	TokenNamevoid	
outputDocTypeDecl	TokenNameIdentifier	 output Doc Type Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
true	TokenNametrue	
==	TokenNameEQUAL_EQUAL	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
doctypeSystem	TokenNameIdentifier	 doctype System
=	TokenNameEQUAL	
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doctypePublic	TokenNameIdentifier	 doctype Public
=	TokenNameEQUAL	
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
doctypeSystem	TokenNameIdentifier	 doctype System
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!DOCTYPE "	TokenNameStringLiteral	<!DOCTYPE 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" PUBLIC ""	TokenNameStringLiteral	 PUBLIC "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
doctypeSystem	TokenNameIdentifier	 doctype System
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" SYSTEM ""	TokenNameStringLiteral	 SYSTEM "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" ""	TokenNameStringLiteral	 "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
doctypeSystem	TokenNameIdentifier	 doctype System
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputLineSep	TokenNameIdentifier	 output Line Sep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of a document. * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of a document. * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
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
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_doIndent	TokenNameIdentifier	 m do Indent
&&	TokenNameAND_AND	
!	TokenNameNOT	
m_isprevtext	TokenNameIdentifier	 m isprevtext
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
outputLineSep	TokenNameIdentifier	 output Line Sep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
flushWriter	TokenNameIdentifier	 flush Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEndDoc	TokenNameIdentifier	 fire End Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the beginning of an element. * * * @param namespaceURI * @param localName * @param name The element type name. * @param atts The attributes attached to the element, if any. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #endElement * @see org.xml.sax.AttributeList */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of an element. * @param namespaceURI @param localName @param name The element type name. @param atts The attributes attached to the element, if any. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #endElement @see org.xml.sax.AttributeList 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
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
ElemContext	TokenNameIdentifier	 Elem Context
elemContext	TokenNameIdentifier	 elem Context
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
;	TokenNameSEMICOLON	
// clean up any pending things first 	TokenNameCOMMENT_LINE	clean up any pending things first 
if	TokenNameif	
(	TokenNameLPAREN	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the lexical QName is not given 	TokenNameCOMMENT_LINE	If the lexical QName is not given 
// use the localName in the DOCTYPE 	TokenNameCOMMENT_LINE	use the localName in the DOCTYPE 
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outputDocTypeDecl	TokenNameIdentifier	 output Doc Type Decl
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if this element has a namespace then treat it like XML 	TokenNameCOMMENT_LINE	if this element has a namespace then treat it like XML 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// getElemDesc2(name) is faster than getElemDesc(name) 	TokenNameCOMMENT_LINE	getElemDesc2(name) is faster than getElemDesc(name) 
ElemDesc	TokenNameIdentifier	 Elem Desc
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
getElemDesc2	TokenNameIdentifier	 get Elem Desc2
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
elemFlags	TokenNameIdentifier	 elem Flags
=	TokenNameEQUAL	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// deal with indentation issues first 	TokenNameCOMMENT_LINE	deal with indentation issues first 
if	TokenNameif	
(	TokenNameLPAREN	
m_doIndent	TokenNameIdentifier	 m do Indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isBlockElement	TokenNameIdentifier	 is Block Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
elemFlags	TokenNameIdentifier	 elem Flags
&	TokenNameAND	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_ispreserve	TokenNameIdentifier	 m ispreserve
)	TokenNameRPAREN	
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_inBlockElem	TokenNameIdentifier	 m in Block Elem
||	TokenNameOR_OR	
isBlockElement	TokenNameIdentifier	 is Block Element
)	TokenNameRPAREN	
/* && !isWhiteSpaceSensitive */	TokenNameCOMMENT_BLOCK	 && !isWhiteSpaceSensitive 
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_startNewLine	TokenNameIdentifier	 m start New Line
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_inBlockElem	TokenNameIdentifier	 m in Block Elem
=	TokenNameEQUAL	
!	TokenNameNOT	
isBlockElement	TokenNameIdentifier	 is Block Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// save any attributes for later processing 	TokenNameCOMMENT_LINE	save any attributes for later processing 
if	TokenNameif	
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_isprevtext	TokenNameIdentifier	 m isprevtext
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
firePseudoAttributes	TokenNameIdentifier	 fire Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
elemFlags	TokenNameIdentifier	 elem Flags
&	TokenNameAND	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// an optimization for elements which are expected 	TokenNameCOMMENT_LINE	an optimization for elements which are expected 
// to be empty. 	TokenNameCOMMENT_LINE	to be empty. 
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* XSLTC sometimes calls namespaceAfterStartElement() * so we need to remember the name */	TokenNameCOMMENT_BLOCK	 XSLTC sometimes calls namespaceAfterStartElement() so we need to remember the name 
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementDesc	TokenNameIdentifier	 m element Desc
=	TokenNameEQUAL	
elemDesc	TokenNameIdentifier	 elem Desc
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
elemContext	TokenNameIdentifier	 elem Context
=	TokenNameEQUAL	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
elemContext	TokenNameIdentifier	 elem Context
;	TokenNameSEMICOLON	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_elementDesc	TokenNameIdentifier	 m element Desc
=	TokenNameEQUAL	
elemDesc	TokenNameIdentifier	 elem Desc
;	TokenNameSEMICOLON	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_isRaw	TokenNameIdentifier	 m is Raw
=	TokenNameEQUAL	
(	TokenNameLPAREN	
elemFlags	TokenNameIdentifier	 elem Flags
&	TokenNameAND	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
RAW	TokenNameIdentifier	 RAW
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
elemFlags	TokenNameIdentifier	 elem Flags
&	TokenNameAND	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
HEADELEM	TokenNameIdentifier	 HEADELEM
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is the <HEAD> element, do some special processing 	TokenNameCOMMENT_LINE	This is the <HEAD> element, do some special processing 
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_omitMetaTag	TokenNameIdentifier	 m omit Meta Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_doIndent	TokenNameIdentifier	 m do Indent
)	TokenNameRPAREN	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<META http-equiv="Content-Type" content="text/html; charset="	TokenNameStringLiteral	<META http-equiv="Content-Type" content="text/html; charset=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encode	TokenNameIdentifier	 encode
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
getMimeEncoding	TokenNameIdentifier	 get Mime Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
encode	TokenNameIdentifier	 encode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * * @param namespaceURI * @param localName * @param name The element type name * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * @param namespaceURI @param localName @param name The element type name @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
// deal with any pending issues 	TokenNameCOMMENT_LINE	deal with any pending issues 
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the element has a namespace, treat it like XML, not HTML 	TokenNameCOMMENT_LINE	if the element has a namespace, treat it like XML, not HTML 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ElemContext	TokenNameIdentifier	 Elem Context
elemContext	TokenNameIdentifier	 elem Context
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ElemDesc	TokenNameIdentifier	 Elem Desc
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_elementDesc	TokenNameIdentifier	 m element Desc
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
elemFlags	TokenNameIdentifier	 elem Flags
=	TokenNameEQUAL	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
elemEmpty	TokenNameIdentifier	 elem Empty
=	TokenNameEQUAL	
(	TokenNameLPAREN	
elemFlags	TokenNameIdentifier	 elem Flags
&	TokenNameAND	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// deal with any indentation issues 	TokenNameCOMMENT_LINE	deal with any indentation issues 
if	TokenNameif	
(	TokenNameLPAREN	
m_doIndent	TokenNameIdentifier	 m do Indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
isBlockElement	TokenNameIdentifier	 is Block Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
elemFlags	TokenNameIdentifier	 elem Flags
&	TokenNameAND	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
BLOCK	TokenNameIdentifier	 BLOCK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
shouldIndent	TokenNameIdentifier	 should Indent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_ispreserve	TokenNameIdentifier	 m ispreserve
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_doIndent	TokenNameIdentifier	 m do Indent
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_inBlockElem	TokenNameIdentifier	 m in Block Elem
||	TokenNameOR_OR	
isBlockElement	TokenNameIdentifier	 is Block Element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_startNewLine	TokenNameIdentifier	 m start New Line
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
shouldIndent	TokenNameIdentifier	 should Indent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
&&	TokenNameAND_AND	
shouldIndent	TokenNameIdentifier	 should Indent
)	TokenNameRPAREN	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_inBlockElem	TokenNameIdentifier	 m in Block Elem
=	TokenNameEQUAL	
!	TokenNameNOT	
isBlockElement	TokenNameIdentifier	 is Block Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"</"	TokenNameStringLiteral	</
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// the start-tag open when this method was called, 	TokenNameCOMMENT_LINE	the start-tag open when this method was called, 
// so we need to process it now. 	TokenNameCOMMENT_LINE	so we need to process it now. 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireStartElem	TokenNameIdentifier	 fire Start Elem
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the starting tag was still open when we received this endElement() call 	TokenNameCOMMENT_LINE	the starting tag was still open when we received this endElement() call 
// so we need to process any gathered attributes NOW, before they go away. 	TokenNameCOMMENT_LINE	so we need to process any gathered attributes NOW, before they go away. 
int	TokenNameint	
nAttrs	TokenNameIdentifier	 n Attrs
=	TokenNameEQUAL	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nAttrs	TokenNameIdentifier	 n Attrs
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processAttributes	TokenNameIdentifier	 process Attributes
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
,	TokenNameCOMMA	
nAttrs	TokenNameIdentifier	 n Attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clear attributes object for re-use with next element 	TokenNameCOMMENT_LINE	clear attributes object for re-use with next element 
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
elemEmpty	TokenNameIdentifier	 elem Empty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// As per Dave/Paul recommendation 12/06/2000 	TokenNameCOMMENT_LINE	As per Dave/Paul recommendation 12/06/2000 
// if (shouldIndent) 	TokenNameCOMMENT_LINE	if (shouldIndent) 
// writer.write('>'); 	TokenNameCOMMENT_LINE	writer.write('>'); 
// indent(m_currentIndent); 	TokenNameCOMMENT_LINE	indent(m_currentIndent); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"></"	TokenNameStringLiteral	></
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// clean up because the element has ended 	TokenNameCOMMENT_LINE	clean up because the element has ended 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
elemFlags	TokenNameIdentifier	 elem Flags
&	TokenNameAND	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
WHITESPACESENSITIVE	TokenNameIdentifier	 WHITESPACESENSITIVE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_isprevtext	TokenNameIdentifier	 m isprevtext
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// fire off the end element event 	TokenNameCOMMENT_LINE	fire off the end element event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEndElem	TokenNameIdentifier	 fire End Elem
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// OPTIMIZE-EMPTY 	TokenNameCOMMENT_LINE	OPTIMIZE-EMPTY 
if	TokenNameif	
(	TokenNameLPAREN	
elemEmpty	TokenNameIdentifier	 elem Empty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a quick exit if the HTML element had no children. 	TokenNameCOMMENT_LINE	a quick exit if the HTML element had no children. 
// This block of code can be removed if the corresponding block of code 	TokenNameCOMMENT_LINE	This block of code can be removed if the corresponding block of code 
// in startElement() also labeled with "OPTIMIZE-EMPTY" is also removed 	TokenNameCOMMENT_LINE	in startElement() also labeled with "OPTIMIZE-EMPTY" is also removed 
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_prev	TokenNameIdentifier	 m prev
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// some more clean because the element has ended. 	TokenNameCOMMENT_LINE	some more clean because the element has ended. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_doIndent	TokenNameIdentifier	 m do Indent
&&	TokenNameAND_AND	
!	TokenNameNOT	
m_preserves	TokenNameIdentifier	 m preserves
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_preserves	TokenNameIdentifier	 m preserves
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
elemContext	TokenNameIdentifier	 elem Context
.	TokenNameDOT	
m_prev	TokenNameIdentifier	 m prev
;	TokenNameSEMICOLON	
// m_isRawStack.pop(); 	TokenNameCOMMENT_LINE	m_isRawStack.pop(); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process an attribute. * @param writer The writer to write the processed output to. * @param name The name of the attribute. * @param value The value of the attribute. * @param elemDesc The description of the HTML element * that has this attribute. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Process an attribute. @param writer The writer to write the processed output to. @param name The name of the attribute. @param value The value of the attribute. @param elemDesc The description of the HTML element that has this attribute. * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
processAttribute	TokenNameIdentifier	 process Attribute
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
elemDesc	TokenNameIdentifier	 elem Desc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
elemDesc	TokenNameIdentifier	 elem Desc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
isAttrFlagSet	TokenNameIdentifier	 is Attr Flag Set
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// %REVIEW% %OPT% 	TokenNameCOMMENT_LINE	%REVIEW% %OPT% 
// Two calls to single-char write may NOT 	TokenNameCOMMENT_LINE	Two calls to single-char write may NOT 
// be more efficient than one to string-write... 	TokenNameCOMMENT_LINE	be more efficient than one to string-write... 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elemDesc	TokenNameIdentifier	 elem Desc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
isAttrFlagSet	TokenNameIdentifier	 is Attr Flag Set
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
writeAttrURI	TokenNameIdentifier	 write Attr URI
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
m_specialEscapeURLs	TokenNameIdentifier	 m special Escape UR Ls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
writeAttrString	TokenNameIdentifier	 write Attr String
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell if a character is an ASCII digit. */	TokenNameCOMMENT_JAVADOC	 Tell if a character is an ASCII digit. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isASCIIDigit	TokenNameIdentifier	 is ASCII Digit
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Make an integer into an HH hex value. * Does no checking on the size of the input, since this * is only meant to be used locally by writeAttrURI. * * @param i must be a value less than 255. * * @return should be a two character string. */	TokenNameCOMMENT_JAVADOC	 Make an integer into an HH hex value. Does no checking on the size of the input, since this is only meant to be used locally by writeAttrURI. * @param i must be a value less than 255. * @return should be a two character string. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dmitri Ilyin: Makes sure if the String is HH encoded sign. * @param str must be 2 characters long * * @return true or false */	TokenNameCOMMENT_JAVADOC	 Dmitri Ilyin: Makes sure if the String is HH encoded sign. @param str must be 2 characters long * @return true or false 
private	TokenNameprivate	
boolean	TokenNameboolean	
isHHSign	TokenNameIdentifier	 is HH Sign
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
char	TokenNamechar	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sign	TokenNameIdentifier	 sign
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write the specified <var>string</var> after substituting non ASCII characters, * with <CODE>%HH</CODE>, where HH is the hex of the byte value. * * @param string String to convert to XML format. * @param doURLEscaping True if we should try to encode as * per http://www.ietf.org/rfc/rfc2396.txt. * * @throws org.xml.sax.SAXException if a bad surrogate pair is detected. */	TokenNameCOMMENT_JAVADOC	 Write the specified <var>string</var> after substituting non ASCII characters, with <CODE>%HH</CODE>, where HH is the hex of the byte value. * @param string String to convert to XML format. @param doURLEscaping True if we should try to encode as per http://www.ietf.org/rfc/rfc2396.txt. * @throws org.xml.sax.SAXException if a bad surrogate pair is detected. 
public	TokenNamepublic	
void	TokenNamevoid	
writeAttrURI	TokenNameIdentifier	 write Attr URI
(	TokenNameLPAREN	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doURLEscaping	TokenNameIdentifier	 do URL Escaping
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// http://www.ietf.org/rfc/rfc2396.txt says: 	TokenNameCOMMENT_LINE	http://www.ietf.org/rfc/rfc2396.txt says: 
// A URI is always in an "escaped" form, since escaping or unescaping a 	TokenNameCOMMENT_LINE	A URI is always in an "escaped" form, since escaping or unescaping a 
// completed URI might change its semantics. Normally, the only time 	TokenNameCOMMENT_LINE	completed URI might change its semantics. Normally, the only time 
// escape encodings can safely be made is when the URI is being created 	TokenNameCOMMENT_LINE	escape encodings can safely be made is when the URI is being created 
// from its component parts; each component may have its own set of 	TokenNameCOMMENT_LINE	from its component parts; each component may have its own set of 
// characters that are reserved, so only the mechanism responsible for 	TokenNameCOMMENT_LINE	characters that are reserved, so only the mechanism responsible for 
// generating or interpreting that component can determine whether or 	TokenNameCOMMENT_LINE	generating or interpreting that component can determine whether or 
// not escaping a character will change its semantics. Likewise, a URI 	TokenNameCOMMENT_LINE	not escaping a character will change its semantics. Likewise, a URI 
// must be separated into its components before the escaped characters 	TokenNameCOMMENT_LINE	must be separated into its components before the escaped characters 
// within those components can be safely decoded. 	TokenNameCOMMENT_LINE	within those components can be safely decoded. 
// 	TokenNameCOMMENT_LINE	 
// ...So we do our best to do limited escaping of the URL, without 	TokenNameCOMMENT_LINE	...So we do our best to do limited escaping of the URL, without 
// causing damage. If the URL is already properly escaped, in theory, this 	TokenNameCOMMENT_LINE	causing damage. If the URL is already properly escaped, in theory, this 
// function should not change the string value. 	TokenNameCOMMENT_LINE	function should not change the string value. 
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
m_attrBuff	TokenNameIdentifier	 m attr Buff
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attrBuff	TokenNameIdentifier	 m attr Buff
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
m_attrBuff	TokenNameIdentifier	 m attr Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
m_attrBuff	TokenNameIdentifier	 m attr Buff
;	TokenNameSEMICOLON	
int	TokenNameint	
cleanStart	TokenNameIdentifier	 clean Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
cleanLength	TokenNameIdentifier	 clean Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
126	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cleanLength	TokenNameIdentifier	 clean Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
cleanStart	TokenNameIdentifier	 clean Start
,	TokenNameCOMMA	
cleanLength	TokenNameIdentifier	 clean Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleanLength	TokenNameIdentifier	 clean Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doURLEscaping	TokenNameIdentifier	 do URL Escaping
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Encode UTF16 to UTF8. 	TokenNameCOMMENT_LINE	Encode UTF16 to UTF8. 
// Reference is Unicode, A Primer, by Tony Graham. 	TokenNameCOMMENT_LINE	Reference is Unicode, A Primer, by Tony Graham. 
// Page 92. 	TokenNameCOMMENT_LINE	Page 92. 
// Note that Kay doesn't escape 0x20... 	TokenNameCOMMENT_LINE	Note that Kay doesn't escape 0x20... 
// if(ch == 0x20) // Not sure about this... -sb 	TokenNameCOMMENT_LINE	if(ch == 0x20) // Not sure about this... -sb 
// { 	TokenNameCOMMENT_LINE	{ 
// writer.write(ch); 	TokenNameCOMMENT_LINE	writer.write(ch); 
// } 	TokenNameCOMMENT_LINE	} 
// else 	TokenNameCOMMENT_LINE	else 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
0x7FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Clear low 6 bits before rotate, put high 4 bits in low byte, 	TokenNameCOMMENT_LINE	Clear low 6 bits before rotate, put high 4 bits in low byte, 
// and set two high bits. 	TokenNameCOMMENT_LINE	and set two high bits. 
int	TokenNameint	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
0xC0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// First 6 bits, + high bit 	TokenNameCOMMENT_LINE	First 6 bits, + high bit 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
isHighUTF16Surrogate	TokenNameIdentifier	 is High UT F16 Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// high surrogate 	TokenNameCOMMENT_LINE	high surrogate 
{	TokenNameLBRACE	
// I'm sure this can be done in 3 instructions, but I choose 	TokenNameCOMMENT_LINE	I'm sure this can be done in 3 instructions, but I choose 
// to try and do it exactly like it is done in the book, at least 	TokenNameCOMMENT_LINE	to try and do it exactly like it is done in the book, at least 
// until we are sure this is totally clean. I don't think performance 	TokenNameCOMMENT_LINE	until we are sure this is totally clean. I don't think performance 
// is a big issue with this particular function, though I could be 	TokenNameCOMMENT_LINE	is a big issue with this particular function, though I could be 
// wrong. Also, the stuff below clearly does more masking than 	TokenNameCOMMENT_LINE	wrong. Also, the stuff below clearly does more masking than 
// it needs to do. 	TokenNameCOMMENT_LINE	it needs to do. 
// Clear high 6 bits. 	TokenNameCOMMENT_LINE	Clear high 6 bits. 
int	TokenNameint	
highSurrogate	TokenNameIdentifier	 high Surrogate
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&	TokenNameAND	
0x03FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Middle 4 bits (wwww) + 1 	TokenNameCOMMENT_LINE	Middle 4 bits (wwww) + 1 
// "Note that the value of wwww from the high surrogate bit pattern 	TokenNameCOMMENT_LINE	"Note that the value of wwww from the high surrogate bit pattern 
// is incremented to make the uuuuu bit pattern in the scalar value 	TokenNameCOMMENT_LINE	is incremented to make the uuuuu bit pattern in the scalar value 
// so the surrogate pair don't address the BMP." 	TokenNameCOMMENT_LINE	so the surrogate pair don't address the BMP." 
int	TokenNameint	
wwww	TokenNameIdentifier	 wwww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
highSurrogate	TokenNameIdentifier	 high Surrogate
&	TokenNameAND	
0x03C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
uuuuu	TokenNameIdentifier	 uuuuu
=	TokenNameEQUAL	
wwww	TokenNameIdentifier	 wwww
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// next 4 bits 	TokenNameCOMMENT_LINE	next 4 bits 
int	TokenNameint	
zzzz	TokenNameIdentifier	 zzzz
=	TokenNameEQUAL	
(	TokenNameLPAREN	
highSurrogate	TokenNameIdentifier	 high Surrogate
&	TokenNameAND	
0x003C	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// low 2 bits 	TokenNameCOMMENT_LINE	low 2 bits 
int	TokenNameint	
yyyyyy	TokenNameIdentifier	 yyyyyy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
highSurrogate	TokenNameIdentifier	 high Surrogate
&	TokenNameAND	
0x0003	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Get low surrogate character. 	TokenNameCOMMENT_LINE	Get low surrogate character. 
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Clear high 6 bits. 	TokenNameCOMMENT_LINE	Clear high 6 bits. 
int	TokenNameint	
lowSurrogate	TokenNameIdentifier	 low Surrogate
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&	TokenNameAND	
0x03FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// put the middle 4 bits into the bottom of yyyyyy (byte 3) 	TokenNameCOMMENT_LINE	put the middle 4 bits into the bottom of yyyyyy (byte 3) 
yyyyyy	TokenNameIdentifier	 yyyyyy
=	TokenNameEQUAL	
yyyyyy	TokenNameIdentifier	 yyyyyy
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lowSurrogate	TokenNameIdentifier	 low Surrogate
&	TokenNameAND	
0x03C0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// bottom 6 bits. 	TokenNameCOMMENT_LINE	bottom 6 bits. 
int	TokenNameint	
xxxxxx	TokenNameIdentifier	 xxxxxx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lowSurrogate	TokenNameIdentifier	 low Surrogate
&	TokenNameAND	
0x003F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
byte1	TokenNameIdentifier	 byte1
=	TokenNameEQUAL	
0xF0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
uuuuu	TokenNameIdentifier	 uuuuu
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// top 3 bits of uuuuu 	TokenNameCOMMENT_LINE	top 3 bits of uuuuu 
int	TokenNameint	
byte2	TokenNameIdentifier	 byte2
=	TokenNameEQUAL	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
uuuuu	TokenNameIdentifier	 uuuuu
&	TokenNameAND	
0x03	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
zzzz	TokenNameIdentifier	 zzzz
;	TokenNameSEMICOLON	
int	TokenNameint	
byte3	TokenNameIdentifier	 byte3
=	TokenNameEQUAL	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
yyyyyy	TokenNameIdentifier	 yyyyyy
;	TokenNameSEMICOLON	
int	TokenNameint	
byte4	TokenNameIdentifier	 byte4
=	TokenNameEQUAL	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
xxxxxx	TokenNameIdentifier	 xxxxxx
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
byte1	TokenNameIdentifier	 byte1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
byte2	TokenNameIdentifier	 byte2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
byte3	TokenNameIdentifier	 byte3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
byte4	TokenNameIdentifier	 byte4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
0xE0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// top 4 bits 	TokenNameCOMMENT_LINE	top 4 bits 
int	TokenNameint	
middle	TokenNameIdentifier	 middle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0x0FC0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// middle 6 bits 	TokenNameCOMMENT_LINE	middle 6 bits 
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// First 6 bits, + high bit 	TokenNameCOMMENT_LINE	First 6 bits, + high bit 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
middle	TokenNameIdentifier	 middle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
makeHHString	TokenNameIdentifier	 make HH String
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
escapingNotNeeded	TokenNameIdentifier	 escaping Not Needed
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// In this character range we have first written out any previously accumulated 	TokenNameCOMMENT_LINE	In this character range we have first written out any previously accumulated 
// "clean" characters, then processed the current more complicated character, 	TokenNameCOMMENT_LINE	"clean" characters, then processed the current more complicated character, 
// which may have incremented "i". 	TokenNameCOMMENT_LINE	which may have incremented "i". 
// We now we reset the next possible clean character. 	TokenNameCOMMENT_LINE	We now we reset the next possible clean character. 
cleanStart	TokenNameIdentifier	 clean Start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Since http://www.ietf.org/rfc/rfc2396.txt refers to the URI grammar as 	TokenNameCOMMENT_LINE	Since http://www.ietf.org/rfc/rfc2396.txt refers to the URI grammar as 
// not allowing quotes in the URI proper syntax, nor in the fragment 	TokenNameCOMMENT_LINE	not allowing quotes in the URI proper syntax, nor in the fragment 
// identifier, we believe that it's OK to double escape quotes. 	TokenNameCOMMENT_LINE	identifier, we believe that it's OK to double escape quotes. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the character is a '%' number number, try to avoid double-escaping. 	TokenNameCOMMENT_LINE	If the character is a '%' number number, try to avoid double-escaping. 
// There is a question if this is legal behavior. 	TokenNameCOMMENT_LINE	There is a question if this is legal behavior. 
// Dmitri Ilyin: to check if '%' number number is invalid. It must be checked if %xx is a sign, that would be encoded 	TokenNameCOMMENT_LINE	Dmitri Ilyin: to check if '%' number number is invalid. It must be checked if %xx is a sign, that would be encoded 
// The encoded signes are in Hex form. So %xx my be in form %3C that is "<" sign. I will try to change here a little. 	TokenNameCOMMENT_LINE	The encoded signes are in Hex form. So %xx my be in form %3C that is "<" sign. I will try to change here a little. 
// if( ((i+2) < len) && isASCIIDigit(stringArray[i+1]) && isASCIIDigit(stringArray[i+2]) ) 	TokenNameCOMMENT_LINE	if( ((i+2) < len) && isASCIIDigit(stringArray[i+1]) && isASCIIDigit(stringArray[i+2]) ) 
// We are no longer escaping '%' 	TokenNameCOMMENT_LINE	We are no longer escaping '%' 
if	TokenNameif	
(	TokenNameLPAREN	
cleanLength	TokenNameIdentifier	 clean Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
cleanStart	TokenNameIdentifier	 clean Start
,	TokenNameCOMMA	
cleanLength	TokenNameIdentifier	 clean Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleanLength	TokenNameIdentifier	 clean Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Mike Kay encodes this as &#34;, so he may know something I don't? 	TokenNameCOMMENT_LINE	Mike Kay encodes this as &#34;, so he may know something I don't? 
if	TokenNameif	
(	TokenNameLPAREN	
doURLEscaping	TokenNameIdentifier	 do URL Escaping
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"%22"	TokenNameStringLiteral	%22
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we have to escape this, I guess. 	TokenNameCOMMENT_LINE	we have to escape this, I guess. 
// We have written out any clean characters, then the escaped '%' and now we 	TokenNameCOMMENT_LINE	We have written out any clean characters, then the escaped '%' and now we 
// We now we reset the next possible clean character. 	TokenNameCOMMENT_LINE	We now we reset the next possible clean character. 
cleanStart	TokenNameIdentifier	 clean Start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// HTML 4.01 reads, "Authors should use "&amp;" (ASCII decimal 38) 	TokenNameCOMMENT_LINE	HTML 4.01 reads, "Authors should use "&amp;" (ASCII decimal 38) 
// instead of "&" to avoid confusion with the beginning of a character 	TokenNameCOMMENT_LINE	instead of "&" to avoid confusion with the beginning of a character 
// reference (entity reference open delimiter). 	TokenNameCOMMENT_LINE	reference (entity reference open delimiter). 
if	TokenNameif	
(	TokenNameLPAREN	
cleanLength	TokenNameIdentifier	 clean Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
cleanStart	TokenNameIdentifier	 clean Start
,	TokenNameCOMMA	
cleanLength	TokenNameIdentifier	 clean Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleanLength	TokenNameIdentifier	 clean Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleanStart	TokenNameIdentifier	 clean Start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// no processing for this character, just count how 	TokenNameCOMMENT_LINE	no processing for this character, just count how 
// many characters in a row that we have that need no processing 	TokenNameCOMMENT_LINE	many characters in a row that we have that need no processing 
cleanLength	TokenNameIdentifier	 clean Length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// are there any clean characters at the end of the array 	TokenNameCOMMENT_LINE	are there any clean characters at the end of the array 
// that we haven't processed yet? 	TokenNameCOMMENT_LINE	that we haven't processed yet? 
if	TokenNameif	
(	TokenNameLPAREN	
cleanLength	TokenNameIdentifier	 clean Length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the whole string can be written out as-is do so 	TokenNameCOMMENT_LINE	if the whole string can be written out as-is do so 
// otherwise write out the clean chars at the end of the 	TokenNameCOMMENT_LINE	otherwise write out the clean chars at the end of the 
// array 	TokenNameCOMMENT_LINE	array 
if	TokenNameif	
(	TokenNameLPAREN	
cleanStart	TokenNameIdentifier	 clean Start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
cleanStart	TokenNameIdentifier	 clean Start
,	TokenNameCOMMA	
cleanLength	TokenNameIdentifier	 clean Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cleanLength	TokenNameIdentifier	 clean Length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a little optimization for 1 clean character 	TokenNameCOMMENT_LINE	a little optimization for 1 clean character 
// (we could have let the previous if(...) handle them all) 	TokenNameCOMMENT_LINE	(we could have let the previous if(...) handle them all) 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Writes the specified <var>string</var> after substituting <VAR>specials</VAR>, * and UTF-16 surrogates for character references <CODE>&amp;#xnn</CODE>. * * @param string String to convert to XML format. * @param encoding CURRENTLY NOT IMPLEMENTED. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Writes the specified <var>string</var> after substituting <VAR>specials</VAR>, and UTF-16 surrogates for character references <CODE>&amp;#xnn</CODE>. * @param string String to convert to XML format. @param encoding CURRENTLY NOT IMPLEMENTED. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
writeAttrString	TokenNameIdentifier	 write Attr String
(	TokenNameLPAREN	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
m_attrBuff	TokenNameIdentifier	 m attr Buff
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attrBuff	TokenNameIdentifier	 m attr Buff
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
m_attrBuff	TokenNameIdentifier	 m attr Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
m_attrBuff	TokenNameIdentifier	 m attr Buff
;	TokenNameSEMICOLON	
int	TokenNameint	
cleanStart	TokenNameIdentifier	 clean Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
cleanLength	TokenNameIdentifier	 clean Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// System.out.println("SPECIALSSIZE: "+SPECIALSSIZE); 	TokenNameCOMMENT_LINE	System.out.println("SPECIALSSIZE: "+SPECIALSSIZE); 
// System.out.println("ch: "+(int)ch); 	TokenNameCOMMENT_LINE	System.out.println("ch: "+(int)ch); 
// System.out.println("m_maxCharacter: "+(int)m_maxCharacter); 	TokenNameCOMMENT_LINE	System.out.println("m_maxCharacter: "+(int)m_maxCharacter); 
// System.out.println("m_attrCharsMap[ch]: "+(int)m_attrCharsMap[ch]); 	TokenNameCOMMENT_LINE	System.out.println("m_attrCharsMap[ch]: "+(int)m_attrCharsMap[ch]); 
if	TokenNameif	
(	TokenNameLPAREN	
escapingNotNeeded	TokenNameIdentifier	 escaping Not Needed
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
shouldMapAttrChar	TokenNameIdentifier	 should Map Attr Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanLength	TokenNameIdentifier	 clean Length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
||	TokenNameOR_OR	
'>'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanLength	TokenNameIdentifier	 clean Length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// no escaping in this case, as specified in 15.2 	TokenNameCOMMENT_LINE	no escaping in this case, as specified in 15.2 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanLength	TokenNameIdentifier	 clean Length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// no escaping in this case, as specified in 15.2 	TokenNameCOMMENT_LINE	no escaping in this case, as specified in 15.2 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cleanLength	TokenNameIdentifier	 clean Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
cleanStart	TokenNameIdentifier	 clean Start
,	TokenNameCOMMA	
cleanLength	TokenNameIdentifier	 clean Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleanLength	TokenNameIdentifier	 clean Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
accumDefaultEntity	TokenNameIdentifier	 accum Default Entity
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
isHighUTF16Surrogate	TokenNameIdentifier	 is High UT F16 Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeUTF16Surrogate	TokenNameIdentifier	 write UT F16 Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// two input characters processed 	TokenNameCOMMENT_LINE	two input characters processed 
// this increments by one and the for() 	TokenNameCOMMENT_LINE	this increments by one and the for() 
// loop itself increments by another one. 	TokenNameCOMMENT_LINE	loop itself increments by another one. 
}	TokenNameRBRACE	
// The next is kind of a hack to keep from escaping in the case 	TokenNameCOMMENT_LINE	The next is kind of a hack to keep from escaping in the case 
// of Shift_JIS and the like. 	TokenNameCOMMENT_LINE	of Shift_JIS and the like. 
/* else if ((ch < m_maxCharacter) && (m_maxCharacter == 0xFFFF) && (ch != 160)) { writer.write(ch); // no escaping in this case } else */	TokenNameCOMMENT_BLOCK	 else if ((ch < m_maxCharacter) && (m_maxCharacter == 0xFFFF) && (ch != 160)) { writer.write(ch); // no escaping in this case } else 
String	TokenNameIdentifier	 String
outputStringForChar	TokenNameIdentifier	 output String For Char
=	TokenNameEQUAL	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
getOutputStringForChar	TokenNameIdentifier	 get Output String For Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
outputStringForChar	TokenNameIdentifier	 output String For Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
outputStringForChar	TokenNameIdentifier	 output String For Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
escapingNotNeeded	TokenNameIdentifier	 escaping Not Needed
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no escaping in this case 	TokenNameCOMMENT_LINE	no escaping in this case 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
cleanStart	TokenNameIdentifier	 clean Start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of for() 	TokenNameCOMMENT_LINE	end of for() 
// are there any clean characters at the end of the array 	TokenNameCOMMENT_LINE	are there any clean characters at the end of the array 
// that we haven't processed yet? 	TokenNameCOMMENT_LINE	that we haven't processed yet? 
if	TokenNameif	
(	TokenNameLPAREN	
cleanLength	TokenNameIdentifier	 clean Length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the whole string can be written out as-is do so 	TokenNameCOMMENT_LINE	if the whole string can be written out as-is do so 
// otherwise write out the clean chars at the end of the 	TokenNameCOMMENT_LINE	otherwise write out the clean chars at the end of the 
// array 	TokenNameCOMMENT_LINE	array 
if	TokenNameif	
(	TokenNameLPAREN	
cleanStart	TokenNameIdentifier	 clean Start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
cleanStart	TokenNameIdentifier	 clean Start
,	TokenNameCOMMA	
cleanLength	TokenNameIdentifier	 clean Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cleanLength	TokenNameIdentifier	 clean Length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a little optimization for 1 clean character 	TokenNameCOMMENT_LINE	a little optimization for 1 clean character 
// (we could have let the previous if(...) handle them all) 	TokenNameCOMMENT_LINE	(we could have let the previous if(...) handle them all) 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of character data. * * <p>The Parser will call this method to report each chunk of * character data. SAX parsers may return all contiguous character * data in a single chunk, or they may split it into several * chunks; however, all of the characters in any single event * must come from the same external entity, so that the Locator * provides useful information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * <p>Note that some parsers will report whitespace using the * ignorableWhitespace() method rather than this one (validating * parsers must do so).</p> * * @param chars The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #ignorableWhitespace * @see org.xml.sax.Locator * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data. * <p>The Parser will call this method to report each chunk of character data. SAX parsers may return all contiguous character data in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * <p>Note that some parsers will report whitespace using the ignorableWhitespace() method rather than this one (validating parsers must do so).</p> * @param chars The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #ignorableWhitespace @see org.xml.sax.Locator * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_isRaw	TokenNameIdentifier	 m is Raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Clean up some pending issues. 	TokenNameCOMMENT_LINE	Clean up some pending issues. 
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
writeNormalizedChars	TokenNameIdentifier	 write Normalized Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// time to generate characters event 	TokenNameCOMMENT_LINE	time to generate characters event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireCharEvent	TokenNameIdentifier	 fire Char Event
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of cdata. * * <p>The Parser will call this method to report each chunk of * character data. SAX parsers may return all contiguous character * data in a single chunk, or they may split it into several * chunks; however, all of the characters in any single event * must come from the same external entity, so that the Locator * provides useful information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * <p>Note that some parsers will report whitespace using the * ignorableWhitespace() method rather than this one (validating * parsers must do so).</p> * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #ignorableWhitespace * @see org.xml.sax.Locator * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of cdata. * <p>The Parser will call this method to report each chunk of character data. SAX parsers may return all contiguous character data in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * <p>Note that some parsers will report whitespace using the ignorableWhitespace() method rather than this one (validating parsers must do so).</p> * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #ignorableWhitespace @see org.xml.sax.Locator * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
cdata	TokenNameIdentifier	 cdata
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"SCRIPT"	TokenNameStringLiteral	SCRIPT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"STYLE"	TokenNameStringLiteral	STYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldIndent	TokenNameIdentifier	 should Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// writer.write(ch, start, length); 	TokenNameCOMMENT_LINE	writer.write(ch, start, length); 
writeNormalizedChars	TokenNameIdentifier	 write Normalized Chars
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"IO error", ioe); 	TokenNameCOMMENT_LINE	"IO error", ioe); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
cdata	TokenNameIdentifier	 cdata
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of a processing instruction. * * @param target The processing instruction target. * @param data The processing instruction data, or null if * none was supplied. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a processing instruction. * @param target The processing instruction target. @param data The processing instruction data, or null if none was supplied. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
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
// Process any pending starDocument and startElement first. 	TokenNameCOMMENT_LINE	Process any pending starDocument and startElement first. 
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use a fairly nasty hack to tell if the next node is supposed to be 	TokenNameCOMMENT_LINE	Use a fairly nasty hack to tell if the next node is supposed to be 
// unescaped text. 	TokenNameCOMMENT_LINE	unescaped text. 
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_DISABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  DISABLE  OUTPUT  ESCAPING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startNonEscaping	TokenNameIdentifier	 start Non Escaping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_ENABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  ENABLE  OUTPUT  ESCAPING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endNonEscaping	TokenNameIdentifier	 end Non Escaping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// clean up any pending things first 	TokenNameCOMMENT_LINE	clean up any pending things first 
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Perhaps processing instructions can be written out in HTML before * the DOCTYPE, in which case this could be emitted with the * startElement call, that knows the name of the document element * doing it right. */	TokenNameCOMMENT_BLOCK	 Perhaps processing instructions can be written out in HTML before the DOCTYPE, in which case this could be emitted with the startElement call, that knows the name of the document element doing it right. 
if	TokenNameif	
(	TokenNameLPAREN	
true	TokenNametrue	
==	TokenNameEQUAL_EQUAL	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
)	TokenNameRPAREN	
outputDocTypeDecl	TokenNameIdentifier	 output Doc Type Decl
(	TokenNameLPAREN	
"html"	TokenNameStringLiteral	html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// best guess for the upcoming element 	TokenNameCOMMENT_LINE	best guess for the upcoming element 
if	TokenNameif	
(	TokenNameLPAREN	
shouldIndent	TokenNameIdentifier	 should Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
//writer.write("<?" + target); 	TokenNameCOMMENT_LINE	writer.write("<?" + target); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<?"	TokenNameStringLiteral	<?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isSpaceChar	TokenNameIdentifier	 is Space Char
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//writer.write(data + ">"); // different from XML 	TokenNameCOMMENT_LINE	writer.write(data + ">"); // different from XML 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// different from XML 	TokenNameCOMMENT_LINE	different from XML 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// different from XML 	TokenNameCOMMENT_LINE	different from XML 
// Always output a newline char if not inside of an 	TokenNameCOMMENT_LINE	Always output a newline char if not inside of an 
// element. The whitespace is not significant in that 	TokenNameCOMMENT_LINE	element. The whitespace is not significant in that 
// case. 	TokenNameCOMMENT_LINE	case. 
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
outputLineSep	TokenNameIdentifier	 output Line Sep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_startNewLine	TokenNameIdentifier	 m start New Line
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now generate the PI event 	TokenNameCOMMENT_LINE	now generate the PI event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEscapingEvent	TokenNameIdentifier	 fire Escaping Event
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notivication of a entityReference. * * @param name non-null reference to entity name string. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notivication of a entityReference. * @param name non-null reference to entity name string. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
entityReference	TokenNameIdentifier	 entity Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#endElement(String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#endElement(String) 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the attributes, which means to write out the currently * collected attributes to the writer. The attributes are not * cleared by this method * * @param writer the writer to write processed attributes to. * @param nAttrs the number of attributes in m_attributes * to be processed * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Process the attributes, which means to write out the currently collected attributes to the writer. The attributes are not cleared by this method * @param writer the writer to write processed attributes to. @param nAttrs the number of attributes in m_attributes to be processed * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
processAttributes	TokenNameIdentifier	 process Attributes
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
int	TokenNameint	
nAttrs	TokenNameIdentifier	 n Attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
/* * process the collected attributes */	TokenNameCOMMENT_BLOCK	 process the collected attributes 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nAttrs	TokenNameIdentifier	 n Attrs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processAttribute	TokenNameIdentifier	 process Attribute
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementDesc	TokenNameIdentifier	 m element Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * For the enclosing elements starting tag write out out any attributes * followed by ">". At this point we also mark if this element is * a cdata-section-element. * *@throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 For the enclosing elements starting tag write out out any attributes followed by ">". At this point we also mark if this element is a cdata-section-element. *@throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// finish processing attributes, time to fire off the start element event 	TokenNameCOMMENT_LINE	finish processing attributes, time to fire off the start element event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireStartElem	TokenNameIdentifier	 fire Start Elem
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nAttrs	TokenNameIdentifier	 n Attrs
=	TokenNameEQUAL	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nAttrs	TokenNameIdentifier	 n Attrs
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processAttributes	TokenNameIdentifier	 process Attributes
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
,	TokenNameCOMMA	
nAttrs	TokenNameIdentifier	 n Attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clear attributes object for re-use with next element 	TokenNameCOMMENT_LINE	clear attributes object for re-use with next element 
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* At this point we have the prefix mappings now, so * lets determine if the current element is specified in the cdata- * section-elements list. */	TokenNameCOMMENT_BLOCK	 At this point we have the prefix mappings now, so lets determine if the current element is specified in the cdata- section-elements list. 
if	TokenNameif	
(	TokenNameLPAREN	
m_CdataElems	TokenNameIdentifier	 m  Cdata Elems
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// if there are any cdata sections 	TokenNameCOMMENT_LINE	if there are any cdata sections 
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_isCdataSection	TokenNameIdentifier	 m is Cdata Section
=	TokenNameEQUAL	
isCdataSection	TokenNameIdentifier	 is Cdata Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_doIndent	TokenNameIdentifier	 m do Indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isprevtext	TokenNameIdentifier	 m isprevtext
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_preserves	TokenNameIdentifier	 m preserves
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_ispreserve	TokenNameIdentifier	 m ispreserve
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method is used when a prefix/uri namespace mapping * is indicated after the element was started with a * startElement() and before and endElement(). * startPrefixMapping(prefix,uri) would be used before the * startElement() call. * @param uri the URI of the namespace * @param prefix the prefix associated with the given URI. * * @see ExtendedContentHandler#namespaceAfterStartElement(String, String) */	TokenNameCOMMENT_JAVADOC	 This method is used when a prefix/uri namespace mapping is indicated after the element was started with a startElement() and before and endElement(). startPrefixMapping(prefix,uri) would be used before the startElement() call. @param uri the URI of the namespace @param prefix the prefix associated with the given URI. * @see ExtendedContentHandler#namespaceAfterStartElement(String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
namespaceAfterStartElement	TokenNameIdentifier	 namespace After Start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// hack for XSLTC with finding URI for default namespace 	TokenNameCOMMENT_LINE	hack for XSLTC with finding URI for default namespace 
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix1	TokenNameIdentifier	 prefix1
=	TokenNameEQUAL	
getPrefixPart	TokenNameIdentifier	 get Prefix Part
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix1	TokenNameIdentifier	 prefix1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the elements URI is not known yet, and it 	TokenNameCOMMENT_LINE	the elements URI is not known yet, and it 
// doesn't have a prefix, and we are currently 	TokenNameCOMMENT_LINE	doesn't have a prefix, and we are currently 
// setting the uri for prefix "", so we have 	TokenNameCOMMENT_LINE	setting the uri for prefix "", so we have 
// the uri for the element... lets remember it 	TokenNameCOMMENT_LINE	the uri for the element... lets remember it 
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_inDTD	TokenNameIdentifier	 m in DTD
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the end of DTD declarations. * @throws org.xml.sax.SAXException The application may raise an exception. * @see #startDTD */	TokenNameCOMMENT_JAVADOC	 Report the end of DTD declarations. @throws org.xml.sax.SAXException The application may raise an exception. @see #startDTD 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
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
m_inDTD	TokenNameIdentifier	 m in DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/* for ToHTMLStream the DOCTYPE is entirely output in the * startDocumentInternal() method, so don't do anything here */	TokenNameCOMMENT_BLOCK	 for ToHTMLStream the DOCTYPE is entirely output in the startDocumentInternal() method, so don't do anything here 
}	TokenNameRBRACE	
/** * This method does nothing. */	TokenNameCOMMENT_JAVADOC	 This method does nothing. 
public	TokenNamepublic	
void	TokenNamevoid	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eName	TokenNameIdentifier	 e Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aName	TokenNameIdentifier	 a Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
valueDefault	TokenNameIdentifier	 value Default
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// The internal DTD subset is not serialized by the ToHTMLStream serializer 	TokenNameCOMMENT_LINE	The internal DTD subset is not serialized by the ToHTMLStream serializer 
}	TokenNameRBRACE	
/** * This method does nothing. */	TokenNameCOMMENT_JAVADOC	 This method does nothing. 
public	TokenNamepublic	
void	TokenNamevoid	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// The internal DTD subset is not serialized by the ToHTMLStream serializer 	TokenNameCOMMENT_LINE	The internal DTD subset is not serialized by the ToHTMLStream serializer 
}	TokenNameRBRACE	
/** * This method does nothing. */	TokenNameCOMMENT_JAVADOC	 This method does nothing. 
public	TokenNamepublic	
void	TokenNamevoid	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// The internal DTD subset is not serialized by the ToHTMLStream serializer 	TokenNameCOMMENT_LINE	The internal DTD subset is not serialized by the ToHTMLStream serializer 
}	TokenNameRBRACE	
/** * This method does nothing. */	TokenNameCOMMENT_JAVADOC	 This method does nothing. 
public	TokenNamepublic	
void	TokenNamevoid	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// The internal DTD subset is not serialized by the ToHTMLStream serializer 	TokenNameCOMMENT_LINE	The internal DTD subset is not serialized by the ToHTMLStream serializer 
}	TokenNameRBRACE	
/** * This method is used to add an attribute to the currently open element. * The caller has guaranted that this attribute is unique, which means that it * not been seen before and will not be seen again. * * @param name the qualified name of the attribute * @param value the value of the attribute which can contain only * ASCII printable characters characters in the range 32 to 127 inclusive. * @param flags the bit values of this integer give optimization information. */	TokenNameCOMMENT_JAVADOC	 This method is used to add an attribute to the currently open element. The caller has guaranted that this attribute is unique, which means that it not been seen before and will not be seen again. * @param name the qualified name of the attribute @param value the value of the attribute which can contain only ASCII printable characters characters in the range 32 to 127 inclusive. @param flags the bit values of this integer give optimization information. 
public	TokenNamepublic	
void	TokenNamevoid	
addUniqueAttribute	TokenNameIdentifier	 add Unique Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
NO_BAD_CHARS	TokenNameIdentifier	 NO  BAD  CHARS
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_htmlcharInfo	TokenNameIdentifier	 m htmlchar Info
.	TokenNameDOT	
onlyQuotAmpLtGt	TokenNameIdentifier	 only Quot Amp Lt Gt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// "flags" has indicated that the characters 	TokenNameCOMMENT_LINE	"flags" has indicated that the characters 
// '>' '<' '&' and '"' are not in the value and 	TokenNameCOMMENT_LINE	'>' '<' '&' and '"' are not in the value and 
// m_htmlcharInfo has recorded that there are no other 	TokenNameCOMMENT_LINE	m_htmlcharInfo has recorded that there are no other 
// entities in the range 0 to 127 so we write out the 	TokenNameCOMMENT_LINE	entities in the range 0 to 127 so we write out the 
// value directly 	TokenNameCOMMENT_LINE	value directly 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
HTML_ATTREMPTY	TokenNameIdentifier	 HTML  ATTREMPTY
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
HTML_ATTRURL	TokenNameIdentifier	 HTML  ATTRURL
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeAttrURI	TokenNameIdentifier	 write Attr URI
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
m_specialEscapeURLs	TokenNameIdentifier	 m special Escape UR Ls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writeAttrString	TokenNameIdentifier	 write Attr String
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// The internal DTD subset is not serialized by the ToHTMLStream serializer 	TokenNameCOMMENT_LINE	The internal DTD subset is not serialized by the ToHTMLStream serializer 
if	TokenNameif	
(	TokenNameLPAREN	
m_inDTD	TokenNameIdentifier	 m in DTD
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Clean up some pending issues, just in case 	TokenNameCOMMENT_LINE	Clean up some pending issues, just in case 
// this call is coming right after a startElement() 	TokenNameCOMMENT_LINE	this call is coming right after a startElement() 
// or we are in the middle of writing out CDATA 	TokenNameCOMMENT_LINE	or we are in the middle of writing out CDATA 
// or if a startDocument() call was not received 	TokenNameCOMMENT_LINE	or if a startDocument() call was not received 
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Perhaps comments can be written out in HTML before the DOCTYPE. * In this case we might delete this call to writeOutDOCTYPE, and * it would be handled within the startElement() call. */	TokenNameCOMMENT_BLOCK	 Perhaps comments can be written out in HTML before the DOCTYPE. In this case we might delete this call to writeOutDOCTYPE, and it would be handled within the startElement() call. 
if	TokenNameif	
(	TokenNameLPAREN	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
)	TokenNameRPAREN	
outputDocTypeDecl	TokenNameIdentifier	 output Doc Type Decl
(	TokenNameLPAREN	
"html"	TokenNameStringLiteral	html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// best guess for the upcoming element 	TokenNameCOMMENT_LINE	best guess for the upcoming element 
super	TokenNamesuper	
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
resetToHTMLStream	TokenNameIdentifier	 reset To HTML Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
resetToHTMLStream	TokenNameIdentifier	 reset To HTML Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// m_htmlcharInfo remains unchanged 	TokenNameCOMMENT_LINE	m_htmlcharInfo remains unchanged 
// m_htmlInfo = null; // Don't reset 	TokenNameCOMMENT_LINE	m_htmlInfo = null; // Don't reset 
m_inBlockElem	TokenNameIdentifier	 m in Block Elem
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_inDTD	TokenNameIdentifier	 m in DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_omitMetaTag	TokenNameIdentifier	 m omit Meta Tag
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_specialEscapeURLs	TokenNameIdentifier	 m special Escape UR Ls
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
Trie	TokenNameIdentifier	 Trie
{	TokenNameLBRACE	
/** * A digital search trie for 7-bit ASCII text * The API is a subset of java.util.Hashtable * The key must be a 7-bit ASCII string * The value may be any Java Object * One can get an object stored in a trie from its key, * but the search is either case sensitive or case * insensitive to the characters in the key, and this * choice of sensitivity or insensitivity is made when * the Trie is created, before any objects are put in it. * * This class is a copy of the one in org.apache.xml.utils. * It exists to cut the serializers dependancy on that package. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A digital search trie for 7-bit ASCII text The API is a subset of java.util.Hashtable The key must be a 7-bit ASCII string The value may be any Java Object One can get an object stored in a trie from its key, but the search is either case sensitive or case insensitive to the characters in the key, and this choice of sensitivity or insensitivity is made when the Trie is created, before any objects are put in it. * This class is a copy of the one in org.apache.xml.utils. It exists to cut the serializers dependancy on that package. * @xsl.usage internal 
/** Size of the m_nextChar array. */	TokenNameCOMMENT_JAVADOC	 Size of the m_nextChar array. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALPHA_SIZE	TokenNameIdentifier	 ALPHA  SIZE
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The root node of the tree. */	TokenNameCOMMENT_JAVADOC	 The root node of the tree. 
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
m_Root	TokenNameIdentifier	 m  Root
;	TokenNameSEMICOLON	
/** helper buffer to convert Strings to char arrays */	TokenNameCOMMENT_JAVADOC	 helper buffer to convert Strings to char arrays 
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_charBuffer	TokenNameIdentifier	 m char Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** true if the search for an object is lower case only with the key */	TokenNameCOMMENT_JAVADOC	 true if the search for an object is lower case only with the key 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
m_lowerCaseOnly	TokenNameIdentifier	 m lower Case Only
;	TokenNameSEMICOLON	
/** * Construct the trie that has a case insensitive search. */	TokenNameCOMMENT_JAVADOC	 Construct the trie that has a case insensitive search. 
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_Root	TokenNameIdentifier	 m  Root
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_lowerCaseOnly	TokenNameIdentifier	 m lower Case Only
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct the trie given the desired case sensitivity with the key. * @param lowerCaseOnly true if the search keys are to be loser case only, * not case insensitive. */	TokenNameCOMMENT_JAVADOC	 Construct the trie given the desired case sensitivity with the key. @param lowerCaseOnly true if the search keys are to be loser case only, not case insensitive. 
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
boolean	TokenNameboolean	
lowerCaseOnly	TokenNameIdentifier	 lower Case Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_Root	TokenNameIdentifier	 m  Root
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_lowerCaseOnly	TokenNameIdentifier	 m lower Case Only
=	TokenNameEQUAL	
lowerCaseOnly	TokenNameIdentifier	 lower Case Only
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Put an object into the trie for lookup. * * @param key must be a 7-bit ASCII string * @param value any java object. * * @return The old object that matched key, or null. */	TokenNameCOMMENT_JAVADOC	 Put an object into the trie for lookup. * @param key must be a 7-bit ASCII string @param value any java object. * @return The old object that matched key, or null. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
m_charBuffer	TokenNameIdentifier	 m char Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make the biggest buffer ever needed in get(String) 	TokenNameCOMMENT_LINE	make the biggest buffer ever needed in get(String) 
m_charBuffer	TokenNameIdentifier	 m char Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_Root	TokenNameIdentifier	 m  Root
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_nextChar	TokenNameIdentifier	 m next Char
[	TokenNameLBRACKET	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lowerCaseOnly	TokenNameIdentifier	 m lower Case Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// put this value into the tree only with a lower case key 	TokenNameCOMMENT_LINE	put this value into the tree only with a lower case key 
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_nextChar	TokenNameIdentifier	 m next Char
[	TokenNameLBRACKET	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// put this value into the tree with a case insensitive key 	TokenNameCOMMENT_LINE	put this value into the tree with a case insensitive key 
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_nextChar	TokenNameIdentifier	 m next Char
[	TokenNameLBRACKET	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_nextChar	TokenNameIdentifier	 m next Char
[	TokenNameLBRACKET	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_Value	TokenNameIdentifier	 m  Value
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_Value	TokenNameIdentifier	 m  Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an object that matches the key. * * @param key must be a 7-bit ASCII string * * @return The object that matches the key, or null. */	TokenNameCOMMENT_JAVADOC	 Get an object that matches the key. * @param key must be a 7-bit ASCII string * @return The object that matches the key, or null. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* If the name is too long, we won't find it, this also keeps us * from overflowing m_charBuffer */	TokenNameCOMMENT_BLOCK	 If the name is too long, we won't find it, this also keeps us from overflowing m_charBuffer 
if	TokenNameif	
(	TokenNameLPAREN	
m_charBuffer	TokenNameIdentifier	 m char Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_Root	TokenNameIdentifier	 m  Root
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
// optimize the look up based on the number of chars 	TokenNameCOMMENT_LINE	optimize the look up based on the number of chars 
{	TokenNameLBRACE	
// case 0 looks silly, but the generated bytecode runs 	TokenNameCOMMENT_LINE	case 0 looks silly, but the generated bytecode runs 
// faster for lookup of elements of length 2 with this in 	TokenNameCOMMENT_LINE	faster for lookup of elements of length 2 with this in 
// and a fair bit faster. Don't know why. 	TokenNameCOMMENT_LINE	and a fair bit faster. Don't know why. 
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
ALPHA_SIZE	TokenNameIdentifier	 ALPHA  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_nextChar	TokenNameIdentifier	 m next Char
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_Value	TokenNameIdentifier	 m  Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// comment out case 2 because the default is faster 	TokenNameCOMMENT_LINE	comment out case 2 because the default is faster 
// case 2 : 	TokenNameCOMMENT_LINE	case 2 : 
// { 	TokenNameCOMMENT_LINE	{ 
// final char ch0 = key.charAt(0); 	TokenNameCOMMENT_LINE	final char ch0 = key.charAt(0); 
// final char ch1 = key.charAt(1); 	TokenNameCOMMENT_LINE	final char ch1 = key.charAt(1); 
// if (ch0 < ALPHA_SIZE && ch1 < ALPHA_SIZE) 	TokenNameCOMMENT_LINE	if (ch0 < ALPHA_SIZE && ch1 < ALPHA_SIZE) 
// { 	TokenNameCOMMENT_LINE	{ 
// node = node.m_nextChar[ch0]; 	TokenNameCOMMENT_LINE	node = node.m_nextChar[ch0]; 
// if (node != null) 	TokenNameCOMMENT_LINE	if (node != null) 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// if (ch1 < ALPHA_SIZE) 	TokenNameCOMMENT_LINE	if (ch1 < ALPHA_SIZE) 
// { 	TokenNameCOMMENT_LINE	{ 
// node = node.m_nextChar[ch1]; 	TokenNameCOMMENT_LINE	node = node.m_nextChar[ch1]; 
// if (node != null) 	TokenNameCOMMENT_LINE	if (node != null) 
// return node.m_Value; 	TokenNameCOMMENT_LINE	return node.m_Value; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// return null; 	TokenNameCOMMENT_LINE	return null; 
// } 	TokenNameCOMMENT_LINE	} 
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A thread-safe way to loop over the characters 	TokenNameCOMMENT_LINE	A thread-safe way to loop over the characters 
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ALPHA_SIZE	TokenNameIdentifier	 ALPHA  SIZE
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the key is not 7-bit ASCII so we won't find it here 	TokenNameCOMMENT_LINE	the key is not 7-bit ASCII so we won't find it here 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_nextChar	TokenNameIdentifier	 m next Char
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_Value	TokenNameIdentifier	 m  Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The node representation for the trie. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 The node representation for the trie. @xsl.usage internal 
private	TokenNameprivate	
class	TokenNameclass	
Node	TokenNameIdentifier	 Node
{	TokenNameLBRACE	
/** * Constructor, creates a Node[ALPHA_SIZE]. */	TokenNameCOMMENT_JAVADOC	 Constructor, creates a Node[ALPHA_SIZE]. 
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nextChar	TokenNameIdentifier	 m next Char
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
ALPHA_SIZE	TokenNameIdentifier	 ALPHA  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_Value	TokenNameIdentifier	 m  Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The next nodes. */	TokenNameCOMMENT_JAVADOC	 The next nodes. 
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
m_nextChar	TokenNameIdentifier	 m next Char
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** The value. */	TokenNameCOMMENT_JAVADOC	 The value. 
Object	TokenNameIdentifier	 Object
m_Value	TokenNameIdentifier	 m  Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct the trie from another Trie. * Both the existing Trie and this new one share the same table for * lookup, and it is assumed that the table is fully populated and * not changing anymore. * * @param existingTrie the Trie that this one is a copy of. */	TokenNameCOMMENT_JAVADOC	 Construct the trie from another Trie. Both the existing Trie and this new one share the same table for lookup, and it is assumed that the table is fully populated and not changing anymore. * @param existingTrie the Trie that this one is a copy of. 
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
Trie	TokenNameIdentifier	 Trie
existingTrie	TokenNameIdentifier	 existing Trie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// copy some fields from the existing Trie into this one. 	TokenNameCOMMENT_LINE	copy some fields from the existing Trie into this one. 
m_Root	TokenNameIdentifier	 m  Root
=	TokenNameEQUAL	
existingTrie	TokenNameIdentifier	 existing Trie
.	TokenNameDOT	
m_Root	TokenNameIdentifier	 m  Root
;	TokenNameSEMICOLON	
m_lowerCaseOnly	TokenNameIdentifier	 m lower Case Only
=	TokenNameEQUAL	
existingTrie	TokenNameIdentifier	 existing Trie
.	TokenNameDOT	
m_lowerCaseOnly	TokenNameIdentifier	 m lower Case Only
;	TokenNameSEMICOLON	
// get a buffer just big enough to hold the longest key in the table. 	TokenNameCOMMENT_LINE	get a buffer just big enough to hold the longest key in the table. 
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
existingTrie	TokenNameIdentifier	 existing Trie
.	TokenNameDOT	
getLongestKeyLength	TokenNameIdentifier	 get Longest Key Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_charBuffer	TokenNameIdentifier	 m char Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
max	TokenNameIdentifier	 max
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an object that matches the key. * This method is faster than get(), but is not thread-safe. * * @param key must be a 7-bit ASCII string * * @return The object that matches the key, or null. */	TokenNameCOMMENT_JAVADOC	 Get an object that matches the key. This method is faster than get(), but is not thread-safe. * @param key must be a 7-bit ASCII string * @return The object that matches the key, or null. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get2	TokenNameIdentifier	 get2
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* If the name is too long, we won't find it, this also keeps us * from overflowing m_charBuffer */	TokenNameCOMMENT_BLOCK	 If the name is too long, we won't find it, this also keeps us from overflowing m_charBuffer 
if	TokenNameif	
(	TokenNameLPAREN	
m_charBuffer	TokenNameIdentifier	 m char Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_Root	TokenNameIdentifier	 m  Root
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
// optimize the look up based on the number of chars 	TokenNameCOMMENT_LINE	optimize the look up based on the number of chars 
{	TokenNameLBRACE	
// case 0 looks silly, but the generated bytecode runs 	TokenNameCOMMENT_LINE	case 0 looks silly, but the generated bytecode runs 
// faster for lookup of elements of length 2 with this in 	TokenNameCOMMENT_LINE	faster for lookup of elements of length 2 with this in 
// and a fair bit faster. Don't know why. 	TokenNameCOMMENT_LINE	and a fair bit faster. Don't know why. 
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
ALPHA_SIZE	TokenNameIdentifier	 ALPHA  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_nextChar	TokenNameIdentifier	 m next Char
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_Value	TokenNameIdentifier	 m  Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
/* Copy string into array. This is not thread-safe because * it modifies the contents of m_charBuffer. If multiple * threads were to use this Trie they all would be * using this same array (not good). So this * method is not thread-safe, but it is faster because * converting to a char[] and looping over elements of * the array is faster than a String's charAt(i). */	TokenNameCOMMENT_BLOCK	 Copy string into array. This is not thread-safe because it modifies the contents of m_charBuffer. If multiple threads were to use this Trie they all would be using this same array (not good). So this method is not thread-safe, but it is faster because converting to a char[] and looping over elements of the array is faster than a String's charAt(i). 
key	TokenNameIdentifier	 key
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
m_charBuffer	TokenNameIdentifier	 m char Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
m_charBuffer	TokenNameIdentifier	 m char Buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ALPHA_SIZE	TokenNameIdentifier	 ALPHA  SIZE
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the key is not 7-bit ASCII so we won't find it here 	TokenNameCOMMENT_LINE	the key is not 7-bit ASCII so we won't find it here 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_nextChar	TokenNameIdentifier	 m next Char
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
m_Value	TokenNameIdentifier	 m  Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the length of the longest key used in the table. */	TokenNameCOMMENT_JAVADOC	 Get the length of the longest key used in the table. 
public	TokenNamepublic	
int	TokenNameint	
getLongestKeyLength	TokenNameIdentifier	 get Longest Key Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_charBuffer	TokenNameIdentifier	 m char Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
