/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XRTreeFrag.java 469368 2006-10-31 04:41:36Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XRTreeFrag.java 469368 2006-10-31 04:41:36Z minchau $ 
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
ExpressionNode	TokenNameIdentifier	 Expression Node
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
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
RTFIterator	TokenNameIdentifier	 RTF Iterator
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
/** * This class represents an XPath result tree fragment object, and is capable of * converting the RTF to other types, such as a string. * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class represents an XPath result tree fragment object, and is capable of converting the RTF to other types, such as a string. @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
extends	TokenNameextends	
XObject	TokenNameIdentifier	 X Object
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
3201553822254911567L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DTMXRTreeFrag	TokenNameIdentifier	 DTMXR Tree Frag
m_DTMXRTreeFrag	TokenNameIdentifier	 m  DTMXR Tree Frag
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
m_dtmRoot	TokenNameIdentifier	 m dtm Root
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_allowRelease	TokenNameIdentifier	 m allow Release
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Create an XRTreeFrag Object. * */	TokenNameCOMMENT_JAVADOC	 Create an XRTreeFrag Object. 
public	TokenNamepublic	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
(	TokenNameLPAREN	
int	TokenNameint	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
ExpressionNode	TokenNameIdentifier	 Expression Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initDTM	TokenNameIdentifier	 init DTM
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XRTreeFrag Object. * */	TokenNameCOMMENT_JAVADOC	 Create an XRTreeFrag Object. 
public	TokenNamepublic	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
(	TokenNameLPAREN	
int	TokenNameint	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initDTM	TokenNameIdentifier	 init DTM
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
initDTM	TokenNameIdentifier	 init DTM
(	TokenNameLPAREN	
int	TokenNameint	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dtmRoot	TokenNameIdentifier	 m dtm Root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_DTMXRTreeFrag	TokenNameIdentifier	 m  DTMXR Tree Frag
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMXRTreeFrag	TokenNameIdentifier	 get DTMXR Tree Frag
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMIdentity	TokenNameIdentifier	 get DTM Identity
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return a java object that's closest to the representation * that should be handed to an extension. * * @return The object that this class wraps */	TokenNameCOMMENT_JAVADOC	 Return a java object that's closest to the representation that should be handed to an extension. * @return The object that this class wraps 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_DTMXRTreeFrag	TokenNameIdentifier	 m  DTMXR Tree Frag
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMNodeIterator	TokenNameIdentifier	 DTM Node Iterator
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
m_dtmRoot	TokenNameIdentifier	 m dtm Root
,	TokenNameCOMMA	
m_DTMXRTreeFrag	TokenNameIdentifier	 m  DTMXR Tree Frag
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XRTreeFrag Object. * */	TokenNameCOMMENT_JAVADOC	 Create an XRTreeFrag Object. 
public	TokenNamepublic	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify if it's OK for detach to release the iterator for reuse. * * @param allowRelease true if it is OK for detach to release this iterator * for pooling. */	TokenNameCOMMENT_JAVADOC	 Specify if it's OK for detach to release the iterator for reuse. * @param allowRelease true if it is OK for detach to release this iterator for pooling. 
public	TokenNamepublic	
void	TokenNamevoid	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowRelease	TokenNameIdentifier	 allow Release
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_allowRelease	TokenNameIdentifier	 m allow Release
=	TokenNameEQUAL	
allowRelease	TokenNameIdentifier	 allow Release
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Detaches the <code>DTMIterator</code> from the set which it iterated * over, releasing any computational resources and placing the iterator * in the INVALID state. After <code>detach</code> has been invoked, * calls to <code>nextNode</code> or <code>previousNode</code> will * raise a runtime exception. * * In general, detach should only be called once on the object. */	TokenNameCOMMENT_JAVADOC	 Detaches the <code>DTMIterator</code> from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. After <code>detach</code> has been invoked, calls to <code>nextNode</code> or <code>previousNode</code> will raise a runtime exception. * In general, detach should only be called once on the object. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_allowRelease	TokenNameIdentifier	 m allow Release
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_DTMXRTreeFrag	TokenNameIdentifier	 m  DTMXR Tree Frag
.	TokenNameDOT	
destruct	TokenNameIdentifier	 destruct
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
/** * Tell what kind of class this is. * * @return type CLASS_RTREEFRAG */	TokenNameCOMMENT_JAVADOC	 Tell what kind of class this is. * @return type CLASS_RTREEFRAG 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CLASS_RTREEFRAG	TokenNameIdentifier	 CLASS  RTREEFRAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a request type, return the equivalent string. * For diagnostic purposes. * * @return type string "#RTREEFRAG" */	TokenNameCOMMENT_JAVADOC	 Given a request type, return the equivalent string. For diagnostic purposes. * @return type string "#RTREEFRAG" 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#RTREEFRAG"	TokenNameStringLiteral	#RTREEFRAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a number. * * @return The result tree fragment as a number or NaN */	TokenNameCOMMENT_JAVADOC	 Cast result object to a number. * @return The result tree fragment as a number or NaN 
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
XMLString	TokenNameIdentifier	 XML String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a boolean. This always returns true for a RTreeFrag * because it is treated like a node-set with a single root node. * * @return true */	TokenNameCOMMENT_JAVADOC	 Cast result object to a boolean. This always returns true for a RTreeFrag because it is treated like a node-set with a single root node. * @return true 
public	TokenNamepublic	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
XMLString	TokenNameIdentifier	 XML String
m_xmlStr	TokenNameIdentifier	 m xml Str
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Cast result object to an XMLString. * * @return The document fragment node data or the empty string. */	TokenNameCOMMENT_JAVADOC	 Cast result object to an XMLString. * @return The document fragment node data or the empty string. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_xmlStr	TokenNameIdentifier	 m xml Str
)	TokenNameRPAREN	
m_xmlStr	TokenNameIdentifier	 m xml Str
=	TokenNameEQUAL	
m_DTMXRTreeFrag	TokenNameIdentifier	 m  DTMXR Tree Frag
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
m_dtmRoot	TokenNameIdentifier	 m dtm Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_xmlStr	TokenNameIdentifier	 m xml Str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The string this wraps or the empty string if null */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The string this wraps or the empty string if null 
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
XString	TokenNameIdentifier	 X String
xstring	TokenNameIdentifier	 xstring
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XString	TokenNameIdentifier	 X String
)	TokenNameRPAREN	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xstring	TokenNameIdentifier	 xstring
.	TokenNameDOT	
appendToFsb	TokenNameIdentifier	 append To Fsb
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The document fragment node data or the empty string. */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The document fragment node data or the empty string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
m_DTMXRTreeFrag	TokenNameIdentifier	 m  DTMXR Tree Frag
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
m_dtmRoot	TokenNameIdentifier	 m dtm Root
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a result tree fragment. * * @return The document fragment this wraps */	TokenNameCOMMENT_JAVADOC	 Cast result object to a result tree fragment. * @return The document fragment this wraps 
public	TokenNamepublic	
int	TokenNameint	
rtf	TokenNameIdentifier	 rtf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmRoot	TokenNameIdentifier	 m dtm Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a DTMIterator. * dml - modified to return an RTFIterator for * benefit of EXSLT object-type function in * {@link org.apache.xalan.lib.ExsltCommon}. * @return The document fragment as a DTMIterator */	TokenNameCOMMENT_JAVADOC	 Cast result object to a DTMIterator. dml - modified to return an RTFIterator for benefit of EXSLT object-type function in {@link org.apache.xalan.lib.ExsltCommon}. @return The document fragment as a DTMIterator 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
asNodeIterator	TokenNameIdentifier	 as Node Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RTFIterator	TokenNameIdentifier	 RTF Iterator
(	TokenNameLPAREN	
m_dtmRoot	TokenNameIdentifier	 m dtm Root
,	TokenNameCOMMA	
m_DTMXRTreeFrag	TokenNameIdentifier	 m  DTMXR Tree Frag
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a nodelist. (special function). * * @return The document fragment as a nodelist */	TokenNameCOMMENT_JAVADOC	 Cast result object to a nodelist. (special function). * @return The document fragment as a nodelist 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
convertToNodeset	TokenNameIdentifier	 convert To Nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_obj	TokenNameIdentifier	 m obj
instanceof	TokenNameinstanceof	
NodeList	TokenNameIdentifier	 Node List
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMNodeList	TokenNameIdentifier	 DTM Node List
(	TokenNameLPAREN	
asNodeIterator	TokenNameIdentifier	 as Node Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if two objects are functionally equal. * * @param obj2 Object to compare this to * * @return True if the two objects are equal * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if two objects are functionally equal. * @param obj2 Object to compare this to * @return True if the two objects are equal * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. 	TokenNameCOMMENT_LINE	nodeset function. 
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_BOOLEAN	TokenNameIdentifier	 CLASS  BOOLEAN
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_STRING	TokenNameIdentifier	 CLASS  STRING
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_RTREEFRAG	TokenNameIdentifier	 CLASS  RTREEFRAG
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Probably not so good. Think about this. 	TokenNameCOMMENT_LINE	Probably not so good. Think about this. 
return	TokenNamereturn	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
