/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
;	TokenNameSEMICOLON	
/** * Utility class file routines. This class provides a number of static * utility methods to convert between the formats used in the Java class * file format and those commonly used in Java programming. * * */	TokenNameCOMMENT_JAVADOC	 Utility class file routines. This class provides a number of static utility methods to convert between the formats used in the Java class file format and those commonly used in Java programming. * 
// CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 
public	TokenNamepublic	
class	TokenNameclass	
ClassFileUtils	TokenNameIdentifier	 Class File Utils
{	TokenNameLBRACE	
/** * Convert a class name from class file slash notation to java source * file dot notation. * * @param name the class name in slash notation org/apache/ant * @return the class name in dot notation (eg. java.lang.Object). */	TokenNameCOMMENT_JAVADOC	 Convert a class name from class file slash notation to java source file dot notation. * @param name the class name in slash notation org/apache/ant @return the class name in dot notation (eg. java.lang.Object). 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
convertSlashName	TokenNameIdentifier	 convert Slash Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a class name from java source file dot notation to class file * slash notation.. * * @param dotName the class name in dot notation (eg. java.lang.Object). * @return the class name in slash notation (eg. java/lang/Object). */	TokenNameCOMMENT_JAVADOC	 Convert a class name from java source file dot notation to class file slash notation.. * @param dotName the class name in dot notation (eg. java.lang.Object). @return the class name in slash notation (eg. java/lang/Object). 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
convertDotName	TokenNameIdentifier	 convert Dot Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dotName	TokenNameIdentifier	 dot Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dotName	TokenNameIdentifier	 dot Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
