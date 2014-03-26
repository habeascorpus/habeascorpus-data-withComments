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
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
;	TokenNameSEMICOLON	
/** * This interface must be implemented by the classes which must provide a * way to override the default locale. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: Localizable.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented by the classes which must provide a way to override the default locale. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: Localizable.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
Localizable	TokenNameIdentifier	 Localizable
{	TokenNameLBRACE	
/** * Provides a way to the user to specify a locale which override the * default one. If null is passed to this method, the used locale * becomes the global one. * @param l The locale to set. */	TokenNameCOMMENT_JAVADOC	 Provides a way to the user to specify a locale which override the default one. If null is passed to this method, the used locale becomes the global one. @param l The locale to set. 
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the current locale or null if the locale currently used is * the default one. */	TokenNameCOMMENT_JAVADOC	 Returns the current locale or null if the locale currently used is the default one. 
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates and returns a localized message, given the key of the message * in the resource bundle and the message parameters. * The messages in the resource bundle must have the syntax described in * the java.text.MessageFormat class documentation. * @param key The key used to retreive the message from the resource * bundle. * @param args The objects that compose the message. * @exception MissingResourceException if the key is not in the bundle. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a localized message, given the key of the message in the resource bundle and the message parameters. The messages in the resource bundle must have the syntax described in the java.text.MessageFormat class documentation. @param key The key used to retreive the message from the resource bundle. @param args The objects that compose the message. @exception MissingResourceException if the key is not in the bundle. 
String	TokenNameIdentifier	 String
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
