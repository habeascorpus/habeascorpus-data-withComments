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
Augmentations	TokenNameIdentifier	 Augmentations
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
QName	TokenNameIdentifier	 Q Name
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
XMLAttributes	TokenNameIdentifier	 XML Attributes
;	TokenNameSEMICOLON	
/** * The XMLAttributesImpl class is an implementation of the XMLAttributes * interface which defines a collection of attributes for an element. * In the parser, the document source would scan the entire start element * and collect the attributes. The attributes are communicated to the * document handler in the startElement method. * <p> * The attributes are read-write so that subsequent stages in the document * pipeline can modify the values or change the attributes that are * propogated to the next stage. * * @see org.apache.xerces.xni.XMLDocumentHandler#startElement * * @author Andy Clark, IBM * @author Elena Litani, IBM * @author Michael Glavassevich, IBM * * @version $Id: XMLAttributesImpl.java 937816 2010-04-25 16:22:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The XMLAttributesImpl class is an implementation of the XMLAttributes interface which defines a collection of attributes for an element. In the parser, the document source would scan the entire start element and collect the attributes. The attributes are communicated to the document handler in the startElement method. <p> The attributes are read-write so that subsequent stages in the document pipeline can modify the values or change the attributes that are propogated to the next stage. * @see org.apache.xerces.xni.XMLDocumentHandler#startElement * @author Andy Clark, IBM @author Elena Litani, IBM @author Michael Glavassevich, IBM * @version $Id: XMLAttributesImpl.java 937816 2010-04-25 16:22:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLAttributesImpl	TokenNameIdentifier	 XML Attributes Impl
implements	TokenNameimplements	
XMLAttributes	TokenNameIdentifier	 XML Attributes
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default table size. */	TokenNameCOMMENT_JAVADOC	 Default table size. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TABLE_SIZE	TokenNameIdentifier	 TABLE  SIZE
=	TokenNameEQUAL	
101	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Threshold at which an instance is treated * as a large attribute list. */	TokenNameCOMMENT_JAVADOC	 Threshold at which an instance is treated as a large attribute list. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SIZE_LIMIT	TokenNameIdentifier	 SIZE  LIMIT
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
// features 	TokenNameCOMMENT_LINE	features 
/** Namespaces. */	TokenNameCOMMENT_JAVADOC	 Namespaces. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// data 	TokenNameCOMMENT_LINE	data 
/** * Usage count for the attribute table view. * Incremented each time all attributes are removed * when the attribute table view is in use. */	TokenNameCOMMENT_JAVADOC	 Usage count for the attribute table view. Incremented each time all attributes are removed when the attribute table view is in use. 
protected	TokenNameprotected	
int	TokenNameint	
fLargeCount	TokenNameIdentifier	 f Large Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Attribute count. */	TokenNameCOMMENT_JAVADOC	 Attribute count. 
protected	TokenNameprotected	
int	TokenNameint	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
/** Attribute information. */	TokenNameCOMMENT_JAVADOC	 Attribute information. 
protected	TokenNameprotected	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Hashtable of attribute information. * Provides an alternate view of the attribute specification. */	TokenNameCOMMENT_JAVADOC	 Hashtable of attribute information. Provides an alternate view of the attribute specification. 
protected	TokenNameprotected	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
;	TokenNameSEMICOLON	
/** * Tracks whether each chain in the hash table is stale * with respect to the current state of this object. * A chain is stale if its state is not the same as the number * of times the attribute table view has been used. */	TokenNameCOMMENT_JAVADOC	 Tracks whether each chain in the hash table is stale with respect to the current state of this object. A chain is stale if its state is not the same as the number of times the attribute table view has been used. 
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fAttributeTableViewChainState	TokenNameIdentifier	 f Attribute Table View Chain State
;	TokenNameSEMICOLON	
/** * Actual number of buckets in the table view. */	TokenNameCOMMENT_JAVADOC	 Actual number of buckets in the table view. 
protected	TokenNameprotected	
int	TokenNameint	
fTableViewBuckets	TokenNameIdentifier	 f Table View Buckets
;	TokenNameSEMICOLON	
/** * Indicates whether the table view contains consistent data. */	TokenNameCOMMENT_JAVADOC	 Indicates whether the table view contains consistent data. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fIsTableViewConsistent	TokenNameIdentifier	 f Is Table View Consistent
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
XMLAttributesImpl	TokenNameIdentifier	 XML Attributes Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
TABLE_SIZE	TokenNameIdentifier	 TABLE  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param tableSize initial size of table view */	TokenNameCOMMENT_JAVADOC	 @param tableSize initial size of table view 
public	TokenNamepublic	
XMLAttributesImpl	TokenNameIdentifier	 XML Attributes Impl
(	TokenNameLPAREN	
int	TokenNameint	
tableSize	TokenNameIdentifier	 table Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fTableViewBuckets	TokenNameIdentifier	 f Table View Buckets
=	TokenNameEQUAL	
tableSize	TokenNameIdentifier	 table Size
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets whether namespace processing is being performed. This state * is needed to return the correct value from the getLocalName method. * * @param namespaces True if namespace processing is turned on. * * @see #getLocalName */	TokenNameCOMMENT_JAVADOC	 Sets whether namespace processing is being performed. This state is needed to return the correct value from the getLocalName method. * @param namespaces True if namespace processing is turned on. * @see #getLocalName 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespaces	TokenNameIdentifier	 set Namespaces
(	TokenNameLPAREN	
boolean	TokenNameboolean	
namespaces	TokenNameIdentifier	 namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
namespaces	TokenNameIdentifier	 namespaces
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setNamespaces(boolean) 	TokenNameCOMMENT_LINE	setNamespaces(boolean) 
// 	TokenNameCOMMENT_LINE	 
// XMLAttributes methods 	TokenNameCOMMENT_LINE	XMLAttributes methods 
// 	TokenNameCOMMENT_LINE	 
/** * Adds an attribute. The attribute's non-normalized value of the * attribute will have the same value as the attribute value until * set using the <code>setNonNormalizedValue</code> method. Also, * the added attribute will be marked as specified in the XML instance * document unless set otherwise using the <code>setSpecified</code> * method. * <p> * <strong>Note:</strong> If an attribute of the same name already * exists, the old values for the attribute are replaced by the new * values. * * @param name The attribute name. * @param type The attribute type. The type name is determined by * the type specified for this attribute in the DTD. * For example: "CDATA", "ID", "NMTOKEN", etc. However, * attributes of type enumeration will have the type * value specified as the pipe ('|') separated list of * the enumeration values prefixed by an open * parenthesis and suffixed by a close parenthesis. * For example: "(true|false)". * @param value The attribute value. * * @return Returns the attribute index. * * @see #setNonNormalizedValue * @see #setSpecified */	TokenNameCOMMENT_JAVADOC	 Adds an attribute. The attribute's non-normalized value of the attribute will have the same value as the attribute value until set using the <code>setNonNormalizedValue</code> method. Also, the added attribute will be marked as specified in the XML instance document unless set otherwise using the <code>setSpecified</code> method. <p> <strong>Note:</strong> If an attribute of the same name already exists, the old values for the attribute are replaced by the new values. * @param name The attribute name. @param type The attribute type. The type name is determined by the type specified for this attribute in the DTD. For example: "CDATA", "ID", "NMTOKEN", etc. However, attributes of type enumeration will have the type value specified as the pipe ('|') separated list of the enumeration values prefixed by an open parenthesis and suffixed by a close parenthesis. For example: "(true|false)". @param value The attribute value. * @return Returns the attribute index. * @see #setNonNormalizedValue @see #setSpecified 
public	TokenNamepublic	
int	TokenNameint	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fLength	TokenNameIdentifier	 f Length
<	TokenNameLESS	
SIZE_LIMIT	TokenNameIdentifier	 SIZE  LIMIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
getIndexFast	TokenNameIdentifier	 get Index Fast
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
:	TokenNameCOLON	
getIndexFast	TokenNameIdentifier	 get Index Fast
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fLength	TokenNameIdentifier	 f Length
++	TokenNamePLUS_PLUS	
==	TokenNameEQUAL_EQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getIndexFast	TokenNameIdentifier	 get Index Fast
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** * If attributes were removed from the list after the table * becomes in use this isn't reflected in the table view. It's * assumed that once a user starts removing attributes they're * not likely to add more. We only make the view consistent if * the user of this class adds attributes, removes them, and * then adds more. */	TokenNameCOMMENT_JAVADOC	 If attributes were removed from the list after the table becomes in use this isn't reflected in the table view. It's assumed that once a user starts removing attributes they're not likely to add more. We only make the view consistent if the user of this class adds attributes, removes them, and then adds more. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fIsTableViewConsistent	TokenNameIdentifier	 f Is Table View Consistent
||	TokenNameOR_OR	
fLength	TokenNameIdentifier	 f Length
==	TokenNameEQUAL_EQUAL	
SIZE_LIMIT	TokenNameIdentifier	 SIZE  LIMIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prepareAndPopulateTableView	TokenNameIdentifier	 prepare And Populate Table View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIsTableViewConsistent	TokenNameIdentifier	 f Is Table View Consistent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
getTableViewBucket	TokenNameIdentifier	 get Table View Bucket
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The chain is stale. 	TokenNameCOMMENT_LINE	The chain is stale. 
// This must be a unique attribute. 	TokenNameCOMMENT_LINE	This must be a unique attribute. 
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeTableViewChainState	TokenNameIdentifier	 f Attribute Table View Chain State
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
fLargeCount	TokenNameIdentifier	 f Large Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fLength	TokenNameIdentifier	 f Length
++	TokenNamePLUS_PLUS	
==	TokenNameEQUAL_EQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Update table view. 	TokenNameCOMMENT_LINE	Update table view. 
fAttributeTableViewChainState	TokenNameIdentifier	 f Attribute Table View Chain State
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fLargeCount	TokenNameIdentifier	 f Large Count
;	TokenNameSEMICOLON	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This chain is active. 	TokenNameCOMMENT_LINE	This chain is active. 
// We need to check if any of the attributes has the same rawname. 	TokenNameCOMMENT_LINE	We need to check if any of the attributes has the same rawname. 
else	TokenNameelse	
{	TokenNameLBRACE	
// Search the table. 	TokenNameCOMMENT_LINE	Search the table. 
Attribute	TokenNameIdentifier	 Attribute
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
found	TokenNameIdentifier	 found
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This attribute is unique. 	TokenNameCOMMENT_LINE	This attribute is unique. 
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fLength	TokenNameIdentifier	 f Length
++	TokenNamePLUS_PLUS	
==	TokenNameEQUAL_EQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Update table view 	TokenNameCOMMENT_LINE	Update table view 
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Duplicate. We still need to find the index. 	TokenNameCOMMENT_LINE	Duplicate. We still need to find the index. 
else	TokenNameelse	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getIndexFast	TokenNameIdentifier	 get Index Fast
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// set values 	TokenNameCOMMENT_LINE	set values 
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
nonNormalizedValue	TokenNameIdentifier	 non Normalized Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
specified	TokenNameIdentifier	 specified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// clear augmentations 	TokenNameCOMMENT_LINE	clear augmentations 
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
augs	TokenNameIdentifier	 augs
.	TokenNameDOT	
removeAllItems	TokenNameIdentifier	 remove All Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addAttribute(QName,String,XMLString) 	TokenNameCOMMENT_LINE	addAttribute(QName,String,XMLString) 
/** * Removes all of the attributes. This method will also remove all * entities associated to the attributes. */	TokenNameCOMMENT_JAVADOC	 Removes all of the attributes. This method will also remove all entities associated to the attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllAttributes	TokenNameIdentifier	 remove All Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removeAllAttributes() 	TokenNameCOMMENT_LINE	removeAllAttributes() 
/** * Removes the attribute at the specified index. * <p> * <strong>Note:</strong> This operation changes the indexes of all * attributes following the attribute at the specified index. * * @param attrIndex The attribute index. */	TokenNameCOMMENT_JAVADOC	 Removes the attribute at the specified index. <p> <strong>Note:</strong> This operation changes the indexes of all attributes following the attribute at the specified index. * @param attrIndex The attribute index. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAttributeAt	TokenNameIdentifier	 remove Attribute At
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIsTableViewConsistent	TokenNameIdentifier	 f Is Table View Consistent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
<	TokenNameLESS	
fLength	TokenNameIdentifier	 f Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
removedAttr	TokenNameIdentifier	 removed Attr
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fAttributes	TokenNameIdentifier	 f Attributes
,	TokenNameCOMMA	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
fLength	TokenNameIdentifier	 f Length
-	TokenNameMINUS	
attrIndex	TokenNameIdentifier	 attr Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make the discarded Attribute object available for re-use 	TokenNameCOMMENT_LINE	Make the discarded Attribute object available for re-use 
// by tucking it after the Attributes that are still in use 	TokenNameCOMMENT_LINE	by tucking it after the Attributes that are still in use 
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
fLength	TokenNameIdentifier	 f Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
removedAttr	TokenNameIdentifier	 removed Attr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fLength	TokenNameIdentifier	 f Length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removeAttributeAt(int) 	TokenNameCOMMENT_LINE	removeAttributeAt(int) 
/** * Sets the name of the attribute at the specified index. * * @param attrIndex The attribute index. * @param attrName The new attribute name. */	TokenNameCOMMENT_JAVADOC	 Sets the name of the attribute at the specified index. * @param attrIndex The attribute index. @param attrName The new attribute name. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setName(int,QName) 	TokenNameCOMMENT_LINE	setName(int,QName) 
/** * Sets the fields in the given QName structure with the values * of the attribute name at the specified index. * * @param attrIndex The attribute index. * @param attrName The attribute name structure to fill in. */	TokenNameCOMMENT_JAVADOC	 Sets the fields in the given QName structure with the values of the attribute name at the specified index. * @param attrIndex The attribute index. @param attrName The attribute name structure to fill in. 
public	TokenNamepublic	
void	TokenNamevoid	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getName(int,QName) 	TokenNameCOMMENT_LINE	getName(int,QName) 
/** * Sets the type of the attribute at the specified index. * * @param attrIndex The attribute index. * @param attrType The attribute type. The type name is determined by * the type specified for this attribute in the DTD. * For example: "CDATA", "ID", "NMTOKEN", etc. However, * attributes of type enumeration will have the type * value specified as the pipe ('|') separated list of * the enumeration values prefixed by an open * parenthesis and suffixed by a close parenthesis. * For example: "(true|false)". */	TokenNameCOMMENT_JAVADOC	 Sets the type of the attribute at the specified index. * @param attrIndex The attribute index. @param attrType The attribute type. The type name is determined by the type specified for this attribute in the DTD. For example: "CDATA", "ID", "NMTOKEN", etc. However, attributes of type enumeration will have the type value specified as the pipe ('|') separated list of the enumeration values prefixed by an open parenthesis and suffixed by a close parenthesis. For example: "(true|false)". 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrType	TokenNameIdentifier	 attr Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
attrType	TokenNameIdentifier	 attr Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setType(int,String) 	TokenNameCOMMENT_LINE	setType(int,String) 
/** * Sets the value of the attribute at the specified index. This * method will overwrite the non-normalized value of the attribute. * * @param attrIndex The attribute index. * @param attrValue The new attribute value. * * @see #setNonNormalizedValue */	TokenNameCOMMENT_JAVADOC	 Sets the value of the attribute at the specified index. This method will overwrite the non-normalized value of the attribute. * @param attrIndex The attribute index. @param attrValue The new attribute value. * @see #setNonNormalizedValue 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attrValue	TokenNameIdentifier	 attr Value
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
nonNormalizedValue	TokenNameIdentifier	 non Normalized Value
=	TokenNameEQUAL	
attrValue	TokenNameIdentifier	 attr Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setValue(int,String) 	TokenNameCOMMENT_LINE	setValue(int,String) 
/** * Sets the non-normalized value of the attribute at the specified * index. * * @param attrIndex The attribute index. * @param attrValue The new non-normalized attribute value. */	TokenNameCOMMENT_JAVADOC	 Sets the non-normalized value of the attribute at the specified index. * @param attrIndex The attribute index. @param attrValue The new non-normalized attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setNonNormalizedValue	TokenNameIdentifier	 set Non Normalized Value
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrValue	TokenNameIdentifier	 attr Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrValue	TokenNameIdentifier	 attr Value
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
nonNormalizedValue	TokenNameIdentifier	 non Normalized Value
=	TokenNameEQUAL	
attrValue	TokenNameIdentifier	 attr Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setNonNormalizedValue(int,String) 	TokenNameCOMMENT_LINE	setNonNormalizedValue(int,String) 
/** * Returns the non-normalized value of the attribute at the specified * index. If no non-normalized value is set, this method will return * the same value as the <code>getValue(int)</code> method. * * @param attrIndex The attribute index. */	TokenNameCOMMENT_JAVADOC	 Returns the non-normalized value of the attribute at the specified index. If no non-normalized value is set, this method will return the same value as the <code>getValue(int)</code> method. * @param attrIndex The attribute index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNonNormalizedValue	TokenNameIdentifier	 get Non Normalized Value
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
nonNormalizedValue	TokenNameIdentifier	 non Normalized Value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNonNormalizedValue(int):String 	TokenNameCOMMENT_LINE	getNonNormalizedValue(int):String 
/** * Sets whether an attribute is specified in the instance document * or not. * * @param attrIndex The attribute index. * @param specified True if the attribute is specified in the instance * document. */	TokenNameCOMMENT_JAVADOC	 Sets whether an attribute is specified in the instance document or not. * @param attrIndex The attribute index. @param specified True if the attribute is specified in the instance document. 
public	TokenNamepublic	
void	TokenNamevoid	
setSpecified	TokenNameIdentifier	 set Specified
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
specified	TokenNameIdentifier	 specified
=	TokenNameEQUAL	
specified	TokenNameIdentifier	 specified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setSpecified(int,boolean) 	TokenNameCOMMENT_LINE	setSpecified(int,boolean) 
/** * Returns true if the attribute is specified in the instance document. * * @param attrIndex The attribute index. */	TokenNameCOMMENT_JAVADOC	 Returns true if the attribute is specified in the instance document. * @param attrIndex The attribute index. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
specified	TokenNameIdentifier	 specified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isSpecified(int):boolean 	TokenNameCOMMENT_LINE	isSpecified(int):boolean 
// 	TokenNameCOMMENT_LINE	 
// AttributeList and Attributes methods 	TokenNameCOMMENT_LINE	AttributeList and Attributes methods 
// 	TokenNameCOMMENT_LINE	 
/** * Return the number of attributes in the list. * * <p>Once you know the number of attributes, you can iterate * through the list.</p> * * @return The number of attributes in the list. */	TokenNameCOMMENT_JAVADOC	 Return the number of attributes in the list. * <p>Once you know the number of attributes, you can iterate through the list.</p> * @return The number of attributes in the list. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLength():int 	TokenNameCOMMENT_LINE	getLength():int 
/** * Look up an attribute's type by index. * * <p>The attribute type is one of the strings "CDATA", "ID", * "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES", * or "NOTATION" (always in upper case).</p> * * <p>If the parser has not read a declaration for the attribute, * or if the parser does not report attribute types, then it must * return the value "CDATA" as stated in the XML 1.0 Recommentation * (clause 3.3.3, "Attribute-Value Normalization").</p> * * <p>For an enumerated attribute that is not a notation, the * parser will report the type as "NMTOKEN".</p> * * @param index The attribute index (zero-based). * @return The attribute's type as a string, or null if the * index is out of range. * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's type by index. * <p>The attribute type is one of the strings "CDATA", "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES", or "NOTATION" (always in upper case).</p> * <p>If the parser has not read a declaration for the attribute, or if the parser does not report attribute types, then it must return the value "CDATA" as stated in the XML 1.0 Recommentation (clause 3.3.3, "Attribute-Value Normalization").</p> * <p>For an enumerated attribute that is not a notation, the parser will report the type as "NMTOKEN".</p> * @param index The attribute index (zero-based). @return The attribute's type as a string, or null if the index is out of range. @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getReportableType	TokenNameIdentifier	 get Reportable Type
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType(int):String 	TokenNameCOMMENT_LINE	getType(int):String 
/** * Look up an attribute's type by XML 1.0 qualified name. * * <p>See {@link #getType(int) getType(int)} for a description * of the possible types.</p> * * @param qname The XML 1.0 qualified name. * @return The attribute type as a string, or null if the * attribute is not in the list or if qualified names * are not available. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's type by XML 1.0 qualified name. * <p>See {@link #getType(int) getType(int)} for a description of the possible types.</p> * @param qname The XML 1.0 qualified name. @return The attribute type as a string, or null if the attribute is not in the list or if qualified names are not available. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
getReportableType	TokenNameIdentifier	 get Reportable Type
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType(String):String 	TokenNameCOMMENT_LINE	getType(String):String 
/** * Look up an attribute's value by index. * * <p>If the attribute value is a list of tokens (IDREFS, * ENTITIES, or NMTOKENS), the tokens will be concatenated * into a single string with each token separated by a * single space.</p> * * @param index The attribute index (zero-based). * @return The attribute's value as a string, or null if the * index is out of range. * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's value by index. * <p>If the attribute value is a list of tokens (IDREFS, ENTITIES, or NMTOKENS), the tokens will be concatenated into a single string with each token separated by a single space.</p> * @param index The attribute index (zero-based). @return The attribute's value as a string, or null if the index is out of range. @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getValue(int):String 	TokenNameCOMMENT_LINE	getValue(int):String 
/** * Look up an attribute's value by XML 1.0 qualified name. * * <p>See {@link #getValue(int) getValue(int)} for a description * of the possible values.</p> * * @param qname The XML 1.0 qualified name. * @return The attribute value as a string, or null if the * attribute is not in the list or if qualified names * are not available. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's value by XML 1.0 qualified name. * <p>See {@link #getValue(int) getValue(int)} for a description of the possible values.</p> * @param qname The XML 1.0 qualified name. @return The attribute value as a string, or null if the attribute is not in the list or if qualified names are not available. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getValue(String):String 	TokenNameCOMMENT_LINE	getValue(String):String 
// 	TokenNameCOMMENT_LINE	 
// AttributeList methods 	TokenNameCOMMENT_LINE	AttributeList methods 
// 	TokenNameCOMMENT_LINE	 
/** * Return the name of an attribute in this list (by position). * * <p>The names must be unique: the SAX parser shall not include the * same attribute twice. Attributes without values (those declared * #IMPLIED without a value specified in the start tag) will be * omitted from the list.</p> * * <p>If the attribute name has a namespace prefix, the prefix * will still be attached.</p> * * @param index The index of the attribute in the list (starting at 0). * @return The name of the indexed attribute, or null * if the index is out of range. * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Return the name of an attribute in this list (by position). * <p>The names must be unique: the SAX parser shall not include the same attribute twice. Attributes without values (those declared #IMPLIED without a value specified in the start tag) will be omitted from the list.</p> * <p>If the attribute name has a namespace prefix, the prefix will still be attached.</p> * @param index The index of the attribute in the list (starting at 0). @return The name of the indexed attribute, or null if the index is out of range. @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getName(int):String 	TokenNameCOMMENT_LINE	getName(int):String 
// 	TokenNameCOMMENT_LINE	 
// Attributes methods 	TokenNameCOMMENT_LINE	Attributes methods 
// 	TokenNameCOMMENT_LINE	 
/** * Look up the index of an attribute by XML 1.0 qualified name. * * @param qName The qualified (prefixed) name. * @return The index of the attribute, or -1 if it does not * appear in the list. */	TokenNameCOMMENT_JAVADOC	 Look up the index of an attribute by XML 1.0 qualified name. * @param qName The qualified (prefixed) name. @return The index of the attribute, or -1 if it does not appear in the list. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
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
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getIndex(String):int 	TokenNameCOMMENT_LINE	getIndex(String):int 
/** * Look up the index of an attribute by Namespace name. * * @param uri The Namespace URI, or null if * the name has no Namespace URI. * @param localPart The attribute's local name. * @return The index of the attribute, or -1 if it does not * appear in the list. */	TokenNameCOMMENT_JAVADOC	 Look up the index of an attribute by Namespace name. * @param uri The Namespace URI, or null if the name has no Namespace URI. @param localPart The attribute's local name. @return The index of the attribute, or -1 if it does not appear in the list. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
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
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getIndex(String,String):int 	TokenNameCOMMENT_LINE	getIndex(String,String):int 
/** * Look up an attribute's local name by index. * * @param index The attribute index (zero-based). * @return The local name, or the empty string if Namespace * processing is not being performed, or null * if the index is out of range. * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's local name by index. * @param index The attribute index (zero-based). @return The local name, or the empty string if Namespace processing is not being performed, or null if the index is out of range. @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fNamespaces	TokenNameIdentifier	 f Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLocalName(int):String 	TokenNameCOMMENT_LINE	getLocalName(int):String 
/** * Look up an attribute's XML 1.0 qualified name by index. * * @param index The attribute index (zero-based). * @return The XML 1.0 qualified name, or the empty string * if none is available, or null if the index * is out of range. * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's XML 1.0 qualified name by index. * @param index The attribute index (zero-based). @return The XML 1.0 qualified name, or the empty string if none is available, or null if the index is out of range. @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
rawname	TokenNameIdentifier	 rawname
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getQName(int):String 	TokenNameCOMMENT_LINE	getQName(int):String 
/** * Look up an attribute's type by Namespace name. * * <p>See {@link #getType(int) getType(int)} for a description * of the possible types.</p> * * @param uri The Namespace URI, or null if the * name has no Namespace URI. * @param localName The local name of the attribute. * @return The attribute type as a string, or null if the * attribute is not in the list or if Namespace * processing is not being performed. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's type by Namespace name. * <p>See {@link #getType(int) getType(int)} for a description of the possible types.</p> * @param uri The Namespace URI, or null if the name has no Namespace URI. @param localName The local name of the attribute. @return The attribute type as a string, or null if the attribute is not in the list or if Namespace processing is not being performed. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fNamespaces	TokenNameIdentifier	 f Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
getReportableType	TokenNameIdentifier	 get Reportable Type
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType(String,String):String 	TokenNameCOMMENT_LINE	getType(String,String):String 
/** * Returns the prefix of the attribute at the specified index. * * @param index The index of the attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the prefix of the attribute at the specified index. * @param index The index of the attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
// REVISIT: The empty string is not entered in the symbol table! 	TokenNameCOMMENT_LINE	REVISIT: The empty string is not entered in the symbol table! 
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getPrefix(int):String 	TokenNameCOMMENT_LINE	getPrefix(int):String 
/** * Look up an attribute's Namespace URI by index. * * @param index The attribute index (zero-based). * @return The Namespace URI * @see #getLength */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's Namespace URI by index. * @param index The attribute index (zero-based). @return The Namespace URI @see #getLength 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getURI(int):String 	TokenNameCOMMENT_LINE	getURI(int):String 
/** * Look up an attribute's value by Namespace name. * * <p>See {@link #getValue(int) getValue(int)} for a description * of the possible values.</p> * * @param uri The Namespace URI, or null if the * @param localName The local name of the attribute. * @return The attribute value as a string, or null if the * attribute is not in the list. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's value by Namespace name. * <p>See {@link #getValue(int) getValue(int)} for a description of the possible values.</p> * @param uri The Namespace URI, or null if the @param localName The local name of the attribute. @return The attribute value as a string, or null if the attribute is not in the list. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getValue(String,String):String 	TokenNameCOMMENT_LINE	getValue(String,String):String 
/** * Look up an augmentations by Namespace name. * * @param uri The Namespace URI, or null if the * @param localName The local name of the attribute. * @return Augmentations */	TokenNameCOMMENT_JAVADOC	 Look up an augmentations by Namespace name. * @param uri The Namespace URI, or null if the @param localName The local name of the attribute. @return Augmentations 
public	TokenNamepublic	
Augmentations	TokenNameIdentifier	 Augmentations
getAugmentations	TokenNameIdentifier	 get Augmentations
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
augs	TokenNameIdentifier	 augs
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up an augmentation by XML 1.0 qualified name. * <p> * * @param qName The XML 1.0 qualified name. * * @return Augmentations * */	TokenNameCOMMENT_JAVADOC	 Look up an augmentation by XML 1.0 qualified name. <p> * @param qName The XML 1.0 qualified name. * @return Augmentations 
public	TokenNamepublic	
Augmentations	TokenNameIdentifier	 Augmentations
getAugmentations	TokenNameIdentifier	 get Augmentations
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
augs	TokenNameIdentifier	 augs
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up an augmentations by attributes index. * * @param attributeIndex The attribute index. * @return Augmentations */	TokenNameCOMMENT_JAVADOC	 Look up an augmentations by attributes index. * @param attributeIndex The attribute index. @return Augmentations 
public	TokenNamepublic	
Augmentations	TokenNameIdentifier	 Augmentations
getAugmentations	TokenNameIdentifier	 get Augmentations
(	TokenNameLPAREN	
int	TokenNameint	
attributeIndex	TokenNameIdentifier	 attribute Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributeIndex	TokenNameIdentifier	 attribute Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
attributeIndex	TokenNameIdentifier	 attribute Index
>=	TokenNameGREATER_EQUAL	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attributeIndex	TokenNameIdentifier	 attribute Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
augs	TokenNameIdentifier	 augs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the augmentations of the attribute at the specified index. * * @param attrIndex The attribute index. * @param augs The augmentations. */	TokenNameCOMMENT_JAVADOC	 Sets the augmentations of the attribute at the specified index. * @param attrIndex The attribute index. @param augs The augmentations. 
public	TokenNamepublic	
void	TokenNamevoid	
setAugmentations	TokenNameIdentifier	 set Augmentations
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
augs	TokenNameIdentifier	 augs
=	TokenNameEQUAL	
augs	TokenNameIdentifier	 augs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the uri of the attribute at the specified index. * * @param attrIndex The attribute index. * @param uri Namespace uri */	TokenNameCOMMENT_JAVADOC	 Sets the uri of the attribute at the specified index. * @param attrIndex The attribute index. @param uri Namespace uri 
public	TokenNamepublic	
void	TokenNamevoid	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
attrIndex	TokenNameIdentifier	 attr Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getURI(int,QName) 	TokenNameCOMMENT_LINE	getURI(int,QName) 
// Implementation methods 	TokenNameCOMMENT_LINE	Implementation methods 
/** * Look up the index of an attribute by XML 1.0 qualified name. * <p> * <strong>Note:</strong> * This method uses reference comparison, and thus should * only be used internally. We cannot use this method in any * code exposed to users as they may not pass in unique strings. * * @param qName The qualified (prefixed) name. * @return The index of the attribute, or -1 if it does not * appear in the list. */	TokenNameCOMMENT_JAVADOC	 Look up the index of an attribute by XML 1.0 qualified name. <p> <strong>Note:</strong> This method uses reference comparison, and thus should only be used internally. We cannot use this method in any code exposed to users as they may not pass in unique strings. * @param qName The qualified (prefixed) name. @return The index of the attribute, or -1 if it does not appear in the list. 
public	TokenNamepublic	
int	TokenNameint	
getIndexFast	TokenNameIdentifier	 get Index Fast
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
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
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
==	TokenNameEQUAL_EQUAL	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getIndexFast(String):int 	TokenNameCOMMENT_LINE	getIndexFast(String):int 
/** * Adds an attribute. The attribute's non-normalized value of the * attribute will have the same value as the attribute value until * set using the <code>setNonNormalizedValue</code> method. Also, * the added attribute will be marked as specified in the XML instance * document unless set otherwise using the <code>setSpecified</code> * method. * <p> * This method differs from <code>addAttribute</code> in that it * does not check if an attribute of the same name already exists * in the list before adding it. In order to improve performance * of namespace processing, this method allows uniqueness checks * to be deferred until all the namespace information is available * after the entire attribute specification has been read. * <p> * <strong>Caution:</strong> If this method is called it should * not be mixed with calls to <code>addAttribute</code> unless * it has been determined that all the attribute names are unique. * * @param name the attribute name * @param type the attribute type * @param value the attribute value * * @see #setNonNormalizedValue * @see #setSpecified * @see #checkDuplicatesNS */	TokenNameCOMMENT_JAVADOC	 Adds an attribute. The attribute's non-normalized value of the attribute will have the same value as the attribute value until set using the <code>setNonNormalizedValue</code> method. Also, the added attribute will be marked as specified in the XML instance document unless set otherwise using the <code>setSpecified</code> method. <p> This method differs from <code>addAttribute</code> in that it does not check if an attribute of the same name already exists in the list before adding it. In order to improve performance of namespace processing, this method allows uniqueness checks to be deferred until all the namespace information is available after the entire attribute specification has been read. <p> <strong>Caution:</strong> If this method is called it should not be mixed with calls to <code>addAttribute</code> unless it has been determined that all the attribute names are unique. * @param name the attribute name @param type the attribute type @param value the attribute value * @see #setNonNormalizedValue @see #setSpecified @see #checkDuplicatesNS 
public	TokenNamepublic	
void	TokenNamevoid	
addAttributeNS	TokenNameIdentifier	 add Attribute NS
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fLength	TokenNameIdentifier	 f Length
++	TokenNamePLUS_PLUS	
==	TokenNameEQUAL_EQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fLength	TokenNameIdentifier	 f Length
<	TokenNameLESS	
SIZE_LIMIT	TokenNameIdentifier	 SIZE  LIMIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set values 	TokenNameCOMMENT_LINE	set values 
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
nonNormalizedValue	TokenNameIdentifier	 non Normalized Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
specified	TokenNameIdentifier	 specified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// clear augmentations 	TokenNameCOMMENT_LINE	clear augmentations 
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
augs	TokenNameIdentifier	 augs
.	TokenNameDOT	
removeAllItems	TokenNameIdentifier	 remove All Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks for duplicate expanded names (local part and namespace name * pairs) in the attribute specification. If a duplicate is found its * name is returned. * <p> * This should be called once all the in-scope namespaces for the element * enclosing these attributes is known, and after all the attributes * have gone through namespace binding. * * @return the name of a duplicate attribute found in the search, * otherwise null. */	TokenNameCOMMENT_JAVADOC	 Checks for duplicate expanded names (local part and namespace name pairs) in the attribute specification. If a duplicate is found its name is returned. <p> This should be called once all the in-scope namespaces for the element enclosing these attributes is known, and after all the attributes have gone through namespace binding. * @return the name of a duplicate attribute found in the search, otherwise null. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
checkDuplicatesNS	TokenNameIdentifier	 check Duplicates NS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the list is small check for duplicates using pairwise comparison. 	TokenNameCOMMENT_LINE	If the list is small check for duplicates using pairwise comparison. 
if	TokenNameif	
(	TokenNameLPAREN	
fLength	TokenNameIdentifier	 f Length
<=	TokenNameLESS_EQUAL	
SIZE_LIMIT	TokenNameIdentifier	 SIZE  LIMIT
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
fLength	TokenNameIdentifier	 f Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
att1	TokenNameIdentifier	 att1
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
att1	TokenNameIdentifier	 att1
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
&&	TokenNameAND_AND	
att1	TokenNameIdentifier	 att1
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If the list is large check duplicates using a hash table. 	TokenNameCOMMENT_LINE	If the list is large check duplicates using a hash table. 
else	TokenNameelse	
{	TokenNameLBRACE	
// We don't want this table view to be read if someone calls 	TokenNameCOMMENT_LINE	We don't want this table view to be read if someone calls 
// addAttribute so we invalidate it up front. 	TokenNameCOMMENT_LINE	addAttribute so we invalidate it up front. 
fIsTableViewConsistent	TokenNameIdentifier	 f Is Table View Consistent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
prepareTableView	TokenNameIdentifier	 prepare Table View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Attribute	TokenNameIdentifier	 Attribute
attr	TokenNameIdentifier	 attr
;	TokenNameSEMICOLON	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fLength	TokenNameIdentifier	 f Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
getTableViewBucket	TokenNameIdentifier	 get Table View Bucket
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The chain is stale. 	TokenNameCOMMENT_LINE	The chain is stale. 
// This must be a unique attribute. 	TokenNameCOMMENT_LINE	This must be a unique attribute. 
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeTableViewChainState	TokenNameIdentifier	 f Attribute Table View Chain State
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
fLargeCount	TokenNameIdentifier	 f Large Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeTableViewChainState	TokenNameIdentifier	 f Attribute Table View Chain State
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fLargeCount	TokenNameIdentifier	 f Large Count
;	TokenNameSEMICOLON	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This chain is active. 	TokenNameCOMMENT_LINE	This chain is active. 
// We need to check if any of the attributes has the same name. 	TokenNameCOMMENT_LINE	We need to check if any of the attributes has the same name. 
else	TokenNameelse	
{	TokenNameLBRACE	
// Search the table. 	TokenNameCOMMENT_LINE	Search the table. 
Attribute	TokenNameIdentifier	 Attribute
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
&&	TokenNameAND_AND	
found	TokenNameIdentifier	 found
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
found	TokenNameIdentifier	 found
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Update table view 	TokenNameCOMMENT_LINE	Update table view 
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up the index of an attribute by Namespace name. * <p> * <strong>Note:</strong> * This method uses reference comparison, and thus should * only be used internally. We cannot use this method in any * code exposed to users as they may not pass in unique strings. * * @param uri The Namespace URI, or null if * the name has no Namespace URI. * @param localPart The attribute's local name. * @return The index of the attribute, or -1 if it does not * appear in the list. */	TokenNameCOMMENT_JAVADOC	 Look up the index of an attribute by Namespace name. <p> <strong>Note:</strong> This method uses reference comparison, and thus should only be used internally. We cannot use this method in any code exposed to users as they may not pass in unique strings. * @param uri The Namespace URI, or null if the name has no Namespace URI. @param localPart The attribute's local name. @return The index of the attribute, or -1 if it does not appear in the list. 
public	TokenNamepublic	
int	TokenNameint	
getIndexFast	TokenNameIdentifier	 get Index Fast
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
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
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
localPart	TokenNameIdentifier	 local Part
&&	TokenNameAND_AND	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getIndexFast(String,String):int 	TokenNameCOMMENT_LINE	getIndexFast(String,String):int 
/** * Returns the value passed in or NMTOKEN if it's an enumerated type. * * @param type attribute type * @return the value passed in or NMTOKEN if it's an enumerated type. */	TokenNameCOMMENT_JAVADOC	 Returns the value passed in or NMTOKEN if it's an enumerated type. * @param type attribute type @return the value passed in or NMTOKEN if it's an enumerated type. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getReportableType	TokenNameIdentifier	 get Reportable Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"NMTOKEN"	TokenNameStringLiteral	NMTOKEN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position in the table view * where the given attribute name would be hashed. * * @param qname the attribute name * @return the position in the table view where the given attribute * would be hashed */	TokenNameCOMMENT_JAVADOC	 Returns the position in the table view where the given attribute name would be hashed. * @param qname the attribute name @return the position in the table view where the given attribute would be hashed 
protected	TokenNameprotected	
int	TokenNameint	
getTableViewBucket	TokenNameIdentifier	 get Table View Bucket
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableViewBuckets	TokenNameIdentifier	 f Table View Buckets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position in the table view * where the given attribute name would be hashed. * * @param localpart the local part of the attribute * @param uri the namespace name of the attribute * @return the position in the table view where the given attribute * would be hashed */	TokenNameCOMMENT_JAVADOC	 Returns the position in the table view where the given attribute name would be hashed. * @param localpart the local part of the attribute @param uri the namespace name of the attribute @return the position in the table view where the given attribute would be hashed 
protected	TokenNameprotected	
int	TokenNameint	
getTableViewBucket	TokenNameIdentifier	 get Table View Bucket
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableViewBuckets	TokenNameIdentifier	 f Table View Buckets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableViewBuckets	TokenNameIdentifier	 f Table View Buckets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Purges all elements from the table view. */	TokenNameCOMMENT_JAVADOC	 Purges all elements from the table view. 
protected	TokenNameprotected	
void	TokenNamevoid	
cleanTableView	TokenNameIdentifier	 clean Table View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fLargeCount	TokenNameIdentifier	 f Large Count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Overflow. We actually need to visit the chain state array. 	TokenNameCOMMENT_LINE	Overflow. We actually need to visit the chain state array. 
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeTableViewChainState	TokenNameIdentifier	 f Attribute Table View Chain State
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fTableViewBuckets	TokenNameIdentifier	 f Table View Buckets
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeTableViewChainState	TokenNameIdentifier	 f Attribute Table View Chain State
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fLargeCount	TokenNameIdentifier	 f Large Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prepares the table view of the attributes list for use. */	TokenNameCOMMENT_JAVADOC	 Prepares the table view of the attributes list for use. 
protected	TokenNameprotected	
void	TokenNamevoid	
prepareTableView	TokenNameIdentifier	 prepare Table View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
[	TokenNameLBRACKET	
fTableViewBuckets	TokenNameIdentifier	 f Table View Buckets
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fAttributeTableViewChainState	TokenNameIdentifier	 f Attribute Table View Chain State
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fTableViewBuckets	TokenNameIdentifier	 f Table View Buckets
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cleanTableView	TokenNameIdentifier	 clean Table View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prepares the table view of the attributes list for use, * and populates it with the attributes which have been * previously read. */	TokenNameCOMMENT_JAVADOC	 Prepares the table view of the attributes list for use, and populates it with the attributes which have been previously read. 
protected	TokenNameprotected	
void	TokenNamevoid	
prepareAndPopulateTableView	TokenNameIdentifier	 prepare And Populate Table View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prepareTableView	TokenNameIdentifier	 prepare Table View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Need to populate the hash table with the attributes we've scanned so far. 	TokenNameCOMMENT_LINE	Need to populate the hash table with the attributes we've scanned so far. 
Attribute	TokenNameIdentifier	 Attribute
attr	TokenNameIdentifier	 attr
;	TokenNameSEMICOLON	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
getTableViewBucket	TokenNameIdentifier	 get Table View Bucket
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeTableViewChainState	TokenNameIdentifier	 f Attribute Table View Chain State
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
fLargeCount	TokenNameIdentifier	 f Large Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeTableViewChainState	TokenNameIdentifier	 f Attribute Table View Chain State
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fLargeCount	TokenNameIdentifier	 f Large Count
;	TokenNameSEMICOLON	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Update table view 	TokenNameCOMMENT_LINE	Update table view 
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fAttributeTableView	TokenNameIdentifier	 f Attribute Table View
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * Attribute information. * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 Attribute information. * @author Andy Clark, IBM 
static	TokenNamestatic	
class	TokenNameclass	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
// basic info 	TokenNameCOMMENT_LINE	basic info 
/** Name. */	TokenNameCOMMENT_JAVADOC	 Name. 
public	TokenNamepublic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Type. */	TokenNameCOMMENT_JAVADOC	 Type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** Value. */	TokenNameCOMMENT_JAVADOC	 Value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** Non-normalized value. */	TokenNameCOMMENT_JAVADOC	 Non-normalized value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
nonNormalizedValue	TokenNameIdentifier	 non Normalized Value
;	TokenNameSEMICOLON	
/** Specified. */	TokenNameCOMMENT_JAVADOC	 Specified. 
public	TokenNamepublic	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
;	TokenNameSEMICOLON	
/** * Augmentations information for this attribute. * XMLAttributes has no knowledge if any augmentations * were attached to Augmentations. */	TokenNameCOMMENT_JAVADOC	 Augmentations information for this attribute. XMLAttributes has no knowledge if any augmentations were attached to Augmentations. 
public	TokenNamepublic	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
=	TokenNameEQUAL	
new	TokenNamenew	
AugmentationsImpl	TokenNameIdentifier	 Augmentations Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Additional data for attribute table view 	TokenNameCOMMENT_LINE	Additional data for attribute table view 
/** Pointer to the next attribute in the chain. **/	TokenNameCOMMENT_JAVADOC	 Pointer to the next attribute in the chain. *
public	TokenNamepublic	
Attribute	TokenNameIdentifier	 Attribute
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// class Attribute 	TokenNameCOMMENT_LINE	class Attribute 
}	TokenNameRBRACE	
// class XMLAttributesImpl 	TokenNameCOMMENT_LINE	class XMLAttributesImpl 
