/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
HTMLOListElement	TokenNameIdentifier	 HTMLO List Element
;	TokenNameSEMICOLON	
/** * @xerces.internal * @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ * @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> * @see org.w3c.dom.html.HTMLOListElement * @see org.apache.xerces.dom.ElementImpl */	TokenNameCOMMENT_JAVADOC	 @xerces.internal @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> @see org.w3c.dom.html.HTMLOListElement @see org.apache.xerces.dom.ElementImpl 
public	TokenNamepublic	
class	TokenNameclass	
HTMLOListElementImpl	TokenNameIdentifier	 HTMLO List Element Impl
extends	TokenNameextends	
HTMLElementImpl	TokenNameIdentifier	 HTML Element Impl
implements	TokenNameimplements	
HTMLOListElement	TokenNameIdentifier	 HTMLO List Element
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1293750546025862146L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
getCompact	TokenNameIdentifier	 get Compact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getBinary	TokenNameIdentifier	 get Binary
(	TokenNameLPAREN	
"compact"	TokenNameStringLiteral	compact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCompact	TokenNameIdentifier	 set Compact
(	TokenNameLPAREN	
boolean	TokenNameboolean	
compact	TokenNameIdentifier	 compact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"compact"	TokenNameStringLiteral	compact
,	TokenNameCOMMA	
compact	TokenNameIdentifier	 compact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInteger	TokenNameIdentifier	 get Integer
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"start"	TokenNameStringLiteral	start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStart	TokenNameIdentifier	 set Start
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"start"	TokenNameStringLiteral	start
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"type"	TokenNameStringLiteral	type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor requires owner document. * * @param owner The owner HTML document */	TokenNameCOMMENT_JAVADOC	 Constructor requires owner document. * @param owner The owner HTML document 
public	TokenNamepublic	
HTMLOListElementImpl	TokenNameIdentifier	 HTMLO List Element Impl
(	TokenNameLPAREN	
HTMLDocumentImpl	TokenNameIdentifier	 HTML Document Impl
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
