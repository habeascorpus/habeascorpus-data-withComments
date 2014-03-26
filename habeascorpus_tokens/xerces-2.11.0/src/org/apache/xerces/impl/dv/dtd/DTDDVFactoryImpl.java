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
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
DTDDVFactory	TokenNameIdentifier	 DTDDV Factory
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
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
;	TokenNameSEMICOLON	
/** * the factory to create/return built-in schema DVs and create user-defined DVs * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: DTDDVFactoryImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 the factory to create/return built-in schema DVs and create user-defined DVs * @xerces.internal * @author Sandy Gao, IBM * @version $Id: DTDDVFactoryImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DTDDVFactoryImpl	TokenNameIdentifier	 DTDDV Factory Impl
extends	TokenNameextends	
DTDDVFactory	TokenNameIdentifier	 DTDDV Factory
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return a dtd type of the given name * * @param name the name of the datatype * @return the datatype validator of the given name */	TokenNameCOMMENT_JAVADOC	 return a dtd type of the given name * @param name the name of the datatype @return the datatype validator of the given name 
public	TokenNamepublic	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
getBuiltInDV	TokenNameIdentifier	 get Built In DV
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
)	TokenNameRPAREN	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get all built-in DVs, which are stored in a hashtable keyed by the name * * @return a hashtable which contains all datatypes */	TokenNameCOMMENT_JAVADOC	 get all built-in DVs, which are stored in a hashtable keyed by the name * @return a hashtable which contains all datatypes 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
getBuiltInTypes	TokenNameIdentifier	 get Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create all built-in types 	TokenNameCOMMENT_LINE	create all built-in types 
static	TokenNamestatic	
void	TokenNamevoid	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
dvTemp	TokenNameIdentifier	 dv Temp
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
new	TokenNamenew	
StringDatatypeValidator	TokenNameIdentifier	 String Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ID"	TokenNameStringLiteral	ID
,	TokenNameCOMMA	
new	TokenNamenew	
IDDatatypeValidator	TokenNameIdentifier	 ID Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dvTemp	TokenNameIdentifier	 dv Temp
=	TokenNameEQUAL	
new	TokenNamenew	
IDREFDatatypeValidator	TokenNameIdentifier	 IDREF Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IDREF"	TokenNameStringLiteral	IDREF
,	TokenNameCOMMA	
dvTemp	TokenNameIdentifier	 dv Temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IDREFS"	TokenNameStringLiteral	IDREFS
,	TokenNameCOMMA	
new	TokenNamenew	
ListDatatypeValidator	TokenNameIdentifier	 List Datatype Validator
(	TokenNameLPAREN	
dvTemp	TokenNameIdentifier	 dv Temp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dvTemp	TokenNameIdentifier	 dv Temp
=	TokenNameEQUAL	
new	TokenNamenew	
ENTITYDatatypeValidator	TokenNameIdentifier	 ENTITY Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ENTITY"	TokenNameStringLiteral	ENTITY
,	TokenNameCOMMA	
new	TokenNamenew	
ENTITYDatatypeValidator	TokenNameIdentifier	 ENTITY Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ENTITIES"	TokenNameStringLiteral	ENTITIES
,	TokenNameCOMMA	
new	TokenNamenew	
ListDatatypeValidator	TokenNameIdentifier	 List Datatype Validator
(	TokenNameLPAREN	
dvTemp	TokenNameIdentifier	 dv Temp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"NOTATION"	TokenNameStringLiteral	NOTATION
,	TokenNameCOMMA	
new	TokenNamenew	
NOTATIONDatatypeValidator	TokenNameIdentifier	 NOTATION Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dvTemp	TokenNameIdentifier	 dv Temp
=	TokenNameEQUAL	
new	TokenNamenew	
NMTOKENDatatypeValidator	TokenNameIdentifier	 NMTOKEN Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"NMTOKEN"	TokenNameStringLiteral	NMTOKEN
,	TokenNameCOMMA	
dvTemp	TokenNameIdentifier	 dv Temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"NMTOKENS"	TokenNameStringLiteral	NMTOKENS
,	TokenNameCOMMA	
new	TokenNamenew	
ListDatatypeValidator	TokenNameIdentifier	 List Datatype Validator
(	TokenNameLPAREN	
dvTemp	TokenNameIdentifier	 dv Temp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//createBuiltInTypes() 	TokenNameCOMMENT_LINE	createBuiltInTypes() 
}	TokenNameRBRACE	
// DTDDVFactoryImpl 	TokenNameCOMMENT_LINE	DTDDVFactoryImpl 
