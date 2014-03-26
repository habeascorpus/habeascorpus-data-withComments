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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * This class provides an implementation of the * {@link org.w3c.css.sac.AttributeCondition} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: CSSBeginHyphenAttributeCondition.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the {@link org.w3c.css.sac.AttributeCondition} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: CSSBeginHyphenAttributeCondition.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
CSSBeginHyphenAttributeCondition	TokenNameIdentifier	 CSS Begin Hyphen Attribute Condition
extends	TokenNameextends	
CSSAttributeCondition	TokenNameIdentifier	 CSS Attribute Condition
{	TokenNameLBRACE	
/** * Creates a new CSSAttributeCondition object. */	TokenNameCOMMENT_JAVADOC	 Creates a new CSSAttributeCondition object. 
public	TokenNamepublic	
CSSBeginHyphenAttributeCondition	TokenNameIdentifier	 CSS Begin Hyphen Attribute Condition
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
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
specified	TokenNameIdentifier	 specified
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
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
SAC_BEGIN_HYPHEN_ATTRIBUTE_CONDITION	TokenNameIdentifier	 SAC  BEGIN  HYPHEN  ATTRIBUTE  CONDITION
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
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
'['	TokenNameCharacterLiteral	
+	TokenNamePLUS	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"|=""	TokenNameStringLiteral	|="
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
""]"	TokenNameStringLiteral	"]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
