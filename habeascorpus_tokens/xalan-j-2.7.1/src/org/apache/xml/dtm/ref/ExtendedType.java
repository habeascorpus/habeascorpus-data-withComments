/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtendedType.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtendedType.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
/** * The class ExtendedType represents an extended type object used by * ExpandedNameTable. */	TokenNameCOMMENT_JAVADOC	 The class ExtendedType represents an extended type object used by ExpandedNameTable. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ExtendedType	TokenNameIdentifier	 Extended Type
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
nodetype	TokenNameIdentifier	 nodetype
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
/** * Create an ExtendedType object from node type, namespace and local name. * The hash code is calculated from the node type, namespace and local name. * * @param nodetype Type of the node * @param namespace Namespace of the node * @param localName Local name of the node */	TokenNameCOMMENT_JAVADOC	 Create an ExtendedType object from node type, namespace and local name. The hash code is calculated from the node type, namespace and local name. * @param nodetype Type of the node @param namespace Namespace of the node @param localName Local name of the node 
public	TokenNamepublic	
ExtendedType	TokenNameIdentifier	 Extended Type
(	TokenNameLPAREN	
int	TokenNameint	
nodetype	TokenNameIdentifier	 nodetype
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nodetype	TokenNameIdentifier	 nodetype
=	TokenNameEQUAL	
nodetype	TokenNameIdentifier	 nodetype
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
nodetype	TokenNameIdentifier	 nodetype
+	TokenNamePLUS	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an ExtendedType object from node type, namespace, local name * and a given hash code. * * @param nodetype Type of the node * @param namespace Namespace of the node * @param localName Local name of the node * @param hash The given hash code */	TokenNameCOMMENT_JAVADOC	 Create an ExtendedType object from node type, namespace, local name and a given hash code. * @param nodetype Type of the node @param namespace Namespace of the node @param localName Local name of the node @param hash The given hash code 
public	TokenNamepublic	
ExtendedType	TokenNameIdentifier	 Extended Type
(	TokenNameLPAREN	
int	TokenNameint	
nodetype	TokenNameIdentifier	 nodetype
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nodetype	TokenNameIdentifier	 nodetype
=	TokenNameEQUAL	
nodetype	TokenNameIdentifier	 nodetype
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Redefine this ExtendedType object to represent a different extended type. * This is intended to be used ONLY on the hashET object. Using it elsewhere * will mess up existing hashtable entries! */	TokenNameCOMMENT_JAVADOC	 Redefine this ExtendedType object to represent a different extended type. This is intended to be used ONLY on the hashET object. Using it elsewhere will mess up existing hashtable entries! 
protected	TokenNameprotected	
void	TokenNamevoid	
redefine	TokenNameIdentifier	 redefine
(	TokenNameLPAREN	
int	TokenNameint	
nodetype	TokenNameIdentifier	 nodetype
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nodetype	TokenNameIdentifier	 nodetype
=	TokenNameEQUAL	
nodetype	TokenNameIdentifier	 nodetype
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
nodetype	TokenNameIdentifier	 nodetype
+	TokenNamePLUS	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Redefine this ExtendedType object to represent a different extended type. * This is intended to be used ONLY on the hashET object. Using it elsewhere * will mess up existing hashtable entries! */	TokenNameCOMMENT_JAVADOC	 Redefine this ExtendedType object to represent a different extended type. This is intended to be used ONLY on the hashET object. Using it elsewhere will mess up existing hashtable entries! 
protected	TokenNameprotected	
void	TokenNamevoid	
redefine	TokenNameIdentifier	 redefine
(	TokenNameLPAREN	
int	TokenNameint	
nodetype	TokenNameIdentifier	 nodetype
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nodetype	TokenNameIdentifier	 nodetype
=	TokenNameEQUAL	
nodetype	TokenNameIdentifier	 nodetype
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override the hashCode() method in the Object class */	TokenNameCOMMENT_JAVADOC	 Override the hashCode() method in the Object class 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test if this ExtendedType object is equal to the given ExtendedType. * * @param other The other ExtendedType object to test for equality * @return true if the two ExtendedType objects are equal. */	TokenNameCOMMENT_JAVADOC	 Test if this ExtendedType object is equal to the given ExtendedType. * @param other The other ExtendedType object to test for equality @return true if the two ExtendedType objects are equal. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExtendedType	TokenNameIdentifier	 Extended Type
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
nodetype	TokenNameIdentifier	 nodetype
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nodetype	TokenNameIdentifier	 nodetype
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the node type */	TokenNameCOMMENT_JAVADOC	 Return the node type 
public	TokenNamepublic	
int	TokenNameint	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodetype	TokenNameIdentifier	 nodetype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the local name */	TokenNameCOMMENT_JAVADOC	 Return the local name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the namespace */	TokenNameCOMMENT_JAVADOC	 Return the namespace 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
