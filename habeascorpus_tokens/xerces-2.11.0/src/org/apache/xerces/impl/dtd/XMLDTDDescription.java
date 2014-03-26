/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
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
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
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
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLInputSource	TokenNameIdentifier	 XML Input Source
;	TokenNameSEMICOLON	
/** * All information specific to DTD grammars. * * @xerces.internal * * @author Neil Graham, IBM * @version $Id: XMLDTDDescription.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 All information specific to DTD grammars. * @xerces.internal * @author Neil Graham, IBM @version $Id: XMLDTDDescription.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
extends	TokenNameextends	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
implements	TokenNameimplements	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
{	TokenNameLBRACE	
// Data 	TokenNameCOMMENT_LINE	Data 
// pieces of information needed to make this usable as a Grammar key 	TokenNameCOMMENT_LINE	pieces of information needed to make this usable as a Grammar key 
// if we know the root of this grammar, here's its name: 	TokenNameCOMMENT_LINE	if we know the root of this grammar, here's its name: 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fRootName	TokenNameIdentifier	 f Root Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// if we don't know the root name, this stores all elements that 	TokenNameCOMMENT_LINE	if we don't know the root name, this stores all elements that 
// could serve; fPossibleRoots and fRootName cannot both be non-null 	TokenNameCOMMENT_LINE	could serve; fPossibleRoots and fRootName cannot both be non-null 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
public	TokenNamepublic	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
(	TokenNameLPAREN	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rootName	TokenNameIdentifier	 root Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fRootName	TokenNameIdentifier	 f Root Name
=	TokenNameEQUAL	
rootName	TokenNameIdentifier	 root Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// init(XMLResourceIdentifier, String) 	TokenNameCOMMENT_LINE	init(XMLResourceIdentifier, String) 
public	TokenNamepublic	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
literalId	TokenNameIdentifier	 literal Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseId	TokenNameIdentifier	 base Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expandedId	TokenNameIdentifier	 expanded Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rootName	TokenNameIdentifier	 root Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
literalId	TokenNameIdentifier	 literal Id
,	TokenNameCOMMA	
baseId	TokenNameIdentifier	 base Id
,	TokenNameCOMMA	
expandedId	TokenNameIdentifier	 expanded Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fRootName	TokenNameIdentifier	 f Root Name
=	TokenNameEQUAL	
rootName	TokenNameIdentifier	 root Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// init(String, String, String, String, String) 	TokenNameCOMMENT_LINE	init(String, String, String, String, String) 
public	TokenNamepublic	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
(	TokenNameLPAREN	
XMLInputSource	TokenNameIdentifier	 XML Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fRootName	TokenNameIdentifier	 f Root Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// init(XMLInputSource) 	TokenNameCOMMENT_LINE	init(XMLInputSource) 
// XMLGrammarDescription methods 	TokenNameCOMMENT_LINE	XMLGrammarDescription methods 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGrammarType	TokenNameIdentifier	 get Grammar Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
.	TokenNameDOT	
XML_DTD	TokenNameIdentifier	 XML  DTD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getGrammarType(): String 	TokenNameCOMMENT_LINE	getGrammarType(): String 
/** * @return the root name of this DTD or null if root name is unknown */	TokenNameCOMMENT_JAVADOC	 @return the root name of this DTD or null if root name is unknown 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRootName	TokenNameIdentifier	 get Root Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fRootName	TokenNameIdentifier	 f Root Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getRootName(): String 	TokenNameCOMMENT_LINE	getRootName(): String 
/** Set the root name **/	TokenNameCOMMENT_JAVADOC	 Set the root name *
public	TokenNamepublic	
void	TokenNamevoid	
setRootName	TokenNameIdentifier	 set Root Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rootName	TokenNameIdentifier	 root Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fRootName	TokenNameIdentifier	 f Root Name
=	TokenNameEQUAL	
rootName	TokenNameIdentifier	 root Name
;	TokenNameSEMICOLON	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set possible roots **/	TokenNameCOMMENT_JAVADOC	 Set possible roots *
public	TokenNamepublic	
void	TokenNamevoid	
setPossibleRoots	TokenNameIdentifier	 set Possible Roots
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
possibleRoots	TokenNameIdentifier	 possible Roots
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
=	TokenNameEQUAL	
possibleRoots	TokenNameIdentifier	 possible Roots
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set possible roots **/	TokenNameCOMMENT_JAVADOC	 Set possible roots *
public	TokenNamepublic	
void	TokenNamevoid	
setPossibleRoots	TokenNameIdentifier	 set Possible Roots
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
possibleRoots	TokenNameIdentifier	 possible Roots
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
=	TokenNameEQUAL	
(	TokenNameLPAREN	
possibleRoots	TokenNameIdentifier	 possible Roots
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
possibleRoots	TokenNameIdentifier	 possible Roots
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares this grammar with the given grammar. Currently, we compare * as follows: * - if grammar type not equal return false immediately * - try and find a common root name: * - if both have roots, use them * - else if one has a root, examine other's possible root's for a match; * - else try all combinations * - test fExpandedSystemId and fPublicId as above * * @param desc The description of the grammar to be compared with * @return True if they are equal, else false */	TokenNameCOMMENT_JAVADOC	 Compares this grammar with the given grammar. Currently, we compare as follows: - if grammar type not equal return false immediately - try and find a common root name: - if both have roots, use them - else if one has a root, examine other's possible root's for a match; - else try all combinations - test fExpandedSystemId and fPublicId as above * @param desc The description of the grammar to be compared with @return True if they are equal, else false 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
instanceof	TokenNameinstanceof	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getGrammarType	TokenNameIdentifier	 get Grammar Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
)	TokenNameRPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
.	TokenNameDOT	
getGrammarType	TokenNameIdentifier	 get Grammar Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// assume it's a DTDDescription 	TokenNameCOMMENT_LINE	assume it's a DTDDescription 
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
dtdDesc	TokenNameIdentifier	 dtd Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
)	TokenNameRPAREN	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fRootName	TokenNameIdentifier	 f Root Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fRootName	TokenNameIdentifier	 f Root Name
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fRootName	TokenNameIdentifier	 f Root Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fRootName	TokenNameIdentifier	 f Root Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fRootName	TokenNameIdentifier	 f Root Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fRootName	TokenNameIdentifier	 f Root Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fRootName	TokenNameIdentifier	 f Root Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fPossibleRoots	TokenNameIdentifier	 f Possible Roots
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if we got this far we've got a root match... try other two fields, 	TokenNameCOMMENT_LINE	if we got this far we've got a root match... try other two fields, 
// since so many different DTD's have roots in common: 	TokenNameCOMMENT_LINE	since so many different DTD's have roots in common: 
if	TokenNameif	
(	TokenNameLPAREN	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fPublicId	TokenNameIdentifier	 f Public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fPublicId	TokenNameIdentifier	 f Public Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fPublicId	TokenNameIdentifier	 f Public Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dtdDesc	TokenNameIdentifier	 dtd Desc
.	TokenNameDOT	
fPublicId	TokenNameIdentifier	 f Public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the hash code of this grammar * Because our .equals method is so complex, we just return a very * simple hash that might avoid calls to the equals method a bit... * @return The hash code */	TokenNameCOMMENT_JAVADOC	 Returns the hash code of this grammar Because our .equals method is so complex, we just return a very simple hash that might avoid calls to the equals method a bit... @return The hash code 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fPublicId	TokenNameIdentifier	 f Public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fPublicId	TokenNameIdentifier	 f Public Id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// give up; hope .equals can handle it: 	TokenNameCOMMENT_LINE	give up; hope .equals can handle it: 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XMLDTDDescription 	TokenNameCOMMENT_LINE	class XMLDTDDescription 
