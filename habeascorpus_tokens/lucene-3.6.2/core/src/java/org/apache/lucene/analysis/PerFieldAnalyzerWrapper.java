package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Fieldable	TokenNameIdentifier	 Fieldable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
/** * This analyzer is used to facilitate scenarios where different * fields require different analysis techniques. Use the Map * argument in {@link #PerFieldAnalyzerWrapper(Analyzer, java.util.Map)} * to add non-default analyzers for fields. * * <p>Example usage: * * <pre> * Map analyzerPerField = new HashMap(); * analyzerPerField.put("firstname", new KeywordAnalyzer()); * analyzerPerField.put("lastname", new KeywordAnalyzer()); * * PerFieldAnalyzerWrapper aWrapper = * new PerFieldAnalyzerWrapper(new StandardAnalyzer(), analyzerPerField); * </pre> * * <p>In this example, StandardAnalyzer will be used for all fields except "firstname" * and "lastname", for which KeywordAnalyzer will be used. * * <p>A PerFieldAnalyzerWrapper can be used like any other analyzer, for both indexing * and query parsing. */	TokenNameCOMMENT_JAVADOC	 This analyzer is used to facilitate scenarios where different fields require different analysis techniques. Use the Map argument in {@link #PerFieldAnalyzerWrapper(Analyzer, java.util.Map)} to add non-default analyzers for fields. * <p>Example usage: * <pre> Map analyzerPerField = new HashMap(); analyzerPerField.put("firstname", new KeywordAnalyzer()); analyzerPerField.put("lastname", new KeywordAnalyzer()); * PerFieldAnalyzerWrapper aWrapper = new PerFieldAnalyzerWrapper(new StandardAnalyzer(), analyzerPerField); </pre> * <p>In this example, StandardAnalyzer will be used for all fields except "firstname" and "lastname", for which KeywordAnalyzer will be used. * <p>A PerFieldAnalyzerWrapper can be used like any other analyzer, for both indexing and query parsing. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
PerFieldAnalyzerWrapper	TokenNameIdentifier	 Per Field Analyzer Wrapper
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
>	TokenNameGREATER	
analyzerMap	TokenNameIdentifier	 analyzer Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructs with default analyzer. * * @param defaultAnalyzer Any fields not specifically * defined to use a different analyzer will use the one provided here. */	TokenNameCOMMENT_JAVADOC	 Constructs with default analyzer. * @param defaultAnalyzer Any fields not specifically defined to use a different analyzer will use the one provided here. 
public	TokenNamepublic	
PerFieldAnalyzerWrapper	TokenNameIdentifier	 Per Field Analyzer Wrapper
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs with default analyzer and a map of analyzers to use for * specific fields. * * @param defaultAnalyzer Any fields not specifically * defined to use a different analyzer will use the one provided here. * @param fieldAnalyzers a Map (String field name to the Analyzer) to be * used for those fields */	TokenNameCOMMENT_JAVADOC	 Constructs with default analyzer and a map of analyzers to use for specific fields. * @param defaultAnalyzer Any fields not specifically defined to use a different analyzer will use the one provided here. @param fieldAnalyzers a Map (String field name to the Analyzer) to be used for those fields 
public	TokenNamepublic	
PerFieldAnalyzerWrapper	TokenNameIdentifier	 Per Field Analyzer Wrapper
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
>	TokenNameGREATER	
fieldAnalyzers	TokenNameIdentifier	 field Analyzers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
=	TokenNameEQUAL	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldAnalyzers	TokenNameIdentifier	 field Analyzers
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
analyzerMap	TokenNameIdentifier	 analyzer Map
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
fieldAnalyzers	TokenNameIdentifier	 field Analyzers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Defines an analyzer to use for the specified field. * * @param fieldName field name requiring a non-default analyzer * @param analyzer non-default analyzer to use for field * @deprecated Changing the Analyzer for a field after instantiation prevents * reusability. Analyzers for fields should be set during construction. */	TokenNameCOMMENT_JAVADOC	 Defines an analyzer to use for the specified field. * @param fieldName field name requiring a non-default analyzer @param analyzer non-default analyzer to use for field @deprecated Changing the Analyzer for a field after instantiation prevents reusability. Analyzers for fields should be set during construction. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
addAnalyzer	TokenNameIdentifier	 add Analyzer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
analyzerMap	TokenNameIdentifier	 analyzer Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzerMap	TokenNameIdentifier	 analyzer Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzerMap	TokenNameIdentifier	 analyzer Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
;	TokenNameSEMICOLON	
return	TokenNamereturn	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the positionIncrementGap from the analyzer assigned to fieldName */	TokenNameCOMMENT_JAVADOC	 Return the positionIncrementGap from the analyzer assigned to fieldName 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getPositionIncrementGap	TokenNameIdentifier	 get Position Increment Gap
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzerMap	TokenNameIdentifier	 analyzer Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
;	TokenNameSEMICOLON	
return	TokenNamereturn	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
getPositionIncrementGap	TokenNameIdentifier	 get Position Increment Gap
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the offsetGap from the analyzer assigned to field */	TokenNameCOMMENT_JAVADOC	 Return the offsetGap from the analyzer assigned to field 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getOffsetGap	TokenNameIdentifier	 get Offset Gap
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzerMap	TokenNameIdentifier	 analyzer Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
;	TokenNameSEMICOLON	
return	TokenNamereturn	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
getOffsetGap	TokenNameIdentifier	 get Offset Gap
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"PerFieldAnalyzerWrapper("	TokenNameStringLiteral	PerFieldAnalyzerWrapper(
+	TokenNamePLUS	
analyzerMap	TokenNameIdentifier	 analyzer Map
+	TokenNamePLUS	
", default="	TokenNameStringLiteral	, default=
+	TokenNamePLUS	
defaultAnalyzer	TokenNameIdentifier	 default Analyzer
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
