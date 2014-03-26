/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
rendered	TokenNameIdentifier	 rendered
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
ByteLookupTable	TokenNameIdentifier	 Byte Lookup Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
LookupOp	TokenNameIdentifier	 Lookup Op
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
WritableRaster	TokenNameIdentifier	 Writable Raster
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
TransferFunction	TokenNameIdentifier	 Transfer Function
;	TokenNameSEMICOLON	
/** * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: ComponentTransferRed.java 479564 2006-11-27 09:56:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: ComponentTransferRed.java 479564 2006-11-27 09:56:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ComponentTransferRed	TokenNameIdentifier	 Component Transfer Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
LookupOp	TokenNameIdentifier	 Lookup Op
operation	TokenNameIdentifier	 operation
;	TokenNameSEMICOLON	
/** * The constructor will instantiate a LookupOp instance using * a LookupOp, which is built using the four LUT * data obtained by the TransferFunction objects * funcs[0] : Alpha component transfer function * funcs[1] : Red component transfer function * funcs[2] : Green component transfer function * funcs[3] : Blue component transfer function */	TokenNameCOMMENT_JAVADOC	 The constructor will instantiate a LookupOp instance using a LookupOp, which is built using the four LUT data obtained by the TransferFunction objects funcs[0] : Alpha component transfer function funcs[1] : Red component transfer function funcs[2] : Green component transfer function funcs[3] : Blue component transfer function 
public	TokenNamepublic	
ComponentTransferRed	TokenNameIdentifier	 Component Transfer Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
TransferFunction	TokenNameIdentifier	 Transfer Function
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
funcs	TokenNameIdentifier	 funcs
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceColorModel	TokenNameIdentifier	 coerce Color Model
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tableData	TokenNameIdentifier	 table Data
=	TokenNameEQUAL	
{	TokenNameLBRACE	
funcs	TokenNameIdentifier	 funcs
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLookupTable	TokenNameIdentifier	 get Lookup Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
funcs	TokenNameIdentifier	 funcs
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLookupTable	TokenNameIdentifier	 get Lookup Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
funcs	TokenNameIdentifier	 funcs
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLookupTable	TokenNameIdentifier	 get Lookup Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
funcs	TokenNameIdentifier	 funcs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLookupTable	TokenNameIdentifier	 get Lookup Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Note that we create an anonymous subclass here. 	TokenNameCOMMENT_LINE	Note that we create an anonymous subclass here. 
// For what ever reason this makes the Op work correctly. 	TokenNameCOMMENT_LINE	For what ever reason this makes the Op work correctly. 
// If you remove this, it seems to get the color channels messed 	TokenNameCOMMENT_LINE	If you remove this, it seems to get the color channels messed 
// up. The downside is that I suspect that this means we are 	TokenNameCOMMENT_LINE	up. The downside is that I suspect that this means we are 
// falling into a more general, and hence slower case, but 	TokenNameCOMMENT_LINE	falling into a more general, and hence slower case, but 
// at least it works.... 	TokenNameCOMMENT_LINE	at least it works.... 
operation	TokenNameIdentifier	 operation
=	TokenNameEQUAL	
new	TokenNamenew	
LookupOp	TokenNameIdentifier	 Lookup Op
(	TokenNameLPAREN	
new	TokenNamenew	
ByteLookupTable	TokenNameIdentifier	 Byte Lookup Table
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tableData	TokenNameIdentifier	 table Data
)	TokenNameRPAREN	
,	TokenNameCOMMA	
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
WritableRaster	TokenNameIdentifier	 Writable Raster
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
)	TokenNameRPAREN	
getSources	TokenNameIdentifier	 get Sources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wr	TokenNameIdentifier	 wr
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WritableRaster	TokenNameIdentifier	 Writable Raster
srcWR	TokenNameIdentifier	 src WR
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
createWritableTranslatedChild	TokenNameIdentifier	 create Writable Translated Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
operation	TokenNameIdentifier	 operation
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
srcWR	TokenNameIdentifier	 src WR
,	TokenNameCOMMA	
srcWR	TokenNameIdentifier	 src WR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
