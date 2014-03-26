/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
/** * This interface must be implemented in order to call Java code from * an SVG document. * * A ScriptHandler instance is called when a 'script' element's 'type' * attribute value is 'application/java-archive' and when the * manifest of the jar file referenced by the 'xlink:href' attribute * contains a 'Script-Handler' entry. The value of this entry must be * the classname of the ScriptHandler to call. * * This classes implementing this interface must have a default * constructor. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ScriptHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented in order to call Java code from an SVG document. * A ScriptHandler instance is called when a 'script' element's 'type' attribute value is 'application/java-archive' and when the manifest of the jar file referenced by the 'xlink:href' attribute contains a 'Script-Handler' entry. The value of this entry must be the classname of the ScriptHandler to call. * This classes implementing this interface must have a default constructor. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ScriptHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ScriptHandler	TokenNameIdentifier	 Script Handler
{	TokenNameLBRACE	
/** * Runs this handler. This method is called by the SVG viewer * when the scripts are loaded. * @param doc The current document. * @param win An object which represents the current viewer. */	TokenNameCOMMENT_JAVADOC	 Runs this handler. This method is called by the SVG viewer when the scripts are loaded. @param doc The current document. @param win An object which represents the current viewer. 
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Window	TokenNameIdentifier	 Window
win	TokenNameIdentifier	 win
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
