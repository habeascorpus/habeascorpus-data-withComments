package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Modifier	TokenNameIdentifier	 Modifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
AccessController	TokenNameIdentifier	 Access Controller
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
Map	TokenNameIdentifier	 Map
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
/** * MessageBundles classes extend this class, to implement a bundle. * * For Native Language Support (NLS), system of software internationalization. * * This interface is similar to the NLS class in eclipse.osgi.util.NLS class - * initializeMessages() method resets the values of all static strings, should * only be called by classes that extend from NLS (see TestMessages.java for * reference) - performs validation of all message in a bundle, at class load * time - performs per message validation at runtime - see NLSTest.java for * usage reference * * MessageBundle classes may subclass this type. * @deprecated Will be moved to a private package inside flexible query parser (Lucene 4.0). */	TokenNameCOMMENT_JAVADOC	 MessageBundles classes extend this class, to implement a bundle. * For Native Language Support (NLS), system of software internationalization. * This interface is similar to the NLS class in eclipse.osgi.util.NLS class - initializeMessages() method resets the values of all static strings, should only be called by classes that extend from NLS (see TestMessages.java for reference) - performs validation of all message in a bundle, at class load time - performs per message validation at runtime - see NLSTest.java for usage reference * MessageBundle classes may subclass this type. @deprecated Will be moved to a private package inside flexible query parser (Lucene 4.0). 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
NLS	TokenNameIdentifier	 NLS
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
NLS	TokenNameIdentifier	 NLS
>>	TokenNameRIGHT_SHIFT	
bundles	TokenNameIdentifier	 bundles
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
NLS	TokenNameIdentifier	 NLS
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
NLS	TokenNameIdentifier	 NLS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do not instantiate 	TokenNameCOMMENT_LINE	Do not instantiate 
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
getResourceBundleObject	TokenNameIdentifier	 get Resource Bundle Object
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Message with key:"	TokenNameStringLiteral	Message with key:
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
" and locale: "	TokenNameStringLiteral	 and locale: 
+	TokenNamePLUS	
locale	TokenNameIdentifier	 locale
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
...	TokenNameELLIPSIS	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
...	TokenNameELLIPSIS	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize a given class with the message bundle Keys Should be called from * a class that extends NLS in a static block at class load time. * * @param bundleName * Property file with that contains the message bundle * @param clazz * where constants will reside */	TokenNameCOMMENT_JAVADOC	 Initialize a given class with the message bundle Keys Should be called from a class that extends NLS in a static block at class load time. * @param bundleName Property file with that contains the message bundle @param clazz where constants will reside 
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
initializeMessages	TokenNameIdentifier	 initialize Messages
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
NLS	TokenNameIdentifier	 NLS
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
bundles	TokenNameIdentifier	 bundles
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
bundles	TokenNameIdentifier	 bundles
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore all errors and exceptions 	TokenNameCOMMENT_LINE	ignore all errors and exceptions 
// because this function is supposed to be called at class load time. 	TokenNameCOMMENT_LINE	because this function is supposed to be called at class load time. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
getResourceBundleObject	TokenNameIdentifier	 get Resource Bundle Object
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
messageKey	TokenNameIdentifier	 message Key
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// slow resource checking 	TokenNameCOMMENT_LINE	slow resource checking 
// need to loop thru all registered resource bundles 	TokenNameCOMMENT_LINE	need to loop thru all registered resource bundles 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
bundles	TokenNameIdentifier	 bundles
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
NLS	TokenNameIdentifier	 NLS
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
bundles	TokenNameIdentifier	 bundles
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
resourceBundle	TokenNameIdentifier	 resource Bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resourceBundle	TokenNameIdentifier	 resource Bundle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
resourceBundle	TokenNameIdentifier	 resource Bundle
.	TokenNameDOT	
getObject	TokenNameIdentifier	 get Object
(	TokenNameLPAREN	
messageKey	TokenNameIdentifier	 message Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// just continue it might be on the next resource bundle 	TokenNameCOMMENT_LINE	just continue it might be on the next resource bundle 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if resource is not found 	TokenNameCOMMENT_LINE	if resource is not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param clazz */	TokenNameCOMMENT_JAVADOC	 @param clazz 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
NLS	TokenNameIdentifier	 NLS
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fieldArray	TokenNameIdentifier	 field Array
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getDeclaredFields	TokenNameIdentifier	 get Declared Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isFieldAccessible	TokenNameIdentifier	 is Field Accessible
=	TokenNameEQUAL	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
PUBLIC	TokenNameIdentifier	 PUBLIC
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// build a map of field names to Field objects 	TokenNameCOMMENT_LINE	build a map of field names to Field objects 
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
fieldArray	TokenNameIdentifier	 field Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fieldArray	TokenNameIdentifier	 field Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fieldArray	TokenNameIdentifier	 field Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loadfieldValue	TokenNameIdentifier	 loadfield Value
(	TokenNameLPAREN	
fieldArray	TokenNameIdentifier	 field Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
isFieldAccessible	TokenNameIdentifier	 is Field Accessible
,	TokenNameCOMMA	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param field * @param isFieldAccessible */	TokenNameCOMMENT_JAVADOC	 @param field @param isFieldAccessible 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
loadfieldValue	TokenNameIdentifier	 loadfield Value
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isFieldAccessible	TokenNameIdentifier	 is Field Accessible
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
NLS	TokenNameIdentifier	 NLS
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
MOD_EXPECTED	TokenNameIdentifier	 MOD  EXPECTED
=	TokenNameEQUAL	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
PUBLIC	TokenNameIdentifier	 PUBLIC
|	TokenNameOR	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
STATIC	TokenNameIdentifier	 STATIC
;	TokenNameSEMICOLON	
int	TokenNameint	
MOD_MASK	TokenNameIdentifier	 MOD  MASK
=	TokenNameEQUAL	
MOD_EXPECTED	TokenNameIdentifier	 MOD  EXPECTED
|	TokenNameOR	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
FINAL	TokenNameIdentifier	 FINAL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
MOD_MASK	TokenNameIdentifier	 MOD  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
MOD_EXPECTED	TokenNameIdentifier	 MOD  EXPECTED
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Set a value for this empty field. 	TokenNameCOMMENT_LINE	Set a value for this empty field. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isFieldAccessible	TokenNameIdentifier	 is Field Accessible
)	TokenNameRPAREN	
makeAccessible	TokenNameIdentifier	 make Accessible
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateMessage	TokenNameIdentifier	 validate Message
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not happen 	TokenNameCOMMENT_LINE	should not happen 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not happen 	TokenNameCOMMENT_LINE	should not happen 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param key * - Message Key */	TokenNameCOMMENT_JAVADOC	 @param key - Message Key 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
validateMessage	TokenNameIdentifier	 validate Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
NLS	TokenNameIdentifier	 NLS
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Test if the message is present in the resource bundle 	TokenNameCOMMENT_LINE	Test if the message is present in the resource bundle 
try	TokenNametry	
{	TokenNameLBRACE	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
resourceBundle	TokenNameIdentifier	 resource Bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resourceBundle	TokenNameIdentifier	 resource Bundle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
resourceBundle	TokenNameIdentifier	 resource Bundle
.	TokenNameDOT	
getObject	TokenNameIdentifier	 get Object
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARN: Message with key:"	TokenNameStringLiteral	WARN: Message with key:
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
" and locale: "	TokenNameStringLiteral	 and locale: 
+	TokenNamePLUS	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARN: Message with key:"	TokenNameStringLiteral	WARN: Message with key:
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
" and locale: "	TokenNameStringLiteral	 and locale: 
+	TokenNamePLUS	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore all other errors and exceptions 	TokenNameCOMMENT_LINE	ignore all other errors and exceptions 
// since this code is just a test to see if the message is present on the 	TokenNameCOMMENT_LINE	since this code is just a test to see if the message is present on the 
// system 	TokenNameCOMMENT_LINE	system 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Make a class field accessible */	TokenNameCOMMENT_BLOCK	 Make a class field accessible 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
makeAccessible	TokenNameIdentifier	 make Accessible
(	TokenNameLPAREN	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getSecurityManager	TokenNameIdentifier	 get Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
doPrivileged	TokenNameIdentifier	 do Privileged
(	TokenNameLPAREN	
new	TokenNamenew	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
<	TokenNameLESS	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Void	TokenNameIdentifier	 Void
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
