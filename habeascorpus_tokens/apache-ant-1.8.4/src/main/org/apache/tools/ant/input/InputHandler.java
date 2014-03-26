/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
/** * Plugin to Ant to handle requests for user input. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Plugin to Ant to handle requests for user input. * @since Ant 1.5 
public	TokenNamepublic	
interface	TokenNameinterface	
InputHandler	TokenNameIdentifier	 Input Handler
{	TokenNameLBRACE	
/** * Handle the request encapsulated in the argument. * * <p>Precondition: the request.getPrompt will return a non-null * value.</p> * * <p>Postcondition: request.getInput will return a non-null * value, request.isInputValid will return true.</p> * @param request the request to be processed * @throws org.apache.tools.ant.BuildException if the input cannot be read from the console */	TokenNameCOMMENT_JAVADOC	 Handle the request encapsulated in the argument. * <p>Precondition: the request.getPrompt will return a non-null value.</p> * <p>Postcondition: request.getInput will return a non-null value, request.isInputValid will return true.</p> @param request the request to be processed @throws org.apache.tools.ant.BuildException if the input cannot be read from the console 
void	TokenNamevoid	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
InputRequest	TokenNameIdentifier	 Input Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
