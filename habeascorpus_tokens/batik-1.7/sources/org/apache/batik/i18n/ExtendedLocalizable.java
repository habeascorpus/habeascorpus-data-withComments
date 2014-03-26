/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
i18n	TokenNameIdentifier	 i18n
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
/** * This interface provides much more control over internationalization * than the Localizable interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ExtendedLocalizable.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface provides much more control over internationalization than the Localizable interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ExtendedLocalizable.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ExtendedLocalizable	TokenNameIdentifier	 Extended Localizable
extends	TokenNameextends	
Localizable	TokenNameIdentifier	 Localizable
{	TokenNameLBRACE	
/** * Sets the group to which this object belongs. */	TokenNameCOMMENT_JAVADOC	 Sets the group to which this object belongs. 
void	TokenNamevoid	
setLocaleGroup	TokenNameIdentifier	 set Locale Group
(	TokenNameLPAREN	
LocaleGroup	TokenNameIdentifier	 Locale Group
lg	TokenNameIdentifier	 lg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the group to which this object belongs. */	TokenNameCOMMENT_JAVADOC	 Returns the group to which this object belongs. 
LocaleGroup	TokenNameIdentifier	 Locale Group
getLocaleGroup	TokenNameIdentifier	 get Locale Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the default locale for all the instances of this class in * the same LocaleGroup. */	TokenNameCOMMENT_JAVADOC	 Sets the default locale for all the instances of this class in the same LocaleGroup. 
void	TokenNamevoid	
setDefaultLocale	TokenNameIdentifier	 set Default Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the current default locale in the LocaleGroup. */	TokenNameCOMMENT_JAVADOC	 Gets the current default locale in the LocaleGroup. 
Locale	TokenNameIdentifier	 Locale
getDefaultLocale	TokenNameIdentifier	 get Default Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the current resource bundle. Getting this object gives access * to the keys in the bundle, raw string resources, arrays of raw string * resources and object resources. */	TokenNameCOMMENT_JAVADOC	 Returns the current resource bundle. Getting this object gives access to the keys in the bundle, raw string resources, arrays of raw string resources and object resources. 
ResourceBundle	TokenNameIdentifier	 Resource Bundle
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
