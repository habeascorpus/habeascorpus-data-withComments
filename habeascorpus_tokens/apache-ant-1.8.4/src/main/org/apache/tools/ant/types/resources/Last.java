/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
ResourceCollection	TokenNameIdentifier	 Resource Collection
;	TokenNameSEMICOLON	
/** * ResourceCollection that contains the last <code>count</code> elements of * another ResourceCollection, a la the UNIX tail command. * @since Ant 1.7.1 */	TokenNameCOMMENT_JAVADOC	 ResourceCollection that contains the last <code>count</code> elements of another ResourceCollection, a la the UNIX tail command. @since Ant 1.7.1 
public	TokenNamepublic	
class	TokenNameclass	
Last	TokenNameIdentifier	 Last
extends	TokenNameextends	
SizeLimitCollection	TokenNameIdentifier	 Size Limit Collection
{	TokenNameLBRACE	
/** * Take the last <code>count</code> elements. * @return a Collection of Resources. */	TokenNameCOMMENT_JAVADOC	 Take the last <code>count</code> elements. @return a Collection of Resources. 
protected	TokenNameprotected	
Collection	TokenNameIdentifier	 Collection
getCollection	TokenNameIdentifier	 get Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
getValidCount	TokenNameIdentifier	 get Valid Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResourceCollection	TokenNameIdentifier	 Resource Collection
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
getResourceCollection	TokenNameIdentifier	 get Resource Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
al	TokenNameIdentifier	 al
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
al	TokenNameIdentifier	 al
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
al	TokenNameIdentifier	 al
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
==	TokenNameEQUAL_EQUAL	
count	TokenNameIdentifier	 count
||	TokenNameOR_OR	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
count	TokenNameIdentifier	 count
&&	TokenNameAND_AND	
found	TokenNameIdentifier	 found
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
al	TokenNameIdentifier	 al
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//mismatch: 	TokenNameCOMMENT_LINE	mismatch: 
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Resource collection "	TokenNameStringLiteral	Resource collection 
+	TokenNamePLUS	
rc	TokenNameIdentifier	 rc
+	TokenNamePLUS	
" reports size "	TokenNameStringLiteral	 reports size 
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
" but returns "	TokenNameStringLiteral	 but returns 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" elements."	TokenNameStringLiteral	 elements.
;	TokenNameSEMICOLON	
//size was understated -> too many results; warn and continue: 	TokenNameCOMMENT_LINE	size was understated -> too many results; warn and continue: 
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
>	TokenNameGREATER	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
al	TokenNameIdentifier	 al
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
-	TokenNameMINUS	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//size was overstated; we missed some and are now in error-land: 	TokenNameCOMMENT_LINE	size was overstated; we missed some and are now in error-land: 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
