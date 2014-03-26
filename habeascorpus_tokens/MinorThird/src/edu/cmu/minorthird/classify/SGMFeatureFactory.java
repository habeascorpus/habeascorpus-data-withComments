/* Copyright 2003-2004, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003-2004, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
;	TokenNameSEMICOLON	
/** * For Stacked Graphical Learning. Creates Features, and maintains a mapping * between Features and numeric ids. Also ensures that only a single feature * instance exists with a particular name. Add the ExampleID when creating new * SGMExample. * */	TokenNameCOMMENT_JAVADOC	 For Stacked Graphical Learning. Creates Features, and maintains a mapping between Features and numeric ids. Also ensures that only a single feature instance exists with a particular name. Add the ExampleID when creating new SGMExample. 
public	TokenNamepublic	
class	TokenNameclass	
SGMFeatureFactory	TokenNameIdentifier	 SGM Feature Factory
extends	TokenNameextends	
FeatureFactory	TokenNameIdentifier	 Feature Factory
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080128L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Return a version of the example in which all features have been translated * to canonical versions from the feature factory. */	TokenNameCOMMENT_JAVADOC	 Return a version of the example in which all features have been translated to canonical versions from the feature factory. 
public	TokenNamepublic	
SGMExample	TokenNameIdentifier	 SGM Example
compressSGM	TokenNameIdentifier	 compress SGM
(	TokenNameLPAREN	
SGMExample	TokenNameIdentifier	 SGM Example
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instance	TokenNameIdentifier	 Instance
compactInstance	TokenNameIdentifier	 compact Instance
=	TokenNameEQUAL	
compress	TokenNameIdentifier	 compress
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SGMExample	TokenNameIdentifier	 SGM Example
(	TokenNameLPAREN	
compactInstance	TokenNameIdentifier	 compact Instance
,	TokenNameCOMMA	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getExampleID	TokenNameIdentifier	 get Example ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
