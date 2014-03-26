/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
timing	TokenNameIdentifier	 timing
.	TokenNameDOT	
TimedElement	TokenNameIdentifier	 Timed Element
;	TokenNameSEMICOLON	
/** * An exception class for SMIL animation exceptions. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimationException.java 475954 2006-11-16 22:34:04Z cam $ */	TokenNameCOMMENT_JAVADOC	 An exception class for SMIL animation exceptions. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimationException.java 475954 2006-11-16 22:34:04Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimationException	TokenNameIdentifier	 Animation Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
/** * The timed element on which the error occurred. */	TokenNameCOMMENT_JAVADOC	 The timed element on which the error occurred. 
protected	TokenNameprotected	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
/** * The error code. */	TokenNameCOMMENT_JAVADOC	 The error code. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
/** * The parameters to use for the error message. */	TokenNameCOMMENT_JAVADOC	 The parameters to use for the error message. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
/** * The message. */	TokenNameCOMMENT_JAVADOC	 The message. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
/** * Creates a new AnimationException. * @param e the animation element on which the error occurred * @param code the error code * @param params the parameters to use for the error message */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimationException. @param e the animation element on which the error occurred @param code the error code @param params the parameters to use for the error message 
public	TokenNamepublic	
AnimationException	TokenNameIdentifier	 Animation Exception
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the timed element that caused this animation exception. */	TokenNameCOMMENT_JAVADOC	 Returns the timed element that caused this animation exception. 
public	TokenNamepublic	
TimedElement	TokenNameIdentifier	 Timed Element
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the error code. */	TokenNameCOMMENT_JAVADOC	 Returns the error code. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCode	TokenNameIdentifier	 get Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the error message parameters. */	TokenNameCOMMENT_JAVADOC	 Returns the error message parameters. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getParams	TokenNameIdentifier	 get Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the error message according to the error code and parameters. */	TokenNameCOMMENT_JAVADOC	 Returns the error message according to the error code and parameters. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TimedElement	TokenNameIdentifier	 Timed Element
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
