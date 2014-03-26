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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The component interface defines methods that must be implemented * by components in a parser configuration. The component methods allow * the component manager to initialize the component state and notify * the component when feature and property values change. * * @see XMLComponentManager * * @author Andy Clark, IBM * * @version $Id: XMLComponent.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The component interface defines methods that must be implemented by components in a parser configuration. The component methods allow the component manager to initialize the component state and notify the component when feature and property values change. * @see XMLComponentManager * @author Andy Clark, IBM * @version $Id: XMLComponent.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLComponent	TokenNameIdentifier	 XML Component
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLComponent methods 	TokenNameCOMMENT_LINE	XMLComponent methods 
// 	TokenNameCOMMENT_LINE	 
/** * Resets the component. The component can query the component manager * about any features and properties that affect the operation of the * component. * * @param componentManager The component manager. * * @throws XNIException Thrown by component on initialization error. */	TokenNameCOMMENT_JAVADOC	 Resets the component. The component can query the component manager about any features and properties that affect the operation of the component. * @param componentManager The component manager. * @throws XNIException Thrown by component on initialization error. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
componentManager	TokenNameIdentifier	 component Manager
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * Returns a list of feature identifiers that are recognized by * this component. This method may return null if no features * are recognized by this component. */	TokenNameCOMMENT_JAVADOC	 Returns a list of feature identifiers that are recognized by this component. This method may return null if no features are recognized by this component. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecognizedFeatures	TokenNameIdentifier	 get Recognized Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the state of a feature. This method is called by the component * manager any time after reset when a feature changes state. * <p> * <strong>Note:</strong> Components should silently ignore features * that do not affect the operation of the component. * * @param featureId The feature identifier. * @param state The state of the feature. * * @throws XMLConfigurationException Thrown for configuration error. * In general, components should * only throw this exception if * it is <strong>really</strong> * a critical error. */	TokenNameCOMMENT_JAVADOC	 Sets the state of a feature. This method is called by the component manager any time after reset when a feature changes state. <p> <strong>Note:</strong> Components should silently ignore features that do not affect the operation of the component. * @param featureId The feature identifier. @param state The state of the feature. * @throws XMLConfigurationException Thrown for configuration error. In general, components should only throw this exception if it is <strong>really</strong> a critical error. 
public	TokenNamepublic	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * Returns a list of property identifiers that are recognized by * this component. This method may return null if no properties * are recognized by this component. */	TokenNameCOMMENT_JAVADOC	 Returns a list of property identifiers that are recognized by this component. This method may return null if no properties are recognized by this component. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecognizedProperties	TokenNameIdentifier	 get Recognized Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the value of a property. This method is called by the component * manager any time after reset when a property changes value. * <p> * <strong>Note:</strong> Components should silently ignore properties * that do not affect the operation of the component. * * @param propertyId The property identifier. * @param value The value of the property. * * @throws XMLConfigurationException Thrown for configuration error. * In general, components should * only throw this exception if * it is <strong>really</strong> * a critical error. */	TokenNameCOMMENT_JAVADOC	 Sets the value of a property. This method is called by the component manager any time after reset when a property changes value. <p> <strong>Note:</strong> Components should silently ignore properties that do not affect the operation of the component. * @param propertyId The property identifier. @param value The value of the property. * @throws XMLConfigurationException Thrown for configuration error. In general, components should only throw this exception if it is <strong>really</strong> a critical error. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * Returns the default state for a feature, or null if this * component does not want to report a default value for this * feature. * * @param featureId The feature identifier. * * @since Xerces 2.2.0 */	TokenNameCOMMENT_JAVADOC	 Returns the default state for a feature, or null if this component does not want to report a default value for this feature. * @param featureId The feature identifier. * @since Xerces 2.2.0 
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
getFeatureDefault	TokenNameIdentifier	 get Feature Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the default state for a property, or null if this * component does not want to report a default value for this * property. * * @param propertyId The property identifier. * * @since Xerces 2.2.0 */	TokenNameCOMMENT_JAVADOC	 Returns the default state for a property, or null if this component does not want to report a default value for this property. * @param propertyId The property identifier. * @since Xerces 2.2.0 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getPropertyDefault	TokenNameIdentifier	 get Property Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLComponent 	TokenNameCOMMENT_LINE	interface XMLComponent 
