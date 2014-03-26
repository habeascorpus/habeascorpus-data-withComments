package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
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
/** * A unit test helper class to test when the filter is getting cached and when it is not. */	TokenNameCOMMENT_JAVADOC	 A unit test helper class to test when the filter is getting cached and when it is not. 
public	TokenNamepublic	
class	TokenNameclass	
CachingWrapperFilterHelper	TokenNameIdentifier	 Caching Wrapper Filter Helper
extends	TokenNameextends	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * @param filter Filter to cache results of */	TokenNameCOMMENT_JAVADOC	 @param filter Filter to cache results of 
public	TokenNamepublic	
CachingWrapperFilterHelper	TokenNameIdentifier	 Caching Wrapper Filter Helper
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setShouldHaveCache	TokenNameIdentifier	 set Should Have Cache
(	TokenNameLPAREN	
boolean	TokenNameboolean	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
=	TokenNameEQUAL	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
saveMissCount	TokenNameIdentifier	 save Miss Count
=	TokenNameEQUAL	
missCount	TokenNameIdentifier	 miss Count
;	TokenNameSEMICOLON	
DocIdSet	TokenNameIdentifier	 Doc Id Set
docIdSet	TokenNameIdentifier	 doc Id Set
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Cache should have data "	TokenNameStringLiteral	Cache should have data 
,	TokenNameCOMMA	
saveMissCount	TokenNameIdentifier	 save Miss Count
,	TokenNameCOMMA	
missCount	TokenNameIdentifier	 miss Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Cache should be null "	TokenNameStringLiteral	Cache should be null 
+	TokenNamePLUS	
docIdSet	TokenNameIdentifier	 doc Id Set
,	TokenNameCOMMA	
missCount	TokenNameIdentifier	 miss Count
>	TokenNameGREATER	
saveMissCount	TokenNameIdentifier	 save Miss Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
docIdSet	TokenNameIdentifier	 doc Id Set
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
"CachingWrapperFilterHelper("	TokenNameStringLiteral	CachingWrapperFilterHelper(
+	TokenNamePLUS	
filter	TokenNameIdentifier	 filter
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
CachingWrapperFilterHelper	TokenNameIdentifier	 Caching Wrapper Filter Helper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0x5525aacb	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
