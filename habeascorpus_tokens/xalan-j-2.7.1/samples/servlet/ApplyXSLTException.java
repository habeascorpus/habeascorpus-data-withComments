/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/***************************************************************************************************** * * Wrapper for exceptions occurring during apply XSL processing. * Allows for exceptions to be returned with an associated HTTP Status Code. * * @author Spencer Shepard (sshepard@us.ibm.com) * @author R. Adam King (rak@us.ibm.com) * @author Tom Rowe (trowe@us.ibm.com) * *****************************************************************************************************/	TokenNameCOMMENT_JAVADOC	*************************************************************************************************** * Wrapper for exceptions occurring during apply XSL processing. Allows for exceptions to be returned with an associated HTTP Status Code. * @author Spencer Shepard (sshepard@us.ibm.com) @author R. Adam King (rak@us.ibm.com) @author Tom Rowe (trowe@us.ibm.com) ****************************************************************************************************
package	TokenNamepackage	
servlet	TokenNameIdentifier	 servlet
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/** * Exception Message. * @serial */	TokenNameCOMMENT_JAVADOC	 Exception Message. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
myMessage	TokenNameIdentifier	 my Message
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * HTTP Status Code. Default= internal server error. * @serial */	TokenNameCOMMENT_JAVADOC	 HTTP Status Code. Default= internal server error. @serial 
private	TokenNameprivate	
int	TokenNameint	
myHttpStatusCode	TokenNameIdentifier	 my Http Status Code
=	TokenNameEQUAL	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
servlet	TokenNameIdentifier	 servlet
.	TokenNameDOT	
http	TokenNameIdentifier	 http
.	TokenNameDOT	
HttpServletResponse	TokenNameIdentifier	 Http Servlet Response
.	TokenNameDOT	
SC_INTERNAL_SERVER_ERROR	TokenNameIdentifier	 SC  INTERNAL  SERVER  ERROR
;	TokenNameSEMICOLON	
/** * Wrapped exception * @serial */	TokenNameCOMMENT_JAVADOC	 Wrapped exception @serial 
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
myException	TokenNameIdentifier	 my Exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor for exception with no additional detail. */	TokenNameCOMMENT_JAVADOC	 Constructor for exception with no additional detail. 
public	TokenNamepublic	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for exception with message. * @param s Exception message */	TokenNameCOMMENT_JAVADOC	 Constructor for exception with message. @param s Exception message 
public	TokenNamepublic	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myMessage	TokenNameIdentifier	 my Message
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for exception with HTTP status code. * @param hsc Valid status code from javax.servlet.http.HttpServletResponse */	TokenNameCOMMENT_JAVADOC	 Constructor for exception with HTTP status code. @param hsc Valid status code from javax.servlet.http.HttpServletResponse 
public	TokenNamepublic	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
int	TokenNameint	
hsc	TokenNameIdentifier	 hsc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myHttpStatusCode	TokenNameIdentifier	 my Http Status Code
=	TokenNameEQUAL	
hsc	TokenNameIdentifier	 hsc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for exception with message and HTTP status code. * @param s Exception message * @param hsc Valid status code from javax.servlet.http.HttpServletResponse */	TokenNameCOMMENT_JAVADOC	 Constructor for exception with message and HTTP status code. @param s Exception message @param hsc Valid status code from javax.servlet.http.HttpServletResponse 
public	TokenNamepublic	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
hsc	TokenNameIdentifier	 hsc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myHttpStatusCode	TokenNameIdentifier	 my Http Status Code
=	TokenNameEQUAL	
hsc	TokenNameIdentifier	 hsc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for exception. * @param e Exception to be wrapped. */	TokenNameCOMMENT_JAVADOC	 Constructor for exception. @param e Exception to be wrapped. 
public	TokenNamepublic	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myMessage	TokenNameIdentifier	 my Message
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myException	TokenNameIdentifier	 my Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for passed exception with message. * @param s Exception message * @param e Exception to be wrapped. */	TokenNameCOMMENT_JAVADOC	 Constructor for passed exception with message. @param s Exception message @param e Exception to be wrapped. 
public	TokenNamepublic	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myMessage	TokenNameIdentifier	 my Message
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
myException	TokenNameIdentifier	 my Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for passed exception with HTTP status code. * @param e Exception to be wrapped. * @param hsc Valid status code from javax.servlet.http.HttpServletResponse */	TokenNameCOMMENT_JAVADOC	 Constructor for passed exception with HTTP status code. @param e Exception to be wrapped. @param hsc Valid status code from javax.servlet.http.HttpServletResponse 
public	TokenNamepublic	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
int	TokenNameint	
hsc	TokenNameIdentifier	 hsc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myMessage	TokenNameIdentifier	 my Message
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myException	TokenNameIdentifier	 my Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
myHttpStatusCode	TokenNameIdentifier	 my Http Status Code
=	TokenNameEQUAL	
hsc	TokenNameIdentifier	 hsc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for passed exception with HTTP status code and message. * @param s Exception message * @param e Exception to be wrapped. * @param hsc Valid status code from javax.servlet.http.HttpServletResponse */	TokenNameCOMMENT_JAVADOC	 Constructor for passed exception with HTTP status code and message. @param s Exception message @param e Exception to be wrapped. @param hsc Valid status code from javax.servlet.http.HttpServletResponse 
public	TokenNamepublic	
ApplyXSLTException	TokenNameIdentifier	 Apply XSLT Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
int	TokenNameint	
hsc	TokenNameIdentifier	 hsc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myMessage	TokenNameIdentifier	 my Message
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
myException	TokenNameIdentifier	 my Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
myHttpStatusCode	TokenNameIdentifier	 my Http Status Code
=	TokenNameEQUAL	
hsc	TokenNameIdentifier	 hsc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns exception message. * @return exception message */	TokenNameCOMMENT_JAVADOC	 Returns exception message. @return exception message 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
myMessage	TokenNameIdentifier	 my Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends string to exception message. * @param s String to be added to message */	TokenNameCOMMENT_JAVADOC	 Appends string to exception message. @param s String to be added to message 
public	TokenNamepublic	
void	TokenNamevoid	
appendMessage	TokenNameIdentifier	 append Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
myMessage	TokenNameIdentifier	 my Message
+=	TokenNamePLUS_EQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the wrapped exception. * @return Wrapped exception */	TokenNameCOMMENT_JAVADOC	 Returns the wrapped exception. @return Wrapped exception 
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
myException	TokenNameIdentifier	 my Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the HTTP status code associated with the exception. * @return Valid status code from javax.servlet.http.HttpServletResponse */	TokenNameCOMMENT_JAVADOC	 Returns the HTTP status code associated with the exception. @return Valid status code from javax.servlet.http.HttpServletResponse 
public	TokenNamepublic	
int	TokenNameint	
getStatusCode	TokenNameIdentifier	 get Status Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
myHttpStatusCode	TokenNameIdentifier	 my Http Status Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
