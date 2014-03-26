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
/** * * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> * @version $Id: KernSubtableFormat0.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> @version $Id: KernSubtableFormat0.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
KernSubtableFormat0	TokenNameIdentifier	 Kern Subtable Format0
extends	TokenNameextends	
KernSubtable	TokenNameIdentifier	 Kern Subtable
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
nPairs	TokenNameIdentifier	 n Pairs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
searchRange	TokenNameIdentifier	 search Range
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
entrySelector	TokenNameIdentifier	 entry Selector
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
rangeShift	TokenNameIdentifier	 range Shift
;	TokenNameSEMICOLON	
private	TokenNameprivate	
KerningPair	TokenNameIdentifier	 Kerning Pair
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
kerningPairs	TokenNameIdentifier	 kerning Pairs
;	TokenNameSEMICOLON	
/** Creates new KernSubtableFormat0 */	TokenNameCOMMENT_JAVADOC	 Creates new KernSubtableFormat0 
protected	TokenNameprotected	
KernSubtableFormat0	TokenNameIdentifier	 Kern Subtable Format0
(	TokenNameLPAREN	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
nPairs	TokenNameIdentifier	 n Pairs
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searchRange	TokenNameIdentifier	 search Range
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entrySelector	TokenNameIdentifier	 entry Selector
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rangeShift	TokenNameIdentifier	 range Shift
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kerningPairs	TokenNameIdentifier	 kerning Pairs
=	TokenNameEQUAL	
new	TokenNamenew	
KerningPair	TokenNameIdentifier	 Kerning Pair
[	TokenNameLBRACKET	
nPairs	TokenNameIdentifier	 n Pairs
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
nPairs	TokenNameIdentifier	 n Pairs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
kerningPairs	TokenNameIdentifier	 kerning Pairs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
KerningPair	TokenNameIdentifier	 Kerning Pair
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getKerningPairCount	TokenNameIdentifier	 get Kerning Pair Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nPairs	TokenNameIdentifier	 n Pairs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
KerningPair	TokenNameIdentifier	 Kerning Pair
getKerningPair	TokenNameIdentifier	 get Kerning Pair
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
kerningPairs	TokenNameIdentifier	 kerning Pairs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
