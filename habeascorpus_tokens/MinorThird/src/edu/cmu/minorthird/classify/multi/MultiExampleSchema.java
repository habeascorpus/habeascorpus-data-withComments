/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
multi	TokenNameIdentifier	 multi
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
ExampleSchema	TokenNameIdentifier	 Example Schema
;	TokenNameSEMICOLON	
/** * Defines legal formats for examples with multiple labels. Currently this just checks * that the class labels are in some legal set. * * @author Cameron Williams */	TokenNameCOMMENT_JAVADOC	 Defines legal formats for examples with multiple labels. Currently this just checks that the class labels are in some legal set. * @author Cameron Williams 
public	TokenNamepublic	
class	TokenNameclass	
MultiExampleSchema	TokenNameIdentifier	 Multi Example Schema
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ExampleSchema	TokenNameIdentifier	 Example Schema
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
schemas	TokenNameIdentifier	 schemas
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numDimensions	TokenNameIdentifier	 num Dimensions
;	TokenNameSEMICOLON	
/** Create a new scheme with the given list of validClassNames */	TokenNameCOMMENT_JAVADOC	 Create a new scheme with the given list of validClassNames 
public	TokenNamepublic	
MultiExampleSchema	TokenNameIdentifier	 Multi Example Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
schemas	TokenNameIdentifier	 schemas
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
schemas	TokenNameIdentifier	 schemas
=	TokenNameEQUAL	
schemas	TokenNameIdentifier	 schemas
;	TokenNameSEMICOLON	
numDimensions	TokenNameIdentifier	 num Dimensions
=	TokenNameEQUAL	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExampleSchema	TokenNameIdentifier	 Example Schema
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSchemas	TokenNameIdentifier	 get Schemas
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
schemas	TokenNameIdentifier	 schemas
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
numDimensions	TokenNameIdentifier	 num Dimensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numDimensions	TokenNameIdentifier	 num Dimensions
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
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
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
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
schemas	TokenNameIdentifier	 schemas
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
