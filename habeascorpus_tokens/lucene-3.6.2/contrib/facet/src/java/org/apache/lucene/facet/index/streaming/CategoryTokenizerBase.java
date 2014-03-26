package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenFilter	TokenNameIdentifier	 Token Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Payload	TokenNameIdentifier	 Payload
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
CategoryDocumentBuilder	TokenNameIdentifier	 Category Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A base class for all token filters which add term and payload attributes to * tokens and are to be used in {@link CategoryDocumentBuilder}. Contains three * attributes: {@link CategoryAttribute}, {@link CharTermAttribute} and * {@link PayloadAttribute}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A base class for all token filters which add term and payload attributes to tokens and are to be used in {@link CategoryDocumentBuilder}. Contains three attributes: {@link CategoryAttribute}, {@link CharTermAttribute} and {@link PayloadAttribute}. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CategoryTokenizerBase	TokenNameIdentifier	 Category Tokenizer Base
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
/** The stream's category attributes. */	TokenNameCOMMENT_JAVADOC	 The stream's category attributes. 
protected	TokenNameprotected	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
categoryAttribute	TokenNameIdentifier	 category Attribute
;	TokenNameSEMICOLON	
/** The stream's payload attribute. */	TokenNameCOMMENT_JAVADOC	 The stream's payload attribute. 
protected	TokenNameprotected	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
payloadAttribute	TokenNameIdentifier	 payload Attribute
;	TokenNameSEMICOLON	
/** The stream's term attribute. */	TokenNameCOMMENT_JAVADOC	 The stream's term attribute. 
protected	TokenNameprotected	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAttribute	TokenNameIdentifier	 term Attribute
;	TokenNameSEMICOLON	
/** The object used for constructing payloads. */	TokenNameCOMMENT_JAVADOC	 The object used for constructing payloads. 
protected	TokenNameprotected	
Payload	TokenNameIdentifier	 Payload
payload	TokenNameIdentifier	 payload
=	TokenNameEQUAL	
new	TokenNamenew	
Payload	TokenNameIdentifier	 Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Indexing params for creating term text **/	TokenNameCOMMENT_JAVADOC	 Indexing params for creating term text *
protected	TokenNameprotected	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
indexingParams	TokenNameIdentifier	 indexing Params
;	TokenNameSEMICOLON	
/** * Constructor. * * @param input * The input stream, either {@link CategoryParentsStream} or an * extension of {@link CategoryTokenizerBase}. * @param indexingParams * The indexing params to use. */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param input The input stream, either {@link CategoryParentsStream} or an extension of {@link CategoryTokenizerBase}. @param indexingParams The indexing params to use. 
public	TokenNamepublic	
CategoryTokenizerBase	TokenNameIdentifier	 Category Tokenizer Base
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
indexingParams	TokenNameIdentifier	 indexing Params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
categoryAttribute	TokenNameIdentifier	 category Attribute
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termAttribute	TokenNameIdentifier	 term Attribute
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
payloadAttribute	TokenNameIdentifier	 payload Attribute
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
indexingParams	TokenNameIdentifier	 indexing Params
=	TokenNameEQUAL	
indexingParams	TokenNameIdentifier	 indexing Params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
