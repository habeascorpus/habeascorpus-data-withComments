package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An exception occurring during the execution of a plugin. * <br/> * Throwing this exception causes a "BUILD ERROR" message to be displayed. * * @author Brett Porter */	TokenNameCOMMENT_JAVADOC	 An exception occurring during the execution of a plugin. <br/> Throwing this exception causes a "BUILD ERROR" message to be displayed. * @author Brett Porter 
public	TokenNamepublic	
class	TokenNameclass	
MojoExecutionException	TokenNameIdentifier	 Mojo Execution Exception
extends	TokenNameextends	
AbstractMojoExecutionException	TokenNameIdentifier	 Abstract Mojo Execution Exception
{	TokenNameLBRACE	
/** * Construct a new <code>MojoExecutionException</code> exception providing the source and a short and long message: * these messages are used to improve the message written at the end of Maven build. * * @param source * @param shortMessage * @param longMessage */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>MojoExecutionException</code> exception providing the source and a short and long message: these messages are used to improve the message written at the end of Maven build. * @param source @param shortMessage @param longMessage 
public	TokenNamepublic	
MojoExecutionException	TokenNameIdentifier	 Mojo Execution Exception
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
shortMessage	TokenNameIdentifier	 short Message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
longMessage	TokenNameIdentifier	 long Message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
shortMessage	TokenNameIdentifier	 short Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
longMessage	TokenNameIdentifier	 long Message
=	TokenNameEQUAL	
longMessage	TokenNameIdentifier	 long Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>MojoExecutionException</code> exception wrapping an underlying <code>Exception</code> * and providing a <code>message</code>. * * @param message * @param cause */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>MojoExecutionException</code> exception wrapping an underlying <code>Exception</code> and providing a <code>message</code>. * @param message @param cause 
public	TokenNamepublic	
MojoExecutionException	TokenNameIdentifier	 Mojo Execution Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>MojoExecutionException</code> exception wrapping an underlying <code>Throwable</code> * and providing a <code>message</code>. * * @param message * @param cause */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>MojoExecutionException</code> exception wrapping an underlying <code>Throwable</code> and providing a <code>message</code>. * @param message @param cause 
public	TokenNamepublic	
MojoExecutionException	TokenNameIdentifier	 Mojo Execution Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>MojoExecutionException</code> exception providing a <code>message</code>. * * @param message */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>MojoExecutionException</code> exception providing a <code>message</code>. * @param message 
public	TokenNamepublic	
MojoExecutionException	TokenNameIdentifier	 Mojo Execution Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
