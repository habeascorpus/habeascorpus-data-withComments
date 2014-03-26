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
/** * Defines the interface expected from a component * transfer function. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ComponentTransferFunction.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Defines the interface expected from a component transfer function. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ComponentTransferFunction.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
{	TokenNameLBRACE	
/** * The various transfer types */	TokenNameCOMMENT_JAVADOC	 The various transfer types 
int	TokenNameint	
IDENTITY	TokenNameIdentifier	 IDENTITY
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
TABLE	TokenNameIdentifier	 TABLE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
DISCRETE	TokenNameIdentifier	 DISCRETE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LINEAR	TokenNameIdentifier	 LINEAR
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
GAMMA	TokenNameIdentifier	 GAMMA
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Returns the type of this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the type of this transfer function 
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the slope value for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the slope value for this transfer function 
float	TokenNamefloat	
getSlope	TokenNameIdentifier	 get Slope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the table values for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the table values for this transfer function 
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTableValues	TokenNameIdentifier	 get Table Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the intercept value for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the intercept value for this transfer function 
float	TokenNamefloat	
getIntercept	TokenNameIdentifier	 get Intercept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the amplitude value for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the amplitude value for this transfer function 
float	TokenNamefloat	
getAmplitude	TokenNameIdentifier	 get Amplitude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the exponent value for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the exponent value for this transfer function 
float	TokenNamefloat	
getExponent	TokenNameIdentifier	 get Exponent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the offset value for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the offset value for this transfer function 
float	TokenNamefloat	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
