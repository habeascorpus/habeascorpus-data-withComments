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
.	TokenNameDOT	
experiments	TokenNameIdentifier	 experiments
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AnnotatorLoader	TokenNameIdentifier	 Annotator Loader
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
Details	TokenNameIdentifier	 Details
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
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
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
Token	TokenNameIdentifier	 Token
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
Trie	TokenNameIdentifier	 Trie
;	TokenNameSEMICOLON	
/** * A subset of another TextLabels that can be added to. Additions are propogated * back to the underlying MonotonicTextLabels passed in as an argument. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A subset of another TextLabels that can be added to. Additions are propogated back to the underlying MonotonicTextLabels passed in as an argument. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
MonotonicSubTextLabels	TokenNameIdentifier	 Monotonic Sub Text Labels
extends	TokenNameextends	
SubTextLabels	TokenNameIdentifier	 Sub Text Labels
implements	TokenNameimplements	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
{	TokenNameLBRACE	
private	TokenNameprivate	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
monotonicLabels	TokenNameIdentifier	 monotonic Labels
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setAnnotatorLoader	TokenNameIdentifier	 set Annotator Loader
(	TokenNameLPAREN	
AnnotatorLoader	TokenNameIdentifier	 Annotator Loader
newLoader	TokenNameIdentifier	 new Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
setAnnotatorLoader	TokenNameIdentifier	 set Annotator Loader
(	TokenNameLPAREN	
newLoader	TokenNameIdentifier	 new Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
AnnotatorLoader	TokenNameIdentifier	 Annotator Loader
getAnnotatorLoader	TokenNameIdentifier	 get Annotator Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
getAnnotatorLoader	TokenNameIdentifier	 get Annotator Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MonotonicSubTextLabels	TokenNameIdentifier	 Monotonic Sub Text Labels
(	TokenNameLPAREN	
SubTextBase	TokenNameIdentifier	 Sub Text Base
subBase	TokenNameIdentifier	 sub Base
,	TokenNameCOMMA	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
subBase	TokenNameIdentifier	 sub Base
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
defineDictionary	TokenNameIdentifier	 define Dictionary
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dictName	TokenNameIdentifier	 dict Name
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
dict	TokenNameIdentifier	 dict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
defineDictionary	TokenNameIdentifier	 define Dictionary
(	TokenNameLPAREN	
dictName	TokenNameIdentifier	 dict Name
,	TokenNameCOMMA	
dict	TokenNameIdentifier	 dict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Associate a dictionary from this file */	TokenNameCOMMENT_JAVADOC	 Associate a dictionary from this file 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
defineDictionary	TokenNameIdentifier	 define Dictionary
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dictName	TokenNameIdentifier	 dict Name
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fileNames	TokenNameIdentifier	 file Names
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
defineDictionary	TokenNameIdentifier	 define Dictionary
(	TokenNameLPAREN	
dictName	TokenNameIdentifier	 dict Name
,	TokenNameCOMMA	
fileNames	TokenNameIdentifier	 file Names
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return a trie if defined */	TokenNameCOMMENT_JAVADOC	 Return a trie if defined 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
getTrie	TokenNameIdentifier	 get Trie
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
getTrie	TokenNameIdentifier	 get Trie
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Define a trie */	TokenNameCOMMENT_JAVADOC	 Define a trie 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
defineTrie	TokenNameIdentifier	 define Trie
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phraseList	TokenNameIdentifier	 phrase List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
defineTrie	TokenNameIdentifier	 define Trie
(	TokenNameLPAREN	
phraseList	TokenNameIdentifier	 phrase List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Details	TokenNameIdentifier	 Details
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subBase	TokenNameIdentifier	 sub Base
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
)	TokenNameRPAREN	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Details	TokenNameIdentifier	 Details
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subBase	TokenNameIdentifier	 sub Base
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
)	TokenNameRPAREN	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subBase	TokenNameIdentifier	 sub Base
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
)	TokenNameRPAREN	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Details	TokenNameIdentifier	 Details
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subBase	TokenNameIdentifier	 sub Base
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
)	TokenNameRPAREN	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
declareType	TokenNameIdentifier	 declare Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
declareType	TokenNameIdentifier	 declare Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileToLoad	TokenNameIdentifier	 file To Load
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
fileToLoad	TokenNameIdentifier	 file To Load
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileToLoad	TokenNameIdentifier	 file To Load
,	TokenNameCOMMA	
AnnotatorLoader	TokenNameIdentifier	 Annotator Loader
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monotonicLabels	TokenNameIdentifier	 monotonic Labels
.	TokenNameDOT	
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
fileToLoad	TokenNameIdentifier	 file To Load
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
