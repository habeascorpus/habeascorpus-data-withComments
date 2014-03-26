package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
;	TokenNameSEMICOLON	
/** Consumes a TokenStream and outputs the dot (graphviz) string (graph). */	TokenNameCOMMENT_JAVADOC	 Consumes a TokenStream and outputs the dot (graphviz) string (graph). 
public	TokenNamepublic	
class	TokenNameclass	
TokenStreamToDot	TokenNameIdentifier	 Token Stream To Dot
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncAtt	TokenNameIdentifier	 pos Inc Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
posLengthAtt	TokenNameIdentifier	 pos Length Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
inputText	TokenNameIdentifier	 input Text
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
/** If inputText is non-null, and the TokenStream has * offsets, we include the surface form in each arc's * label. */	TokenNameCOMMENT_JAVADOC	 If inputText is non-null, and the TokenStream has offsets, we include the surface form in each arc's label. 
public	TokenNamepublic	
TokenStreamToDot	TokenNameIdentifier	 Token Stream To Dot
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inputText	TokenNameIdentifier	 input Text
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inputText	TokenNameIdentifier	 input Text
=	TokenNameEQUAL	
inputText	TokenNameIdentifier	 input Text
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncAtt	TokenNameIdentifier	 pos Inc Att
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posLengthAtt	TokenNameIdentifier	 pos Length Att
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
toDot	TokenNameIdentifier	 to Dot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: is there some way to tell dot that it should 	TokenNameCOMMENT_LINE	TODO: is there some way to tell dot that it should 
// make the "main path" a straight line and have the 	TokenNameCOMMENT_LINE	make the "main path" a straight line and have the 
// non-sausage arcs not affect node placement... 	TokenNameCOMMENT_LINE	non-sausage arcs not affect node placement... 
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastEndPos	TokenNameIdentifier	 last End Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
isFirst	TokenNameIdentifier	 is First
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
posInc	TokenNameIdentifier	 pos Inc
=	TokenNameEQUAL	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isFirst	TokenNameIdentifier	 is First
&&	TokenNameAND_AND	
posInc	TokenNameIdentifier	 pos Inc
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: hmm are TS's still allowed to do this...? 	TokenNameCOMMENT_LINE	TODO: hmm are TS's still allowed to do this...? 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARNING: first posInc was 0; correcting to 1"	TokenNameStringLiteral	WARNING: first posInc was 0; correcting to 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posInc	TokenNameIdentifier	 pos Inc
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
posInc	TokenNameIdentifier	 pos Inc
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// New node: 	TokenNameCOMMENT_LINE	New node: 
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
posInc	TokenNameIdentifier	 pos Inc
;	TokenNameSEMICOLON	
writeNode	TokenNameIdentifier	 write Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
posInc	TokenNameIdentifier	 pos Inc
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Gap! 	TokenNameCOMMENT_LINE	Gap! 
writeArc	TokenNameIdentifier	 write Arc
(	TokenNameLPAREN	
lastEndPos	TokenNameIdentifier	 last End Pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"dotted"	TokenNameStringLiteral	dotted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isFirst	TokenNameIdentifier	 is First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeNode	TokenNameIdentifier	 write Node
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeArc	TokenNameIdentifier	 write Arc
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
arcLabel	TokenNameIdentifier	 arc Label
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("start=" + startOffset + " end=" + endOffset + " len=" + inputText.length()); 	TokenNameCOMMENT_LINE	System.out.println("start=" + startOffset + " end=" + endOffset + " len=" + inputText.length()); 
if	TokenNameif	
(	TokenNameLPAREN	
inputText	TokenNameIdentifier	 input Text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arcLabel	TokenNameIdentifier	 arc Label
+=	TokenNamePLUS_EQUAL	
" / "	TokenNameStringLiteral	 / 
+	TokenNamePLUS	
inputText	TokenNameIdentifier	 input Text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
arcLabel	TokenNameIdentifier	 arc Label
+=	TokenNamePLUS_EQUAL	
" / "	TokenNameStringLiteral	 / 
+	TokenNamePLUS	
startOffset	TokenNameIdentifier	 start Offset
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
writeArc	TokenNameIdentifier	 write Arc
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
posLengthAtt	TokenNameIdentifier	 pos Length Att
.	TokenNameDOT	
getPositionLength	TokenNameIdentifier	 get Position Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
arcLabel	TokenNameIdentifier	 arc Label
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastEndPos	TokenNameIdentifier	 last End Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
posLengthAtt	TokenNameIdentifier	 pos Length Att
.	TokenNameDOT	
getPositionLength	TokenNameIdentifier	 get Position Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastEndPos	TokenNameIdentifier	 last End Pos
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: should we output any final text (from end 	TokenNameCOMMENT_LINE	TODO: should we output any final text (from end 
// offsets) on this arc...? 	TokenNameCOMMENT_LINE	offsets) on this arc...? 
writeNode	TokenNameIdentifier	 write Node
(	TokenNameLPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeArc	TokenNameIdentifier	 write Arc
(	TokenNameLPAREN	
lastEndPos	TokenNameIdentifier	 last End Pos
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeTrailer	TokenNameIdentifier	 write Trailer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
writeArc	TokenNameIdentifier	 write Arc
(	TokenNameLPAREN	
int	TokenNameint	
fromNode	TokenNameIdentifier	 from Node
,	TokenNameCOMMA	
int	TokenNameint	
toNode	TokenNameIdentifier	 to Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
style	TokenNameIdentifier	 style
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
fromNode	TokenNameIdentifier	 from Node
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
toNode	TokenNameIdentifier	 to Node
+	TokenNamePLUS	
" ["	TokenNameStringLiteral	 [
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" label=""	TokenNameStringLiteral	 label="
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
style	TokenNameIdentifier	 style
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" style=""	TokenNameStringLiteral	 style="
+	TokenNamePLUS	
style	TokenNameIdentifier	 style
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
writeNode	TokenNameIdentifier	 write Node
(	TokenNameLPAREN	
int	TokenNameint	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" [label=""	TokenNameStringLiteral	 [label="
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
+	TokenNamePLUS	
""]"	TokenNameStringLiteral	"]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" [shape=point color=white]"	TokenNameStringLiteral	 [shape=point color=white]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
FONT_NAME	TokenNameIdentifier	 FONT  NAME
=	TokenNameEQUAL	
"Helvetica"	TokenNameStringLiteral	Helvetica
;	TokenNameSEMICOLON	
/** Override to customize. */	TokenNameCOMMENT_JAVADOC	 Override to customize. 
protected	TokenNameprotected	
void	TokenNamevoid	
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"digraph tokens {"	TokenNameStringLiteral	digraph tokens {
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" graph [ fontsize=30 labelloc="t" label="" splines=true overlap=false rankdir = "LR" ];"	TokenNameStringLiteral	 graph [ fontsize=30 labelloc="t" label="" splines=true overlap=false rankdir = "LR" ];
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" // A2 paper size"	TokenNameStringLiteral	 // A2 paper size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" size = "34.4,16.5";"	TokenNameStringLiteral	 size = "34.4,16.5";
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//out.println(" // try to fill paper"); 	TokenNameCOMMENT_LINE	out.println(" // try to fill paper"); 
//out.println(" ratio = fill;"); 	TokenNameCOMMENT_LINE	out.println(" ratio = fill;"); 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" edge [ fontname=""	TokenNameStringLiteral	 edge [ fontname="
+	TokenNamePLUS	
FONT_NAME	TokenNameIdentifier	 FONT  NAME
+	TokenNamePLUS	
"" fontcolor="red" color="#606060" ]"	TokenNameStringLiteral	" fontcolor="red" color="#606060" ]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" node [ style="filled" fillcolor="#e8e8f0" shape="Mrecord" fontname=""	TokenNameStringLiteral	 node [ style="filled" fillcolor="#e8e8f0" shape="Mrecord" fontname="
+	TokenNamePLUS	
FONT_NAME	TokenNameIdentifier	 FONT  NAME
+	TokenNamePLUS	
"" ]"	TokenNameStringLiteral	" ]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Override to customize. */	TokenNameCOMMENT_JAVADOC	 Override to customize. 
protected	TokenNameprotected	
void	TokenNamevoid	
writeTrailer	TokenNameIdentifier	 write Trailer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
