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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Parameterizable	TokenNameIdentifier	 Parameterizable
;	TokenNameSEMICOLON	
/** * This is the interface to be used by all custom selectors, those that are * called through the &lt;custom&gt; tag. It is the amalgamation of two * interfaces, the FileSelector and the Parameterizable interface. Note that * you will almost certainly want the default behaviour for handling * Parameters, so you probably want to use the BaseExtendSelector class * as the base class for your custom selector rather than implementing * this interface from scratch. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 This is the interface to be used by all custom selectors, those that are called through the &lt;custom&gt; tag. It is the amalgamation of two interfaces, the FileSelector and the Parameterizable interface. Note that you will almost certainly want the default behaviour for handling Parameters, so you probably want to use the BaseExtendSelector class as the base class for your custom selector rather than implementing this interface from scratch. * @since 1.5 
public	TokenNamepublic	
interface	TokenNameinterface	
ExtendFileSelector	TokenNameIdentifier	 Extend File Selector
extends	TokenNameextends	
FileSelector	TokenNameIdentifier	 File Selector
,	TokenNameCOMMA	
Parameterizable	TokenNameIdentifier	 Parameterizable
{	TokenNameLBRACE	
// No further methods necessary. This is just an amalgamation of two other 	TokenNameCOMMENT_LINE	No further methods necessary. This is just an amalgamation of two other 
// interfaces. 	TokenNameCOMMENT_LINE	interfaces. 
}	TokenNameRBRACE	
