/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * When implemented by an object configured by DOMConfigurator, * the handle method will be called when an unrecognized child * element is encountered. Unrecognized child elements of * the log4j:configuration element will be dispatched to * the logger repository if it supports this interface. * * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 When implemented by an object configured by DOMConfigurator, the handle method will be called when an unrecognized child element is encountered. Unrecognized child elements of the log4j:configuration element will be dispatched to the logger repository if it supports this interface. * @since 1.2.15 
public	TokenNamepublic	
interface	TokenNameinterface	
UnrecognizedElementHandler	TokenNameIdentifier	 Unrecognized Element Handler
{	TokenNameLBRACE	
/** * Called to inform a configured object when * an unrecognized child element is encountered. * @param element element, may not be null. * @param props properties in force, may be null. * @return true if configured object recognized the element * @throws Exception throw an exception to prevent activation * of the configured object. */	TokenNameCOMMENT_JAVADOC	 Called to inform a configured object when an unrecognized child element is encountered. @param element element, may not be null. @param props properties in force, may be null. @return true if configured object recognized the element @throws Exception throw an exception to prevent activation of the configured object. 
boolean	TokenNameboolean	
parseUnrecognizedElement	TokenNameIdentifier	 parse Unrecognized Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
