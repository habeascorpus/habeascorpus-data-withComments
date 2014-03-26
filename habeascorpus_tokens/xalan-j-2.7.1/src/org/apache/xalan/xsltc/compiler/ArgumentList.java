/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ArgumentList.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ArgumentList.java 468650 2006-10-28 07:03:30Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
final	TokenNamefinal	
class	TokenNameclass	
ArgumentList	TokenNameIdentifier	 Argument List
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Expression	TokenNameIdentifier	 Expression
_arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ArgumentList	TokenNameIdentifier	 Argument List
_rest	TokenNameIdentifier	 rest
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ArgumentList	TokenNameIdentifier	 Argument List
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
ArgumentList	TokenNameIdentifier	 Argument List
rest	TokenNameIdentifier	 rest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
_rest	TokenNameIdentifier	 rest
=	TokenNameEQUAL	
rest	TokenNameIdentifier	 rest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_rest	TokenNameIdentifier	 rest
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
_arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
_arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
_rest	TokenNameIdentifier	 rest
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
