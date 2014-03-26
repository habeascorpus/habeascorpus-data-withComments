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
;	TokenNameSEMICOLON	
/** * GammaTransfer.java * * This class defines the Gamma type transfer function for the * feComponentTransfer filter, as defined in chapter 15, section 11 of the SVG * specification. * * @author <a href="mailto:sheng.pei@sun.com">Sheng Pei</a> * @version $Id: GammaTransfer.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 GammaTransfer.java * This class defines the Gamma type transfer function for the feComponentTransfer filter, as defined in chapter 15, section 11 of the SVG specification. * @author <a href="mailto:sheng.pei@sun.com">Sheng Pei</a> @version $Id: GammaTransfer.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GammaTransfer	TokenNameIdentifier	 Gamma Transfer
implements	TokenNameimplements	
TransferFunction	TokenNameIdentifier	 Transfer Function
{	TokenNameLBRACE	
/** * This byte array stores the lookuptable data */	TokenNameCOMMENT_JAVADOC	 This byte array stores the lookuptable data 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lutData	TokenNameIdentifier	 lut Data
;	TokenNameSEMICOLON	
/** * The amplitude of the Gamma function */	TokenNameCOMMENT_JAVADOC	 The amplitude of the Gamma function 
public	TokenNamepublic	
float	TokenNamefloat	
amplitude	TokenNameIdentifier	 amplitude
;	TokenNameSEMICOLON	
/** * The exponent of the Gamma function */	TokenNameCOMMENT_JAVADOC	 The exponent of the Gamma function 
public	TokenNamepublic	
float	TokenNamefloat	
exponent	TokenNameIdentifier	 exponent
;	TokenNameSEMICOLON	
/** * The offset of the Gamma function */	TokenNameCOMMENT_JAVADOC	 The offset of the Gamma function 
public	TokenNamepublic	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
/** * Three floats as the input for the Gamma function */	TokenNameCOMMENT_JAVADOC	 Three floats as the input for the Gamma function 
public	TokenNamepublic	
GammaTransfer	TokenNameIdentifier	 Gamma Transfer
(	TokenNameLPAREN	
float	TokenNamefloat	
amplitude	TokenNameIdentifier	 amplitude
,	TokenNameCOMMA	
float	TokenNamefloat	
exponent	TokenNameIdentifier	 exponent
,	TokenNameCOMMA	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
amplitude	TokenNameIdentifier	 amplitude
=	TokenNameEQUAL	
amplitude	TokenNameIdentifier	 amplitude
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exponent	TokenNameIdentifier	 exponent
=	TokenNameEQUAL	
exponent	TokenNameIdentifier	 exponent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * This method will build the lut data. Each entry's * value is in form of "amplitude*pow(C, exponent) + offset" */	TokenNameCOMMENT_BLOCK	 This method will build the lut data. Each entry's value is in form of "amplitude*pow(C, exponent) + offset" 
private	TokenNameprivate	
void	TokenNamevoid	
buildLutData	TokenNameIdentifier	 build Lut Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lutData	TokenNameIdentifier	 lut Data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
amplitude	TokenNameIdentifier	 amplitude
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
exponent	TokenNameIdentifier	 exponent
)	TokenNameRPAREN	
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
>	TokenNameGREATER	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lutData	TokenNameIdentifier	 lut Data
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method will return the lut data in order * to construct a LookUpTable object */	TokenNameCOMMENT_JAVADOC	 This method will return the lut data in order to construct a LookUpTable object 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLookupTable	TokenNameIdentifier	 get Lookup Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildLutData	TokenNameIdentifier	 build Lut Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lutData	TokenNameIdentifier	 lut Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
