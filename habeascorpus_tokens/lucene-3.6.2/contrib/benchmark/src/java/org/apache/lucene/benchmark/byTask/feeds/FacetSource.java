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
feeds	TokenNameIdentifier	 feeds
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
CategoryContainer	TokenNameIdentifier	 Category Container
;	TokenNameSEMICOLON	
/** * Source items for facets. * <p> * For supported configuration parameters see {@link ContentItemsSource}. */	TokenNameCOMMENT_JAVADOC	 Source items for facets. <p> For supported configuration parameters see {@link ContentItemsSource}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FacetSource	TokenNameIdentifier	 Facet Source
extends	TokenNameextends	
ContentItemsSource	TokenNameIdentifier	 Content Items Source
{	TokenNameLBRACE	
/** Returns the next {@link CategoryContainer facets content item}. * Implementations must account for multi-threading, as multiple threads * can call this method simultaneously. */	TokenNameCOMMENT_JAVADOC	 Returns the next {@link CategoryContainer facets content item}. Implementations must account for multi-threading, as multiple threads can call this method simultaneously. 
public	TokenNamepublic	
abstract	TokenNameabstract	
CategoryContainer	TokenNameIdentifier	 Category Container
getNextFacets	TokenNameIdentifier	 get Next Facets
(	TokenNameLPAREN	
CategoryContainer	TokenNameIdentifier	 Category Container
facets	TokenNameIdentifier	 facets
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
resetInputs	TokenNameIdentifier	 reset Inputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
printStatistics	TokenNameIdentifier	 print Statistics
(	TokenNameLPAREN	
"facets"	TokenNameStringLiteral	facets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// re-initiate since properties by round may have changed. 	TokenNameCOMMENT_LINE	re-initiate since properties by round may have changed. 
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
resetInputs	TokenNameIdentifier	 reset Inputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
