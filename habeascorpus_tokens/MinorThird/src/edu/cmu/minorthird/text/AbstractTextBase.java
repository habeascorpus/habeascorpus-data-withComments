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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractTextBase	TokenNameIdentifier	 Abstract Text Base
implements	TokenNameimplements	
TextBase	TokenNameIdentifier	 Text Base
{	TokenNameLBRACE	
protected	TokenNameprotected	
Tokenizer	TokenNameIdentifier	 Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractTextBase	TokenNameIdentifier	 Abstract Text Base
(	TokenNameLPAREN	
Tokenizer	TokenNameIdentifier	 Tokenizer
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// TextBase interface methods implemented 	TokenNameCOMMENT_LINE	TextBase interface methods implemented 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Tokenizer	TokenNameIdentifier	 Tokenizer
getTokenizer	TokenNameIdentifier	 get Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenizer	TokenNameIdentifier	 tokenizer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// TextBase methods left abstract 	TokenNameCOMMENT_LINE	TextBase methods left abstract 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
abstract	TokenNameabstract	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
abstract	TokenNameabstract	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
abstract	TokenNameabstract	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
abstract	TokenNameabstract	
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
