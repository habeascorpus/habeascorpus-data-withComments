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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PriorityQueue	TokenNameIdentifier	 Priority Queue
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
PhraseQueue	TokenNameIdentifier	 Phrase Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>	TokenNameGREATER	
{	TokenNameLBRACE	
PhraseQueue	TokenNameIdentifier	 Phrase Queue
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp1	TokenNameIdentifier	 pp1
,	TokenNameCOMMA	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp2	TokenNameIdentifier	 pp2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pp1	TokenNameIdentifier	 pp1
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
pp1	TokenNameIdentifier	 pp1
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
// same doc and pp.position, so decide by actual term positions. 	TokenNameCOMMENT_LINE	same doc and pp.position, so decide by actual term positions. 
// rely on: pp.position == tp.position - offset. 	TokenNameCOMMENT_LINE	rely on: pp.position == tp.position - offset. 
if	TokenNameif	
(	TokenNameLPAREN	
pp1	TokenNameIdentifier	 pp1
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pp1	TokenNameIdentifier	 pp1
.	TokenNameDOT	
ord	TokenNameIdentifier	 ord
<	TokenNameLESS	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
pp1	TokenNameIdentifier	 pp1
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
pp1	TokenNameIdentifier	 pp1
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
pp1	TokenNameIdentifier	 pp1
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
