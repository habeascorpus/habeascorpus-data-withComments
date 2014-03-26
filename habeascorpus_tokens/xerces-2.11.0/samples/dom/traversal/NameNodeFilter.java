/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeFilter	TokenNameIdentifier	 Node Filter
;	TokenNameSEMICOLON	
/** * An example filter which enables the client to set a <b>name</b> value * accept those node names which <b>match</b> (or explicitly <b>not match</b>) * the set name value. * * @version $Id: NameNodeFilter.java 950355 2010-06-02 03:43:24Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 An example filter which enables the client to set a <b>name</b> value accept those node names which <b>match</b> (or explicitly <b>not match</b>) the set name value. * @version $Id: NameNodeFilter.java 950355 2010-06-02 03:43:24Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
NameNodeFilter	TokenNameIdentifier	 Name Node Filter
implements	TokenNameimplements	
NodeFilter	TokenNameIdentifier	 Node Filter
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fName	TokenNameIdentifier	 f Name
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
fMatch	TokenNameIdentifier	 f Match
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** The name to compare with the node name. If null, all node names * are successfully matched. */	TokenNameCOMMENT_JAVADOC	 The name to compare with the node name. If null, all node names are successfully matched. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the name to compare with node name. If null, all node names * are successfully matched. */	TokenNameCOMMENT_JAVADOC	 Return the name to compare with node name. If null, all node names are successfully matched. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Controls whether the node name is accepted when it <b>does</b> match * the setName value, or when it <b>does not</b> match the setName value. * If the setName value is null this match value does not matter, and * all names will match. * If match is true, the node name is accepted when it matches. * If match is false, the node name is accepted when does not match. */	TokenNameCOMMENT_JAVADOC	 Controls whether the node name is accepted when it <b>does</b> match the setName value, or when it <b>does not</b> match the setName value. If the setName value is null this match value does not matter, and all names will match. If match is true, the node name is accepted when it matches. If match is false, the node name is accepted when does not match. 
public	TokenNamepublic	
void	TokenNamevoid	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fMatch	TokenNameIdentifier	 f Match
=	TokenNameEQUAL	
match	TokenNameIdentifier	 match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return match value. */	TokenNameCOMMENT_JAVADOC	 Return match value. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
fMatch	TokenNameIdentifier	 f Match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** acceptNode determines if this filter accepts a node name or not. */	TokenNameCOMMENT_JAVADOC	 acceptNode determines if this filter accepts a node name or not. 
public	TokenNamepublic	
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fName	TokenNameIdentifier	 f Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
fMatch	TokenNameIdentifier	 f Match
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fName	TokenNameIdentifier	 f Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
fMatch	TokenNameIdentifier	 f Match
&&	TokenNameAND_AND	
!	TokenNameNOT	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fName	TokenNameIdentifier	 f Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
FILTER_REJECT	TokenNameIdentifier	 FILTER  REJECT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
