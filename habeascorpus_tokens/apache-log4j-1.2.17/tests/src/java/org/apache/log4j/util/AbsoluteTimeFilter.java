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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
oro	TokenNameIdentifier	 oro
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
perl	TokenNameIdentifier	 perl
.	TokenNameDOT	
Perl5Util	TokenNameIdentifier	 Perl5 Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
AbsoluteTimeFilter	TokenNameIdentifier	 Absolute Time Filter
implements	TokenNameimplements	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
Perl5Util	TokenNameIdentifier	 Perl5 Util
util	TokenNameIdentifier	 util
=	TokenNameEQUAL	
new	TokenNamenew	
Perl5Util	TokenNameIdentifier	 Perl5 Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pat	TokenNameIdentifier	 pat
=	TokenNameEQUAL	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ABSOLUTE_TIME_PAT	TokenNameIdentifier	 ABSOLUTE  TIME  PAT
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
substitute	TokenNameIdentifier	 substitute
(	TokenNameLPAREN	
"s/"	TokenNameStringLiteral	s/
+	TokenNamePLUS	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ABSOLUTE_TIME_PAT	TokenNameIdentifier	 ABSOLUTE  TIME  PAT
+	TokenNamePLUS	
"//"	TokenNameStringLiteral	//
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
