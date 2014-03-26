/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Tests for LocationInfo. */	TokenNameCOMMENT_JAVADOC	 Tests for LocationInfo. 
public	TokenNamepublic	
class	TokenNameclass	
LocationInfoTest	TokenNameIdentifier	 Location Info Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Tests four parameter constructor. */	TokenNameCOMMENT_JAVADOC	 Tests four parameter constructor. 
public	TokenNamepublic	
void	TokenNamevoid	
testFourParamConstructor	TokenNameIdentifier	 test Four Param Constructor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
LocationInfoTest	TokenNameIdentifier	 Location Info Test
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
"testFourParamConstructor"	TokenNameStringLiteral	testFourParamConstructor
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
"LocationInfoTest.java"	TokenNameStringLiteral	LocationInfoTest.java
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
"41"	TokenNameStringLiteral	41
;	TokenNameSEMICOLON	
LocationInfo	TokenNameIdentifier	 Location Info
li	TokenNameIdentifier	 li
=	TokenNameEQUAL	
new	TokenNamenew	
LocationInfo	TokenNameIdentifier	 Location Info
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
lineNumber	TokenNameIdentifier	 line Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getMethodName	TokenNameIdentifier	 get Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getFileName	TokenNameIdentifier	 get File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
lineNumber	TokenNameIdentifier	 line Number
,	TokenNameCOMMA	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
methodName	TokenNameIdentifier	 method Name
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
lineNumber	TokenNameIdentifier	 line Number
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
,	TokenNameCOMMA	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Class with name that is a substring of its caller. */	TokenNameCOMMENT_JAVADOC	 Class with name that is a substring of its caller. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NameSubstring	TokenNameIdentifier	 Name Substring
{	TokenNameLBRACE	
/** * Construct a LocationInfo. Location should be immediate caller of this method. * @return location info. */	TokenNameCOMMENT_JAVADOC	 Construct a LocationInfo. Location should be immediate caller of this method. @return location info. 
public	TokenNamepublic	
static	TokenNamestatic	
LocationInfo	TokenNameIdentifier	 Location Info
getInfo	TokenNameIdentifier	 get Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LocationInfo	TokenNameIdentifier	 Location Info
(	TokenNameLPAREN	
new	TokenNamenew	
Throwable	TokenNameIdentifier	 Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
NameSubstring	TokenNameIdentifier	 Name Substring
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Class whose name is contains the name of the class that obtains the LocationInfo. */	TokenNameCOMMENT_JAVADOC	 Class whose name is contains the name of the class that obtains the LocationInfo. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NameSubstringCaller	TokenNameIdentifier	 Name Substring Caller
{	TokenNameLBRACE	
/** * Construct a locationInfo. Location should be this location. * @return location info. */	TokenNameCOMMENT_JAVADOC	 Construct a locationInfo. Location should be this location. @return location info. 
public	TokenNamepublic	
static	TokenNamestatic	
LocationInfo	TokenNameIdentifier	 Location Info
getInfo	TokenNameIdentifier	 get Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NameSubstring	TokenNameIdentifier	 Name Substring
.	TokenNameDOT	
getInfo	TokenNameIdentifier	 get Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests creation of location info when the logger class name * is a substring of one of the other classes in the stack trace. * See bug 44888. */	TokenNameCOMMENT_JAVADOC	 Tests creation of location info when the logger class name is a substring of one of the other classes in the stack trace. See bug 44888. 
public	TokenNamepublic	
void	TokenNamevoid	
testLocationInfo	TokenNameIdentifier	 test Location Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocationInfo	TokenNameIdentifier	 Location Info
li	TokenNameIdentifier	 li
=	TokenNameEQUAL	
NameSubstringCaller	TokenNameIdentifier	 Name Substring Caller
.	TokenNameDOT	
getInfo	TokenNameIdentifier	 get Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NameSubstringCaller	TokenNameIdentifier	 Name Substring Caller
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"getInfo"	TokenNameStringLiteral	getInfo
,	TokenNameCOMMA	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getMethodName	TokenNameIdentifier	 get Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
