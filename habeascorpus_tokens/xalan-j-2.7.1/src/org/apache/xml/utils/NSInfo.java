/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NSInfo.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NSInfo.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * This class holds information about the namespace info * of a node. It is used to optimize namespace lookup in * a generic DOM. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class holds information about the namespace info of a node. It is used to optimize namespace lookup in a generic DOM. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
NSInfo	TokenNameIdentifier	 NS Info
{	TokenNameLBRACE	
/** * Constructor NSInfo * * * @param hasProcessedNS Flag indicating whether namespaces * have been processed for this node * @param hasXMLNSAttrs Flag indicating whether this node * has XMLNS attributes. */	TokenNameCOMMENT_JAVADOC	 Constructor NSInfo * @param hasProcessedNS Flag indicating whether namespaces have been processed for this node @param hasXMLNSAttrs Flag indicating whether this node has XMLNS attributes. 
public	TokenNamepublic	
NSInfo	TokenNameIdentifier	 NS Info
(	TokenNameLPAREN	
boolean	TokenNameboolean	
hasProcessedNS	TokenNameIdentifier	 has Processed NS
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasXMLNSAttrs	TokenNameIdentifier	 has XMLNS Attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_hasProcessedNS	TokenNameIdentifier	 m has Processed NS
=	TokenNameEQUAL	
hasProcessedNS	TokenNameIdentifier	 has Processed NS
;	TokenNameSEMICOLON	
m_hasXMLNSAttrs	TokenNameIdentifier	 m has XMLNS Attrs
=	TokenNameEQUAL	
hasXMLNSAttrs	TokenNameIdentifier	 has XMLNS Attrs
;	TokenNameSEMICOLON	
m_namespace	TokenNameIdentifier	 m namespace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_ancestorHasXMLNSAttrs	TokenNameIdentifier	 m ancestor Has XMLNS Attrs
=	TokenNameEQUAL	
ANCESTORXMLNSUNPROCESSED	TokenNameIdentifier	 ANCESTORXMLNSUNPROCESSED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Unused at the moment 	TokenNameCOMMENT_LINE	Unused at the moment 
/** * Constructor NSInfo * * * @param hasProcessedNS Flag indicating whether namespaces * have been processed for this node * @param hasXMLNSAttrs Flag indicating whether this node * has XMLNS attributes. * @param ancestorHasXMLNSAttrs Flag indicating whether one of this node's * ancestor has XMLNS attributes. */	TokenNameCOMMENT_JAVADOC	 Constructor NSInfo * @param hasProcessedNS Flag indicating whether namespaces have been processed for this node @param hasXMLNSAttrs Flag indicating whether this node has XMLNS attributes. @param ancestorHasXMLNSAttrs Flag indicating whether one of this node's ancestor has XMLNS attributes. 
public	TokenNamepublic	
NSInfo	TokenNameIdentifier	 NS Info
(	TokenNameLPAREN	
boolean	TokenNameboolean	
hasProcessedNS	TokenNameIdentifier	 has Processed NS
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasXMLNSAttrs	TokenNameIdentifier	 has XMLNS Attrs
,	TokenNameCOMMA	
int	TokenNameint	
ancestorHasXMLNSAttrs	TokenNameIdentifier	 ancestor Has XMLNS Attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_hasProcessedNS	TokenNameIdentifier	 m has Processed NS
=	TokenNameEQUAL	
hasProcessedNS	TokenNameIdentifier	 has Processed NS
;	TokenNameSEMICOLON	
m_hasXMLNSAttrs	TokenNameIdentifier	 m has XMLNS Attrs
=	TokenNameEQUAL	
hasXMLNSAttrs	TokenNameIdentifier	 has XMLNS Attrs
;	TokenNameSEMICOLON	
m_ancestorHasXMLNSAttrs	TokenNameIdentifier	 m ancestor Has XMLNS Attrs
=	TokenNameEQUAL	
ancestorHasXMLNSAttrs	TokenNameIdentifier	 ancestor Has XMLNS Attrs
;	TokenNameSEMICOLON	
m_namespace	TokenNameIdentifier	 m namespace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor NSInfo * * * @param namespace The namespace URI * @param hasXMLNSAttrs Flag indicating whether this node * has XMLNS attributes. */	TokenNameCOMMENT_JAVADOC	 Constructor NSInfo * @param namespace The namespace URI @param hasXMLNSAttrs Flag indicating whether this node has XMLNS attributes. 
public	TokenNamepublic	
NSInfo	TokenNameIdentifier	 NS Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasXMLNSAttrs	TokenNameIdentifier	 has XMLNS Attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_hasProcessedNS	TokenNameIdentifier	 m has Processed NS
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_hasXMLNSAttrs	TokenNameIdentifier	 m has XMLNS Attrs
=	TokenNameEQUAL	
hasXMLNSAttrs	TokenNameIdentifier	 has XMLNS Attrs
;	TokenNameSEMICOLON	
m_namespace	TokenNameIdentifier	 m namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
m_ancestorHasXMLNSAttrs	TokenNameIdentifier	 m ancestor Has XMLNS Attrs
=	TokenNameEQUAL	
ANCESTORXMLNSUNPROCESSED	TokenNameIdentifier	 ANCESTORXMLNSUNPROCESSED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The namespace URI */	TokenNameCOMMENT_JAVADOC	 The namespace URI 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
m_namespace	TokenNameIdentifier	 m namespace
;	TokenNameSEMICOLON	
/** Flag indicating whether this node has an XMLNS attribute */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether this node has an XMLNS attribute 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_hasXMLNSAttrs	TokenNameIdentifier	 m has XMLNS Attrs
;	TokenNameSEMICOLON	
/** Flag indicating whether namespaces have been processed for this node */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether namespaces have been processed for this node 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_hasProcessedNS	TokenNameIdentifier	 m has Processed NS
;	TokenNameSEMICOLON	
/** Flag indicating whether one of this node's ancestor has an XMLNS attribute */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether one of this node's ancestor has an XMLNS attribute 
public	TokenNamepublic	
int	TokenNameint	
m_ancestorHasXMLNSAttrs	TokenNameIdentifier	 m ancestor Has XMLNS Attrs
;	TokenNameSEMICOLON	
/** Constant for ancestors XMLNS atributes not processed */	TokenNameCOMMENT_JAVADOC	 Constant for ancestors XMLNS atributes not processed 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ANCESTORXMLNSUNPROCESSED	TokenNameIdentifier	 ANCESTORXMLNSUNPROCESSED
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant indicating an ancestor has an XMLNS attribute */	TokenNameCOMMENT_JAVADOC	 Constant indicating an ancestor has an XMLNS attribute 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ANCESTORHASXMLNS	TokenNameIdentifier	 ANCESTORHASXMLNS
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant indicating ancestors don't have an XMLNS attribute */	TokenNameCOMMENT_JAVADOC	 Constant indicating ancestors don't have an XMLNS attribute 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ANCESTORNOXMLNS	TokenNameIdentifier	 ANCESTORNOXMLNS
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
