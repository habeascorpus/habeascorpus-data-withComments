/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Arg.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Arg.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
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
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * This class holds an instance of an argument on * the stack. The value of the argument can be either an * XObject or a String containing an expression. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class holds an instance of an argument on the stack. The value of the argument can be either an XObject or a String containing an expression. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
Arg	TokenNameIdentifier	 Arg
{	TokenNameLBRACE	
/** Field m_qname: The name of this argument, expressed as a QName * (Qualified Name) object. * @see getQName * @see setQName * */	TokenNameCOMMENT_JAVADOC	 Field m_qname: The name of this argument, expressed as a QName (Qualified Name) object. @see getQName @see setQName 
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
m_qname	TokenNameIdentifier	 m qname
;	TokenNameSEMICOLON	
/** * Get the qualified name for this argument. * * @return QName object containing the qualified name */	TokenNameCOMMENT_JAVADOC	 Get the qualified name for this argument. * @return QName object containing the qualified name 
public	TokenNamepublic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_qname	TokenNameIdentifier	 m qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the qualified name for this argument. * * @param name QName object representing the new Qualified Name. */	TokenNameCOMMENT_JAVADOC	 Set the qualified name for this argument. * @param name QName object representing the new Qualified Name. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setQName	TokenNameIdentifier	 set Q Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_qname	TokenNameIdentifier	 m qname
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Field m_val: Stored XObject value of this argument * @see #getVal() * @see #setVal() */	TokenNameCOMMENT_JAVADOC	 Field m_val: Stored XObject value of this argument @see #getVal() @see #setVal() 
private	TokenNameprivate	
XObject	TokenNameIdentifier	 X Object
m_val	TokenNameIdentifier	 m val
;	TokenNameSEMICOLON	
/** * Get the value for this argument. * * @return the argument's stored XObject value. * @see #setVal(XObject) */	TokenNameCOMMENT_JAVADOC	 Get the value for this argument. * @return the argument's stored XObject value. @see #setVal(XObject) 
public	TokenNamepublic	
final	TokenNamefinal	
XObject	TokenNameIdentifier	 X Object
getVal	TokenNameIdentifier	 get Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_val	TokenNameIdentifier	 m val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value of this argument. * * @param val an XObject representing the arguments's value. * @see #getVal() */	TokenNameCOMMENT_JAVADOC	 Set the value of this argument. * @param val an XObject representing the arguments's value. @see #getVal() 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setVal	TokenNameIdentifier	 set Val
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_val	TokenNameIdentifier	 m val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Have the object release it's resources. * Call only when the variable or argument is going out of scope. */	TokenNameCOMMENT_JAVADOC	 Have the object release it's resources. Call only when the variable or argument is going out of scope. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_val	TokenNameIdentifier	 m val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_val	TokenNameIdentifier	 m val
.	TokenNameDOT	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_val	TokenNameIdentifier	 m val
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Field m_expression: Stored expression value of this argument. * @see #setExpression * @see #getExpression * */	TokenNameCOMMENT_JAVADOC	 Field m_expression: Stored expression value of this argument. @see #setExpression @see #getExpression 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_expression	TokenNameIdentifier	 m expression
;	TokenNameSEMICOLON	
/** * Get the value expression for this argument. * * @return String containing the expression previously stored into this * argument * @see #setExpression */	TokenNameCOMMENT_JAVADOC	 Get the value expression for this argument. * @return String containing the expression previously stored into this argument @see #setExpression 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_expression	TokenNameIdentifier	 m expression
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value expression for this argument. * * @param expr String containing the expression to be stored as this * argument's value. * @see #getExpression */	TokenNameCOMMENT_JAVADOC	 Set the value expression for this argument. * @param expr String containing the expression to be stored as this argument's value. @see #getExpression 
public	TokenNamepublic	
void	TokenNamevoid	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_expression	TokenNameIdentifier	 m expression
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * True if this variable was added with an xsl:with-param or * is added via setParameter. */	TokenNameCOMMENT_JAVADOC	 True if this variable was added with an xsl:with-param or is added via setParameter. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isFromWithParam	TokenNameIdentifier	 m is From With Param
;	TokenNameSEMICOLON	
/** * Tell if this variable is a parameter passed with a with-param or as * a top-level parameter. */	TokenNameCOMMENT_JAVADOC	 Tell if this variable is a parameter passed with a with-param or as a top-level parameter. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFromWithParam	TokenNameIdentifier	 is From With Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isFromWithParam	TokenNameIdentifier	 m is From With Param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * True if this variable is currently visible. To be visible, * a variable needs to come either from xsl:variable or be * a "received" parameter, ie one for which an xsl:param has * been encountered. * Set at the time the object is constructed and updated as needed. */	TokenNameCOMMENT_JAVADOC	 True if this variable is currently visible. To be visible, a variable needs to come either from xsl:variable or be a "received" parameter, ie one for which an xsl:param has been encountered. Set at the time the object is constructed and updated as needed. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isVisible	TokenNameIdentifier	 m is Visible
;	TokenNameSEMICOLON	
/** * Tell if this variable is currently visible. */	TokenNameCOMMENT_JAVADOC	 Tell if this variable is currently visible. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isVisible	TokenNameIdentifier	 is Visible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isVisible	TokenNameIdentifier	 m is Visible
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Update visibility status of this variable. */	TokenNameCOMMENT_JAVADOC	 Update visibility status of this variable. 
public	TokenNamepublic	
void	TokenNamevoid	
setIsVisible	TokenNameIdentifier	 set Is Visible
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isVisible	TokenNameIdentifier	 m is Visible
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a dummy parameter argument, with no QName and no * value (either expression string or value XObject). isVisible * defaults to true. */	TokenNameCOMMENT_JAVADOC	 Construct a dummy parameter argument, with no QName and no value (either expression string or value XObject). isVisible defaults to true. 
public	TokenNamepublic	
Arg	TokenNameIdentifier	 Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_qname	TokenNameIdentifier	 m qname
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
// so that string compares can be done. 	TokenNameCOMMENT_LINE	so that string compares can be done. 
m_val	TokenNameIdentifier	 m val
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_expression	TokenNameIdentifier	 m expression
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_isVisible	TokenNameIdentifier	 m is Visible
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_isFromWithParam	TokenNameIdentifier	 m is From With Param
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a parameter argument that contains an expression. * * @param qname Name of the argument, expressed as a QName object. * @param expression String to be stored as this argument's value expression. * @param isFromWithParam True if this is a parameter variable. */	TokenNameCOMMENT_JAVADOC	 Construct a parameter argument that contains an expression. * @param qname Name of the argument, expressed as a QName object. @param expression String to be stored as this argument's value expression. @param isFromWithParam True if this is a parameter variable. 
public	TokenNamepublic	
Arg	TokenNameIdentifier	 Arg
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isFromWithParam	TokenNameIdentifier	 is From With Param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_qname	TokenNameIdentifier	 m qname
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
m_val	TokenNameIdentifier	 m val
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_expression	TokenNameIdentifier	 m expression
=	TokenNameEQUAL	
expression	TokenNameIdentifier	 expression
;	TokenNameSEMICOLON	
m_isFromWithParam	TokenNameIdentifier	 m is From With Param
=	TokenNameEQUAL	
isFromWithParam	TokenNameIdentifier	 is From With Param
;	TokenNameSEMICOLON	
m_isVisible	TokenNameIdentifier	 m is Visible
=	TokenNameEQUAL	
!	TokenNameNOT	
isFromWithParam	TokenNameIdentifier	 is From With Param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a parameter argument which has an XObject value. * isVisible defaults to true. * * @param qname Name of the argument, expressed as a QName object. * @param val Value of the argument, expressed as an XObject */	TokenNameCOMMENT_JAVADOC	 Construct a parameter argument which has an XObject value. isVisible defaults to true. * @param qname Name of the argument, expressed as a QName object. @param val Value of the argument, expressed as an XObject 
public	TokenNamepublic	
Arg	TokenNameIdentifier	 Arg
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_qname	TokenNameIdentifier	 m qname
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
m_val	TokenNameIdentifier	 m val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
m_isVisible	TokenNameIdentifier	 m is Visible
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_isFromWithParam	TokenNameIdentifier	 m is From With Param
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_expression	TokenNameIdentifier	 m expression
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Equality function specialized for the variable name. If the argument * is not a qname, it will deligate to the super class. * * @param obj the reference object with which to compare. * @return <code>true</code> if this object is the same as the obj * argument; <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Equality function specialized for the variable name. If the argument is not a qname, it will deligate to the super class. * @param obj the reference object with which to compare. @return <code>true</code> if this object is the same as the obj argument; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_qname	TokenNameIdentifier	 m qname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a parameter argument. * * @param qname Name of the argument, expressed as a QName object. * @param val Value of the argument, expressed as an XObject * @param isFromWithParam True if this is a parameter variable. */	TokenNameCOMMENT_JAVADOC	 Construct a parameter argument. * @param qname Name of the argument, expressed as a QName object. @param val Value of the argument, expressed as an XObject @param isFromWithParam True if this is a parameter variable. 
public	TokenNamepublic	
Arg	TokenNameIdentifier	 Arg
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isFromWithParam	TokenNameIdentifier	 is From With Param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_qname	TokenNameIdentifier	 m qname
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
m_val	TokenNameIdentifier	 m val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
m_isFromWithParam	TokenNameIdentifier	 m is From With Param
=	TokenNameEQUAL	
isFromWithParam	TokenNameIdentifier	 is From With Param
;	TokenNameSEMICOLON	
m_isVisible	TokenNameIdentifier	 m is Visible
=	TokenNameEQUAL	
!	TokenNameNOT	
isFromWithParam	TokenNameIdentifier	 is From With Param
;	TokenNameSEMICOLON	
m_expression	TokenNameIdentifier	 m expression
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
