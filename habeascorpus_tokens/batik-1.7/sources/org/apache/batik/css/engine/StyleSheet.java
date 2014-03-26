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
SACMediaList	TokenNameIdentifier	 SAC Media List
;	TokenNameSEMICOLON	
/** * This class represents a list of rules. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: StyleSheet.java 476924 2006-11-19 21:13:26Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents a list of rules. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: StyleSheet.java 476924 2006-11-19 21:13:26Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
StyleSheet	TokenNameIdentifier	 Style Sheet
{	TokenNameLBRACE	
/** * The rules. */	TokenNameCOMMENT_JAVADOC	 The rules. 
protected	TokenNameprotected	
Rule	TokenNameIdentifier	 Rule
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
new	TokenNamenew	
Rule	TokenNameIdentifier	 Rule
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * The number of rules. */	TokenNameCOMMENT_JAVADOC	 The number of rules. 
protected	TokenNameprotected	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
/** * The parent sheet, if any. */	TokenNameCOMMENT_JAVADOC	 The parent sheet, if any. 
protected	TokenNameprotected	
StyleSheet	TokenNameIdentifier	 Style Sheet
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
/** * Whether or not this stylesheet is alternate. */	TokenNameCOMMENT_JAVADOC	 Whether or not this stylesheet is alternate. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
alternate	TokenNameIdentifier	 alternate
;	TokenNameSEMICOLON	
/** * The media to use to cascade properties. */	TokenNameCOMMENT_JAVADOC	 The media to use to cascade properties. 
protected	TokenNameprotected	
SACMediaList	TokenNameIdentifier	 SAC Media List
media	TokenNameIdentifier	 media
;	TokenNameSEMICOLON	
/** * The style sheet title. */	TokenNameCOMMENT_JAVADOC	 The style sheet title. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
;	TokenNameSEMICOLON	
/** * Sets the media to use to compute the styles. */	TokenNameCOMMENT_JAVADOC	 Sets the media to use to compute the styles. 
public	TokenNamepublic	
void	TokenNamevoid	
setMedia	TokenNameIdentifier	 set Media
(	TokenNameLPAREN	
SACMediaList	TokenNameIdentifier	 SAC Media List
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
media	TokenNameIdentifier	 media
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the media to use to compute the styles. */	TokenNameCOMMENT_JAVADOC	 Returns the media to use to compute the styles. 
public	TokenNamepublic	
SACMediaList	TokenNameIdentifier	 SAC Media List
getMedia	TokenNameIdentifier	 get Media
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
media	TokenNameIdentifier	 media
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parent sheet. */	TokenNameCOMMENT_JAVADOC	 Returns the parent sheet. 
public	TokenNamepublic	
StyleSheet	TokenNameIdentifier	 Style Sheet
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the parent sheet. */	TokenNameCOMMENT_JAVADOC	 Sets the parent sheet. 
public	TokenNamepublic	
void	TokenNamevoid	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
StyleSheet	TokenNameIdentifier	 Style Sheet
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the 'alternate' attribute of this style-sheet. */	TokenNameCOMMENT_JAVADOC	 Sets the 'alternate' attribute of this style-sheet. 
public	TokenNamepublic	
void	TokenNamevoid	
setAlternate	TokenNameIdentifier	 set Alternate
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alternate	TokenNameIdentifier	 alternate
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether or not this stylesheet is alternate. */	TokenNameCOMMENT_JAVADOC	 Tells whether or not this stylesheet is alternate. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAlternate	TokenNameIdentifier	 is Alternate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
alternate	TokenNameIdentifier	 alternate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the 'title' attribute of this style-sheet. */	TokenNameCOMMENT_JAVADOC	 Sets the 'title' attribute of this style-sheet. 
public	TokenNamepublic	
void	TokenNamevoid	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the title of this style-sheet. */	TokenNameCOMMENT_JAVADOC	 Returns the title of this style-sheet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
title	TokenNameIdentifier	 title
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of rules. */	TokenNameCOMMENT_JAVADOC	 Returns the number of rules. 
public	TokenNamepublic	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the rule at the given index. */	TokenNameCOMMENT_JAVADOC	 Returns the rule at the given index. 
public	TokenNamepublic	
Rule	TokenNameIdentifier	 Rule
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rules	TokenNameIdentifier	 rules
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears the content. */	TokenNameCOMMENT_JAVADOC	 Clears the content. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
new	TokenNamenew	
Rule	TokenNameIdentifier	 Rule
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends a rule to the stylesheet. */	TokenNameCOMMENT_JAVADOC	 Appends a rule to the stylesheet. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Rule	TokenNameIdentifier	 Rule
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rule	TokenNameIdentifier	 Rule
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Rule	TokenNameIdentifier	 Rule
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rules	TokenNameIdentifier	 rules
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a printable representation of this style-sheet. */	TokenNameCOMMENT_JAVADOC	 Returns a printable representation of this style-sheet. 
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
size	TokenNameIdentifier	 size
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
rules	TokenNameIdentifier	 rules
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
eng	TokenNameIdentifier	 eng
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
