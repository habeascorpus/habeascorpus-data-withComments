/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SingleNodeCounter.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SingleNodeCounter.java 468651 2006-10-28 07:04:25Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
DOM	TokenNameIdentifier	 DOM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
Translet	TokenNameIdentifier	 Translet
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
Axis	TokenNameIdentifier	 Axis
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SingleNodeCounter	TokenNameIdentifier	 Single Node Counter
extends	TokenNameextends	
NodeCounter	TokenNameIdentifier	 Node Counter
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EmptyArray	TokenNameIdentifier	 Empty Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
_countSiblings	TokenNameIdentifier	 count Siblings
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SingleNodeCounter	TokenNameIdentifier	 Single Node Counter
(	TokenNameLPAREN	
Translet	TokenNameIdentifier	 Translet
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
DOM	TokenNameIdentifier	 DOM
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodeCounter	TokenNameIdentifier	 Node Counter
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_countSiblings	TokenNameIdentifier	 count Siblings
=	TokenNameEQUAL	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDINGSIBLING	TokenNameIdentifier	 PRECEDINGSIBLING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCounter	TokenNameIdentifier	 get Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//See Errata E24 	TokenNameCOMMENT_LINE	See Errata E24 
if	TokenNameif	
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"NaN"	TokenNameStringLiteral	NaN
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"-Infinity"	TokenNameStringLiteral	-Infinity
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"Infinity"	TokenNameStringLiteral	Infinity
;	TokenNameSEMICOLON	
else	TokenNameelse	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
matchesCount	TokenNameIdentifier	 matches Count
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchesCount	TokenNameIdentifier	 matches Count
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// found target 	TokenNameCOMMENT_LINE	found target 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchesFrom	TokenNameIdentifier	 matches From
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// no target found 	TokenNameCOMMENT_LINE	no target found 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_countSiblings	TokenNameIdentifier	 count Siblings
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchesCount	TokenNameIdentifier	 matches Count
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
_countSiblings	TokenNameIdentifier	 count Siblings
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// If no target found then pass the empty list 	TokenNameCOMMENT_LINE	If no target found then pass the empty list 
return	TokenNamereturn	
formatNumbers	TokenNameIdentifier	 format Numbers
(	TokenNameLPAREN	
EmptyArray	TokenNameIdentifier	 Empty Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
formatNumbers	TokenNameIdentifier	 format Numbers
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
NodeCounter	TokenNameIdentifier	 Node Counter
getDefaultNodeCounter	TokenNameIdentifier	 get Default Node Counter
(	TokenNameLPAREN	
Translet	TokenNameIdentifier	 Translet
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
DOM	TokenNameIdentifier	 DOM
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultSingleNodeCounter	TokenNameIdentifier	 Default Single Node Counter
(	TokenNameLPAREN	
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
DefaultSingleNodeCounter	TokenNameIdentifier	 Default Single Node Counter
extends	TokenNameextends	
SingleNodeCounter	TokenNameIdentifier	 Single Node Counter
{	TokenNameLBRACE	
public	TokenNamepublic	
DefaultSingleNodeCounter	TokenNameIdentifier	 Default Single Node Counter
(	TokenNameLPAREN	
Translet	TokenNameIdentifier	 Translet
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
DOM	TokenNameIdentifier	 DOM
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodeCounter	TokenNameIdentifier	 Node Counter
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_countSiblings	TokenNameIdentifier	 count Siblings
=	TokenNameEQUAL	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getTypedAxisIterator	TokenNameIdentifier	 get Typed Axis Iterator
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDINGSIBLING	TokenNameIdentifier	 PRECEDINGSIBLING
,	TokenNameCOMMA	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCounter	TokenNameIdentifier	 get Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//See Errata E24 	TokenNameCOMMENT_LINE	See Errata E24 
if	TokenNameif	
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"NaN"	TokenNameStringLiteral	NaN
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"-Infinity"	TokenNameStringLiteral	-Infinity
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"Infinity"	TokenNameStringLiteral	Infinity
;	TokenNameSEMICOLON	
else	TokenNameelse	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_countSiblings	TokenNameIdentifier	 count Siblings
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
_node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
_countSiblings	TokenNameIdentifier	 count Siblings
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
formatNumbers	TokenNameIdentifier	 format Numbers
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
