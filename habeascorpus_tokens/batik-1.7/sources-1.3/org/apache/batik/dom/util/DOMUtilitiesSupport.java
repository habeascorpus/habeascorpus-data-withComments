package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * JRE specific helper functions for {@link DOMUtilities}. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 JRE specific helper functions for {@link DOMUtilities}. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id$ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DOMUtilitiesSupport	TokenNameIdentifier	 DOM Utilities Support
{	TokenNameLBRACE	
/** * Gets a DOM 3 modifiers string from the given lock and * shift bitmasks. */	TokenNameCOMMENT_JAVADOC	 Gets a DOM 3 modifiers string from the given lock and shift bitmasks. 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getModifiersList	TokenNameIdentifier	 get Modifiers List
(	TokenNameLPAREN	
int	TokenNameint	
lockState	TokenNameIdentifier	 lock State
,	TokenNameCOMMA	
int	TokenNameint	
modifiers	TokenNameIdentifier	 modifiers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
&	TokenNameAND	
0x20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifiers	TokenNameIdentifier	 modifiers
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
modifiers	TokenNameIdentifier	 modifiers
=	TokenNameEQUAL	
modifiers	TokenNameIdentifier	 modifiers
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
.	TokenNameDOT	
LOCK_STRINGS	TokenNameIdentifier	 LOCK  STRINGS
[	TokenNameLBRACKET	
lockState	TokenNameIdentifier	 lock State
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
.	TokenNameDOT	
MODIFIER_STRINGS	TokenNameIdentifier	 MODIFIER  STRINGS
[	TokenNameLBRACKET	
modifiers	TokenNameIdentifier	 modifiers
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
.	TokenNameDOT	
MODIFIER_STRINGS	TokenNameIdentifier	 MODIFIER  STRINGS
[	TokenNameLBRACKET	
modifiers	TokenNameIdentifier	 modifiers
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
