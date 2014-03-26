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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
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
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
;	TokenNameSEMICOLON	
/** * This allows the validator to correctlyhandle XML 1.1 * documents. * * @xerces.internal * * @author Neil Graham * @version $Id: XML11DTDValidator.java 446755 2006-09-15 21:56:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This allows the validator to correctlyhandle XML 1.1 documents. * @xerces.internal * @author Neil Graham @version $Id: XML11DTDValidator.java 446755 2006-09-15 21:56:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11DTDValidator	TokenNameIdentifier	 XM L11 DTD Validator
extends	TokenNameextends	
XMLDTDValidator	TokenNameIdentifier	 XMLDTD Validator
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DTD_VALIDATOR_PROPERTY	TokenNameIdentifier	 DTD  VALIDATOR  PROPERTY
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
DTD_VALIDATOR_PROPERTY	TokenNameIdentifier	 DTD  VALIDATOR  PROPERTY
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
XML11DTDValidator	TokenNameIdentifier	 XM L11 DTD Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// overridden so that this class has access to the same 	TokenNameCOMMENT_LINE	overridden so that this class has access to the same 
// grammarBucket as the corresponding DTDProcessor 	TokenNameCOMMENT_LINE	grammarBucket as the corresponding DTDProcessor 
// will try and use... 	TokenNameCOMMENT_LINE	will try and use... 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLDTDValidator	TokenNameIdentifier	 XMLDTD Validator
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLDTDValidator	TokenNameIdentifier	 XMLDTD Validator
)	TokenNameRPAREN	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DTD_VALIDATOR_PROPERTY	TokenNameIdentifier	 DTD  VALIDATOR  PROPERTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
curr	TokenNameIdentifier	 curr
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammarBucket	TokenNameIdentifier	 f Grammar Bucket
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getGrammarBucket	TokenNameIdentifier	 get Grammar Bucket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//reset(XMLComponentManager) 	TokenNameCOMMENT_LINE	reset(XMLComponentManager) 
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fValidation	TokenNameIdentifier	 f Validation
||	TokenNameOR_OR	
fDynamicValidation	TokenNameIdentifier	 f Dynamic Validation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now overwrite some entries in parent: 	TokenNameCOMMENT_LINE	now overwrite some entries in parent: 
try	TokenNametry	
{	TokenNameLBRACE	
fValID	TokenNameIdentifier	 f Val ID
=	TokenNameEQUAL	
fDatatypeValidatorFactory	TokenNameIdentifier	 f Datatype Validator Factory
.	TokenNameDOT	
getBuiltInDV	TokenNameIdentifier	 get Built In DV
(	TokenNameLPAREN	
"XML11ID"	TokenNameStringLiteral	XML11ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fValIDRef	TokenNameIdentifier	 f Val ID Ref
=	TokenNameEQUAL	
fDatatypeValidatorFactory	TokenNameIdentifier	 f Datatype Validator Factory
.	TokenNameDOT	
getBuiltInDV	TokenNameIdentifier	 get Built In DV
(	TokenNameLPAREN	
"XML11IDREF"	TokenNameStringLiteral	XML11IDREF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fValIDRefs	TokenNameIdentifier	 f Val ID Refs
=	TokenNameEQUAL	
fDatatypeValidatorFactory	TokenNameIdentifier	 f Datatype Validator Factory
.	TokenNameDOT	
getBuiltInDV	TokenNameIdentifier	 get Built In DV
(	TokenNameLPAREN	
"XML11IDREFS"	TokenNameStringLiteral	XML11IDREFS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fValNMTOKEN	TokenNameIdentifier	 f Val NMTOKEN
=	TokenNameEQUAL	
fDatatypeValidatorFactory	TokenNameIdentifier	 f Datatype Validator Factory
.	TokenNameDOT	
getBuiltInDV	TokenNameIdentifier	 get Built In DV
(	TokenNameLPAREN	
"XML11NMTOKEN"	TokenNameStringLiteral	XML11NMTOKEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fValNMTOKENS	TokenNameIdentifier	 f Val NMTOKENS
=	TokenNameEQUAL	
fDatatypeValidatorFactory	TokenNameIdentifier	 f Datatype Validator Factory
.	TokenNameDOT	
getBuiltInDV	TokenNameIdentifier	 get Built In DV
(	TokenNameLPAREN	
"XML11NMTOKENS"	TokenNameStringLiteral	XML11NMTOKENS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should never happen 	TokenNameCOMMENT_LINE	should never happen 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// init() 	TokenNameCOMMENT_LINE	init() 
}	TokenNameRBRACE	
// class XML11DTDValidator 	TokenNameCOMMENT_LINE	class XML11DTDValidator 
