package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
io	TokenNameIdentifier	 io
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Signals a failure to parse the POM due to invalid syntax (e.g. non-wellformed XML or unknown elements). * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Signals a failure to parse the POM due to invalid syntax (e.g. non-wellformed XML or unknown elements). * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
ModelParseException	TokenNameIdentifier	 Model Parse Exception
extends	TokenNameextends	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/** * The one-based index of the line containing the error. */	TokenNameCOMMENT_JAVADOC	 The one-based index of the line containing the error. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
/** * The one-based index of the column containing the error. */	TokenNameCOMMENT_JAVADOC	 The one-based index of the column containing the error. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
/** * Creates a new parser exception with the specified details. * * @param message The error message, may be {@code null}. * @param lineNumber The one-based index of the line containing the error or {@code -1} if unknown. * @param columnNumber The one-based index of the column containing the error or {@code -1} if unknown. */	TokenNameCOMMENT_JAVADOC	 Creates a new parser exception with the specified details. * @param message The error message, may be {@code null}. @param lineNumber The one-based index of the line containing the error or {@code -1} if unknown. @param columnNumber The one-based index of the column containing the error or {@code -1} if unknown. 
public	TokenNamepublic	
ModelParseException	TokenNameIdentifier	 Model Parse Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
,	TokenNameCOMMA	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new parser exception with the specified details. * * @param message The error message, may be {@code null}. * @param lineNumber The one-based index of the line containing the error or {@code -1} if unknown. * @param columnNumber The one-based index of the column containing the error or {@code -1} if unknown. * @param cause The nested cause of this error, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new parser exception with the specified details. * @param message The error message, may be {@code null}. @param lineNumber The one-based index of the line containing the error or {@code -1} if unknown. @param columnNumber The one-based index of the column containing the error or {@code -1} if unknown. @param cause The nested cause of this error, may be {@code null}. 
public	TokenNamepublic	
ModelParseException	TokenNameIdentifier	 Model Parse Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
,	TokenNameCOMMA	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the one-based index of the line containing the error. * * @return The one-based index of the line containing the error or a non-positive value if unknown. */	TokenNameCOMMENT_JAVADOC	 Gets the one-based index of the line containing the error. * @return The one-based index of the line containing the error or a non-positive value if unknown. 
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
/** * Gets the one-based index of the column containing the error. * * @return The one-based index of the column containing the error or non-positive value if unknown. */	TokenNameCOMMENT_JAVADOC	 Gets the one-based index of the column containing the error. * @return The one-based index of the column containing the error or non-positive value if unknown. 
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
