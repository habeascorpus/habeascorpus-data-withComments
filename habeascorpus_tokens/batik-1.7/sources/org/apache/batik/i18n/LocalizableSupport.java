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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MessageFormat	TokenNameIdentifier	 Message Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
;	TokenNameSEMICOLON	
/** * This class provides a default implementation of the Localizable interface. * You can use it as a base class or as a member field and delegates various * work to it.<p> * For example, to implement Localizable, the following code can be used: * <pre> * package mypackage; * ... * public class MyClass implements Localizable { * // This code fragment requires a file named * // 'mypackage/resources/Messages.properties', or a * // 'mypackage.resources.Messages' class which extends * // java.util.ResourceBundle, accessible using the current * // classpath. * LocalizableSupport localizableSupport = * new LocalizableSupport("mypackage.resources.Messages"); * * public void setLocale(Locale l) { * localizableSupport.setLocale(l); * } * public Local getLocale() { * return localizableSupport.getLocale(); * } * public String formatMessage(String key, Object[] args) { * return localizableSupport.formatMessage(key, args); * } * } * </pre> * The algorithm for the Locale lookup in a LocalizableSupport object is: * <ul> * <li> * if a Locale has been set by a call to setLocale(), use this Locale, * else, * <li/> * <li> * if a Locale has been set by a call to the setDefaultLocale() method * of a LocalizableSupport object in the current LocaleGroup, use this * Locale, else, * </li> * <li> * use the object returned by Locale.getDefault() (and set by * Locale.setDefault()). * <li/> * </ul> * This offers the possibility to have a different Locale for each object, * a Locale for a group of object and/or a Locale for the JVM instance. * <p> * Note: if no group is specified a LocalizableSupport object belongs to a * default group common to each instance of LocalizableSupport. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: LocalizableSupport.java 594379 2007-11-13 01:08:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a default implementation of the Localizable interface. You can use it as a base class or as a member field and delegates various work to it.<p> For example, to implement Localizable, the following code can be used: <pre> package mypackage; ... public class MyClass implements Localizable { // This code fragment requires a file named // 'mypackage/resources/Messages.properties', or a // 'mypackage.resources.Messages' class which extends // java.util.ResourceBundle, accessible using the current // classpath. LocalizableSupport localizableSupport = new LocalizableSupport("mypackage.resources.Messages"); * public void setLocale(Locale l) { localizableSupport.setLocale(l); } public Local getLocale() { return localizableSupport.getLocale(); } public String formatMessage(String key, Object[] args) { return localizableSupport.formatMessage(key, args); } } </pre> The algorithm for the Locale lookup in a LocalizableSupport object is: <ul> <li> if a Locale has been set by a call to setLocale(), use this Locale, else, <li/> <li> if a Locale has been set by a call to the setDefaultLocale() method of a LocalizableSupport object in the current LocaleGroup, use this Locale, else, </li> <li> use the object returned by Locale.getDefault() (and set by Locale.setDefault()). <li/> </ul> This offers the possibility to have a different Locale for each object, a Locale for a group of object and/or a Locale for the JVM instance. <p> Note: if no group is specified a LocalizableSupport object belongs to a default group common to each instance of LocalizableSupport. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: LocalizableSupport.java 594379 2007-11-13 01:08:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
implements	TokenNameimplements	
Localizable	TokenNameIdentifier	 Localizable
{	TokenNameLBRACE	
/** * The locale group to which this object belongs. */	TokenNameCOMMENT_JAVADOC	 The locale group to which this object belongs. 
protected	TokenNameprotected	
LocaleGroup	TokenNameIdentifier	 Locale Group
localeGroup	TokenNameIdentifier	 locale Group
=	TokenNameEQUAL	
LocaleGroup	TokenNameIdentifier	 Locale Group
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
;	TokenNameSEMICOLON	
/** * The resource bundle classname. */	TokenNameCOMMENT_JAVADOC	 The resource bundle classname. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
;	TokenNameSEMICOLON	
/** * The classloader to use to create the resource bundle. */	TokenNameCOMMENT_JAVADOC	 The classloader to use to create the resource bundle. 
protected	TokenNameprotected	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
/** * The current locale. */	TokenNameCOMMENT_JAVADOC	 The current locale. 
protected	TokenNameprotected	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
/** * The locale in use. */	TokenNameCOMMENT_JAVADOC	 The locale in use. 
protected	TokenNameprotected	
Locale	TokenNameIdentifier	 Locale
usedLocale	TokenNameIdentifier	 used Locale
;	TokenNameSEMICOLON	
/** * The resources */	TokenNameCOMMENT_JAVADOC	 The resources 
List	TokenNameIdentifier	 List
resourceBundles	TokenNameIdentifier	 resource Bundles
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
lastResourceClass	TokenNameIdentifier	 last Resource Class
;	TokenNameSEMICOLON	
/** * The class to lookup bundleName from. */	TokenNameCOMMENT_JAVADOC	 The class to lookup bundleName from. 
Class	TokenNameIdentifier	 Class
cls	TokenNameIdentifier	 cls
;	TokenNameSEMICOLON	
/** * Same as LocalizableSupport(cls, null). */	TokenNameCOMMENT_JAVADOC	 Same as LocalizableSupport(cls, null). 
public	TokenNamepublic	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
cls	TokenNameIdentifier	 cls
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
cls	TokenNameIdentifier	 cls
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Same as LocalizableSupport(cls, null). */	TokenNameCOMMENT_JAVADOC	 Same as LocalizableSupport(cls, null). 
public	TokenNamepublic	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
cls	TokenNameIdentifier	 cls
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bundleName	TokenNameIdentifier	 bundle Name
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
;	TokenNameSEMICOLON	
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Same as LocalizableSupport(s, null). */	TokenNameCOMMENT_JAVADOC	 Same as LocalizableSupport(s, null). 
public	TokenNamepublic	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new Localizable object. * The resource bundle class name is required allows the use of custom * classes of resource bundles. * @param s must be the name of the class to use to get the appropriate * resource bundle given the current locale. * @param cl is the classloader used to create the resource bundle, * or null. * @see java.util.ResourceBundle */	TokenNameCOMMENT_JAVADOC	 Creates a new Localizable object. The resource bundle class name is required allows the use of custom classes of resource bundles. @param s must be the name of the class to use to get the appropriate resource bundle given the current locale. @param cl is the classloader used to create the resource bundle, or null. @see java.util.ResourceBundle 
public	TokenNamepublic	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bundleName	TokenNameIdentifier	 bundle Name
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.i18n.Localizable#setLocale(Locale)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.Localizable#setLocale(Locale)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
!=	TokenNameNOT_EQUAL	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
resourceBundles	TokenNameIdentifier	 resource Bundles
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastResourceClass	TokenNameIdentifier	 last Resource Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.i18n.Localizable#getLocale()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.Localizable#getLocale()}. 
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
/** * Implements {@link * org.apache.batik.i18n.ExtendedLocalizable#setLocaleGroup(LocaleGroup)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.ExtendedLocalizable#setLocaleGroup(LocaleGroup)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocaleGroup	TokenNameIdentifier	 set Locale Group
(	TokenNameLPAREN	
LocaleGroup	TokenNameIdentifier	 Locale Group
lg	TokenNameIdentifier	 lg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localeGroup	TokenNameIdentifier	 locale Group
=	TokenNameEQUAL	
lg	TokenNameIdentifier	 lg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.i18n.ExtendedLocalizable#getLocaleGroup()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.ExtendedLocalizable#getLocaleGroup()}. 
public	TokenNamepublic	
LocaleGroup	TokenNameIdentifier	 Locale Group
getLocaleGroup	TokenNameIdentifier	 get Locale Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localeGroup	TokenNameIdentifier	 locale Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.i18n.ExtendedLocalizable#setDefaultLocale(Locale)}. * Later invocations of the instance methods will lead to update the * resource bundle used. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.ExtendedLocalizable#setDefaultLocale(Locale)}. Later invocations of the instance methods will lead to update the resource bundle used. 
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultLocale	TokenNameIdentifier	 set Default Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localeGroup	TokenNameIdentifier	 locale Group
.	TokenNameDOT	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.i18n.ExtendedLocalizable#getDefaultLocale()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.ExtendedLocalizable#getDefaultLocale()}. 
public	TokenNamepublic	
Locale	TokenNameIdentifier	 Locale
getDefaultLocale	TokenNameIdentifier	 get Default Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localeGroup	TokenNameIdentifier	 locale Group
.	TokenNameDOT	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.i18n.Localizable#formatMessage(String,Object[])}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.Localizable#formatMessage(String,Object[])}. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Locale	TokenNameIdentifier	 Locale
getCurrentLocale	TokenNameIdentifier	 get Current Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
Locale	TokenNameIdentifier	 Locale
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
localeGroup	TokenNameIdentifier	 locale Group
.	TokenNameDOT	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns true if the locale is different from the previously * used locale. Also sets 'usedLocale' to the current locale. */	TokenNameCOMMENT_JAVADOC	 returns true if the locale is different from the previously used locale. Also sets 'usedLocale' to the current locale. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
setUsedLocale	TokenNameIdentifier	 set Used Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
getCurrentLocale	TokenNameIdentifier	 get Current Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
usedLocale	TokenNameIdentifier	 used Locale
==	TokenNameEQUAL_EQUAL	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
usedLocale	TokenNameIdentifier	 used Locale
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
resourceBundles	TokenNameIdentifier	 resource Bundles
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastResourceClass	TokenNameIdentifier	 last Resource Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Here for backwards compatability */	TokenNameCOMMENT_JAVADOC	 Here for backwards compatability 
public	TokenNamepublic	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasNextResourceBundle	TokenNameIdentifier	 has Next Resource Bundle
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
resourceBundles	TokenNameIdentifier	 resource Bundles
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastResourceClass	TokenNameIdentifier	 last Resource Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastResourceClass	TokenNameIdentifier	 last Resource Class
==	TokenNameEQUAL_EQUAL	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
lookupResourceBundle	TokenNameIdentifier	 lookup Resource Bundle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
bundle	TokenNameIdentifier	 bundle
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
theClass	TokenNameIdentifier	 the Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
rb	TokenNameIdentifier	 rb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
rb	TokenNameIdentifier	 rb
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
bundle	TokenNameIdentifier	 bundle
,	TokenNameCOMMA	
usedLocale	TokenNameIdentifier	 used Locale
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
mre	TokenNameIdentifier	 mre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rb	TokenNameIdentifier	 rb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
rb	TokenNameIdentifier	 rb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
theClass	TokenNameIdentifier	 the Class
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
theClass	TokenNameIdentifier	 the Class
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
rb	TokenNameIdentifier	 rb
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
bundle	TokenNameIdentifier	 bundle
,	TokenNameCOMMA	
usedLocale	TokenNameIdentifier	 used Locale
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
mre	TokenNameIdentifier	 mre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
rb	TokenNameIdentifier	 rb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUsedLocale	TokenNameIdentifier	 set Used Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
rb	TokenNameIdentifier	 rb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cls	TokenNameIdentifier	 cls
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Old behavour 	TokenNameCOMMENT_LINE	Old behavour 
if	TokenNameif	
(	TokenNameLPAREN	
resourceBundles	TokenNameIdentifier	 resource Bundles
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rb	TokenNameIdentifier	 rb
=	TokenNameEQUAL	
lookupResourceBundle	TokenNameIdentifier	 lookup Resource Bundle
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resourceBundles	TokenNameIdentifier	 resource Bundles
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rb	TokenNameIdentifier	 rb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
)	TokenNameRPAREN	
resourceBundles	TokenNameIdentifier	 resource Bundles
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
resourceBundles	TokenNameIdentifier	 resource Bundles
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastResourceClass	TokenNameIdentifier	 last Resource Class
==	TokenNameEQUAL_EQUAL	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastResourceClass	TokenNameIdentifier	 last Resource Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
lastResourceClass	TokenNameIdentifier	 last Resource Class
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
;	TokenNameSEMICOLON	
else	TokenNameelse	
lastResourceClass	TokenNameIdentifier	 last Resource Class
=	TokenNameEQUAL	
lastResourceClass	TokenNameIdentifier	 last Resource Class
.	TokenNameDOT	
getSuperclass	TokenNameIdentifier	 get Superclass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
lastResourceClass	TokenNameIdentifier	 last Resource Class
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
bundle	TokenNameIdentifier	 bundle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
getPackage	TokenNameIdentifier	 get Package
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
bundleName	TokenNameIdentifier	 bundle Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resourceBundles	TokenNameIdentifier	 resource Bundles
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lookupResourceBundle	TokenNameIdentifier	 lookup Resource Bundle
(	TokenNameLPAREN	
bundle	TokenNameIdentifier	 bundle
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
)	TokenNameRPAREN	
resourceBundles	TokenNameIdentifier	 resource Bundles
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
setUsedLocale	TokenNameIdentifier	 set Used Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hasNextResourceBundle	TokenNameIdentifier	 has Next Resource Bundle
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
rb	TokenNameIdentifier	 rb
=	TokenNameEQUAL	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rb	TokenNameIdentifier	 rb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
rb	TokenNameIdentifier	 rb
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
mre	TokenNameIdentifier	 mre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
classStr	TokenNameIdentifier	 class Str
=	TokenNameEQUAL	
(	TokenNameLPAREN	
cls	TokenNameIdentifier	 cls
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
cls	TokenNameIdentifier	 cls
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
bundleName	TokenNameIdentifier	 bundle Name
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
(	TokenNameLPAREN	
"Unable to find resource: "	TokenNameStringLiteral	Unable to find resource: 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
classStr	TokenNameIdentifier	 class Str
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the integer mapped with the given string * @param key a key of the resource bundle * @throws MissingResourceException if key is not the name of a resource */	TokenNameCOMMENT_JAVADOC	 Returns the integer mapped with the given string @param key a key of the resource bundle @throws MissingResourceException if key is not the name of a resource 
public	TokenNamepublic	
int	TokenNameint	
getInteger	TokenNameIdentifier	 get Integer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
(	TokenNameLPAREN	
"Malformed integer"	TokenNameStringLiteral	Malformed integer
,	TokenNameCOMMA	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCharacter	TokenNameIdentifier	 get Character
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
(	TokenNameLPAREN	
"Malformed character"	TokenNameStringLiteral	Malformed character
,	TokenNameCOMMA	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
