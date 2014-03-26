/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DefaultLoggerTest	TokenNameIdentifier	 Default Logger Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
DefaultLoggerTest	TokenNameIdentifier	 Default Logger Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
,	TokenNameCOMMA	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultLogger	TokenNameIdentifier	 Default Logger
.	TokenNameDOT	
throwableMessage	TokenNameIdentifier	 throwable Message
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
error	TokenNameIdentifier	 error
,	TokenNameCOMMA	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testThrowableMessage	TokenNameIdentifier	 test Throwable Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// #43398 	TokenNameCOMMENT_LINE	#43398 
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
=	TokenNameEQUAL	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"oops"	TokenNameStringLiteral	oops
,	TokenNameCOMMA	
new	TokenNamenew	
Location	TokenNameIdentifier	 Location
(	TokenNameLPAREN	
"build.xml"	TokenNameStringLiteral	build.xml
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"build.xml:1: oops"	TokenNameStringLiteral	build.xml:1: oops
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be	TokenNameIdentifier	 be
=	TokenNameEQUAL	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
addLocationToBuildException	TokenNameIdentifier	 add Location To Build Exception
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
,	TokenNameCOMMA	
new	TokenNamenew	
Location	TokenNameIdentifier	 Location
(	TokenNameLPAREN	
"build.xml"	TokenNameStringLiteral	build.xml
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"build.xml:2: The following error occurred while executing this line:"	TokenNameStringLiteral	build.xml:2: The following error occurred while executing this line:
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"build.xml:1: oops"	TokenNameStringLiteral	build.xml:1: oops
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be	TokenNameIdentifier	 be
=	TokenNameEQUAL	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
addLocationToBuildException	TokenNameIdentifier	 add Location To Build Exception
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
,	TokenNameCOMMA	
new	TokenNamenew	
Location	TokenNameIdentifier	 Location
(	TokenNameLPAREN	
"build.xml"	TokenNameStringLiteral	build.xml
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"build.xml:3: The following error occurred while executing this line:"	TokenNameStringLiteral	build.xml:3: The following error occurred while executing this line:
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"build.xml:2: The following error occurred while executing this line:"	TokenNameStringLiteral	build.xml:2: The following error occurred while executing this line:
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"build.xml:1: oops"	TokenNameStringLiteral	build.xml:1: oops
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Exception	TokenNameIdentifier	 Exception
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"problem"	TokenNameStringLiteral	problem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"problem"	TokenNameStringLiteral	problem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" at p.C.m"	TokenNameStringLiteral	 at p.C.m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"problem"	TokenNameStringLiteral	problem
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" at p.C.m"	TokenNameStringLiteral	 at p.C.m
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be	TokenNameIdentifier	 be
=	TokenNameEQUAL	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
new	TokenNamenew	
Location	TokenNameIdentifier	 Location
(	TokenNameLPAREN	
"build.xml"	TokenNameStringLiteral	build.xml
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"build.xml:1: problem"	TokenNameStringLiteral	build.xml:1: problem
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" at p.C.m"	TokenNameStringLiteral	 at p.C.m
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be	TokenNameIdentifier	 be
=	TokenNameEQUAL	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
addLocationToBuildException	TokenNameIdentifier	 add Location To Build Exception
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
,	TokenNameCOMMA	
new	TokenNamenew	
Location	TokenNameIdentifier	 Location
(	TokenNameLPAREN	
"build.xml"	TokenNameStringLiteral	build.xml
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"build.xml:2: The following error occurred while executing this line:"	TokenNameStringLiteral	build.xml:2: The following error occurred while executing this line:
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"build.xml:1: problem"	TokenNameStringLiteral	build.xml:1: problem
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" at p.C.m"	TokenNameStringLiteral	 at p.C.m
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
