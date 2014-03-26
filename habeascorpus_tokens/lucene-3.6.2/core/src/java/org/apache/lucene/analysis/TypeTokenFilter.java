package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
TypeAttribute	TokenNameIdentifier	 Type Attribute
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Removes tokens whose types appear in a set of blocked types from a token stream. */	TokenNameCOMMENT_JAVADOC	 Removes tokens whose types appear in a set of blocked types from a token stream. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TypeTokenFilter	TokenNameIdentifier	 Type Token Filter
extends	TokenNameextends	
FilteringTokenFilter	TokenNameIdentifier	 Filtering Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopTypes	TokenNameIdentifier	 stop Types
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAttribute	TokenNameIdentifier	 type Attribute
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
useWhiteList	TokenNameIdentifier	 use White List
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TypeTokenFilter	TokenNameIdentifier	 Type Token Filter
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopTypes	TokenNameIdentifier	 stop Types
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useWhiteList	TokenNameIdentifier	 use White List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
stopTypes	TokenNameIdentifier	 stop Types
=	TokenNameEQUAL	
stopTypes	TokenNameIdentifier	 stop Types
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
useWhiteList	TokenNameIdentifier	 use White List
=	TokenNameEQUAL	
useWhiteList	TokenNameIdentifier	 use White List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TypeTokenFilter	TokenNameIdentifier	 Type Token Filter
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopTypes	TokenNameIdentifier	 stop Types
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
stopTypes	TokenNameIdentifier	 stop Types
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By default accept the token if its type is not a stop type. * When the useWhiteList parameter is set to true then accept the token if its type is contained in the stopTypes */	TokenNameCOMMENT_JAVADOC	 By default accept the token if its type is not a stop type. When the useWhiteList parameter is set to true then accept the token if its type is contained in the stopTypes 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
useWhiteList	TokenNameIdentifier	 use White List
==	TokenNameEQUAL_EQUAL	
stopTypes	TokenNameIdentifier	 stop Types
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
typeAttribute	TokenNameIdentifier	 type Attribute
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
