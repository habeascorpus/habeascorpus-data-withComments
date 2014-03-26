package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeSource	TokenNameIdentifier	 Attribute Source
;	TokenNameSEMICOLON	
/** * <p> * This class is the base of {@link QueryConfigHandler} and {@link FieldConfig}. * It has operations to set, unset and get configuration values. * </p> * <p> * Each configuration is is a key->value pair. The key should be an unique * {@link ConfigurationKey} instance and it also holds the value's type. * </p> * * NOTE: in future this class will no longer extend {@link AttributeSource} * * @see ConfigurationKey */	TokenNameCOMMENT_JAVADOC	 <p> This class is the base of {@link QueryConfigHandler} and {@link FieldConfig}. It has operations to set, unset and get configuration values. </p> <p> Each configuration is is a key->value pair. The key should be an unique {@link ConfigurationKey} instance and it also holds the value's type. </p> * NOTE: in future this class will no longer extend {@link AttributeSource} * @see ConfigurationKey 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractQueryConfig	TokenNameIdentifier	 Abstract Query Config
extends	TokenNameextends	
AttributeSource	TokenNameIdentifier	 Attribute Source
{	TokenNameLBRACE	
final	TokenNamefinal	
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
configMap	TokenNameIdentifier	 config Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractQueryConfig	TokenNameIdentifier	 Abstract Query Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// although this class is public, it can only be constructed from package 	TokenNameCOMMENT_LINE	although this class is public, it can only be constructed from package 
}	TokenNameRBRACE	
/** * Returns the value held by the given key. * * @param <T> the value's type * * @param key the key, cannot be <code>null</code> * * @return the value held by the given key */	TokenNameCOMMENT_JAVADOC	 Returns the value held by the given key. * @param <T> the value's type * @param key the key, cannot be <code>null</code> * @return the value held by the given key 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
T	TokenNameIdentifier	 T
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"key cannot be null!"	TokenNameStringLiteral	key cannot be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
configMap	TokenNameIdentifier	 config Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value held by the given key or the given default value if the * key is not found. * * @param <T> the value's type * * @param key the key, cannot be <code>null</code> * @param defaultValue the default value * * @return the value held by the given key or the default value */	TokenNameCOMMENT_JAVADOC	 Returns the value held by the given key or the given default value if the key is not found. * @param <T> the value's type * @param key the key, cannot be <code>null</code> @param defaultValue the default value * @return the value held by the given key or the default value 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
T	TokenNameIdentifier	 T
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"key cannot be null!"	TokenNameStringLiteral	key cannot be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
configMap	TokenNameIdentifier	 config Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
configMap	TokenNameIdentifier	 config Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if there is a value set with the given key, otherwise false. * * @param <T> @param <T> the value's type * @param key the key, cannot be <code>null</code> * @return true if there is a value set with the given key, otherwise false */	TokenNameCOMMENT_JAVADOC	 Returns true if there is a value set with the given key, otherwise false. * @param <T> @param <T> the value's type @param key the key, cannot be <code>null</code> @return true if there is a value set with the given key, otherwise false 
public	TokenNamepublic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
boolean	TokenNameboolean	
has	TokenNameIdentifier	 has
(	TokenNameLPAREN	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"key cannot be null!"	TokenNameStringLiteral	key cannot be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
configMap	TokenNameIdentifier	 config Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a key and its value. * * @param <T> the value's type * @param key the key, cannot be <code>null</code> * @param value */	TokenNameCOMMENT_JAVADOC	 Sets a key and its value. * @param <T> the value's type @param key the key, cannot be <code>null</code> @param value 
public	TokenNamepublic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"key cannot be null!"	TokenNameStringLiteral	key cannot be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unset	TokenNameIdentifier	 unset
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
configMap	TokenNameIdentifier	 config Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"deprecation"	TokenNameStringLiteral	deprecation
)	TokenNameRPAREN	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
<	TokenNameLESS	
A	TokenNameIdentifier	 A
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
A	TokenNameIdentifier	 A
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
A	TokenNameIdentifier	 A
>	TokenNameGREATER	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
instanceof	TokenNameinstanceof	
ConfigAttribute	TokenNameIdentifier	 Config Attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ConfigAttribute	TokenNameIdentifier	 Config Attribute
)	TokenNameRPAREN	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
attr	TokenNameIdentifier	 attr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Unsets the given key and its value. * * @param <T> the value's type * @param key the key * @return true if the key and value was set and removed, otherwise false */	TokenNameCOMMENT_JAVADOC	 Unsets the given key and its value. * @param <T> the value's type @param key the key @return true if the key and value was set and removed, otherwise false 
public	TokenNamepublic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
boolean	TokenNameboolean	
unset	TokenNameIdentifier	 unset
(	TokenNameLPAREN	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"key cannot be null!"	TokenNameStringLiteral	key cannot be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
configMap	TokenNameIdentifier	 config Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
