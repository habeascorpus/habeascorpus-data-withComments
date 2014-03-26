package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
highlight	TokenNameIdentifier	 highlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Formats text with different color intensity depending on the score of the * term. * */	TokenNameCOMMENT_JAVADOC	 Formats text with different color intensity depending on the score of the term. 
public	TokenNamepublic	
class	TokenNameclass	
GradientFormatter	TokenNameIdentifier	 Gradient Formatter
implements	TokenNameimplements	
Formatter	TokenNameIdentifier	 Formatter
{	TokenNameLBRACE	
private	TokenNameprivate	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
;	TokenNameSEMICOLON	
int	TokenNameint	
fgRMin	TokenNameIdentifier	 fg R Min
,	TokenNameCOMMA	
fgGMin	TokenNameIdentifier	 fg G Min
,	TokenNameCOMMA	
fgBMin	TokenNameIdentifier	 fg B Min
;	TokenNameSEMICOLON	
int	TokenNameint	
fgRMax	TokenNameIdentifier	 fg R Max
,	TokenNameCOMMA	
fgGMax	TokenNameIdentifier	 fg G Max
,	TokenNameCOMMA	
fgBMax	TokenNameIdentifier	 fg B Max
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
highlightForeground	TokenNameIdentifier	 highlight Foreground
;	TokenNameSEMICOLON	
int	TokenNameint	
bgRMin	TokenNameIdentifier	 bg R Min
,	TokenNameCOMMA	
bgGMin	TokenNameIdentifier	 bg G Min
,	TokenNameCOMMA	
bgBMin	TokenNameIdentifier	 bg B Min
;	TokenNameSEMICOLON	
int	TokenNameint	
bgRMax	TokenNameIdentifier	 bg R Max
,	TokenNameCOMMA	
bgGMax	TokenNameIdentifier	 bg G Max
,	TokenNameCOMMA	
bgBMax	TokenNameIdentifier	 bg B Max
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
highlightBackground	TokenNameIdentifier	 highlight Background
;	TokenNameSEMICOLON	
/** * Sets the color range for the IDF scores * * @param maxScore * The score (and above) displayed as maxColor (See QueryScorer.getMaxWeight * which can be used to calibrate scoring scale) * @param minForegroundColor * The hex color used for representing IDF scores of zero eg * #FFFFFF (white) or null if no foreground color required * @param maxForegroundColor * The largest hex color used for representing IDF scores eg * #000000 (black) or null if no foreground color required * @param minBackgroundColor * The hex color used for representing IDF scores of zero eg * #FFFFFF (white) or null if no background color required * @param maxBackgroundColor * The largest hex color used for representing IDF scores eg * #000000 (black) or null if no background color required */	TokenNameCOMMENT_JAVADOC	 Sets the color range for the IDF scores * @param maxScore The score (and above) displayed as maxColor (See QueryScorer.getMaxWeight which can be used to calibrate scoring scale) @param minForegroundColor The hex color used for representing IDF scores of zero eg #FFFFFF (white) or null if no foreground color required @param maxForegroundColor The largest hex color used for representing IDF scores eg #000000 (black) or null if no foreground color required @param minBackgroundColor The hex color used for representing IDF scores of zero eg #FFFFFF (white) or null if no background color required @param maxBackgroundColor The largest hex color used for representing IDF scores eg #000000 (black) or null if no background color required 
public	TokenNamepublic	
GradientFormatter	TokenNameIdentifier	 Gradient Formatter
(	TokenNameLPAREN	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
minForegroundColor	TokenNameIdentifier	 min Foreground Color
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
maxForegroundColor	TokenNameIdentifier	 max Foreground Color
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
minBackgroundColor	TokenNameIdentifier	 min Background Color
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
maxBackgroundColor	TokenNameIdentifier	 max Background Color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
highlightForeground	TokenNameIdentifier	 highlight Foreground
=	TokenNameEQUAL	
(	TokenNameLPAREN	
minForegroundColor	TokenNameIdentifier	 min Foreground Color
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
maxForegroundColor	TokenNameIdentifier	 max Foreground Color
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
highlightForeground	TokenNameIdentifier	 highlight Foreground
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minForegroundColor	TokenNameIdentifier	 min Foreground Color
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minForegroundColor is not 7 bytes long eg a hex "	TokenNameStringLiteral	minForegroundColor is not 7 bytes long eg a hex 
+	TokenNamePLUS	
"RGB value such as #FFFFFF"	TokenNameStringLiteral	RGB value such as #FFFFFF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxForegroundColor	TokenNameIdentifier	 max Foreground Color
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minForegroundColor is not 7 bytes long eg a hex "	TokenNameStringLiteral	minForegroundColor is not 7 bytes long eg a hex 
+	TokenNamePLUS	
"RGB value such as #FFFFFF"	TokenNameStringLiteral	RGB value such as #FFFFFF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fgRMin	TokenNameIdentifier	 fg R Min
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
minForegroundColor	TokenNameIdentifier	 min Foreground Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgGMin	TokenNameIdentifier	 fg G Min
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
minForegroundColor	TokenNameIdentifier	 min Foreground Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgBMin	TokenNameIdentifier	 fg B Min
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
minForegroundColor	TokenNameIdentifier	 min Foreground Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgRMax	TokenNameIdentifier	 fg R Max
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
maxForegroundColor	TokenNameIdentifier	 max Foreground Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgGMax	TokenNameIdentifier	 fg G Max
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
maxForegroundColor	TokenNameIdentifier	 max Foreground Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgBMax	TokenNameIdentifier	 fg B Max
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
maxForegroundColor	TokenNameIdentifier	 max Foreground Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
highlightBackground	TokenNameIdentifier	 highlight Background
=	TokenNameEQUAL	
(	TokenNameLPAREN	
minBackgroundColor	TokenNameIdentifier	 min Background Color
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
maxBackgroundColor	TokenNameIdentifier	 max Background Color
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
highlightBackground	TokenNameIdentifier	 highlight Background
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minBackgroundColor	TokenNameIdentifier	 min Background Color
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minBackgroundColor is not 7 bytes long eg a hex "	TokenNameStringLiteral	minBackgroundColor is not 7 bytes long eg a hex 
+	TokenNamePLUS	
"RGB value such as #FFFFFF"	TokenNameStringLiteral	RGB value such as #FFFFFF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxBackgroundColor	TokenNameIdentifier	 max Background Color
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minBackgroundColor is not 7 bytes long eg a hex "	TokenNameStringLiteral	minBackgroundColor is not 7 bytes long eg a hex 
+	TokenNamePLUS	
"RGB value such as #FFFFFF"	TokenNameStringLiteral	RGB value such as #FFFFFF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bgRMin	TokenNameIdentifier	 bg R Min
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
minBackgroundColor	TokenNameIdentifier	 min Background Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bgGMin	TokenNameIdentifier	 bg G Min
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
minBackgroundColor	TokenNameIdentifier	 min Background Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bgBMin	TokenNameIdentifier	 bg B Min
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
minBackgroundColor	TokenNameIdentifier	 min Background Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bgRMax	TokenNameIdentifier	 bg R Max
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
maxBackgroundColor	TokenNameIdentifier	 max Background Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bgGMax	TokenNameIdentifier	 bg G Max
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
maxBackgroundColor	TokenNameIdentifier	 max Background Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bgBMax	TokenNameIdentifier	 bg B Max
=	TokenNameEQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
maxBackgroundColor	TokenNameIdentifier	 max Background Color
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this.corpusReader = corpusReader; 	TokenNameCOMMENT_LINE	this.corpusReader = corpusReader; 
this	TokenNamethis	
.	TokenNameDOT	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
maxScore	TokenNameIdentifier	 max Score
;	TokenNameSEMICOLON	
// totalNumDocs = corpusReader.numDocs(); 	TokenNameCOMMENT_LINE	totalNumDocs = corpusReader.numDocs(); 
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
highlightTerm	TokenNameIdentifier	 highlight Term
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
originalText	TokenNameIdentifier	 original Text
,	TokenNameCOMMA	
TokenGroup	TokenNameIdentifier	 Token Group
tokenGroup	TokenNameIdentifier	 token Group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
getTotalScore	TokenNameIdentifier	 get Total Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
originalText	TokenNameIdentifier	 original Text
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
getTotalScore	TokenNameIdentifier	 get Total Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
originalText	TokenNameIdentifier	 original Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
"<font "	TokenNameStringLiteral	<font 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
highlightForeground	TokenNameIdentifier	 highlight Foreground
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"color=""	TokenNameStringLiteral	color="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getForegroundColorString	TokenNameIdentifier	 get Foreground Color String
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
highlightBackground	TokenNameIdentifier	 highlight Background
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"bgcolor=""	TokenNameStringLiteral	bgcolor="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getBackgroundColorString	TokenNameIdentifier	 get Background Color String
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
originalText	TokenNameIdentifier	 original Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</font>"	TokenNameStringLiteral	</font>
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
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getForegroundColorString	TokenNameIdentifier	 get Foreground Color String
(	TokenNameLPAREN	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
rVal	TokenNameIdentifier	 r Val
=	TokenNameEQUAL	
getColorVal	TokenNameIdentifier	 get Color Val
(	TokenNameLPAREN	
fgRMin	TokenNameIdentifier	 fg R Min
,	TokenNameCOMMA	
fgRMax	TokenNameIdentifier	 fg R Max
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
gVal	TokenNameIdentifier	 g Val
=	TokenNameEQUAL	
getColorVal	TokenNameIdentifier	 get Color Val
(	TokenNameLPAREN	
fgGMin	TokenNameIdentifier	 fg G Min
,	TokenNameCOMMA	
fgGMax	TokenNameIdentifier	 fg G Max
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bVal	TokenNameIdentifier	 b Val
=	TokenNameEQUAL	
getColorVal	TokenNameIdentifier	 get Color Val
(	TokenNameLPAREN	
fgBMin	TokenNameIdentifier	 fg B Min
,	TokenNameCOMMA	
fgBMax	TokenNameIdentifier	 fg B Max
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intToHex	TokenNameIdentifier	 int To Hex
(	TokenNameLPAREN	
rVal	TokenNameIdentifier	 r Val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intToHex	TokenNameIdentifier	 int To Hex
(	TokenNameLPAREN	
gVal	TokenNameIdentifier	 g Val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intToHex	TokenNameIdentifier	 int To Hex
(	TokenNameLPAREN	
bVal	TokenNameIdentifier	 b Val
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
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getBackgroundColorString	TokenNameIdentifier	 get Background Color String
(	TokenNameLPAREN	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
rVal	TokenNameIdentifier	 r Val
=	TokenNameEQUAL	
getColorVal	TokenNameIdentifier	 get Color Val
(	TokenNameLPAREN	
bgRMin	TokenNameIdentifier	 bg R Min
,	TokenNameCOMMA	
bgRMax	TokenNameIdentifier	 bg R Max
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
gVal	TokenNameIdentifier	 g Val
=	TokenNameEQUAL	
getColorVal	TokenNameIdentifier	 get Color Val
(	TokenNameLPAREN	
bgGMin	TokenNameIdentifier	 bg G Min
,	TokenNameCOMMA	
bgGMax	TokenNameIdentifier	 bg G Max
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bVal	TokenNameIdentifier	 b Val
=	TokenNameEQUAL	
getColorVal	TokenNameIdentifier	 get Color Val
(	TokenNameLPAREN	
bgBMin	TokenNameIdentifier	 bg B Min
,	TokenNameCOMMA	
bgBMax	TokenNameIdentifier	 bg B Max
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intToHex	TokenNameIdentifier	 int To Hex
(	TokenNameLPAREN	
rVal	TokenNameIdentifier	 r Val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intToHex	TokenNameIdentifier	 int To Hex
(	TokenNameLPAREN	
gVal	TokenNameIdentifier	 g Val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intToHex	TokenNameIdentifier	 int To Hex
(	TokenNameLPAREN	
bVal	TokenNameIdentifier	 b Val
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
private	TokenNameprivate	
int	TokenNameint	
getColorVal	TokenNameIdentifier	 get Color Val
(	TokenNameLPAREN	
int	TokenNameint	
colorMin	TokenNameIdentifier	 color Min
,	TokenNameCOMMA	
int	TokenNameint	
colorMax	TokenNameIdentifier	 color Max
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
colorMin	TokenNameIdentifier	 color Min
==	TokenNameEQUAL_EQUAL	
colorMax	TokenNameIdentifier	 color Max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
colorMin	TokenNameIdentifier	 color Min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
colorMin	TokenNameIdentifier	 color Min
-	TokenNameMINUS	
colorMax	TokenNameIdentifier	 color Max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
relScorePercent	TokenNameIdentifier	 rel Score Percent
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
maxScore	TokenNameIdentifier	 max Score
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
maxScore	TokenNameIdentifier	 max Score
;	TokenNameSEMICOLON	
float	TokenNamefloat	
colScore	TokenNameIdentifier	 col Score
=	TokenNameEQUAL	
scale	TokenNameIdentifier	 scale
*	TokenNameMULTIPLY	
relScorePercent	TokenNameIdentifier	 rel Score Percent
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
colorMin	TokenNameIdentifier	 color Min
,	TokenNameCOMMA	
colorMax	TokenNameIdentifier	 color Max
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
colScore	TokenNameIdentifier	 col Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
hexDigits	TokenNameIdentifier	 hex Digits
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'0'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'1'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'2'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'3'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'4'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'5'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'6'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'7'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'8'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'9'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'A'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'B'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'C'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'D'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'E'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'F'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
intToHex	TokenNameIdentifier	 int To Hex
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
hexDigits	TokenNameIdentifier	 hex Digits
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xF0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
hexDigits	TokenNameIdentifier	 hex Digits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x0F	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a hex string into an int. Integer.parseInt(hex, 16) assumes the * input is nonnegative unless there is a preceding minus sign. This method * reads the input as twos complement instead, so if the input is 8 bytes * long, it will correctly restore a negative int produced by * Integer.toHexString() but not necessarily one produced by * Integer.toString(x,16) since that method will produce a string like '-FF' * for negative integer values. * * @param hex * A string in capital or lower case hex, of no more then 16 * characters. * @throws NumberFormatException * if the string is more than 16 characters long, or if any * character is not in the set [0-9a-fA-f] */	TokenNameCOMMENT_JAVADOC	 Converts a hex string into an int. Integer.parseInt(hex, 16) assumes the input is nonnegative unless there is a preceding minus sign. This method reads the input as twos complement instead, so if the input is 8 bytes long, it will correctly restore a negative int produced by Integer.toHexString() but not necessarily one produced by Integer.toString(x,16) since that method will produce a string like '-FF' for negative integer values. * @param hex A string in capital or lower case hex, of no more then 16 characters. @throws NumberFormatException if the string is more than 16 characters long, or if any character is not in the set [0-9a-fA-f] 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
hex	TokenNameIdentifier	 hex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
hex	TokenNameIdentifier	 hex
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
<<=	TokenNameLEFT_SHIFT_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
digit	TokenNameIdentifier	 digit
(	TokenNameLPAREN	
hex	TokenNameIdentifier	 hex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
|=	TokenNameOR_EQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
