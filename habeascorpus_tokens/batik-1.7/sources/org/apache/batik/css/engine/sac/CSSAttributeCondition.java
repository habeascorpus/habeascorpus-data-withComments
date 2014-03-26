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
sac	TokenNameIdentifier	 sac
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * This class provides an implementation of the * {@link org.w3c.css.sac.AttributeCondition} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: CSSAttributeCondition.java 501844 2007-01-31 13:54:05Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the {@link org.w3c.css.sac.AttributeCondition} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: CSSAttributeCondition.java 501844 2007-01-31 13:54:05Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
CSSAttributeCondition	TokenNameIdentifier	 CSS Attribute Condition
extends	TokenNameextends	
AbstractAttributeCondition	TokenNameIdentifier	 Abstract Attribute Condition
{	TokenNameLBRACE	
/** * The attribute's local name. */	TokenNameCOMMENT_JAVADOC	 The attribute's local name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
/** * The attribute's namespace URI. */	TokenNameCOMMENT_JAVADOC	 The attribute's namespace URI. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * Whether this condition applies to specified attributes. */	TokenNameCOMMENT_JAVADOC	 Whether this condition applies to specified attributes. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
;	TokenNameSEMICOLON	
/** * Creates a new CSSAttributeCondition object. */	TokenNameCOMMENT_JAVADOC	 Creates a new CSSAttributeCondition object. 
public	TokenNamepublic	
CSSAttributeCondition	TokenNameIdentifier	 CSS Attribute Condition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
specified	TokenNameIdentifier	 specified
=	TokenNameEQUAL	
specified	TokenNameIdentifier	 specified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates whether some other object is "equal to" this one. * @param obj the reference object with which to compare. */	TokenNameCOMMENT_JAVADOC	 Indicates whether some other object is "equal to" this one. @param obj the reference object with which to compare. 
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
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CSSAttributeCondition	TokenNameIdentifier	 CSS Attribute Condition
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CSSAttributeCondition	TokenNameIdentifier	 CSS Attribute Condition
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
specified	TokenNameIdentifier	 specified
==	TokenNameEQUAL_EQUAL	
specified	TokenNameIdentifier	 specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * equal objects should have equal hashCodes. * @return hashCode of this CSSAttributeCondition */	TokenNameCOMMENT_JAVADOC	 equal objects should have equal hashCodes. @return hashCode of this CSSAttributeCondition 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
specified	TokenNameIdentifier	 specified
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.Condition#getConditionType()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Condition#getConditionType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getConditionType	TokenNameIdentifier	 get Condition Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SAC_ATTRIBUTE_CONDITION	TokenNameIdentifier	 SAC  ATTRIBUTE  CONDITION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.AttributeCondition#getNamespaceURI()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.AttributeCondition#getNamespaceURI()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.AttributeCondition#getLocalName()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.AttributeCondition#getLocalName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.AttributeCondition#getSpecified()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.AttributeCondition#getSpecified()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getSpecified	TokenNameIdentifier	 get Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
specified	TokenNameIdentifier	 specified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether this condition matches the given element. */	TokenNameCOMMENT_JAVADOC	 Tests whether this condition matches the given element. 
public	TokenNamepublic	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pseudoE	TokenNameIdentifier	 pseudo E
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fills the given set with the attribute names found in this selector. */	TokenNameCOMMENT_JAVADOC	 Fills the given set with the attribute names found in this selector. 
public	TokenNamepublic	
void	TokenNamevoid	
fillAttributeSet	TokenNameIdentifier	 fill Attribute Set
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
attrSet	TokenNameIdentifier	 attr Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a text representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a text representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
'['	TokenNameCharacterLiteral	
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
+	TokenNamePLUS	
']'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
'['	TokenNameCharacterLiteral	
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
+	TokenNamePLUS	
"=""	TokenNameStringLiteral	="
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
""]"	TokenNameStringLiteral	"]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
