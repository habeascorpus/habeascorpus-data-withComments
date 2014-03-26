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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Matcher	TokenNameIdentifier	 Matcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
;	TokenNameSEMICOLON	
/** * @author Edoardo Airldi * Date: Nov 21, 2003 */	TokenNameCOMMENT_JAVADOC	 @author Edoardo Airldi Date: Nov 21, 2003 
public	TokenNamepublic	
class	TokenNameclass	
FilterInstanceTransform	TokenNameIdentifier	 Filter Instance Transform
implements	TokenNameimplements	
FeatureFilter	TokenNameIdentifier	 Feature Filter
{	TokenNameLBRACE	
// example: discard fetures that contain punctuation 	TokenNameCOMMENT_LINE	example: discard fetures that contain punctuation 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PATTERN	TokenNameIdentifier	 PATTERN
=	TokenNameEQUAL	
"[\W\d]+"	TokenNameStringLiteral	[\W\d]+
;	TokenNameSEMICOLON	
/** Should I retain feature f in the given instance. */	TokenNameCOMMENT_JAVADOC	 Should I retain feature f in the given instance. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
retain	TokenNameIdentifier	 retain
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Pattern	TokenNameIdentifier	 Pattern
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
PATTERN	TokenNameIdentifier	 PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Matcher	TokenNameIdentifier	 Matcher
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retain	TokenNameIdentifier	 retain
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retain	TokenNameIdentifier	 retain
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
