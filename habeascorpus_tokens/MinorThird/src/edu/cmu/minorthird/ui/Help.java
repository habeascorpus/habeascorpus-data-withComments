package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
ui	TokenNameIdentifier	 ui
;	TokenNameSEMICOLON	
/** * Help for the command-line interface. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Help for the command-line interface. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
Help	TokenNameIdentifier	 Help
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Useful Minorthird commands in edu.cmu.minorthird.ui:"	TokenNameStringLiteral	Useful Minorthird commands in edu.cmu.minorthird.ui:
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"ApplyAnnotator -labels KEY -loadFrom ANNOTATOR_FILE ..."	TokenNameStringLiteral	ApplyAnnotator -labels KEY -loadFrom ANNOTATOR_FILE ...
,	TokenNameCOMMA	
" apply a learned classifier or extractor to a labeled test base KEY"	TokenNameStringLiteral	 apply a learned classifier or extractor to a labeled test base KEY
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"TrainClassifier -labels KEY -learner LEARNER_BSH_STRING ... "	TokenNameStringLiteral	TrainClassifier -labels KEY -learner LEARNER_BSH_STRING ... 
,	TokenNameCOMMA	
" train a classifier from data in the labeled text base KEY"	TokenNameStringLiteral	 train a classifier from data in the labeled text base KEY
,	TokenNameCOMMA	
"TestClassifier -labels KEY -loadFrom ANNOTATOR_FILE ..."	TokenNameStringLiteral	TestClassifier -labels KEY -loadFrom ANNOTATOR_FILE ...
,	TokenNameCOMMA	
" test a classifier on data in the labeled text base KEY"	TokenNameStringLiteral	 test a classifier on data in the labeled text base KEY
,	TokenNameCOMMA	
"TrainTestClassifier -labels KEY -splitter SPLITTER ..."	TokenNameStringLiteral	TrainTestClassifier -labels KEY -splitter SPLITTER ...
,	TokenNameCOMMA	
" perform a classification-learning experiment with the data in KEY"	TokenNameStringLiteral	 perform a classification-learning experiment with the data in KEY
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"TrainExtractor -labels KEY -learner LEARNER_BSH_STRING ... "	TokenNameStringLiteral	TrainExtractor -labels KEY -learner LEARNER_BSH_STRING ... 
,	TokenNameCOMMA	
" train a extractor from data in the labeled text base KEY"	TokenNameStringLiteral	 train a extractor from data in the labeled text base KEY
,	TokenNameCOMMA	
"TestExtractor -labels KEY -loadFrom ANNOTATOR_FILE ..."	TokenNameStringLiteral	TestExtractor -labels KEY -loadFrom ANNOTATOR_FILE ...
,	TokenNameCOMMA	
" test a extractor on data in the labeled text base KEY"	TokenNameStringLiteral	 test a extractor on data in the labeled text base KEY
,	TokenNameCOMMA	
"TrainTestExtractor -labels KEY -splitter SPLITTER ..."	TokenNameStringLiteral	TrainTestExtractor -labels KEY -splitter SPLITTER ...
,	TokenNameCOMMA	
" perform a extraction-learning experiment with the data in KEY"	TokenNameStringLiteral	 perform a extraction-learning experiment with the data in KEY
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"TrainTagger -labels KEY -splitter SPLITTER ..."	TokenNameStringLiteral	TrainTagger -labels KEY -splitter SPLITTER ...
,	TokenNameCOMMA	
" perform a tagger-learning experiment with the data in KEY"	TokenNameStringLiteral	 perform a tagger-learning experiment with the data in KEY
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"LabelViewer -labels KEY ..."	TokenNameStringLiteral	LabelViewer -labels KEY ...
,	TokenNameCOMMA	
" view annotated text"	TokenNameStringLiteral	 view annotated text
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"RunMixup -labels KEY -mixup FILE [-saveAs LABELFILE] ..."	TokenNameStringLiteral	RunMixup -labels KEY -mixup FILE [-saveAs LABELFILE] ...
,	TokenNameCOMMA	
" run a mixup program"	TokenNameStringLiteral	 run a mixup program
,	TokenNameCOMMA	
"DebugMixup -labels KEY -mixup FILE -edit LABELFILE ..."	TokenNameStringLiteral	DebugMixup -labels KEY -mixup FILE -edit LABELFILE ...
,	TokenNameCOMMA	
" run/reload a mixup program and correct label the output"	TokenNameStringLiteral	 run/reload a mixup program and correct label the output
,	TokenNameCOMMA	
"EditLabels -labels KEY -edit LABELFILE ..."	TokenNameStringLiteral	EditLabels -labels KEY -edit LABELFILE ...
,	TokenNameCOMMA	
" labeler for textbases"	TokenNameStringLiteral	 labeler for textbases
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"The single option -help gives detailed command-line help for a command."	TokenNameStringLiteral	The single option -help gives detailed command-line help for a command.
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
