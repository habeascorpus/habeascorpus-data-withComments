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
/** * A request to configure a bean from some configuration in the POM or similar. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A request to configure a bean from some configuration in the POM or similar. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
BeanConfigurationRequest	TokenNameIdentifier	 Bean Configuration Request
{	TokenNameLBRACE	
/** * Gets the bean to configure. Eventually, a valid request must have a bean set. * * @return The bean to configure, or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the bean to configure. Eventually, a valid request must have a bean set. * @return The bean to configure, or {@code null} if none. 
Object	TokenNameIdentifier	 Object
getBean	TokenNameIdentifier	 get Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the bean to configure. Eventually, a valid request must have a bean set. * * @param bean The bean to configure, may be {@code null}. * @return This request for chaining, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the bean to configure. Eventually, a valid request must have a bean set. * @param bean The bean to configure, may be {@code null}. @return This request for chaining, never {@code null}. 
BeanConfigurationRequest	TokenNameIdentifier	 Bean Configuration Request
setBean	TokenNameIdentifier	 set Bean
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
bean	TokenNameIdentifier	 bean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the configuration to unmarshal into the bean. * * @return The configuration to unmarshal into the bean or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the configuration to unmarshal into the bean. * @return The configuration to unmarshal into the bean or {@code null} if none. 
Object	TokenNameIdentifier	 Object
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the configuration to unmarshal into the bean. The configuration should be taken from * {@link org.apache.maven.model.ConfigurationContainer#getConfiguration()} or a similar source. * Fully equivalent to {@code setConfiguration(configuration, null)}. * * @param configuration The configuration to unmarshal, may be {@code null}. * @return This request for chaining, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the configuration to unmarshal into the bean. The configuration should be taken from {@link org.apache.maven.model.ConfigurationContainer#getConfiguration()} or a similar source. Fully equivalent to {@code setConfiguration(configuration, null)}. * @param configuration The configuration to unmarshal, may be {@code null}. @return This request for chaining, never {@code null}. 
BeanConfigurationRequest	TokenNameIdentifier	 Bean Configuration Request
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the configuration to unmarshal into the bean. The configuration should be taken from * {@link org.apache.maven.model.ConfigurationContainer#getConfiguration()} or a similar source. * If {@code element} is not {@code null}, child configuration element with the specified name will * be unmarshaled. * * @param configuration The configuration to unmarshal, may be {@code null}. * @param element Configuration element name to unmarshal or {@code null} to unmarshal entire configuration. * @return This request for chaining, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the configuration to unmarshal into the bean. The configuration should be taken from {@link org.apache.maven.model.ConfigurationContainer#getConfiguration()} or a similar source. If {@code element} is not {@code null}, child configuration element with the specified name will be unmarshaled. * @param configuration The configuration to unmarshal, may be {@code null}. @param element Configuration element name to unmarshal or {@code null} to unmarshal entire configuration. @return This request for chaining, never {@code null}. 
BeanConfigurationRequest	TokenNameIdentifier	 Bean Configuration Request
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
configuration	TokenNameIdentifier	 configuration
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns configuration element name or {@code null}. * * @see {@link #setConfiguration(Object, String)} * * @return Configuration element name or {@code null} */	TokenNameCOMMENT_JAVADOC	 Returns configuration element name or {@code null}. * @see {@link #setConfiguration(Object, String)} * @return Configuration element name or {@code null} 
String	TokenNameIdentifier	 String
getConfigurationElement	TokenNameIdentifier	 get Configuration Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the class loader from which to load any types referenced by the configuration. If unset, the class loader of * the bean class will be used. * * @return The class loader to load referenced types from or {@code null} if unset. */	TokenNameCOMMENT_JAVADOC	 Gets the class loader from which to load any types referenced by the configuration. If unset, the class loader of the bean class will be used. * @return The class loader to load referenced types from or {@code null} if unset. 
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the class loader from which to load any types referenced by the configuration. If unset, the class loader of * the bean class will be used. * * @param classLoader The class loader to load referenced types from, may be {@code null}. * @return This request for chaining, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the class loader from which to load any types referenced by the configuration. If unset, the class loader of the bean class will be used. * @param classLoader The class loader to load referenced types from, may be {@code null}. @return This request for chaining, never {@code null}. 
BeanConfigurationRequest	TokenNameIdentifier	 Bean Configuration Request
setClassLoader	TokenNameIdentifier	 set Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the optional preprocessor for configuration values. * * @return The preprocessor for configuration values or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the optional preprocessor for configuration values. * @return The preprocessor for configuration values or {@code null} if none. 
BeanConfigurationValuePreprocessor	TokenNameIdentifier	 Bean Configuration Value Preprocessor
getValuePreprocessor	TokenNameIdentifier	 get Value Preprocessor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the optional preprocessor for configuration values. * * @param valuePreprocessor The preprocessor for configuration values, may be {@code null} if unneeded. * @return This request for chaining, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the optional preprocessor for configuration values. * @param valuePreprocessor The preprocessor for configuration values, may be {@code null} if unneeded. @return This request for chaining, never {@code null}. 
BeanConfigurationRequest	TokenNameIdentifier	 Bean Configuration Request
setValuePreprocessor	TokenNameIdentifier	 set Value Preprocessor
(	TokenNameLPAREN	
BeanConfigurationValuePreprocessor	TokenNameIdentifier	 Bean Configuration Value Preprocessor
valuePreprocessor	TokenNameIdentifier	 value Preprocessor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the optional path translator for configuration values unmarshalled to files. * * @return The path translator for files or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the optional path translator for configuration values unmarshalled to files. * @return The path translator for files or {@code null} if none. 
BeanConfigurationPathTranslator	TokenNameIdentifier	 Bean Configuration Path Translator
getPathTranslator	TokenNameIdentifier	 get Path Translator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the optional path translator for configuration values unmarshalled to files. * * @param pathTranslator The path translator for files, may be {@code null} if unneeded. * @return This request for chaining, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the optional path translator for configuration values unmarshalled to files. * @param pathTranslator The path translator for files, may be {@code null} if unneeded. @return This request for chaining, never {@code null}. 
BeanConfigurationRequest	TokenNameIdentifier	 Bean Configuration Request
setPathTranslator	TokenNameIdentifier	 set Path Translator
(	TokenNameLPAREN	
BeanConfigurationPathTranslator	TokenNameIdentifier	 Bean Configuration Path Translator
pathTranslator	TokenNameIdentifier	 path Translator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
