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
params	TokenNameIdentifier	 params
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
FacetException	TokenNameIdentifier	 Facet Exception
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Thrown when the facets params are missing a property. * * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Thrown when the facets params are missing a property. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
FacetParamsMissingPropertyException	TokenNameIdentifier	 Facet Params Missing Property Exception
extends	TokenNameextends	
FacetException	TokenNameIdentifier	 Facet Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
FacetParamsMissingPropertyException	TokenNameIdentifier	 Facet Params Missing Property Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Property with key ""	TokenNameStringLiteral	Property with key "
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"" not found"	TokenNameStringLiteral	" not found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
