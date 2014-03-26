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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLInputSource	TokenNameIdentifier	 XML Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSObject	TokenNameIdentifier	 XS Object
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @version $Id: XSInputSource.java 789785 2009-06-30 15:10:26Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @version $Id: XSInputSource.java 789785 2009-06-30 15:10:26Z knoaman $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
XSInputSource	TokenNameIdentifier	 XS Input Source
extends	TokenNameextends	
XMLInputSource	TokenNameIdentifier	 XML Input Source
{	TokenNameLBRACE	
private	TokenNameprivate	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fGrammars	TokenNameIdentifier	 f Grammars
;	TokenNameSEMICOLON	
private	TokenNameprivate	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fComponents	TokenNameIdentifier	 f Components
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSInputSource	TokenNameIdentifier	 XS Input Source
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grammars	TokenNameIdentifier	 grammars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fGrammars	TokenNameIdentifier	 f Grammars
=	TokenNameEQUAL	
grammars	TokenNameIdentifier	 grammars
;	TokenNameSEMICOLON	
fComponents	TokenNameIdentifier	 f Components
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSInputSource	TokenNameIdentifier	 XS Input Source
(	TokenNameLPAREN	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fGrammars	TokenNameIdentifier	 f Grammars
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fComponents	TokenNameIdentifier	 f Components
=	TokenNameEQUAL	
component	TokenNameIdentifier	 component
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getGrammars	TokenNameIdentifier	 get Grammars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fGrammars	TokenNameIdentifier	 f Grammars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setGrammars	TokenNameIdentifier	 set Grammars
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grammars	TokenNameIdentifier	 grammars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGrammars	TokenNameIdentifier	 f Grammars
=	TokenNameEQUAL	
grammars	TokenNameIdentifier	 grammars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getComponents	TokenNameIdentifier	 get Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fComponents	TokenNameIdentifier	 f Components
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setComponents	TokenNameIdentifier	 set Components
(	TokenNameLPAREN	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
components	TokenNameIdentifier	 components
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fComponents	TokenNameIdentifier	 f Components
=	TokenNameEQUAL	
components	TokenNameIdentifier	 components
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
