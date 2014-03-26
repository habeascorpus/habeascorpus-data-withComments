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
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
Visible	TokenNameIdentifier	 Visible
;	TokenNameSEMICOLON	
/** * An instance designed for a relational dataset. Extends from Example. Modified * by Zhenzhen Kou to include an ExmapleID * * @author Zhenzhen Kou */	TokenNameCOMMENT_JAVADOC	 An instance designed for a relational dataset. Extends from Example. Modified by Zhenzhen Kou to include an ExmapleID * @author Zhenzhen Kou 
public	TokenNamepublic	
class	TokenNameclass	
SGMExample	TokenNameIdentifier	 SGM Example
extends	TokenNameextends	
Example	TokenNameIdentifier	 Example
implements	TokenNameimplements	
Instance	TokenNameIdentifier	 Instance
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
exampleId	TokenNameIdentifier	 example Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SGMExample	TokenNameIdentifier	 SGM Example
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
exampleId	TokenNameIdentifier	 example Id
,	TokenNameCOMMA	
double	TokenNamedouble	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exampleId	TokenNameIdentifier	 example Id
=	TokenNameEQUAL	
exampleId	TokenNameIdentifier	 example Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SGMExample	TokenNameIdentifier	 SGM Example
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
exampleId	TokenNameIdentifier	 example Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
exampleId	TokenNameIdentifier	 example Id
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the ExampleID */	TokenNameCOMMENT_JAVADOC	 Get the ExampleID 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExampleID	TokenNameIdentifier	 get Example ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exampleId	TokenNameIdentifier	 example Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Has the ExampleID or not */	TokenNameCOMMENT_JAVADOC	 Has the ExampleID or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasID	TokenNameIdentifier	 has ID
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exampleId	TokenNameIdentifier	 example Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
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
return	TokenNamereturn	
"[ ID: "	TokenNameStringLiteral	[ ID: 
+	TokenNamePLUS	
getExampleID	TokenNameIdentifier	 get Example ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" example: "	TokenNameStringLiteral	 example: 
+	TokenNamePLUS	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
