package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ArtifactTransformationManager	TokenNameIdentifier	 Artifact Transformation Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
LatestArtifactTransformation	TokenNameIdentifier	 Latest Artifact Transformation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ReleaseArtifactTransformation	TokenNameIdentifier	 Release Artifact Transformation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SnapshotTransformation	TokenNameIdentifier	 Snapshot Transformation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
;	TokenNameSEMICOLON	
/** @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
public	TokenNamepublic	
class	TokenNameclass	
TransformationManagerTest	TokenNameIdentifier	 Transformation Manager Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTransformationManager	TokenNameIdentifier	 test Transformation Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ArtifactTransformationManager	TokenNameIdentifier	 Artifact Transformation Manager
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArtifactTransformationManager	TokenNameIdentifier	 Artifact Transformation Manager
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ArtifactTransformationManager	TokenNameIdentifier	 Artifact Transformation Manager
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
tms	TokenNameIdentifier	 tms
=	TokenNameEQUAL	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
getArtifactTransformations	TokenNameIdentifier	 get Artifact Transformations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tms	TokenNameIdentifier	 tms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"We expected the release transformation and got "	TokenNameStringLiteral	We expected the release transformation and got 
+	TokenNamePLUS	
tms	TokenNameIdentifier	 tms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tms	TokenNameIdentifier	 tms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
ReleaseArtifactTransformation	TokenNameIdentifier	 Release Artifact Transformation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"We expected the latest transformation and got "	TokenNameStringLiteral	We expected the latest transformation and got 
+	TokenNamePLUS	
tms	TokenNameIdentifier	 tms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tms	TokenNameIdentifier	 tms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
LatestArtifactTransformation	TokenNameIdentifier	 Latest Artifact Transformation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"We expected the snapshot transformation and got "	TokenNameStringLiteral	We expected the snapshot transformation and got 
+	TokenNamePLUS	
tms	TokenNameIdentifier	 tms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tms	TokenNameIdentifier	 tms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
SnapshotTransformation	TokenNameIdentifier	 Snapshot Transformation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
