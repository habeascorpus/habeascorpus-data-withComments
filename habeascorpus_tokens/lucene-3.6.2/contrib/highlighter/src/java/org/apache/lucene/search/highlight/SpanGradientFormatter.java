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
/** * Formats text with different color intensity depending on the score of the * term using the span tag. GradientFormatter uses a bgcolor argument to the font tag which * doesn't work in Mozilla, thus this class. * * @see GradientFormatter * */	TokenNameCOMMENT_JAVADOC	 Formats text with different color intensity depending on the score of the term using the span tag. GradientFormatter uses a bgcolor argument to the font tag which doesn't work in Mozilla, thus this class. * @see GradientFormatter 
public	TokenNamepublic	
class	TokenNameclass	
SpanGradientFormatter	TokenNameIdentifier	 Span Gradient Formatter
extends	TokenNameextends	
GradientFormatter	TokenNameIdentifier	 Gradient Formatter
{	TokenNameLBRACE	
public	TokenNamepublic	
SpanGradientFormatter	TokenNameIdentifier	 Span Gradient Formatter
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
super	TokenNamesuper	
(	TokenNameLPAREN	
maxScore	TokenNameIdentifier	 max Score
,	TokenNameCOMMA	
minForegroundColor	TokenNameIdentifier	 min Foreground Color
,	TokenNameCOMMA	
maxForegroundColor	TokenNameIdentifier	 max Foreground Color
,	TokenNameCOMMA	
minBackgroundColor	TokenNameIdentifier	 min Background Color
,	TokenNameCOMMA	
maxBackgroundColor	TokenNameIdentifier	 max Background Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
// try to size sb correctly 	TokenNameCOMMENT_LINE	try to size sb correctly 
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
originalText	TokenNameIdentifier	 original Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
EXTRA	TokenNameIdentifier	 EXTRA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<span style=""	TokenNameStringLiteral	<span style="
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
"color: "	TokenNameStringLiteral	color: 
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
"; "	TokenNameStringLiteral	; 
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
"background: "	TokenNameStringLiteral	background: 
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
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
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
"</span>"	TokenNameStringLiteral	</span>
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
// guess how much extra text we'll add to the text we're highlighting to try to avoid a StringBuilder resize 	TokenNameCOMMENT_LINE	guess how much extra text we'll add to the text we're highlighting to try to avoid a StringBuilder resize 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEMPLATE	TokenNameIdentifier	 TEMPLATE
=	TokenNameEQUAL	
"<span style="background: #EEEEEE; color: #000000;">...</span>"	TokenNameStringLiteral	<span style="background: #EEEEEE; color: #000000;">...</span>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXTRA	TokenNameIdentifier	 EXTRA
=	TokenNameEQUAL	
TEMPLATE	TokenNameIdentifier	 TEMPLATE
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
