/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: WhiteSpaceInfo.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: WhiteSpaceInfo.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
/** * This is used as a special "fake" template that can be * handled by the TemplateList to do pattern matching * on nodes. */	TokenNameCOMMENT_JAVADOC	 This is used as a special "fake" template that can be handled by the TemplateList to do pattern matching on nodes. 
public	TokenNamepublic	
class	TokenNameclass	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
extends	TokenNameextends	
ElemTemplate	TokenNameIdentifier	 Elem Template
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
6389208261999943836L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Flag indicating whether whitespaces should be stripped. * @serial */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether whitespaces should be stripped. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_shouldStripSpace	TokenNameIdentifier	 m should Strip Space
;	TokenNameSEMICOLON	
/** * Return true if this element specifies that the node that * matches the match pattern should be stripped, otherwise * the space should be preserved. * * @return value of m_shouldStripSpace flag */	TokenNameCOMMENT_JAVADOC	 Return true if this element specifies that the node that matches the match pattern should be stripped, otherwise the space should be preserved. * @return value of m_shouldStripSpace flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getShouldStripSpace	TokenNameIdentifier	 get Should Strip Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_shouldStripSpace	TokenNameIdentifier	 m should Strip Space
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor WhiteSpaceInfo * @param thisSheet The current stylesheet */	TokenNameCOMMENT_JAVADOC	 Constructor WhiteSpaceInfo @param thisSheet The current stylesheet 
public	TokenNamepublic	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
thisSheet	TokenNameIdentifier	 this Sheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
thisSheet	TokenNameIdentifier	 this Sheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor WhiteSpaceInfo * * * @param matchPattern Match pattern * @param shouldStripSpace Flag indicating whether or not * to strip whitespaces * @param thisSheet The current stylesheet */	TokenNameCOMMENT_JAVADOC	 Constructor WhiteSpaceInfo * @param matchPattern Match pattern @param shouldStripSpace Flag indicating whether or not to strip whitespaces @param thisSheet The current stylesheet 
public	TokenNamepublic	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
matchPattern	TokenNameIdentifier	 match Pattern
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldStripSpace	TokenNameIdentifier	 should Strip Space
,	TokenNameCOMMA	
Stylesheet	TokenNameIdentifier	 Stylesheet
thisSheet	TokenNameIdentifier	 this Sheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_shouldStripSpace	TokenNameIdentifier	 m should Strip Space
=	TokenNameEQUAL	
shouldStripSpace	TokenNameIdentifier	 should Strip Space
;	TokenNameSEMICOLON	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
matchPattern	TokenNameIdentifier	 match Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
thisSheet	TokenNameIdentifier	 this Sheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called to recompose() all of the WhiteSpaceInfo elements. */	TokenNameCOMMENT_JAVADOC	 This function is called to recompose() all of the WhiteSpaceInfo elements. 
public	TokenNamepublic	
void	TokenNamevoid	
recompose	TokenNameIdentifier	 recompose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
recomposeWhiteSpaceInfo	TokenNameIdentifier	 recompose White Space Info
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
