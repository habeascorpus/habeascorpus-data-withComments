/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
XMLEntityDescription	TokenNameIdentifier	 XML Entity Description
;	TokenNameSEMICOLON	
/** * <p>This class is an implementation of the XMLEntityDescription * interface which describes the properties of an entity.</p> * * @author Michael Glavassevich, IBM * * @version $Id: XMLEntityDescriptionImpl.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>This class is an implementation of the XMLEntityDescription interface which describes the properties of an entity.</p> * @author Michael Glavassevich, IBM * @version $Id: XMLEntityDescriptionImpl.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLEntityDescriptionImpl	TokenNameIdentifier	 XML Entity Description Impl
extends	TokenNameextends	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
implements	TokenNameimplements	
XMLEntityDescription	TokenNameIdentifier	 XML Entity Description
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs an empty entity description. */	TokenNameCOMMENT_JAVADOC	 Constructs an empty entity description. 
public	TokenNamepublic	
XMLEntityDescriptionImpl	TokenNameIdentifier	 XML Entity Description Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * Constructs an entity description. * * @param entityName The name of the entity. * @param publicId The public identifier. * @param literalSystemId The literal system identifier. * @param baseSystemId The base system identifier. * @param expandedSystemId The expanded system identifier. */	TokenNameCOMMENT_JAVADOC	 Constructs an entity description. * @param entityName The name of the entity. @param publicId The public identifier. @param literalSystemId The literal system identifier. @param baseSystemId The base system identifier. @param expandedSystemId The expanded system identifier. 
public	TokenNamepublic	
XMLEntityDescriptionImpl	TokenNameIdentifier	 XML Entity Description Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entityName	TokenNameIdentifier	 entity Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
literalSystemId	TokenNameIdentifier	 literal System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expandedSystemId	TokenNameIdentifier	 expanded System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
literalSystemId	TokenNameIdentifier	 literal System Id
,	TokenNameCOMMA	
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
expandedSystemId	TokenNameIdentifier	 expanded System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String,String,String,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String,String,String) 
/** * Constructs a resource identifier. * * @param entityName The name of the entity. * @param publicId The public identifier. * @param literalSystemId The literal system identifier. * @param baseSystemId The base system identifier. * @param expandedSystemId The expanded system identifier. * @param namespace The namespace. */	TokenNameCOMMENT_JAVADOC	 Constructs a resource identifier. * @param entityName The name of the entity. @param publicId The public identifier. @param literalSystemId The literal system identifier. @param baseSystemId The base system identifier. @param expandedSystemId The expanded system identifier. @param namespace The namespace. 
public	TokenNamepublic	
XMLEntityDescriptionImpl	TokenNameIdentifier	 XML Entity Description Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entityName	TokenNameIdentifier	 entity Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
literalSystemId	TokenNameIdentifier	 literal System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expandedSystemId	TokenNameIdentifier	 expanded System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
literalSystemId	TokenNameIdentifier	 literal System Id
,	TokenNameCOMMA	
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
expandedSystemId	TokenNameIdentifier	 expanded System Id
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String,String,String,String,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String,String,String,String) 
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The name of the entity. */	TokenNameCOMMENT_JAVADOC	 The name of the entity. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fEntityName	TokenNameIdentifier	 f Entity Name
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the name of the entity. * * @param name the name of the entity */	TokenNameCOMMENT_JAVADOC	 Sets the name of the entity. * @param name the name of the entity 
public	TokenNamepublic	
void	TokenNamevoid	
setEntityName	TokenNameIdentifier	 set Entity Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityName	TokenNameIdentifier	 f Entity Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setEntityName(String) 	TokenNameCOMMENT_LINE	setEntityName(String) 
/** * Returns the name of the entity. * * @return the name of the entity */	TokenNameCOMMENT_JAVADOC	 Returns the name of the entity. * @return the name of the entity 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEntityName	TokenNameIdentifier	 get Entity Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEntityName	TokenNameIdentifier	 f Entity Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getEntityName():String 	TokenNameCOMMENT_LINE	getEntityName():String 
/** * <p>Sets the values of this entity description.</p> * * @param entityName The name of the entity. * @param publicId The public identifier. * @param literalSystemId The literal system identifier. * @param baseSystemId The base system identifier. * @param expandedSystemId The expanded system identifier. */	TokenNameCOMMENT_JAVADOC	 <p>Sets the values of this entity description.</p> * @param entityName The name of the entity. @param publicId The public identifier. @param literalSystemId The literal system identifier. @param baseSystemId The base system identifier. @param expandedSystemId The expanded system identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entityName	TokenNameIdentifier	 entity Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
literalSystemId	TokenNameIdentifier	 literal System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expandedSystemId	TokenNameIdentifier	 expanded System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
literalSystemId	TokenNameIdentifier	 literal System Id
,	TokenNameCOMMA	
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
expandedSystemId	TokenNameIdentifier	 expanded System Id
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setDescription(String,String,String,String,String) 	TokenNameCOMMENT_LINE	setDescription(String,String,String,String,String) 
/** * <p>Sets the values of this entity description.</p> * * @param entityName The name of the entity. * @param publicId The public identifier. * @param literalSystemId The literal system identifier. * @param baseSystemId The base system identifier. * @param expandedSystemId The expanded system identifier. * @param namespace The namespace. */	TokenNameCOMMENT_JAVADOC	 <p>Sets the values of this entity description.</p> * @param entityName The name of the entity. @param publicId The public identifier. @param literalSystemId The literal system identifier. @param baseSystemId The base system identifier. @param expandedSystemId The expanded system identifier. @param namespace The namespace. 
public	TokenNamepublic	
void	TokenNamevoid	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entityName	TokenNameIdentifier	 entity Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
literalSystemId	TokenNameIdentifier	 literal System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expandedSystemId	TokenNameIdentifier	 expanded System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityName	TokenNameIdentifier	 f Entity Name
=	TokenNameEQUAL	
entityName	TokenNameIdentifier	 entity Name
;	TokenNameSEMICOLON	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
literalSystemId	TokenNameIdentifier	 literal System Id
,	TokenNameCOMMA	
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
expandedSystemId	TokenNameIdentifier	 expanded System Id
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setDescription(String,String,String,String,String,String) 	TokenNameCOMMENT_LINE	setDescription(String,String,String,String,String,String) 
/** * <p>Clears the values.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Clears the values.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEntityName	TokenNameIdentifier	 f Entity Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear() 	TokenNameCOMMENT_LINE	clear() 
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns a hash code for this object. */	TokenNameCOMMENT_JAVADOC	 Returns a hash code for this object. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fEntityName	TokenNameIdentifier	 f Entity Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
fEntityName	TokenNameIdentifier	 f Entity Name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hashCode():int 	TokenNameCOMMENT_LINE	hashCode():int 
/** Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fEntityName	TokenNameIdentifier	 f Entity Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fEntityName	TokenNameIdentifier	 f Entity Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fPublicId	TokenNameIdentifier	 f Public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fPublicId	TokenNameIdentifier	 f Public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toString():String 	TokenNameCOMMENT_LINE	toString():String 
}	TokenNameRBRACE	
// XMLEntityDescriptionImpl 	TokenNameCOMMENT_LINE	XMLEntityDescriptionImpl 
