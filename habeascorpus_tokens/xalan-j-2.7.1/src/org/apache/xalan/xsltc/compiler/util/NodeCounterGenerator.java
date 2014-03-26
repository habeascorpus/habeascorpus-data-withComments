/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeCounterGenerator.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeCounterGenerator.java 468649 2006-10-28 07:00:55Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
ALOAD	TokenNameIdentifier	 ALOAD
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Instruction	TokenNameIdentifier	 Instruction
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Stylesheet	TokenNameIdentifier	 Stylesheet
;	TokenNameSEMICOLON	
/** * This class implements auxiliary classes needed to compile * patterns in <tt>xsl:number</tt>. These classes inherit from * {Any,Single,Multiple}NodeCounter and override the * <tt>matchFrom</tt> and <tt>matchCount</tt> methods. * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 This class implements auxiliary classes needed to compile patterns in <tt>xsl:number</tt>. These classes inherit from {Any,Single,Multiple}NodeCounter and override the <tt>matchFrom</tt> and <tt>matchCount</tt> methods. @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NodeCounterGenerator	TokenNameIdentifier	 Node Counter Generator
extends	TokenNameextends	
ClassGenerator	TokenNameIdentifier	 Class Generator
{	TokenNameLBRACE	
private	TokenNameprivate	
Instruction	TokenNameIdentifier	 Instruction
_aloadTranslet	TokenNameIdentifier	 aload Translet
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NodeCounterGenerator	TokenNameIdentifier	 Node Counter Generator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
superClassName	TokenNameIdentifier	 super Class Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
int	TokenNameint	
accessFlags	TokenNameIdentifier	 access Flags
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
interfaces	TokenNameIdentifier	 interfaces
,	TokenNameCOMMA	
Stylesheet	TokenNameIdentifier	 Stylesheet
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
superClassName	TokenNameIdentifier	 super Class Name
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
accessFlags	TokenNameIdentifier	 access Flags
,	TokenNameCOMMA	
interfaces	TokenNameIdentifier	 interfaces
,	TokenNameCOMMA	
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the index of the register where "this" (the pointer to * the translet) is stored. */	TokenNameCOMMENT_JAVADOC	 Set the index of the register where "this" (the pointer to the translet) is stored. 
public	TokenNamepublic	
void	TokenNamevoid	
setTransletIndex	TokenNameIdentifier	 set Translet Index
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_aloadTranslet	TokenNameIdentifier	 aload Translet
=	TokenNameEQUAL	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The index of the translet pointer within the execution of * matchFrom or matchCount. * Overridden from ClassGenerator. */	TokenNameCOMMENT_JAVADOC	 The index of the translet pointer within the execution of matchFrom or matchCount. Overridden from ClassGenerator. 
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadTranslet	TokenNameIdentifier	 load Translet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_aloadTranslet	TokenNameIdentifier	 aload Translet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <tt>true</tt> since this class is external to the * translet. */	TokenNameCOMMENT_JAVADOC	 Returns <tt>true</tt> since this class is external to the translet. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
