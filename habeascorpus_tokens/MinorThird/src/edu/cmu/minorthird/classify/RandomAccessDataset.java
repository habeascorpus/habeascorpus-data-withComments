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
/** * A dataset which supports random access to the examples. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A dataset which supports random access to the examples. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
RandomAccessDataset	TokenNameIdentifier	 Random Access Dataset
extends	TokenNameextends	
BasicDataset	TokenNameIdentifier	 Basic Dataset
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
examples	TokenNameIdentifier	 examples
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
