package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Preprocesses a value from a bean configuration before the bean configurator unmarshals it into a bean property. A * common use case for such preprocessing is the evaluation of variables within the configuration value. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Preprocesses a value from a bean configuration before the bean configurator unmarshals it into a bean property. A common use case for such preprocessing is the evaluation of variables within the configuration value. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
BeanConfigurationValuePreprocessor	TokenNameIdentifier	 Bean Configuration Value Preprocessor
{	TokenNameLBRACE	
/** * Preprocesses the specified bean configuration value. The optional type provided to this method is a hint (not a * requirement) for the preprocessor to resolve the value to a compatible value or a (string) value than can be * unmarshalled into that type. The preprocessor is not required to perform any type conversion but should rather * filter out incompatible values from its result. * * @param value The configuration value to preprocess, must not be {@code null}. * @param type The target type of the value, may be {@code null}. * @return The processed configuration value or {@code null} if none. * @throws BeanConfigurationException If an error occurred while preprocessing the value. */	TokenNameCOMMENT_JAVADOC	 Preprocesses the specified bean configuration value. The optional type provided to this method is a hint (not a requirement) for the preprocessor to resolve the value to a compatible value or a (string) value than can be unmarshalled into that type. The preprocessor is not required to perform any type conversion but should rather filter out incompatible values from its result. * @param value The configuration value to preprocess, must not be {@code null}. @param type The target type of the value, may be {@code null}. @return The processed configuration value or {@code null} if none. @throws BeanConfigurationException If an error occurred while preprocessing the value. 
Object	TokenNameIdentifier	 Object
preprocessValue	TokenNameIdentifier	 preprocess Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
BeanConfigurationException	TokenNameIdentifier	 Bean Configuration Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
