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
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
.	TokenNameDOT	
rhino	TokenNameIdentifier	 rhino
.	TokenNameDOT	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
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
ScriptableObject	TokenNameIdentifier	 Scriptable Object
;	TokenNameSEMICOLON	
/** * A RhinoInterpreter for SVG 1.2 documents. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVG12RhinoInterpreter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A RhinoInterpreter for SVG 1.2 documents. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVG12RhinoInterpreter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVG12RhinoInterpreter	TokenNameIdentifier	 SV G12 Rhino Interpreter
extends	TokenNameextends	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
{	TokenNameLBRACE	
/** * Creates an SVG12RhinoInterpreter object. */	TokenNameCOMMENT_JAVADOC	 Creates an SVG12RhinoInterpreter object. 
public	TokenNamepublic	
SVG12RhinoInterpreter	TokenNameIdentifier	 SV G12 Rhino Interpreter
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
documentURL	TokenNameIdentifier	 document URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
documentURL	TokenNameIdentifier	 document URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Defines the class for the global object. */	TokenNameCOMMENT_JAVADOC	 Defines the class for the global object. 
protected	TokenNameprotected	
void	TokenNamevoid	
defineGlobalWrapperClass	TokenNameIdentifier	 define Global Wrapper Class
(	TokenNameLPAREN	
Scriptable	TokenNameIdentifier	 Scriptable
global	TokenNameIdentifier	 global
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ScriptableObject	TokenNameIdentifier	 Scriptable Object
.	TokenNameDOT	
defineClass	TokenNameIdentifier	 define Class
(	TokenNameLPAREN	
global	TokenNameIdentifier	 global
,	TokenNameCOMMA	
GlobalWrapper	TokenNameIdentifier	 Global Wrapper
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// cannot happen 	TokenNameCOMMENT_LINE	cannot happen 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates the global object. */	TokenNameCOMMENT_JAVADOC	 Creates the global object. 
protected	TokenNameprotected	
ScriptableObject	TokenNameIdentifier	 Scriptable Object
createGlobalObject	TokenNameIdentifier	 create Global Object
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GlobalWrapper	TokenNameIdentifier	 Global Wrapper
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
