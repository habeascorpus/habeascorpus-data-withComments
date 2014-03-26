/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * The component manager manages a parser configuration and the components * that make up that configuration. The manager notifies each component * before parsing to allow the components to initialize their state; and * also any time that a parser feature or property changes. * <p> * The methods of the component manager allow components to query features * and properties that affect the operation of the component. * * @see XMLComponent * * @author Andy Clark, IBM * * @version $Id: XMLComponentManager.java 447244 2006-09-18 05:20:40Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The component manager manages a parser configuration and the components that make up that configuration. The manager notifies each component before parsing to allow the components to initialize their state; and also any time that a parser feature or property changes. <p> The methods of the component manager allow components to query features and properties that affect the operation of the component. * @see XMLComponent * @author Andy Clark, IBM * @version $Id: XMLComponentManager.java 447244 2006-09-18 05:20:40Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLComponentManager methods 	TokenNameCOMMENT_LINE	XMLComponentManager methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the state of a feature. * * @param featureId The feature identifier. * * @throws XMLConfigurationException Thrown on configuration error. */	TokenNameCOMMENT_JAVADOC	 Returns the state of a feature. * @param featureId The feature identifier. * @throws XMLConfigurationException Thrown on configuration error. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * Returns the value of a property. * * @param propertyId The property identifier. * * @throws XMLConfigurationException Thrown on configuration error. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a property. * @param propertyId The property identifier. * @throws XMLConfigurationException Thrown on configuration error. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLComponentManager 	TokenNameCOMMENT_LINE	interface XMLComponentManager 
