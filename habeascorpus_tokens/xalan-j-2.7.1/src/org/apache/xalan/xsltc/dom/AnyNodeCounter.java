/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: AnyNodeCounter.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: AnyNodeCounter.java 468651 2006-10-28 07:04:25Z minchau $ 
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
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AnyNodeCounter	TokenNameIdentifier	 Any Node Counter
extends	TokenNameextends	
NodeCounter	TokenNameIdentifier	 Node Counter
{	TokenNameLBRACE	
public	TokenNamepublic	
AnyNodeCounter	TokenNameIdentifier	 Any Node Counter
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
return	TokenNamereturn	
formatNumbers	TokenNameIdentifier	 format Numbers
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
>=	TokenNameGREATER_EQUAL	
root	TokenNameIdentifier	 root
&&	TokenNameAND_AND	
!	TokenNameNOT	
matchesFrom	TokenNameIdentifier	 matches From
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
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
++	TokenNamePLUS_PLUS	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
next	TokenNameIdentifier	 next
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
//%HZ%: Is this the best way of finding the root? Is it better to check 	TokenNameCOMMENT_LINE	%HZ%: Is this the best way of finding the root? Is it better to check 
//%HZ%: parent(next)? 	TokenNameCOMMENT_LINE	%HZ%: parent(next)? 
/* if (next == root) { break; } else { --next; } */	TokenNameCOMMENT_BLOCK	 if (next == root) { break; } else { --next; } 
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
DefaultAnyNodeCounter	TokenNameIdentifier	 Default Any Node Counter
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
DefaultAnyNodeCounter	TokenNameIdentifier	 Default Any Node Counter
extends	TokenNameextends	
AnyNodeCounter	TokenNameIdentifier	 Any Node Counter
{	TokenNameLBRACE	
public	TokenNamepublic	
DefaultAnyNodeCounter	TokenNameIdentifier	 Default Any Node Counter
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
final	TokenNamefinal	
int	TokenNameint	
ntype	TokenNameIdentifier	 ntype
=	TokenNameEQUAL	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
_node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ntype	TokenNameIdentifier	 ntype
==	TokenNameEQUAL_EQUAL	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//%HZ%: Is this the best way of finding the root? Is it better to check 	TokenNameCOMMENT_LINE	%HZ%: Is this the best way of finding the root? Is it better to check 
//%HZ%: parent(next)? 	TokenNameCOMMENT_LINE	%HZ%: parent(next)? 
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
