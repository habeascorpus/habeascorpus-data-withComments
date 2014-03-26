package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
ParserException	TokenNameIdentifier	 Parser Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestNumericRangeQueryBuilder	TokenNameIdentifier	 Test Numeric Range Query Builder
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetFilterHandleNumericParseErrorStrict	TokenNameIdentifier	 test Get Filter Handle Numeric Parse Error Strict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
filterBuilder	TokenNameIdentifier	 filter Builder
=	TokenNameEQUAL	
new	TokenNamenew	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xml	TokenNameIdentifier	 xml
=	TokenNameEQUAL	
"<NumericRangeQuery fieldName='AGE' type='int' lowerTerm='-1' upperTerm='NaN'/>"	TokenNameStringLiteral	<NumericRangeQuery fieldName='AGE' type='int' lowerTerm='-1' upperTerm='NaN'/>
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getDocumentFromString	TokenNameIdentifier	 get Document From String
(	TokenNameLPAREN	
xml	TokenNameIdentifier	 xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
filterBuilder	TokenNameIdentifier	 filter Builder
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserException	TokenNameIdentifier	 Parser Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Expected to throw "	TokenNameStringLiteral	Expected to throw 
+	TokenNamePLUS	
ParserException	TokenNameIdentifier	 Parser Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testGetFilterInt	TokenNameIdentifier	 test Get Filter Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
filterBuilder	TokenNameIdentifier	 filter Builder
=	TokenNameEQUAL	
new	TokenNamenew	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xml	TokenNameIdentifier	 xml
=	TokenNameEQUAL	
"<NumericRangeQuery fieldName='AGE' type='int' lowerTerm='-1' upperTerm='10'/>"	TokenNameStringLiteral	<NumericRangeQuery fieldName='AGE' type='int' lowerTerm='-1' upperTerm='10'/>
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getDocumentFromString	TokenNameIdentifier	 get Document From String
(	TokenNameLPAREN	
xml	TokenNameIdentifier	 xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filterBuilder	TokenNameIdentifier	 filter Builder
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
instanceof	TokenNameinstanceof	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
numRangeFilter	TokenNameIdentifier	 num Range Filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"AGE"	TokenNameStringLiteral	AGE
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
includesMax	TokenNameIdentifier	 includes Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xml2	TokenNameIdentifier	 xml2
=	TokenNameEQUAL	
"<NumericRangeQuery fieldName='AGE' type='int' lowerTerm='-1' upperTerm='10' includeUpper='false'/>"	TokenNameStringLiteral	<NumericRangeQuery fieldName='AGE' type='int' lowerTerm='-1' upperTerm='10' includeUpper='false'/>
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
getDocumentFromString	TokenNameIdentifier	 get Document From String
(	TokenNameLPAREN	
xml2	TokenNameIdentifier	 xml2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
filter2	TokenNameIdentifier	 filter2
=	TokenNameEQUAL	
filterBuilder	TokenNameIdentifier	 filter Builder
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter2	TokenNameIdentifier	 filter2
instanceof	TokenNameinstanceof	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
)	TokenNameRPAREN	
filter2	TokenNameIdentifier	 filter2
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"AGE"	TokenNameStringLiteral	AGE
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
includesMax	TokenNameIdentifier	 includes Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testGetFilterLong	TokenNameIdentifier	 test Get Filter Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
filterBuilder	TokenNameIdentifier	 filter Builder
=	TokenNameEQUAL	
new	TokenNamenew	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xml	TokenNameIdentifier	 xml
=	TokenNameEQUAL	
"<NumericRangeQuery fieldName='AGE' type='LoNg' lowerTerm='-2321' upperTerm='60000000'/>"	TokenNameStringLiteral	<NumericRangeQuery fieldName='AGE' type='LoNg' lowerTerm='-2321' upperTerm='60000000'/>
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getDocumentFromString	TokenNameIdentifier	 get Document From String
(	TokenNameLPAREN	
xml	TokenNameIdentifier	 xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filterBuilder	TokenNameIdentifier	 filter Builder
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
instanceof	TokenNameinstanceof	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
numRangeFilter	TokenNameIdentifier	 num Range Filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
2321L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
60000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"AGE"	TokenNameStringLiteral	AGE
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
includesMax	TokenNameIdentifier	 includes Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xml2	TokenNameIdentifier	 xml2
=	TokenNameEQUAL	
"<NumericRangeQuery fieldName='AGE' type='LoNg' lowerTerm='-2321' upperTerm='60000000' includeUpper='false'/>"	TokenNameStringLiteral	<NumericRangeQuery fieldName='AGE' type='LoNg' lowerTerm='-2321' upperTerm='60000000' includeUpper='false'/>
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
getDocumentFromString	TokenNameIdentifier	 get Document From String
(	TokenNameLPAREN	
xml2	TokenNameIdentifier	 xml2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
filter2	TokenNameIdentifier	 filter2
=	TokenNameEQUAL	
filterBuilder	TokenNameIdentifier	 filter Builder
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter2	TokenNameIdentifier	 filter2
instanceof	TokenNameinstanceof	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
)	TokenNameRPAREN	
filter2	TokenNameIdentifier	 filter2
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
2321L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
60000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"AGE"	TokenNameStringLiteral	AGE
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
includesMax	TokenNameIdentifier	 includes Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testGetFilterDouble	TokenNameIdentifier	 test Get Filter Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
filterBuilder	TokenNameIdentifier	 filter Builder
=	TokenNameEQUAL	
new	TokenNamenew	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xml	TokenNameIdentifier	 xml
=	TokenNameEQUAL	
"<NumericRangeQuery fieldName='AGE' type='doubLe' lowerTerm='-23.21' upperTerm='60000.00023'/>"	TokenNameStringLiteral	<NumericRangeQuery fieldName='AGE' type='doubLe' lowerTerm='-23.21' upperTerm='60000.00023'/>
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getDocumentFromString	TokenNameIdentifier	 get Document From String
(	TokenNameLPAREN	
xml	TokenNameIdentifier	 xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filterBuilder	TokenNameIdentifier	 filter Builder
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
instanceof	TokenNameinstanceof	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
numRangeFilter	TokenNameIdentifier	 num Range Filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
23.21d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
60000.00023d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"AGE"	TokenNameStringLiteral	AGE
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
includesMax	TokenNameIdentifier	 includes Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xml2	TokenNameIdentifier	 xml2
=	TokenNameEQUAL	
"<NumericRangeQuery fieldName='AGE' type='doubLe' lowerTerm='-23.21' upperTerm='60000.00023' includeUpper='false'/>"	TokenNameStringLiteral	<NumericRangeQuery fieldName='AGE' type='doubLe' lowerTerm='-23.21' upperTerm='60000.00023' includeUpper='false'/>
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
getDocumentFromString	TokenNameIdentifier	 get Document From String
(	TokenNameLPAREN	
xml2	TokenNameIdentifier	 xml2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
filter2	TokenNameIdentifier	 filter2
=	TokenNameEQUAL	
filterBuilder	TokenNameIdentifier	 filter Builder
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter2	TokenNameIdentifier	 filter2
instanceof	TokenNameinstanceof	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
)	TokenNameRPAREN	
filter2	TokenNameIdentifier	 filter2
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
23.21d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
60000.00023d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"AGE"	TokenNameStringLiteral	AGE
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
includesMax	TokenNameIdentifier	 includes Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testGetFilterFloat	TokenNameIdentifier	 test Get Filter Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
filterBuilder	TokenNameIdentifier	 filter Builder
=	TokenNameEQUAL	
new	TokenNamenew	
NumericRangeQueryBuilder	TokenNameIdentifier	 Numeric Range Query Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xml	TokenNameIdentifier	 xml
=	TokenNameEQUAL	
"<NumericRangeQuery fieldName='AGE' type='FLOAT' lowerTerm='-2.321432' upperTerm='32432.23'/>"	TokenNameStringLiteral	<NumericRangeQuery fieldName='AGE' type='FLOAT' lowerTerm='-2.321432' upperTerm='32432.23'/>
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getDocumentFromString	TokenNameIdentifier	 get Document From String
(	TokenNameLPAREN	
xml	TokenNameIdentifier	 xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filterBuilder	TokenNameIdentifier	 filter Builder
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
instanceof	TokenNameinstanceof	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
numRangeFilter	TokenNameIdentifier	 num Range Filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
2.321432f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
32432.23f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"AGE"	TokenNameStringLiteral	AGE
,	TokenNameCOMMA	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter	TokenNameIdentifier	 num Range Filter
.	TokenNameDOT	
includesMax	TokenNameIdentifier	 includes Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xml2	TokenNameIdentifier	 xml2
=	TokenNameEQUAL	
"<NumericRangeQuery fieldName='AGE' type='FLOAT' lowerTerm='-2.321432' upperTerm='32432.23' includeUpper='false' precisionStep='2' />"	TokenNameStringLiteral	<NumericRangeQuery fieldName='AGE' type='FLOAT' lowerTerm='-2.321432' upperTerm='32432.23' includeUpper='false' precisionStep='2' />
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
getDocumentFromString	TokenNameIdentifier	 get Document From String
(	TokenNameLPAREN	
xml2	TokenNameIdentifier	 xml2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
filter2	TokenNameIdentifier	 filter2
=	TokenNameEQUAL	
filterBuilder	TokenNameIdentifier	 filter Builder
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter2	TokenNameIdentifier	 filter2
instanceof	TokenNameinstanceof	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
)	TokenNameRPAREN	
filter2	TokenNameIdentifier	 filter2
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
2.321432f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
32432.23f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"AGE"	TokenNameStringLiteral	AGE
,	TokenNameCOMMA	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
numRangeFilter2	TokenNameIdentifier	 num Range Filter2
.	TokenNameDOT	
includesMax	TokenNameIdentifier	 includes Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Document	TokenNameIdentifier	 Document
getDocumentFromString	TokenNameIdentifier	 get Document From String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilder	TokenNameIdentifier	 Document Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
