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
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
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
if	TokenNameif	
(	TokenNameLPAREN	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/\(.*:\d{1,4}\)/"	TokenNameStringLiteral	/\(.*:\d{1,4}\)/
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
"s/:\d{1,4}\)/:XXX)/"	TokenNameStringLiteral	s/:\d{1,4}\)/:XXX)/
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
", Compiled Code"	TokenNameStringLiteral	, Compiled Code
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
substitute	TokenNameIdentifier	 substitute
(	TokenNameLPAREN	
"s/, Compiled Code/:XXX/"	TokenNameStringLiteral	s/, Compiled Code/:XXX/
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
