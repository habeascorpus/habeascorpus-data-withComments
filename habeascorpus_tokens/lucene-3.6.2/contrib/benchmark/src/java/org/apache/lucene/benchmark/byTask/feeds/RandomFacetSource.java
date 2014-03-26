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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
/** * Simple implementation of a random facet source * <p> * Supports the following parameters: * <ul> * <li><b>rand.seed</b> - defines the seed to initialize Random with (default: <b>13</b>). * <li><b>max.doc.facets</b> - maximal #facets per doc (default: <b>10</b>). * Actual number of facets in a certain doc would be anything between 1 and that number. * <li><b>max.facet.depth</b> - maximal #components in a facet (default: <b>3</b>). * Actual number of components in a certain facet would be anything between 1 and that number. * </ul> */	TokenNameCOMMENT_JAVADOC	 Simple implementation of a random facet source <p> Supports the following parameters: <ul> <li><b>rand.seed</b> - defines the seed to initialize Random with (default: <b>13</b>). <li><b>max.doc.facets</b> - maximal #facets per doc (default: <b>10</b>). Actual number of facets in a certain doc would be anything between 1 and that number. <li><b>max.facet.depth</b> - maximal #components in a facet (default: <b>3</b>). Actual number of components in a certain facet would be anything between 1 and that number. </ul> 
public	TokenNamepublic	
class	TokenNameclass	
RandomFacetSource	TokenNameIdentifier	 Random Facet Source
extends	TokenNameextends	
FacetSource	TokenNameIdentifier	 Facet Source
{	TokenNameLBRACE	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxDocFacets	TokenNameIdentifier	 max Doc Facets
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxFacetDepth	TokenNameIdentifier	 max Facet Depth
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxValue	TokenNameIdentifier	 max Value
=	TokenNameEQUAL	
maxDocFacets	TokenNameIdentifier	 max Doc Facets
*	TokenNameMULTIPLY	
maxFacetDepth	TokenNameIdentifier	 max Facet Depth
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
facets	TokenNameIdentifier	 facets
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryContainer	TokenNameIdentifier	 Category Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numFacets	TokenNameIdentifier	 num Facets
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxDocFacets	TokenNameIdentifier	 max Doc Facets
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// at least one facet to each doc 	TokenNameCOMMENT_LINE	at least one facet to each doc 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numFacets	TokenNameIdentifier	 num Facets
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryPath	TokenNameIdentifier	 Category Path
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxFacetDepth	TokenNameIdentifier	 max Facet Depth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// depth 0 is not useful 	TokenNameCOMMENT_LINE	depth 0 is not useful 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxValue	TokenNameIdentifier	 max Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBytes	TokenNameIdentifier	 add Bytes
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// very rough approximation 	TokenNameCOMMENT_LINE	very rough approximation 
}	TokenNameRBRACE	
return	TokenNamereturn	
facets	TokenNameIdentifier	 facets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// nothing to do here 	TokenNameCOMMENT_LINE	nothing to do here 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"rand.seed"	TokenNameStringLiteral	rand.seed
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxDocFacets	TokenNameIdentifier	 max Doc Facets
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"max.doc.facets"	TokenNameStringLiteral	max.doc.facets
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxFacetDepth	TokenNameIdentifier	 max Facet Depth
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"max.facet.depth"	TokenNameStringLiteral	max.facet.depth
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxValue	TokenNameIdentifier	 max Value
=	TokenNameEQUAL	
maxDocFacets	TokenNameIdentifier	 max Doc Facets
*	TokenNameMULTIPLY	
maxFacetDepth	TokenNameIdentifier	 max Facet Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
