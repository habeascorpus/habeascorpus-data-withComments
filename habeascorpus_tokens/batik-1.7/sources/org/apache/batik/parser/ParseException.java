/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * This class encapsulates a general parse error or warning. * * <p>This class can contain basic error or warning information from * either the parser or the application. * * <p>If the application needs to pass through other types of * exceptions, it must wrap those exceptions in a ParseException. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ParseException.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class encapsulates a general parse error or warning. * <p>This class can contain basic error or warning information from either the parser or the application. * <p>If the application needs to pass through other types of exceptions, it must wrap those exceptions in a ParseException. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ParseException.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ParseException	TokenNameIdentifier	 Parse Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
/** * @serial The embedded exception if tunnelling, or null. */	TokenNameCOMMENT_JAVADOC	 @serial The embedded exception if tunnelling, or null. 
protected	TokenNameprotected	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
/** * @serial The line number. */	TokenNameCOMMENT_JAVADOC	 @serial The line number. 
protected	TokenNameprotected	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
/** * @serial The column number. */	TokenNameCOMMENT_JAVADOC	 @serial The column number. 
protected	TokenNameprotected	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
/** * Creates a new ParseException. * @param message The error or warning message. * @param line The line of the last parsed character. * @param column The column of the last parsed character. */	TokenNameCOMMENT_JAVADOC	 Creates a new ParseException. @param message The error or warning message. @param line The line of the last parsed character. @param column The column of the last parsed character. 
public	TokenNamepublic	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new ParseException wrapping an existing exception. * * <p>The existing exception will be embedded in the new * one, and its message will become the default message for * the ParseException. * @param e The exception to be wrapped in a ParseException. */	TokenNameCOMMENT_JAVADOC	 Creates a new ParseException wrapping an existing exception. * <p>The existing exception will be embedded in the new one, and its message will become the default message for the ParseException. @param e The exception to be wrapped in a ParseException. 
public	TokenNamepublic	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new ParseException from an existing exception. * * <p>The existing exception will be embedded in the new * one, but the new exception will have its own message. * @param message The detail message. * @param e The exception to be wrapped in a SAXException. */	TokenNameCOMMENT_JAVADOC	 Creates a new ParseException from an existing exception. * <p>The existing exception will be embedded in the new one, but the new exception will have its own message. @param message The detail message. @param e The exception to be wrapped in a SAXException. 
public	TokenNamepublic	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a detail message for this exception. * * <p>If there is a embedded exception, and if the ParseException * has no detail message of its own, this method will return * the detail message from the embedded exception. * @return The error or warning message. */	TokenNameCOMMENT_JAVADOC	 Return a detail message for this exception. * <p>If there is a embedded exception, and if the ParseException has no detail message of its own, this method will return the detail message from the embedded exception. @return The error or warning message. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
exception	TokenNameIdentifier	 exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the embedded exception, if any. * @return The embedded exception, or null if there is none. */	TokenNameCOMMENT_JAVADOC	 Return the embedded exception, if any. @return The embedded exception, or null if there is none. 
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the line of the last parsed character. */	TokenNameCOMMENT_JAVADOC	 Returns the line of the last parsed character. 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the column of the last parsed character. */	TokenNameCOMMENT_JAVADOC	 Returns the column of the last parsed character. 
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
