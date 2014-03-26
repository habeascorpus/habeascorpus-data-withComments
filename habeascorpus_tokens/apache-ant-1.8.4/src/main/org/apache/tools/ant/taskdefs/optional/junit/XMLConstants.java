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
junit	TokenNameIdentifier	 junit
;	TokenNameSEMICOLON	
/** * <p> Interface groups XML constants. * Interface that groups all constants used throughout the <tt>XML</tt> * documents that are generated by the <tt>XMLJUnitResultFormatter</tt>. * <p> * As of now the DTD is: * <code><pre> * &lt;!ELEMENT testsuites (testsuite*)&gt; * * &lt;!ELEMENT testsuite (properties, testcase*, * failure?, error?, * system-out?, system-err?)&gt; * &lt;!ATTLIST testsuite name CDATA #REQUIRED&gt; * &lt;!ATTLIST testsuite tests CDATA #REQUIRED&gt; * &lt;!ATTLIST testsuite failures CDATA #REQUIRED&gt; * &lt;!ATTLIST testsuite errors CDATA #REQUIRED&gt; * &lt;!ATTLIST testsuite time CDATA #REQUIRED&gt; * &lt;!ATTLIST testsuite package CDATA #IMPLIED&gt; * &lt;!ATTLIST testsuite id CDATA #IMPLIED&gt; * * * &lt;!ELEMENT properties (property*)&gt; * * &lt;!ELEMENT property EMPTY&gt; * &lt;!ATTLIST property name CDATA #REQUIRED&gt; * &lt;!ATTLIST property value CDATA #REQUIRED&gt; * * &lt;!ELEMENT testcase (failure?, error?)&gt; * &lt;!ATTLIST testcase name CDATA #REQUIRED&gt; * &lt;!ATTLIST testcase classname CDATA #IMPLIED&gt; * &lt;!ATTLIST testcase time CDATA #REQUIRED&gt; * * &lt;!ELEMENT failure (#PCDATA)&gt; * &lt;!ATTLIST failure message CDATA #IMPLIED&gt; * &lt;!ATTLIST failure type CDATA #REQUIRED&gt; * * &lt;!ELEMENT error (#PCDATA)&gt; * &lt;!ATTLIST error message CDATA #IMPLIED&gt; * &lt;!ATTLIST error type CDATA #REQUIRED&gt; * * &lt;!ELEMENT system-err (#PCDATA)&gt; * * &lt;!ELEMENT system-out (#PCDATA)&gt; * * </pre></code> * @see XMLJUnitResultFormatter * @see XMLResultAggregator */	TokenNameCOMMENT_JAVADOC	 <p> Interface groups XML constants. Interface that groups all constants used throughout the <tt>XML</tt> documents that are generated by the <tt>XMLJUnitResultFormatter</tt>. <p> As of now the DTD is: <code><pre> &lt;!ELEMENT testsuites (testsuite*)&gt; * &lt;!ELEMENT testsuite (properties, testcase*, failure?, error?, system-out?, system-err?)&gt; &lt;!ATTLIST testsuite name CDATA #REQUIRED&gt; &lt;!ATTLIST testsuite tests CDATA #REQUIRED&gt; &lt;!ATTLIST testsuite failures CDATA #REQUIRED&gt; &lt;!ATTLIST testsuite errors CDATA #REQUIRED&gt; &lt;!ATTLIST testsuite time CDATA #REQUIRED&gt; &lt;!ATTLIST testsuite package CDATA #IMPLIED&gt; &lt;!ATTLIST testsuite id CDATA #IMPLIED&gt; * &lt;!ELEMENT properties (property*)&gt; * &lt;!ELEMENT property EMPTY&gt; &lt;!ATTLIST property name CDATA #REQUIRED&gt; &lt;!ATTLIST property value CDATA #REQUIRED&gt; * &lt;!ELEMENT testcase (failure?, error?)&gt; &lt;!ATTLIST testcase name CDATA #REQUIRED&gt; &lt;!ATTLIST testcase classname CDATA #IMPLIED&gt; &lt;!ATTLIST testcase time CDATA #REQUIRED&gt; * &lt;!ELEMENT failure (#PCDATA)&gt; &lt;!ATTLIST failure message CDATA #IMPLIED&gt; &lt;!ATTLIST failure type CDATA #REQUIRED&gt; * &lt;!ELEMENT error (#PCDATA)&gt; &lt;!ATTLIST error message CDATA #IMPLIED&gt; &lt;!ATTLIST error type CDATA #REQUIRED&gt; * &lt;!ELEMENT system-err (#PCDATA)&gt; * &lt;!ELEMENT system-out (#PCDATA)&gt; * </pre></code> @see XMLJUnitResultFormatter @see XMLResultAggregator 
// CheckStyle:InterfaceIsTypeCheck OFF (bc) 	TokenNameCOMMENT_LINE	CheckStyle:InterfaceIsTypeCheck OFF (bc) 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLConstants	TokenNameIdentifier	 XML Constants
{	TokenNameLBRACE	
/** the testsuites element for the aggregate document */	TokenNameCOMMENT_JAVADOC	 the testsuites element for the aggregate document 
String	TokenNameIdentifier	 String
TESTSUITES	TokenNameIdentifier	 TESTSUITES
=	TokenNameEQUAL	
"testsuites"	TokenNameStringLiteral	testsuites
;	TokenNameSEMICOLON	
/** the testsuite element */	TokenNameCOMMENT_JAVADOC	 the testsuite element 
String	TokenNameIdentifier	 String
TESTSUITE	TokenNameIdentifier	 TESTSUITE
=	TokenNameEQUAL	
"testsuite"	TokenNameStringLiteral	testsuite
;	TokenNameSEMICOLON	
/** the testcase element */	TokenNameCOMMENT_JAVADOC	 the testcase element 
String	TokenNameIdentifier	 String
TESTCASE	TokenNameIdentifier	 TESTCASE
=	TokenNameEQUAL	
"testcase"	TokenNameStringLiteral	testcase
;	TokenNameSEMICOLON	
/** the error element */	TokenNameCOMMENT_JAVADOC	 the error element 
String	TokenNameIdentifier	 String
ERROR	TokenNameIdentifier	 ERROR
=	TokenNameEQUAL	
"error"	TokenNameStringLiteral	error
;	TokenNameSEMICOLON	
/** the failure element */	TokenNameCOMMENT_JAVADOC	 the failure element 
String	TokenNameIdentifier	 String
FAILURE	TokenNameIdentifier	 FAILURE
=	TokenNameEQUAL	
"failure"	TokenNameStringLiteral	failure
;	TokenNameSEMICOLON	
/** the system-err element */	TokenNameCOMMENT_JAVADOC	 the system-err element 
String	TokenNameIdentifier	 String
SYSTEM_ERR	TokenNameIdentifier	 SYSTEM  ERR
=	TokenNameEQUAL	
"system-err"	TokenNameStringLiteral	system-err
;	TokenNameSEMICOLON	
/** the system-out element */	TokenNameCOMMENT_JAVADOC	 the system-out element 
String	TokenNameIdentifier	 String
SYSTEM_OUT	TokenNameIdentifier	 SYSTEM  OUT
=	TokenNameEQUAL	
"system-out"	TokenNameStringLiteral	system-out
;	TokenNameSEMICOLON	
/** package attribute for the aggregate document */	TokenNameCOMMENT_JAVADOC	 package attribute for the aggregate document 
String	TokenNameIdentifier	 String
ATTR_PACKAGE	TokenNameIdentifier	 ATTR  PACKAGE
=	TokenNameEQUAL	
"package"	TokenNameStringLiteral	package
;	TokenNameSEMICOLON	
/** name attribute for property, testcase and testsuite elements */	TokenNameCOMMENT_JAVADOC	 name attribute for property, testcase and testsuite elements 
String	TokenNameIdentifier	 String
ATTR_NAME	TokenNameIdentifier	 ATTR  NAME
=	TokenNameEQUAL	
"name"	TokenNameStringLiteral	name
;	TokenNameSEMICOLON	
/** time attribute for testcase and testsuite elements */	TokenNameCOMMENT_JAVADOC	 time attribute for testcase and testsuite elements 
String	TokenNameIdentifier	 String
ATTR_TIME	TokenNameIdentifier	 ATTR  TIME
=	TokenNameEQUAL	
"time"	TokenNameStringLiteral	time
;	TokenNameSEMICOLON	
/** errors attribute for testsuite elements */	TokenNameCOMMENT_JAVADOC	 errors attribute for testsuite elements 
String	TokenNameIdentifier	 String
ATTR_ERRORS	TokenNameIdentifier	 ATTR  ERRORS
=	TokenNameEQUAL	
"errors"	TokenNameStringLiteral	errors
;	TokenNameSEMICOLON	
/** failures attribute for testsuite elements */	TokenNameCOMMENT_JAVADOC	 failures attribute for testsuite elements 
String	TokenNameIdentifier	 String
ATTR_FAILURES	TokenNameIdentifier	 ATTR  FAILURES
=	TokenNameEQUAL	
"failures"	TokenNameStringLiteral	failures
;	TokenNameSEMICOLON	
/** tests attribute for testsuite elements */	TokenNameCOMMENT_JAVADOC	 tests attribute for testsuite elements 
String	TokenNameIdentifier	 String
ATTR_TESTS	TokenNameIdentifier	 ATTR  TESTS
=	TokenNameEQUAL	
"tests"	TokenNameStringLiteral	tests
;	TokenNameSEMICOLON	
/** type attribute for failure and error elements */	TokenNameCOMMENT_JAVADOC	 type attribute for failure and error elements 
String	TokenNameIdentifier	 String
ATTR_TYPE	TokenNameIdentifier	 ATTR  TYPE
=	TokenNameEQUAL	
"type"	TokenNameStringLiteral	type
;	TokenNameSEMICOLON	
/** message attribute for failure elements */	TokenNameCOMMENT_JAVADOC	 message attribute for failure elements 
String	TokenNameIdentifier	 String
ATTR_MESSAGE	TokenNameIdentifier	 ATTR  MESSAGE
=	TokenNameEQUAL	
"message"	TokenNameStringLiteral	message
;	TokenNameSEMICOLON	
/** the properties element */	TokenNameCOMMENT_JAVADOC	 the properties element 
String	TokenNameIdentifier	 String
PROPERTIES	TokenNameIdentifier	 PROPERTIES
=	TokenNameEQUAL	
"properties"	TokenNameStringLiteral	properties
;	TokenNameSEMICOLON	
/** the property element */	TokenNameCOMMENT_JAVADOC	 the property element 
String	TokenNameIdentifier	 String
PROPERTY	TokenNameIdentifier	 PROPERTY
=	TokenNameEQUAL	
"property"	TokenNameStringLiteral	property
;	TokenNameSEMICOLON	
/** value attribute for property elements */	TokenNameCOMMENT_JAVADOC	 value attribute for property elements 
String	TokenNameIdentifier	 String
ATTR_VALUE	TokenNameIdentifier	 ATTR  VALUE
=	TokenNameEQUAL	
"value"	TokenNameStringLiteral	value
;	TokenNameSEMICOLON	
/** classname attribute for testcase elements */	TokenNameCOMMENT_JAVADOC	 classname attribute for testcase elements 
String	TokenNameIdentifier	 String
ATTR_CLASSNAME	TokenNameIdentifier	 ATTR  CLASSNAME
=	TokenNameEQUAL	
"classname"	TokenNameStringLiteral	classname
;	TokenNameSEMICOLON	
/** id attribute */	TokenNameCOMMENT_JAVADOC	 id attribute 
String	TokenNameIdentifier	 String
ATTR_ID	TokenNameIdentifier	 ATTR  ID
=	TokenNameEQUAL	
"id"	TokenNameStringLiteral	id
;	TokenNameSEMICOLON	
/** * timestamp of test cases */	TokenNameCOMMENT_JAVADOC	 timestamp of test cases 
String	TokenNameIdentifier	 String
TIMESTAMP	TokenNameIdentifier	 TIMESTAMP
=	TokenNameEQUAL	
"timestamp"	TokenNameStringLiteral	timestamp
;	TokenNameSEMICOLON	
/** * name of host running the tests */	TokenNameCOMMENT_JAVADOC	 name of host running the tests 
String	TokenNameIdentifier	 String
HOSTNAME	TokenNameIdentifier	 HOSTNAME
=	TokenNameEQUAL	
"hostname"	TokenNameStringLiteral	hostname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	