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
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
import	TokenNameimport	
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
JapaneseTokenizer	TokenNameIdentifier	 Japanese Tokenizer
.	TokenNameDOT	
Position	TokenNameIdentifier	 Position
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
JapaneseTokenizer	TokenNameIdentifier	 Japanese Tokenizer
.	TokenNameDOT	
WrappedPositionArray	TokenNameIdentifier	 Wrapped Position Array
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
ConnectionCosts	TokenNameIdentifier	 Connection Costs
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
Dictionary	TokenNameIdentifier	 Dictionary
;	TokenNameSEMICOLON	
// TODO: would be nice to show 2nd best path in a diff't 	TokenNameCOMMENT_LINE	TODO: would be nice to show 2nd best path in a diff't 
// color... 	TokenNameCOMMENT_LINE	color... 
/** * Outputs the dot (graphviz) string for the viterbi lattice. */	TokenNameCOMMENT_JAVADOC	 Outputs the dot (graphviz) string for the viterbi lattice. 
public	TokenNamepublic	
class	TokenNameclass	
GraphvizFormatter	TokenNameIdentifier	 Graphviz Formatter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
BOS_LABEL	TokenNameIdentifier	 BOS  LABEL
=	TokenNameEQUAL	
"BOS"	TokenNameStringLiteral	BOS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
EOS_LABEL	TokenNameIdentifier	 EOS  LABEL
=	TokenNameEQUAL	
"EOS"	TokenNameStringLiteral	EOS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
FONT_NAME	TokenNameIdentifier	 FONT  NAME
=	TokenNameEQUAL	
"Helvetica"	TokenNameStringLiteral	Helvetica
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ConnectionCosts	TokenNameIdentifier	 Connection Costs
costs	TokenNameIdentifier	 costs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
bestPathMap	TokenNameIdentifier	 best Path Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GraphvizFormatter	TokenNameIdentifier	 Graphviz Formatter
(	TokenNameLPAREN	
ConnectionCosts	TokenNameIdentifier	 Connection Costs
costs	TokenNameIdentifier	 costs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
costs	TokenNameIdentifier	 costs
=	TokenNameEQUAL	
costs	TokenNameIdentifier	 costs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bestPathMap	TokenNameIdentifier	 best Path Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatHeader	TokenNameIdentifier	 format Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" init [style=invis] "	TokenNameStringLiteral	 init [style=invis] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" init -> 0.0 [label=""	TokenNameStringLiteral	 init -> 0.0 [label="
+	TokenNamePLUS	
BOS_LABEL	TokenNameIdentifier	 BOS  LABEL
+	TokenNamePLUS	
""] "	TokenNameStringLiteral	"] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatTrailer	TokenNameIdentifier	 format Trailer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Backtraces another incremental fragment: 	TokenNameCOMMENT_LINE	Backtraces another incremental fragment: 
void	TokenNamevoid	
onBacktrace	TokenNameIdentifier	 on Backtrace
(	TokenNameLPAREN	
JapaneseTokenizer	TokenNameIdentifier	 Japanese Tokenizer
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
WrappedPositionArray	TokenNameIdentifier	 Wrapped Position Array
positions	TokenNameIdentifier	 positions
,	TokenNameCOMMA	
int	TokenNameint	
lastBackTracePos	TokenNameIdentifier	 last Back Trace Pos
,	TokenNameCOMMA	
Position	TokenNameIdentifier	 Position
endPosData	TokenNameIdentifier	 end Pos Data
,	TokenNameCOMMA	
int	TokenNameint	
fromIDX	TokenNameIdentifier	 from IDX
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fragment	TokenNameIdentifier	 fragment
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isEnd	TokenNameIdentifier	 is End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setBestPathMap	TokenNameIdentifier	 set Best Path Map
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
,	TokenNameCOMMA	
lastBackTracePos	TokenNameIdentifier	 last Back Trace Pos
,	TokenNameCOMMA	
endPosData	TokenNameIdentifier	 end Pos Data
,	TokenNameCOMMA	
fromIDX	TokenNameIdentifier	 from IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatNodes	TokenNameIdentifier	 format Nodes
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
positions	TokenNameIdentifier	 positions
,	TokenNameCOMMA	
lastBackTracePos	TokenNameIdentifier	 last Back Trace Pos
,	TokenNameCOMMA	
endPosData	TokenNameIdentifier	 end Pos Data
,	TokenNameCOMMA	
fragment	TokenNameIdentifier	 fragment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEnd	TokenNameIdentifier	 is End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" fini [style=invis] "	TokenNameStringLiteral	 fini [style=invis] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getNodeID	TokenNameIdentifier	 get Node ID
(	TokenNameLPAREN	
endPosData	TokenNameIdentifier	 end Pos Data
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
fromIDX	TokenNameIdentifier	 from IDX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" -> fini [label=""	TokenNameStringLiteral	 -> fini [label="
+	TokenNamePLUS	
EOS_LABEL	TokenNameIdentifier	 EOS  LABEL
+	TokenNamePLUS	
""]"	TokenNameStringLiteral	"]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Records which arcs make up the best bath: 	TokenNameCOMMENT_LINE	Records which arcs make up the best bath: 
private	TokenNameprivate	
void	TokenNamevoid	
setBestPathMap	TokenNameIdentifier	 set Best Path Map
(	TokenNameLPAREN	
WrappedPositionArray	TokenNameIdentifier	 Wrapped Position Array
positions	TokenNameIdentifier	 positions
,	TokenNameCOMMA	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
,	TokenNameCOMMA	
Position	TokenNameIdentifier	 Position
endPosData	TokenNameIdentifier	 end Pos Data
,	TokenNameCOMMA	
int	TokenNameint	
fromIDX	TokenNameIdentifier	 from IDX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestPathMap	TokenNameIdentifier	 best Path Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
endPosData	TokenNameIdentifier	 end Pos Data
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
int	TokenNameint	
bestIDX	TokenNameIdentifier	 best IDX
=	TokenNameEQUAL	
fromIDX	TokenNameIdentifier	 from IDX
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Position	TokenNameIdentifier	 Position
posData	TokenNameIdentifier	 pos Data
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
backPos	TokenNameIdentifier	 back Pos
=	TokenNameEQUAL	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backPos	TokenNameIdentifier	 back Pos
[	TokenNameLBRACKET	
bestIDX	TokenNameIdentifier	 best IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
backIDX	TokenNameIdentifier	 back IDX
=	TokenNameEQUAL	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backIndex	TokenNameIdentifier	 back Index
[	TokenNameLBRACKET	
bestIDX	TokenNameIdentifier	 best IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toNodeID	TokenNameIdentifier	 to Node ID
=	TokenNameEQUAL	
getNodeID	TokenNameIdentifier	 get Node ID
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
bestIDX	TokenNameIdentifier	 best IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fromNodeID	TokenNameIdentifier	 from Node ID
=	TokenNameEQUAL	
getNodeID	TokenNameIdentifier	 get Node ID
(	TokenNameLPAREN	
backPos	TokenNameIdentifier	 back Pos
,	TokenNameCOMMA	
backIDX	TokenNameIdentifier	 back IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
bestPathMap	TokenNameIdentifier	 best Path Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
fromNodeID	TokenNameIdentifier	 from Node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
bestPathMap	TokenNameIdentifier	 best Path Map
.	TokenNameDOT	
containsValue	TokenNameIdentifier	 contains Value
(	TokenNameLPAREN	
toNodeID	TokenNameIdentifier	 to Node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bestPathMap	TokenNameIdentifier	 best Path Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fromNodeID	TokenNameIdentifier	 from Node ID
,	TokenNameCOMMA	
toNodeID	TokenNameIdentifier	 to Node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
backPos	TokenNameIdentifier	 back Pos
;	TokenNameSEMICOLON	
bestIDX	TokenNameIdentifier	 best IDX
=	TokenNameEQUAL	
backIDX	TokenNameIdentifier	 back IDX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
formatNodes	TokenNameIdentifier	 format Nodes
(	TokenNameLPAREN	
JapaneseTokenizer	TokenNameIdentifier	 Japanese Tokenizer
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
WrappedPositionArray	TokenNameIdentifier	 Wrapped Position Array
positions	TokenNameIdentifier	 positions
,	TokenNameCOMMA	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
,	TokenNameCOMMA	
Position	TokenNameIdentifier	 Position
endPosData	TokenNameIdentifier	 end Pos Data
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fragment	TokenNameIdentifier	 fragment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Output nodes 	TokenNameCOMMENT_LINE	Output nodes 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
startPos	TokenNameIdentifier	 start Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<=	TokenNameLESS_EQUAL	
endPosData	TokenNameIdentifier	 end Pos Data
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Position	TokenNameIdentifier	 Position
posData	TokenNameIdentifier	 pos Data
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getNodeID	TokenNameIdentifier	 get Node ID
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" [label=""	TokenNameStringLiteral	 [label="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
lastRightID	TokenNameIdentifier	 last Right ID
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
""] "	TokenNameStringLiteral	"] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Output arcs 	TokenNameCOMMENT_LINE	Output arcs 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
endPosData	TokenNameIdentifier	 end Pos Data
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
startPos	TokenNameIdentifier	 start Pos
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Position	TokenNameIdentifier	 Position
posData	TokenNameIdentifier	 pos Data
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Position	TokenNameIdentifier	 Position
backPosData	TokenNameIdentifier	 back Pos Data
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backPos	TokenNameIdentifier	 back Pos
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toNodeID	TokenNameIdentifier	 to Node ID
=	TokenNameEQUAL	
getNodeID	TokenNameIdentifier	 get Node ID
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fromNodeID	TokenNameIdentifier	 from Node ID
=	TokenNameEQUAL	
getNodeID	TokenNameIdentifier	 get Node ID
(	TokenNameLPAREN	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backPos	TokenNameIdentifier	 back Pos
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backIndex	TokenNameIdentifier	 back Index
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fromNodeID	TokenNameIdentifier	 from Node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" -> "	TokenNameStringLiteral	 -> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
toNodeID	TokenNameIdentifier	 to Node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
attrs	TokenNameIdentifier	 attrs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toNodeID	TokenNameIdentifier	 to Node ID
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
bestPathMap	TokenNameIdentifier	 best Path Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fromNodeID	TokenNameIdentifier	 from Node ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This arc is on best path 	TokenNameCOMMENT_LINE	This arc is on best path 
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
" color="#40e050" fontcolor="#40a050" penwidth=3 fontsize=20"	TokenNameStringLiteral	 color="#40e050" fontcolor="#40a050" penwidth=3 fontsize=20
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Dictionary	TokenNameIdentifier	 Dictionary
dict	TokenNameIdentifier	 dict
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getDict	TokenNameIdentifier	 get Dict
(	TokenNameLPAREN	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backType	TokenNameIdentifier	 back Type
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
wordCost	TokenNameIdentifier	 word Cost
=	TokenNameEQUAL	
dict	TokenNameIdentifier	 dict
.	TokenNameDOT	
getWordCost	TokenNameIdentifier	 get Word Cost
(	TokenNameLPAREN	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backID	TokenNameIdentifier	 back ID
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
bgCost	TokenNameIdentifier	 bg Cost
=	TokenNameEQUAL	
costs	TokenNameIdentifier	 costs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
backPosData	TokenNameIdentifier	 back Pos Data
.	TokenNameDOT	
lastRightID	TokenNameIdentifier	 last Right ID
[	TokenNameLBRACKET	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backIndex	TokenNameIdentifier	 back Index
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
dict	TokenNameIdentifier	 dict
.	TokenNameDOT	
getLeftId	TokenNameIdentifier	 get Left Id
(	TokenNameLPAREN	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backID	TokenNameIdentifier	 back ID
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
surfaceForm	TokenNameIdentifier	 surface Form
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
fragment	TokenNameIdentifier	 fragment
,	TokenNameCOMMA	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backPos	TokenNameIdentifier	 back Pos
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
-	TokenNameMINUS	
startPos	TokenNameIdentifier	 start Pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
posData	TokenNameIdentifier	 pos Data
.	TokenNameDOT	
backPos	TokenNameIdentifier	 back Pos
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" [label=""	TokenNameStringLiteral	 [label="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
surfaceForm	TokenNameIdentifier	 surface Form
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
wordCost	TokenNameIdentifier	 word Cost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bgCost	TokenNameIdentifier	 bg Cost
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
bgCost	TokenNameIdentifier	 bg Cost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
formatHeader	TokenNameIdentifier	 format Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"digraph viterbi { "	TokenNameStringLiteral	digraph viterbi { 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" graph [ fontsize=30 labelloc="t" label="" splines=true overlap=false rankdir = "LR"]; "	TokenNameStringLiteral	 graph [ fontsize=30 labelloc="t" label="" splines=true overlap=false rankdir = "LR"]; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//sb.append(" // A2 paper size\n"); 	TokenNameCOMMENT_LINE	sb.append(" // A2 paper size\n"); 
//sb.append(" size = \"34.4,16.5\";\n"); 	TokenNameCOMMENT_LINE	sb.append(" size = \"34.4,16.5\";\n"); 
//sb.append(" // try to fill paper\n"); 	TokenNameCOMMENT_LINE	sb.append(" // try to fill paper\n"); 
//sb.append(" ratio = fill;\n"); 	TokenNameCOMMENT_LINE	sb.append(" ratio = fill;\n"); 
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" edge [ fontname=""	TokenNameStringLiteral	 edge [ fontname="
+	TokenNamePLUS	
FONT_NAME	TokenNameIdentifier	 FONT  NAME
+	TokenNamePLUS	
"" fontcolor="red" color="#606060" ] "	TokenNameStringLiteral	" fontcolor="red" color="#606060" ] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" node [ style="filled" fillcolor="#e8e8f0" shape="Mrecord" fontname=""	TokenNameStringLiteral	 node [ style="filled" fillcolor="#e8e8f0" shape="Mrecord" fontname="
+	TokenNamePLUS	
FONT_NAME	TokenNameIdentifier	 FONT  NAME
+	TokenNamePLUS	
"" ] "	TokenNameStringLiteral	" ] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
formatTrailer	TokenNameIdentifier	 format Trailer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"}"	TokenNameStringLiteral	}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getNodeID	TokenNameIdentifier	 get Node ID
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
