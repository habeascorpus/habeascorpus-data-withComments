/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Define XBL constants, such as tag names, attribute names and * namespace URI. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: XBLConstants.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Define XBL constants, such as tag names, attribute names and namespace URI. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: XBLConstants.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XBLConstants	TokenNameIdentifier	 XBL Constants
{	TokenNameLBRACE	
/** * Namespace URI for XBL elements and events. */	TokenNameCOMMENT_JAVADOC	 Namespace URI for XBL elements and events. 
String	TokenNameIdentifier	 String
XBL_NAMESPACE_URI	TokenNameIdentifier	 XBL  NAMESPACE  URI
=	TokenNameEQUAL	
"http://www.w3.org/2004/xbl"	TokenNameStringLiteral	http://www.w3.org/2004/xbl
;	TokenNameSEMICOLON	
// -- Event types -------------------------------------------------------- 	TokenNameCOMMENT_LINE	-- Event types -------------------------------------------------------- 
String	TokenNameIdentifier	 String
XBL_PREBIND_EVENT_TYPE	TokenNameIdentifier	 XBL  PREBIND  EVENT  TYPE
=	TokenNameEQUAL	
"prebind"	TokenNameStringLiteral	prebind
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_BOUND_EVENT_TYPE	TokenNameIdentifier	 XBL  BOUND  EVENT  TYPE
=	TokenNameEQUAL	
"bound"	TokenNameStringLiteral	bound
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_UNBINDING_EVENT_TYPE	TokenNameIdentifier	 XBL  UNBINDING  EVENT  TYPE
=	TokenNameEQUAL	
"unbinding"	TokenNameStringLiteral	unbinding
;	TokenNameSEMICOLON	
// -- Event handler attributes ------------------------------------------- 	TokenNameCOMMENT_LINE	-- Event handler attributes ------------------------------------------- 
String	TokenNameIdentifier	 String
XBL_ONPREBIND_ATTRIBUTE	TokenNameIdentifier	 XBL  ONPREBIND  ATTRIBUTE
=	TokenNameEQUAL	
"onprebind"	TokenNameStringLiteral	onprebind
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_ONBOUND_ATTRIBUTE	TokenNameIdentifier	 XBL  ONBOUND  ATTRIBUTE
=	TokenNameEQUAL	
"onprebind"	TokenNameStringLiteral	onprebind
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_ONUNBINDING_ATTRIBUTE	TokenNameIdentifier	 XBL  ONUNBINDING  ATTRIBUTE
=	TokenNameEQUAL	
"onprebind"	TokenNameStringLiteral	onprebind
;	TokenNameSEMICOLON	
// -- XBL tags ----------------------------------------------------------- 	TokenNameCOMMENT_LINE	-- XBL tags ----------------------------------------------------------- 
String	TokenNameIdentifier	 String
XBL_XBL_TAG	TokenNameIdentifier	 XBL  XBL  TAG
=	TokenNameEQUAL	
"xbl"	TokenNameStringLiteral	xbl
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_DEFINITION_TAG	TokenNameIdentifier	 XBL  DEFINITION  TAG
=	TokenNameEQUAL	
"definition"	TokenNameStringLiteral	definition
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_TEMPLATE_TAG	TokenNameIdentifier	 XBL  TEMPLATE  TAG
=	TokenNameEQUAL	
"template"	TokenNameStringLiteral	template
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_CONTENT_TAG	TokenNameIdentifier	 XBL  CONTENT  TAG
=	TokenNameEQUAL	
"content"	TokenNameStringLiteral	content
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_HANDLER_GROUP_TAG	TokenNameIdentifier	 XBL  HANDLER  GROUP  TAG
=	TokenNameEQUAL	
"handlerGroup"	TokenNameStringLiteral	handlerGroup
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_IMPORT_TAG	TokenNameIdentifier	 XBL  IMPORT  TAG
=	TokenNameEQUAL	
"import"	TokenNameStringLiteral	import
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_SHADOW_TREE_TAG	TokenNameIdentifier	 XBL  SHADOW  TREE  TAG
=	TokenNameEQUAL	
"shadowTree"	TokenNameStringLiteral	shadowTree
;	TokenNameSEMICOLON	
// -- XBL attributes ----------------------------------------------------- 	TokenNameCOMMENT_LINE	-- XBL attributes ----------------------------------------------------- 
String	TokenNameIdentifier	 String
XBL_BINDINGS_ATTRIBUTE	TokenNameIdentifier	 XBL  BINDINGS  ATTRIBUTE
=	TokenNameEQUAL	
"bindings"	TokenNameStringLiteral	bindings
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_ELEMENT_ATTRIBUTE	TokenNameIdentifier	 XBL  ELEMENT  ATTRIBUTE
=	TokenNameEQUAL	
"element"	TokenNameStringLiteral	element
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_INCLUDES_ATTRIBUTE	TokenNameIdentifier	 XBL  INCLUDES  ATTRIBUTE
=	TokenNameEQUAL	
"includes"	TokenNameStringLiteral	includes
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
XBL_REF_ATTRIBUTE	TokenNameIdentifier	 XBL  REF  ATTRIBUTE
=	TokenNameEQUAL	
"ref"	TokenNameStringLiteral	ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
