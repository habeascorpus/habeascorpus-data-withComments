/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: MethodType.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: MethodType.java 468649 2006-10-28 07:00:55Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
MethodType	TokenNameIdentifier	 Method Type
extends	TokenNameextends	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
_resultType	TokenNameIdentifier	 result Type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
_argsType	TokenNameIdentifier	 args Type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MethodType	TokenNameIdentifier	 Method Type
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
resultType	TokenNameIdentifier	 result Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_argsType	TokenNameIdentifier	 args Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_resultType	TokenNameIdentifier	 result Type
=	TokenNameEQUAL	
resultType	TokenNameIdentifier	 result Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MethodType	TokenNameIdentifier	 Method Type
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
resultType	TokenNameIdentifier	 result Type
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg1	TokenNameIdentifier	 arg1
!=	TokenNameNOT_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
Void	TokenNameIdentifier	 Void
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_argsType	TokenNameIdentifier	 args Type
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_argsType	TokenNameIdentifier	 args Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_resultType	TokenNameIdentifier	 result Type
=	TokenNameEQUAL	
resultType	TokenNameIdentifier	 result Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MethodType	TokenNameIdentifier	 Method Type
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
resultType	TokenNameIdentifier	 result Type
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_argsType	TokenNameIdentifier	 args Type
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_resultType	TokenNameIdentifier	 result Type
=	TokenNameEQUAL	
resultType	TokenNameIdentifier	 result Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MethodType	TokenNameIdentifier	 Method Type
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
resultType	TokenNameIdentifier	 result Type
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_argsType	TokenNameIdentifier	 args Type
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_resultType	TokenNameIdentifier	 result Type
=	TokenNameEQUAL	
resultType	TokenNameIdentifier	 result Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MethodType	TokenNameIdentifier	 Method Type
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
resultType	TokenNameIdentifier	 result Type
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
argsType	TokenNameIdentifier	 args Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_resultType	TokenNameIdentifier	 result Type
=	TokenNameEQUAL	
resultType	TokenNameIdentifier	 result Type
;	TokenNameSEMICOLON	
_argsType	TokenNameIdentifier	 args Type
=	TokenNameEQUAL	
argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
argsType	TokenNameIdentifier	 args Type
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"method{"	TokenNameStringLiteral	method{
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_argsType	TokenNameIdentifier	 args Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"void"	TokenNameStringLiteral	void
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toSignature	TokenNameIdentifier	 to Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toSignature	TokenNameIdentifier	 to Signature
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the signature of this method that results by adding * <code>lastArgSig</code> to the end of the argument list. */	TokenNameCOMMENT_JAVADOC	 Returns the signature of this method that results by adding <code>lastArgSig</code> to the end of the argument list. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toSignature	TokenNameIdentifier	 to Signature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lastArgSig	TokenNameIdentifier	 last Arg Sig
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_argsType	TokenNameIdentifier	 args Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
)	TokenNameRPAREN	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toSignature	TokenNameIdentifier	 to Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lastArgSig	TokenNameIdentifier	 last Arg Sig
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_resultType	TokenNameIdentifier	 result Type
.	TokenNameDOT	
toSignature	TokenNameIdentifier	 to Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
toJCType	TokenNameIdentifier	 to JC Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// should never be called 	TokenNameCOMMENT_LINE	should never be called 
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
identicalTo	TokenNameIdentifier	 identical To
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
MethodType	TokenNameIdentifier	 Method Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
MethodType	TokenNameIdentifier	 Method Type
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MethodType	TokenNameIdentifier	 Method Type
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_resultType	TokenNameIdentifier	 result Type
.	TokenNameDOT	
identicalTo	TokenNameIdentifier	 identical To
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
_resultType	TokenNameIdentifier	 result Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
argsCount	TokenNameIdentifier	 args Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
argsCount	TokenNameIdentifier	 args Count
(	TokenNameLPAREN	
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
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
)	TokenNameRPAREN	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
arg2	TokenNameIdentifier	 arg2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
)	TokenNameRPAREN	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
identicalTo	TokenNameIdentifier	 identical To
(	TokenNameLPAREN	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
distanceTo	TokenNameIdentifier	 distance To
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
MethodType	TokenNameIdentifier	 Method Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
MethodType	TokenNameIdentifier	 Method Type
mtype	TokenNameIdentifier	 mtype
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MethodType	TokenNameIdentifier	 Method Type
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_argsType	TokenNameIdentifier	 args Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
mtype	TokenNameIdentifier	 mtype
.	TokenNameDOT	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Type	TokenNameIdentifier	 Type
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
)	TokenNameRPAREN	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Type	TokenNameIdentifier	 Type
arg2	TokenNameIdentifier	 arg2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
)	TokenNameRPAREN	
mtype	TokenNameIdentifier	 mtype
.	TokenNameDOT	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
distanceTo	TokenNameIdentifier	 distance To
(	TokenNameLPAREN	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
// return MAX_VALUE 	TokenNameCOMMENT_LINE	return MAX_VALUE 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
distanceTo	TokenNameIdentifier	 distance To
(	TokenNameLPAREN	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
mtype	TokenNameIdentifier	 mtype
.	TokenNameDOT	
_argsType	TokenNameIdentifier	 args Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// both methods have no args 	TokenNameCOMMENT_LINE	both methods have no args 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Type	TokenNameIdentifier	 Type
resultType	TokenNameIdentifier	 result Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_resultType	TokenNameIdentifier	 result Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
argsType	TokenNameIdentifier	 args Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_argsType	TokenNameIdentifier	 args Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
argsCount	TokenNameIdentifier	 args Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_argsType	TokenNameIdentifier	 args Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
_argsType	TokenNameIdentifier	 args Type
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
