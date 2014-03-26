/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SingletonIterator.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SingletonIterator.java 468651 2006-10-28 07:04:25Z minchau $ 
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
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
class	TokenNameclass	
SingletonIterator	TokenNameIdentifier	 Singleton Iterator
extends	TokenNameextends	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
_isConstant	TokenNameIdentifier	 is Constant
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SingletonIterator	TokenNameIdentifier	 Singleton Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SingletonIterator	TokenNameIdentifier	 Singleton Iterator
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SingletonIterator	TokenNameIdentifier	 Singleton Iterator
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
constant	TokenNameIdentifier	 constant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_isConstant	TokenNameIdentifier	 is Constant
=	TokenNameEQUAL	
constant	TokenNameIdentifier	 constant
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override the value of <tt>_node</tt> only when this * object was constructed using the empty constructor. */	TokenNameCOMMENT_JAVADOC	 Override the value of <tt>_node</tt> only when this object was constructed using the empty constructor. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isConstant	TokenNameIdentifier	 is Constant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_node	TokenNameIdentifier	 node
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isConstant	TokenNameIdentifier	 is Constant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
_isRestartable	TokenNameIdentifier	 is Restartable
;	TokenNameSEMICOLON	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_markedNode	TokenNameIdentifier	 marked Node
=	TokenNameEQUAL	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_markedNode	TokenNameIdentifier	 marked Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
