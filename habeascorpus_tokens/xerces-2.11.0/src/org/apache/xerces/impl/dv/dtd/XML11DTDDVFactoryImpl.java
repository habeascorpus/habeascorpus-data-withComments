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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
/** * the factory to create/return built-in XML 1.1 DVs and create user-defined DVs * * @xerces.internal * * @author Neil Graham, IBM * * @version $Id: XML11DTDDVFactoryImpl.java 704573 2008-10-14 16:11:22Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 the factory to create/return built-in XML 1.1 DVs and create user-defined DVs * @xerces.internal * @author Neil Graham, IBM * @version $Id: XML11DTDDVFactoryImpl.java 704573 2008-10-14 16:11:22Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11DTDDVFactoryImpl	TokenNameIdentifier	 XM L11 DTDDV Factory Impl
extends	TokenNameextends	
DTDDVFactoryImpl	TokenNameIdentifier	 DTDDV Factory Impl
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
fXML11BuiltInTypes	TokenNameIdentifier	 f XM L11 Built In Types
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * return a dtd type of the given name * This will call the super class if and only if it does not * recognize the passed-in name. * * @param name the name of the datatype * @return the datatype validator of the given name */	TokenNameCOMMENT_JAVADOC	 return a dtd type of the given name This will call the super class if and only if it does not recognize the passed-in name. * @param name the name of the datatype @return the datatype validator of the given name 
public	TokenNamepublic	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
getBuiltInDV	TokenNameIdentifier	 get Built In DV
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fXML11BuiltInTypes	TokenNameIdentifier	 f XM L11 Built In Types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
)	TokenNameRPAREN	
fXML11BuiltInTypes	TokenNameIdentifier	 f XM L11 Built In Types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * get all built-in DVs, which are stored in a hashtable keyed by the name * New XML 1.1 datatypes are inserted. * * @return a hashtable which contains all datatypes */	TokenNameCOMMENT_JAVADOC	 get all built-in DVs, which are stored in a hashtable keyed by the name New XML 1.1 datatypes are inserted. * @return a hashtable which contains all datatypes 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
getBuiltInTypes	TokenNameIdentifier	 get Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
toReturn	TokenNameIdentifier	 to Return
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
fXML11BuiltInTypes	TokenNameIdentifier	 f XM L11 Built In Types
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
dv	TokenNameIdentifier	 dv
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toReturn	TokenNameIdentifier	 to Return
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
dv	TokenNameIdentifier	 dv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
toReturn	TokenNameIdentifier	 to Return
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
fXML11BuiltInTypes	TokenNameIdentifier	 f XM L11 Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"XML11ID"	TokenNameStringLiteral	XML11ID
,	TokenNameCOMMA	
new	TokenNamenew	
XML11IDDatatypeValidator	TokenNameIdentifier	 XM L11 ID Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
dvTemp	TokenNameIdentifier	 dv Temp
=	TokenNameEQUAL	
new	TokenNamenew	
XML11IDREFDatatypeValidator	TokenNameIdentifier	 XM L11 IDREF Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXML11BuiltInTypes	TokenNameIdentifier	 f XM L11 Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"XML11IDREF"	TokenNameStringLiteral	XML11IDREF
,	TokenNameCOMMA	
dvTemp	TokenNameIdentifier	 dv Temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXML11BuiltInTypes	TokenNameIdentifier	 f XM L11 Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"XML11IDREFS"	TokenNameStringLiteral	XML11IDREFS
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
XML11NMTOKENDatatypeValidator	TokenNameIdentifier	 XM L11 NMTOKEN Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXML11BuiltInTypes	TokenNameIdentifier	 f XM L11 Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"XML11NMTOKEN"	TokenNameStringLiteral	XML11NMTOKEN
,	TokenNameCOMMA	
dvTemp	TokenNameIdentifier	 dv Temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXML11BuiltInTypes	TokenNameIdentifier	 f XM L11 Built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"XML11NMTOKENS"	TokenNameStringLiteral	XML11NMTOKENS
,	TokenNameCOMMA	
new	TokenNamenew	
ListDatatypeValidator	TokenNameIdentifier	 List Datatype Validator
(	TokenNameLPAREN	
dvTemp	TokenNameIdentifier	 dv Temp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <clinit> 	TokenNameCOMMENT_LINE	<clinit> 
}	TokenNameRBRACE	
//XML11DTDDVFactoryImpl 	TokenNameCOMMENT_LINE	XML11DTDDVFactoryImpl 
