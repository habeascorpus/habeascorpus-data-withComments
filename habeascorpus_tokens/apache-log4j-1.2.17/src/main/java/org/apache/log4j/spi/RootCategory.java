/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
// Contibutors: Mathias Bogaert 	TokenNameCOMMENT_LINE	Contibutors: Mathias Bogaert 
/** * @deprecated Replaced by {@link RootLogger}. */	TokenNameCOMMENT_JAVADOC	 @deprecated Replaced by {@link RootLogger}. 
final	TokenNamefinal	
public	TokenNamepublic	
class	TokenNameclass	
RootCategory	TokenNameIdentifier	 Root Category
extends	TokenNameextends	
Logger	TokenNameIdentifier	 Logger
{	TokenNameLBRACE	
/** The root category names itself as "root". However, the root category cannot be retrieved by name. */	TokenNameCOMMENT_JAVADOC	 The root category names itself as "root". However, the root category cannot be retrieved by name. 
public	TokenNamepublic	
RootCategory	TokenNameIdentifier	 Root Category
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the assigned level value without walking the category hierarchy. */	TokenNameCOMMENT_JAVADOC	 Return the assigned level value without walking the category hierarchy. 
final	TokenNamefinal	
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
getChainedLevel	TokenNameIdentifier	 get Chained Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Setting a null value to the level of the root category may have catastrophic results. We prevent this here. @since 0.8.3 */	TokenNameCOMMENT_JAVADOC	 Setting a null value to the level of the root category may have catastrophic results. We prevent this here. @since 0.8.3 
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"You have tried to set a null level to root."	TokenNameStringLiteral	You have tried to set a null level to root.
,	TokenNameCOMMA	
new	TokenNamenew	
Throwable	TokenNameIdentifier	 Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
