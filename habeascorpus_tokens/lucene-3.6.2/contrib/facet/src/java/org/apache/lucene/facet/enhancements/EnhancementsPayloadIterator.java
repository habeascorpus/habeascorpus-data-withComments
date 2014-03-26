package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
enhancements	TokenNameIdentifier	 enhancements
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
List	TokenNameIdentifier	 List
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
IndexReader	TokenNameIdentifier	 Index Reader
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
Term	TokenNameIdentifier	 Term
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
PayloadIterator	TokenNameIdentifier	 Payload Iterator
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
Vint8	TokenNameIdentifier	 Vint8
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
Vint8	TokenNameIdentifier	 Vint8
.	TokenNameDOT	
Position	TokenNameIdentifier	 Position
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A {@link PayloadIterator} for iterating over category posting lists generated * using {@link EnhancementsCategoryTokenizer}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A {@link PayloadIterator} for iterating over category posting lists generated using {@link EnhancementsCategoryTokenizer}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
EnhancementsPayloadIterator	TokenNameIdentifier	 Enhancements Payload Iterator
extends	TokenNameextends	
PayloadIterator	TokenNameIdentifier	 Payload Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EnhancedCategories	TokenNameIdentifier	 Enhanced Categories
;	TokenNameSEMICOLON	
int	TokenNameint	
nEnhancements	TokenNameIdentifier	 n Enhancements
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enhancementLength	TokenNameIdentifier	 enhancement Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enhancementStart	TokenNameIdentifier	 enhancement Start
;	TokenNameSEMICOLON	
/** * Constructor. * * @param enhancementsList * A list of the {@link CategoryEnhancement}s from the indexing * params. * @param indexReader * A reader of the index. * @param term * The category term to iterate. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param enhancementsList A list of the {@link CategoryEnhancement}s from the indexing params. @param indexReader A reader of the index. @param term The category term to iterate. @throws IOException 
public	TokenNamepublic	
EnhancementsPayloadIterator	TokenNameIdentifier	 Enhancements Payload Iterator
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
>	TokenNameGREATER	
enhancementsList	TokenNameIdentifier	 enhancements List
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EnhancedCategories	TokenNameIdentifier	 Enhanced Categories
=	TokenNameEQUAL	
enhancementsList	TokenNameIdentifier	 enhancements List
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
[	TokenNameLBRACKET	
enhancementsList	TokenNameIdentifier	 enhancements List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
enhancementLength	TokenNameIdentifier	 enhancement Length
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
EnhancedCategories	TokenNameIdentifier	 Enhanced Categories
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
enhancementStart	TokenNameIdentifier	 enhancement Start
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
EnhancedCategories	TokenNameIdentifier	 Enhanced Categories
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
setdoc	TokenNameIdentifier	 setdoc
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
setdoc	TokenNameIdentifier	 setdoc
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read header - number of enhancements and their lengths 	TokenNameCOMMENT_LINE	read header - number of enhancements and their lengths 
Position	TokenNameIdentifier	 Position
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
new	TokenNamenew	
Position	TokenNameIdentifier	 Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nEnhancements	TokenNameIdentifier	 n Enhancements
=	TokenNameEQUAL	
Vint8	TokenNameIdentifier	 Vint8
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nEnhancements	TokenNameIdentifier	 n Enhancements
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enhancementLength	TokenNameIdentifier	 enhancement Length
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Vint8	TokenNameIdentifier	 Vint8
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set enhancements start points 	TokenNameCOMMENT_LINE	set enhancements start points 
enhancementStart	TokenNameIdentifier	 enhancement Start
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nEnhancements	TokenNameIdentifier	 n Enhancements
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enhancementStart	TokenNameIdentifier	 enhancement Start
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
enhancementStart	TokenNameIdentifier	 enhancement Start
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
enhancementLength	TokenNameIdentifier	 enhancement Length
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the data of the current category and document for a certain * enhancement, or {@code null} if no such enhancement exists. * * @param enhancedCategory * The category enhancement to apply. * @return the data of the current category and document for a certain * enhancement, or {@code null} if no such enhancement exists. */	TokenNameCOMMENT_JAVADOC	 Get the data of the current category and document for a certain enhancement, or {@code null} if no such enhancement exists. * @param enhancedCategory The category enhancement to apply. @return the data of the current category and document for a certain enhancement, or {@code null} if no such enhancement exists. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getCategoryData	TokenNameIdentifier	 get Category Data
(	TokenNameLPAREN	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
enhancedCategory	TokenNameIdentifier	 enhanced Category
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nEnhancements	TokenNameIdentifier	 n Enhancements
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enhancedCategory	TokenNameIdentifier	 enhanced Category
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EnhancedCategories	TokenNameIdentifier	 Enhanced Categories
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
enhancedCategory	TokenNameIdentifier	 enhanced Category
.	TokenNameDOT	
extractCategoryTokenData	TokenNameIdentifier	 extract Category Token Data
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
enhancementStart	TokenNameIdentifier	 enhancement Start
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
enhancementLength	TokenNameIdentifier	 enhancement Length
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
