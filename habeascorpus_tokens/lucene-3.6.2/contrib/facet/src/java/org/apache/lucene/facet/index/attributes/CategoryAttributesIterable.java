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
attributes	TokenNameIdentifier	 attributes
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
CategoryAttributesStream	TokenNameIdentifier	 Category Attributes Stream
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * This class transforms an {@link Iterable} of {@link CategoryPath} objects * into an {@link Iterable} of {@link CategoryAttribute} objects, which can be * used to construct a {@link CategoryAttributesStream}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This class transforms an {@link Iterable} of {@link CategoryPath} objects into an {@link Iterable} of {@link CategoryAttribute} objects, which can be used to construct a {@link CategoryAttributesStream}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CategoryAttributesIterable	TokenNameIdentifier	 Category Attributes Iterable
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
>	TokenNameGREATER	
inputIterable	TokenNameIdentifier	 input Iterable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CategoryAttributesIterable	TokenNameIdentifier	 Category Attributes Iterable
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
>	TokenNameGREATER	
inputIterable	TokenNameIdentifier	 input Iterable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inputIterable	TokenNameIdentifier	 input Iterable
=	TokenNameEQUAL	
inputIterable	TokenNameIdentifier	 input Iterable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CategoryAttributesIterator	TokenNameIdentifier	 Category Attributes Iterator
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
inputIterable	TokenNameIdentifier	 input Iterable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CategoryAttributesIterator	TokenNameIdentifier	 Category Attributes Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
>	TokenNameGREATER	
internalIterator	TokenNameIdentifier	 internal Iterator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
categoryAttributeImpl	TokenNameIdentifier	 category Attribute Impl
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CategoryAttributesIterator	TokenNameIdentifier	 Category Attributes Iterator
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
>	TokenNameGREATER	
inputIterable	TokenNameIdentifier	 input Iterable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
internalIterator	TokenNameIdentifier	 internal Iterator
=	TokenNameEQUAL	
inputIterable	TokenNameIdentifier	 input Iterable
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
categoryAttributeImpl	TokenNameIdentifier	 category Attribute Impl
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
internalIterator	TokenNameIdentifier	 internal Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
categoryAttributeImpl	TokenNameIdentifier	 category Attribute Impl
.	TokenNameDOT	
setCategoryPath	TokenNameIdentifier	 set Category Path
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
internalIterator	TokenNameIdentifier	 internal Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
categoryAttributeImpl	TokenNameIdentifier	 category Attribute Impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
internalIterator	TokenNameIdentifier	 internal Iterator
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
