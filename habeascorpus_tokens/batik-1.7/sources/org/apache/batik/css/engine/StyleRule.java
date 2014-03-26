/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
SelectorList	TokenNameIdentifier	 Selector List
;	TokenNameSEMICOLON	
/** * This class represents a style rule. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: StyleRule.java 476924 2006-11-19 21:13:26Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents a style rule. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: StyleRule.java 476924 2006-11-19 21:13:26Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
StyleRule	TokenNameIdentifier	 Style Rule
implements	TokenNameimplements	
Rule	TokenNameIdentifier	 Rule
{	TokenNameLBRACE	
/** * The type constant. */	TokenNameCOMMENT_JAVADOC	 The type constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE	TokenNameIdentifier	 TYPE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The selector list. */	TokenNameCOMMENT_JAVADOC	 The selector list. 
protected	TokenNameprotected	
SelectorList	TokenNameIdentifier	 Selector List
selectorList	TokenNameIdentifier	 selector List
;	TokenNameSEMICOLON	
/** * The style declaration. */	TokenNameCOMMENT_JAVADOC	 The style declaration. 
protected	TokenNameprotected	
StyleDeclaration	TokenNameIdentifier	 Style Declaration
styleDeclaration	TokenNameIdentifier	 style Declaration
;	TokenNameSEMICOLON	
/** * Returns a constant identifying the rule type. */	TokenNameCOMMENT_JAVADOC	 Returns a constant identifying the rule type. 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TYPE	TokenNameIdentifier	 TYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the selector list. */	TokenNameCOMMENT_JAVADOC	 Sets the selector list. 
public	TokenNamepublic	
void	TokenNamevoid	
setSelectorList	TokenNameIdentifier	 set Selector List
(	TokenNameLPAREN	
SelectorList	TokenNameIdentifier	 Selector List
sl	TokenNameIdentifier	 sl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectorList	TokenNameIdentifier	 selector List
=	TokenNameEQUAL	
sl	TokenNameIdentifier	 sl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the selector list. */	TokenNameCOMMENT_JAVADOC	 Returns the selector list. 
public	TokenNamepublic	
SelectorList	TokenNameIdentifier	 Selector List
getSelectorList	TokenNameIdentifier	 get Selector List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
selectorList	TokenNameIdentifier	 selector List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the style map. */	TokenNameCOMMENT_JAVADOC	 Sets the style map. 
public	TokenNamepublic	
void	TokenNamevoid	
setStyleDeclaration	TokenNameIdentifier	 set Style Declaration
(	TokenNameLPAREN	
StyleDeclaration	TokenNameIdentifier	 Style Declaration
sd	TokenNameIdentifier	 sd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
styleDeclaration	TokenNameIdentifier	 style Declaration
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the style declaration. */	TokenNameCOMMENT_JAVADOC	 Returns the style declaration. 
public	TokenNamepublic	
StyleDeclaration	TokenNameIdentifier	 Style Declaration
getStyleDeclaration	TokenNameIdentifier	 get Style Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
styleDeclaration	TokenNameIdentifier	 style Declaration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a printable representation of this style rule. */	TokenNameCOMMENT_JAVADOC	 Returns a printable representation of this style rule. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
eng	TokenNameIdentifier	 eng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
selectorList	TokenNameIdentifier	 selector List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
selectorList	TokenNameIdentifier	 selector List
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
selectorList	TokenNameIdentifier	 selector List
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
selectorList	TokenNameIdentifier	 selector List
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" { "	TokenNameStringLiteral	 { 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
styleDeclaration	TokenNameIdentifier	 style Declaration
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
styleDeclaration	TokenNameIdentifier	 style Declaration
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
eng	TokenNameIdentifier	 eng
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"} "	TokenNameStringLiteral	} 
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
}	TokenNameRBRACE	
