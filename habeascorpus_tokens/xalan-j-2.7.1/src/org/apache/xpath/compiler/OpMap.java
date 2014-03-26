/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: OpMap.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: OpMap.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ObjectVector	TokenNameIdentifier	 Object Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
/** * This class represents the data structure basics of the XPath * object. */	TokenNameCOMMENT_JAVADOC	 This class represents the data structure basics of the XPath object. 
public	TokenNamepublic	
class	TokenNameclass	
OpMap	TokenNameIdentifier	 Op Map
{	TokenNameLBRACE	
/** * The current pattern string, for diagnostics purposes */	TokenNameCOMMENT_JAVADOC	 The current pattern string, for diagnostics purposes 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_currentPattern	TokenNameIdentifier	 m current Pattern
;	TokenNameSEMICOLON	
/** * Return the expression as a string for diagnostics. * * @return The expression string. */	TokenNameCOMMENT_JAVADOC	 Return the expression as a string for diagnostics. * @return The expression string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentPattern	TokenNameIdentifier	 m current Pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the expression as a string for diagnostics. * * @return The expression string. */	TokenNameCOMMENT_JAVADOC	 Return the expression as a string for diagnostics. * @return The expression string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentPattern	TokenNameIdentifier	 m current Pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The starting size of the token queue. */	TokenNameCOMMENT_JAVADOC	 The starting size of the token queue. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAXTOKENQUEUESIZE	TokenNameIdentifier	 MAXTOKENQUEUESIZE
=	TokenNameEQUAL	
500	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * Amount to grow token queue when it becomes full */	TokenNameCOMMENT_BLOCK	 Amount to grow token queue when it becomes full 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BLOCKTOKENQUEUESIZE	TokenNameIdentifier	 BLOCKTOKENQUEUESIZE
=	TokenNameEQUAL	
500	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * TokenStack is the queue of used tokens. The current token is the token at the * end of the m_tokenQueue. The idea is that the queue can be marked and a sequence * of tokens can be reused. */	TokenNameCOMMENT_JAVADOC	 TokenStack is the queue of used tokens. The current token is the token at the end of the m_tokenQueue. The idea is that the queue can be marked and a sequence of tokens can be reused. 
ObjectVector	TokenNameIdentifier	 Object Vector
m_tokenQueue	TokenNameIdentifier	 m token Queue
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectVector	TokenNameIdentifier	 Object Vector
(	TokenNameLPAREN	
MAXTOKENQUEUESIZE	TokenNameIdentifier	 MAXTOKENQUEUESIZE
,	TokenNameCOMMA	
BLOCKTOKENQUEUESIZE	TokenNameIdentifier	 BLOCKTOKENQUEUESIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the XPath as a list of tokens. * * @return ObjectVector of tokens. */	TokenNameCOMMENT_JAVADOC	 Get the XPath as a list of tokens. * @return ObjectVector of tokens. 
public	TokenNamepublic	
ObjectVector	TokenNameIdentifier	 Object Vector
getTokenQueue	TokenNameIdentifier	 get Token Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_tokenQueue	TokenNameIdentifier	 m token Queue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the XPath as a list of tokens. * * @param pos index into token queue. * * @return The token, normally a string. */	TokenNameCOMMENT_JAVADOC	 Get the XPath as a list of tokens. * @param pos index into token queue. * @return The token, normally a string. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The current size of the token queue. */	TokenNameCOMMENT_JAVADOC	 The current size of the token queue. 
// public int m_tokenQueueSize = 0; 	TokenNameCOMMENT_LINE	public int m_tokenQueueSize = 0; 
/** * Get size of the token queue. * * @return The size of the token queue. */	TokenNameCOMMENT_JAVADOC	 Get size of the token queue. * @return The size of the token queue. 
public	TokenNamepublic	
int	TokenNameint	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An operations map is used instead of a proper parse tree. It contains * operations codes and indexes into the m_tokenQueue. * I use an array instead of a full parse tree in order to cut down * on the number of objects created. */	TokenNameCOMMENT_JAVADOC	 An operations map is used instead of a proper parse tree. It contains operations codes and indexes into the m_tokenQueue. I use an array instead of a full parse tree in order to cut down on the number of objects created. 
OpMapVector	TokenNameIdentifier	 Op Map Vector
m_opMap	TokenNameIdentifier	 m op Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get the opcode list that describes the XPath operations. It contains * operations codes and indexes into the m_tokenQueue. * I use an array instead of a full parse tree in order to cut down * on the number of objects created. * * @return An IntVector that is the opcode list that describes the XPath operations. */	TokenNameCOMMENT_JAVADOC	 Get the opcode list that describes the XPath operations. It contains operations codes and indexes into the m_tokenQueue. I use an array instead of a full parse tree in order to cut down on the number of objects created. * @return An IntVector that is the opcode list that describes the XPath operations. 
public	TokenNamepublic	
OpMapVector	TokenNameIdentifier	 Op Map Vector
getOpMap	TokenNameIdentifier	 get Op Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_opMap	TokenNameIdentifier	 m op Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Position indexes 	TokenNameCOMMENT_LINE	Position indexes 
/** * The length is always the opcode position + 1. * Length is always expressed as the opcode+length bytes, * so it is always 2 or greater. */	TokenNameCOMMENT_JAVADOC	 The length is always the opcode position + 1. Length is always expressed as the opcode+length bytes, so it is always 2 or greater. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Replace the large arrays * with a small array. */	TokenNameCOMMENT_JAVADOC	 Replace the large arrays with a small array. 
void	TokenNamevoid	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
setToSize	TokenNameIdentifier	 set To Size
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
setToSize	TokenNameIdentifier	 set To Size
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an operation position, return the current op. * * @param opPos index into op map. * @return the op that corresponds to the opPos argument. */	TokenNameCOMMENT_JAVADOC	 Given an operation position, return the current op. * @param opPos index into op map. @return the op that corresponds to the opPos argument. 
public	TokenNamepublic	
int	TokenNameint	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the op at index to the given int. * * @param opPos index into op map. * @param value Value to set */	TokenNameCOMMENT_JAVADOC	 Set the op at index to the given int. * @param opPos index into op map. @param value Value to set 
public	TokenNamepublic	
void	TokenNamevoid	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an operation position, return the end position, i.e. the * beginning of the next operation. * * @param opPos An op position of an operation for which there is a size * entry following. * @return position of next operation in m_opMap. */	TokenNameCOMMENT_JAVADOC	 Given an operation position, return the end position, i.e. the beginning of the next operation. * @param opPos An op position of an operation for which there is a size entry following. @return position of next operation in m_opMap. 
public	TokenNamepublic	
int	TokenNameint	
getNextOpPos	TokenNameIdentifier	 get Next Op Pos
(	TokenNameLPAREN	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a location step position, return the end position, i.e. the * beginning of the next step. * * @param opPos the position of a location step. * @return the position of the next location step. */	TokenNameCOMMENT_JAVADOC	 Given a location step position, return the end position, i.e. the beginning of the next step. * @param opPos the position of a location step. @return the position of the next location step. 
public	TokenNamepublic	
int	TokenNameint	
getNextStepPos	TokenNameIdentifier	 get Next Step Pos
(	TokenNameLPAREN	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
stepType	TokenNameIdentifier	 step Type
=	TokenNameEQUAL	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
>=	TokenNameGREATER_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
AXES_START_TYPES	TokenNameIdentifier	 AXES  START  TYPES
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
<=	TokenNameLESS_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
AXES_END_TYPES	TokenNameIdentifier	 AXES  END  TYPES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextOpPos	TokenNameIdentifier	 get Next Op Pos
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
>=	TokenNameGREATER_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FIRST_NODESET_OP	TokenNameIdentifier	 FIRST  NODESET  OP
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
<=	TokenNameLESS_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
LAST_NODESET_OP	TokenNameIdentifier	 LAST  NODESET  OP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newOpPos	TokenNameIdentifier	 new Op Pos
=	TokenNameEQUAL	
getNextOpPos	TokenNameIdentifier	 get Next Op Pos
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_PREDICATE	TokenNameIdentifier	 OP  PREDICATE
==	TokenNameEQUAL_EQUAL	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
newOpPos	TokenNameIdentifier	 new Op Pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newOpPos	TokenNameIdentifier	 new Op Pos
=	TokenNameEQUAL	
getNextOpPos	TokenNameIdentifier	 get Next Op Pos
(	TokenNameLPAREN	
newOpPos	TokenNameIdentifier	 new Op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stepType	TokenNameIdentifier	 step Type
=	TokenNameEQUAL	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
newOpPos	TokenNameIdentifier	 new Op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
>=	TokenNameGREATER_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
AXES_START_TYPES	TokenNameIdentifier	 AXES  START  TYPES
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
<=	TokenNameLESS_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
AXES_END_TYPES	TokenNameIdentifier	 AXES  END  TYPES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ENDOP	TokenNameIdentifier	 ENDOP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newOpPos	TokenNameIdentifier	 new Op Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_UNKNOWN_STEP	TokenNameIdentifier	 ER  UNKNOWN  STEP
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Programmer's assertion in getNextStepPos: unknown stepType: " + stepType); 	TokenNameCOMMENT_LINE	"Programmer's assertion in getNextStepPos: unknown stepType: " + stepType); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given an operation position, return the end position, i.e. the * beginning of the next operation. * * @param opMap The operations map. * @param opPos index to operation, for which there is a size entry following. * @return position of next operation in m_opMap. */	TokenNameCOMMENT_JAVADOC	 Given an operation position, return the end position, i.e. the beginning of the next operation. * @param opMap The operations map. @param opPos index to operation, for which there is a size entry following. @return position of next operation in m_opMap. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getNextOpPos	TokenNameIdentifier	 get Next Op Pos
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
opMap	TokenNameIdentifier	 op Map
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
opMap	TokenNameIdentifier	 op Map
[	TokenNameLBRACKET	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an FROM_stepType position, return the position of the * first predicate, if there is one, or else this will point * to the end of the FROM_stepType. * Example: * int posOfPredicate = xpath.getNextOpPos(stepPos); * boolean hasPredicates = * OpCodes.OP_PREDICATE == xpath.getOp(posOfPredicate); * * @param opPos position of FROM_stepType op. * @return position of predicate in FROM_stepType structure. */	TokenNameCOMMENT_JAVADOC	 Given an FROM_stepType position, return the position of the first predicate, if there is one, or else this will point to the end of the FROM_stepType. Example: int posOfPredicate = xpath.getNextOpPos(stepPos); boolean hasPredicates = OpCodes.OP_PREDICATE == xpath.getOp(posOfPredicate); * @param opPos position of FROM_stepType op. @return position of predicate in FROM_stepType structure. 
public	TokenNamepublic	
int	TokenNameint	
getFirstPredicateOpPos	TokenNameIdentifier	 get First Predicate Op Pos
(	TokenNameLPAREN	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
int	TokenNameint	
stepType	TokenNameIdentifier	 step Type
=	TokenNameEQUAL	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
>=	TokenNameGREATER_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
AXES_START_TYPES	TokenNameIdentifier	 AXES  START  TYPES
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
<=	TokenNameLESS_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
AXES_END_TYPES	TokenNameIdentifier	 AXES  END  TYPES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
>=	TokenNameGREATER_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FIRST_NODESET_OP	TokenNameIdentifier	 FIRST  NODESET  OP
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
<=	TokenNameLESS_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
LAST_NODESET_OP	TokenNameIdentifier	 LAST  NODESET  OP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
stepType	TokenNameIdentifier	 step Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_UNKNOWN_OPCODE	TokenNameIdentifier	 ER  UNKNOWN  OPCODE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"ERROR! Unknown op code: "+m_opMap[opPos]); 	TokenNameCOMMENT_LINE	"ERROR! Unknown op code: "+m_opMap[opPos]); 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param msg An error msgkey that corresponds to one of the constants found * in {@link org.apache.xpath.res.XPATHErrorResources}, which is * a key for a format string. * @param args An array of arguments represented in the format string, which * may be null. * * @throws TransformerException if the current ErrorListoner determines to * throw an exception. */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param msg An error msgkey that corresponds to one of the constants found in {@link org.apache.xpath.res.XPATHErrorResources}, which is a key for a format string. @param args An array of arguments represented in the format string, which may be null. * @throws TransformerException if the current ErrorListoner determines to throw an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Go to the first child of a given operation. * * @param opPos position of operation. * * @return The position of the first child of the operation. */	TokenNameCOMMENT_JAVADOC	 Go to the first child of a given operation. * @param opPos position of operation. * @return The position of the first child of the operation. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getFirstChildPos	TokenNameIdentifier	 get First Child Pos
(	TokenNameLPAREN	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of an operation. * * @param opPos The position of the operation in the op map. * * @return The size of the operation. */	TokenNameCOMMENT_JAVADOC	 Get the length of an operation. * @param opPos The position of the operation in the op map. * @return The size of the operation. 
public	TokenNamepublic	
int	TokenNameint	
getArgLength	TokenNameIdentifier	 get Arg Length
(	TokenNameLPAREN	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a location step, get the length of that step. * * @param opPos Position of location step in op map. * * @return The length of the step. */	TokenNameCOMMENT_JAVADOC	 Given a location step, get the length of that step. * @param opPos Position of location step in op map. * @return The length of the step. 
public	TokenNamepublic	
int	TokenNameint	
getArgLengthOfStep	TokenNameIdentifier	 get Arg Length Of Step
(	TokenNameLPAREN	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first child position of a given location step. * * @param opPos Position of location step in the location map. * * @return The first child position of the step. */	TokenNameCOMMENT_JAVADOC	 Get the first child position of a given location step. * @param opPos Position of location step in the location map. * @return The first child position of the step. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getFirstChildPosOfStep	TokenNameIdentifier	 get First Child Pos Of Step
(	TokenNameLPAREN	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the test type of the step, i.e. NODETYPE_XXX value. * * @param opPosOfStep The position of the FROM_XXX step. * * @return NODETYPE_XXX value. */	TokenNameCOMMENT_JAVADOC	 Get the test type of the step, i.e. NODETYPE_XXX value. * @param opPosOfStep The position of the FROM_XXX step. * @return NODETYPE_XXX value. 
public	TokenNamepublic	
int	TokenNameint	
getStepTestType	TokenNameIdentifier	 get Step Test Type
(	TokenNameLPAREN	
int	TokenNameint	
opPosOfStep	TokenNameIdentifier	 op Pos Of Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPosOfStep	TokenNameIdentifier	 op Pos Of Step
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skip past op, len, len without predicates 	TokenNameCOMMENT_LINE	skip past op, len, len without predicates 
}	TokenNameRBRACE	
/** * Get the namespace of the step. * * @param opPosOfStep The position of the FROM_XXX step. * * @return The step's namespace, NodeTest.WILD, or null for null namespace. */	TokenNameCOMMENT_JAVADOC	 Get the namespace of the step. * @param opPosOfStep The position of the FROM_XXX step. * @return The step's namespace, NodeTest.WILD, or null for null namespace. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStepNS	TokenNameIdentifier	 get Step NS
(	TokenNameLPAREN	
int	TokenNameint	
opPosOfStep	TokenNameIdentifier	 op Pos Of Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
argLenOfStep	TokenNameIdentifier	 arg Len Of Step
=	TokenNameEQUAL	
getArgLengthOfStep	TokenNameIdentifier	 get Arg Length Of Step
(	TokenNameLPAREN	
opPosOfStep	TokenNameIdentifier	 op Pos Of Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("getStepNS.argLenOfStep: "+argLenOfStep); 	TokenNameCOMMENT_LINE	System.out.println("getStepNS.argLenOfStep: "+argLenOfStep); 
if	TokenNameif	
(	TokenNameLPAREN	
argLenOfStep	TokenNameIdentifier	 arg Len Of Step
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPosOfStep	TokenNameIdentifier	 op Pos Of Step
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ELEMWILDCARD	TokenNameIdentifier	 ELEMWILDCARD
==	TokenNameEQUAL_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
return	TokenNamereturn	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
WILD	TokenNameIdentifier	 WILD
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the local name of the step. * @param opPosOfStep The position of the FROM_XXX step. * * @return OpCodes.EMPTY, OpCodes.ELEMWILDCARD, or the local name. */	TokenNameCOMMENT_JAVADOC	 Get the local name of the step. @param opPosOfStep The position of the FROM_XXX step. * @return OpCodes.EMPTY, OpCodes.ELEMWILDCARD, or the local name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStepLocalName	TokenNameIdentifier	 get Step Local Name
(	TokenNameLPAREN	
int	TokenNameint	
opPosOfStep	TokenNameIdentifier	 op Pos Of Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
argLenOfStep	TokenNameIdentifier	 arg Len Of Step
=	TokenNameEQUAL	
getArgLengthOfStep	TokenNameIdentifier	 get Arg Length Of Step
(	TokenNameLPAREN	
opPosOfStep	TokenNameIdentifier	 op Pos Of Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("getStepLocalName.argLenOfStep: "+argLenOfStep); 	TokenNameCOMMENT_LINE	System.out.println("getStepLocalName.argLenOfStep: "+argLenOfStep); 
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
argLenOfStep	TokenNameIdentifier	 arg Len Of Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ELEMWILDCARD	TokenNameIdentifier	 ELEMWILDCARD
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPosOfStep	TokenNameIdentifier	 op Pos Of Step
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_opMap	TokenNameIdentifier	 m op Map
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
opPosOfStep	TokenNameIdentifier	 op Pos Of Step
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Should assert error 	TokenNameCOMMENT_LINE	Should assert error 
}	TokenNameRBRACE	
// int index = (argLenOfStep == 3) ? m_opMap[opPosOfStep+5] 	TokenNameCOMMENT_LINE	int index = (argLenOfStep == 3) ? m_opMap[opPosOfStep+5] 
// : ((argLenOfStep == 1) ? -3 : -2); 	TokenNameCOMMENT_LINE	: ((argLenOfStep == 1) ? -3 : -2); 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ELEMWILDCARD	TokenNameIdentifier	 ELEMWILDCARD
==	TokenNameEQUAL_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
return	TokenNamereturn	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
WILD	TokenNameIdentifier	 WILD
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
