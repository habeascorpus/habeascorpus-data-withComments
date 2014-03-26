/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
/** * * @version $Id: MarginInfo.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @version $Id: MarginInfo.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
MarginInfo	TokenNameIdentifier	 Margin Info
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
JUSTIFY_START	TokenNameIdentifier	 JUSTIFY  START
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
JUSTIFY_MIDDLE	TokenNameIdentifier	 JUSTIFY  MIDDLE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
JUSTIFY_END	TokenNameIdentifier	 JUSTIFY  END
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
JUSTIFY_FULL	TokenNameIdentifier	 JUSTIFY  FULL
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
indent	TokenNameIdentifier	 indent
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
justification	TokenNameIdentifier	 justification
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
flowRegionBreak	TokenNameIdentifier	 flow Region Break
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MarginInfo	TokenNameIdentifier	 Margin Info
(	TokenNameLPAREN	
float	TokenNamefloat	
top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
float	TokenNamefloat	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
float	TokenNamefloat	
bottom	TokenNameIdentifier	 bottom
,	TokenNameCOMMA	
float	TokenNamefloat	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
float	TokenNamefloat	
indent	TokenNameIdentifier	 indent
,	TokenNameCOMMA	
int	TokenNameint	
justification	TokenNameIdentifier	 justification
,	TokenNameCOMMA	
boolean	TokenNameboolean	
flowRegionBreak	TokenNameIdentifier	 flow Region Break
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
indent	TokenNameIdentifier	 indent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
justification	TokenNameIdentifier	 justification
=	TokenNameEQUAL	
justification	TokenNameIdentifier	 justification
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
flowRegionBreak	TokenNameIdentifier	 flow Region Break
=	TokenNameEQUAL	
flowRegionBreak	TokenNameIdentifier	 flow Region Break
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MarginInfo	TokenNameIdentifier	 Margin Info
(	TokenNameLPAREN	
float	TokenNamefloat	
margin	TokenNameIdentifier	 margin
,	TokenNameCOMMA	
int	TokenNameint	
justification	TokenNameIdentifier	 justification
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMargin	TokenNameIdentifier	 set Margin
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
justification	TokenNameIdentifier	 justification
=	TokenNameEQUAL	
justification	TokenNameIdentifier	 justification
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
flowRegionBreak	TokenNameIdentifier	 flow Region Break
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMargin	TokenNameIdentifier	 set Margin
(	TokenNameLPAREN	
float	TokenNamefloat	
margin	TokenNameIdentifier	 margin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
margin	TokenNameIdentifier	 margin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
margin	TokenNameIdentifier	 margin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
margin	TokenNameIdentifier	 margin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
margin	TokenNameIdentifier	 margin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getTopMargin	TokenNameIdentifier	 get Top Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getRightMargin	TokenNameIdentifier	 get Right Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getBottomMargin	TokenNameIdentifier	 get Bottom Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getLeftMargin	TokenNameIdentifier	 get Left Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indent	TokenNameIdentifier	 indent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getJustification	TokenNameIdentifier	 get Justification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
justification	TokenNameIdentifier	 justification
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFlowRegionBreak	TokenNameIdentifier	 is Flow Region Break
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
flowRegionBreak	TokenNameIdentifier	 flow Region Break
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
