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
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
;	TokenNameSEMICOLON	
/** * The XMLResourceIdentifierImpl class is an implementation of the * XMLResourceIdentifier interface which defines the location identity * of a resource. * * @author Andy Clark * * @version $Id: XMLResourceIdentifierImpl.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The XMLResourceIdentifierImpl class is an implementation of the XMLResourceIdentifier interface which defines the location identity of a resource. * @author Andy Clark * @version $Id: XMLResourceIdentifierImpl.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
implements	TokenNameimplements	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The public identifier. */	TokenNameCOMMENT_JAVADOC	 The public identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fPublicId	TokenNameIdentifier	 f Public Id
;	TokenNameSEMICOLON	
/** The literal system identifier. */	TokenNameCOMMENT_JAVADOC	 The literal system identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
;	TokenNameSEMICOLON	
/** The base system identifier. */	TokenNameCOMMENT_JAVADOC	 The base system identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fBaseSystemId	TokenNameIdentifier	 f Base System Id
;	TokenNameSEMICOLON	
/** The expanded system identifier. */	TokenNameCOMMENT_JAVADOC	 The expanded system identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
;	TokenNameSEMICOLON	
/** The namespace of the resource. */	TokenNameCOMMENT_JAVADOC	 The namespace of the resource. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fNamespace	TokenNameIdentifier	 f Namespace
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs an empty resource identifier. */	TokenNameCOMMENT_JAVADOC	 Constructs an empty resource identifier. 
public	TokenNamepublic	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * Constructs a resource identifier. * * @param publicId The public identifier. * @param literalSystemId The literal system identifier. * @param baseSystemId The base system identifier. * @param expandedSystemId The expanded system identifier. */	TokenNameCOMMENT_JAVADOC	 Constructs a resource identifier. * @param publicId The public identifier. @param literalSystemId The literal system identifier. @param baseSystemId The base system identifier. @param expandedSystemId The expanded system identifier. 
public	TokenNamepublic	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
(	TokenNameLPAREN	
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
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String,String,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String,String) 
/** * Constructs a resource identifier. * * @param publicId The public identifier. * @param literalSystemId The literal system identifier. * @param baseSystemId The base system identifier. * @param expandedSystemId The expanded system identifier. * @param namespace The namespace. */	TokenNameCOMMENT_JAVADOC	 Constructs a resource identifier. * @param publicId The public identifier. @param literalSystemId The literal system identifier. @param baseSystemId The base system identifier. @param expandedSystemId The expanded system identifier. @param namespace The namespace. 
public	TokenNamepublic	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
(	TokenNameLPAREN	
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
// <init>(String,String,String,String,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String,String,String) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Sets the values of the resource identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the values of the resource identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
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
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setValues(String,String,String,String) 	TokenNameCOMMENT_LINE	setValues(String,String,String,String) 
/** Sets the values of the resource identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the values of the resource identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
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
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
=	TokenNameEQUAL	
literalSystemId	TokenNameIdentifier	 literal System Id
;	TokenNameSEMICOLON	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
baseSystemId	TokenNameIdentifier	 base System Id
;	TokenNameSEMICOLON	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
=	TokenNameEQUAL	
expandedSystemId	TokenNameIdentifier	 expanded System Id
;	TokenNameSEMICOLON	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setValues(String,String,String,String,String) 	TokenNameCOMMENT_LINE	setValues(String,String,String,String,String) 
/** Clears the values. */	TokenNameCOMMENT_JAVADOC	 Clears the values. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear() 	TokenNameCOMMENT_LINE	clear() 
/** Sets the public identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the public identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setPublicId(String) 	TokenNameCOMMENT_LINE	setPublicId(String) 
/** Sets the literal system identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the literal system identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setLiteralSystemId	TokenNameIdentifier	 set Literal System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
literalSystemId	TokenNameIdentifier	 literal System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
=	TokenNameEQUAL	
literalSystemId	TokenNameIdentifier	 literal System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setLiteralSystemId(String) 	TokenNameCOMMENT_LINE	setLiteralSystemId(String) 
/** Sets the base system identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the base system identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseSystemId	TokenNameIdentifier	 set Base System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
baseSystemId	TokenNameIdentifier	 base System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setBaseSystemId(String) 	TokenNameCOMMENT_LINE	setBaseSystemId(String) 
/** Sets the expanded system identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the expanded system identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setExpandedSystemId	TokenNameIdentifier	 set Expanded System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expandedSystemId	TokenNameIdentifier	 expanded System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
=	TokenNameEQUAL	
expandedSystemId	TokenNameIdentifier	 expanded System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setExpandedSystemId(String) 	TokenNameCOMMENT_LINE	setExpandedSystemId(String) 
/** Sets the namespace of the resource. */	TokenNameCOMMENT_JAVADOC	 Sets the namespace of the resource. 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespace	TokenNameIdentifier	 set Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setNamespace(String) 	TokenNameCOMMENT_LINE	setNamespace(String) 
// 	TokenNameCOMMENT_LINE	 
// XMLResourceIdentifier methods 	TokenNameCOMMENT_LINE	XMLResourceIdentifier methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the public identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the public identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fPublicId	TokenNameIdentifier	 f Public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getPublicId():String 	TokenNameCOMMENT_LINE	getPublicId():String 
/** Returns the literal system identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the literal system identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLiteralSystemId():String 	TokenNameCOMMENT_LINE	getLiteralSystemId():String 
/** * Returns the base URI against which the literal SystemId is to be resolved. */	TokenNameCOMMENT_JAVADOC	 Returns the base URI against which the literal SystemId is to be resolved. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getBaseSystemId():String 	TokenNameCOMMENT_LINE	getBaseSystemId():String 
/** Returns the expanded system identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the expanded system identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getExpandedSystemId():String 	TokenNameCOMMENT_LINE	getExpandedSystemId():String 
/** Returns the namespace of the resource. */	TokenNameCOMMENT_JAVADOC	 Returns the namespace of the resource. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespace	TokenNameIdentifier	 f Namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNamespace():String 	TokenNameCOMMENT_LINE	getNamespace():String 
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
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fPublicId	TokenNameIdentifier	 f Public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
fPublicId	TokenNameIdentifier	 f Public Id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
fNamespace	TokenNameIdentifier	 f Namespace
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
// class XMLResourceIdentifierImpl 	TokenNameCOMMENT_LINE	class XMLResourceIdentifierImpl 
