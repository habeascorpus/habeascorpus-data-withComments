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
/** * TableTransfer.java * * This class defines the Table type transfer function for the * feComponentTransfer filter, as defined in chapter 15, section 11 of the SVG * specification. * * @author <a href="mailto:sheng.pei@sun.com">Sheng Pei</a> * @version $Id: TableTransfer.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 TableTransfer.java * This class defines the Table type transfer function for the feComponentTransfer filter, as defined in chapter 15, section 11 of the SVG specification. * @author <a href="mailto:sheng.pei@sun.com">Sheng Pei</a> @version $Id: TableTransfer.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TableTransfer	TokenNameIdentifier	 Table Transfer
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
/** * This int array is the input table values from the user */	TokenNameCOMMENT_JAVADOC	 This int array is the input table values from the user 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tableValues	TokenNameIdentifier	 table Values
;	TokenNameSEMICOLON	
/* * The number of the input table's elements */	TokenNameCOMMENT_BLOCK	 The number of the input table's elements 
private	TokenNameprivate	
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
/* * The input is an int array which will be used * later to construct the lut data */	TokenNameCOMMENT_BLOCK	 The input is an int array which will be used later to construct the lut data 
public	TokenNamepublic	
TableTransfer	TokenNameIdentifier	 Table Transfer
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tableValues	TokenNameIdentifier	 table Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tableValues	TokenNameIdentifier	 table Values
=	TokenNameEQUAL	
tableValues	TokenNameIdentifier	 table Values
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
tableValues	TokenNameIdentifier	 table Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * This method will build the lut data. Each entry's * value will increase/decrease between the nearby * intervals. */	TokenNameCOMMENT_BLOCK	 This method will build the lut data. Each entry's value will increase/decrease between the nearby intervals. 
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
;	TokenNameSEMICOLON	
float	TokenNamefloat	
fi	TokenNameIdentifier	 fi
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
int	TokenNameint	
ffi	TokenNameIdentifier	 ffi
,	TokenNameCOMMA	
cfi	TokenNameIdentifier	 cfi
;	TokenNameSEMICOLON	
/*for (j=0; j<n; j++){ System.out.println("tableValues[" + j + "] = " + tableValues[j]); }*/	TokenNameCOMMENT_BLOCK	for (j=0; j<n; j++){ System.out.println("tableValues[" + j + "] = " + tableValues[j]); }
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
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
ffi	TokenNameIdentifier	 ffi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfi	TokenNameIdentifier	 cfi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ffi	TokenNameIdentifier	 ffi
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
ffi	TokenNameIdentifier	 ffi
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
fi	TokenNameIdentifier	 fi
-	TokenNameMINUS	
ffi	TokenNameIdentifier	 ffi
;	TokenNameSEMICOLON	
lutData	TokenNameIdentifier	 lut Data
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tableValues	TokenNameIdentifier	 table Values
[	TokenNameLBRACKET	
ffi	TokenNameIdentifier	 ffi
]	TokenNameRBRACKET	
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tableValues	TokenNameIdentifier	 table Values
[	TokenNameLBRACKET	
cfi	TokenNameIdentifier	 cfi
]	TokenNameRBRACKET	
-	TokenNameMINUS	
tableValues	TokenNameIdentifier	 table Values
[	TokenNameLBRACKET	
ffi	TokenNameIdentifier	 ffi
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("[" + j + "] : " + ffi + "/" + cfi + "/" + r); 	TokenNameCOMMENT_LINE	System.out.println("[" + j + "] : " + ffi + "/" + cfi + "/" + r); 
}	TokenNameRBRACE	
/*for(j=0; j<=255; j++){ System.out.print("[" + j + "] = " + (0xff & lutData[j]) + " "); } System.out.println(); System.out.println();*/	TokenNameCOMMENT_BLOCK	for(j=0; j<=255; j++){ System.out.print("[" + j + "] = " + (0xff & lutData[j]) + " "); } System.out.println(); System.out.println();
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
