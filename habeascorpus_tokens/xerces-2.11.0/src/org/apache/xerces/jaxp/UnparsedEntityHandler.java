/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
EntityState	TokenNameIdentifier	 Entity State
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
ValidationManager	TokenNameIdentifier	 Validation Manager
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
Augmentations	TokenNameIdentifier	 Augmentations
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
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
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
XMLLocator	TokenNameIdentifier	 XML Locator
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
XMLString	TokenNameIdentifier	 XML String
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
XNIException	TokenNameIdentifier	 XNI Exception
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
XMLDTDFilter	TokenNameIdentifier	 XMLDTD Filter
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
XMLDTDSource	TokenNameIdentifier	 XMLDTD Source
;	TokenNameSEMICOLON	
/** * <p>This filter records which unparsed entities have been * declared in the DTD and provides this information to a ValidationManager. * Events are forwarded to the registered XMLDTDHandler without modification.</p> * * @author Michael Glavassevich, IBM * @version $Id: UnparsedEntityHandler.java 520055 2007-03-19 19:25:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>This filter records which unparsed entities have been declared in the DTD and provides this information to a ValidationManager. Events are forwarded to the registered XMLDTDHandler without modification.</p> * @author Michael Glavassevich, IBM @version $Id: UnparsedEntityHandler.java 520055 2007-03-19 19:25:57Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
UnparsedEntityHandler	TokenNameIdentifier	 Unparsed Entity Handler
implements	TokenNameimplements	
XMLDTDFilter	TokenNameIdentifier	 XMLDTD Filter
,	TokenNameCOMMA	
EntityState	TokenNameIdentifier	 Entity State
{	TokenNameLBRACE	
/** DTD source and handler. **/	TokenNameCOMMENT_JAVADOC	 DTD source and handler. *
private	TokenNameprivate	
XMLDTDSource	TokenNameIdentifier	 XMLDTD Source
fDTDSource	TokenNameIdentifier	 f DTD Source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
fDTDHandler	TokenNameIdentifier	 f DTD Handler
;	TokenNameSEMICOLON	
/** Validation manager. */	TokenNameCOMMENT_JAVADOC	 Validation manager. 
private	TokenNameprivate	
final	TokenNamefinal	
ValidationManager	TokenNameIdentifier	 Validation Manager
fValidationManager	TokenNameIdentifier	 f Validation Manager
;	TokenNameSEMICOLON	
/** Map for tracking unparsed entities. */	TokenNameCOMMENT_JAVADOC	 Map for tracking unparsed entities. 
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
fUnparsedEntities	TokenNameIdentifier	 f Unparsed Entities
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
UnparsedEntityHandler	TokenNameIdentifier	 Unparsed Entity Handler
(	TokenNameLPAREN	
ValidationManager	TokenNameIdentifier	 Validation Manager
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fValidationManager	TokenNameIdentifier	 f Validation Manager
=	TokenNameEQUAL	
manager	TokenNameIdentifier	 manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * XMLDTDHandler methods */	TokenNameCOMMENT_BLOCK	 XMLDTDHandler methods 
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
XMLLocator	TokenNameIdentifier	 XML Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
fValidationManager	TokenNameIdentifier	 f Validation Manager
.	TokenNameDOT	
setEntityState	TokenNameIdentifier	 set Entity State
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startParameterEntity	TokenNameIdentifier	 start Parameter Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
startParameterEntity	TokenNameIdentifier	 start Parameter Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
textDecl	TokenNameIdentifier	 text Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
textDecl	TokenNameIdentifier	 text Decl
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endParameterEntity	TokenNameIdentifier	 end Parameter Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
endParameterEntity	TokenNameIdentifier	 end Parameter Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startExternalSubset	TokenNameIdentifier	 start External Subset
(	TokenNameLPAREN	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
startExternalSubset	TokenNameIdentifier	 start External Subset
(	TokenNameLPAREN	
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endExternalSubset	TokenNameIdentifier	 end External Subset
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
endExternalSubset	TokenNameIdentifier	 end External Subset
(	TokenNameLPAREN	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
contentModel	TokenNameIdentifier	 content Model
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
contentModel	TokenNameIdentifier	 content Model
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startAttlist	TokenNameIdentifier	 start Attlist
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
startAttlist	TokenNameIdentifier	 start Attlist
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enumeration	TokenNameIdentifier	 enumeration
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultType	TokenNameIdentifier	 default Type
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
defaultValue	TokenNameIdentifier	 default Value
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
nonNormalizedDefaultValue	TokenNameIdentifier	 non Normalized Default Value
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
enumeration	TokenNameIdentifier	 enumeration
,	TokenNameCOMMA	
defaultType	TokenNameIdentifier	 default Type
,	TokenNameCOMMA	
defaultValue	TokenNameIdentifier	 default Value
,	TokenNameCOMMA	
nonNormalizedDefaultValue	TokenNameIdentifier	 non Normalized Default Value
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endAttlist	TokenNameIdentifier	 end Attlist
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
endAttlist	TokenNameIdentifier	 end Attlist
(	TokenNameLPAREN	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
nonNormalizedText	TokenNameIdentifier	 non Normalized Text
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
nonNormalizedText	TokenNameIdentifier	 non Normalized Text
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
notation	TokenNameIdentifier	 notation
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fUnparsedEntities	TokenNameIdentifier	 f Unparsed Entities
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fUnparsedEntities	TokenNameIdentifier	 f Unparsed Entities
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fUnparsedEntities	TokenNameIdentifier	 f Unparsed Entities
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
notation	TokenNameIdentifier	 notation
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startConditional	TokenNameIdentifier	 start Conditional
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
startConditional	TokenNameIdentifier	 start Conditional
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ignoredCharacters	TokenNameIdentifier	 ignored Characters
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
ignoredCharacters	TokenNameIdentifier	 ignored Characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endConditional	TokenNameIdentifier	 end Conditional
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
endConditional	TokenNameIdentifier	 end Conditional
(	TokenNameLPAREN	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
.	TokenNameDOT	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDTDSource	TokenNameIdentifier	 set DTD Source
(	TokenNameLPAREN	
XMLDTDSource	TokenNameIdentifier	 XMLDTD Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDSource	TokenNameIdentifier	 f DTD Source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XMLDTDSource	TokenNameIdentifier	 XMLDTD Source
getDTDSource	TokenNameIdentifier	 get DTD Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDTDSource	TokenNameIdentifier	 f DTD Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * XMLDTDSource methods */	TokenNameCOMMENT_BLOCK	 XMLDTDSource methods 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
getDTDHandler	TokenNameIdentifier	 get DTD Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDTDHandler	TokenNameIdentifier	 f DTD Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * EntityState methods */	TokenNameCOMMENT_BLOCK	 EntityState methods 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEntityDeclared	TokenNameIdentifier	 is Entity Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isEntityUnparsed	TokenNameIdentifier	 is Entity Unparsed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fUnparsedEntities	TokenNameIdentifier	 f Unparsed Entities
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fUnparsedEntities	TokenNameIdentifier	 f Unparsed Entities
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Other methods */	TokenNameCOMMENT_BLOCK	 Other methods 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fUnparsedEntities	TokenNameIdentifier	 f Unparsed Entities
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
fUnparsedEntities	TokenNameIdentifier	 f Unparsed Entities
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should only clear this if the last document contained unparsed entities 	TokenNameCOMMENT_LINE	should only clear this if the last document contained unparsed entities 
fUnparsedEntities	TokenNameIdentifier	 f Unparsed Entities
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
