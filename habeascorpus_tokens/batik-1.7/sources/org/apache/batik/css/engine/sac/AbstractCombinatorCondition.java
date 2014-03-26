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
/** * This class provides an abstract implementation of the {@link * org.w3c.css.sac.CombinatorCondition} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractCombinatorCondition.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides an abstract implementation of the {@link org.w3c.css.sac.CombinatorCondition} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractCombinatorCondition.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractCombinatorCondition	TokenNameIdentifier	 Abstract Combinator Condition
implements	TokenNameimplements	
CombinatorCondition	TokenNameIdentifier	 Combinator Condition
,	TokenNameCOMMA	
ExtendedCondition	TokenNameIdentifier	 Extended Condition
{	TokenNameLBRACE	
/** * The first condition. */	TokenNameCOMMENT_JAVADOC	 The first condition. 
protected	TokenNameprotected	
Condition	TokenNameIdentifier	 Condition
firstCondition	TokenNameIdentifier	 first Condition
;	TokenNameSEMICOLON	
/** * The second condition. */	TokenNameCOMMENT_JAVADOC	 The second condition. 
protected	TokenNameprotected	
Condition	TokenNameIdentifier	 Condition
secondCondition	TokenNameIdentifier	 second Condition
;	TokenNameSEMICOLON	
/** * Creates a new CombinatorCondition object. */	TokenNameCOMMENT_JAVADOC	 Creates a new CombinatorCondition object. 
protected	TokenNameprotected	
AbstractCombinatorCondition	TokenNameIdentifier	 Abstract Combinator Condition
(	TokenNameLPAREN	
Condition	TokenNameIdentifier	 Condition
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
Condition	TokenNameIdentifier	 Condition
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstCondition	TokenNameIdentifier	 first Condition
=	TokenNameEQUAL	
c1	TokenNameIdentifier	 c1
;	TokenNameSEMICOLON	
secondCondition	TokenNameIdentifier	 second Condition
=	TokenNameEQUAL	
c2	TokenNameIdentifier	 c2
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
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AbstractCombinatorCondition	TokenNameIdentifier	 Abstract Combinator Condition
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractCombinatorCondition	TokenNameIdentifier	 Abstract Combinator Condition
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
firstCondition	TokenNameIdentifier	 first Condition
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
firstCondition	TokenNameIdentifier	 first Condition
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
secondCondition	TokenNameIdentifier	 second Condition
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
secondCondition	TokenNameIdentifier	 second Condition
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specificity of this condition. */	TokenNameCOMMENT_JAVADOC	 Returns the specificity of this condition. 
public	TokenNamepublic	
int	TokenNameint	
getSpecificity	TokenNameIdentifier	 get Specificity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedCondition	TokenNameIdentifier	 Extended Condition
)	TokenNameRPAREN	
getFirstCondition	TokenNameIdentifier	 get First Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSpecificity	TokenNameIdentifier	 get Specificity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedCondition	TokenNameIdentifier	 Extended Condition
)	TokenNameRPAREN	
getSecondCondition	TokenNameIdentifier	 get Second Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSpecificity	TokenNameIdentifier	 get Specificity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.CombinatorCondition#getFirstCondition()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.CombinatorCondition#getFirstCondition()}. 
public	TokenNamepublic	
Condition	TokenNameIdentifier	 Condition
getFirstCondition	TokenNameIdentifier	 get First Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
firstCondition	TokenNameIdentifier	 first Condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.CombinatorCondition#getSecondCondition()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.CombinatorCondition#getSecondCondition()}. 
public	TokenNamepublic	
Condition	TokenNameIdentifier	 Condition
getSecondCondition	TokenNameIdentifier	 get Second Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
secondCondition	TokenNameIdentifier	 second Condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
