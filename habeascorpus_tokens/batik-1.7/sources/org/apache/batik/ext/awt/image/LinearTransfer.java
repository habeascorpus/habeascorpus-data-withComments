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
/** * LinearTransfer.java * * This class defines the Linear type transfer function for the * feComponentTransfer filter, as defined in chapter 15, section 11 of the SVG * specification. * * @author <a href="mailto:sheng.pei@sun.com">Sheng Pei</a> * @version $Id: LinearTransfer.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 LinearTransfer.java * This class defines the Linear type transfer function for the feComponentTransfer filter, as defined in chapter 15, section 11 of the SVG specification. * @author <a href="mailto:sheng.pei@sun.com">Sheng Pei</a> @version $Id: LinearTransfer.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
LinearTransfer	TokenNameIdentifier	 Linear Transfer
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
/** * The slope of the linear function */	TokenNameCOMMENT_JAVADOC	 The slope of the linear function 
public	TokenNamepublic	
float	TokenNamefloat	
slope	TokenNameIdentifier	 slope
;	TokenNameSEMICOLON	
/** * The intercept of the linear function */	TokenNameCOMMENT_JAVADOC	 The intercept of the linear function 
public	TokenNamepublic	
float	TokenNamefloat	
intercept	TokenNameIdentifier	 intercept
;	TokenNameSEMICOLON	
/** * Two floats as the input for the function */	TokenNameCOMMENT_JAVADOC	 Two floats as the input for the function 
public	TokenNamepublic	
LinearTransfer	TokenNameIdentifier	 Linear Transfer
(	TokenNameLPAREN	
float	TokenNamefloat	
slope	TokenNameIdentifier	 slope
,	TokenNameCOMMA	
float	TokenNamefloat	
intercept	TokenNameIdentifier	 intercept
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
slope	TokenNameIdentifier	 slope
=	TokenNameEQUAL	
slope	TokenNameIdentifier	 slope
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
intercept	TokenNameIdentifier	 intercept
=	TokenNameEQUAL	
intercept	TokenNameIdentifier	 intercept
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * This method will build the lut data. Each entry's * value is in form of "slope*C+intercept" */	TokenNameCOMMENT_BLOCK	 This method will build the lut data. Each entry's value is in form of "slope*C+intercept" 
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
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
float	TokenNamefloat	
scaledInt	TokenNameIdentifier	 scaled Int
=	TokenNameEQUAL	
(	TokenNameLPAREN	
intercept	TokenNameIdentifier	 intercept
*	TokenNameMULTIPLY	
255f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
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
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
scaledInt	TokenNameIdentifier	 scaled Int
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
>	TokenNameGREATER	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
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
0xff	TokenNameIntegerLiteral	
&	TokenNameAND	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*System.out.println("Linear : " + slope + " / " + intercept); for(j=0; j<=255; j++){ System.out.print("[" + j + "] = " + (0xff & lutData[j]) + " "); } System.out.println();*/	TokenNameCOMMENT_BLOCK	System.out.println("Linear : " + slope + " / " + intercept); for(j=0; j<=255; j++){ System.out.print("[" + j + "] = " + (0xff & lutData[j]) + " "); } System.out.println();
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
