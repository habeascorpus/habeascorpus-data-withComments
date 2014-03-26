/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
.	TokenNameDOT	
rhino	TokenNameIdentifier	 rhino
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
Context	TokenNameIdentifier	 Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
Scriptable	TokenNameIdentifier	 Scriptable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
WrapFactory	TokenNameIdentifier	 Wrap Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
EventTarget	TokenNameIdentifier	 Event Target
;	TokenNameSEMICOLON	
/** * This is an utility class allowing to pass an ECMAScript function * as a parameter of the <code>addEventListener</code> method of * <code>EventTarget</code> objects as DOM Level 2 recommendation * required. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: BatikWrapFactory.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is an utility class allowing to pass an ECMAScript function as a parameter of the <code>addEventListener</code> method of <code>EventTarget</code> objects as DOM Level 2 recommendation required. @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: BatikWrapFactory.java 475477 2006-11-15 22:44:28Z cam $ 
class	TokenNameclass	
BatikWrapFactory	TokenNameIdentifier	 Batik Wrap Factory
extends	TokenNameextends	
WrapFactory	TokenNameIdentifier	 Wrap Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BatikWrapFactory	TokenNameIdentifier	 Batik Wrap Factory
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interp	TokenNameIdentifier	 interp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
interp	TokenNameIdentifier	 interp
;	TokenNameSEMICOLON	
setJavaPrimitiveWrap	TokenNameIdentifier	 set Java Primitive Wrap
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
staticType	TokenNameIdentifier	 static Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
EventTarget	TokenNameIdentifier	 Event Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
buildEventTargetWrapper	TokenNameIdentifier	 build Event Target Wrapper
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
staticType	TokenNameIdentifier	 static Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
