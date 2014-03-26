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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @author Rahul Srivastava, Sun Microsystems Inc. * @author Sandy Gao, IBM * * @version $Id: ElementImpl.java 779171 2009-05-27 13:42:33Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Rahul Srivastava, Sun Microsystems Inc. @author Sandy Gao, IBM * @version $Id: ElementImpl.java 779171 2009-05-27 13:42:33Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ElementImpl	TokenNameIdentifier	 Element Impl
extends	TokenNameextends	
DefaultElement	TokenNameIdentifier	 Default Element
{	TokenNameLBRACE	
SchemaDOM	TokenNameIdentifier	 Schema DOM
schemaDOM	TokenNameIdentifier	 schema DOM
;	TokenNameSEMICOLON	
Attr	TokenNameIdentifier	 Attr
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrs	TokenNameIdentifier	 attrs
;	TokenNameSEMICOLON	
int	TokenNameint	
row	TokenNameIdentifier	 row
;	TokenNameSEMICOLON	
int	TokenNameint	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
int	TokenNameint	
parentRow	TokenNameIdentifier	 parent Row
;	TokenNameSEMICOLON	
int	TokenNameint	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
int	TokenNameint	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
int	TokenNameint	
charOffset	TokenNameIdentifier	 char Offset
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fAnnotation	TokenNameIdentifier	 f Annotation
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fSyntheticAnnotation	TokenNameIdentifier	 f Synthetic Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ElementImpl	TokenNameIdentifier	 Element Impl
(	TokenNameLPAREN	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
parentRow	TokenNameIdentifier	 parent Row
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ElementImpl	TokenNameIdentifier	 Element Impl
(	TokenNameLPAREN	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ElementImpl	TokenNameIdentifier	 Element Impl
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
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
parentRow	TokenNameIdentifier	 parent Row
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ElementImpl	TokenNameIdentifier	 Element Impl
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
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// org.w3c.dom.Node methods 	TokenNameCOMMENT_LINE	org.w3c.dom.Node methods 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
schemaDOM	TokenNameIdentifier	 schema DOM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
schemaDOM	TokenNameIdentifier	 schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
row	TokenNameIdentifier	 row
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parentRow	TokenNameIdentifier	 parent Row
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parentRow	TokenNameIdentifier	 parent Row
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
schemaDOM	TokenNameIdentifier	 schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
parentRow	TokenNameIdentifier	 parent Row
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parentRow	TokenNameIdentifier	 parent Row
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
schemaDOM	TokenNameIdentifier	 schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
parentRow	TokenNameIdentifier	 parent Row
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
schemaDOM	TokenNameIdentifier	 schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
parentRow	TokenNameIdentifier	 parent Row
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
schemaDOM	TokenNameIdentifier	 schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
parentRow	TokenNameIdentifier	 parent Row
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
schemaDOM	TokenNameIdentifier	 schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
parentRow	TokenNameIdentifier	 parent Row
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
schemaDOM	TokenNameIdentifier	 schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
row	TokenNameIdentifier	 row
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
col	TokenNameIdentifier	 col
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
==	TokenNameEQUAL_EQUAL	
schemaDOM	TokenNameIdentifier	 schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
row	TokenNameIdentifier	 row
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
schemaDOM	TokenNameIdentifier	 schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
row	TokenNameIdentifier	 row
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
col	TokenNameIdentifier	 col
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// org.w3c.dom.Element methods 	TokenNameCOMMENT_LINE	org.w3c.dom.Element methods 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Attr	TokenNameIdentifier	 Attr
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
nsEquals	TokenNameIdentifier	 ns Equals
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Attr	TokenNameIdentifier	 Attr
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
nsEquals	TokenNameIdentifier	 ns Equals
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttributeNS	TokenNameIdentifier	 has Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
nsEquals	TokenNameIdentifier	 ns Equals
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the line number. */	TokenNameCOMMENT_JAVADOC	 Returns the line number. 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the column number. */	TokenNameCOMMENT_JAVADOC	 Returns the column number. 
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the character offset. */	TokenNameCOMMENT_JAVADOC	 Returns the character offset. 
public	TokenNamepublic	
int	TokenNameint	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
charOffset	TokenNameIdentifier	 char Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAnnotation	TokenNameIdentifier	 get Annotation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAnnotation	TokenNameIdentifier	 f Annotation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSyntheticAnnotation	TokenNameIdentifier	 get Synthetic Annotation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSyntheticAnnotation	TokenNameIdentifier	 f Synthetic Annotation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares two namespace URIs with an extra case for null entries */	TokenNameCOMMENT_JAVADOC	 Compares two namespace URIs with an extra case for null entries 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
nsEquals	TokenNameIdentifier	 ns Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nsURI_1	TokenNameIdentifier	 ns URI 1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nsURI_2	TokenNameIdentifier	 ns URI 2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nsURI_1	TokenNameIdentifier	 ns URI 1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
nsURI_2	TokenNameIdentifier	 ns URI 2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
nsURI_1	TokenNameIdentifier	 ns URI 1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nsURI_2	TokenNameIdentifier	 ns URI 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
