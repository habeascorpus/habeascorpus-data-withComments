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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * A no options loader. * It checks the given file/string and does one of two things: * 1) if Directory - load each file as a document assuming that labels are embedded * 2) if file - load each line as a document assuming the first word is a document name * @author ksteppe */	TokenNameCOMMENT_JAVADOC	 A no options loader. It checks the given file/string and does one of two things: 1) if Directory - load each file as a document assuming that labels are embedded 2) if file - load each line as a document assuming the first word is a document name @author ksteppe 
public	TokenNamepublic	
class	TokenNameclass	
SimpleTextLoader	TokenNameIdentifier	 Simple Text Loader
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SimpleTextLoader	TokenNameIdentifier	 Simple Text Loader
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
TextLabels	TokenNameIdentifier	 Text Labels
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
boolean	TokenNameboolean	
externalLabelFile	TokenNameIdentifier	 external Label File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
tempLabels	TokenNameIdentifier	 temp Labels
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
new	TokenNamenew	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
(	TokenNameLPAREN	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
.	TokenNameDOT	
DOC_PER_LINE	TokenNameIdentifier	 DOC  PER  LINE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
new	TokenNamenew	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
(	TokenNameLPAREN	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
.	TokenNameDOT	
DOC_PER_FILE	TokenNameIdentifier	 DOC  PER  FILE
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempLabels	TokenNameIdentifier	 temp Labels
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
tempLabels	TokenNameIdentifier	 temp Labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
externalLabelFile	TokenNameIdentifier	 external Label File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileName	TokenNameIdentifier	 file Name
+=	TokenNamePLUS_EQUAL	
".labels"	TokenNameStringLiteral	.labels
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
labelsFile	TokenNameIdentifier	 labels File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
importOps	TokenNameIdentifier	 import Ops
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
labelsFile	TokenNameIdentifier	 labels File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tempLabels	TokenNameIdentifier	 temp Labels
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
tempLabels	TokenNameIdentifier	 temp Labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TextLabels	TokenNameIdentifier	 Text Labels
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
externalLabelFile	TokenNameIdentifier	 external Label File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
externalLabelFile	TokenNameIdentifier	 external Label File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------Instance stuff for the Wizard ---------------------------------------- 	TokenNameCOMMENT_LINE	-------------------Instance stuff for the Wizard ---------------------------------------- 
public	TokenNamepublic	
boolean	TokenNameboolean	
labelFile	TokenNameIdentifier	 label File
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleTextLoader	TokenNameIdentifier	 Simple Text Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
labelFile	TokenNameIdentifier	 label File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
labelFile	TokenNameIdentifier	 label File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isLabelFile	TokenNameIdentifier	 is Label File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
labelFile	TokenNameIdentifier	 label File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLabelFile	TokenNameIdentifier	 set Label File
(	TokenNameLPAREN	
boolean	TokenNameboolean	
labelFile	TokenNameIdentifier	 label File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
labelFile	TokenNameIdentifier	 label File
=	TokenNameEQUAL	
labelFile	TokenNameIdentifier	 label File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------------- 
}	TokenNameRBRACE	
