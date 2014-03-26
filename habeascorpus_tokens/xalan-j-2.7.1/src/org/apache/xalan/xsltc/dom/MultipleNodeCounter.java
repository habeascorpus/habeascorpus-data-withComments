/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: MultipleNodeCounter.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: MultipleNodeCounter.java 468651 2006-10-28 07:04:25Z minchau $ 
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IntegerArray	TokenNameIdentifier	 Integer Array
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
MultipleNodeCounter	TokenNameIdentifier	 Multiple Node Counter
extends	TokenNameextends	
NodeCounter	TokenNameIdentifier	 Node Counter
{	TokenNameLBRACE	
private	TokenNameprivate	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
_precSiblings	TokenNameIdentifier	 prec Siblings
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultipleNodeCounter	TokenNameIdentifier	 Multiple Node Counter
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
_precSiblings	TokenNameIdentifier	 prec Siblings
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
IntegerArray	TokenNameIdentifier	 Integer Array
ancestors	TokenNameIdentifier	 ancestors
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerArray	TokenNameIdentifier	 Integer Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Gather all ancestors that do not match from pattern 	TokenNameCOMMENT_LINE	Gather all ancestors that do not match from pattern 
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
ancestors	TokenNameIdentifier	 ancestors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// include self 	TokenNameCOMMENT_LINE	include self 
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
&&	TokenNameAND_AND	
!	TokenNameNOT	
matchesFrom	TokenNameIdentifier	 matches From
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ancestors	TokenNameIdentifier	 ancestors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create an array of counters 	TokenNameCOMMENT_LINE	Create an array of counters 
final	TokenNamefinal	
int	TokenNameint	
nAncestors	TokenNameIdentifier	 n Ancestors
=	TokenNameEQUAL	
ancestors	TokenNameIdentifier	 ancestors
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counters	TokenNameIdentifier	 counters
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nAncestors	TokenNameIdentifier	 n Ancestors
]	TokenNameRBRACKET	
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
nAncestors	TokenNameIdentifier	 n Ancestors
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Increment array of counters according to semantics 	TokenNameCOMMENT_LINE	Increment array of counters according to semantics 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nAncestors	TokenNameIdentifier	 n Ancestors
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
ancestors	TokenNameIdentifier	 ancestors
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchesCount	TokenNameIdentifier	 matches Count
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_precSiblings	TokenNameIdentifier	 prec Siblings
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
_precSiblings	TokenNameIdentifier	 prec Siblings
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
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
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Count the node itself 	TokenNameCOMMENT_LINE	Count the node itself 
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
formatNumbers	TokenNameIdentifier	 format Numbers
(	TokenNameLPAREN	
counters	TokenNameIdentifier	 counters
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
DefaultMultipleNodeCounter	TokenNameIdentifier	 Default Multiple Node Counter
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
DefaultMultipleNodeCounter	TokenNameIdentifier	 Default Multiple Node Counter
extends	TokenNameextends	
MultipleNodeCounter	TokenNameIdentifier	 Multiple Node Counter
{	TokenNameLBRACE	
public	TokenNamepublic	
DefaultMultipleNodeCounter	TokenNameIdentifier	 Default Multiple Node Counter
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
