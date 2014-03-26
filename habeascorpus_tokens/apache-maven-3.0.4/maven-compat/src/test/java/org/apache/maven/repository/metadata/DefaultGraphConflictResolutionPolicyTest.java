package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
GraphConflictResolutionPolicy	TokenNameIdentifier	 Graph Conflict Resolution Policy
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
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
/** * * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
class	TokenNameclass	
DefaultGraphConflictResolutionPolicyTest	TokenNameIdentifier	 Default Graph Conflict Resolution Policy Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
GraphConflictResolutionPolicy	TokenNameIdentifier	 Graph Conflict Resolution Policy
policy	TokenNameIdentifier	 policy
;	TokenNameSEMICOLON	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e1	TokenNameIdentifier	 e1
;	TokenNameSEMICOLON	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e2	TokenNameIdentifier	 e2
;	TokenNameSEMICOLON	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e3	TokenNameIdentifier	 e3
;	TokenNameSEMICOLON	
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
policy	TokenNameIdentifier	 policy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphConflictResolutionPolicy	TokenNameIdentifier	 Graph Conflict Resolution Policy
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
GraphConflictResolutionPolicy	TokenNameIdentifier	 Graph Conflict Resolution Policy
.	TokenNameDOT	
ROLE	TokenNameIdentifier	 ROLE
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e1	TokenNameIdentifier	 e1
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e3	TokenNameIdentifier	 e3
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultPolicy	TokenNameIdentifier	 test Default Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
e1	TokenNameIdentifier	 e1
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong depth edge selected"	TokenNameStringLiteral	Wrong depth edge selected
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
e1	TokenNameIdentifier	 e1
,	TokenNameCOMMA	
e3	TokenNameIdentifier	 e3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong version edge selected"	TokenNameStringLiteral	Wrong version edge selected
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
}	TokenNameRBRACE	
