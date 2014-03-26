/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
BasicDataset	TokenNameIdentifier	 Basic Dataset
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
ClassLabel	TokenNameIdentifier	 Class Label
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
Dataset	TokenNameIdentifier	 Dataset
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
Example	TokenNameIdentifier	 Example
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
SampleDatasets	TokenNameIdentifier	 Sample Datasets
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
EmptyLabels	TokenNameIdentifier	 Empty Labels
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Span	TokenNameIdentifier	 Span
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextLabels	TokenNameIdentifier	 Text Labels
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtil	TokenNameIdentifier	 String Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
;	TokenNameSEMICOLON	
/** * Some sample feature extractors. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Some sample feature extractors. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
SampleFE	TokenNameIdentifier	 Sample FE
{	TokenNameLBRACE	
/** * Simple bag of words feature extractor. */	TokenNameCOMMENT_JAVADOC	 Simple bag of words feature extractor. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AnnotatedSpanFE	TokenNameIdentifier	 Annotated Span FE
BAG_OF_WORDS	TokenNameIdentifier	 BAG  OF  WORDS
=	TokenNameEQUAL	
new	TokenNamenew	
BagOfWordsFE	TokenNameIdentifier	 Bag Of Words FE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
BagOfWordsFE	TokenNameIdentifier	 Bag Of Words FE
extends	TokenNameextends	
AnnotatedSpanFE	TokenNameIdentifier	 Annotated Span FE
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080306L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
extractFeatures	TokenNameIdentifier	 extract Features
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Simple bag of words feature extractor, with all tokens converted to lower * case. */	TokenNameCOMMENT_JAVADOC	 Simple bag of words feature extractor, with all tokens converted to lower case. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AnnotatedSpanFE	TokenNameIdentifier	 Annotated Span FE
BAG_OF_LC_WORDS	TokenNameIdentifier	 BAG  OF  LC  WORDS
=	TokenNameEQUAL	
new	TokenNamenew	
BagOfLowerCaseWordsFE	TokenNameIdentifier	 Bag Of Lower Case Words FE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
BagOfLowerCaseWordsFE	TokenNameIdentifier	 Bag Of Lower Case Words FE
extends	TokenNameextends	
AnnotatedSpanFE	TokenNameIdentifier	 Annotated Span FE
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080306L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
extractFeatures	TokenNameIdentifier	 extract Features
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lc	TokenNameIdentifier	 lc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A simple extraction-oriented feature extractor to apply to one-token spans, * for extraction tasks. */	TokenNameCOMMENT_JAVADOC	 A simple extraction-oriented feature extractor to apply to one-token spans, for extraction tasks. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AnnotatedSpanFE	TokenNameIdentifier	 Annotated Span FE
makeExtractionFE	TokenNameIdentifier	 make Extraction FE
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
featureWindowSize	TokenNameIdentifier	 feature Window Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtractionFE	TokenNameIdentifier	 Extraction FE
fe	TokenNameIdentifier	 fe
=	TokenNameEQUAL	
new	TokenNamenew	
ExtractionFE	TokenNameIdentifier	 Extraction FE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
setFeatureWindowSize	TokenNameIdentifier	 set Feature Window Size
(	TokenNameLPAREN	
featureWindowSize	TokenNameIdentifier	 feature Window Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An extraction-oriented feature extractor to apply to one-token spans, for * extraction tasks. */	TokenNameCOMMENT_JAVADOC	 An extraction-oriented feature extractor to apply to one-token spans, for extraction tasks. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ExtractionFE	TokenNameIdentifier	 Extraction FE
extends	TokenNameextends	
AnnotatedSpanFE	TokenNameIdentifier	 Annotated Span FE
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080306L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
windowSize	TokenNameIdentifier	 window Size
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
useCharType	TokenNameIdentifier	 use Char Type
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
useCompressedCharType	TokenNameIdentifier	 use Compressed Char Type
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExtractionFE	TokenNameIdentifier	 Extraction FE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExtractionFE	TokenNameIdentifier	 Extraction FE
(	TokenNameLPAREN	
int	TokenNameint	
windowSize	TokenNameIdentifier	 window Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
windowSize	TokenNameIdentifier	 window Size
=	TokenNameEQUAL	
windowSize	TokenNameIdentifier	 window Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// getters and setters 	TokenNameCOMMENT_LINE	getters and setters 
// 	TokenNameCOMMENT_LINE	 
/** * Specify the number of tokens on before and after the span to emit * features for. */	TokenNameCOMMENT_JAVADOC	 Specify the number of tokens on before and after the span to emit features for. 
public	TokenNamepublic	
void	TokenNamevoid	
setFeatureWindowSize	TokenNameIdentifier	 set Feature Window Size
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
windowSize	TokenNameIdentifier	 window Size
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getFeatureWindowSize	TokenNameIdentifier	 get Feature Window Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
windowSize	TokenNameIdentifier	 window Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set to true, produce features like "token.charTypePattern.Aaaa" for * the word "Bill" */	TokenNameCOMMENT_JAVADOC	 If set to true, produce features like "token.charTypePattern.Aaaa" for the word "Bill" 
public	TokenNamepublic	
void	TokenNamevoid	
setUseCharType	TokenNameIdentifier	 set Use Char Type
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
useCharType	TokenNameIdentifier	 use Char Type
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getUseCharType	TokenNameIdentifier	 get Use Char Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
useCharType	TokenNameIdentifier	 use Char Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set to true, produce features like "token.charTypePattern.Aa+" for the * word "Bill". */	TokenNameCOMMENT_JAVADOC	 If set to true, produce features like "token.charTypePattern.Aa+" for the word "Bill". 
public	TokenNamepublic	
void	TokenNamevoid	
setUseCompressedCharType	TokenNameIdentifier	 set Use Compressed Char Type
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
useCompressedCharType	TokenNameIdentifier	 use Compressed Char Type
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getUseCompressedCharType	TokenNameIdentifier	 get Use Compressed Char Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
useCompressedCharType	TokenNameIdentifier	 use Compressed Char Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify the token properties from the TextLabels environment that will be * used as features. A value of '*' means to use all defined token * properties. */	TokenNameCOMMENT_JAVADOC	 Specify the token properties from the TextLabels environment that will be used as features. A value of '*' means to use all defined token properties. 
public	TokenNamepublic	
void	TokenNamevoid	
setTokenPropertyFeatures	TokenNameIdentifier	 set Token Property Features
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commaSeparatedTokenPropertyList	TokenNameIdentifier	 comma Separated Token Property List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
commaSeparatedTokenPropertyList	TokenNameIdentifier	 comma Separated Token Property List
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("setting properties to null"); 	TokenNameCOMMENT_LINE	System.out.println("setting properties to null"); 
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
=	TokenNameEQUAL	
commaSeparatedTokenPropertyList	TokenNameIdentifier	 comma Separated Token Property List
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
",\s*"	TokenNameStringLiteral	,\s*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTokenPropertyFeatures	TokenNameIdentifier	 get Token Property Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTokenPropertyFeatures	TokenNameIdentifier	 set Token Property Features
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
propertySet	TokenNameIdentifier	 property Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
=	TokenNameEQUAL	
propertySet	TokenNameIdentifier	 property Set
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
propertySet	TokenNameIdentifier	 property Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
extractFeatures	TokenNameIdentifier	 extract Features
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extractFeatures	TokenNameIdentifier	 extract Features
(	TokenNameLPAREN	
new	TokenNamenew	
EmptyLabels	TokenNameIdentifier	 Empty Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
extractFeatures	TokenNameIdentifier	 extract Features
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
requireMyAnnotation	TokenNameIdentifier	 require My Annotation
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"setTokenPropertyFeatures to the set "	TokenNameStringLiteral	setTokenPropertyFeatures to the set 
+	TokenNamePLUS	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTokenProperties	TokenNameIdentifier	 get Token Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTokenPropertyFeatures	TokenNameIdentifier	 set Token Property Features
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTokenProperties	TokenNameIdentifier	 get Token Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tokens in span 	TokenNameCOMMENT_LINE	tokens in span 
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lc	TokenNameIdentifier	 lc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// simplified capitalization pattern 	TokenNameCOMMENT_LINE	simplified capitalization pattern 
if	TokenNameif	
(	TokenNameLPAREN	
useCompressedCharType	TokenNameIdentifier	 use Compressed Char Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charTypePattern	TokenNameIdentifier	 char Type Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// exact capitalization pattern 	TokenNameCOMMENT_LINE	exact capitalization pattern 
if	TokenNameif	
(	TokenNameLPAREN	
useCharType	TokenNameIdentifier	 use Char Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charTypes	TokenNameIdentifier	 char Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// token properties 	TokenNameCOMMENT_LINE	token properties 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
prop	TokenNameIdentifier	 prop
(	TokenNameLPAREN	
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// window 	TokenNameCOMMENT_LINE	window 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
windowSize	TokenNameIdentifier	 window Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lc	TokenNameIdentifier	 lc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lc	TokenNameIdentifier	 lc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Property: "+tokenPropertyFeatures[j]); 	TokenNameCOMMENT_LINE	System.out.println("Property: "+tokenPropertyFeatures[j]); 
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
prop	TokenNameIdentifier	 prop
(	TokenNameLPAREN	
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
prop	TokenNameIdentifier	 prop
(	TokenNameLPAREN	
tokenPropertyFeatures	TokenNameIdentifier	 token Property Features
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
useCompressedCharType	TokenNameIdentifier	 use Compressed Char Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charTypePattern	TokenNameIdentifier	 char Type Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charTypePattern	TokenNameIdentifier	 char Type Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
useCharType	TokenNameIdentifier	 use Char Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charTypes	TokenNameIdentifier	 char Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charTypes	TokenNameIdentifier	 char Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A feature extractor that pre-loads a mixup file or some other type of * annotation. */	TokenNameCOMMENT_JAVADOC	 A feature extractor that pre-loads a mixup file or some other type of annotation. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
AnnotatedSpanFE	TokenNameIdentifier	 Annotated Span FE
extends	TokenNameextends	
SpanFE	TokenNameIdentifier	 Span FE
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20081125L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test case to try out the feature extractors */	TokenNameCOMMENT_JAVADOC	 Test case to try out the feature extractors 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
=	TokenNameEQUAL	
BAG_OF_LC_WORDS	TokenNameIdentifier	 BAG  OF  LC  WORDS
;	TokenNameSEMICOLON	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
SampleDatasets	TokenNameIdentifier	 Sample Datasets
.	TokenNameDOT	
posTrain	TokenNameIdentifier	 pos Train
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
"pos"	TokenNameStringLiteral	pos
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
SampleDatasets	TokenNameIdentifier	 Sample Datasets
.	TokenNameDOT	
posTrain	TokenNameIdentifier	 pos Train
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
SampleDatasets	TokenNameIdentifier	 Sample Datasets
.	TokenNameDOT	
negTrain	TokenNameIdentifier	 neg Train
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
"neg"	TokenNameStringLiteral	neg
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
SampleDatasets	TokenNameIdentifier	 Sample Datasets
.	TokenNameDOT	
negTrain	TokenNameIdentifier	 neg Train
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
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
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
binaryLabel	TokenNameIdentifier	 binary Label
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"pos"	TokenNameStringLiteral	pos
)	TokenNameRPAREN	
?	TokenNameQUESTION	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextLabels	TokenNameIdentifier	 Text Labels
textLabels	TokenNameIdentifier	 text Labels
=	TokenNameEQUAL	
new	TokenNamenew	
EmptyLabels	TokenNameIdentifier	 Empty Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
extractInstance	TokenNameIdentifier	 extract Instance
(	TokenNameLPAREN	
textLabels	TokenNameIdentifier	 text Labels
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"Toy data"	TokenNameStringLiteral	Toy data
,	TokenNameCOMMA	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
