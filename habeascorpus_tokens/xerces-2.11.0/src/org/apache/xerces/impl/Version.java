/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
/** * This class defines the version number of the parser. * * @version $Id: Version.java 446761 2006-09-15 21:59:29Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class defines the version number of the parser. * @version $Id: Version.java 446761 2006-09-15 21:59:29Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
Version	TokenNameIdentifier	 Version
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Version string. * @deprecated getVersion() should be used instead. */	TokenNameCOMMENT_JAVADOC	 Version string. @deprecated getVersion() should be used instead. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fVersion	TokenNameIdentifier	 f Version
=	TokenNameEQUAL	
"@@VERSION@@"	TokenNameStringLiteral	@@VERSION@@
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fImmutableVersion	TokenNameIdentifier	 f Immutable Version
=	TokenNameEQUAL	
"@@VERSION@@"	TokenNameStringLiteral	@@VERSION@@
;	TokenNameSEMICOLON	
// public methods 	TokenNameCOMMENT_LINE	public methods 
/* Print out the version information. * @return the version of the parser. */	TokenNameCOMMENT_BLOCK	 Print out the version information. @return the version of the parser. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fImmutableVersion	TokenNameIdentifier	 f Immutable Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getVersion(): String 	TokenNameCOMMENT_LINE	getVersion(): String 
// 	TokenNameCOMMENT_LINE	 
// MAIN 	TokenNameCOMMENT_LINE	MAIN 
// 	TokenNameCOMMENT_LINE	 
/** * Prints out the version number to System.out. This is needed * for the build system. */	TokenNameCOMMENT_JAVADOC	 Prints out the version number to System.out. This is needed for the build system. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
fVersion	TokenNameIdentifier	 f Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class Version 	TokenNameCOMMENT_LINE	class Version 
