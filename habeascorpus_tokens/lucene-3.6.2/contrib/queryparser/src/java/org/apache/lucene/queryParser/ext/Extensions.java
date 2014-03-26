package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
QueryParser	TokenNameIdentifier	 Query Parser
;	TokenNameSEMICOLON	
/** * The {@link Extensions} class represents an extension mapping to associate * {@link ParserExtension} instances with extension keys. An extension key is a * string encoded into a Lucene standard query parser field symbol recognized by * {@link ExtendableQueryParser}. The query parser passes each extension field * token to {@link #splitExtensionField(String, String)} to separate the * extension key from the field identifier. * <p> * In addition to the key to extension mapping this class also defines the field * name overloading scheme. {@link ExtendableQueryParser} uses the given * extension to split the actual field name and extension key by calling * {@link #splitExtensionField(String, String)}. To change the order or the key * / field name encoding scheme users can subclass {@link Extensions} to * implement their own. * * @see ExtendableQueryParser * @see ParserExtension */	TokenNameCOMMENT_JAVADOC	 The {@link Extensions} class represents an extension mapping to associate {@link ParserExtension} instances with extension keys. An extension key is a string encoded into a Lucene standard query parser field symbol recognized by {@link ExtendableQueryParser}. The query parser passes each extension field token to {@link #splitExtensionField(String, String)} to separate the extension key from the field identifier. <p> In addition to the key to extension mapping this class also defines the field name overloading scheme. {@link ExtendableQueryParser} uses the given extension to split the actual field name and extension key by calling {@link #splitExtensionField(String, String)}. To change the order or the key / field name encoding scheme users can subclass {@link Extensions} to implement their own. * @see ExtendableQueryParser @see ParserExtension 
public	TokenNamepublic	
class	TokenNameclass	
Extensions	TokenNameIdentifier	 Extensions
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ParserExtension	TokenNameIdentifier	 Parser Extension
>	TokenNameGREATER	
extensions	TokenNameIdentifier	 extensions
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ParserExtension	TokenNameIdentifier	 Parser Extension
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
extensionFieldDelimiter	TokenNameIdentifier	 extension Field Delimiter
;	TokenNameSEMICOLON	
/** * The default extension field delimiter character. This constant is set to * ':' */	TokenNameCOMMENT_JAVADOC	 The default extension field delimiter character. This constant is set to ':' 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DEFAULT_EXTENSION_FIELD_DELIMITER	TokenNameIdentifier	 DEFAULT  EXTENSION  FIELD  DELIMITER
=	TokenNameEQUAL	
':'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Creates a new {@link Extensions} instance with the * {@link #DEFAULT_EXTENSION_FIELD_DELIMITER} as a delimiter character. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link Extensions} instance with the {@link #DEFAULT_EXTENSION_FIELD_DELIMITER} as a delimiter character. 
public	TokenNamepublic	
Extensions	TokenNameIdentifier	 Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_EXTENSION_FIELD_DELIMITER	TokenNameIdentifier	 DEFAULT  EXTENSION  FIELD  DELIMITER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link Extensions} instance * * @param extensionFieldDelimiter * the extensions field delimiter character */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link Extensions} instance * @param extensionFieldDelimiter the extensions field delimiter character 
public	TokenNamepublic	
Extensions	TokenNameIdentifier	 Extensions
(	TokenNameLPAREN	
char	TokenNamechar	
extensionFieldDelimiter	TokenNameIdentifier	 extension Field Delimiter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extensionFieldDelimiter	TokenNameIdentifier	 extension Field Delimiter
=	TokenNameEQUAL	
extensionFieldDelimiter	TokenNameIdentifier	 extension Field Delimiter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a new {@link ParserExtension} instance associated with the given key. * * @param key * the parser extension key * @param extension * the parser extension */	TokenNameCOMMENT_JAVADOC	 Adds a new {@link ParserExtension} instance associated with the given key. * @param key the parser extension key @param extension the parser extension 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
ParserExtension	TokenNameIdentifier	 Parser Extension
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link ParserExtension} instance for the given key or * <code>null</code> if no extension can be found for the key. * * @param key * the extension key * @return the {@link ParserExtension} instance for the given key or * <code>null</code> if no extension can be found for the key. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link ParserExtension} instance for the given key or <code>null</code> if no extension can be found for the key. * @param key the extension key @return the {@link ParserExtension} instance for the given key or <code>null</code> if no extension can be found for the key. 
public	TokenNamepublic	
final	TokenNamefinal	
ParserExtension	TokenNameIdentifier	 Parser Extension
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the extension field delimiter * * @return the extension field delimiter */	TokenNameCOMMENT_JAVADOC	 Returns the extension field delimiter * @return the extension field delimiter 
public	TokenNamepublic	
char	TokenNamechar	
getExtensionFieldDelimiter	TokenNameIdentifier	 get Extension Field Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extensionFieldDelimiter	TokenNameIdentifier	 extension Field Delimiter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Splits a extension field and returns the field / extension part as a * {@link Pair}. This method tries to split on the first occurrence of the * extension field delimiter, if the delimiter is not present in the string * the result will contain a <code>null</code> value for the extension key and * the given field string as the field value. If the given extension field * string contains no field identifier the result pair will carry the given * default field as the field value. * * @param defaultField * the default query field * @param field * the extension field string * @return a {@link Pair} with the field name as the {@link Pair#cur} and the * extension key as the {@link Pair#cud} */	TokenNameCOMMENT_JAVADOC	 Splits a extension field and returns the field / extension part as a {@link Pair}. This method tries to split on the first occurrence of the extension field delimiter, if the delimiter is not present in the string the result will contain a <code>null</code> value for the extension key and the given field string as the field value. If the given extension field string contains no field identifier the result pair will carry the given default field as the field value. * @param defaultField the default query field @param field the extension field string @return a {@link Pair} with the field name as the {@link Pair#cur} and the extension key as the {@link Pair#cud} 
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
splitExtensionField	TokenNameIdentifier	 split Extension Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
extensionFieldDelimiter	TokenNameIdentifier	 extension Field Delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOf	TokenNameIdentifier	 index Of
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
indexField	TokenNameIdentifier	 index Field
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
defaultField	TokenNameIdentifier	 default Field
:	TokenNameCOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOf	TokenNameIdentifier	 index Of
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
extensionKey	TokenNameIdentifier	 extension Key
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
indexOf	TokenNameIdentifier	 index Of
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
indexField	TokenNameIdentifier	 index Field
,	TokenNameCOMMA	
extensionKey	TokenNameIdentifier	 extension Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Escapes an extension field. The default implementation is equivalent to * {@link QueryParser#escape(String)}. * * @param extfield * the extension field identifier * @return the extension field identifier with all special chars escaped with * a backslash character. */	TokenNameCOMMENT_JAVADOC	 Escapes an extension field. The default implementation is equivalent to {@link QueryParser#escape(String)}. * @param extfield the extension field identifier @return the extension field identifier with all special chars escaped with a backslash character. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
escapeExtensionField	TokenNameIdentifier	 escape Extension Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
extfield	TokenNameIdentifier	 extfield
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
QueryParser	TokenNameIdentifier	 Query Parser
.	TokenNameDOT	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
extfield	TokenNameIdentifier	 extfield
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds an extension field string from a given extension key and the default * query field. The default field and the key are delimited with the extension * field delimiter character. This method makes no assumption about the order * of the extension key and the field. By default the extension key is * appended to the end of the returned string while the field is added to the * beginning. Special Query characters are escaped in the result. * <p> * Note: {@link Extensions} subclasses must maintain the contract between * {@link #buildExtensionField(String)} and * {@link #splitExtensionField(String, String)} where the latter inverts the * former. * </p> */	TokenNameCOMMENT_JAVADOC	 Builds an extension field string from a given extension key and the default query field. The default field and the key are delimited with the extension field delimiter character. This method makes no assumption about the order of the extension key and the field. By default the extension key is appended to the end of the returned string while the field is added to the beginning. Special Query characters are escaped in the result. <p> Note: {@link Extensions} subclasses must maintain the contract between {@link #buildExtensionField(String)} and {@link #splitExtensionField(String, String)} where the latter inverts the former. </p> 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
extensionKey	TokenNameIdentifier	 extension Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
extensionKey	TokenNameIdentifier	 extension Key
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds an extension field string from a given extension key and the * extensions field. The field and the key are delimited with the extension * field delimiter character. This method makes no assumption about the order * of the extension key and the field. By default the extension key is * appended to the end of the returned string while the field is added to the * beginning. Special Query characters are escaped in the result. * <p> * Note: {@link Extensions} subclasses must maintain the contract between * {@link #buildExtensionField(String, String)} and * {@link #splitExtensionField(String, String)} where the latter inverts the * former. * </p> * * @param extensionKey * the extension key * @param field * the field to apply the extension on. * @return escaped extension field identifier * @see #buildExtensionField(String) to use the default query field */	TokenNameCOMMENT_JAVADOC	 Builds an extension field string from a given extension key and the extensions field. The field and the key are delimited with the extension field delimiter character. This method makes no assumption about the order of the extension key and the field. By default the extension key is appended to the end of the returned string while the field is added to the beginning. Special Query characters are escaped in the result. <p> Note: {@link Extensions} subclasses must maintain the contract between {@link #buildExtensionField(String, String)} and {@link #splitExtensionField(String, String)} where the latter inverts the former. </p> * @param extensionKey the extension key @param field the field to apply the extension on. @return escaped extension field identifier @see #buildExtensionField(String) to use the default query field 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
extensionKey	TokenNameIdentifier	 extension Key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
extensionFieldDelimiter	TokenNameIdentifier	 extension Field Delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
extensionKey	TokenNameIdentifier	 extension Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
escapeExtensionField	TokenNameIdentifier	 escape Extension Field
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class represents a generic pair. * * @param <Cur> * the pairs first element * @param <Cud> * the pairs last element of the pair. */	TokenNameCOMMENT_JAVADOC	 This class represents a generic pair. * @param <Cur> the pairs first element @param <Cud> the pairs last element of the pair. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Cur	TokenNameIdentifier	 Cur
,	TokenNameCOMMA	
Cud	TokenNameIdentifier	 Cud
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Cur	TokenNameIdentifier	 Cur
cur	TokenNameIdentifier	 cur
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Cud	TokenNameIdentifier	 Cud
cud	TokenNameIdentifier	 cud
;	TokenNameSEMICOLON	
/** * Creates a new Pair * * @param cur * the pairs first element * @param cud * the pairs last element */	TokenNameCOMMENT_JAVADOC	 Creates a new Pair * @param cur the pairs first element @param cud the pairs last element 
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
(	TokenNameLPAREN	
Cur	TokenNameIdentifier	 Cur
cur	TokenNameIdentifier	 cur
,	TokenNameCOMMA	
Cud	TokenNameIdentifier	 Cud
cud	TokenNameIdentifier	 cud
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cur	TokenNameIdentifier	 cur
=	TokenNameEQUAL	
cur	TokenNameIdentifier	 cur
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cud	TokenNameIdentifier	 cud
=	TokenNameEQUAL	
cud	TokenNameIdentifier	 cud
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
