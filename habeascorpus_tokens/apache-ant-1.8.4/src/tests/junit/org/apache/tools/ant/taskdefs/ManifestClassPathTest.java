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
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildFileTest	TokenNameIdentifier	 Build File Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
;	TokenNameSEMICOLON	
/** * Tests &lt;bm:manifestclasspath&gt;. */	TokenNameCOMMENT_JAVADOC	 Tests &lt;bm:manifestclasspath&gt;. 
public	TokenNamepublic	
class	TokenNameclass	
ManifestClassPathTest	TokenNameIdentifier	 Manifest Class Path Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/manifestclasspath.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/manifestclasspath.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadDirectory	TokenNameIdentifier	 test Bad Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test-bad-directory"	TokenNameStringLiteral	test-bad-directory
,	TokenNameCOMMA	
"bad-jar-dir"	TokenNameStringLiteral	bad-jar-dir
,	TokenNameCOMMA	
"Jar's directory not found:"	TokenNameStringLiteral	Jar's directory not found:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadNoProperty	TokenNameIdentifier	 test Bad No Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test-bad-no-property"	TokenNameStringLiteral	test-bad-no-property
,	TokenNameCOMMA	
"no-property"	TokenNameStringLiteral	no-property
,	TokenNameCOMMA	
"Missing 'property' attribute!"	TokenNameStringLiteral	Missing 'property' attribute!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadPropertyExists	TokenNameIdentifier	 test Bad Property Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test-bad-property-exists"	TokenNameStringLiteral	test-bad-property-exists
,	TokenNameCOMMA	
"property-exits"	TokenNameStringLiteral	property-exits
,	TokenNameCOMMA	
"Property 'jar.classpath' already set!"	TokenNameStringLiteral	Property 'jar.classpath' already set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
,	TokenNameCOMMA	
"exists"	TokenNameStringLiteral	exists
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadNoJarfile	TokenNameIdentifier	 test Bad No Jarfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test-bad-no-jarfile"	TokenNameStringLiteral	test-bad-no-jarfile
,	TokenNameCOMMA	
"no-jarfile"	TokenNameStringLiteral	no-jarfile
,	TokenNameCOMMA	
"Missing 'jarfile' attribute!"	TokenNameStringLiteral	Missing 'jarfile' attribute!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadNoClassPath	TokenNameIdentifier	 test Bad No Class Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test-bad-no-classpath"	TokenNameStringLiteral	test-bad-no-classpath
,	TokenNameCOMMA	
"no-classpath"	TokenNameStringLiteral	no-classpath
,	TokenNameCOMMA	
"Missing nested <classpath>!"	TokenNameStringLiteral	Missing nested <classpath>!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParentLevel1	TokenNameIdentifier	 test Parent Level1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test-parent-level1"	TokenNameStringLiteral	test-parent-level1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
,	TokenNameCOMMA	
"dsp-core/ "	TokenNameStringLiteral	dsp-core/ 
+	TokenNamePLUS	
"dsp-pres/ "	TokenNameStringLiteral	dsp-pres/ 
+	TokenNamePLUS	
"dsp-void/ "	TokenNameStringLiteral	dsp-void/ 
+	TokenNamePLUS	
"../generated/dsp-core/ "	TokenNameStringLiteral	../generated/dsp-core/ 
+	TokenNamePLUS	
"../generated/dsp-pres/ "	TokenNameStringLiteral	../generated/dsp-pres/ 
+	TokenNamePLUS	
"../generated/dsp-void/ "	TokenNameStringLiteral	../generated/dsp-void/ 
+	TokenNamePLUS	
"../resources/dsp-core/ "	TokenNameStringLiteral	../resources/dsp-core/ 
+	TokenNamePLUS	
"../resources/dsp-pres/ "	TokenNameStringLiteral	../resources/dsp-pres/ 
+	TokenNamePLUS	
"../resources/dsp-void/"	TokenNameStringLiteral	../resources/dsp-void/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParentLevel2	TokenNameIdentifier	 test Parent Level2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test-parent-level2"	TokenNameStringLiteral	test-parent-level2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
,	TokenNameCOMMA	
"../dsp-core/ "	TokenNameStringLiteral	../dsp-core/ 
+	TokenNamePLUS	
"../dsp-pres/ "	TokenNameStringLiteral	../dsp-pres/ 
+	TokenNamePLUS	
"../dsp-void/ "	TokenNameStringLiteral	../dsp-void/ 
+	TokenNamePLUS	
"../../generated/dsp-core/ "	TokenNameStringLiteral	../../generated/dsp-core/ 
+	TokenNamePLUS	
"../../generated/dsp-pres/ "	TokenNameStringLiteral	../../generated/dsp-pres/ 
+	TokenNamePLUS	
"../../generated/dsp-void/ "	TokenNameStringLiteral	../../generated/dsp-void/ 
+	TokenNamePLUS	
"../../resources/dsp-core/ "	TokenNameStringLiteral	../../resources/dsp-core/ 
+	TokenNamePLUS	
"../../resources/dsp-pres/ "	TokenNameStringLiteral	../../resources/dsp-pres/ 
+	TokenNamePLUS	
"../../resources/dsp-void/"	TokenNameStringLiteral	../../resources/dsp-void/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParentLevel2TooDeep	TokenNameIdentifier	 test Parent Level2 Too Deep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test-parent-level2-too-deep"	TokenNameStringLiteral	test-parent-level2-too-deep
,	TokenNameCOMMA	
"nopath"	TokenNameStringLiteral	nopath
,	TokenNameCOMMA	
"No suitable relative path from "	TokenNameStringLiteral	No suitable relative path from 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPseudoTahoeRefid	TokenNameIdentifier	 test Pseudo Tahoe Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
.	TokenNameDOT	
regexpMatcherPresent	TokenNameIdentifier	 regexp Matcher Present
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Test 'testPseudoTahoeRefid' skipped because no regexp matcher is present."	TokenNameStringLiteral	Test 'testPseudoTahoeRefid' skipped because no regexp matcher is present.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test-pseudo-tahoe-refid"	TokenNameStringLiteral	test-pseudo-tahoe-refid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
,	TokenNameCOMMA	
"classes/dsp-core/ "	TokenNameStringLiteral	classes/dsp-core/ 
+	TokenNamePLUS	
"classes/dsp-pres/ "	TokenNameStringLiteral	classes/dsp-pres/ 
+	TokenNamePLUS	
"classes/dsp-void/ "	TokenNameStringLiteral	classes/dsp-void/ 
+	TokenNamePLUS	
"generated/dsp-core/ "	TokenNameStringLiteral	generated/dsp-core/ 
+	TokenNamePLUS	
"resources/dsp-core/ "	TokenNameStringLiteral	resources/dsp-core/ 
+	TokenNamePLUS	
"resources/dsp-pres/"	TokenNameStringLiteral	resources/dsp-pres/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPseudoTahoeNested	TokenNameIdentifier	 test Pseudo Tahoe Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
.	TokenNameDOT	
regexpMatcherPresent	TokenNameIdentifier	 regexp Matcher Present
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Test 'testPseudoTahoeNested' skipped because no regexp matcher is present."	TokenNameStringLiteral	Test 'testPseudoTahoeNested' skipped because no regexp matcher is present.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test-pseudo-tahoe-nested"	TokenNameStringLiteral	test-pseudo-tahoe-nested
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
,	TokenNameCOMMA	
"classes/dsp-core/ "	TokenNameStringLiteral	classes/dsp-core/ 
+	TokenNamePLUS	
"classes/dsp-pres/ "	TokenNameStringLiteral	classes/dsp-pres/ 
+	TokenNamePLUS	
"classes/dsp-void/ "	TokenNameStringLiteral	classes/dsp-void/ 
+	TokenNamePLUS	
"generated/dsp-core/ "	TokenNameStringLiteral	generated/dsp-core/ 
+	TokenNamePLUS	
"resources/dsp-core/ "	TokenNameStringLiteral	resources/dsp-core/ 
+	TokenNamePLUS	
"resources/dsp-pres/"	TokenNameStringLiteral	resources/dsp-pres/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParentLevel2WithJars	TokenNameIdentifier	 test Parent Level2 With Jars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test-parent-level2-with-jars"	TokenNameStringLiteral	test-parent-level2-with-jars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
"jar.classpath"	TokenNameStringLiteral	jar.classpath
,	TokenNameCOMMA	
"../../lib/acme-core.jar "	TokenNameStringLiteral	../../lib/acme-core.jar 
+	TokenNamePLUS	
"../../lib/acme-pres.jar "	TokenNameStringLiteral	../../lib/acme-pres.jar 
+	TokenNamePLUS	
"../dsp-core/ "	TokenNameStringLiteral	../dsp-core/ 
+	TokenNamePLUS	
"../dsp-pres/ "	TokenNameStringLiteral	../dsp-pres/ 
+	TokenNamePLUS	
"../dsp-void/ "	TokenNameStringLiteral	../dsp-void/ 
+	TokenNamePLUS	
"../../generated/dsp-core/ "	TokenNameStringLiteral	../../generated/dsp-core/ 
+	TokenNamePLUS	
"../../generated/dsp-pres/ "	TokenNameStringLiteral	../../generated/dsp-pres/ 
+	TokenNamePLUS	
"../../generated/dsp-void/ "	TokenNameStringLiteral	../../generated/dsp-void/ 
+	TokenNamePLUS	
"../../resources/dsp-core/ "	TokenNameStringLiteral	../../resources/dsp-core/ 
+	TokenNamePLUS	
"../../resources/dsp-pres/ "	TokenNameStringLiteral	../../resources/dsp-pres/ 
+	TokenNamePLUS	
"../../resources/dsp-void/"	TokenNameStringLiteral	../../resources/dsp-void/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInternationalGerman	TokenNameIdentifier	 test International German
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"international-german"	TokenNameStringLiteral	international-german
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"run-two-jars"	TokenNameStringLiteral	run-two-jars
,	TokenNameCOMMA	
"beta alpha"	TokenNameStringLiteral	beta alpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInternationalHebrew	TokenNameIdentifier	 test International Hebrew
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"windows"	TokenNameStringLiteral	windows
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"international-hebrew"	TokenNameStringLiteral	international-hebrew
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"run-two-jars"	TokenNameStringLiteral	run-two-jars
,	TokenNameCOMMA	
"beta alpha"	TokenNameStringLiteral	beta alpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Test with hebrew path not attempted under Windows"	TokenNameStringLiteral	Test with hebrew path not attempted under Windows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSameWindowsDrive	TokenNameIdentifier	 test Same Windows Drive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"windows"	TokenNameStringLiteral	windows
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Test with drive letters only run on windows"	TokenNameStringLiteral	Test with drive letters only run on windows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testSameDrive"	TokenNameStringLiteral	testSameDrive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
"cp"	TokenNameStringLiteral	cp
,	TokenNameCOMMA	
"../a/b/x.jar"	TokenNameStringLiteral	../a/b/x.jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDifferentWindowsDrive	TokenNameIdentifier	 test Different Windows Drive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"windows"	TokenNameStringLiteral	windows
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Test with drive letters only run on windows"	TokenNameStringLiteral	Test with drive letters only run on windows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"D:/foo.txt"	TokenNameStringLiteral	D:/foo.txt
)	TokenNameRPAREN	
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"drive d: doesn't exist or is not ready,"	TokenNameStringLiteral	drive d: doesn't exist or is not ready,
+	TokenNamePLUS	
" skipping test"	TokenNameStringLiteral	 skipping test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testDifferentDrive"	TokenNameStringLiteral	testDifferentDrive
,	TokenNameCOMMA	
"different drive"	TokenNameStringLiteral	different drive
,	TokenNameCOMMA	
"No suitable relative path from "	TokenNameStringLiteral	No suitable relative path from 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"cp"	TokenNameStringLiteral	cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// END class ManifestClassPathTest 	TokenNameCOMMENT_LINE	END class ManifestClassPathTest 
