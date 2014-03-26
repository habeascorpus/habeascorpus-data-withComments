package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
InputStreamDataInput	TokenNameIdentifier	 Input Stream Data Input
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
IOUtils	TokenNameIdentifier	 IO Utils
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
FST	TokenNameIdentifier	 FST
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
PositiveIntOutputs	TokenNameIdentifier	 Positive Int Outputs
;	TokenNameSEMICOLON	
/** * Binary dictionary implementation for a known-word dictionary model: * Words are encoded into an FST mapping to a list of wordIDs. */	TokenNameCOMMENT_JAVADOC	 Binary dictionary implementation for a known-word dictionary model: Words are encoded into an FST mapping to a list of wordIDs. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TokenInfoDictionary	TokenNameIdentifier	 Token Info Dictionary
extends	TokenNameextends	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FST_FILENAME_SUFFIX	TokenNameIdentifier	 FST  FILENAME  SUFFIX
=	TokenNameEQUAL	
"$fst.dat"	TokenNameStringLiteral	$fst.dat
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
TokenInfoFST	TokenNameIdentifier	 Token Info FST
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TokenInfoDictionary	TokenNameIdentifier	 Token Info Dictionary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IOException	TokenNameIdentifier	 IO Exception
priorE	TokenNameIdentifier	 prior E
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
FST_FILENAME_SUFFIX	TokenNameIdentifier	 FST  FILENAME  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamDataInput	TokenNameIdentifier	 Input Stream Data Input
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
,	TokenNameCOMMA	
PositiveIntOutputs	TokenNameIdentifier	 Positive Int Outputs
.	TokenNameDOT	
getSingleton	TokenNameIdentifier	 get Singleton
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
priorE	TokenNameIdentifier	 prior E
=	TokenNameEQUAL	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
priorE	TokenNameIdentifier	 prior E
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: some way to configure? 	TokenNameCOMMENT_LINE	TODO: some way to configure? 
this	TokenNamethis	
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
new	TokenNamenew	
TokenInfoFST	TokenNameIdentifier	 Token Info FST
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TokenInfoFST	TokenNameIdentifier	 Token Info FST
getFST	TokenNameIdentifier	 get FST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TokenInfoDictionary	TokenNameIdentifier	 Token Info Dictionary
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SingletonHolder	TokenNameIdentifier	 Singleton Holder
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SingletonHolder	TokenNameIdentifier	 Singleton Holder
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
TokenInfoDictionary	TokenNameIdentifier	 Token Info Dictionary
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
TokenInfoDictionary	TokenNameIdentifier	 Token Info Dictionary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot load TokenInfoDictionary."	TokenNameStringLiteral	Cannot load TokenInfoDictionary.
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
