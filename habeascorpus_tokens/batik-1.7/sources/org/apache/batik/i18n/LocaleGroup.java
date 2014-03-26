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
/** * This class represents a group of ExtendedLocalizable objects which * have a shared default locale. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: LocaleGroup.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents a group of ExtendedLocalizable objects which have a shared default locale. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: LocaleGroup.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
LocaleGroup	TokenNameIdentifier	 Locale Group
{	TokenNameLBRACE	
/** * The default group. */	TokenNameCOMMENT_JAVADOC	 The default group. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LocaleGroup	TokenNameIdentifier	 Locale Group
DEFAULT	TokenNameIdentifier	 DEFAULT
=	TokenNameEQUAL	
new	TokenNamenew	
LocaleGroup	TokenNameIdentifier	 Locale Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The shared Locale. */	TokenNameCOMMENT_JAVADOC	 The shared Locale. 
protected	TokenNameprotected	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
/** * Sets the default locale for all the instances of ExtendedLocalizable * in this group. */	TokenNameCOMMENT_JAVADOC	 Sets the default locale for all the instances of ExtendedLocalizable in this group. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the current default locale in this group, or null. */	TokenNameCOMMENT_JAVADOC	 Gets the current default locale in this group, or null. 
public	TokenNamepublic	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
