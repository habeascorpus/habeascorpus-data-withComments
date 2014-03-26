/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Holds a map of String input to String output, to be used * with {@link MappingCharFilter}. */	TokenNameCOMMENT_JAVADOC	 Holds a map of String input to String output, to be used with {@link MappingCharFilter}. 
public	TokenNamepublic	
class	TokenNameclass	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
,	TokenNameCOMMA	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
>	TokenNameGREATER	
submap	TokenNameIdentifier	 submap
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
normStr	TokenNameIdentifier	 norm Str
;	TokenNameSEMICOLON	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
/** Records a replacement to be applied to the inputs * stream. Whenever <code>singleMatch</code> occurs in * the input, it will be replaced with * <code>replacement</code>. * * @param singleMatch input String to be replaced * @param replacement output String */	TokenNameCOMMENT_JAVADOC	 Records a replacement to be applied to the inputs stream. Whenever <code>singleMatch</code> occurs in the input, it will be replaced with <code>replacement</code>. * @param singleMatch input String to be replaced @param replacement output String 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
singleMatch	TokenNameIdentifier	 single Match
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
currMap	TokenNameIdentifier	 curr Map
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
singleMatch	TokenNameIdentifier	 single Match
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
singleMatch	TokenNameIdentifier	 single Match
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
submap	TokenNameIdentifier	 submap
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
submap	TokenNameIdentifier	 submap
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
,	TokenNameCOMMA	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
>	TokenNameGREATER	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
submap	TokenNameIdentifier	 submap
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
submap	TokenNameIdentifier	 submap
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currMap	TokenNameIdentifier	 curr Map
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
normStr	TokenNameIdentifier	 norm Str
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"MappingCharFilter: there is already a mapping for "	TokenNameStringLiteral	MappingCharFilter: there is already a mapping for 
+	TokenNamePLUS	
singleMatch	TokenNameIdentifier	 single Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
normStr	TokenNameIdentifier	 norm Str
=	TokenNameEQUAL	
replacement	TokenNameIdentifier	 replacement
;	TokenNameSEMICOLON	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
singleMatch	TokenNameIdentifier	 single Match
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
