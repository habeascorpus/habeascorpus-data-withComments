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
validation	TokenNameIdentifier	 validation
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
Locale	TokenNameIdentifier	 Locale
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
ValidationContext	TokenNameIdentifier	 Validation Context
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
SymbolTable	TokenNameIdentifier	 Symbol Table
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
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
/** * Implementation of the ValidationContext interface. Used to establish an * environment for simple type validation. * * @xerces.internal * * @author Elena Litani, IBM * @version $Id: ValidationState.java 713638 2008-11-13 04:42:18Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Implementation of the ValidationContext interface. Used to establish an environment for simple type validation. * @xerces.internal * @author Elena Litani, IBM @version $Id: ValidationState.java 713638 2008-11-13 04:42:18Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ValidationState	TokenNameIdentifier	 Validation State
implements	TokenNameimplements	
ValidationContext	TokenNameIdentifier	 Validation Context
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// private data 	TokenNameCOMMENT_LINE	private data 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
boolean	TokenNameboolean	
fExtraChecking	TokenNameIdentifier	 f Extra Checking
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fFacetChecking	TokenNameIdentifier	 f Facet Checking
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fNormalize	TokenNameIdentifier	 f Normalize
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
EntityState	TokenNameIdentifier	 Entity State
fEntityState	TokenNameIdentifier	 f Entity State
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NamespaceContext	TokenNameIdentifier	 Namespace Context
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Locale	TokenNameIdentifier	 Locale
fLocale	TokenNameIdentifier	 f Locale
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//REVISIT: Should replace with a lighter structure. 	TokenNameCOMMENT_LINE	REVISIT: Should replace with a lighter structure. 
private	TokenNameprivate	
final	TokenNamefinal	
HashMap	TokenNameIdentifier	 Hash Map
fIdTable	TokenNameIdentifier	 f Id Table
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
HashMap	TokenNameIdentifier	 Hash Map
fIdRefTable	TokenNameIdentifier	 f Id Ref Table
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
fNullValue	TokenNameIdentifier	 f Null Value
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// public methods 	TokenNameCOMMENT_LINE	public methods 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
setExtraChecking	TokenNameIdentifier	 set Extra Checking
(	TokenNameLPAREN	
boolean	TokenNameboolean	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fExtraChecking	TokenNameIdentifier	 f Extra Checking
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFacetChecking	TokenNameIdentifier	 set Facet Checking
(	TokenNameLPAREN	
boolean	TokenNameboolean	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fFacetChecking	TokenNameIdentifier	 f Facet Checking
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNormalizationRequired	TokenNameIdentifier	 set Normalization Required
(	TokenNameLPAREN	
boolean	TokenNameboolean	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNormalize	TokenNameIdentifier	 f Normalize
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUsingNamespaces	TokenNameIdentifier	 set Using Namespaces
(	TokenNameLPAREN	
boolean	TokenNameboolean	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEntityState	TokenNameIdentifier	 set Entity State
(	TokenNameLPAREN	
EntityState	TokenNameIdentifier	 Entity State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityState	TokenNameIdentifier	 f Entity State
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNamespaceSupport	TokenNameIdentifier	 set Namespace Support
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSymbolTable	TokenNameIdentifier	 set Symbol Table
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
sTable	TokenNameIdentifier	 s Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
sTable	TokenNameIdentifier	 s Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return null if all IDREF values have a corresponding ID value; * otherwise return the first IDREF value without a matching ID value. */	TokenNameCOMMENT_JAVADOC	 return null if all IDREF values have a corresponding ID value; otherwise return the first IDREF value without a matching ID value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
checkIDRefID	TokenNameIdentifier	 check ID Ref ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
fIdRefTable	TokenNameIdentifier	 f Id Ref Table
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fIdTable	TokenNameIdentifier	 f Id Table
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fExtraChecking	TokenNameIdentifier	 f Extra Checking
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fFacetChecking	TokenNameIdentifier	 f Facet Checking
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fIdTable	TokenNameIdentifier	 f Id Table
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIdRefTable	TokenNameIdentifier	 f Id Ref Table
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEntityState	TokenNameIdentifier	 f Entity State
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The same validation state can be used to validate more than one (schema) * validation roots. Entity/Namespace/Symbol are shared, but each validation * root needs its own id/idref tables. So we need this method to reset only * the two tables. */	TokenNameCOMMENT_JAVADOC	 The same validation state can be used to validate more than one (schema) validation roots. Entity/Namespace/Symbol are shared, but each validation root needs its own id/idref tables. So we need this method to reset only the two tables. 
public	TokenNamepublic	
void	TokenNamevoid	
resetIDTables	TokenNameIdentifier	 reset ID Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIdTable	TokenNameIdentifier	 f Id Table
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIdRefTable	TokenNameIdentifier	 f Id Ref Table
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// implementation of ValidationContext methods 	TokenNameCOMMENT_LINE	implementation of ValidationContext methods 
// 	TokenNameCOMMENT_LINE	 
// whether to do extra id/idref/entity checking 	TokenNameCOMMENT_LINE	whether to do extra id/idref/entity checking 
public	TokenNamepublic	
boolean	TokenNameboolean	
needExtraChecking	TokenNameIdentifier	 need Extra Checking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fExtraChecking	TokenNameIdentifier	 f Extra Checking
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// whether to validate against facets 	TokenNameCOMMENT_LINE	whether to validate against facets 
public	TokenNamepublic	
boolean	TokenNameboolean	
needFacetChecking	TokenNameIdentifier	 need Facet Checking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fFacetChecking	TokenNameIdentifier	 f Facet Checking
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
needToNormalize	TokenNameIdentifier	 need To Normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNormalize	TokenNameIdentifier	 f Normalize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
useNamespaces	TokenNameIdentifier	 use Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespaces	TokenNameIdentifier	 f Namespaces
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// entity 	TokenNameCOMMENT_LINE	entity 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEntityDeclared	TokenNameIdentifier	 is Entity Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEntityState	TokenNameIdentifier	 f Entity State
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEntityState	TokenNameIdentifier	 f Entity State
.	TokenNameDOT	
isEntityDeclared	TokenNameIdentifier	 is Entity Declared
(	TokenNameLPAREN	
getSymbol	TokenNameIdentifier	 get Symbol
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
fEntityState	TokenNameIdentifier	 f Entity State
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEntityState	TokenNameIdentifier	 f Entity State
.	TokenNameDOT	
isEntityUnparsed	TokenNameIdentifier	 is Entity Unparsed
(	TokenNameLPAREN	
getSymbol	TokenNameIdentifier	 get Symbol
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// id 	TokenNameCOMMENT_LINE	id 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIdDeclared	TokenNameIdentifier	 is Id Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fIdTable	TokenNameIdentifier	 f Id Table
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addId	TokenNameIdentifier	 add Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIdTable	TokenNameIdentifier	 f Id Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
fNullValue	TokenNameIdentifier	 f Null Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// idref 	TokenNameCOMMENT_LINE	idref 
public	TokenNamepublic	
void	TokenNamevoid	
addIdRef	TokenNameIdentifier	 add Id Ref
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIdRefTable	TokenNameIdentifier	 f Id Ref Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
fNullValue	TokenNameIdentifier	 f Null Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get symbols 	TokenNameCOMMENT_LINE	get symbols 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSymbol	TokenNameIdentifier	 get Symbol
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if there is no symbol table, we return java-internalized string, 	TokenNameCOMMENT_LINE	if there is no symbol table, we return java-internalized string, 
// because symbol table strings are also java-internalzied. 	TokenNameCOMMENT_LINE	because symbol table strings are also java-internalzied. 
// this guarantees that the returned string from this method can be 	TokenNameCOMMENT_LINE	this guarantees that the returned string from this method can be 
// compared by reference with other symbol table string. -SG 	TokenNameCOMMENT_LINE	compared by reference with other symbol table string. -SG 
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// qname, notation 	TokenNameCOMMENT_LINE	qname, notation 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Locale 	TokenNameCOMMENT_LINE	Locale 
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLocale	TokenNameIdentifier	 f Locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLocale	TokenNameIdentifier	 f Locale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
