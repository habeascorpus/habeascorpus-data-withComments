/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
/** * This class provides support for XML features. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: XMLSupport.java 476924 2006-11-19 21:13:26Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides support for XML features. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: XMLSupport.java 476924 2006-11-19 21:13:26Z dvholten $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
XMLSupport	TokenNameIdentifier	 XML Support
implements	TokenNameimplements	
XMLConstants	TokenNameIdentifier	 XML Constants
{	TokenNameLBRACE	
/** * This class does not need to be instanciated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instanciated. 
private	TokenNameprivate	
XMLSupport	TokenNameIdentifier	 XML Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the xml:lang attribute value of the given element. */	TokenNameCOMMENT_JAVADOC	 Returns the xml:lang attribute value of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXMLLang	TokenNameIdentifier	 get XML Lang
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
,	TokenNameCOMMA	
"lang"	TokenNameStringLiteral	lang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
,	TokenNameCOMMA	
"lang"	TokenNameStringLiteral	lang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
"en"	TokenNameStringLiteral	en
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the xml:space attribute value of the given element. */	TokenNameCOMMENT_JAVADOC	 Returns the xml:space attribute value of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXMLSpace	TokenNameIdentifier	 get XML Space
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
,	TokenNameCOMMA	
"space"	TokenNameStringLiteral	space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
,	TokenNameCOMMA	
"space"	TokenNameStringLiteral	space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
"default"	TokenNameStringLiteral	default
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Strips the white spaces in the given string according to the xml:space * attribute recommended behaviour when it has the 'default' value. */	TokenNameCOMMENT_JAVADOC	 Strips the white spaces in the given string according to the xml:space attribute recommended behaviour when it has the 'default' value. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
defaultXMLSpace	TokenNameIdentifier	 default XML Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nChars	TokenNameIdentifier	 n Chars
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
nChars	TokenNameIdentifier	 n Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
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
nChars	TokenNameIdentifier	 n Chars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
10	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// fallthrough is intended 	TokenNameCOMMENT_LINE	fallthrough is intended 
case	TokenNamecase	
13	TokenNameIntegerLiteral	
:	TokenNameCOLON	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// fallthrough is intended 	TokenNameCOMMENT_LINE	fallthrough is intended 
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Strips the white spaces in the given string according to the xml:space * attribute recommended behaviour when it has the 'preserve' value. */	TokenNameCOMMENT_JAVADOC	 Strips the white spaces in the given string according to the xml:space attribute recommended behaviour when it has the 'preserve' value. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
preserveXMLSpace	TokenNameIdentifier	 preserve XML Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nChars	TokenNameIdentifier	 n Chars
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
nChars	TokenNameIdentifier	 n Chars
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
data	TokenNameIdentifier	 data
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
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
10	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// fallthrough is intended 	TokenNameCOMMENT_LINE	fallthrough is intended 
case	TokenNamecase	
13	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
