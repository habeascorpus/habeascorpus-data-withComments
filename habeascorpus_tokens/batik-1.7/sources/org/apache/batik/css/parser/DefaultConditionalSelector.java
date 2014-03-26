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
ConditionalSelector	TokenNameIdentifier	 Conditional Selector
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
SimpleSelector	TokenNameIdentifier	 Simple Selector
;	TokenNameSEMICOLON	
/** * This class provides an implementation of the * {@link org.w3c.css.sac.ConditionalSelector} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultConditionalSelector.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the {@link org.w3c.css.sac.ConditionalSelector} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultConditionalSelector.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultConditionalSelector	TokenNameIdentifier	 Default Conditional Selector
implements	TokenNameimplements	
ConditionalSelector	TokenNameIdentifier	 Conditional Selector
{	TokenNameLBRACE	
/** * The simple selector. */	TokenNameCOMMENT_JAVADOC	 The simple selector. 
protected	TokenNameprotected	
SimpleSelector	TokenNameIdentifier	 Simple Selector
simpleSelector	TokenNameIdentifier	 simple Selector
;	TokenNameSEMICOLON	
/** * The condition. */	TokenNameCOMMENT_JAVADOC	 The condition. 
protected	TokenNameprotected	
Condition	TokenNameIdentifier	 Condition
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
/** * Creates a new ConditionalSelector object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ConditionalSelector object. 
public	TokenNamepublic	
DefaultConditionalSelector	TokenNameIdentifier	 Default Conditional Selector
(	TokenNameLPAREN	
SimpleSelector	TokenNameIdentifier	 Simple Selector
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Condition	TokenNameIdentifier	 Condition
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
simpleSelector	TokenNameIdentifier	 simple Selector
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
condition	TokenNameIdentifier	 condition
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.Selector#getSelectorType()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Selector#getSelectorType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getSelectorType	TokenNameIdentifier	 get Selector Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SAC_CONDITIONAL_SELECTOR	TokenNameIdentifier	 SAC  CONDITIONAL  SELECTOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.ConditionalSelector#getSimpleSelector()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.ConditionalSelector#getSimpleSelector()}. 
public	TokenNamepublic	
SimpleSelector	TokenNameIdentifier	 Simple Selector
getSimpleSelector	TokenNameIdentifier	 get Simple Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
simpleSelector	TokenNameIdentifier	 simple Selector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.ConditionalSelector#getCondition()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.ConditionalSelector#getCondition()}. 
public	TokenNamepublic	
Condition	TokenNameIdentifier	 Condition
getCondition	TokenNameIdentifier	 get Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a representation of the selector. */	TokenNameCOMMENT_JAVADOC	 Returns a representation of the selector. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
simpleSelector	TokenNameIdentifier	 simple Selector
)	TokenNameRPAREN	
+	TokenNamePLUS	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
