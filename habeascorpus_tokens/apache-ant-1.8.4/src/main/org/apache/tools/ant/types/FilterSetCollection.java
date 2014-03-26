/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
// java io classes 	TokenNameCOMMENT_LINE	java io classes 
// java util classes 	TokenNameCOMMENT_LINE	java util classes 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
// ant classes 	TokenNameCOMMENT_LINE	ant classes 
/** * A FilterSetCollection is a collection of filtersets each of which may have * a different start/end token settings. * */	TokenNameCOMMENT_JAVADOC	 A FilterSetCollection is a collection of filtersets each of which may have a different start/end token settings. 
public	TokenNamepublic	
class	TokenNameclass	
FilterSetCollection	TokenNameIdentifier	 Filter Set Collection
{	TokenNameLBRACE	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
filterSets	TokenNameIdentifier	 filter Sets
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructor for a FilterSetCollection. */	TokenNameCOMMENT_JAVADOC	 Constructor for a FilterSetCollection. 
public	TokenNamepublic	
FilterSetCollection	TokenNameIdentifier	 Filter Set Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructor for a FilterSetCollection. * @param filterSet a filterset to start the collection with */	TokenNameCOMMENT_JAVADOC	 Constructor for a FilterSetCollection. @param filterSet a filterset to start the collection with 
public	TokenNamepublic	
FilterSetCollection	TokenNameIdentifier	 Filter Set Collection
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
filterSet	TokenNameIdentifier	 filter Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addFilterSet	TokenNameIdentifier	 add Filter Set
(	TokenNameLPAREN	
filterSet	TokenNameIdentifier	 filter Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a filterset to the collection. * * @param filterSet a <code>FilterSet</code> value */	TokenNameCOMMENT_JAVADOC	 Add a filterset to the collection. * @param filterSet a <code>FilterSet</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
addFilterSet	TokenNameIdentifier	 add Filter Set
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
filterSet	TokenNameIdentifier	 filter Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filterSets	TokenNameIdentifier	 filter Sets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
filterSet	TokenNameIdentifier	 filter Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does replacement on the given string with token matching. * This uses the defined begintoken and endtoken values which default to @ for both. * * @param line The line to process the tokens in. * @return The string with the tokens replaced. */	TokenNameCOMMENT_JAVADOC	 Does replacement on the given string with token matching. This uses the defined begintoken and endtoken values which default to @ for both. * @param line The line to process the tokens in. @return The string with the tokens replaced. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
replaceTokens	TokenNameIdentifier	 replace Tokens
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
replacedLine	TokenNameIdentifier	 replaced Line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
filterSets	TokenNameIdentifier	 filter Sets
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterSet	TokenNameIdentifier	 Filter Set
filterSet	TokenNameIdentifier	 filter Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replacedLine	TokenNameIdentifier	 replaced Line
=	TokenNameEQUAL	
filterSet	TokenNameIdentifier	 filter Set
.	TokenNameDOT	
replaceTokens	TokenNameIdentifier	 replace Tokens
(	TokenNameLPAREN	
replacedLine	TokenNameIdentifier	 replaced Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
replacedLine	TokenNameIdentifier	 replaced Line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test to see if this filter set it empty. * * @return Return true if there are filter in this set otherwise false. */	TokenNameCOMMENT_JAVADOC	 Test to see if this filter set it empty. * @return Return true if there are filter in this set otherwise false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFilters	TokenNameIdentifier	 has Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
filterSets	TokenNameIdentifier	 filter Sets
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterSet	TokenNameIdentifier	 Filter Set
filterSet	TokenNameIdentifier	 filter Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filterSet	TokenNameIdentifier	 filter Set
.	TokenNameDOT	
hasFilters	TokenNameIdentifier	 has Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
