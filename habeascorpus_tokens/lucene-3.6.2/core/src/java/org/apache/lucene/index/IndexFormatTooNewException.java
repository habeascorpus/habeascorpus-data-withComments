/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
/** * This exception is thrown when Lucene detects * an index that is newer than this Lucene version. */	TokenNameCOMMENT_JAVADOC	 This exception is thrown when Lucene detects an index that is newer than this Lucene version. 
public	TokenNamepublic	
class	TokenNameclass	
IndexFormatTooNewException	TokenNameIdentifier	 Index Format Too New Exception
extends	TokenNameextends	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
{	TokenNameLBRACE	
/** @lucene.internal */	TokenNameCOMMENT_JAVADOC	 @lucene.internal 
public	TokenNamepublic	
IndexFormatTooNewException	TokenNameIdentifier	 Index Format Too New Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceDesc	TokenNameIdentifier	 resource Desc
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
int	TokenNameint	
minVersion	TokenNameIdentifier	 min Version
,	TokenNameCOMMA	
int	TokenNameint	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Format version is not supported (resource: "	TokenNameStringLiteral	Format version is not supported (resource: 
+	TokenNamePLUS	
resourceDesc	TokenNameIdentifier	 resource Desc
+	TokenNamePLUS	
"): "	TokenNameStringLiteral	): 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
" (needs to be between "	TokenNameStringLiteral	 (needs to be between 
+	TokenNamePLUS	
minVersion	TokenNameIdentifier	 min Version
+	TokenNamePLUS	
" and "	TokenNameStringLiteral	 and 
+	TokenNamePLUS	
maxVersion	TokenNameIdentifier	 max Version
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
resourceDesc	TokenNameIdentifier	 resource Desc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @lucene.internal */	TokenNameCOMMENT_JAVADOC	 @lucene.internal 
public	TokenNamepublic	
IndexFormatTooNewException	TokenNameIdentifier	 Index Format Too New Exception
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
int	TokenNameint	
minVersion	TokenNameIdentifier	 min Version
,	TokenNameCOMMA	
int	TokenNameint	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
minVersion	TokenNameIdentifier	 min Version
,	TokenNameCOMMA	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
