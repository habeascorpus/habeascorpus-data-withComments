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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @author Rahul Srivastava, Sun Microsystems Inc. * * @version $Id: NodeImpl.java 705596 2008-10-17 13:05:10Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Rahul Srivastava, Sun Microsystems Inc. * @version $Id: NodeImpl.java 705596 2008-10-17 13:05:10Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
NodeImpl	TokenNameIdentifier	 Node Impl
extends	TokenNameextends	
DefaultNode	TokenNameIdentifier	 Default Node
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
short	TokenNameshort	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hidden	TokenNameIdentifier	 hidden
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NodeImpl	TokenNameIdentifier	 Node Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodeImpl	TokenNameIdentifier	 Node Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
short	TokenNameshort	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// other methods 	TokenNameCOMMENT_LINE	other methods 
public	TokenNamepublic	
void	TokenNamevoid	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
boolean	TokenNameboolean	
hide	TokenNameIdentifier	 hide
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hidden	TokenNameIdentifier	 hidden
=	TokenNameEQUAL	
hide	TokenNameIdentifier	 hide
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getReadOnly	TokenNameIdentifier	 get Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hidden	TokenNameIdentifier	 hidden
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** NON-DOM method for debugging convenience. */	TokenNameCOMMENT_JAVADOC	 NON-DOM method for debugging convenience. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
