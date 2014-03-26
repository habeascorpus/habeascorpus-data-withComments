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
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSValue	TokenNameIdentifier	 CSS Value
;	TokenNameSEMICOLON	
/** * This class represents a list of values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ListValue.java 476924 2006-11-19 21:13:26Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents a list of values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ListValue.java 476924 2006-11-19 21:13:26Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ListValue	TokenNameIdentifier	 List Value
extends	TokenNameextends	
AbstractValue	TokenNameIdentifier	 Abstract Value
{	TokenNameLBRACE	
/** * The length of the list. */	TokenNameCOMMENT_JAVADOC	 The length of the list. 
protected	TokenNameprotected	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
/** * The items. */	TokenNameCOMMENT_JAVADOC	 The items. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
new	TokenNamenew	
Value	TokenNameIdentifier	 Value
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * The list separator. */	TokenNameCOMMENT_JAVADOC	 The list separator. 
protected	TokenNameprotected	
char	TokenNamechar	
separator	TokenNameIdentifier	 separator
=	TokenNameEQUAL	
','	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Creates a ListValue. */	TokenNameCOMMENT_JAVADOC	 Creates a ListValue. 
public	TokenNamepublic	
ListValue	TokenNameIdentifier	 List Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a ListValue with the given separator. */	TokenNameCOMMENT_JAVADOC	 Creates a ListValue with the given separator. 
public	TokenNamepublic	
ListValue	TokenNameIdentifier	 List Value
(	TokenNameLPAREN	
char	TokenNamechar	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
separator	TokenNameIdentifier	 separator
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the separator used for this list. */	TokenNameCOMMENT_JAVADOC	 Returns the separator used for this list. 
public	TokenNamepublic	
char	TokenNamechar	
getSeparatorChar	TokenNameIdentifier	 get Separator Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
separator	TokenNameIdentifier	 separator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getCssValueType()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getCssValueType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getCssValueType	TokenNameIdentifier	 get Css Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CSSValue	TokenNameIdentifier	 CSS Value
.	TokenNameDOT	
CSS_VALUE_LIST	TokenNameIdentifier	 CSS  VALUE  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A string representation of the current value. */	TokenNameCOMMENT_JAVADOC	 A string representation of the current value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
items	TokenNameIdentifier	 items
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
items	TokenNameIdentifier	 items
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
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
/** * Implements {@link Value#getLength()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getLength()}. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#item(int)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#item(int)}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
items	TokenNameIdentifier	 items
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a printable representation of this value. */	TokenNameCOMMENT_JAVADOC	 Returns a printable representation of this value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends an item to the list. */	TokenNameCOMMENT_JAVADOC	 Appends an item to the list. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Value	TokenNameIdentifier	 Value
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
items	TokenNameIdentifier	 items
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
items	TokenNameIdentifier	 items
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
