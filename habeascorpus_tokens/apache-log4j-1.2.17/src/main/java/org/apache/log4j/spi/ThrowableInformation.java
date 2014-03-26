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
Category	TokenNameIdentifier	 Category
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
DefaultThrowableRenderer	TokenNameIdentifier	 Default Throwable Renderer
;	TokenNameSEMICOLON	
/** * ThrowableInformation is log4j's internal representation of * throwables. It essentially consists of a string array, called * 'rep', where the first element, that is rep[0], represents the * string representation of the throwable (i.e. the value you get * when you do throwable.toString()) and subsequent elements * correspond the stack trace with the top most entry of the stack * corresponding to the second entry of the 'rep' array that is * rep[1]. * * @author Ceki G&uuml;lc&uuml; * * */	TokenNameCOMMENT_JAVADOC	 ThrowableInformation is log4j's internal representation of throwables. It essentially consists of a string array, called 'rep', where the first element, that is rep[0], represents the string representation of the throwable (i.e. the value you get when you do throwable.toString()) and subsequent elements correspond the stack trace with the top most entry of the stack corresponding to the second entry of the 'rep' array that is rep[1]. * @author Ceki G&uuml;lc&uuml; * 
public	TokenNamepublic	
class	TokenNameclass	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4748765566864322735L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
transient	TokenNametransient	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
;	TokenNameSEMICOLON	
private	TokenNameprivate	
transient	TokenNametransient	
Category	TokenNameIdentifier	 Category
category	TokenNameIdentifier	 category
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
throwable	TokenNameIdentifier	 throwable
=	TokenNameEQUAL	
throwable	TokenNameIdentifier	 throwable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new instance. * @param throwable throwable, may not be null. * @param category category used to obtain ThrowableRenderer, may be null. * @since 1.2.16 */	TokenNameCOMMENT_JAVADOC	 Create a new instance. @param throwable throwable, may not be null. @param category category used to obtain ThrowableRenderer, may be null. @since 1.2.16 
public	TokenNamepublic	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
,	TokenNameCOMMA	
Category	TokenNameIdentifier	 Category
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
throwable	TokenNameIdentifier	 throwable
=	TokenNameEQUAL	
throwable	TokenNameIdentifier	 throwable
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
category	TokenNameIdentifier	 category
=	TokenNameEQUAL	
category	TokenNameIdentifier	 category
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create new instance. * @since 1.2.15 * @param r String representation of throwable. */	TokenNameCOMMENT_JAVADOC	 Create new instance. @since 1.2.15 @param r String representation of throwable. 
public	TokenNamepublic	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
getThrowable	TokenNameIdentifier	 get Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
throwable	TokenNameIdentifier	 throwable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rep	TokenNameIdentifier	 rep
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableRenderer	TokenNameIdentifier	 Throwable Renderer
renderer	TokenNameIdentifier	 renderer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LoggerRepository	TokenNameIdentifier	 Logger Repository
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
category	TokenNameIdentifier	 category
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
instanceof	TokenNameinstanceof	
ThrowableRendererSupport	TokenNameIdentifier	 Throwable Renderer Support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
renderer	TokenNameIdentifier	 renderer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ThrowableRendererSupport	TokenNameIdentifier	 Throwable Renderer Support
)	TokenNameRPAREN	
repo	TokenNameIdentifier	 repo
)	TokenNameRPAREN	
.	TokenNameDOT	
getThrowableRenderer	TokenNameIdentifier	 get Throwable Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
renderer	TokenNameIdentifier	 renderer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
DefaultThrowableRenderer	TokenNameIdentifier	 Default Throwable Renderer
.	TokenNameDOT	
render	TokenNameIdentifier	 render
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
doRender	TokenNameIdentifier	 do Render
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
rep	TokenNameIdentifier	 rep
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
