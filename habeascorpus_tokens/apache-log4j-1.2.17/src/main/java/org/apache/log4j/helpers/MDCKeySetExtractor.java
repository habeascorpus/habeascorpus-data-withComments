/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
LogEvent	TokenNameIdentifier	 Log Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
;	TokenNameSEMICOLON	
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
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
MDCKeySetExtractor	TokenNameIdentifier	 MDC Key Set Extractor
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Method	TokenNameIdentifier	 Method
getKeySetMethod	TokenNameIdentifier	 get Key Set Method
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
MDCKeySetExtractor	TokenNameIdentifier	 MDC Key Set Extractor
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
MDCKeySetExtractor	TokenNameIdentifier	 MDC Key Set Extractor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MDCKeySetExtractor	TokenNameIdentifier	 MDC Key Set Extractor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// log4j 1.2.15 and later will have method to get names 	TokenNameCOMMENT_LINE	log4j 1.2.15 and later will have method to get names 
// of all keys in MDC 	TokenNameCOMMENT_LINE	of all keys in MDC 
// 	TokenNameCOMMENT_LINE	 
Method	TokenNameIdentifier	 Method
getMethod	TokenNameIdentifier	 get Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
getMethod	TokenNameIdentifier	 get Method
=	TokenNameEQUAL	
LoggingEvent	TokenNameIdentifier	 Logging Event
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getPropertyKeySet"	TokenNameStringLiteral	getPropertyKeySet
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getMethod	TokenNameIdentifier	 get Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getKeySetMethod	TokenNameIdentifier	 get Key Set Method
=	TokenNameEQUAL	
getMethod	TokenNameIdentifier	 get Method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
getPropertyKeySet	TokenNameIdentifier	 get Property Key Set
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// MDC keys are not visible prior to log4j 1.2.15 	TokenNameCOMMENT_LINE	MDC keys are not visible prior to log4j 1.2.15 
// 	TokenNameCOMMENT_LINE	 
Set	TokenNameIdentifier	 Set
keySet	TokenNameIdentifier	 key Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getKeySetMethod	TokenNameIdentifier	 get Key Set Method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keySet	TokenNameIdentifier	 key Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
)	TokenNameRPAREN	
getKeySetMethod	TokenNameIdentifier	 get Key Set Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// for 1.2.14 and earlier could serialize and 	TokenNameCOMMENT_LINE	for 1.2.14 and earlier could serialize and 
// extract MDC content 	TokenNameCOMMENT_LINE	extract MDC content 
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
outBytes	TokenNameIdentifier	 out Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
(	TokenNameLPAREN	
outBytes	TokenNameIdentifier	 out Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
raw	TokenNameIdentifier	 raw
=	TokenNameEQUAL	
outBytes	TokenNameIdentifier	 out Bytes
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// bytes 6 and 7 should be the length of the original classname 	TokenNameCOMMENT_LINE	bytes 6 and 7 should be the length of the original classname 
// should be the same as our substitute class name 	TokenNameCOMMENT_LINE	should be the same as our substitute class name 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
subClassName	TokenNameIdentifier	 sub Class Name
=	TokenNameEQUAL	
LogEvent	TokenNameIdentifier	 Log Event
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
raw	TokenNameIdentifier	 raw
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
subClassName	TokenNameIdentifier	 sub Class Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// manipulate stream to use our class name 	TokenNameCOMMENT_LINE	manipulate stream to use our class name 
// 	TokenNameCOMMENT_LINE	 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subClassName	TokenNameIdentifier	 sub Class Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
raw	TokenNameIdentifier	 raw
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
subClassName	TokenNameIdentifier	 sub Class Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
inBytes	TokenNameIdentifier	 in Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
(	TokenNameLPAREN	
inBytes	TokenNameIdentifier	 in Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
cracked	TokenNameIdentifier	 cracked
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cracked	TokenNameIdentifier	 cracked
instanceof	TokenNameinstanceof	
LogEvent	TokenNameIdentifier	 Log Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keySet	TokenNameIdentifier	 key Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LogEvent	TokenNameIdentifier	 Log Event
)	TokenNameRPAREN	
cracked	TokenNameIdentifier	 cracked
)	TokenNameRPAREN	
.	TokenNameDOT	
getPropertyKeySet	TokenNameIdentifier	 get Property Key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
keySet	TokenNameIdentifier	 key Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
