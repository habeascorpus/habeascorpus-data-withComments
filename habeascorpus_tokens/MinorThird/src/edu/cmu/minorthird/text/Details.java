package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * Detailed information about assertions in a TextLabels object * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Detailed information about assertions in a TextLabels object * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
Details	TokenNameIdentifier	 Details
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080303L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Default 'details' record for facts. */	TokenNameCOMMENT_JAVADOC	 Default 'details' record for facts. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
Details	TokenNameIdentifier	 Details
DEFAULT	TokenNameIdentifier	 DEFAULT
=	TokenNameEQUAL	
new	TokenNamenew	
Details	TokenNameIdentifier	 Details
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
confidence	TokenNameIdentifier	 confidence
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
author	TokenNameIdentifier	 author
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Details	TokenNameIdentifier	 Details
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
"unknown"	TokenNameStringLiteral	unknown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Details	TokenNameIdentifier	 Details
(	TokenNameLPAREN	
double	TokenNamedouble	
confidence	TokenNameIdentifier	 confidence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
confidence	TokenNameIdentifier	 confidence
,	TokenNameCOMMA	
"unknown"	TokenNameStringLiteral	unknown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Details	TokenNameIdentifier	 Details
(	TokenNameLPAREN	
double	TokenNamedouble	
confidence	TokenNameIdentifier	 confidence
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
author	TokenNameIdentifier	 author
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
confidence	TokenNameIdentifier	 confidence
=	TokenNameEQUAL	
confidence	TokenNameIdentifier	 confidence
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
author	TokenNameIdentifier	 author
=	TokenNameEQUAL	
author	TokenNameIdentifier	 author
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getConfidence	TokenNameIdentifier	 get Confidence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
confidence	TokenNameIdentifier	 confidence
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
author	TokenNameIdentifier	 author
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
author	TokenNameIdentifier	 author
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
