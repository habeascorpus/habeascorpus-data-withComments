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
taskdefs	TokenNameIdentifier	 taskdefs
;	TokenNameSEMICOLON	
/** * Extended Proxy interface for XSLT processors. * * @see XSLTProcess * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Extended Proxy interface for XSLT processors. * @see XSLTProcess @since Ant 1.6 
public	TokenNamepublic	
interface	TokenNameinterface	
XSLTLiaison2	TokenNameIdentifier	 XSLT Liaison2
extends	TokenNameextends	
XSLTLiaison	TokenNameIdentifier	 XSLT Liaison
{	TokenNameLBRACE	
/** * Configure the liasion from the XSLTProcess task * @param xsltTask the XSLTProcess task */	TokenNameCOMMENT_JAVADOC	 Configure the liasion from the XSLTProcess task @param xsltTask the XSLTProcess task 
void	TokenNamevoid	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
XSLTProcess	TokenNameIdentifier	 XSLT Process
xsltTask	TokenNameIdentifier	 xslt Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
