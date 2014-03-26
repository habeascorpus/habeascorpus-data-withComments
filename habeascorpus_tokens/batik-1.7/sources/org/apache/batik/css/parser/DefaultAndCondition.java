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
/** * This class provides an implementation of the * {@link org.w3c.css.sac.CombinatorCondition} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultAndCondition.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the {@link org.w3c.css.sac.CombinatorCondition} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultAndCondition.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultAndCondition	TokenNameIdentifier	 Default And Condition
extends	TokenNameextends	
AbstractCombinatorCondition	TokenNameIdentifier	 Abstract Combinator Condition
{	TokenNameLBRACE	
/** * Creates a new CombinatorCondition object. */	TokenNameCOMMENT_JAVADOC	 Creates a new CombinatorCondition object. 
public	TokenNamepublic	
DefaultAndCondition	TokenNameIdentifier	 Default And Condition
(	TokenNameLPAREN	
Condition	TokenNameIdentifier	 Condition
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
Condition	TokenNameIdentifier	 Condition
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
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
SAC_AND_CONDITION	TokenNameIdentifier	 SAC  AND  CONDITION
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
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
getFirstCondition	TokenNameIdentifier	 get First Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getSecondCondition	TokenNameIdentifier	 get Second Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
