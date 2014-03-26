package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JComponent	TokenNameIdentifier	 J Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JPanel	TokenNameIdentifier	 J Panel
;	TokenNameSEMICOLON	
/** * A panel including a status message on the bottom. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A panel including a status message on the bottom. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
StatusMessagePanel	TokenNameIdentifier	 Status Message Panel
extends	TokenNameextends	
JPanel	TokenNameIdentifier	 J Panel
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
200803014L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StatusMessagePanel	TokenNameIdentifier	 Status Message Panel
(	TokenNameLPAREN	
JComponent	TokenNameIdentifier	 J Component
component	TokenNameIdentifier	 component
,	TokenNameCOMMA	
StatusMessage	TokenNameIdentifier	 Status Message
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
gbc	TokenNameIdentifier	 gbc
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
=	TokenNameEQUAL	
new	TokenNamenew	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
BOTH	TokenNameIdentifier	 BOTH
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
=	TokenNameEQUAL	
new	TokenNamenew	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
anchor	TokenNameIdentifier	 anchor
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
WEST	TokenNameIdentifier	 WEST
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
statusMsg	TokenNameIdentifier	 status Msg
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
