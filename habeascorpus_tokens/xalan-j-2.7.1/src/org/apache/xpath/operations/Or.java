/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Or.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Or.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XBoolean	TokenNameIdentifier	 X Boolean
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * The 'or' operation expression executer. */	TokenNameCOMMENT_JAVADOC	 The 'or' operation expression executer. 
public	TokenNamepublic	
class	TokenNameclass	
Or	TokenNameIdentifier	 Or
extends	TokenNameextends	
Operation	TokenNameIdentifier	 Operation
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
644107191353853079L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * OR two expressions and return the boolean result. Override * superclass method for optimization purposes. * * @param xctxt The runtime execution context. * * @return {@link org.apache.xpath.objects.XBoolean#S_TRUE} or * {@link org.apache.xpath.objects.XBoolean#S_FALSE}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 OR two expressions and return the boolean result. Override superclass method for optimization purposes. * @param xctxt The runtime execution context. * @return {@link org.apache.xpath.objects.XBoolean#S_TRUE} or {@link org.apache.xpath.objects.XBoolean#S_FALSE}. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
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
XObject	TokenNameIdentifier	 X Object
expr1	TokenNameIdentifier	 expr1
=	TokenNameEQUAL	
m_left	TokenNameIdentifier	 m left
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
expr1	TokenNameIdentifier	 expr1
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
expr2	TokenNameIdentifier	 expr2
=	TokenNameEQUAL	
m_right	TokenNameIdentifier	 m right
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
expr2	TokenNameIdentifier	 expr2
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_TRUE	TokenNameIdentifier	 S  TRUE
:	TokenNameCOLON	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_FALSE	TokenNameIdentifier	 S  FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_TRUE	TokenNameIdentifier	 S  TRUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate this operation directly to a boolean. * * @param xctxt The runtime execution context. * * @return The result of the operation as a boolean. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Evaluate this operation directly to a boolean. * @param xctxt The runtime execution context. * @return The result of the operation as a boolean. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
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
return	TokenNamereturn	
(	TokenNameLPAREN	
m_left	TokenNameIdentifier	 m left
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
||	TokenNameOR_OR	
m_right	TokenNameIdentifier	 m right
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
