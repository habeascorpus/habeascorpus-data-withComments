/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BASIC_PAT	TokenNameIdentifier	 BASIC  PAT
=	TokenNameEQUAL	
"\[main\] (FATAL|ERROR|WARN|INFO|DEBUG)"	TokenNameStringLiteral	\[main\] (FATAL|ERROR|WARN|INFO|DEBUG)
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ISO8601_PAT	TokenNameIdentifier	 IS O8601  PAT
=	TokenNameEQUAL	
"^\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2},\d{3}"	TokenNameStringLiteral	^\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2},\d{3}
;	TokenNameSEMICOLON	
// 06 avr. 2002 18:36:32,036 	TokenNameCOMMENT_LINE	06 avr. 2002 18:36:32,036 
// 18 fevr. 2002 20:05:36,222 	TokenNameCOMMENT_LINE	18 fevr. 2002 20:05:36,222 
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ABSOLUTE_DATE_AND_TIME_PAT	TokenNameIdentifier	 ABSOLUTE  DATE  AND  TIME  PAT
=	TokenNameEQUAL	
"^\d{1,2} .{2,6}\.? 2\d{3} \d{2}:\d{2}:\d{2},\d{3}"	TokenNameStringLiteral	^\d{1,2} .{2,6}\.? 2\d{3} \d{2}:\d{2}:\d{2},\d{3}
;	TokenNameSEMICOLON	
// 18:54:19,201 	TokenNameCOMMENT_LINE	18:54:19,201 
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ABSOLUTE_TIME_PAT	TokenNameIdentifier	 ABSOLUTE  TIME  PAT
=	TokenNameEQUAL	
"^\d{2}:\d{2}:\d{2},\d{3}"	TokenNameStringLiteral	^\d{2}:\d{2}:\d{2},\d{3}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RELATIVE_TIME_PAT	TokenNameIdentifier	 RELATIVE  TIME  PAT
=	TokenNameEQUAL	
"^\d{1,10}"	TokenNameStringLiteral	^\d{1,10}
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnexpectedFormatException	TokenNameIdentifier	 Unexpected Format Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
