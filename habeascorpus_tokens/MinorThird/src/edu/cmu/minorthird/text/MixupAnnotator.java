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
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
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
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
MixupProgram	TokenNameIdentifier	 Mixup Program
;	TokenNameSEMICOLON	
/** * Annotate labels using a mixup program. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Annotate labels using a mixup program. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
MixupAnnotator	TokenNameIdentifier	 Mixup Annotator
extends	TokenNameextends	
AbstractAnnotator	TokenNameIdentifier	 Abstract Annotator
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
private	TokenNameprivate	
MixupProgram	TokenNameIdentifier	 Mixup Program
program	TokenNameIdentifier	 program
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MixupAnnotator	TokenNameIdentifier	 Mixup Annotator
(	TokenNameLPAREN	
MixupProgram	TokenNameIdentifier	 Mixup Program
program	TokenNameIdentifier	 program
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
program	TokenNameIdentifier	 program
=	TokenNameEQUAL	
program	TokenNameIdentifier	 program
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//TODO: This class should be extended to allow the user to access different levels. For 	TokenNameCOMMENT_LINE	TODO: This class should be extended to allow the user to access different levels. For 
// instance, we could create a method that allows them to specify the name of a 	TokenNameCOMMENT_LINE	instance, we could create a method that allows them to specify the name of a 
// level to return. Or they could specify a flag to return the level the program 	TokenNameCOMMENT_LINE	level to return. Or they could specify a flag to return the level the program 
// ended on. 	TokenNameCOMMENT_LINE	ended on. 
/** * Right now this method executes the mixup program associated with this annotator and the * caller is expected to get the results directly out of the labels set that was passed in * originally. This means that if the program creates new levels, it should also populate * any final results back to the root level using the importLabelsFromLevel method in * {@link edu.cmu.minorthird.text.mixup.MixupInterpreter}. Otherwise these results will be lost. */	TokenNameCOMMENT_JAVADOC	 Right now this method executes the mixup program associated with this annotator and the caller is expected to get the results directly out of the labels set that was passed in originally. This means that if the program creates new levels, it should also populate any final results back to the root level using the importLabelsFromLevel method in {@link edu.cmu.minorthird.text.mixup.MixupInterpreter}. Otherwise these results will be lost. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doAnnotate	TokenNameIdentifier	 do Annotate
(	TokenNameLPAREN	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
interp	TokenNameIdentifier	 interp
=	TokenNameEQUAL	
new	TokenNamenew	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
(	TokenNameLPAREN	
program	TokenNameIdentifier	 program
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explainAnnotation	TokenNameIdentifier	 explain Annotation
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
documentSpan	TokenNameIdentifier	 document Span
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"annotated with mixup program"	TokenNameStringLiteral	annotated with mixup program
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
