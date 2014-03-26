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
Selector	TokenNameIdentifier	 Selector
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
/** * This class provides an implementation of the * {@link org.w3c.css.sac.DescendantSelector} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultChildSelector.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the {@link org.w3c.css.sac.DescendantSelector} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultChildSelector.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultChildSelector	TokenNameIdentifier	 Default Child Selector
extends	TokenNameextends	
AbstractDescendantSelector	TokenNameIdentifier	 Abstract Descendant Selector
{	TokenNameLBRACE	
/** * Creates a new DefaultChildSelector object. */	TokenNameCOMMENT_JAVADOC	 Creates a new DefaultChildSelector object. 
public	TokenNamepublic	
DefaultChildSelector	TokenNameIdentifier	 Default Child Selector
(	TokenNameLPAREN	
Selector	TokenNameIdentifier	 Selector
ancestor	TokenNameIdentifier	 ancestor
,	TokenNameCOMMA	
SimpleSelector	TokenNameIdentifier	 Simple Selector
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
,	TokenNameCOMMA	
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
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
SAC_CHILD_SELECTOR	TokenNameIdentifier	 SAC  CHILD  SELECTOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a representation of the selector. */	TokenNameCOMMENT_JAVADOC	 Returns a representation of the selector. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleSelector	TokenNameIdentifier	 Simple Selector
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getSimpleSelector	TokenNameIdentifier	 get Simple Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getSelectorType	TokenNameIdentifier	 get Selector Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SAC_PSEUDO_ELEMENT_SELECTOR	TokenNameIdentifier	 SAC  PSEUDO  ELEMENT  SELECTOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
getAncestorSelector	TokenNameIdentifier	 get Ancestor Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getAncestorSelector	TokenNameIdentifier	 get Ancestor Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" > "	TokenNameStringLiteral	 > 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
