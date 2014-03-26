package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
PerfRunData	TokenNameIdentifier	 Perf Run Data
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
feeds	TokenNameIdentifier	 feeds
.	TokenNameDOT	
FacetSource	TokenNameIdentifier	 Facet Source
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
CategoryContainer	TokenNameIdentifier	 Category Container
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
/** * Add a faceted document. * <p> * Config properties: * <ul> * <li><b>with.facets</b>=&lt;tells whether to actually add any facets to the document| Default: true&gt; * <br>This config property allows to easily compare the performance of adding docs with and without facets. * Note that facets are created even when this is false, just that they are not added to the document (nor to the taxonomy). * </ul> * <p> * See {@link AddDocTask} for general document parameters and configuration. * <p> * Makes use of the {@link FacetSource} in effect - see {@link PerfRunData} for facet source settings. */	TokenNameCOMMENT_JAVADOC	 Add a faceted document. <p> Config properties: <ul> <li><b>with.facets</b>=&lt;tells whether to actually add any facets to the document| Default: true&gt; <br>This config property allows to easily compare the performance of adding docs with and without facets. Note that facets are created even when this is false, just that they are not added to the document (nor to the taxonomy). </ul> <p> See {@link AddDocTask} for general document parameters and configuration. <p> Makes use of the {@link FacetSource} in effect - see {@link PerfRunData} for facet source settings. 
public	TokenNamepublic	
class	TokenNameclass	
AddFacetedDocTask	TokenNameIdentifier	 Add Faceted Doc Task
extends	TokenNameextends	
AddDocTask	TokenNameIdentifier	 Add Doc Task
{	TokenNameLBRACE	
public	TokenNamepublic	
AddFacetedDocTask	TokenNameIdentifier	 Add Faceted Doc Task
(	TokenNameLPAREN	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CategoryContainer	TokenNameIdentifier	 Category Container
facets	TokenNameIdentifier	 facets
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CategoryDocumentBuilder	TokenNameIdentifier	 Category Document Builder
categoryDocBuilder	TokenNameIdentifier	 category Doc Builder
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
withFacets	TokenNameIdentifier	 with Facets
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create the facets even if they should not be added - allows to measure the effect of just adding facets 	TokenNameCOMMENT_LINE	create the facets even if they should not be added - allows to measure the effect of just adding facets 
facets	TokenNameIdentifier	 facets
=	TokenNameEQUAL	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFacetSource	TokenNameIdentifier	 get Facet Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNextFacets	TokenNameIdentifier	 get Next Facets
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
withFacets	TokenNameIdentifier	 with Facets
=	TokenNameEQUAL	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"with.facets"	TokenNameStringLiteral	with.facets
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
withFacets	TokenNameIdentifier	 with Facets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
categoryDocBuilder	TokenNameIdentifier	 category Doc Builder
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryDocumentBuilder	TokenNameIdentifier	 Category Document Builder
(	TokenNameLPAREN	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTaxonomyWriter	TokenNameIdentifier	 get Taxonomy Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoryDocBuilder	TokenNameIdentifier	 category Doc Builder
.	TokenNameDOT	
setCategories	TokenNameIdentifier	 set Categories
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLogMessage	TokenNameIdentifier	 get Log Message
(	TokenNameLPAREN	
int	TokenNameint	
recsCount	TokenNameIdentifier	 recs Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
withFacets	TokenNameIdentifier	 with Facets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getLogMessage	TokenNameIdentifier	 get Log Message
(	TokenNameLPAREN	
recsCount	TokenNameIdentifier	 recs Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getLogMessage	TokenNameIdentifier	 get Log Message
(	TokenNameLPAREN	
recsCount	TokenNameIdentifier	 recs Count
)	TokenNameRPAREN	
+	TokenNamePLUS	
" with facets"	TokenNameStringLiteral	 with facets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
withFacets	TokenNameIdentifier	 with Facets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
categoryDocBuilder	TokenNameIdentifier	 category Doc Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
