/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOMEnhancedForDTM.java 468648 2006-10-28 07:00:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOMEnhancedForDTM.java 468648 2006-10-28 07:00:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
;	TokenNameSEMICOLON	
/** * Interface for SAXImpl which adds methods used at run-time, over and above * those provided by the XSLTC DOM interface. An attempt to avoid the current * "Is the DTM a DOM, if so is it a SAXImpl, . . . * which was producing some ugly replicated code * and introducing bugs where that multipathing had not been * done. This makes it easier to provide other DOM/DOMEnhancedForDTM * implementations, rather than hard-wiring XSLTC to SAXImpl. * * @author Joseph Kesselman * */	TokenNameCOMMENT_JAVADOC	 Interface for SAXImpl which adds methods used at run-time, over and above those provided by the XSLTC DOM interface. An attempt to avoid the current "Is the DTM a DOM, if so is it a SAXImpl, . . . which was producing some ugly replicated code and introducing bugs where that multipathing had not been done. This makes it easier to provide other DOM/DOMEnhancedForDTM implementations, rather than hard-wiring XSLTC to SAXImpl. * @author Joseph Kesselman 
public	TokenNamepublic	
interface	TokenNameinterface	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
extends	TokenNameextends	
DOM	TokenNameIdentifier	 DOM
{	TokenNameLBRACE	
public	TokenNamepublic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMapping	TokenNameIdentifier	 get Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
uris	TokenNameIdentifier	 uris
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getReverseMapping	TokenNameIdentifier	 get Reverse Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
uris	TokenNameIdentifier	 uris
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNamespaceMapping	TokenNameIdentifier	 get Namespace Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
namespaces	TokenNameIdentifier	 namespaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getReverseNamespaceMapping	TokenNameIdentifier	 get Reverse Namespace Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
namespaces	TokenNameIdentifier	 namespaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentURI	TokenNameIdentifier	 get Document URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentURI	TokenNameIdentifier	 set Document URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getExpandedTypeID2	TokenNameIdentifier	 get Expanded Type I D2
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasDOMSource	TokenNameIdentifier	 has DOM Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
idString	TokenNameIdentifier	 id String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
