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
/** * This exception is thrown when Lucene detects * an index that is too old for this Lucene version */	TokenNameCOMMENT_JAVADOC	 This exception is thrown when Lucene detects an index that is too old for this Lucene version 
public	TokenNamepublic	
class	TokenNameclass	
IndexFormatTooOldException	TokenNameIdentifier	 Index Format Too Old Exception
extends	TokenNameextends	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
{	TokenNameLBRACE	
/** @lucene.internal */	TokenNameCOMMENT_JAVADOC	 @lucene.internal 
public	TokenNamepublic	
IndexFormatTooOldException	TokenNameIdentifier	 Index Format Too Old Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceDesc	TokenNameIdentifier	 resource Desc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
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
". This version of Lucene only supports indexes created with release 1.9 and later."	TokenNameStringLiteral	. This version of Lucene only supports indexes created with release 1.9 and later.
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
IndexFormatTooOldException	TokenNameIdentifier	 Index Format Too Old Exception
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @lucene.internal */	TokenNameCOMMENT_JAVADOC	 @lucene.internal 
public	TokenNamepublic	
IndexFormatTooOldException	TokenNameIdentifier	 Index Format Too Old Exception
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
"). This version of Lucene only supports indexes created with release 1.9 and later."	TokenNameStringLiteral	). This version of Lucene only supports indexes created with release 1.9 and later.
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
IndexFormatTooOldException	TokenNameIdentifier	 Index Format Too Old Exception
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
