/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemDesc.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemDesc.java 468654 2006-10-28 07:09:23Z minchau $ 
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
StringToIntTable	TokenNameIdentifier	 String To Int Table
;	TokenNameSEMICOLON	
/** * This class has a series of flags (bit values) that describe an HTML element * <p> * This class is not a public API. * It is public because it is used outside of this package. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class has a series of flags (bit values) that describe an HTML element <p> This class is not a public API. It is public because it is used outside of this package. * @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ElemDesc	TokenNameIdentifier	 Elem Desc
{	TokenNameLBRACE	
/** Bit flags to tell about this element type. */	TokenNameCOMMENT_JAVADOC	 Bit flags to tell about this element type. 
private	TokenNameprivate	
int	TokenNameint	
m_flags	TokenNameIdentifier	 m flags
;	TokenNameSEMICOLON	
/** * Table of attribute names to integers, which contain bit flags telling about * the attributes. */	TokenNameCOMMENT_JAVADOC	 Table of attribute names to integers, which contain bit flags telling about the attributes. 
private	TokenNameprivate	
StringToIntTable	TokenNameIdentifier	 String To Int Table
m_attrs	TokenNameIdentifier	 m attrs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Bit position if this element type is empty. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is empty. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EMPTY	TokenNameIdentifier	 EMPTY
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a flow. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a flow. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLOW	TokenNameIdentifier	 FLOW
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a block. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a block. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BLOCK	TokenNameIdentifier	 BLOCK
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a block form. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a block form. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BLOCKFORM	TokenNameIdentifier	 BLOCKFORM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a block form field set. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a block form field set. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BLOCKFORMFIELDSET	TokenNameIdentifier	 BLOCKFORMFIELDSET
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is CDATA. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is CDATA. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CDATA	TokenNameIdentifier	 CDATA
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is PCDATA. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is PCDATA. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PCDATA	TokenNameIdentifier	 PCDATA
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is should be raw characters. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is should be raw characters. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RAW	TokenNameIdentifier	 RAW
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type should be inlined. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type should be inlined. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INLINE	TokenNameIdentifier	 INLINE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is INLINEA. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is INLINEA. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INLINEA	TokenNameIdentifier	 INLINEA
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is an inline label. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is an inline label. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INLINELABEL	TokenNameIdentifier	 INLINELABEL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a font style. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a font style. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FONTSTYLE	TokenNameIdentifier	 FONTSTYLE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a phrase. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a phrase. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PHRASE	TokenNameIdentifier	 PHRASE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a form control. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a form control. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMCTRL	TokenNameIdentifier	 FORMCTRL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is ???. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is ???. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SPECIAL	TokenNameIdentifier	 SPECIAL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is ???. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is ???. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ASPECIAL	TokenNameIdentifier	 ASPECIAL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is an odd header element. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is an odd header element. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HEADMISC	TokenNameIdentifier	 HEADMISC
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a head element (i.e. H1, H2, etc.) */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a head element (i.e. H1, H2, etc.) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HEAD	TokenNameIdentifier	 HEAD
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a list. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a list. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LIST	TokenNameIdentifier	 LIST
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a preformatted type. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a preformatted type. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PREFORMATTED	TokenNameIdentifier	 PREFORMATTED
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is whitespace sensitive. */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is whitespace sensitive. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WHITESPACESENSITIVE	TokenNameIdentifier	 WHITESPACESENSITIVE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
21	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element type is a header element (i.e. HEAD). */	TokenNameCOMMENT_JAVADOC	 Bit position if this element type is a header element (i.e. HEAD). 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HEADELEM	TokenNameIdentifier	 HEADELEM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
22	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this element is the "HTML" element */	TokenNameCOMMENT_JAVADOC	 Bit position if this element is the "HTML" element 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HTMLELEM	TokenNameIdentifier	 HTMLELEM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this attribute type is a URL. */	TokenNameCOMMENT_JAVADOC	 Bit position if this attribute type is a URL. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ATTRURL	TokenNameIdentifier	 ATTRURL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bit position if this attribute type is an empty type. */	TokenNameCOMMENT_JAVADOC	 Bit position if this attribute type is an empty type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Construct an ElemDesc from a set of bit flags. * * * @param flags Bit flags that describe the basic properties of this element type. */	TokenNameCOMMENT_JAVADOC	 Construct an ElemDesc from a set of bit flags. * @param flags Bit flags that describe the basic properties of this element type. 
ElemDesc	TokenNameIdentifier	 Elem Desc
(	TokenNameLPAREN	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_flags	TokenNameIdentifier	 m flags
=	TokenNameEQUAL	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this element type has the basic bit properties that are passed * as an argument. * * @param flags Bit flags that describe the basic properties of interest. * * @return true if any of the flag bits are true. */	TokenNameCOMMENT_JAVADOC	 Tell if this element type has the basic bit properties that are passed as an argument. * @param flags Bit flags that describe the basic properties of interest. * @return true if any of the flag bits are true. 
private	TokenNameprivate	
boolean	TokenNameboolean	
is	TokenNameIdentifier	 is
(	TokenNameLPAREN	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// int which = (m_flags & flags); 	TokenNameCOMMENT_LINE	int which = (m_flags & flags); 
return	TokenNamereturn	
(	TokenNameLPAREN	
m_flags	TokenNameIdentifier	 m flags
&	TokenNameAND	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_flags	TokenNameIdentifier	 m flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an attribute name and it's bit properties. * * * @param name non-null name of attribute, in upper case. * @param flags flag bits. */	TokenNameCOMMENT_JAVADOC	 Set an attribute name and it's bit properties. * @param name non-null name of attribute, in upper case. @param flags flag bits. 
void	TokenNamevoid	
setAttr	TokenNameIdentifier	 set Attr
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_attrs	TokenNameIdentifier	 m attrs
)	TokenNameRPAREN	
m_attrs	TokenNameIdentifier	 m attrs
=	TokenNameEQUAL	
new	TokenNamenew	
StringToIntTable	TokenNameIdentifier	 String To Int Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if any of the bits of interest are set for a named attribute type. * * @param name non-null reference to attribute name, in any case. * @param flags flag mask. * * @return true if any of the flags are set for the named attribute. */	TokenNameCOMMENT_JAVADOC	 Tell if any of the bits of interest are set for a named attribute type. * @param name non-null reference to attribute name, in any case. @param flags flag mask. * @return true if any of the flags are set for the named attribute. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAttrFlagSet	TokenNameIdentifier	 is Attr Flag Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_attrs	TokenNameIdentifier	 m attrs
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
getIgnoreCase	TokenNameIdentifier	 get Ignore Case
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&	TokenNameAND	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
