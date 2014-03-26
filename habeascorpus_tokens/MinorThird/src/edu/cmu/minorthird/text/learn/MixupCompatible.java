/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Marker interface for SpanFeatureExtractor objects which allow one * to attach a type of required annotations that must be present * before feature extraction starts. This also allows one to attach to * a feature extractor an AnnotatorLoader, which helps find Annotators * to provide the required annotations. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Marker interface for SpanFeatureExtractor objects which allow one to attach a type of required annotations that must be present before feature extraction starts. This also allows one to attach to a feature extractor an AnnotatorLoader, which helps find Annotators to provide the required annotations. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
MixupCompatible	TokenNameIdentifier	 Mixup Compatible
{	TokenNameLBRACE	
/** A correct implementation of a MixupCompatible * SpanFeatureExtractor will call * <code>textLabels.require(annotation,null,loader)</code> before * extracting features relative to textLabels. A null annotation * means that no <code>textLabels.require(...)</code> call will be made. */	TokenNameCOMMENT_JAVADOC	 A correct implementation of a MixupCompatible SpanFeatureExtractor will call <code>textLabels.require(annotation,null,loader)</code> before extracting features relative to textLabels. A null annotation means that no <code>textLabels.require(...)</code> call will be made. 
public	TokenNamepublic	
void	TokenNamevoid	
setRequiredAnnotation	TokenNameIdentifier	 set Required Annotation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotation	TokenNameIdentifier	 annotation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Retrieve the annotation required by this SpanFeatureExtractor. */	TokenNameCOMMENT_JAVADOC	 Retrieve the annotation required by this SpanFeatureExtractor. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRequiredAnnotation	TokenNameIdentifier	 get Required Annotation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Attach an annotatorLoader to the SpanFeatureExtractor, which is * used to find the required Annotation (and any other Annotations * that that it might recursively require.) */	TokenNameCOMMENT_JAVADOC	 Attach an annotatorLoader to the SpanFeatureExtractor, which is used to find the required Annotation (and any other Annotations that that it might recursively require.) 
public	TokenNamepublic	
void	TokenNamevoid	
setAnnotatorLoader	TokenNameIdentifier	 set Annotator Loader
(	TokenNameLPAREN	
AnnotatorLoader	TokenNameIdentifier	 Annotator Loader
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
