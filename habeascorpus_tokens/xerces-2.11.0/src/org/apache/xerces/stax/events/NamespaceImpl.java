/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
stax	TokenNameIdentifier	 stax
.	TokenNameDOT	
events	TokenNameIdentifier	 events
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
Location	TokenNameIdentifier	 Location
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Namespace	TokenNameIdentifier	 Namespace
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @author Lucian Holland * * @version $Id: NamespaceImpl.java 730477 2008-12-31 20:57:07Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Lucian Holland * @version $Id: NamespaceImpl.java 730477 2008-12-31 20:57:07Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NamespaceImpl	TokenNameIdentifier	 Namespace Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
Namespace	TokenNameIdentifier	 Namespace
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fPrefix	TokenNameIdentifier	 f Prefix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fNamespaceURI	TokenNameIdentifier	 f Namespace URI
;	TokenNameSEMICOLON	
/** * @param location * @param schemaType */	TokenNameCOMMENT_JAVADOC	 @param location @param schemaType 
public	TokenNamepublic	
NamespaceImpl	TokenNameIdentifier	 Namespace Impl
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
final	TokenNamefinal	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
,	TokenNameCOMMA	
makeAttributeQName	TokenNameIdentifier	 make Attribute Q Name
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fPrefix	TokenNameIdentifier	 f Prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
DEFAULT_NS_PREFIX	TokenNameIdentifier	 DEFAULT  NS  PREFIX
:	TokenNameCOLON	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
fNamespaceURI	TokenNameIdentifier	 f Namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param prefix The prefix for this namespace. * @return A QName for the attribute that declares this namespace. */	TokenNameCOMMENT_JAVADOC	 @param prefix The prefix for this namespace. @return A QName for the attribute that declares this namespace. 
private	TokenNameprivate	
static	TokenNamestatic	
QName	TokenNameIdentifier	 Q Name
makeAttributeQName	TokenNameIdentifier	 make Attribute Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
DEFAULT_NS_PREFIX	TokenNameIdentifier	 DEFAULT  NS  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XMLNS_ATTRIBUTE_NS_URI	TokenNameIdentifier	 XMLNS  ATTRIBUTE  NS  URI
,	TokenNameCOMMA	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XMLNS_ATTRIBUTE	TokenNameIdentifier	 XMLNS  ATTRIBUTE
,	TokenNameCOMMA	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
DEFAULT_NS_PREFIX	TokenNameIdentifier	 DEFAULT  NS  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XMLNS_ATTRIBUTE_NS_URI	TokenNameIdentifier	 XMLNS  ATTRIBUTE  NS  URI
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XMLNS_ATTRIBUTE	TokenNameIdentifier	 XMLNS  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.Namespace#getPrefix() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.Namespace#getPrefix() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fPrefix	TokenNameIdentifier	 f Prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.Namespace#getNamespaceURI() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.Namespace#getNamespaceURI() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespaceURI	TokenNameIdentifier	 f Namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.Namespace#isDefaultNamespaceDeclaration() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.Namespace#isDefaultNamespaceDeclaration() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDefaultNamespaceDeclaration	TokenNameIdentifier	 is Default Namespace Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fPrefix	TokenNameIdentifier	 f Prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
