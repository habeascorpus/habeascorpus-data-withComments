/* Copyright 2006, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2006, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
relational	TokenNameIdentifier	 relational
;	TokenNameSEMICOLON	
/** * A link has 'from' 'to' 'type' fields, more attrs can be added * * @author Zhenzhen Kou */	TokenNameCOMMENT_JAVADOC	 A link has 'from' 'to' 'type' fields, more attrs can be added * @author Zhenzhen Kou 
public	TokenNamepublic	
class	TokenNameclass	
Link	TokenNameIdentifier	 Link
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Link	TokenNameIdentifier	 Link
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the from ExampleID */	TokenNameCOMMENT_JAVADOC	 get the from ExampleID 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFrom	TokenNameIdentifier	 get From
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the to ExampleID */	TokenNameCOMMENT_JAVADOC	 Get the to ExampleID 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTo	TokenNameIdentifier	 get To
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the link type. */	TokenNameCOMMENT_JAVADOC	 Get the link type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
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
"[Link: "	TokenNameStringLiteral	[Link: 
+	TokenNamePLUS	
from	TokenNameIdentifier	 from
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
to	TokenNameIdentifier	 to
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
