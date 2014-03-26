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
models	TokenNameIdentifier	 models
;	TokenNameSEMICOLON	
/** * A compound content model leaf node which carries occurence information. * * @xerces.internal * * @author Michael Glavassevich, IBM * @version $Id: XSCMRepeatingLeaf.java 575864 2007-09-15 03:12:34Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 A compound content model leaf node which carries occurence information. * @xerces.internal * @author Michael Glavassevich, IBM @version $Id: XSCMRepeatingLeaf.java 575864 2007-09-15 03:12:34Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
XSCMRepeatingLeaf	TokenNameIdentifier	 XSCM Repeating Leaf
extends	TokenNameextends	
XSCMLeaf	TokenNameIdentifier	 XSCM Leaf
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSCMRepeatingLeaf	TokenNameIdentifier	 XSCM Repeating Leaf
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
int	TokenNameint	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
int	TokenNameint	
maxOccurs	TokenNameIdentifier	 max Occurs
,	TokenNameCOMMA	
int	TokenNameint	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
=	TokenNameEQUAL	
minOccurs	TokenNameIdentifier	 min Occurs
;	TokenNameSEMICOLON	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
=	TokenNameEQUAL	
maxOccurs	TokenNameIdentifier	 max Occurs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
getMinOccurs	TokenNameIdentifier	 get Min Occurs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fMinOccurs	TokenNameIdentifier	 f Min Occurs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
getMaxOccurs	TokenNameIdentifier	 get Max Occurs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fMaxOccurs	TokenNameIdentifier	 f Max Occurs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
