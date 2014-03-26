/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
table	TokenNameIdentifier	 table
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
RandomAccessFile	TokenNameIdentifier	 Random Access File
;	TokenNameSEMICOLON	
/** * * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> * @version $Id: FeatureList.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> @version $Id: FeatureList.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
FeatureList	TokenNameIdentifier	 Feature List
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
featureCount	TokenNameIdentifier	 feature Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FeatureRecord	TokenNameIdentifier	 Feature Record
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featureRecords	TokenNameIdentifier	 feature Records
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
features	TokenNameIdentifier	 features
;	TokenNameSEMICOLON	
/** Creates new FeatureList */	TokenNameCOMMENT_JAVADOC	 Creates new FeatureList 
public	TokenNamepublic	
FeatureList	TokenNameIdentifier	 Feature List
(	TokenNameLPAREN	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featureCount	TokenNameIdentifier	 feature Count
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featureRecords	TokenNameIdentifier	 feature Records
=	TokenNameEQUAL	
new	TokenNamenew	
FeatureRecord	TokenNameIdentifier	 Feature Record
[	TokenNameLBRACKET	
featureCount	TokenNameIdentifier	 feature Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
featureCount	TokenNameIdentifier	 feature Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
featureCount	TokenNameIdentifier	 feature Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
featureRecords	TokenNameIdentifier	 feature Records
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
FeatureRecord	TokenNameIdentifier	 Feature Record
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
featureCount	TokenNameIdentifier	 feature Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
features	TokenNameIdentifier	 features
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
featureRecords	TokenNameIdentifier	 feature Records
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Feature	TokenNameIdentifier	 Feature
findFeature	TokenNameIdentifier	 find Feature
(	TokenNameLPAREN	
LangSys	TokenNameIdentifier	 Lang Sys
langSys	TokenNameIdentifier	 lang Sys
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
tagVal	TokenNameIdentifier	 tag Val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
tag	TokenNameIdentifier	 tag
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
featureCount	TokenNameIdentifier	 feature Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
featureRecords	TokenNameIdentifier	 feature Records
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
tagVal	TokenNameIdentifier	 tag Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
langSys	TokenNameIdentifier	 lang Sys
.	TokenNameDOT	
isFeatureIndexed	TokenNameIdentifier	 is Feature Indexed
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
features	TokenNameIdentifier	 features
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
