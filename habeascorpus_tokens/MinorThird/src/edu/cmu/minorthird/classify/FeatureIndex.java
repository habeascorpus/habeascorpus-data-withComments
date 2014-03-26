package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * @author Edoardo Airoldi * Date: Nov 24, 2003 */	TokenNameCOMMENT_JAVADOC	 @author Edoardo Airoldi Date: Nov 24, 2003 
public	TokenNamepublic	
interface	TokenNameinterface	
FeatureIndex	TokenNameIdentifier	 Feature Index
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Number of examples containing the current feature. */	TokenNameCOMMENT_JAVADOC	 Number of examples containing the current feature. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get i-th example contained in feature f */	TokenNameCOMMENT_JAVADOC	 Get i-th example contained in feature f 
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get counts of feature f in i-th example containing feature f */	TokenNameCOMMENT_JAVADOC	 Get counts of feature f in i-th example containing feature f 
public	TokenNamepublic	
double	TokenNamedouble	
getCounts	TokenNameIdentifier	 get Counts
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get all examples containing a feature. */	TokenNameCOMMENT_JAVADOC	 Get all examples containing a feature. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
getNeighbors	TokenNameIdentifier	 get Neighbors
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
