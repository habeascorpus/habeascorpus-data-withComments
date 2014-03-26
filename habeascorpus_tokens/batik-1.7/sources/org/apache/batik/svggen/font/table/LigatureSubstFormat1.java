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
/** * * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> * @version $Id: LigatureSubstFormat1.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> @version $Id: LigatureSubstFormat1.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
LigatureSubstFormat1	TokenNameIdentifier	 Ligature Subst Format1
extends	TokenNameextends	
LigatureSubst	TokenNameIdentifier	 Ligature Subst
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
coverageOffset	TokenNameIdentifier	 coverage Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
ligSetCount	TokenNameIdentifier	 lig Set Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ligatureSetOffsets	TokenNameIdentifier	 ligature Set Offsets
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Coverage	TokenNameIdentifier	 Coverage
coverage	TokenNameIdentifier	 coverage
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LigatureSet	TokenNameIdentifier	 Ligature Set
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ligatureSets	TokenNameIdentifier	 ligature Sets
;	TokenNameSEMICOLON	
/** Creates new LigatureSubstFormat1 */	TokenNameCOMMENT_JAVADOC	 Creates new LigatureSubstFormat1 
protected	TokenNameprotected	
LigatureSubstFormat1	TokenNameIdentifier	 Ligature Subst Format1
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
coverageOffset	TokenNameIdentifier	 coverage Offset
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ligSetCount	TokenNameIdentifier	 lig Set Count
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ligatureSetOffsets	TokenNameIdentifier	 ligature Set Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
ligSetCount	TokenNameIdentifier	 lig Set Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ligatureSets	TokenNameIdentifier	 ligature Sets
=	TokenNameEQUAL	
new	TokenNamenew	
LigatureSet	TokenNameIdentifier	 Ligature Set
[	TokenNameLBRACKET	
ligSetCount	TokenNameIdentifier	 lig Set Count
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
ligSetCount	TokenNameIdentifier	 lig Set Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ligatureSetOffsets	TokenNameIdentifier	 ligature Set Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
coverageOffset	TokenNameIdentifier	 coverage Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
coverage	TokenNameIdentifier	 coverage
=	TokenNameEQUAL	
Coverage	TokenNameIdentifier	 Coverage
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
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
ligSetCount	TokenNameIdentifier	 lig Set Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ligatureSets	TokenNameIdentifier	 ligature Sets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
LigatureSet	TokenNameIdentifier	 Ligature Set
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
ligatureSetOffsets	TokenNameIdentifier	 ligature Set Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
