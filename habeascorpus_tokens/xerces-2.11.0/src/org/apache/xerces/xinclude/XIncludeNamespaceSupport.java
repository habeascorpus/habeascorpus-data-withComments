/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xinclude	TokenNameIdentifier	 xinclude
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
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
/** * This is an implementation of NamespaceContext which is intended to be used for * XInclude processing. It enables each context to be marked as invalid, if necessary, * to indicate that the namespaces recorded on those contexts won't be apparent in the * resulting infoset. * * @author Peter McCracken, IBM * * @version $Id: XIncludeNamespaceSupport.java 447243 2006-09-18 05:15:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This is an implementation of NamespaceContext which is intended to be used for XInclude processing. It enables each context to be marked as invalid, if necessary, to indicate that the namespaces recorded on those contexts won't be apparent in the resulting infoset. * @author Peter McCracken, IBM * @version $Id: XIncludeNamespaceSupport.java 447243 2006-09-18 05:15:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XIncludeNamespaceSupport	TokenNameIdentifier	 X Include Namespace Support
extends	TokenNameextends	
MultipleScopeNamespaceSupport	TokenNameIdentifier	 Multiple Scope Namespace Support
{	TokenNameLBRACE	
/** * This stores whether or not the context at the matching depth was valid. */	TokenNameCOMMENT_JAVADOC	 This stores whether or not the context at the matching depth was valid. 
private	TokenNameprivate	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fValidContext	TokenNameIdentifier	 f Valid Context
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
XIncludeNamespaceSupport	TokenNameIdentifier	 X Include Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param context */	TokenNameCOMMENT_JAVADOC	 @param context 
public	TokenNamepublic	
XIncludeNamespaceSupport	TokenNameIdentifier	 X Include Namespace Support
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pushes a new context onto the stack. */	TokenNameCOMMENT_JAVADOC	 Pushes a new context onto the stack. 
public	TokenNamepublic	
void	TokenNamevoid	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentContext	TokenNameIdentifier	 f Current Context
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
fValidContext	TokenNameIdentifier	 f Valid Context
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
contextarray	TokenNameIdentifier	 contextarray
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
fValidContext	TokenNameIdentifier	 f Valid Context
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fValidContext	TokenNameIdentifier	 f Valid Context
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
contextarray	TokenNameIdentifier	 contextarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fValidContext	TokenNameIdentifier	 f Valid Context
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fValidContext	TokenNameIdentifier	 f Valid Context
=	TokenNameEQUAL	
contextarray	TokenNameIdentifier	 contextarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fValidContext	TokenNameIdentifier	 f Valid Context
[	TokenNameLBRACKET	
fCurrentContext	TokenNameIdentifier	 f Current Context
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is used to set a context invalid for XInclude namespace processing. * Any context defined by an &lt;include&gt; or &lt;fallback&gt; element is not * valid for processing the include parent's [in-scope namespaces]. Thus, contexts * defined by these elements are set to invalid by the XInclude processor using * this method. */	TokenNameCOMMENT_JAVADOC	 This method is used to set a context invalid for XInclude namespace processing. Any context defined by an &lt;include&gt; or &lt;fallback&gt; element is not valid for processing the include parent's [in-scope namespaces]. Thus, contexts defined by these elements are set to invalid by the XInclude processor using this method. 
public	TokenNamepublic	
void	TokenNamevoid	
setContextInvalid	TokenNameIdentifier	 set Context Invalid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fValidContext	TokenNameIdentifier	 f Valid Context
[	TokenNameLBRACKET	
fCurrentContext	TokenNameIdentifier	 f Current Context
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This returns the namespace URI which was associated with the given pretext, in * the context that existed at the include parent of the current element. The * include parent is the last element, before the current one, which was not set * to an invalid context using setContextInvalid() * * @param prefix the prefix of the desired URI * @return the URI corresponding to the prefix in the context of the include parent */	TokenNameCOMMENT_JAVADOC	 This returns the namespace URI which was associated with the given pretext, in the context that existed at the include parent of the current element. The include parent is the last element, before the current one, which was not set to an invalid context using setContextInvalid() * @param prefix the prefix of the desired URI @return the URI corresponding to the prefix in the context of the include parent 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURIFromIncludeParent	TokenNameIdentifier	 get URI From Include Parent
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lastValidContext	TokenNameIdentifier	 last Valid Context
=	TokenNameEQUAL	
fCurrentContext	TokenNameIdentifier	 f Current Context
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lastValidContext	TokenNameIdentifier	 last Valid Context
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
fValidContext	TokenNameIdentifier	 f Valid Context
[	TokenNameLBRACKET	
lastValidContext	TokenNameIdentifier	 last Valid Context
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastValidContext	TokenNameIdentifier	 last Valid Context
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
lastValidContext	TokenNameIdentifier	 last Valid Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
