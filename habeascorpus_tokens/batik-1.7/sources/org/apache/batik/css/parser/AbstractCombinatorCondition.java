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
/** * This class provides an abstract implementation of the * {@link org.w3c.css.sac.CombinatorCondition} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractCombinatorCondition.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides an abstract implementation of the {@link org.w3c.css.sac.CombinatorCondition} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractCombinatorCondition.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractCombinatorCondition	TokenNameIdentifier	 Abstract Combinator Condition
implements	TokenNameimplements	
CombinatorCondition	TokenNameIdentifier	 Combinator Condition
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
/** * <b>SAC</b>: Implements {@link CombinatorCondition#getFirstCondition()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link CombinatorCondition#getFirstCondition()}. 
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
/** * <b>SAC</b>: Implements {@link CombinatorCondition#getSecondCondition()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link CombinatorCondition#getSecondCondition()}. 
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
