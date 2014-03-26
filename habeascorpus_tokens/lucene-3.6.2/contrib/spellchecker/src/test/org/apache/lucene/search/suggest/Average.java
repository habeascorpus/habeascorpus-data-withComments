package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * Average with standard deviation. */	TokenNameCOMMENT_JAVADOC	 Average with standard deviation. 
final	TokenNamefinal	
class	TokenNameclass	
Average	TokenNameIdentifier	 Average
{	TokenNameLBRACE	
/** * Average (in milliseconds). */	TokenNameCOMMENT_JAVADOC	 Average (in milliseconds). 
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
avg	TokenNameIdentifier	 avg
;	TokenNameSEMICOLON	
/** * Standard deviation (in milliseconds). */	TokenNameCOMMENT_JAVADOC	 Standard deviation (in milliseconds). 
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
stddev	TokenNameIdentifier	 stddev
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
Average	TokenNameIdentifier	 Average
(	TokenNameLPAREN	
double	TokenNamedouble	
avg	TokenNameIdentifier	 avg
,	TokenNameCOMMA	
double	TokenNamedouble	
stddev	TokenNameIdentifier	 stddev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
avg	TokenNameIdentifier	 avg
=	TokenNameEQUAL	
avg	TokenNameIdentifier	 avg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
stddev	TokenNameIdentifier	 stddev
=	TokenNameEQUAL	
stddev	TokenNameIdentifier	 stddev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
,	TokenNameCOMMA	
"%.0f [+- %.2f]"	TokenNameStringLiteral	%.0f [+- %.2f]
,	TokenNameCOMMA	
avg	TokenNameIdentifier	 avg
,	TokenNameCOMMA	
stddev	TokenNameIdentifier	 stddev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Average	TokenNameIdentifier	 Average
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumSquares	TokenNameIdentifier	 sum Squares
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
double	TokenNamedouble	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
sumSquares	TokenNameIdentifier	 sum Squares
+=	TokenNamePLUS_EQUAL	
l	TokenNameIdentifier	 l
*	TokenNameMULTIPLY	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
avg	TokenNameIdentifier	 avg
=	TokenNameEQUAL	
sum	TokenNameIdentifier	 sum
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Average	TokenNameIdentifier	 Average
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
sumSquares	TokenNameIdentifier	 sum Squares
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
avg	TokenNameIdentifier	 avg
*	TokenNameMULTIPLY	
avg	TokenNameIdentifier	 avg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
