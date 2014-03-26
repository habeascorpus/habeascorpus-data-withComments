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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** A TextLabels which is defined by two TextLabels's. * * <p> Operationally, new assertions are passed to the 'outer' TextLabels. * Assertions about property definitions from the outer TextLabels shadow * assertions made in the inner TextLabels, and other assertions are added * to assertions in the inner TextLabels. * * <p> Pragmatically, this means that if you create a NestedTextLabels * from outerLabels and innerLabels, where outerLabels is empty, the * NestedTextLabels will initially look like innerLabels. But if you modify * it, innerLabels will not be changed, so you can at any point easily * revert to the old innerLabels TextLabels. * * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A TextLabels which is defined by two TextLabels's. * <p> Operationally, new assertions are passed to the 'outer' TextLabels. Assertions about property definitions from the outer TextLabels shadow assertions made in the inner TextLabels, and other assertions are added to assertions in the inner TextLabels. * <p> Pragmatically, this means that if you create a NestedTextLabels from outerLabels and innerLabels, where outerLabels is empty, the NestedTextLabels will initially look like innerLabels. But if you modify it, innerLabels will not be changed, so you can at any point easily revert to the old innerLabels TextLabels. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
implements	TokenNameimplements	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
outer	TokenNameIdentifier	 outer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextLabels	TokenNameIdentifier	 Text Labels
inner	TokenNameIdentifier	 inner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
shadowedProperties	TokenNameIdentifier	 shadowed Properties
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Create a NestedTextLabels. */	TokenNameCOMMENT_JAVADOC	 Create a NestedTextLabels. 
public	TokenNamepublic	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
(	TokenNameLPAREN	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
outer	TokenNameIdentifier	 outer
,	TokenNameCOMMA	
TextLabels	TokenNameIdentifier	 Text Labels
inner	TokenNameIdentifier	 inner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"mismatched text bases?"	TokenNameStringLiteral	mismatched text bases?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outer	TokenNameIdentifier	 outer
=	TokenNameEQUAL	
outer	TokenNameIdentifier	 outer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inner	TokenNameIdentifier	 inner
=	TokenNameEQUAL	
inner	TokenNameIdentifier	 inner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a NestedTextLabels with an empty outer labeling. */	TokenNameCOMMENT_JAVADOC	 Create a NestedTextLabels with an empty outer labeling. 
public	TokenNamepublic	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
inner	TokenNameIdentifier	 inner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outer	TokenNameIdentifier	 outer
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inner	TokenNameIdentifier	 inner
=	TokenNameEQUAL	
inner	TokenNameIdentifier	 inner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TextBase	TokenNameIdentifier	 Text Base
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasDictionary	TokenNameIdentifier	 has Dictionary
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hasDictionary	TokenNameIdentifier	 has Dictionary
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
||	TokenNameOR_OR	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
hasDictionary	TokenNameIdentifier	 has Dictionary
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnnotatedBy	TokenNameIdentifier	 is Annotated By
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
isAnnotatedBy	TokenNameIdentifier	 is Annotated By
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
||	TokenNameOR_OR	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
isAnnotatedBy	TokenNameIdentifier	 is Annotated By
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setAnnotatedBy	TokenNameIdentifier	 set Annotated By
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
setAnnotatedBy	TokenNameIdentifier	 set Annotated By
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
outer	TokenNameIdentifier	 outer
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
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getAnnotatorLoader	TokenNameIdentifier	 get Annotator Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
outer	TokenNameIdentifier	 outer
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
outer	TokenNameIdentifier	 outer
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
outer	TokenNameIdentifier	 outer
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
outer	TokenNameIdentifier	 outer
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
boolean	TokenNameboolean	
inDict	TokenNameIdentifier	 in Dict
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
outDict	TokenNameIdentifier	 out Dict
=	TokenNameEQUAL	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
hasDictionary	TokenNameIdentifier	 has Dictionary
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
innerDict	TokenNameIdentifier	 inner Dict
=	TokenNameEQUAL	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hasDictionary	TokenNameIdentifier	 has Dictionary
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outDict	TokenNameIdentifier	 out Dict
)	TokenNameRPAREN	
return	TokenNamereturn	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
inDict	TokenNameIdentifier	 in Dict
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
innerDict	TokenNameIdentifier	 inner Dict
)	TokenNameRPAREN	
return	TokenNamereturn	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
inDict	TokenNameIdentifier	 in Dict
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"undefined dictionary "	TokenNameStringLiteral	undefined dictionary 
+	TokenNamePLUS	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Effectively, remove the property from this TextLabels. * Specifically ensure that for this property (a) calls to setProperty * do nothing but cause a warning (b) calls to getProperty return null. */	TokenNameCOMMENT_JAVADOC	 Effectively, remove the property from this TextLabels. Specifically ensure that for this property (a) calls to setProperty do nothing but cause a warning (b) calls to getProperty return null. 
public	TokenNamepublic	
void	TokenNamevoid	
shadowProperty	TokenNameIdentifier	 shadow Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shadowedProperties	TokenNameIdentifier	 shadowed Properties
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
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
if	TokenNameif	
(	TokenNameLPAREN	
shadowedProperties	TokenNameIdentifier	 shadowed Properties
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Property "	TokenNameStringLiteral	Property 
+	TokenNamePLUS	
prop	TokenNameIdentifier	 prop
+	TokenNamePLUS	
" has been shadowed"	TokenNameStringLiteral	 has been shadowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
outer	TokenNameIdentifier	 outer
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
if	TokenNameif	
(	TokenNameLPAREN	
shadowedProperties	TokenNameIdentifier	 shadowed Properties
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Property "	TokenNameStringLiteral	Property 
+	TokenNamePLUS	
prop	TokenNameIdentifier	 prop
+	TokenNamePLUS	
" has been shadowed"	TokenNameStringLiteral	 has been shadowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
outer	TokenNameIdentifier	 outer
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
String	TokenNameIdentifier	 String
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shadowedProperties	TokenNameIdentifier	 shadowed Properties
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
r	TokenNameIdentifier	 r
:	TokenNameCOLON	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shadowedProperties	TokenNameIdentifier	 shadowed Properties
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
MyUnionIterator	TokenNameIdentifier	 My Union Iterator
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shadowedProperties	TokenNameIdentifier	 shadowed Properties
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
MyUnionIterator	TokenNameIdentifier	 My Union Iterator
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getTokenProperties	TokenNameIdentifier	 get Token Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
setUnion	TokenNameIdentifier	 set Union
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getTokenProperties	TokenNameIdentifier	 get Token Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getTokenProperties	TokenNameIdentifier	 get Token Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
shadowedProperties	TokenNameIdentifier	 shadowed Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
set	TokenNameIdentifier	 set
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
outer	TokenNameIdentifier	 outer
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
outer	TokenNameIdentifier	 outer
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
String	TokenNameIdentifier	 String
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
r	TokenNameIdentifier	 r
:	TokenNameCOLON	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
setUnion	TokenNameIdentifier	 set Union
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
!	TokenNameNOT	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hasType	TokenNameIdentifier	 has Type
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
outer	TokenNameIdentifier	 outer
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
!	TokenNameNOT	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hasType	TokenNameIdentifier	 has Type
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
outer	TokenNameIdentifier	 outer
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
boolean	TokenNameboolean	
hasType	TokenNameIdentifier	 has Type
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
hasType	TokenNameIdentifier	 has Type
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hasType	TokenNameIdentifier	 has Type
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
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
MyUnionIterator	TokenNameIdentifier	 My Union Iterator
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
MyUnionIterator	TokenNameIdentifier	 My Union Iterator
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
MyUnionIterator	TokenNameIdentifier	 My Union Iterator
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
MyUnionIterator	TokenNameIdentifier	 My Union Iterator
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
setUnion	TokenNameIdentifier	 set Union
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
getTypeSet	TokenNameIdentifier	 get Type Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
setUnion	TokenNameIdentifier	 set Union
(	TokenNameLPAREN	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getTypeSet	TokenNameIdentifier	 get Type Set
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getTypeSet	TokenNameIdentifier	 get Type Set
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
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
//System.out.println("NestedTextLabels: declareType: "+type); 	TokenNameCOMMENT_LINE	System.out.println("NestedTextLabels: declareType: "+type); 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
outer	TokenNameIdentifier	 outer
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
Details	TokenNameIdentifier	 Details
getDetails	TokenNameIdentifier	 get Details
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Details	TokenNameIdentifier	 Details
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getDetails	TokenNameIdentifier	 get Details
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
return	TokenNamereturn	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
getDetails	TokenNameIdentifier	 get Details
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
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileToLoad	TokenNameIdentifier	 file To Load
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
.	TokenNameDOT	
doRequire	TokenNameIdentifier	 do Require
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
fileToLoad	TokenNameIdentifier	 file To Load
,	TokenNameCOMMA	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
getAnnotatorLoader	TokenNameIdentifier	 get Annotator Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
.	TokenNameDOT	
doRequire	TokenNameIdentifier	 do Require
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
fileToLoad	TokenNameIdentifier	 file To Load
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Annotate labels with annotator named fileToLoad */	TokenNameCOMMENT_JAVADOC	 Annotate labels with annotator named fileToLoad 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
annotateWith	TokenNameIdentifier	 annotate With
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileToLoad	TokenNameIdentifier	 file To Load
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
.	TokenNameDOT	
annotateWith	TokenNameIdentifier	 annotate With
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
fileToLoad	TokenNameIdentifier	 file To Load
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
showTokenProp	TokenNameIdentifier	 show Token Prop
(	TokenNameLPAREN	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"outer: "	TokenNameStringLiteral	outer: 
+	TokenNamePLUS	
outer	TokenNameIdentifier	 outer
.	TokenNameDOT	
showTokenProp	TokenNameIdentifier	 show Token Prop
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
+	TokenNamePLUS	
" inner: "	TokenNameStringLiteral	 inner: 
+	TokenNamePLUS	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
showTokenProp	TokenNameIdentifier	 show Token Prop
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// private routines and classes 	TokenNameCOMMENT_LINE	private routines and classes 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
setUnion	TokenNameIdentifier	 set Union
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
MyUnionIterator	TokenNameIdentifier	 My Union Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
currentLooper	TokenNameIdentifier	 current Looper
;	TokenNameSEMICOLON	
// int estSize=-1; 	TokenNameCOMMENT_LINE	int estSize=-1; 
public	TokenNamepublic	
MyUnionIterator	TokenNameIdentifier	 My Union Iterator
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
currentLooper	TokenNameIdentifier	 current Looper
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentLooper	TokenNameIdentifier	 current Looper
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentLooper	TokenNameIdentifier	 current Looper
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
currentLooper	TokenNameIdentifier	 current Looper
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentLooper	TokenNameIdentifier	 current Looper
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
!	TokenNameNOT	
currentLooper	TokenNameIdentifier	 current Looper
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
currentLooper	TokenNameIdentifier	 current Looper
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
return	TokenNamereturn	
currentLooper	TokenNameIdentifier	 current Looper
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// public int estimatedSize(){ 	TokenNameCOMMENT_LINE	public int estimatedSize(){ 
// return estSize; 	TokenNameCOMMENT_LINE	return estSize; 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ZoomingTextLabelsViewer	TokenNameIdentifier	 Zooming Text Labels Viewer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[NestedLabels: outer="	TokenNameStringLiteral	[NestedLabels: outer=
+	TokenNamePLUS	
outer	TokenNameIdentifier	 outer
+	TokenNamePLUS	
"; inner="	TokenNameStringLiteral	; inner=
+	TokenNamePLUS	
inner	TokenNameIdentifier	 inner
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
