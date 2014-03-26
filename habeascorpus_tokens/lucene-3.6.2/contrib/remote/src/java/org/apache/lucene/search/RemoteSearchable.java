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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
FieldSelector	TokenNameIdentifier	 Field Selector
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
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
FSDirectory	TokenNameIdentifier	 FS Directory
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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
Naming	TokenNameIdentifier	 Naming
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
RMISecurityManager	TokenNameIdentifier	 RMI Security Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
RemoteException	TokenNameIdentifier	 Remote Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
UnicastRemoteObject	TokenNameIdentifier	 Unicast Remote Object
;	TokenNameSEMICOLON	
/** * A remote searchable implementation. * * @deprecated This package (all of contrib/remote) will be * removed in 4.0. */	TokenNameCOMMENT_JAVADOC	 A remote searchable implementation. * @deprecated This package (all of contrib/remote) will be removed in 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
RemoteSearchable	TokenNameIdentifier	 Remote Searchable
extends	TokenNameextends	
UnicastRemoteObject	TokenNameIdentifier	 Unicast Remote Object
implements	TokenNameimplements	
RMIRemoteSearchable	TokenNameIdentifier	 RMI Remote Searchable
{	TokenNameLBRACE	
private	TokenNameprivate	
Searchable	TokenNameIdentifier	 Searchable
local	TokenNameIdentifier	 local
;	TokenNameSEMICOLON	
/** Constructs and exports a remote searcher. */	TokenNameCOMMENT_JAVADOC	 Constructs and exports a remote searcher. 
public	TokenNamepublic	
RemoteSearchable	TokenNameIdentifier	 Remote Searchable
(	TokenNameLPAREN	
Searchable	TokenNameIdentifier	 Searchable
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
throws	TokenNamethrows	
RemoteException	TokenNameIdentifier	 Remote Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
local	TokenNameIdentifier	 local
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docFreqs	TokenNameIdentifier	 doc Freqs
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
docFreqs	TokenNameIdentifier	 doc Freqs
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
FieldSelector	TokenNameIdentifier	 Field Selector
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Exports a searcher for the index in args[0] named * "//localhost/Searchable". */	TokenNameCOMMENT_JAVADOC	 Exports a searcher for the index in args[0] named "//localhost/Searchable". 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
indexName	TokenNameIdentifier	 index Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
indexName	TokenNameIdentifier	 index Name
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexName	TokenNameIdentifier	 index Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: org.apache.lucene.search.RemoteSearchable <index>"	TokenNameStringLiteral	Usage: org.apache.lucene.search.RemoteSearchable <index>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create and install a security manager 	TokenNameCOMMENT_LINE	create and install a security manager 
if	TokenNameif	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getSecurityManager	TokenNameIdentifier	 get Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
new	TokenNamenew	
RMISecurityManager	TokenNameIdentifier	 RMI Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Searchable	TokenNameIdentifier	 Searchable
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
indexName	TokenNameIdentifier	 index Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RemoteSearchable	TokenNameIdentifier	 Remote Searchable
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
new	TokenNamenew	
RemoteSearchable	TokenNameIdentifier	 Remote Searchable
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// bind the implementation to "Searchable" 	TokenNameCOMMENT_LINE	bind the implementation to "Searchable" 
Naming	TokenNameIdentifier	 Naming
.	TokenNameDOT	
rebind	TokenNameIdentifier	 rebind
(	TokenNameLPAREN	
"//localhost/Searchable"	TokenNameStringLiteral	//localhost/Searchable
,	TokenNameCOMMA	
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
