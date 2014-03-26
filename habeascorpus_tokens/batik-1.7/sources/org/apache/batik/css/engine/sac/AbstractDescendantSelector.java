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
DescendantSelector	TokenNameIdentifier	 Descendant Selector
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
/** * This class provides an abstract implementation of the {@link * org.w3c.css.sac.DescendantSelector} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractDescendantSelector.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides an abstract implementation of the {@link org.w3c.css.sac.DescendantSelector} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractDescendantSelector.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractDescendantSelector	TokenNameIdentifier	 Abstract Descendant Selector
implements	TokenNameimplements	
DescendantSelector	TokenNameIdentifier	 Descendant Selector
,	TokenNameCOMMA	
ExtendedSelector	TokenNameIdentifier	 Extended Selector
{	TokenNameLBRACE	
/** * The ancestor selector. */	TokenNameCOMMENT_JAVADOC	 The ancestor selector. 
protected	TokenNameprotected	
Selector	TokenNameIdentifier	 Selector
ancestorSelector	TokenNameIdentifier	 ancestor Selector
;	TokenNameSEMICOLON	
/** * The simple selector. */	TokenNameCOMMENT_JAVADOC	 The simple selector. 
protected	TokenNameprotected	
SimpleSelector	TokenNameIdentifier	 Simple Selector
simpleSelector	TokenNameIdentifier	 simple Selector
;	TokenNameSEMICOLON	
/** * Creates a new DescendantSelector object. */	TokenNameCOMMENT_JAVADOC	 Creates a new DescendantSelector object. 
protected	TokenNameprotected	
AbstractDescendantSelector	TokenNameIdentifier	 Abstract Descendant Selector
(	TokenNameLPAREN	
Selector	TokenNameIdentifier	 Selector
ancestor	TokenNameIdentifier	 ancestor
,	TokenNameCOMMA	
SimpleSelector	TokenNameIdentifier	 Simple Selector
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ancestorSelector	TokenNameIdentifier	 ancestor Selector
=	TokenNameEQUAL	
ancestor	TokenNameIdentifier	 ancestor
;	TokenNameSEMICOLON	
simpleSelector	TokenNameIdentifier	 simple Selector
=	TokenNameEQUAL	
simple	TokenNameIdentifier	 simple
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
AbstractDescendantSelector	TokenNameIdentifier	 Abstract Descendant Selector
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractDescendantSelector	TokenNameIdentifier	 Abstract Descendant Selector
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
simpleSelector	TokenNameIdentifier	 simple Selector
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
simpleSelector	TokenNameIdentifier	 simple Selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specificity of this selector. */	TokenNameCOMMENT_JAVADOC	 Returns the specificity of this selector. 
public	TokenNamepublic	
int	TokenNameint	
getSpecificity	TokenNameIdentifier	 get Specificity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedSelector	TokenNameIdentifier	 Extended Selector
)	TokenNameRPAREN	
ancestorSelector	TokenNameIdentifier	 ancestor Selector
)	TokenNameRPAREN	
.	TokenNameDOT	
getSpecificity	TokenNameIdentifier	 get Specificity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedSelector	TokenNameIdentifier	 Extended Selector
)	TokenNameRPAREN	
simpleSelector	TokenNameIdentifier	 simple Selector
)	TokenNameRPAREN	
.	TokenNameDOT	
getSpecificity	TokenNameIdentifier	 get Specificity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DescendantSelector#getAncestorSelector()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DescendantSelector#getAncestorSelector()}. 
public	TokenNamepublic	
Selector	TokenNameIdentifier	 Selector
getAncestorSelector	TokenNameIdentifier	 get Ancestor Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ancestorSelector	TokenNameIdentifier	 ancestor Selector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DescendantSelector#getSimpleSelector()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DescendantSelector#getSimpleSelector()}. 
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
}	TokenNameRBRACE	
