package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
vectorhighlight	TokenNameIdentifier	 vectorhighlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
BreakIterator	TokenNameIdentifier	 Break Iterator
;	TokenNameSEMICOLON	
/** * A {@link BoundaryScanner} implementation that uses {@link BreakIterator} to find * boundaries in the text. * @see BreakIterator */	TokenNameCOMMENT_JAVADOC	 A {@link BoundaryScanner} implementation that uses {@link BreakIterator} to find boundaries in the text. @see BreakIterator 
public	TokenNamepublic	
class	TokenNameclass	
BreakIteratorBoundaryScanner	TokenNameIdentifier	 Break Iterator Boundary Scanner
implements	TokenNameimplements	
BoundaryScanner	TokenNameIdentifier	 Boundary Scanner
{	TokenNameLBRACE	
final	TokenNamefinal	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BreakIteratorBoundaryScanner	TokenNameIdentifier	 Break Iterator Boundary Scanner
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
findStartOffset	TokenNameIdentifier	 find Start Offset
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// avoid illegal start offset 	TokenNameCOMMENT_LINE	avoid illegal start offset 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>	TokenNameGREATER	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
findEndOffset	TokenNameIdentifier	 find End Offset
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// avoid illegal start offset 	TokenNameCOMMENT_LINE	avoid illegal start offset 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>	TokenNameGREATER	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
