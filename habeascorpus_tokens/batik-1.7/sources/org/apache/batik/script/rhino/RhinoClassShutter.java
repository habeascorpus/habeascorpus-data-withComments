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
ClassShutter	TokenNameIdentifier	 Class Shutter
;	TokenNameSEMICOLON	
/** * Class shutter that restricts access to Batik internals from script. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: RhinoClassShutter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Class shutter that restricts access to Batik internals from script. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: RhinoClassShutter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
RhinoClassShutter	TokenNameIdentifier	 Rhino Class Shutter
implements	TokenNameimplements	
ClassShutter	TokenNameIdentifier	 Class Shutter
{	TokenNameLBRACE	
/* public RhinoClassShutter() { // I suspect that we might want to initialize this // from a resource file. // test(); } public void test() { test("org.mozilla.javascript.Context"); test("org.mozilla.javascript"); test("org.apache.batik.dom.SVGOMDocument"); test("org.apache.batik.script.rhino.RhinoInterpreter"); test("org.apache.batik.apps.svgbrowser.JSVGViewerFrame"); test("org.apache.batik.bridge.BridgeContext"); test("org.apache.batik.bridge.BaseScriptingEnvironment"); test("org.apache.batik.bridge.ScriptingEnvironment"); } public void test(String cls) { System.err.println("Test '" + cls + "': " + visibleToScripts(cls)); } */	TokenNameCOMMENT_BLOCK	 public RhinoClassShutter() { // I suspect that we might want to initialize this // from a resource file. // test(); } public void test() { test("org.mozilla.javascript.Context"); test("org.mozilla.javascript"); test("org.apache.batik.dom.SVGOMDocument"); test("org.apache.batik.script.rhino.RhinoInterpreter"); test("org.apache.batik.apps.svgbrowser.JSVGViewerFrame"); test("org.apache.batik.bridge.BridgeContext"); test("org.apache.batik.bridge.BaseScriptingEnvironment"); test("org.apache.batik.bridge.ScriptingEnvironment"); } public void test(String cls) { System.err.println("Test '" + cls + "': " + visibleToScripts(cls)); } 
/** * Returns whether the given class is visible to scripts. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given class is visible to scripts. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visibleToScripts	TokenNameIdentifier	 visible To Scripts
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fullClassName	TokenNameIdentifier	 full Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't let them mess with script engine's internals. 	TokenNameCOMMENT_LINE	Don't let them mess with script engine's internals. 
if	TokenNameif	
(	TokenNameLPAREN	
fullClassName	TokenNameIdentifier	 full Class Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"org.mozilla.javascript"	TokenNameStringLiteral	org.mozilla.javascript
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fullClassName	TokenNameIdentifier	 full Class Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"org.apache.batik."	TokenNameStringLiteral	org.apache.batik.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Just get packge within batik. 	TokenNameCOMMENT_LINE	Just get packge within batik. 
String	TokenNameIdentifier	 String
batikPkg	TokenNameIdentifier	 batik Pkg
=	TokenNameEQUAL	
fullClassName	TokenNameIdentifier	 full Class Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Don't let them mess with Batik script internals. 	TokenNameCOMMENT_LINE	Don't let them mess with Batik script internals. 
if	TokenNameif	
(	TokenNameLPAREN	
batikPkg	TokenNameIdentifier	 batik Pkg
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"script"	TokenNameStringLiteral	script
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Don't let them get global structures. 	TokenNameCOMMENT_LINE	Don't let them get global structures. 
if	TokenNameif	
(	TokenNameLPAREN	
batikPkg	TokenNameIdentifier	 batik Pkg
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"apps"	TokenNameStringLiteral	apps
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Don't let them get Scripting stuff from bridge. 	TokenNameCOMMENT_LINE	Don't let them get Scripting stuff from bridge. 
if	TokenNameif	
(	TokenNameLPAREN	
batikPkg	TokenNameIdentifier	 batik Pkg
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"bridge."	TokenNameStringLiteral	bridge.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
batikPkg	TokenNameIdentifier	 batik Pkg
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
".BaseScriptingEnvironment"	TokenNameStringLiteral	.BaseScriptingEnvironment
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
batikPkg	TokenNameIdentifier	 batik Pkg
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
".ScriptingEnvironment"	TokenNameStringLiteral	.ScriptingEnvironment
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
