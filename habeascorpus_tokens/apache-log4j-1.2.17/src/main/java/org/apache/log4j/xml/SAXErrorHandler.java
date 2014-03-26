/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
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
public	TokenNamepublic	
class	TokenNameclass	
SAXErrorHandler	TokenNameIdentifier	 SAX Error Handler
implements	TokenNameimplements	
ErrorHandler	TokenNameIdentifier	 Error Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
final	TokenNamefinal	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emitMessage	TokenNameIdentifier	 emit Message
(	TokenNameLPAREN	
"Continuable parsing error "	TokenNameStringLiteral	Continuable parsing error 
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
final	TokenNamefinal	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emitMessage	TokenNameIdentifier	 emit Message
(	TokenNameLPAREN	
"Fatal parsing error "	TokenNameStringLiteral	Fatal parsing error 
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
final	TokenNamefinal	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emitMessage	TokenNameIdentifier	 emit Message
(	TokenNameLPAREN	
"Parsing warning "	TokenNameStringLiteral	Parsing warning 
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
emitMessage	TokenNameIdentifier	 emit Message
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
final	TokenNamefinal	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" and column "	TokenNameStringLiteral	 and column 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
