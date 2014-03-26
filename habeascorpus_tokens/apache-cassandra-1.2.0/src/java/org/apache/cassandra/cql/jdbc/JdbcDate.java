/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
jdbc	TokenNameIdentifier	 jdbc
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
JdbcDate	TokenNameIdentifier	 Jdbc Date
extends	TokenNameextends	
AbstractJdbcType	TokenNameIdentifier	 Abstract Jdbc Type
<	TokenNameLESS	
Date	TokenNameIdentifier	 Date
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
iso8601Patterns	TokenNameIdentifier	 iso8601 Patterns
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"yyyy-MM-dd HH:mm"	TokenNameStringLiteral	yyyy-MM-dd HH:mm
,	TokenNameCOMMA	
"yyyy-MM-dd HH:mm:ss"	TokenNameStringLiteral	yyyy-MM-dd HH:mm:ss
,	TokenNameCOMMA	
"yyyy-MM-dd HH:mmZ"	TokenNameStringLiteral	yyyy-MM-dd HH:mmZ
,	TokenNameCOMMA	
"yyyy-MM-dd HH:mm:ssZ"	TokenNameStringLiteral	yyyy-MM-dd HH:mm:ssZ
,	TokenNameCOMMA	
"yyyy-MM-dd'T'HH:mm"	TokenNameStringLiteral	yyyy-MM-dd'T'HH:mm
,	TokenNameCOMMA	
"yyyy-MM-dd'T'HH:mmZ"	TokenNameStringLiteral	yyyy-MM-dd'T'HH:mmZ
,	TokenNameCOMMA	
"yyyy-MM-dd'T'HH:mm:ss"	TokenNameStringLiteral	yyyy-MM-dd'T'HH:mm:ss
,	TokenNameCOMMA	
"yyyy-MM-dd'T'HH:mm:ssZ"	TokenNameStringLiteral	yyyy-MM-dd'T'HH:mm:ssZ
,	TokenNameCOMMA	
"yyyy-MM-dd"	TokenNameStringLiteral	yyyy-MM-dd
,	TokenNameCOMMA	
"yyyy-MM-ddZ"	TokenNameStringLiteral	yyyy-MM-ddZ
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_FORMAT	TokenNameIdentifier	 DEFAULT  FORMAT
=	TokenNameEQUAL	
iso8601Patterns	TokenNameIdentifier	 iso8601 Patterns
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
>	TokenNameGREATER	
FORMATTER	TokenNameIdentifier	 FORMATTER
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
DEFAULT_FORMAT	TokenNameIdentifier	 DEFAULT  FORMAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
JdbcDate	TokenNameIdentifier	 Jdbc Date
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
JdbcDate	TokenNameIdentifier	 Jdbc Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JdbcDate	TokenNameIdentifier	 Jdbc Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPrecision	TokenNameIdentifier	 get Precision
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCurrency	TokenNameIdentifier	 is Currency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSigned	TokenNameIdentifier	 is Signed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FORMATTER	TokenNameIdentifier	 FORMATTER
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
needsQuotes	TokenNameIdentifier	 needs Quotes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"A date is exactly 8 bytes (stored as a long): "	TokenNameStringLiteral	A date is exactly 8 bytes (stored as a long): 
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// uses ISO-8601 formatted string 	TokenNameCOMMENT_LINE	uses ISO-8601 formatted string 
return	TokenNamereturn	
FORMATTER	TokenNameIdentifier	 FORMATTER
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
Date	TokenNameIdentifier	 Date
>	TokenNameGREATER	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Date	TokenNameIdentifier	 Date
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getJdbcType	TokenNameIdentifier	 get Jdbc Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
TIMESTAMP	TokenNameIdentifier	 TIMESTAMP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Date	TokenNameIdentifier	 Date
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
toLong	TokenNameIdentifier	 to Long
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
:	TokenNameCOLON	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
