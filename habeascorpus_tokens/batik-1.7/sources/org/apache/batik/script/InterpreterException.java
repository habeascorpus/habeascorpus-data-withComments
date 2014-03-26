/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
;	TokenNameSEMICOLON	
/** * An exception that will be thrown when a problem is encountered in the * script by an <code>Interpreter</code> interface implementation. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: InterpreterException.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An exception that will be thrown when a problem is encountered in the script by an <code>Interpreter</code> interface implementation. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: InterpreterException.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
InterpreterException	TokenNameIdentifier	 Interpreter Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// -1 when unknown 	TokenNameCOMMENT_LINE	-1 when unknown 
private	TokenNameprivate	
int	TokenNameint	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// -1 when unknown 	TokenNameCOMMENT_LINE	-1 when unknown 
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
embedded	TokenNameIdentifier	 embedded
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// null when unknown 	TokenNameCOMMENT_LINE	null when unknown 
/** * Builds an instance of <code>InterpreterException</code>. * @param message the <code>Exception</code> message. * @param lineno the number of the line the error occurs. * @param columnno the number of the column the error occurs. */	TokenNameCOMMENT_JAVADOC	 Builds an instance of <code>InterpreterException</code>. @param message the <code>Exception</code> message. @param lineno the number of the line the error occurs. @param columnno the number of the column the error occurs. 
public	TokenNamepublic	
InterpreterException	TokenNameIdentifier	 Interpreter Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
lineno	TokenNameIdentifier	 lineno
,	TokenNameCOMMA	
int	TokenNameint	
columnno	TokenNameIdentifier	 columnno
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
lineno	TokenNameIdentifier	 lineno
;	TokenNameSEMICOLON	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
columnno	TokenNameIdentifier	 columnno
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds an instance of <code>InterpreterException</code>. * @param exception the embedded exception. * @param message the <code>Exception</code> message. * @param lineno the number of the line the error occurs. * @param columnno the number of the column the error occurs. */	TokenNameCOMMENT_JAVADOC	 Builds an instance of <code>InterpreterException</code>. @param exception the embedded exception. @param message the <code>Exception</code> message. @param lineno the number of the line the error occurs. @param columnno the number of the column the error occurs. 
public	TokenNamepublic	
InterpreterException	TokenNameIdentifier	 Interpreter Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
lineno	TokenNameIdentifier	 lineno
,	TokenNameCOMMA	
int	TokenNameint	
columnno	TokenNameIdentifier	 columnno
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
lineno	TokenNameIdentifier	 lineno
,	TokenNameCOMMA	
columnno	TokenNameIdentifier	 columnno
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
embedded	TokenNameIdentifier	 embedded
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the line number where the error occurs. If this value is not * known, returns -1. */	TokenNameCOMMENT_JAVADOC	 Returns the line number where the error occurs. If this value is not known, returns -1. 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the column number where the error occurs. If this value is not * known, returns -1. */	TokenNameCOMMENT_JAVADOC	 Returns the column number where the error occurs. If this value is not known, returns -1. 
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the embedded exception. If no embedded exception is set, * returns null. */	TokenNameCOMMENT_JAVADOC	 Returns the embedded exception. If no embedded exception is set, returns null. 
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
embedded	TokenNameIdentifier	 embedded
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the message of this exception. If an error message has * been specified, returns that one. Otherwise, return the error message * of enclosed exception or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the message of this exception. If an error message has been specified, returns that one. Otherwise, return the error message of enclosed exception or null if any. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
embedded	TokenNameIdentifier	 embedded
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
embedded	TokenNameIdentifier	 embedded
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
