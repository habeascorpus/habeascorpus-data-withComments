/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Aug 21, 2000: 	TokenNameCOMMENT_LINE	Aug 21, 2000: 
// Fixed bug in isElement and made HTMLdtd public. 	TokenNameCOMMENT_LINE	Fixed bug in isElement and made HTMLdtd public. 
// Contributed by Eric SCHAEFFER" <eschaeffer@posterconseil.com> 	TokenNameCOMMENT_LINE	Contributed by Eric SCHAEFFER" <eschaeffer@posterconseil.com> 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
;	TokenNameSEMICOLON	
/** * Utility class for accessing information specific to HTML documents. * The HTML DTD is expressed as three utility function groups. Two methods * allow for checking whether an element requires an open tag on printing * ({@link #isEmptyTag}) or on parsing ({@link #isOptionalClosing}). * <P> * Two other methods translate character references from name to value and * from value to name. A small entities resource is loaded into memory the * first time any of these methods is called for fast and efficient access. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use JAXP's Transformation API for XML (TrAX) for * serializing HTML. See the Xerces documentation for more information. * @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> */	TokenNameCOMMENT_JAVADOC	 Utility class for accessing information specific to HTML documents. The HTML DTD is expressed as three utility function groups. Two methods allow for checking whether an element requires an open tag on printing ({@link #isEmptyTag}) or on parsing ({@link #isOptionalClosing}). <P> Two other methods translate character references from name to value and from value to name. A small entities resource is loaded into memory the first time any of these methods is called for fast and efficient access. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use JAXP's Transformation API for XML (TrAX) for serializing HTML. See the Xerces documentation for more information. @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
{	TokenNameLBRACE	
/** * Public identifier for HTML 4.01 (Strict) document type. */	TokenNameCOMMENT_JAVADOC	 Public identifier for HTML 4.01 (Strict) document type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTMLPublicId	TokenNameIdentifier	 HTML Public Id
=	TokenNameEQUAL	
"-//W3C//DTD HTML 4.01//EN"	TokenNameStringLiteral	-//W3C//DTD HTML 4.01//EN
;	TokenNameSEMICOLON	
/** * System identifier for HTML 4.01 (Strict) document type. */	TokenNameCOMMENT_JAVADOC	 System identifier for HTML 4.01 (Strict) document type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTMLSystemId	TokenNameIdentifier	 HTML System Id
=	TokenNameEQUAL	
"http://www.w3.org/TR/html4/strict.dtd"	TokenNameStringLiteral	http://www.w3.org/TR/html4/strict.dtd
;	TokenNameSEMICOLON	
/** * Public identifier for XHTML 1.0 (Strict) document type. */	TokenNameCOMMENT_JAVADOC	 Public identifier for XHTML 1.0 (Strict) document type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XHTMLPublicId	TokenNameIdentifier	 XHTML Public Id
=	TokenNameEQUAL	
"-//W3C//DTD XHTML 1.0 Strict//EN"	TokenNameStringLiteral	-//W3C//DTD XHTML 1.0 Strict//EN
;	TokenNameSEMICOLON	
/** * System identifier for XHTML 1.0 (Strict) document type. */	TokenNameCOMMENT_JAVADOC	 System identifier for XHTML 1.0 (Strict) document type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XHTMLSystemId	TokenNameIdentifier	 XHTML System Id
=	TokenNameEQUAL	
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"	TokenNameStringLiteral	http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd
;	TokenNameSEMICOLON	
/** * Table of reverse character reference mapping. Character codes are held * as single-character strings, mapped to their reference name. */	TokenNameCOMMENT_JAVADOC	 Table of reverse character reference mapping. Character codes are held as single-character strings, mapped to their reference name. 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
_byChar	TokenNameIdentifier	 by Char
;	TokenNameSEMICOLON	
/** * Table of entity name to value mapping. Entities are held as strings, * character references as <TT>Character</TT> objects. */	TokenNameCOMMENT_JAVADOC	 Table of entity name to value mapping. Entities are held as strings, character references as <TT>Character</TT> objects. 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
_byName	TokenNameIdentifier	 by Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
_boolAttrs	TokenNameIdentifier	 bool Attrs
;	TokenNameSEMICOLON	
/** * Holds element definitions. */	TokenNameCOMMENT_JAVADOC	 Holds element definitions. 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
_elemDefs	TokenNameIdentifier	 elem Defs
;	TokenNameSEMICOLON	
/** * Locates the HTML entities file that is loaded upon initialization. * This file is a resource loaded with the default class loader. */	TokenNameCOMMENT_JAVADOC	 Locates the HTML entities file that is loaded upon initialization. This file is a resource loaded with the default class loader. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITIES_RESOURCE	TokenNameIdentifier	 ENTITIES  RESOURCE
=	TokenNameEQUAL	
"HTMLEntities.res"	TokenNameStringLiteral	HTMLEntities.res
;	TokenNameSEMICOLON	
/** * Only opening tag should be printed. */	TokenNameCOMMENT_JAVADOC	 Only opening tag should be printed. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ONLY_OPENING	TokenNameIdentifier	 ONLY  OPENING
=	TokenNameEQUAL	
0x0001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Element contains element content only. */	TokenNameCOMMENT_JAVADOC	 Element contains element content only. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
=	TokenNameEQUAL	
0x0002	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Element preserve spaces. */	TokenNameCOMMENT_JAVADOC	 Element preserve spaces. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PRESERVE	TokenNameIdentifier	 PRESERVE
=	TokenNameEQUAL	
0x0004	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Optional closing tag. */	TokenNameCOMMENT_JAVADOC	 Optional closing tag. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
=	TokenNameEQUAL	
0x0008	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Element is empty (also means only opening tag) */	TokenNameCOMMENT_JAVADOC	 Element is empty (also means only opening tag) 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EMPTY	TokenNameIdentifier	 EMPTY
=	TokenNameEQUAL	
0x0010	TokenNameIntegerLiteral	
|	TokenNameOR	
ONLY_OPENING	TokenNameIdentifier	 ONLY  OPENING
;	TokenNameSEMICOLON	
/** * Allowed to appear in head. */	TokenNameCOMMENT_JAVADOC	 Allowed to appear in head. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
=	TokenNameEQUAL	
0x0020	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * When opened, closes P. */	TokenNameCOMMENT_JAVADOC	 When opened, closes P. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
=	TokenNameEQUAL	
0x0040	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * When opened, closes DD or DT. */	TokenNameCOMMENT_JAVADOC	 When opened, closes DD or DT. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLOSE_DD_DT	TokenNameIdentifier	 CLOSE  DD  DT
=	TokenNameEQUAL	
0x0080	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * When opened, closes itself. */	TokenNameCOMMENT_JAVADOC	 When opened, closes itself. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLOSE_SELF	TokenNameIdentifier	 CLOSE  SELF
=	TokenNameEQUAL	
0x0100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * When opened, closes another table section. */	TokenNameCOMMENT_JAVADOC	 When opened, closes another table section. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLOSE_TABLE	TokenNameIdentifier	 CLOSE  TABLE
=	TokenNameEQUAL	
0x0200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * When opened, closes TH or TD. */	TokenNameCOMMENT_JAVADOC	 When opened, closes TH or TD. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLOSE_TH_TD	TokenNameIdentifier	 CLOSE  TH  TD
=	TokenNameEQUAL	
0x04000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Returns true if element is declared to be empty. HTML elements are * defines as empty in the DTD, not by the document syntax. * * @param tagName The element tag name (upper case) * @return True if element is empty */	TokenNameCOMMENT_JAVADOC	 Returns true if element is declared to be empty. HTML elements are defines as empty in the DTD, not by the document syntax. * @param tagName The element tag name (upper case) @return True if element is empty 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isEmptyTag	TokenNameIdentifier	 is Empty Tag
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if element is declared to have element content. * Whitespaces appearing inside element content will be ignored, * other text will simply report an error. * * @param tagName The element tag name (upper case) * @return True if element content */	TokenNameCOMMENT_JAVADOC	 Returns true if element is declared to have element content. Whitespaces appearing inside element content will be ignored, other text will simply report an error. * @param tagName The element tag name (upper case) @return True if element content 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isElementContent	TokenNameIdentifier	 is Element Content
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if element's textual contents preserves spaces. * This only applies to PRE and TEXTAREA, all other HTML elements * do not preserve space. * * @param tagName The element tag name (upper case) * @return True if element's text content preserves spaces */	TokenNameCOMMENT_JAVADOC	 Returns true if element's textual contents preserves spaces. This only applies to PRE and TEXTAREA, all other HTML elements do not preserve space. * @param tagName The element tag name (upper case) @return True if element's text content preserves spaces 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isPreserveSpace	TokenNameIdentifier	 is Preserve Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
PRESERVE	TokenNameIdentifier	 PRESERVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if element's closing tag is optional and need not * exist. An error will not be reported for such elements if they * are not closed. For example, <tt>LI</tt> is most often not closed. * * @param tagName The element tag name (upper case) * @return True if closing tag implied */	TokenNameCOMMENT_JAVADOC	 Returns true if element's closing tag is optional and need not exist. An error will not be reported for such elements if they are not closed. For example, <tt>LI</tt> is most often not closed. * @param tagName The element tag name (upper case) @return True if closing tag implied 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isOptionalClosing	TokenNameIdentifier	 is Optional Closing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if element's closing tag is generally not printed. * For example, <tt>LI</tt> should not print the closing tag. * * @param tagName The element tag name (upper case) * @return True if only opening tag should be printed */	TokenNameCOMMENT_JAVADOC	 Returns true if element's closing tag is generally not printed. For example, <tt>LI</tt> should not print the closing tag. * @param tagName The element tag name (upper case) @return True if only opening tag should be printed 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isOnlyOpening	TokenNameIdentifier	 is Only Opening
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
ONLY_OPENING	TokenNameIdentifier	 ONLY  OPENING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the opening of one element (<tt>tagName</tt>) implies * the closing of another open element (<tt>openTag</tt>). For example, * every opening <tt>LI</tt> will close the previously open <tt>LI</tt>, * and every opening <tt>BODY</tt> will close the previously open <tt>HEAD</tt>. * * @param tagName The newly opened element * @param openTag The already opened element * @return True if closing tag closes opening tag */	TokenNameCOMMENT_JAVADOC	 Returns true if the opening of one element (<tt>tagName</tt>) implies the closing of another open element (<tt>openTag</tt>). For example, every opening <tt>LI</tt> will close the previously open <tt>LI</tt>, and every opening <tt>BODY</tt> will close the previously open <tt>HEAD</tt>. * @param tagName The newly opened element @param openTag The already opened element @return True if closing tag closes opening tag 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isClosing	TokenNameIdentifier	 is Closing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
openTag	TokenNameIdentifier	 open Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Several elements are defined as closing the HEAD 	TokenNameCOMMENT_LINE	Several elements are defined as closing the HEAD 
if	TokenNameif	
(	TokenNameLPAREN	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"HEAD"	TokenNameStringLiteral	HEAD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
!	TokenNameNOT	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// P closes iteself 	TokenNameCOMMENT_LINE	P closes iteself 
if	TokenNameif	
(	TokenNameLPAREN	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"P"	TokenNameStringLiteral	P
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// DT closes DD, DD closes DT 	TokenNameCOMMENT_LINE	DT closes DD, DD closes DT 
if	TokenNameif	
(	TokenNameLPAREN	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"DT"	TokenNameStringLiteral	DT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"DD"	TokenNameStringLiteral	DD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
CLOSE_DD_DT	TokenNameIdentifier	 CLOSE  DD  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// LI and OPTION close themselves 	TokenNameCOMMENT_LINE	LI and OPTION close themselves 
if	TokenNameif	
(	TokenNameLPAREN	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"LI"	TokenNameStringLiteral	LI
)	TokenNameRPAREN	
||	TokenNameOR_OR	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"OPTION"	TokenNameStringLiteral	OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
CLOSE_SELF	TokenNameIdentifier	 CLOSE  SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Each of these table sections closes all the others 	TokenNameCOMMENT_LINE	Each of these table sections closes all the others 
if	TokenNameif	
(	TokenNameLPAREN	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"THEAD"	TokenNameStringLiteral	THEAD
)	TokenNameRPAREN	
||	TokenNameOR_OR	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"TFOOT"	TokenNameStringLiteral	TFOOT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"TBODY"	TokenNameStringLiteral	TBODY
)	TokenNameRPAREN	
||	TokenNameOR_OR	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"TR"	TokenNameStringLiteral	TR
)	TokenNameRPAREN	
||	TokenNameOR_OR	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"COLGROUP"	TokenNameStringLiteral	COLGROUP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
CLOSE_TABLE	TokenNameIdentifier	 CLOSE  TABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TD closes TH and TH closes TD 	TokenNameCOMMENT_LINE	TD closes TH and TH closes TD 
if	TokenNameif	
(	TokenNameLPAREN	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"TH"	TokenNameStringLiteral	TH
)	TokenNameRPAREN	
||	TokenNameOR_OR	
openTag	TokenNameIdentifier	 open Tag
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"TD"	TokenNameStringLiteral	TD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
CLOSE_TH_TD	TokenNameIdentifier	 CLOSE  TH  TD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the specified attribute it a URI and should be * escaped appropriately. In HTML URIs are escaped differently * than normal attributes. * * @param tagName The element's tag name * @param attrName The attribute's name */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified attribute it a URI and should be escaped appropriately. In HTML URIs are escaped differently than normal attributes. * @param tagName The element's tag name @param attrName The attribute's name 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isURI	TokenNameIdentifier	 is URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Stupid checks. 	TokenNameCOMMENT_LINE	Stupid checks. 
return	TokenNamereturn	
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"href"	TokenNameStringLiteral	href
)	TokenNameRPAREN	
||	TokenNameOR_OR	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"src"	TokenNameStringLiteral	src
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the specified attribute is a boolean and should be * printed without the value. This applies to attributes that are true * if they exist, such as selected (OPTION/INPUT). * * @param tagName The element's tag name * @param attrName The attribute's name */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified attribute is a boolean and should be printed without the value. This applies to attributes that are true if they exist, such as selected (OPTION/INPUT). * @param tagName The element's tag name @param attrName The attribute's name 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isBoolean	TokenNameIdentifier	 is Boolean
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrNames	TokenNameIdentifier	 attr Names
;	TokenNameSEMICOLON	
attrNames	TokenNameIdentifier	 attr Names
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
_boolAttrs	TokenNameIdentifier	 bool Attrs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrNames	TokenNameIdentifier	 attr Names
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
attrNames	TokenNameIdentifier	 attr Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
attrNames	TokenNameIdentifier	 attr Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of an HTML character reference by its name. If the * reference is not found or was not defined as a character reference, * returns EOF (-1). * * @param name Name of character reference * @return Character code or EOF (-1) */	TokenNameCOMMENT_JAVADOC	 Returns the value of an HTML character reference by its name. If the reference is not found or was not defined as a character reference, returns EOF (-1). * @param name Name of character reference @return Character code or EOF (-1) 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
charFromName	TokenNameIdentifier	 char From Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
_byName	TokenNameIdentifier	 by Name
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the name of an HTML character reference based on its character * value. Only valid for entities defined from character references. If no * such character value was defined, return null. * * @param value Character value of entity * @return Entity's name or null */	TokenNameCOMMENT_JAVADOC	 Returns the name of an HTML character reference based on its character value. Only valid for entities defined from character references. If no such character value was defined, return null. * @param value Character value of entity @return Entity's name or null 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fromChar	TokenNameIdentifier	 from Char
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
>	TokenNameGREATER	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_byChar	TokenNameIdentifier	 by Char
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize upon first access. Will load all the HTML character references * into a list that is accessible by name or character value and is optimized * for character substitution. This method may be called any number of times * but will execute only once. */	TokenNameCOMMENT_JAVADOC	 Initialize upon first access. Will load all the HTML character references into a list that is accessible by name or character value and is optimized for character substitution. This method may be called any number of times but will execute only once. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
int	TokenNameint	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
// Make sure not to initialize twice. 	TokenNameCOMMENT_LINE	Make sure not to initialize twice. 
if	TokenNameif	
(	TokenNameLPAREN	
_byName	TokenNameIdentifier	 by Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
_byName	TokenNameIdentifier	 by Name
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_byChar	TokenNameIdentifier	 by Char
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
ENTITIES_RESOURCE	TokenNameIdentifier	 ENTITIES  RESOURCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
,	TokenNameCOMMA	
"ResourceNotFound"	TokenNameStringLiteral	ResourceNotFound
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
ENTITIES_RESOURCE	TokenNameIdentifier	 ENTITIES  RESOURCE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineEntity	TokenNameIdentifier	 define Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
,	TokenNameCOMMA	
"ResourceNotLoaded"	TokenNameStringLiteral	ResourceNotLoaded
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
ENTITIES_RESOURCE	TokenNameIdentifier	 ENTITIES  RESOURCE
,	TokenNameCOMMA	
except	TokenNameIdentifier	 except
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Defines a new character reference. The reference's name and value are * supplied. Nothing happens if the character reference is already defined. * <P> * Unlike internal entities, character references are a string to single * character mapping. They are used to map non-ASCII characters both on * parsing and printing, primarily for HTML documents. '&lt;amp;' is an * example of a character reference. * * @param name The entity's name * @param value The entity's value */	TokenNameCOMMENT_JAVADOC	 Defines a new character reference. The reference's name and value are supplied. Nothing happens if the character reference is already defined. <P> Unlike internal entities, character references are a string to single character mapping. They are used to map non-ASCII characters both on parsing and printing, primarily for HTML documents. '&lt;amp;' is an example of a character reference. * @param name The entity's name @param value The entity's value 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
defineEntity	TokenNameIdentifier	 define Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
char	TokenNamechar	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_byName	TokenNameIdentifier	 by Name
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_byName	TokenNameIdentifier	 by Name
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_byChar	TokenNameIdentifier	 by Char
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_elemDefs	TokenNameIdentifier	 elem Defs
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
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attrName	TokenNameIdentifier	 attr Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrNames	TokenNameIdentifier	 attr Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_boolAttrs	TokenNameIdentifier	 bool Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
attrNames	TokenNameIdentifier	 attr Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
_elemDefs	TokenNameIdentifier	 elem Defs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
_elemDefs	TokenNameIdentifier	 elem Defs
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"ADDRESS"	TokenNameStringLiteral	ADDRESS
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"AREA"	TokenNameStringLiteral	AREA
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"BASE"	TokenNameStringLiteral	BASE
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"BASEFONT"	TokenNameStringLiteral	BASEFONT
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"BLOCKQUOTE"	TokenNameStringLiteral	BLOCKQUOTE
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"BODY"	TokenNameStringLiteral	BODY
,	TokenNameCOMMA	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"BR"	TokenNameStringLiteral	BR
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"COL"	TokenNameStringLiteral	COL
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"COLGROUP"	TokenNameStringLiteral	COLGROUP
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
CLOSE_TABLE	TokenNameIdentifier	 CLOSE  TABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"DD"	TokenNameStringLiteral	DD
,	TokenNameCOMMA	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
ONLY_OPENING	TokenNameIdentifier	 ONLY  OPENING
|	TokenNameOR	
CLOSE_DD_DT	TokenNameIdentifier	 CLOSE  DD  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"DIV"	TokenNameStringLiteral	DIV
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"DL"	TokenNameStringLiteral	DL
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"DT"	TokenNameStringLiteral	DT
,	TokenNameCOMMA	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
ONLY_OPENING	TokenNameIdentifier	 ONLY  OPENING
|	TokenNameOR	
CLOSE_DD_DT	TokenNameIdentifier	 CLOSE  DD  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"FIELDSET"	TokenNameStringLiteral	FIELDSET
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"FORM"	TokenNameStringLiteral	FORM
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"FRAME"	TokenNameStringLiteral	FRAME
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"H1"	TokenNameStringLiteral	H1
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"H2"	TokenNameStringLiteral	H2
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"H3"	TokenNameStringLiteral	H3
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"H4"	TokenNameStringLiteral	H4
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"H5"	TokenNameStringLiteral	H5
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"H6"	TokenNameStringLiteral	H6
,	TokenNameCOMMA	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"HEAD"	TokenNameStringLiteral	HEAD
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"HR"	TokenNameStringLiteral	HR
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"HTML"	TokenNameStringLiteral	HTML
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"IMG"	TokenNameStringLiteral	IMG
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"INPUT"	TokenNameStringLiteral	INPUT
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"ISINDEX"	TokenNameStringLiteral	ISINDEX
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"LI"	TokenNameStringLiteral	LI
,	TokenNameCOMMA	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
ONLY_OPENING	TokenNameIdentifier	 ONLY  OPENING
|	TokenNameOR	
CLOSE_SELF	TokenNameIdentifier	 CLOSE  SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"LINK"	TokenNameStringLiteral	LINK
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"MAP"	TokenNameStringLiteral	MAP
,	TokenNameCOMMA	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"META"	TokenNameStringLiteral	META
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
|	TokenNameOR	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"OL"	TokenNameStringLiteral	OL
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"OPTGROUP"	TokenNameStringLiteral	OPTGROUP
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"OPTION"	TokenNameStringLiteral	OPTION
,	TokenNameCOMMA	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
ONLY_OPENING	TokenNameIdentifier	 ONLY  OPENING
|	TokenNameOR	
CLOSE_SELF	TokenNameIdentifier	 CLOSE  SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"P"	TokenNameStringLiteral	P
,	TokenNameCOMMA	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
|	TokenNameOR	
CLOSE_SELF	TokenNameIdentifier	 CLOSE  SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"PARAM"	TokenNameStringLiteral	PARAM
,	TokenNameCOMMA	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"PRE"	TokenNameStringLiteral	PRE
,	TokenNameCOMMA	
PRESERVE	TokenNameIdentifier	 PRESERVE
|	TokenNameOR	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"SCRIPT"	TokenNameStringLiteral	SCRIPT
,	TokenNameCOMMA	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
|	TokenNameOR	
PRESERVE	TokenNameIdentifier	 PRESERVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"NOSCRIPT"	TokenNameStringLiteral	NOSCRIPT
,	TokenNameCOMMA	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
|	TokenNameOR	
PRESERVE	TokenNameIdentifier	 PRESERVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"SELECT"	TokenNameStringLiteral	SELECT
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"STYLE"	TokenNameStringLiteral	STYLE
,	TokenNameCOMMA	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
|	TokenNameOR	
PRESERVE	TokenNameIdentifier	 PRESERVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"TABLE"	TokenNameStringLiteral	TABLE
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"TBODY"	TokenNameStringLiteral	TBODY
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
CLOSE_TABLE	TokenNameIdentifier	 CLOSE  TABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"TD"	TokenNameStringLiteral	TD
,	TokenNameCOMMA	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
CLOSE_TH_TD	TokenNameIdentifier	 CLOSE  TH  TD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"TEXTAREA"	TokenNameStringLiteral	TEXTAREA
,	TokenNameCOMMA	
PRESERVE	TokenNameIdentifier	 PRESERVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"TFOOT"	TokenNameStringLiteral	TFOOT
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
CLOSE_TABLE	TokenNameIdentifier	 CLOSE  TABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"TH"	TokenNameStringLiteral	TH
,	TokenNameCOMMA	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
CLOSE_TH_TD	TokenNameIdentifier	 CLOSE  TH  TD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"THEAD"	TokenNameStringLiteral	THEAD
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
CLOSE_TABLE	TokenNameIdentifier	 CLOSE  TABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"TITLE"	TokenNameStringLiteral	TITLE
,	TokenNameCOMMA	
ALLOWED_HEAD	TokenNameIdentifier	 ALLOWED  HEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"TR"	TokenNameStringLiteral	TR
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
OPT_CLOSING	TokenNameIdentifier	 OPT  CLOSING
|	TokenNameOR	
CLOSE_TABLE	TokenNameIdentifier	 CLOSE  TABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineElement	TokenNameIdentifier	 define Element
(	TokenNameLPAREN	
"UL"	TokenNameStringLiteral	UL
,	TokenNameCOMMA	
ELEM_CONTENT	TokenNameIdentifier	 ELEM  CONTENT
|	TokenNameOR	
CLOSE_P	TokenNameIdentifier	 CLOSE  P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_boolAttrs	TokenNameIdentifier	 bool Attrs
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"AREA"	TokenNameStringLiteral	AREA
,	TokenNameCOMMA	
"href"	TokenNameStringLiteral	href
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"BUTTON"	TokenNameStringLiteral	BUTTON
,	TokenNameCOMMA	
"disabled"	TokenNameStringLiteral	disabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"DIR"	TokenNameStringLiteral	DIR
,	TokenNameCOMMA	
"compact"	TokenNameStringLiteral	compact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"DL"	TokenNameStringLiteral	DL
,	TokenNameCOMMA	
"compact"	TokenNameStringLiteral	compact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"FRAME"	TokenNameStringLiteral	FRAME
,	TokenNameCOMMA	
"noresize"	TokenNameStringLiteral	noresize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"HR"	TokenNameStringLiteral	HR
,	TokenNameCOMMA	
"noshade"	TokenNameStringLiteral	noshade
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"IMAGE"	TokenNameStringLiteral	IMAGE
,	TokenNameCOMMA	
"ismap"	TokenNameStringLiteral	ismap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"INPUT"	TokenNameStringLiteral	INPUT
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"defaultchecked"	TokenNameStringLiteral	defaultchecked
,	TokenNameCOMMA	
"checked"	TokenNameStringLiteral	checked
,	TokenNameCOMMA	
"readonly"	TokenNameStringLiteral	readonly
,	TokenNameCOMMA	
"disabled"	TokenNameStringLiteral	disabled
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"LINK"	TokenNameStringLiteral	LINK
,	TokenNameCOMMA	
"link"	TokenNameStringLiteral	link
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"MENU"	TokenNameStringLiteral	MENU
,	TokenNameCOMMA	
"compact"	TokenNameStringLiteral	compact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"OBJECT"	TokenNameStringLiteral	OBJECT
,	TokenNameCOMMA	
"declare"	TokenNameStringLiteral	declare
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"OL"	TokenNameStringLiteral	OL
,	TokenNameCOMMA	
"compact"	TokenNameStringLiteral	compact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"OPTGROUP"	TokenNameStringLiteral	OPTGROUP
,	TokenNameCOMMA	
"disabled"	TokenNameStringLiteral	disabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"OPTION"	TokenNameStringLiteral	OPTION
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"default-selected"	TokenNameStringLiteral	default-selected
,	TokenNameCOMMA	
"selected"	TokenNameStringLiteral	selected
,	TokenNameCOMMA	
"disabled"	TokenNameStringLiteral	disabled
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"SCRIPT"	TokenNameStringLiteral	SCRIPT
,	TokenNameCOMMA	
"defer"	TokenNameStringLiteral	defer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"SELECT"	TokenNameStringLiteral	SELECT
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"multiple"	TokenNameStringLiteral	multiple
,	TokenNameCOMMA	
"disabled"	TokenNameStringLiteral	disabled
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"STYLE"	TokenNameStringLiteral	STYLE
,	TokenNameCOMMA	
"disabled"	TokenNameStringLiteral	disabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"TD"	TokenNameStringLiteral	TD
,	TokenNameCOMMA	
"nowrap"	TokenNameStringLiteral	nowrap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"TH"	TokenNameStringLiteral	TH
,	TokenNameCOMMA	
"nowrap"	TokenNameStringLiteral	nowrap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"TEXTAREA"	TokenNameStringLiteral	TEXTAREA
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"disabled"	TokenNameStringLiteral	disabled
,	TokenNameCOMMA	
"readonly"	TokenNameStringLiteral	readonly
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defineBoolean	TokenNameIdentifier	 define Boolean
(	TokenNameLPAREN	
"UL"	TokenNameStringLiteral	UL
,	TokenNameCOMMA	
"compact"	TokenNameStringLiteral	compact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
