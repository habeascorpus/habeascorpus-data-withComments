package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
function	TokenNameIdentifier	 function
.	TokenNameDOT	
DocValues	TokenNameIdentifier	 Doc Values
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * Expert: source of values for basic function queries. * <P>At its default/simplest form, values - one per doc - are used as the score of that doc. * <P>Values are instantiated as * {@link org.apache.lucene.search.function.DocValues DocValues} for a particular reader. * <P>ValueSource implementations differ in RAM requirements: it would always be a factor * of the number of documents, but for each document the number of bytes can be 1, 2, 4, or 8. * * @lucene.experimental * * */	TokenNameCOMMENT_JAVADOC	 Expert: source of values for basic function queries. <P>At its default/simplest form, values - one per doc - are used as the score of that doc. <P>Values are instantiated as {@link org.apache.lucene.search.function.DocValues DocValues} for a particular reader. <P>ValueSource implementations differ in RAM requirements: it would always be a factor of the number of documents, but for each document the number of bytes can be 1, 2, 4, or 8. * @lucene.experimental * 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ValueSource	TokenNameIdentifier	 Value Source
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * Return the DocValues used by the function query. * @param reader the IndexReader used to read these values. * If any caching is involved, that caching would also be IndexReader based. * @throws IOException for any error. */	TokenNameCOMMENT_JAVADOC	 Return the DocValues used by the function query. @param reader the IndexReader used to read these values. If any caching is involved, that caching would also be IndexReader based. @throws IOException for any error. 
public	TokenNamepublic	
abstract	TokenNameabstract	
DocValues	TokenNameIdentifier	 Doc Values
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * description of field, used in explain() */	TokenNameCOMMENT_JAVADOC	 description of field, used in explain() 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* (non-Javadoc) @see java.lang.Object#toString() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see java.lang.Object#toString() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
description	TokenNameIdentifier	 description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Needed for possible caching of query results - used by {@link ValueSourceQuery#equals(Object)}. * @see Object#equals(Object) */	TokenNameCOMMENT_JAVADOC	 Needed for possible caching of query results - used by {@link ValueSourceQuery#equals(Object)}. @see Object#equals(Object) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Needed for possible caching of query results - used by {@link ValueSourceQuery#hashCode()}. * @see Object#hashCode() */	TokenNameCOMMENT_JAVADOC	 Needed for possible caching of query results - used by {@link ValueSourceQuery#hashCode()}. @see Object#hashCode() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
