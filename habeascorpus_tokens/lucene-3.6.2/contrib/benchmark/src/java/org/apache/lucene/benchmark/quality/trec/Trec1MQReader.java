/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
trec	TokenNameIdentifier	 trec
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
QualityQuery	TokenNameIdentifier	 Quality Query
;	TokenNameSEMICOLON	
/** * Read topics of TREC 1MQ track. * <p> * Expects this topic format - * <pre> * qnum:qtext * </pre> * Comment lines starting with '#' are ignored. * <p> * All topics will have a single name value pair. */	TokenNameCOMMENT_JAVADOC	 Read topics of TREC 1MQ track. <p> Expects this topic format - <pre> qnum:qtext </pre> Comment lines starting with '#' are ignored. <p> All topics will have a single name value pair. 
public	TokenNamepublic	
class	TokenNameclass	
Trec1MQReader	TokenNameIdentifier	 Trec1 MQ Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * Constructor for Trec's 1MQ TopicsReader * @param name name of name-value pair to set for all queries. */	TokenNameCOMMENT_JAVADOC	 Constructor for Trec's 1MQ TopicsReader @param name name of name-value pair to set for all queries. 
public	TokenNamepublic	
Trec1MQReader	TokenNameIdentifier	 Trec1 MQ Reader
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read quality queries from trec 1MQ format topics file. * @param reader where queries are read from. * @return the result quality queries. * @throws IOException if cannot read the queries. */	TokenNameCOMMENT_JAVADOC	 Read quality queries from trec 1MQ format topics file. @param reader where queries are read from. @return the result quality queries. @throws IOException if cannot read the queries. 
public	TokenNamepublic	
QualityQuery	TokenNameIdentifier	 Quality Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readQueries	TokenNameIdentifier	 read Queries
(	TokenNameLPAREN	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
QualityQuery	TokenNameIdentifier	 Quality Query
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
QualityQuery	TokenNameIdentifier	 Quality Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// id 	TokenNameCOMMENT_LINE	id 
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// qtext 	TokenNameCOMMENT_LINE	qtext 
String	TokenNameIdentifier	 String
qtext	TokenNameIdentifier	 qtext
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we got a topic! 	TokenNameCOMMENT_LINE	we got a topic! 
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
qtext	TokenNameIdentifier	 qtext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("id: "+id+" qtext: "+qtext+" line: "+line); 	TokenNameCOMMENT_LINE	System.out.println("id: "+id+" qtext: "+qtext+" line: "+line); 
QualityQuery	TokenNameIdentifier	 Quality Query
topic	TokenNameIdentifier	 topic
=	TokenNameEQUAL	
new	TokenNamenew	
QualityQuery	TokenNameIdentifier	 Quality Query
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
topic	TokenNameIdentifier	 topic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sort result array (by ID) 	TokenNameCOMMENT_LINE	sort result array (by ID) 
QualityQuery	TokenNameIdentifier	 Quality Query
qq	TokenNameIdentifier	 qq
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
QualityQuery	TokenNameIdentifier	 Quality Query
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
qq	TokenNameIdentifier	 qq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
qq	TokenNameIdentifier	 qq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
