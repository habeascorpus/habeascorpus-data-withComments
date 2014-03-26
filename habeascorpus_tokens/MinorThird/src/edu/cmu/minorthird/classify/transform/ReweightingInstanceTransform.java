package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
Feature	TokenNameIdentifier	 Feature
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
Instance	TokenNameIdentifier	 Instance
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
MutableInstance	TokenNameIdentifier	 Mutable Instance
;	TokenNameSEMICOLON	
/** * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 @author William Cohen 
// warning: this code is untested!!! 	TokenNameCOMMENT_LINE	warning: this code is untested!!! 
public	TokenNamepublic	
class	TokenNameclass	
ReweightingInstanceTransform	TokenNameIdentifier	 Reweighting Instance Transform
extends	TokenNameextends	
AbstractInstanceTransform	TokenNameIdentifier	 Abstract Instance Transform
{	TokenNameLBRACE	
private	TokenNameprivate	
FeatureReweighter	TokenNameIdentifier	 Feature Reweighter
reweighter	TokenNameIdentifier	 reweighter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ReweightingInstanceTransform	TokenNameIdentifier	 Reweighting Instance Transform
(	TokenNameLPAREN	
FeatureReweighter	TokenNameIdentifier	 Feature Reweighter
reweighter	TokenNameIdentifier	 reweighter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reweighter	TokenNameIdentifier	 reweighter
=	TokenNameEQUAL	
reweighter	TokenNameIdentifier	 reweighter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableInstance	TokenNameIdentifier	 Mutable Instance
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
reweighter	TokenNameIdentifier	 reweighter
.	TokenNameDOT	
reweight	TokenNameIdentifier	 reweight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
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
"[ReweightInstTranform "	TokenNameStringLiteral	[ReweightInstTranform 
+	TokenNamePLUS	
reweighter	TokenNameIdentifier	 reweighter
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
