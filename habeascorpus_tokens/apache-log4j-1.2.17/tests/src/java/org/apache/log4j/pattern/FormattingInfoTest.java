/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Tests for FormattingInfo. * * @author Curt Arnold * */	TokenNameCOMMENT_JAVADOC	 Tests for FormattingInfo. * @author Curt Arnold 
public	TokenNamepublic	
class	TokenNameclass	
FormattingInfoTest	TokenNameIdentifier	 Formatting Info Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Create a new instance. * * @param name test name */	TokenNameCOMMENT_JAVADOC	 Create a new instance. * @param name test name 
public	TokenNamepublic	
FormattingInfoTest	TokenNameIdentifier	 Formatting Info Test
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that getDefault does not return null. * */	TokenNameCOMMENT_JAVADOC	 Check that getDefault does not return null. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetDefault	TokenNameIdentifier	 test Get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FormattingInfo	TokenNameIdentifier	 Formatting Info
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isLeftAligned	TokenNameIdentifier	 is Left Aligned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check constructor * */	TokenNameCOMMENT_JAVADOC	 Check constructor 
public	TokenNamepublic	
void	TokenNamevoid	
testConstructor	TokenNameIdentifier	 test Constructor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FormattingInfo	TokenNameIdentifier	 Formatting Info
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isLeftAligned	TokenNameIdentifier	 is Left Aligned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Field exceeds maximum width */	TokenNameCOMMENT_JAVADOC	 Field exceeds maximum width 
public	TokenNamepublic	
void	TokenNamevoid	
testTruncate	TokenNameIdentifier	 test Truncate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"foobar"	TokenNameStringLiteral	foobar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FormattingInfo	TokenNameIdentifier	 Formatting Info
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"fobar"	TokenNameStringLiteral	fobar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add padding to left since field is not minimum width. */	TokenNameCOMMENT_JAVADOC	 Add padding to left since field is not minimum width. 
public	TokenNamepublic	
void	TokenNamevoid	
testPadLeft	TokenNameIdentifier	 test Pad Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"foobar"	TokenNameStringLiteral	foobar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FormattingInfo	TokenNameIdentifier	 Formatting Info
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"fo obar"	TokenNameStringLiteral	fo obar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add padding to right since field is not minimum width. */	TokenNameCOMMENT_JAVADOC	 Add padding to right since field is not minimum width. 
public	TokenNamepublic	
void	TokenNamevoid	
testPadRight	TokenNameIdentifier	 test Pad Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"foobar"	TokenNameStringLiteral	foobar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FormattingInfo	TokenNameIdentifier	 Formatting Info
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"foobar "	TokenNameStringLiteral	foobar 
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
