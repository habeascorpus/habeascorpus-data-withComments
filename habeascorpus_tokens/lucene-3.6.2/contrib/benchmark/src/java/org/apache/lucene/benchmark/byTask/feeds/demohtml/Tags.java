package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
feeds	TokenNameIdentifier	 feeds
.	TokenNameDOT	
demohtml	TokenNameIdentifier	 demohtml
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Tags	TokenNameIdentifier	 Tags
{	TokenNameLBRACE	
/** * contains all tags for which whitespaces have to be inserted for proper tokenization */	TokenNameCOMMENT_JAVADOC	 contains all tags for which whitespaces have to be inserted for proper tokenization 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<hr"	TokenNameStringLiteral	<hr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<hr/"	TokenNameStringLiteral	<hr/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// note that "<hr />" does not need to be listed explicitly 	TokenNameCOMMENT_LINE	note that "<hr />" does not need to be listed explicitly 
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<br"	TokenNameStringLiteral	<br
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<br/"	TokenNameStringLiteral	<br/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<p"	TokenNameStringLiteral	<p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</p"	TokenNameStringLiteral	</p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<div"	TokenNameStringLiteral	<div
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</div"	TokenNameStringLiteral	</div
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<td"	TokenNameStringLiteral	<td
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</td"	TokenNameStringLiteral	</td
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<li"	TokenNameStringLiteral	<li
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</li"	TokenNameStringLiteral	</li
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<q"	TokenNameStringLiteral	<q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</q"	TokenNameStringLiteral	</q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<blockquote"	TokenNameStringLiteral	<blockquote
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</blockquote"	TokenNameStringLiteral	</blockquote
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<dt"	TokenNameStringLiteral	<dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</dt"	TokenNameStringLiteral	</dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<h1"	TokenNameStringLiteral	<h1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</h1"	TokenNameStringLiteral	</h1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<h2"	TokenNameStringLiteral	<h2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</h2"	TokenNameStringLiteral	</h2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<h3"	TokenNameStringLiteral	<h3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</h3"	TokenNameStringLiteral	</h3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<h4"	TokenNameStringLiteral	<h4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</h4"	TokenNameStringLiteral	</h4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<h5"	TokenNameStringLiteral	<h5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</h5"	TokenNameStringLiteral	</h5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"<h6"	TokenNameStringLiteral	<h6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WS_ELEMS	TokenNameIdentifier	 WS  ELEMS
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"</h6"	TokenNameStringLiteral	</h6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
