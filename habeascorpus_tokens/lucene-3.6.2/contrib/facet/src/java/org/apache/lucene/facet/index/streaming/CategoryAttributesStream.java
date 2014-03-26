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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An attribute stream built from an {@link Iterable} of * {@link CategoryAttribute}. This stream should then be passed through several * filters (see {@link CategoryParentsStream}, {@link CategoryListTokenizer} and * {@link CategoryTokenizer}) until a token stream is produced that can be * indexed by Lucene. * <P> * A CategoryAttributesStream object can be reused for producing more than one * stream. To do that, the user should cause the underlying * Iterable<CategoryAttribute> object to return a new set of categories, and * then call {@link #reset()} to allow this stream to be used again. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An attribute stream built from an {@link Iterable} of {@link CategoryAttribute}. This stream should then be passed through several filters (see {@link CategoryParentsStream}, {@link CategoryListTokenizer} and {@link CategoryTokenizer}) until a token stream is produced that can be indexed by Lucene. <P> A CategoryAttributesStream object can be reused for producing more than one stream. To do that, the user should cause the underlying Iterable<CategoryAttribute> object to return a new set of categories, and then call {@link #reset()} to allow this stream to be used again. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CategoryAttributesStream	TokenNameIdentifier	 Category Attributes Stream
extends	TokenNameextends	
TokenStream	TokenNameIdentifier	 Token Stream
{	TokenNameLBRACE	
protected	TokenNameprotected	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
categoryAttribute	TokenNameIdentifier	 category Attribute
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
iterable	TokenNameIdentifier	 iterable
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
;	TokenNameSEMICOLON	
/** * Constructor * * @param iterable * {@link Iterable} of {@link CategoryAttribute}, from which * categories are taken. */	TokenNameCOMMENT_JAVADOC	 Constructor * @param iterable {@link Iterable} of {@link CategoryAttribute}, from which categories are taken. 
public	TokenNamepublic	
CategoryAttributesStream	TokenNameIdentifier	 Category Attributes Stream
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
iterable	TokenNameIdentifier	 iterable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
iterable	TokenNameIdentifier	 iterable
=	TokenNameEQUAL	
iterable	TokenNameIdentifier	 iterable
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
null	TokenNamenull	
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
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
iterable	TokenNameIdentifier	 iterable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
iterable	TokenNameIdentifier	 iterable
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
categoryAttribute	TokenNameIdentifier	 category Attribute
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
