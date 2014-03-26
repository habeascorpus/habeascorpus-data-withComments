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
/** Marker interface for objects which support the * 'getSubpopulationId' method. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Marker interface for objects which support the 'getSubpopulationId' method. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
{	TokenNameLBRACE	
/** Get the subpopulation from which this instance was drawn. * A null id is considered to be a unique subpopulation---different * from every other subpopulation, including other nulls. * A subpopulation is a subset of the training data which is * expected to contain additional regularities - for instance, * pages from the same site, or spans from the same document. * Testing routines may use subpopulation's to more correctly * spit datasets into train/test subsets. */	TokenNameCOMMENT_JAVADOC	 Get the subpopulation from which this instance was drawn. A null id is considered to be a unique subpopulation---different from every other subpopulation, including other nulls. A subpopulation is a subset of the training data which is expected to contain additional regularities - for instance, pages from the same site, or spans from the same document. Testing routines may use subpopulation's to more correctly spit datasets into train/test subsets. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
