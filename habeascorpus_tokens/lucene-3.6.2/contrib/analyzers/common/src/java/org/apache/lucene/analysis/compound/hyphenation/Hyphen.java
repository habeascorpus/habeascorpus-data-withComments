/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
compound	TokenNameIdentifier	 compound
.	TokenNameDOT	
hyphenation	TokenNameIdentifier	 hyphenation
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * This class represents a hyphen. A 'full' hyphen is made of 3 parts: the * pre-break text, post-break text and no-break. If no line-break is generated * at this position, the no-break text is used, otherwise, pre-break and * post-break are used. Typically, pre-break is equal to the hyphen character * and the others are empty. However, this general scheme allows support for * cases in some languages where words change spelling if they're split across * lines, like german's 'backen' which hyphenates 'bak-ken'. BTW, this comes * from TeX. * * This class has been taken from the Apache FOP project (http://xmlgraphics.apache.org/fop/). They have been slightly modified. */	TokenNameCOMMENT_JAVADOC	 This class represents a hyphen. A 'full' hyphen is made of 3 parts: the pre-break text, post-break text and no-break. If no line-break is generated at this position, the no-break text is used, otherwise, pre-break and post-break are used. Typically, pre-break is equal to the hyphen character and the others are empty. However, this general scheme allows support for cases in some languages where words change spelling if they're split across lines, like german's 'backen' which hyphenates 'bak-ken'. BTW, this comes from TeX. * This class has been taken from the Apache FOP project (http://xmlgraphics.apache.org/fop/). They have been slightly modified. 
public	TokenNamepublic	
class	TokenNameclass	
Hyphen	TokenNameIdentifier	 Hyphen
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
preBreak	TokenNameIdentifier	 pre Break
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
noBreak	TokenNameIdentifier	 no Break
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
postBreak	TokenNameIdentifier	 post Break
;	TokenNameSEMICOLON	
Hyphen	TokenNameIdentifier	 Hyphen
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pre	TokenNameIdentifier	 pre
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
no	TokenNameIdentifier	 no
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
post	TokenNameIdentifier	 post
)	TokenNameRPAREN	
{	TokenNameLBRACE	
preBreak	TokenNameIdentifier	 pre Break
=	TokenNameEQUAL	
pre	TokenNameIdentifier	 pre
;	TokenNameSEMICOLON	
noBreak	TokenNameIdentifier	 no Break
=	TokenNameEQUAL	
no	TokenNameIdentifier	 no
;	TokenNameSEMICOLON	
postBreak	TokenNameIdentifier	 post Break
=	TokenNameEQUAL	
post	TokenNameIdentifier	 post
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Hyphen	TokenNameIdentifier	 Hyphen
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pre	TokenNameIdentifier	 pre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
preBreak	TokenNameIdentifier	 pre Break
=	TokenNameEQUAL	
pre	TokenNameIdentifier	 pre
;	TokenNameSEMICOLON	
noBreak	TokenNameIdentifier	 no Break
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
postBreak	TokenNameIdentifier	 post Break
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
noBreak	TokenNameIdentifier	 no Break
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
postBreak	TokenNameIdentifier	 post Break
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
preBreak	TokenNameIdentifier	 pre Break
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
preBreak	TokenNameIdentifier	 pre Break
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
preBreak	TokenNameIdentifier	 pre Break
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}{"	TokenNameStringLiteral	}{
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
postBreak	TokenNameIdentifier	 post Break
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}{"	TokenNameStringLiteral	}{
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
noBreak	TokenNameIdentifier	 no Break
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
