/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Defines legal formats for examples. Currently this just checks * that the class labels are in some legal set. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Defines legal formats for examples. Currently this just checks that the class labels are in some legal set. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
ExampleSchema	TokenNameIdentifier	 Example Schema
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
=	TokenNameEQUAL	
"POS"	TokenNameStringLiteral	POS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
=	TokenNameEQUAL	
"NEG"	TokenNameStringLiteral	NEG
;	TokenNameSEMICOLON	
/** Schema for binary examples. */	TokenNameCOMMENT_JAVADOC	 Schema for binary examples. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
ExampleSchema	TokenNameIdentifier	 Example Schema
BINARY_EXAMPLE_SCHEMA	TokenNameIdentifier	 BINARY  EXAMPLE  SCHEMA
=	TokenNameEQUAL	
new	TokenNamenew	
ExampleSchema	TokenNameIdentifier	 Example Schema
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
,	TokenNameCOMMA	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
validClassNames	TokenNameIdentifier	 valid Class Names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
validClassNameSet	TokenNameIdentifier	 valid Class Name Set
;	TokenNameSEMICOLON	
/** Create a new scheme with the given list of validClassNames */	TokenNameCOMMENT_JAVADOC	 Create a new scheme with the given list of validClassNames 
public	TokenNamepublic	
ExampleSchema	TokenNameIdentifier	 Example Schema
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
validClassNames	TokenNameIdentifier	 valid Class Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
validClassNames	TokenNameIdentifier	 valid Class Names
=	TokenNameEQUAL	
validClassNames	TokenNameIdentifier	 valid Class Names
;	TokenNameSEMICOLON	
validClassNameSet	TokenNameIdentifier	 valid Class Name Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
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
validClassNames	TokenNameIdentifier	 valid Class Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validClassNameSet	TokenNameIdentifier	 valid Class Name Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
validClassNames	TokenNameIdentifier	 valid Class Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Added extend method to extend the schema with new class label value */	TokenNameCOMMENT_JAVADOC	 Added extend method to extend the schema with new class label value 
public	TokenNamepublic	
void	TokenNamevoid	
extend	TokenNameIdentifier	 extend
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newClassName	TokenNameIdentifier	 new Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
newValidClassNames	TokenNameIdentifier	 new Valid Class Names
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
validClassNames	TokenNameIdentifier	 valid Class Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
validClassNames	TokenNameIdentifier	 valid Class Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newValidClassNames	TokenNameIdentifier	 new Valid Class Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
validClassNames	TokenNameIdentifier	 valid Class Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newValidClassNames	TokenNameIdentifier	 new Valid Class Names
[	TokenNameLBRACKET	
validClassNames	TokenNameIdentifier	 valid Class Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newClassName	TokenNameIdentifier	 new Class Name
;	TokenNameSEMICOLON	
validClassNames	TokenNameIdentifier	 valid Class Names
=	TokenNameEQUAL	
newValidClassNames	TokenNameIdentifier	 new Valid Class Names
;	TokenNameSEMICOLON	
validClassNameSet	TokenNameIdentifier	 valid Class Name Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newClassName	TokenNameIdentifier	 new Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get an array of all valid class names. */	TokenNameCOMMENT_JAVADOC	 Get an array of all valid class names. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
validClassNames	TokenNameIdentifier	 valid Class Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
validClassNames	TokenNameIdentifier	 valid Class Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return number of valid class names */	TokenNameCOMMENT_JAVADOC	 Return number of valid class names 
public	TokenNamepublic	
int	TokenNameint	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
validClassNames	TokenNameIdentifier	 valid Class Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return i-th valid class name. */	TokenNameCOMMENT_JAVADOC	 Return i-th valid class name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
validClassNames	TokenNameIdentifier	 valid Class Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return index of this class name, or -1 if it's not valid. */	TokenNameCOMMENT_JAVADOC	 Return index of this class name, or -1 if it's not valid. 
public	TokenNamepublic	
int	TokenNameint	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
validClassNames	TokenNameIdentifier	 valid Class Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
validClassNames	TokenNameIdentifier	 valid Class Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Determine if a ClassLabel is valid with respect to the schema. */	TokenNameCOMMENT_JAVADOC	 Determine if a ClassLabel is valid with respect to the schema. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
possibleLabels	TokenNameIdentifier	 possible Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
validClassNameSet	TokenNameIdentifier	 valid Class Name Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Determine if an example is valid with respect to the schema. */	TokenNameCOMMENT_JAVADOC	 Determine if an example is valid with respect to the schema. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
ExampleSchema	TokenNameIdentifier	 Example Schema
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExampleSchema	TokenNameIdentifier	 Example Schema
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
validClassNameSet	TokenNameIdentifier	 valid Class Name Set
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
validClassNameSet	TokenNameIdentifier	 valid Class Name Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[ExampleSchema: "	TokenNameStringLiteral	[ExampleSchema: 
+	TokenNamePLUS	
validClassNameSet	TokenNameIdentifier	 valid Class Name Set
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
