/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeInfo.java 468639 2006-10-28 06:52:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeInfo.java 468639 2006-10-28 06:52:33Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
ExpressionContext	TokenNameIdentifier	 Expression Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
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
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * <code>NodeInfo</code> defines a set of XSLT extension functions to be * used from stylesheets. * * @author <a href="mailto:ovidiu@cup.hp.com">Ovidiu Predescu</a> * @since May 24, 2001 */	TokenNameCOMMENT_JAVADOC	 <code>NodeInfo</code> defines a set of XSLT extension functions to be used from stylesheets. * @author <a href="mailto:ovidiu@cup.hp.com">Ovidiu Predescu</a> @since May 24, 2001 
public	TokenNamepublic	
class	TokenNameclass	
NodeInfo	TokenNameIdentifier	 Node Info
{	TokenNameLBRACE	
/** * <code>systemId</code> returns the system id of the current * context node. * * @param context an <code>ExpressionContext</code> value * @return a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 <code>systemId</code> returns the system id of the current context node. * @param context an <code>ExpressionContext</code> value @return a <code>String</code> value 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
(	TokenNameLPAREN	
ExpressionContext	TokenNameIdentifier	 Expression Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeHandler	TokenNameIdentifier	 node Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMNodeNumber	TokenNameIdentifier	 get DTM Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
nodeHandler	TokenNameIdentifier	 node Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>systemId</code> returns the system id of the node passed as * argument. If a node set is passed as argument, the system id of * the first node in the set is returned. * * @param nodeList a <code>NodeList</code> value * @return a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 <code>systemId</code> returns the system id of the node passed as argument. If a node set is passed as argument, the system id of the first node in the set is returned. * @param nodeList a <code>NodeList</code> value @return a <code>String</code> value 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nodeList	TokenNameIdentifier	 node List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeList	TokenNameIdentifier	 node List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
nodeList	TokenNameIdentifier	 node List
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nodeList	TokenNameIdentifier	 node List
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeHandler	TokenNameIdentifier	 node Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMNodeNumber	TokenNameIdentifier	 get DTM Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
nodeHandler	TokenNameIdentifier	 node Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>publicId</code> returns the public identifier of the current * context node. * * Xalan does not currently record this value, and will return null. * * @param context an <code>ExpressionContext</code> value * @return a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 <code>publicId</code> returns the public identifier of the current context node. * Xalan does not currently record this value, and will return null. * @param context an <code>ExpressionContext</code> value @return a <code>String</code> value 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
(	TokenNameLPAREN	
ExpressionContext	TokenNameIdentifier	 Expression Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeHandler	TokenNameIdentifier	 node Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMNodeNumber	TokenNameIdentifier	 get DTM Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
nodeHandler	TokenNameIdentifier	 node Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>publicId</code> returns the public identifier of the node passed as * argument. If a node set is passed as argument, the public identifier of * the first node in the set is returned. * * Xalan does not currently record this value, and will return null. * * @param nodeList a <code>NodeList</code> value * @return a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 <code>publicId</code> returns the public identifier of the node passed as argument. If a node set is passed as argument, the public identifier of the first node in the set is returned. * Xalan does not currently record this value, and will return null. * @param nodeList a <code>NodeList</code> value @return a <code>String</code> value 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nodeList	TokenNameIdentifier	 node List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeList	TokenNameIdentifier	 node List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
nodeList	TokenNameIdentifier	 node List
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nodeList	TokenNameIdentifier	 node List
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeHandler	TokenNameIdentifier	 node Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMNodeNumber	TokenNameIdentifier	 get DTM Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
nodeHandler	TokenNameIdentifier	 node Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>lineNumber</code> returns the line number of the current * context node. * * NOTE: Xalan does not normally record location information for each node. * To obtain it, you must set the custom TrAX attribute * "http://xml.apache.org/xalan/features/source_location" * true in the TransformerFactory before generating the Transformer and executing * the stylesheet. Storage cost per node will be noticably increased in this mode. * * @param context an <code>ExpressionContext</code> value * @return an <code>int</code> value. This may be -1 to indicate that the * line number is not known. */	TokenNameCOMMENT_JAVADOC	 <code>lineNumber</code> returns the line number of the current context node. * NOTE: Xalan does not normally record location information for each node. To obtain it, you must set the custom TrAX attribute "http://xml.apache.org/xalan/features/source_location" true in the TransformerFactory before generating the Transformer and executing the stylesheet. Storage cost per node will be noticably increased in this mode. * @param context an <code>ExpressionContext</code> value @return an <code>int</code> value. This may be -1 to indicate that the line number is not known. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
(	TokenNameLPAREN	
ExpressionContext	TokenNameIdentifier	 Expression Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeHandler	TokenNameIdentifier	 node Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMNodeNumber	TokenNameIdentifier	 get DTM Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
nodeHandler	TokenNameIdentifier	 node Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>lineNumber</code> returns the line number of the node * passed as argument. If a node set is passed as argument, the line * number of the first node in the set is returned. * * NOTE: Xalan does not normally record location information for each node. * To obtain it, you must set the custom TrAX attribute * "http://xml.apache.org/xalan/features/source_location" * true in the TransformerFactory before generating the Transformer and executing * the stylesheet. Storage cost per node will be noticably increased in this mode. * * @param nodeList a <code>NodeList</code> value * @return an <code>int</code> value. This may be -1 to indicate that the * line number is not known. */	TokenNameCOMMENT_JAVADOC	 <code>lineNumber</code> returns the line number of the node passed as argument. If a node set is passed as argument, the line number of the first node in the set is returned. * NOTE: Xalan does not normally record location information for each node. To obtain it, you must set the custom TrAX attribute "http://xml.apache.org/xalan/features/source_location" true in the TransformerFactory before generating the Transformer and executing the stylesheet. Storage cost per node will be noticably increased in this mode. * @param nodeList a <code>NodeList</code> value @return an <code>int</code> value. This may be -1 to indicate that the line number is not known. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nodeList	TokenNameIdentifier	 node List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeList	TokenNameIdentifier	 node List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
nodeList	TokenNameIdentifier	 node List
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nodeList	TokenNameIdentifier	 node List
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeHandler	TokenNameIdentifier	 node Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMNodeNumber	TokenNameIdentifier	 get DTM Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
nodeHandler	TokenNameIdentifier	 node Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>columnNumber</code> returns the column number of the * current context node. * * NOTE: Xalan does not normally record location information for each node. * To obtain it, you must set the custom TrAX attribute * "http://xml.apache.org/xalan/features/source_location" * true in the TransformerFactory before generating the Transformer and executing * the stylesheet. Storage cost per node will be noticably increased in this mode. * * @param context an <code>ExpressionContext</code> value * @return an <code>int</code> value. This may be -1 to indicate that the * column number is not known. */	TokenNameCOMMENT_JAVADOC	 <code>columnNumber</code> returns the column number of the current context node. * NOTE: Xalan does not normally record location information for each node. To obtain it, you must set the custom TrAX attribute "http://xml.apache.org/xalan/features/source_location" true in the TransformerFactory before generating the Transformer and executing the stylesheet. Storage cost per node will be noticably increased in this mode. * @param context an <code>ExpressionContext</code> value @return an <code>int</code> value. This may be -1 to indicate that the column number is not known. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
(	TokenNameLPAREN	
ExpressionContext	TokenNameIdentifier	 Expression Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeHandler	TokenNameIdentifier	 node Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMNodeNumber	TokenNameIdentifier	 get DTM Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
nodeHandler	TokenNameIdentifier	 node Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>columnNumber</code> returns the column number of the node * passed as argument. If a node set is passed as argument, the line * number of the first node in the set is returned. * * NOTE: Xalan does not normally record location information for each node. * To obtain it, you must set the custom TrAX attribute * "http://xml.apache.org/xalan/features/source_location" * true in the TransformerFactory before generating the Transformer and executing * the stylesheet. Storage cost per node will be noticably increased in this mode. * * @param nodeList a <code>NodeList</code> value * @return an <code>int</code> value. This may be -1 to indicate that the * column number is not known. */	TokenNameCOMMENT_JAVADOC	 <code>columnNumber</code> returns the column number of the node passed as argument. If a node set is passed as argument, the line number of the first node in the set is returned. * NOTE: Xalan does not normally record location information for each node. To obtain it, you must set the custom TrAX attribute "http://xml.apache.org/xalan/features/source_location" true in the TransformerFactory before generating the Transformer and executing the stylesheet. Storage cost per node will be noticably increased in this mode. * @param nodeList a <code>NodeList</code> value @return an <code>int</code> value. This may be -1 to indicate that the column number is not known. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nodeList	TokenNameIdentifier	 node List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeList	TokenNameIdentifier	 node List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
nodeList	TokenNameIdentifier	 node List
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nodeList	TokenNameIdentifier	 node List
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeHandler	TokenNameIdentifier	 node Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMNodeNumber	TokenNameIdentifier	 get DTM Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
nodeHandler	TokenNameIdentifier	 node Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
