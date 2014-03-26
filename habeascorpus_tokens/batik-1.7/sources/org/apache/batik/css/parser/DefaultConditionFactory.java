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
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
AttributeCondition	TokenNameIdentifier	 Attribute Condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
CSSException	TokenNameIdentifier	 CSS Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
CombinatorCondition	TokenNameIdentifier	 Combinator Condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
Condition	TokenNameIdentifier	 Condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
ConditionFactory	TokenNameIdentifier	 Condition Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
ContentCondition	TokenNameIdentifier	 Content Condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
LangCondition	TokenNameIdentifier	 Lang Condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
NegativeCondition	TokenNameIdentifier	 Negative Condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
PositionalCondition	TokenNameIdentifier	 Positional Condition
;	TokenNameSEMICOLON	
/** * This class provides an implementation of the * {@link org.w3c.css.sac.ConditionFactory} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultConditionFactory.java 478283 2006-11-22 18:53:40Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the {@link org.w3c.css.sac.ConditionFactory} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultConditionFactory.java 478283 2006-11-22 18:53:40Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultConditionFactory	TokenNameIdentifier	 Default Condition Factory
implements	TokenNameimplements	
ConditionFactory	TokenNameIdentifier	 Condition Factory
{	TokenNameLBRACE	
/** * The instance of this class. */	TokenNameCOMMENT_JAVADOC	 The instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ConditionFactory	TokenNameIdentifier	 Condition Factory
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultConditionFactory	TokenNameIdentifier	 Default Condition Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
DefaultConditionFactory	TokenNameIdentifier	 Default Condition Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * ConditionFactory#createAndCondition(Condition,Condition)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link ConditionFactory#createAndCondition(Condition,Condition)}. 
public	TokenNamepublic	
CombinatorCondition	TokenNameIdentifier	 Combinator Condition
createAndCondition	TokenNameIdentifier	 create And Condition
(	TokenNameLPAREN	
Condition	TokenNameIdentifier	 Condition
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
Condition	TokenNameIdentifier	 Condition
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultAndCondition	TokenNameIdentifier	 Default And Condition
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * ConditionFactory#createOrCondition(Condition,Condition)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link ConditionFactory#createOrCondition(Condition,Condition)}. 
public	TokenNamepublic	
CombinatorCondition	TokenNameIdentifier	 Combinator Condition
createOrCondition	TokenNameIdentifier	 create Or Condition
(	TokenNameLPAREN	
Condition	TokenNameIdentifier	 Condition
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
Condition	TokenNameIdentifier	 Condition
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CSSException	TokenNameIdentifier	 CSS Exception
(	TokenNameLPAREN	
"Not implemented in CSS2"	TokenNameStringLiteral	Not implemented in CSS2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.ConditionFactory#createNegativeCondition(Condition)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.ConditionFactory#createNegativeCondition(Condition)}. 
public	TokenNamepublic	
NegativeCondition	TokenNameIdentifier	 Negative Condition
createNegativeCondition	TokenNameIdentifier	 create Negative Condition
(	TokenNameLPAREN	
Condition	TokenNameIdentifier	 Condition
condition	TokenNameIdentifier	 condition
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CSSException	TokenNameIdentifier	 CSS Exception
(	TokenNameLPAREN	
"Not implemented in CSS2"	TokenNameStringLiteral	Not implemented in CSS2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * ConditionFactory#createPositionalCondition(int,boolean,boolean)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link ConditionFactory#createPositionalCondition(int,boolean,boolean)}. 
public	TokenNamepublic	
PositionalCondition	TokenNameIdentifier	 Positional Condition
createPositionalCondition	TokenNameIdentifier	 create Positional Condition
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
boolean	TokenNameboolean	
typeNode	TokenNameIdentifier	 type Node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CSSException	TokenNameIdentifier	 CSS Exception
(	TokenNameLPAREN	
"Not implemented in CSS2"	TokenNameStringLiteral	Not implemented in CSS2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link *ConditionFactory#createAttributeCondition(String,String,boolean,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link *ConditionFactory#createAttributeCondition(String,String,boolean,String)}. 
public	TokenNamepublic	
AttributeCondition	TokenNameIdentifier	 Attribute Condition
createAttributeCondition	TokenNameIdentifier	 create Attribute Condition
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
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultAttributeCondition	TokenNameIdentifier	 Default Attribute Condition
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
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.ConditionFactory#createIdCondition(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.ConditionFactory#createIdCondition(String)}. 
public	TokenNamepublic	
AttributeCondition	TokenNameIdentifier	 Attribute Condition
createIdCondition	TokenNameIdentifier	 create Id Condition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultIdCondition	TokenNameIdentifier	 Default Id Condition
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.ConditionFactory#createLangCondition(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.ConditionFactory#createLangCondition(String)}. 
public	TokenNamepublic	
LangCondition	TokenNameIdentifier	 Lang Condition
createLangCondition	TokenNameIdentifier	 create Lang Condition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultLangCondition	TokenNameIdentifier	 Default Lang Condition
(	TokenNameLPAREN	
lang	TokenNameIdentifier	 lang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link ConditionFactory#createOneOfAttributeCondition(String,String,boolean,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link ConditionFactory#createOneOfAttributeCondition(String,String,boolean,String)}. 
public	TokenNamepublic	
AttributeCondition	TokenNameIdentifier	 Attribute Condition
createOneOfAttributeCondition	TokenNameIdentifier	 create One Of Attribute Condition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nsURI	TokenNameIdentifier	 ns URI
,	TokenNameCOMMA	
boolean	TokenNameboolean	
specified	TokenNameIdentifier	 specified
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultOneOfAttributeCondition	TokenNameIdentifier	 Default One Of Attribute Condition
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
nsURI	TokenNameIdentifier	 ns URI
,	TokenNameCOMMA	
specified	TokenNameIdentifier	 specified
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * ConditionFactory#createBeginHyphenAttributeCondition(String,String,boolean,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link ConditionFactory#createBeginHyphenAttributeCondition(String,String,boolean,String)}. 
public	TokenNamepublic	
AttributeCondition	TokenNameIdentifier	 Attribute Condition
createBeginHyphenAttributeCondition	TokenNameIdentifier	 create Begin Hyphen Attribute Condition
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
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultBeginHyphenAttributeCondition	TokenNameIdentifier	 Default Begin Hyphen Attribute Condition
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
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.ConditionFactory#createClassCondition(String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.ConditionFactory#createClassCondition(String,String)}. 
public	TokenNamepublic	
AttributeCondition	TokenNameIdentifier	 Attribute Condition
createClassCondition	TokenNameIdentifier	 create Class Condition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultClassCondition	TokenNameIdentifier	 Default Class Condition
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * ConditionFactory#createPseudoClassCondition(String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link ConditionFactory#createPseudoClassCondition(String,String)}. 
public	TokenNamepublic	
AttributeCondition	TokenNameIdentifier	 Attribute Condition
createPseudoClassCondition	TokenNameIdentifier	 create Pseudo Class Condition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultPseudoClassCondition	TokenNameIdentifier	 Default Pseudo Class Condition
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.ConditionFactory#createOnlyChildCondition()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.ConditionFactory#createOnlyChildCondition()}. 
public	TokenNamepublic	
Condition	TokenNameIdentifier	 Condition
createOnlyChildCondition	TokenNameIdentifier	 create Only Child Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CSSException	TokenNameIdentifier	 CSS Exception
(	TokenNameLPAREN	
"Not implemented in CSS2"	TokenNameStringLiteral	Not implemented in CSS2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.ConditionFactory#createOnlyTypeCondition()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.ConditionFactory#createOnlyTypeCondition()}. 
public	TokenNamepublic	
Condition	TokenNameIdentifier	 Condition
createOnlyTypeCondition	TokenNameIdentifier	 create Only Type Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CSSException	TokenNameIdentifier	 CSS Exception
(	TokenNameLPAREN	
"Not implemented in CSS2"	TokenNameStringLiteral	Not implemented in CSS2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.ConditionFactory#createContentCondition(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.ConditionFactory#createContentCondition(String)}. 
public	TokenNamepublic	
ContentCondition	TokenNameIdentifier	 Content Condition
createContentCondition	TokenNameIdentifier	 create Content Condition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CSSException	TokenNameIdentifier	 CSS Exception
(	TokenNameLPAREN	
"Not implemented in CSS2"	TokenNameStringLiteral	Not implemented in CSS2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
