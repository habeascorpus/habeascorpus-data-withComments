/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Messages.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Messages.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
/** * A utility class for issuing error messages. * * A user of this class normally would create a singleton * instance of this class, passing the name * of the message class on the constructor. For example: * <CODE> * static Messages x = new Messages("org.package.MyMessages"); * </CODE> * Later the message is typically generated this way if there are no * substitution arguments: * <CODE> * String msg = x.createMessage(org.package.MyMessages.KEY_ONE, null); * </CODE> * If there are arguments substitutions then something like this: * <CODE> * String filename = ...; * String directory = ...; * String msg = x.createMessage(org.package.MyMessages.KEY_TWO, * new Object[] {filename, directory) ); * </CODE> * * The constructor of an instance of this class must be given * the class name of a class that extends java.util.ListResourceBundle * ("org.package.MyMessages" in the example above). * The name should not have any language suffix * which will be added automatically by this utility class. * * The message class ("org.package.MyMessages") * must define the abstract method getContents() that is * declared in its base class, for example: * <CODE> * public Object[][] getContents() {return contents;} * </CODE> * * It is suggested that the message class expose its * message keys like this: * <CODE> * public static final String KEY_ONE = "KEY1"; * public static final String KEY_TWO = "KEY2"; * . . . * </CODE> * and used through their names (KEY_ONE ...) rather than * their values ("KEY1" ...). * * The field contents (returned by getContents() * should be initialized something like this: * <CODE> * public static final Object[][] contents = { * { KEY_ONE, "Something has gone wrong!" }, * { KEY_TWO, "The file ''{0}'' does not exist in directory ''{1}''." }, * . . . * { KEY_N, "Message N" } } * </CODE> * * Where that section of code with the KEY to Message mappings * (where the message classes 'contents' field is initialized) * can have the Message strings translated in an alternate language * in a errorResourceClass with a language suffix. * * More sophisticated use of this class would be to pass null * when contructing it, but then call loadResourceBundle() * before creating any messages. * * This class is not a public API, it is only public because it is * used in org.apache.xml.serializer. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A utility class for issuing error messages. * A user of this class normally would create a singleton instance of this class, passing the name of the message class on the constructor. For example: <CODE> static Messages x = new Messages("org.package.MyMessages"); </CODE> Later the message is typically generated this way if there are no substitution arguments: <CODE> String msg = x.createMessage(org.package.MyMessages.KEY_ONE, null); </CODE> If there are arguments substitutions then something like this: <CODE> String filename = ...; String directory = ...; String msg = x.createMessage(org.package.MyMessages.KEY_TWO, new Object[] {filename, directory) ); </CODE> * The constructor of an instance of this class must be given the class name of a class that extends java.util.ListResourceBundle ("org.package.MyMessages" in the example above). The name should not have any language suffix which will be added automatically by this utility class. * The message class ("org.package.MyMessages") must define the abstract method getContents() that is declared in its base class, for example: <CODE> public Object[][] getContents() {return contents;} </CODE> * It is suggested that the message class expose its message keys like this: <CODE> public static final String KEY_ONE = "KEY1"; public static final String KEY_TWO = "KEY2"; . . . </CODE> and used through their names (KEY_ONE ...) rather than their values ("KEY1" ...). * The field contents (returned by getContents() should be initialized something like this: <CODE> public static final Object[][] contents = { { KEY_ONE, "Something has gone wrong!" }, { KEY_TWO, "The file ''{0}'' does not exist in directory ''{1}''." }, . . . { KEY_N, "Message N" } } </CODE> * Where that section of code with the KEY to Message mappings (where the message classes 'contents' field is initialized) can have the Message strings translated in an alternate language in a errorResourceClass with a language suffix. * More sophisticated use of this class would be to pass null when contructing it, but then call loadResourceBundle() before creating any messages. * This class is not a public API, it is only public because it is used in org.apache.xml.serializer. * @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Messages	TokenNameIdentifier	 Messages
{	TokenNameLBRACE	
/** The local object to use. */	TokenNameCOMMENT_JAVADOC	 The local object to use. 
private	TokenNameprivate	
final	TokenNamefinal	
Locale	TokenNameIdentifier	 Locale
m_locale	TokenNameIdentifier	 m locale
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The language specific resource object for messages. */	TokenNameCOMMENT_JAVADOC	 The language specific resource object for messages. 
private	TokenNameprivate	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
m_resourceBundle	TokenNameIdentifier	 m resource Bundle
;	TokenNameSEMICOLON	
/** The class name of the error message string table with no language suffix. */	TokenNameCOMMENT_JAVADOC	 The class name of the error message string table with no language suffix. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
;	TokenNameSEMICOLON	
/** * Constructor. * @param resourceBundle the class name of the ListResourceBundle * that the instance of this class is associated with and will use when * creating messages. * The class name is without a language suffix. If the value passed * is null then loadResourceBundle(errorResourceClass) needs to be called * explicitly before any messages are created. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Constructor. @param resourceBundle the class name of the ListResourceBundle that the instance of this class is associated with and will use when creating messages. The class name is without a language suffix. If the value passed is null then loadResourceBundle(errorResourceClass) needs to be called explicitly before any messages are created. * @xsl.usage internal 
Messages	TokenNameIdentifier	 Messages
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceBundle	TokenNameIdentifier	 resource Bundle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
=	TokenNameEQUAL	
resourceBundle	TokenNameIdentifier	 resource Bundle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Set the Locale object to use. If this method is not called the * default locale is used. This method needs to be called before * loadResourceBundle(). * * @param locale non-null reference to Locale object. * @xsl.usage internal */	TokenNameCOMMENT_BLOCK	 Set the Locale object to use. If this method is not called the default locale is used. This method needs to be called before loadResourceBundle(). * @param locale non-null reference to Locale object. @xsl.usage internal 
// public void setLocale(Locale locale) 	TokenNameCOMMENT_LINE	public void setLocale(Locale locale) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_locale = locale; 	TokenNameCOMMENT_LINE	m_locale = locale; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Get the Locale object that is being used. * * @return non-null reference to Locale object. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the Locale object that is being used. * @return non-null reference to Locale object. @xsl.usage internal 
private	TokenNameprivate	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_locale	TokenNameIdentifier	 m locale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the ListResourceBundle being used by this Messages instance which was * previously set by a call to loadResourceBundle(className) * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the ListResourceBundle being used by this Messages instance which was previously set by a call to loadResourceBundle(className) @xsl.usage internal 
private	TokenNameprivate	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_resourceBundle	TokenNameIdentifier	 m resource Bundle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a message from the specified key and replacement * arguments, localized to the given locale. * * @param msgKey The key for the message text. * @param args The arguments to be used as replacement text * in the message created. * * @return The formatted message string. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Creates a message from the specified key and replacement arguments, localized to the given locale. * @param msgKey The key for the message text. @param args The arguments to be used as replacement text in the message created. * @return The formatted message string. @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msgKey	TokenNameIdentifier	 msg Key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_resourceBundle	TokenNameIdentifier	 m resource Bundle
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_resourceBundle	TokenNameIdentifier	 m resource Bundle
=	TokenNameEQUAL	
loadResourceBundle	TokenNameIdentifier	 load Resource Bundle
(	TokenNameLPAREN	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_resourceBundle	TokenNameIdentifier	 m resource Bundle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createMsg	TokenNameIdentifier	 create Msg
(	TokenNameLPAREN	
m_resourceBundle	TokenNameIdentifier	 m resource Bundle
,	TokenNameCOMMA	
msgKey	TokenNameIdentifier	 msg Key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
"Could not load the resource bundles: "	TokenNameStringLiteral	Could not load the resource bundles: 
+	TokenNamePLUS	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a message from the specified key and replacement * arguments, localized to the given locale. * * @param errorCode The key for the message text. * * @param fResourceBundle The resource bundle to use. * @param msgKey The message key to use. * @param args The arguments to be used as replacement text * in the message created. * * @return The formatted message string. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Creates a message from the specified key and replacement arguments, localized to the given locale. * @param errorCode The key for the message text. * @param fResourceBundle The resource bundle to use. @param msgKey The message key to use. @param args The arguments to be used as replacement text in the message created. * @return The formatted message string. @xsl.usage internal 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
createMsg	TokenNameIdentifier	 create Msg
(	TokenNameLPAREN	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msgKey	TokenNameIdentifier	 msg Key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
//throws Exception 	TokenNameCOMMENT_LINE	throws Exception 
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
throwex	TokenNameIdentifier	 throwex
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msgKey	TokenNameIdentifier	 msg Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
fResourceBundle	TokenNameIdentifier	 f Resource Bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
msgKey	TokenNameIdentifier	 msg Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
msgKey	TokenNameIdentifier	 msg Key
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwex	TokenNameIdentifier	 throwex
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/* The message is not in the bundle . . . this is bad, * so try to get the message that the message is not in the bundle */	TokenNameCOMMENT_BLOCK	 The message is not in the bundle . . . this is bad, so try to get the message that the message is not in the bundle 
try	TokenNametry	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
BAD_MSGKEY	TokenNameIdentifier	 BAD  MSGKEY
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
msgKey	TokenNameIdentifier	 msg Key
,	TokenNameCOMMA	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* even the message that the message is not in the bundle is * not there ... this is really bad */	TokenNameCOMMENT_BLOCK	 even the message that the message is not in the bundle is not there ... this is really bad 
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"The message key '"	TokenNameStringLiteral	The message key '
+	TokenNamePLUS	
msgKey	TokenNameIdentifier	 msg Key
+	TokenNamePLUS	
"' is not in the message class '"	TokenNameStringLiteral	' is not in the message class '
+	TokenNamePLUS	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Do this to keep format from crying. 	TokenNameCOMMENT_LINE	Do this to keep format from crying. 
// This is better than making a bunch of conditional 	TokenNameCOMMENT_LINE	This is better than making a bunch of conditional 
// code all over the place. 	TokenNameCOMMENT_LINE	code all over the place. 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if we get past the line above we have create the message ... hurray! 	TokenNameCOMMENT_LINE	if we get past the line above we have create the message ... hurray! 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwex	TokenNameIdentifier	 throwex
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Get the message that the format failed. 	TokenNameCOMMENT_LINE	Get the message that the format failed. 
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
BAD_MSGFORMAT	TokenNameIdentifier	 BAD  MSGFORMAT
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
msgKey	TokenNameIdentifier	 msg Key
,	TokenNameCOMMA	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fmsg	TokenNameIdentifier	 fmsg
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
formatfailed	TokenNameIdentifier	 formatfailed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We couldn't even get the message that the format of 	TokenNameCOMMENT_LINE	We couldn't even get the message that the format of 
// the message failed ... so fall back to English. 	TokenNameCOMMENT_LINE	the message failed ... so fall back to English. 
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
"The format of message '"	TokenNameStringLiteral	The format of message '
+	TokenNamePLUS	
msgKey	TokenNameIdentifier	 msg Key
+	TokenNamePLUS	
"' in message class '"	TokenNameStringLiteral	' in message class '
+	TokenNamePLUS	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
+	TokenNamePLUS	
"' failed."	TokenNameStringLiteral	' failed.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
throwex	TokenNameIdentifier	 throwex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fmsg	TokenNameIdentifier	 fmsg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a named ResourceBundle for a particular locale. This method mimics the behavior * of ResourceBundle.getBundle(). * * @param className the name of the class that implements ListResourceBundle, * without language suffix. * @return the ResourceBundle * @throws MissingResourceException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Return a named ResourceBundle for a particular locale. This method mimics the behavior of ResourceBundle.getBundle(). * @param className the name of the class that implements ListResourceBundle, without language suffix. @return the ResourceBundle @throws MissingResourceException @xsl.usage internal 
private	TokenNameprivate	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
loadResourceBundle	TokenNameIdentifier	 load Resource Bundle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceBundle	TokenNameIdentifier	 resource Bundle
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
=	TokenNameEQUAL	
resourceBundle	TokenNameIdentifier	 resource Bundle
;	TokenNameSEMICOLON	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
lrb	TokenNameIdentifier	 lrb
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
rb	TokenNameIdentifier	 rb
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lrb	TokenNameIdentifier	 lrb
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
)	TokenNameRPAREN	
rb	TokenNameIdentifier	 rb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
// try to fall back to en_US if we can't load 	TokenNameCOMMENT_LINE	try to fall back to en_US if we can't load 
{	TokenNameLBRACE	
// Since we can't find the localized property file, 	TokenNameCOMMENT_LINE	Since we can't find the localized property file, 
// fall back to en_US. 	TokenNameCOMMENT_LINE	fall back to en_US. 
lrb	TokenNameIdentifier	 lrb
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
)	TokenNameRPAREN	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
,	TokenNameCOMMA	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"en"	TokenNameStringLiteral	en
,	TokenNameCOMMA	
"US"	TokenNameStringLiteral	US
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Now we are really in trouble. 	TokenNameCOMMENT_LINE	Now we are really in trouble. 
// very bad, definitely very bad...not going to get very far 	TokenNameCOMMENT_LINE	very bad, definitely very bad...not going to get very far 
throw	TokenNamethrow	
new	TokenNamenew	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
(	TokenNameLPAREN	
"Could not load any resource bundles."	TokenNameStringLiteral	Could not load any resource bundles.
+	TokenNamePLUS	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
,	TokenNameCOMMA	
m_resourceBundleName	TokenNameIdentifier	 m resource Bundle Name
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_resourceBundle	TokenNameIdentifier	 m resource Bundle
=	TokenNameEQUAL	
lrb	TokenNameIdentifier	 lrb
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lrb	TokenNameIdentifier	 lrb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the resource file suffic for the indicated locale * For most locales, this will be based the language code. However * for Chinese, we do distinguish between Taiwan and PRC * * @param locale the locale * @return an String suffix which can be appended to a resource name * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Return the resource file suffic for the indicated locale For most locales, this will be based the language code. However for Chinese, we do distinguish between Taiwan and PRC * @param locale the locale @return an String suffix which can be appended to a resource name @xsl.usage internal 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getResourceSuffix	TokenNameIdentifier	 get Resource Suffix
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
locale	TokenNameIdentifier	 locale
.	TokenNameDOT	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
country	TokenNameIdentifier	 country
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
.	TokenNameDOT	
getCountry	TokenNameIdentifier	 get Country
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
country	TokenNameIdentifier	 country
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"TW"	TokenNameStringLiteral	TW
)	TokenNameRPAREN	
)	TokenNameRPAREN	
suffix	TokenNameIdentifier	 suffix
+=	TokenNamePLUS_EQUAL	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
country	TokenNameIdentifier	 country
;	TokenNameSEMICOLON	
return	TokenNamereturn	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
