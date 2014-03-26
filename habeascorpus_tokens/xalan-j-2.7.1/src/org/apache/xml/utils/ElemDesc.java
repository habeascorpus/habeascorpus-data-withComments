/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemDesc.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemDesc.java 468655 2006-10-28 07:12:06Z minchau $ 
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
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
/** * This class is in support of SerializerToHTML, and acts as a sort * of element representative for HTML elements. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class is in support of SerializerToHTML, and acts as a sort of element representative for HTML elements. @xsl.usage internal 
class	TokenNameclass	
ElemDesc	TokenNameIdentifier	 Elem Desc
{	TokenNameLBRACE	
/** Table of attributes for the element */	TokenNameCOMMENT_JAVADOC	 Table of attributes for the element 
Hashtable	TokenNameIdentifier	 Hashtable
m_attrs	TokenNameIdentifier	 m attrs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Element's flags, describing the role this element plays during * formatting of the document. This is used as a bitvector; more than one flag * may be set at a time, bitwise-ORed together. Mnemonic and bits * have been assigned to the flag values. NOTE: Some bits are * currently assigned multiple mnemonics; it is the caller's * responsibility to disambiguate these if necessary. */	TokenNameCOMMENT_JAVADOC	 Element's flags, describing the role this element plays during formatting of the document. This is used as a bitvector; more than one flag may be set at a time, bitwise-ORed together. Mnemonic and bits have been assigned to the flag values. NOTE: Some bits are currently assigned multiple mnemonics; it is the caller's responsibility to disambiguate these if necessary. 
int	TokenNameint	
m_flags	TokenNameIdentifier	 m flags
;	TokenNameSEMICOLON	
/** Defines mnemonic and bit-value for the EMPTY flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the EMPTY flag 
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
/** Defines mnemonic and bit-value for the FLOW flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the FLOW flag 
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
/** Defines mnemonic and bit-value for the BLOCK flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the BLOCK flag 
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
/** Defines mnemonic and bit-value for the BLOCKFORM flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the BLOCKFORM flag 
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
/** Defines mnemonic and bit-value for the BLOCKFORMFIELDSET flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the BLOCKFORMFIELDSET flag 
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
/** Defines mnemonic and bit-value for the CDATA flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the CDATA flag 
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
/** Defines mnemonic and bit-value for the PCDATA flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the PCDATA flag 
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
/** Defines mnemonic and bit-value for the RAW flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the RAW flag 
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
/** Defines mnemonic and bit-value for the INLINE flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the INLINE flag 
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
/** Defines mnemonic and bit-value for the INLINEA flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the INLINEA flag 
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
/** Defines mnemonic and bit-value for the INLINELABEL flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the INLINELABEL flag 
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
/** Defines mnemonic and bit-value for the FONTSTYLE flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the FONTSTYLE flag 
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
/** Defines mnemonic and bit-value for the PHRASE flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the PHRASE flag 
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
/** Defines mnemonic and bit-value for the FORMCTRL flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the FORMCTRL flag 
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
/** Defines mnemonic and bit-value for the SPECIAL flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the SPECIAL flag 
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
/** Defines mnemonic and bit-value for the ASPECIAL flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the ASPECIAL flag 
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
/** Defines mnemonic and bit-value for the HEADMISC flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the HEADMISC flag 
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
/** Defines mnemonic and bit-value for the HEAD flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the HEAD flag 
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
/** Defines mnemonic and bit-value for the LIST flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the LIST flag 
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
/** Defines mnemonic and bit-value for the PREFORMATTED flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the PREFORMATTED flag 
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
/** Defines mnemonic and bit-value for the WHITESPACESENSITIVE flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the WHITESPACESENSITIVE flag 
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
/** Defines mnemonic and bit-value for the ATTRURL flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the ATTRURL flag 
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
/** Defines mnemonic and bit-value for the ATTREMPTY flag */	TokenNameCOMMENT_JAVADOC	 Defines mnemonic and bit-value for the ATTREMPTY flag 
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
/** * Construct an ElementDescription with an initial set of flags. * * @param flags Element flags * @see m_flags */	TokenNameCOMMENT_JAVADOC	 Construct an ElementDescription with an initial set of flags. * @param flags Element flags @see m_flags 
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
/** * "is (this element described by these flags)". * * This might more properly be called areFlagsSet(). It accepts an * integer (being used as a bitvector) and checks whether all the * corresponding bits are set in our internal flags. Note that this * test is performed as a bitwise AND, not an equality test, so a * 0 bit in the input means "don't test", not "must be set false". * * @param flags Vector of flags to compare against this element's flags * * @return true if the flags set in the parameter are also set in the * element's stored flags. * * @see m_flags * @see isAttrFlagSet */	TokenNameCOMMENT_JAVADOC	 "is (this element described by these flags)". * This might more properly be called areFlagsSet(). It accepts an integer (being used as a bitvector) and checks whether all the corresponding bits are set in our internal flags. Note that this test is performed as a bitwise AND, not an equality test, so a 0 bit in the input means "don't test", not "must be set false". * @param flags Vector of flags to compare against this element's flags * @return true if the flags set in the parameter are also set in the element's stored flags. * @see m_flags @see isAttrFlagSet 
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
/** * Set a new attribute for this element * * * @param name Attribute name * @param flags Attibute flags */	TokenNameCOMMENT_JAVADOC	 Set a new attribute for this element * @param name Attribute name @param flags Attibute flags 
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
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out if a flag is set in a given attribute of this element * * * @param name Attribute name * @param flags Flag to check * * @return True if the flag is set in the attribute. Returns false * if the attribute is not found * @see m_flags */	TokenNameCOMMENT_JAVADOC	 Find out if a flag is set in a given attribute of this element * @param name Attribute name @param flags Flag to check * @return True if the flag is set in the attribute. Returns false if the attribute is not found @see m_flags 
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_attrs	TokenNameIdentifier	 m attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
_flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
m_attrs	TokenNameIdentifier	 m attrs
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
_flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
