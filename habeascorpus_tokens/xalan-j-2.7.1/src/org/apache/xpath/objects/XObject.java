/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XObject.java 469368 2006-10-31 04:41:36Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XObject.java 469368 2006-10-31 04:41:36Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMIterator	TokenNameIdentifier	 DTM Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
Expression	TokenNameIdentifier	 Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathException	TokenNameIdentifier	 X Path Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DocumentFragment	TokenNameIdentifier	 Document Fragment
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
/** * This class represents an XPath object, and is capable of * converting the object to various types, such as a string. * This class acts as the base class to other XPath type objects, * such as XString, and provides polymorphic casting capabilities. * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class represents an XPath object, and is capable of converting the object to various types, such as a string. This class acts as the base class to other XPath type objects, such as XString, and provides polymorphic casting capabilities. @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
XObject	TokenNameIdentifier	 X Object
extends	TokenNameextends	
Expression	TokenNameIdentifier	 Expression
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
821887098985662951L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The java object which this object wraps. * @serial */	TokenNameCOMMENT_JAVADOC	 The java object which this object wraps. @serial 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
m_obj	TokenNameIdentifier	 m obj
;	TokenNameSEMICOLON	
// This may be NULL!!! 	TokenNameCOMMENT_LINE	This may be NULL!!! 
/** * Create an XObject. */	TokenNameCOMMENT_JAVADOC	 Create an XObject. 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Create an XObject. * * @param obj Can be any object, should be a specific type * for derived classes, or null. */	TokenNameCOMMENT_JAVADOC	 Create an XObject. * @param obj Can be any object, should be a specific type for derived classes, or null. 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_obj	TokenNameIdentifier	 m obj
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For support of literal objects in xpaths. * * @param xctxt The XPath execution context. * * @return This object. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 For support of literal objects in xpaths. * @param xctxt The XPath execution context. * @return This object. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify if it's OK for detach to release the iterator for reuse. * This function should be called with a value of false for objects that are * stored in variables. * Calling this with a value of false on a XNodeSet will cause the nodeset * to be cached. * * @param allowRelease true if it is OK for detach to release this iterator * for pooling. */	TokenNameCOMMENT_JAVADOC	 Specify if it's OK for detach to release the iterator for reuse. This function should be called with a value of false for objects that are stored in variables. Calling this with a value of false on a XNodeSet will cause the nodeset to be cached. * @param allowRelease true if it is OK for detach to release this iterator for pooling. 
public	TokenNamepublic	
void	TokenNamevoid	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowRelease	TokenNameIdentifier	 allow Release
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Detaches the <code>DTMIterator</code> from the set which it iterated * over, releasing any computational resources and placing the iterator * in the INVALID state. After <code>detach</code> has been invoked, * calls to <code>nextNode</code> or <code>previousNode</code> will * raise a runtime exception. */	TokenNameCOMMENT_JAVADOC	 Detaches the <code>DTMIterator</code> from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. After <code>detach</code> has been invoked, calls to <code>nextNode</code> or <code>previousNode</code> will raise a runtime exception. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Forces the object to release it's resources. This is more harsh than * detach(). */	TokenNameCOMMENT_JAVADOC	 Forces the object to release it's resources. This is more harsh than detach(). 
public	TokenNamepublic	
void	TokenNamevoid	
destruct	TokenNameIdentifier	 destruct
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reset for fresh reuse. */	TokenNameCOMMENT_JAVADOC	 Reset for fresh reuse. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Directly call the * characters method on the passed ContentHandler for the * string-value. Multiple calls to the * ContentHandler's characters methods may well occur for a single call to * this method. * * @param ch A non-null reference to a ContentHandler. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Directly call the characters method on the passed ContentHandler for the string-value. Multiple calls to the ContentHandler's characters methods may well occur for a single call to this method. * @param ch A non-null reference to a ContentHandler. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create the right XObject based on the type of the object passed. This * function can not make an XObject that exposes DOM Nodes, NodeLists, and * NodeIterators to the XSLT stylesheet as node-sets. * * @param val The java object which this object will wrap. * * @return the right XObject based on the type of the object passed. */	TokenNameCOMMENT_JAVADOC	 Create the right XObject based on the type of the object passed. This function can not make an XObject that exposes DOM Nodes, NodeLists, and NodeIterators to the XSLT stylesheet as node-sets. * @param val The java object which this object will wrap. * @return the right XObject based on the type of the object passed. 
static	TokenNamestatic	
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XObjectFactory	TokenNameIdentifier	 X Object Factory
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create the right XObject based on the type of the object passed. * This function <emph>can</emph> make an XObject that exposes DOM Nodes, NodeLists, and * NodeIterators to the XSLT stylesheet as node-sets. * * @param val The java object which this object will wrap. * @param xctxt The XPath context. * * @return the right XObject based on the type of the object passed. */	TokenNameCOMMENT_JAVADOC	 Create the right XObject based on the type of the object passed. This function <emph>can</emph> make an XObject that exposes DOM Nodes, NodeLists, and NodeIterators to the XSLT stylesheet as node-sets. * @param val The java object which this object will wrap. @param xctxt The XPath context. * @return the right XObject based on the type of the object passed. 
static	TokenNamestatic	
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XObjectFactory	TokenNameIdentifier	 X Object Factory
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constant for NULL object type */	TokenNameCOMMENT_JAVADOC	 Constant for NULL object type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_NULL	TokenNameIdentifier	 CLASS  NULL
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for UNKNOWN object type */	TokenNameCOMMENT_JAVADOC	 Constant for UNKNOWN object type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_UNKNOWN	TokenNameIdentifier	 CLASS  UNKNOWN
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for BOOLEAN object type */	TokenNameCOMMENT_JAVADOC	 Constant for BOOLEAN object type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_BOOLEAN	TokenNameIdentifier	 CLASS  BOOLEAN
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for NUMBER object type */	TokenNameCOMMENT_JAVADOC	 Constant for NUMBER object type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for STRING object type */	TokenNameCOMMENT_JAVADOC	 Constant for STRING object type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_STRING	TokenNameIdentifier	 CLASS  STRING
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for NODESET object type */	TokenNameCOMMENT_JAVADOC	 Constant for NODESET object type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for RESULT TREE FRAGMENT object type */	TokenNameCOMMENT_JAVADOC	 Constant for RESULT TREE FRAGMENT object type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_RTREEFRAG	TokenNameIdentifier	 CLASS  RTREEFRAG
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Represents an unresolved variable type as an integer. */	TokenNameCOMMENT_JAVADOC	 Represents an unresolved variable type as an integer. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_UNRESOLVEDVARIABLE	TokenNameIdentifier	 CLASS  UNRESOLVEDVARIABLE
=	TokenNameEQUAL	
600	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Tell what kind of class this is. * * @return CLASS_UNKNOWN */	TokenNameCOMMENT_JAVADOC	 Tell what kind of class this is. * @return CLASS_UNKNOWN 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CLASS_UNKNOWN	TokenNameIdentifier	 CLASS  UNKNOWN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a request type, return the equivalent string. * For diagnostic purposes. * * @return type string "#UNKNOWN" + object class name */	TokenNameCOMMENT_JAVADOC	 Given a request type, return the equivalent string. For diagnostic purposes. * @return type string "#UNKNOWN" + object class name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#UNKNOWN ("	TokenNameStringLiteral	#UNKNOWN (
+	TokenNamePLUS	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a number. Always issues an error. * * @return 0.0 * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a number. Always issues an error. * @return 0.0 * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANT_CONVERT_TO_NUMBER	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NUMBER
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not convert "+getTypeString()+" to a number"); 	TokenNameCOMMENT_LINE	"Can not convert "+getTypeString()+" to a number"); 
return	TokenNamereturn	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a number, but allow side effects, such as the * incrementing of an iterator. * * @return numeric value of the string conversion from the * next node in the NodeSetDTM, or NAN if no node was found */	TokenNameCOMMENT_JAVADOC	 Cast result object to a number, but allow side effects, such as the incrementing of an iterator. * @return numeric value of the string conversion from the next node in the NodeSetDTM, or NAN if no node was found 
public	TokenNamepublic	
double	TokenNamedouble	
numWithSideEffects	TokenNameIdentifier	 num With Side Effects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a boolean. Always issues an error. * * @return false * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a boolean. Always issues an error. * @return false * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANT_CONVERT_TO_NUMBER	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NUMBER
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not convert "+getTypeString()+" to a number"); 	TokenNameCOMMENT_LINE	"Can not convert "+getTypeString()+" to a number"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a boolean, but allow side effects, such as the * incrementing of an iterator. * * @return True if there is a next node in the nodeset */	TokenNameCOMMENT_JAVADOC	 Cast result object to a boolean, but allow side effects, such as the incrementing of an iterator. * @return True if there is a next node in the nodeset 
public	TokenNamepublic	
boolean	TokenNameboolean	
boolWithSideEffects	TokenNameIdentifier	 bool With Side Effects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The string this wraps or the empty string if null */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The string this wraps or the empty string if null 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLStringFactoryImpl	TokenNameIdentifier	 XML String Factory Impl
.	TokenNameDOT	
getFactory	TokenNameIdentifier	 get Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The object as a string */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The object as a string 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_obj	TokenNameIdentifier	 m obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_obj	TokenNameIdentifier	 m obj
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the string representation of the object * * * @return the string representation of the object */	TokenNameCOMMENT_JAVADOC	 Return the string representation of the object * @return the string representation of the object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a result tree fragment. * * @param support XPath context to use for the conversion * * @return the objec as a result tree fragment. */	TokenNameCOMMENT_JAVADOC	 Cast result object to a result tree fragment. * @param support XPath context to use for the conversion * @return the objec as a result tree fragment. 
public	TokenNamepublic	
int	TokenNameint	
rtf	TokenNameIdentifier	 rtf
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
rtf	TokenNameIdentifier	 rtf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
support	TokenNameIdentifier	 support
.	TokenNameDOT	
createDocumentFragment	TokenNameIdentifier	 create Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %OPT% 	TokenNameCOMMENT_LINE	%OPT% 
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendTextChild	TokenNameIdentifier	 append Text Child
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a result tree fragment. * * @param support XPath context to use for the conversion * * @return the objec as a result tree fragment. */	TokenNameCOMMENT_JAVADOC	 Cast result object to a result tree fragment. * @param support XPath context to use for the conversion * @return the objec as a result tree fragment. 
public	TokenNamepublic	
DocumentFragment	TokenNameIdentifier	 Document Fragment
rtree	TokenNameIdentifier	 rtree
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentFragment	TokenNameIdentifier	 Document Fragment
docFrag	TokenNameIdentifier	 doc Frag
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
rtf	TokenNameIdentifier	 rtf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
support	TokenNameIdentifier	 support
.	TokenNameDOT	
createDocumentFragment	TokenNameIdentifier	 create Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %OPT% 	TokenNameCOMMENT_LINE	%OPT% 
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendTextChild	TokenNameIdentifier	 append Text Child
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docFrag	TokenNameIdentifier	 doc Frag
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentFragment	TokenNameIdentifier	 Document Fragment
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
support	TokenNameIdentifier	 support
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docFrag	TokenNameIdentifier	 doc Frag
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentFragment	TokenNameIdentifier	 Document Fragment
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
docFrag	TokenNameIdentifier	 doc Frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For functions to override. * * @return null */	TokenNameCOMMENT_JAVADOC	 For functions to override. * @return null 
public	TokenNamepublic	
DocumentFragment	TokenNameIdentifier	 Document Fragment
rtree	TokenNameIdentifier	 rtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For functions to override. * * @return null */	TokenNameCOMMENT_JAVADOC	 For functions to override. * @return null 
public	TokenNamepublic	
int	TokenNameint	
rtf	TokenNameIdentifier	 rtf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a java object that's closest to the representation * that should be handed to an extension. * * @return The object that this class wraps */	TokenNameCOMMENT_JAVADOC	 Return a java object that's closest to the representation that should be handed to an extension. * @return The object that this class wraps 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_obj	TokenNameIdentifier	 m obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a nodelist. Always issues an error. * * @return null * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a nodelist. Always issues an error. * @return null * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANT_CONVERT_TO_NODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NODELIST
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not convert "+getTypeString()+" to a NodeList!"); 	TokenNameCOMMENT_LINE	"Can not convert "+getTypeString()+" to a NodeList!"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a fresh copy of the object. For use with variables. * * @return This object, unless overridden by subclass. */	TokenNameCOMMENT_JAVADOC	 Get a fresh copy of the object. For use with variables. * @return This object, unless overridden by subclass. 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
getFresh	TokenNameIdentifier	 get Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a nodelist. Always issues an error. * * @return null * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a nodelist. Always issues an error. * @return null * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
nodeset	TokenNameIdentifier	 nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANT_CONVERT_TO_NODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NODELIST
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not convert "+getTypeString()+" to a NodeList!"); 	TokenNameCOMMENT_LINE	"Can not convert "+getTypeString()+" to a NodeList!"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a nodelist. Always issues an error. * * @return null * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a nodelist. Always issues an error. * @return null * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
nodelist	TokenNameIdentifier	 nodelist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANT_CONVERT_TO_NODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NODELIST
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not convert "+getTypeString()+" to a NodeList!"); 	TokenNameCOMMENT_LINE	"Can not convert "+getTypeString()+" to a NodeList!"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a nodelist. Always issues an error. * * @return The object as a NodeSetDTM. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a nodelist. Always issues an error. * @return The object as a NodeSetDTM. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
mutableNodeset	TokenNameIdentifier	 mutable Nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANT_CONVERT_TO_MUTABLENODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  MUTABLENODELIST
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not convert "+getTypeString()+" to a NodeSetDTM!"); 	TokenNameCOMMENT_LINE	"Can not convert "+getTypeString()+" to a NodeSetDTM!"); 
return	TokenNamereturn	
(	TokenNameLPAREN	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast object to type t. * * @param t Type of object to cast this to * @param support XPath context to use for the conversion * * @return This object as the given type t * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast object to type t. * @param t Type of object to cast this to @param support XPath context to use for the conversion * @return This object as the given type t * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
castToType	TokenNameIdentifier	 cast To Type
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CLASS_STRING	TokenNameIdentifier	 CLASS  STRING
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLASS_BOOLEAN	TokenNameIdentifier	 CLASS  BOOLEAN
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLASS_UNKNOWN	TokenNameIdentifier	 CLASS  UNKNOWN
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
m_obj	TokenNameIdentifier	 m obj
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// %TBD% What to do here? 	TokenNameCOMMENT_LINE	%TBD% What to do here? 
// case CLASS_RTREEFRAG : 	TokenNameCOMMENT_LINE	case CLASS_RTREEFRAG : 
// result = rtree(support); 	TokenNameCOMMENT_LINE	result = rtree(support); 
// break; 	TokenNameCOMMENT_LINE	break; 
default	TokenNamedefault	
:	TokenNameCOLON	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANT_CONVERT_TO_TYPE	TokenNameIdentifier	 ER  CANT  CONVERT  TO  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not convert "+getTypeString()+" to a type#"+t); 	TokenNameCOMMENT_LINE	"Can not convert "+getTypeString()+" to a type#"+t); 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if one object is less than the other. * * @param obj2 Object to compare this to * * @return True if this object is less than the given object * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if one object is less than the other. * @param obj2 Object to compare this to * @return True if this object is less than the given object * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. Because the arguments 	TokenNameCOMMENT_LINE	nodeset function. Because the arguments 
// are backwards, we call the opposite comparison 	TokenNameCOMMENT_LINE	are backwards, we call the opposite comparison 
// function. 	TokenNameCOMMENT_LINE	function. 
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
greaterThan	TokenNameIdentifier	 greater Than
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if one object is less than or equal to the other. * * @param obj2 Object to compare this to * * @return True if this object is less than or equal to the given object * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if one object is less than or equal to the other. * @param obj2 Object to compare this to * @return True if this object is less than or equal to the given object * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
lessThanOrEqual	TokenNameIdentifier	 less Than Or Equal
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. Because the arguments 	TokenNameCOMMENT_LINE	nodeset function. Because the arguments 
// are backwards, we call the opposite comparison 	TokenNameCOMMENT_LINE	are backwards, we call the opposite comparison 
// function. 	TokenNameCOMMENT_LINE	function. 
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
greaterThanOrEqual	TokenNameIdentifier	 greater Than Or Equal
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if one object is greater than the other. * * @param obj2 Object to compare this to * * @return True if this object is greater than the given object * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if one object is greater than the other. * @param obj2 Object to compare this to * @return True if this object is greater than the given object * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
greaterThan	TokenNameIdentifier	 greater Than
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. Because the arguments 	TokenNameCOMMENT_LINE	nodeset function. Because the arguments 
// are backwards, we call the opposite comparison 	TokenNameCOMMENT_LINE	are backwards, we call the opposite comparison 
// function. 	TokenNameCOMMENT_LINE	function. 
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if one object is greater than or equal to the other. * * @param obj2 Object to compare this to * * @return True if this object is greater than or equal to the given object * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if one object is greater than or equal to the other. * @param obj2 Object to compare this to * @return True if this object is greater than or equal to the given object * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
greaterThanOrEqual	TokenNameIdentifier	 greater Than Or Equal
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. Because the arguments 	TokenNameCOMMENT_LINE	nodeset function. Because the arguments 
// are backwards, we call the opposite comparison 	TokenNameCOMMENT_LINE	are backwards, we call the opposite comparison 
// function. 	TokenNameCOMMENT_LINE	function. 
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
lessThanOrEqual	TokenNameIdentifier	 less Than Or Equal
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if two objects are functionally equal. * * @param obj2 Object to compare this to * * @return True if this object is equal to the given object * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if two objects are functionally equal. * @param obj2 Object to compare this to * @return True if this object is equal to the given object * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. 	TokenNameCOMMENT_LINE	nodeset function. 
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_obj	TokenNameIdentifier	 m obj
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
m_obj	TokenNameIdentifier	 m obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell if two objects are functionally not equal. * * @param obj2 Object to compare this to * * @return True if this object is not equal to the given object * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if two objects are functionally not equal. * @param obj2 Object to compare this to * @return True if this object is not equal to the given object * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
notEquals	TokenNameIdentifier	 not Equals
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. 	TokenNameCOMMENT_LINE	nodeset function. 
if	TokenNameif	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
notEquals	TokenNameIdentifier	 not Equals
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param msg Error message to issue * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param msg Error message to issue * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param msg Error message to issue * @param args Arguments to use in the message * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param msg Error message to issue @param args Arguments to use in the message * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// boolean shouldThrow = support.problem(m_support.XPATHPROCESSOR, 	TokenNameCOMMENT_LINE	boolean shouldThrow = support.problem(m_support.XPATHPROCESSOR, 
// m_support.ERROR, 	TokenNameCOMMENT_LINE	m_support.ERROR, 
// null, 	TokenNameCOMMENT_LINE	null, 
// null, fmsg, 0, 0); 	TokenNameCOMMENT_LINE	null, fmsg, 0, 0); 
// if(shouldThrow) 	TokenNameCOMMENT_LINE	if(shouldThrow) 
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * XObjects should not normally need to fix up variables. */	TokenNameCOMMENT_JAVADOC	 XObjects should not normally need to fix up variables. 
public	TokenNamepublic	
void	TokenNamevoid	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
int	TokenNameint	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no-op 	TokenNameCOMMENT_LINE	no-op 
}	TokenNameRBRACE	
/** * Cast result object to a string. * * * NEEDSDOC @param fsb * @return The string this wraps or the empty string if null */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * NEEDSDOC @param fsb @return The string this wraps or the empty string if null 
public	TokenNamepublic	
void	TokenNamevoid	
appendToFsb	TokenNameIdentifier	 append To Fsb
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"callVisitors should not be called for this object!!!"	TokenNameStringLiteral	callVisitors should not be called for this object!!!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Expression#deepEquals(Expression) */	TokenNameCOMMENT_JAVADOC	 @see Expression#deepEquals(Expression) 
public	TokenNamepublic	
boolean	TokenNameboolean	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSameClass	TokenNameIdentifier	 is Same Class
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// If equals at the expression level calls deepEquals, I think we're 	TokenNameCOMMENT_LINE	If equals at the expression level calls deepEquals, I think we're 
// still safe from infinite recursion since this object overrides 	TokenNameCOMMENT_LINE	still safe from infinite recursion since this object overrides 
// equals. I hope. 	TokenNameCOMMENT_LINE	equals. I hope. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
