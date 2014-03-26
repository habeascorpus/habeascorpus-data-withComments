/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ApplyXSLTListener.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ApplyXSLTListener.java 470245 2006-11-02 06:34:33Z minchau $ 
package	TokenNamepackage	
servlet	TokenNameIdentifier	 servlet
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
;	TokenNameSEMICOLON	
/***************************************************************************************************** * ApplyXSLTListener provides a buffered listener essential for capturing, and then subsequently * reporting, XML and XSL processor messages which may be of use in debugging XML+XSL processed at * the server. * * @author Spencer Shepard (sshepard@us.ibm.com) * @author R. Adam King (rak@us.ibm.com) * @author Tom Rowe (trowe@us.ibm.com) * *****************************************************************************************************/	TokenNameCOMMENT_JAVADOC	*************************************************************************************************** ApplyXSLTListener provides a buffered listener essential for capturing, and then subsequently reporting, XML and XSL processor messages which may be of use in debugging XML+XSL processed at the server. * @author Spencer Shepard (sshepard@us.ibm.com) @author R. Adam King (rak@us.ibm.com) @author Tom Rowe (trowe@us.ibm.com) ****************************************************************************************************
public	TokenNamepublic	
class	TokenNameclass	
ApplyXSLTListener	TokenNameIdentifier	 Apply XSLT Listener
extends	TokenNameextends	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
implements	TokenNameimplements	
ErrorHandler	TokenNameIdentifier	 Error Handler
{	TokenNameLBRACE	
/** * Output stream */	TokenNameCOMMENT_JAVADOC	 Output stream 
private	TokenNameprivate	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
outStream	TokenNameIdentifier	 out Stream
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Buffered output stream */	TokenNameCOMMENT_JAVADOC	 Buffered output stream 
public	TokenNamepublic	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
ApplyXSLTListener	TokenNameIdentifier	 Apply XSLT Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a warning. * * @param spe The warning information encapsulated in a SAX parse exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a warning. * @param spe The warning information encapsulated in a SAX parse exception. 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
spe	TokenNameIdentifier	 spe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parser Warning: "	TokenNameStringLiteral	Parser Warning: 
+	TokenNamePLUS	
spe	TokenNameIdentifier	 spe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a recoverable error. * * @param spe The error information encapsulated in a SAX parse exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a recoverable error. * @param spe The error information encapsulated in a SAX parse exception. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
spe	TokenNameIdentifier	 spe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parser Error: "	TokenNameStringLiteral	Parser Error: 
+	TokenNamePLUS	
spe	TokenNameIdentifier	 spe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a non-recoverable error. * * @param spe The error information encapsulated in a SAX parse exception. * @exception SAXException Always thrown */	TokenNameCOMMENT_JAVADOC	 Receive notification of a non-recoverable error. * @param spe The error information encapsulated in a SAX parse exception. @exception SAXException Always thrown 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
spe	TokenNameIdentifier	 spe
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parser Fatal Error: "	TokenNameStringLiteral	Parser Fatal Error: 
+	TokenNamePLUS	
spe	TokenNameIdentifier	 spe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
spe	TokenNameIdentifier	 spe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the buffered processing message(s). * @return Buffered processing message(s) */	TokenNameCOMMENT_JAVADOC	 Returns the buffered processing message(s). @return Buffered processing message(s) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outStream	TokenNameIdentifier	 out Stream
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
