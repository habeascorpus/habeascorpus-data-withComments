package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
results	TokenNameIdentifier	 results
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetRequest	TokenNameIdentifier	 Facet Request
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Result of faceted search. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Result of faceted search. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
FacetResult	TokenNameIdentifier	 Facet Result
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
FacetRequest	TokenNameIdentifier	 Facet Request
facetRequest	TokenNameIdentifier	 facet Request
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
numValidDescendants	TokenNameIdentifier	 num Valid Descendants
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FacetResult	TokenNameIdentifier	 Facet Result
(	TokenNameLPAREN	
FacetRequest	TokenNameIdentifier	 Facet Request
facetRequest	TokenNameIdentifier	 facet Request
,	TokenNameCOMMA	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
rootNode	TokenNameIdentifier	 root Node
,	TokenNameCOMMA	
int	TokenNameint	
numValidDescendants	TokenNameIdentifier	 num Valid Descendants
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
facetRequest	TokenNameIdentifier	 facet Request
=	TokenNameEQUAL	
facetRequest	TokenNameIdentifier	 facet Request
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numValidDescendants	TokenNameIdentifier	 num Valid Descendants
=	TokenNameEQUAL	
numValidDescendants	TokenNameIdentifier	 num Valid Descendants
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Facet result node matching the root of the {@link #getFacetRequest() facet request}. * @see #getFacetRequest() * @see FacetRequest#getCategoryPath() */	TokenNameCOMMENT_JAVADOC	 Facet result node matching the root of the {@link #getFacetRequest() facet request}. @see #getFacetRequest() @see FacetRequest#getCategoryPath() 
public	TokenNamepublic	
final	TokenNamefinal	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Number of descendants of {@link #getFacetResultNode() root facet result node}, * up till the requested depth, which are valid by the * {@link FacetRequest#createFacetResultsHandler(org.apache.lucene.facet.taxonomy.TaxonomyReader) * results handler in effect}. Typically -- have value != 0. * This number does not include the root node. * @see #getFacetRequest() * @see FacetRequest#getDepth() */	TokenNameCOMMENT_JAVADOC	 Number of descendants of {@link #getFacetResultNode() root facet result node}, up till the requested depth, which are valid by the {@link FacetRequest#createFacetResultsHandler(org.apache.lucene.facet.taxonomy.TaxonomyReader) results handler in effect}. Typically -- have value != 0. This number does not include the root node. @see #getFacetRequest() @see FacetRequest#getDepth() 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getNumValidDescendants	TokenNameIdentifier	 get Num Valid Descendants
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
numValidDescendants	TokenNameIdentifier	 num Valid Descendants
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Request for which this result was obtained. */	TokenNameCOMMENT_JAVADOC	 Request for which this result was obtained. 
public	TokenNamepublic	
final	TokenNamefinal	
FacetRequest	TokenNameIdentifier	 Facet Request
getFacetRequest	TokenNameIdentifier	 get Facet Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
facetRequest	TokenNameIdentifier	 facet Request
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * String representation of this facet result. * Use with caution: might return a very long string. * @param prefix prefix for each result line * @see #toString() */	TokenNameCOMMENT_JAVADOC	 String representation of this facet result. Use with caution: might return a very long string. @param prefix prefix for each result line @see #toString() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// request 	TokenNameCOMMENT_LINE	request 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
facetRequest	TokenNameIdentifier	 facet Request
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Request: "	TokenNameStringLiteral	Request: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// total facets 	TokenNameCOMMENT_LINE	total facets 
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Num valid Descendants (up to specified depth): "	TokenNameStringLiteral	Num valid Descendants (up to specified depth): 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
numValidDescendants	TokenNameIdentifier	 num Valid Descendants
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// result node 	TokenNameCOMMENT_LINE	result node 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
rootNode	TokenNameIdentifier	 root Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
rootNode	TokenNameIdentifier	 root Node
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
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
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
