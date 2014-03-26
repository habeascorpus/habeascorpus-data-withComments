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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Analyzer	TokenNameIdentifier	 Analyzer
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
ParseException	TokenNameIdentifier	 Parse Exception
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
Extensions	TokenNameIdentifier	 Extensions
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
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
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * The {@link ExtendableQueryParser} enables arbitrary query parser extension * based on a customizable field naming scheme. The lucene query syntax allows * implicit and explicit field definitions as query prefix followed by a colon * (':') character. The {@link ExtendableQueryParser} allows to encode extension * keys into the field symbol associated with a registered instance of * {@link ParserExtension}. A customizable separation character separates the * extension key from the actual field symbol. The {@link ExtendableQueryParser} * splits (@see {@link Extensions#splitExtensionField(String, String)}) the * extension key from the field symbol and tries to resolve the associated * {@link ParserExtension}. If the parser can't resolve the key or the field * token does not contain a separation character, {@link ExtendableQueryParser} * yields the same behavior as its super class {@link QueryParser}. Otherwise, * if the key is associated with a {@link ParserExtension} instance, the parser * builds an instance of {@link ExtensionQuery} to be processed by * {@link ParserExtension#parse(ExtensionQuery)}.If a extension field does not * contain a field part the default field for the query will be used. * <p> * To guarantee that an extension field is processed with its associated * extension, the extension query part must escape any special characters like * '*' or '['. If the extension query contains any whitespace characters, the * extension query part must be enclosed in quotes. * Example ('_' used as separation character): * <pre> * title_customExt:"Apache Lucene\?" OR content_customExt:prefix\* * </pre> * * Search on the default field: * <pre> * _customExt:"Apache Lucene\?" OR _customExt:prefix\* * </pre> * </p> * <p> * The {@link ExtendableQueryParser} itself does not implement the logic how * field and extension key are separated or ordered. All logic regarding the * extension key and field symbol parsing is located in {@link Extensions}. * Customized extension schemes should be implemented by sub-classing * {@link Extensions}. * </p> * <p> * For details about the default encoding scheme see {@link Extensions}. * </p> * * @see Extensions * @see ParserExtension * @see ExtensionQuery */	TokenNameCOMMENT_JAVADOC	 The {@link ExtendableQueryParser} enables arbitrary query parser extension based on a customizable field naming scheme. The lucene query syntax allows implicit and explicit field definitions as query prefix followed by a colon (':') character. The {@link ExtendableQueryParser} allows to encode extension keys into the field symbol associated with a registered instance of {@link ParserExtension}. A customizable separation character separates the extension key from the actual field symbol. The {@link ExtendableQueryParser} splits (@see {@link Extensions#splitExtensionField(String, String)}) the extension key from the field symbol and tries to resolve the associated {@link ParserExtension}. If the parser can't resolve the key or the field token does not contain a separation character, {@link ExtendableQueryParser} yields the same behavior as its super class {@link QueryParser}. Otherwise, if the key is associated with a {@link ParserExtension} instance, the parser builds an instance of {@link ExtensionQuery} to be processed by {@link ParserExtension#parse(ExtensionQuery)}.If a extension field does not contain a field part the default field for the query will be used. <p> To guarantee that an extension field is processed with its associated extension, the extension query part must escape any special characters like '*' or '['. If the extension query contains any whitespace characters, the extension query part must be enclosed in quotes. Example ('_' used as separation character): <pre> title_customExt:"Apache Lucene\?" OR content_customExt:prefix\* </pre> * Search on the default field: <pre> _customExt:"Apache Lucene\?" OR _customExt:prefix\* </pre> </p> <p> The {@link ExtendableQueryParser} itself does not implement the logic how field and extension key are separated or ordered. All logic regarding the extension key and field symbol parsing is located in {@link Extensions}. Customized extension schemes should be implemented by sub-classing {@link Extensions}. </p> <p> For details about the default encoding scheme see {@link Extensions}. </p> * @see Extensions @see ParserExtension @see ExtensionQuery 
public	TokenNamepublic	
class	TokenNameclass	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
extends	TokenNameextends	
QueryParser	TokenNameIdentifier	 Query Parser
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Extensions	TokenNameIdentifier	 Extensions
extensions	TokenNameIdentifier	 extensions
;	TokenNameSEMICOLON	
/** * Default empty extensions instance */	TokenNameCOMMENT_JAVADOC	 Default empty extensions instance 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Extensions	TokenNameIdentifier	 Extensions
DEFAULT_EXTENSION	TokenNameIdentifier	 DEFAULT  EXTENSION
=	TokenNameEQUAL	
new	TokenNamenew	
Extensions	TokenNameIdentifier	 Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new {@link ExtendableQueryParser} instance * * @param matchVersion * the lucene version to use. * @param f * the default query field * @param a * the analyzer used to find terms in a query string */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link ExtendableQueryParser} instance * @param matchVersion the lucene version to use. @param f the default query field @param a the analyzer used to find terms in a query string 
public	TokenNamepublic	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
(	TokenNameLPAREN	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
DEFAULT_EXTENSION	TokenNameIdentifier	 DEFAULT  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link ExtendableQueryParser} instance * * @param matchVersion * the lucene version to use. * @param f * the default query field * @param a * the analyzer used to find terms in a query string * @param ext * the query parser extensions */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link ExtendableQueryParser} instance * @param matchVersion the lucene version to use. @param f the default query field @param a the analyzer used to find terms in a query string @param ext the query parser extensions 
public	TokenNamepublic	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
(	TokenNameLPAREN	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
final	TokenNamefinal	
Extensions	TokenNameIdentifier	 Extensions
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defaultField	TokenNameIdentifier	 default Field
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
=	TokenNameEQUAL	
ext	TokenNameIdentifier	 ext
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the extension field delimiter character. * * @return the extension field delimiter character. */	TokenNameCOMMENT_JAVADOC	 Returns the extension field delimiter character. * @return the extension field delimiter character. 
public	TokenNamepublic	
char	TokenNamechar	
getExtensionFieldDelimiter	TokenNameIdentifier	 get Extension Field Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
getExtensionFieldDelimiter	TokenNameIdentifier	 get Extension Field Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Query	TokenNameIdentifier	 Query
getFieldQuery	TokenNameIdentifier	 get Field Query
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
queryText	TokenNameIdentifier	 query Text
,	TokenNameCOMMA	
boolean	TokenNameboolean	
quoted	TokenNameIdentifier	 quoted
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
splitExtensionField	TokenNameIdentifier	 split Extension Field
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
splitExtensionField	TokenNameIdentifier	 split Extension Field
(	TokenNameLPAREN	
defaultField	TokenNameIdentifier	 default Field
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ParserExtension	TokenNameIdentifier	 Parser Extension
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
splitExtensionField	TokenNameIdentifier	 split Extension Field
.	TokenNameDOT	
cud	TokenNameIdentifier	 cud
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionQuery	TokenNameIdentifier	 Extension Query
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
splitExtensionField	TokenNameIdentifier	 split Extension Field
.	TokenNameDOT	
cur	TokenNameIdentifier	 cur
,	TokenNameCOMMA	
queryText	TokenNameIdentifier	 query Text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getFieldQuery	TokenNameIdentifier	 get Field Query
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
queryText	TokenNameIdentifier	 query Text
,	TokenNameCOMMA	
quoted	TokenNameIdentifier	 quoted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
