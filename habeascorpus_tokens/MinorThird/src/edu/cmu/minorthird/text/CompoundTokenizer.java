/* Copyright 2007, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2007, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CompoundTokenizer	TokenNameIdentifier	 Compound Tokenizer
implements	TokenNameimplements	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
protected	TokenNameprotected	
Tokenizer	TokenNameIdentifier	 Tokenizer
parentTokenizer	TokenNameIdentifier	 parent Tokenizer
;	TokenNameSEMICOLON	
// Concrete methods 	TokenNameCOMMENT_LINE	Concrete methods 
public	TokenNamepublic	
Tokenizer	TokenNameIdentifier	 Tokenizer
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parentTokenizer	TokenNameIdentifier	 parent Tokenizer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Abstract methods to be implemented by subclasses 	TokenNameCOMMENT_LINE	Abstract methods to be implemented by subclasses 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splitIntoTokens	TokenNameIdentifier	 split Into Tokens
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splitIntoTokens	TokenNameIdentifier	 split Into Tokens
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
