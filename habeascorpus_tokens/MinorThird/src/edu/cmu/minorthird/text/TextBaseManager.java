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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedSet	TokenNameIdentifier	 Sorted Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
;	TokenNameSEMICOLON	
/** * Manages the mappings between TextBases. * * This class maintains a mapping of names to instances of TextBase. All of the TextBases in the * mapping are derived from the "root" level TextBase that was added first. Currently there are * two ways to derive a new TextBase from an existing one: {@link #filter(String, TextLabels, String, String) filter} * and {@link #retokenize(Tokenizer, String, String) retokenize}. * * * @author Quinten Mercer */	TokenNameCOMMENT_JAVADOC	 Manages the mappings between TextBases. * This class maintains a mapping of names to instances of TextBase. All of the TextBases in the mapping are derived from the "root" level TextBase that was added first. Currently there are two ways to derive a new TextBase from an existing one: {@link #filter(String, TextLabels, String, String) filter} and {@link #retokenize(Tokenizer, String, String) retokenize}. * @author Quinten Mercer 
public	TokenNamepublic	
class	TokenNameclass	
TextBaseManager	TokenNameIdentifier	 Text Base Manager
{	TokenNameLBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
>	TokenNameGREATER	
textBases	TokenNameIdentifier	 text Bases
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
>	TokenNameGREATER	
textBaseMappers	TokenNameIdentifier	 text Base Mappers
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new TextBaseManager using the specified textbase as the root textbase * and "root" as the name to identify it. */	TokenNameCOMMENT_JAVADOC	 Creates a new TextBaseManager using the specified textbase as the root textbase and "root" as the name to identify it. 
public	TokenNamepublic	
TextBaseManager	TokenNameIdentifier	 Text Base Manager
(	TokenNameLPAREN	
TextBase	TokenNameIdentifier	 Text Base
rootBase	TokenNameIdentifier	 root Base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
,	TokenNameCOMMA	
new	TokenNamenew	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
,	TokenNameCOMMA	
rootBase	TokenNameIdentifier	 root Base
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new TextBaseManager using the specified textbase as the root textbase and * the specified name is used in place of "root" to identify it. */	TokenNameCOMMENT_JAVADOC	 Creates a new TextBaseManager using the specified textbase as the root textbase and the specified name is used in place of "root" to identify it. 
public	TokenNamepublic	
TextBaseManager	TokenNameIdentifier	 Text Base Manager
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rootBaseName	TokenNameIdentifier	 root Base Name
,	TokenNameCOMMA	
TextBase	TokenNameIdentifier	 Text Base
rootBase	TokenNameIdentifier	 root Base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
rootBaseName	TokenNameIdentifier	 root Base Name
,	TokenNameCOMMA	
new	TokenNamenew	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
(	TokenNameLPAREN	
rootBaseName	TokenNameIdentifier	 root Base Name
,	TokenNameCOMMA	
rootBase	TokenNameIdentifier	 root Base
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a boolean indicating whether or not this manager has a level with the specified name */	TokenNameCOMMENT_JAVADOC	 Returns a boolean indicating whether or not this manager has a level with the specified name 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsLevel	TokenNameIdentifier	 contains Level
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
levelName	TokenNameIdentifier	 level Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
levelName	TokenNameIdentifier	 level Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the textbase identified by name. */	TokenNameCOMMENT_JAVADOC	 Returns the textbase identified by name. 
public	TokenNamepublic	
TextBase	TokenNameIdentifier	 Text Base
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a textbase to the manager that is a child of parentName. Null parentName * creates a new root textbase. Note that a single manager can maintain multiple * sets of textbases by adding multiple root textbases. */	TokenNameCOMMENT_JAVADOC	 Adds a textbase to the manager that is a child of parentName. Null parentName creates a new root textbase. Note that a single manager can maintain multiple sets of textbases by adding multiple root textbases. 
private	TokenNameprivate	
void	TokenNamevoid	
addTextBase	TokenNameIdentifier	 add Text Base
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
parentName	TokenNameIdentifier	 parent Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
childName	TokenNameIdentifier	 child Name
,	TokenNameCOMMA	
TextBase	TokenNameIdentifier	 Text Base
childTextBase	TokenNameIdentifier	 child Text Base
,	TokenNameCOMMA	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
parentEntry	TokenNameIdentifier	 parent Entry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Make sure that there is not a textbase being managed with the desired child name. 	TokenNameCOMMENT_LINE	Make sure that there is not a textbase being managed with the desired child name. 
if	TokenNameif	
(	TokenNameLPAREN	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
childName	TokenNameIdentifier	 child Name
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"TextBase already exists with name: "	TokenNameStringLiteral	TextBase already exists with name: 
+	TokenNamePLUS	
childName	TokenNameIdentifier	 child Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the entry of the parent 	TokenNameCOMMENT_LINE	Get the entry of the parent 
if	TokenNameif	
(	TokenNameLPAREN	
parentName	TokenNameIdentifier	 parent Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
parentEntry	TokenNameIdentifier	 parent Entry
=	TokenNameEQUAL	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
parentName	TokenNameIdentifier	 parent Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the new text base and it's mapper to the store of text bases and mappers 	TokenNameCOMMENT_LINE	Add the new text base and it's mapper to the store of text bases and mappers 
if	TokenNameif	
(	TokenNameLPAREN	
parentEntry	TokenNameIdentifier	 parent Entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// There's a parent so create a child level 	TokenNameCOMMENT_LINE	There's a parent so create a child level 
int	TokenNameint	
parentLevel	TokenNameIdentifier	 parent Level
=	TokenNameEQUAL	
parentEntry	TokenNameIdentifier	 parent Entry
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
childName	TokenNameIdentifier	 child Name
,	TokenNameCOMMA	
new	TokenNamenew	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
(	TokenNameLPAREN	
childName	TokenNameIdentifier	 child Name
,	TokenNameCOMMA	
childTextBase	TokenNameIdentifier	 child Text Base
,	TokenNameCOMMA	
parentLevel	TokenNameIdentifier	 parent Level
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parentEntry	TokenNameIdentifier	 parent Entry
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textBaseMappers	TokenNameIdentifier	 text Base Mappers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
childName	TokenNameIdentifier	 child Name
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// There is no parent so create a root level. 	TokenNameCOMMENT_LINE	There is no parent so create a root level. 
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
childName	TokenNameIdentifier	 child Name
,	TokenNameCOMMA	
new	TokenNamenew	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
(	TokenNameLPAREN	
childName	TokenNameIdentifier	 child Name
,	TokenNameCOMMA	
childTextBase	TokenNameIdentifier	 child Text Base
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textBaseMappers	TokenNameIdentifier	 text Base Mappers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
childName	TokenNameIdentifier	 child Name
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sometimes you may not have a source span, but rather only have a char offset in the source doc. There * are two scenarios where this could happen. First, it may be the case that you really just want to map * some char offset of an existing document. In this case this method will simply get the documentSpan * for the doc, use Span.charIndexSubSpan to create a span to map, and then forward the call to the * getMatchingSpan method that takes a source Span instance. The other situation is where you may need to * map sequences of chars before the document is actually in a TextBase. For instance, FilterTokenizer * needs to map char sequences in order to tokenize a document. This works because you can create maps * between documents in two text bases even if the destination document doesn't yet exist in the TextBase. * To make it happed, this method first maps the char offset to a span in it's parent, then calls * getMatchingSpan to propagate the mapping down to the destination textbase. */	TokenNameCOMMENT_JAVADOC	 Sometimes you may not have a source span, but rather only have a char offset in the source doc. There are two scenarios where this could happen. First, it may be the case that you really just want to map some char offset of an existing document. In this case this method will simply get the documentSpan for the doc, use Span.charIndexSubSpan to create a span to map, and then forward the call to the getMatchingSpan method that takes a source Span instance. The other situation is where you may need to map sequences of chars before the document is actually in a TextBase. For instance, FilterTokenizer needs to map char sequences in order to tokenize a document. This works because you can create maps between documents in two text bases even if the destination document doesn't yet exist in the TextBase. To make it happed, this method first maps the char offset to a span in it's parent, then calls getMatchingSpan to propagate the mapping down to the destination textbase. 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
getMatchingSpan	TokenNameIdentifier	 get Matching Span
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
srcName	TokenNameIdentifier	 src Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
srcDocId	TokenNameIdentifier	 src Doc Id
,	TokenNameCOMMA	
int	TokenNameint	
srcOffset	TokenNameIdentifier	 src Offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dstName	TokenNameIdentifier	 dst Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
srcEntry	TokenNameIdentifier	 src Entry
=	TokenNameEQUAL	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
srcName	TokenNameIdentifier	 src Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcEntry	TokenNameIdentifier	 src Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"There is no text base named: "	TokenNameStringLiteral	There is no text base named: 
+	TokenNamePLUS	
srcName	TokenNameIdentifier	 src Name
+	TokenNamePLUS	
" in this manager."	TokenNameStringLiteral	 in this manager.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// First try to get the document span for the source document 	TokenNameCOMMENT_LINE	First try to get the document span for the source document 
Span	TokenNameIdentifier	 Span
srcDocSpan	TokenNameIdentifier	 src Doc Span
=	TokenNameEQUAL	
srcEntry	TokenNameIdentifier	 src Entry
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
srcDocId	TokenNameIdentifier	 src Doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcDocSpan	TokenNameIdentifier	 src Doc Span
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getMatchingSpan	TokenNameIdentifier	 get Matching Span
(	TokenNameLPAREN	
srcDocSpan	TokenNameIdentifier	 src Doc Span
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
srcOffset	TokenNameIdentifier	 src Offset
,	TokenNameCOMMA	
srcOffset	TokenNameIdentifier	 src Offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
srcName	TokenNameIdentifier	 src Name
,	TokenNameCOMMA	
dstName	TokenNameIdentifier	 dst Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the document is unavailable then get the mapper that maps between the source and dest text bases. 	TokenNameCOMMENT_LINE	If the document is unavailable then get the mapper that maps between the source and dest text bases. 
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
mapper	TokenNameIdentifier	 mapper
=	TokenNameEQUAL	
textBaseMappers	TokenNameIdentifier	 text Base Mappers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
srcEntry	TokenNameIdentifier	 src Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mapper	TokenNameIdentifier	 mapper
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Get the mapping for the char index sequence in the source document to its parent. 	TokenNameCOMMENT_LINE	Get the mapping for the char index sequence in the source document to its parent. 
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
.	TokenNameDOT	
MapEntry	TokenNameIdentifier	 Map Entry
mapping	TokenNameIdentifier	 mapping
=	TokenNameEQUAL	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
getChildMapping	TokenNameIdentifier	 get Child Mapping
(	TokenNameLPAREN	
srcDocId	TokenNameIdentifier	 src Doc Id
,	TokenNameCOMMA	
srcOffset	TokenNameIdentifier	 src Offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no mapping could be found just return null 	TokenNameCOMMENT_LINE	If no mapping could be found just return null 
if	TokenNameif	
(	TokenNameLPAREN	
mapping	TokenNameIdentifier	 mapping
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Extract the info from the mapping to create a span in the parent document 	TokenNameCOMMENT_LINE	Extract the info from the mapping to create a span in the parent document 
String	TokenNameIdentifier	 String
parentDocId	TokenNameIdentifier	 parent Doc Id
=	TokenNameEQUAL	
mapping	TokenNameIdentifier	 mapping
.	TokenNameDOT	
dstDocId	TokenNameIdentifier	 dst Doc Id
;	TokenNameSEMICOLON	
int	TokenNameint	
parentOffset	TokenNameIdentifier	 parent Offset
=	TokenNameEQUAL	
mapping	TokenNameIdentifier	 mapping
.	TokenNameDOT	
dstOffset	TokenNameIdentifier	 dst Offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
srcOffset	TokenNameIdentifier	 src Offset
-	TokenNameMINUS	
mapping	TokenNameIdentifier	 mapping
.	TokenNameDOT	
srcOffset	TokenNameIdentifier	 src Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the span in the parent document that corresponds to this char index sequence 	TokenNameCOMMENT_LINE	Get the span in the parent document that corresponds to this char index sequence 
Span	TokenNameIdentifier	 Span
parentSpan	TokenNameIdentifier	 parent Span
=	TokenNameEQUAL	
srcEntry	TokenNameIdentifier	 src Entry
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
parentDocId	TokenNameIdentifier	 parent Doc Id
)	TokenNameRPAREN	
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
parentOffset	TokenNameIdentifier	 parent Offset
,	TokenNameCOMMA	
parentOffset	TokenNameIdentifier	 parent Offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Finally, map this span to the destination level using the normal mechanisms. 	TokenNameCOMMENT_LINE	Finally, map this span to the destination level using the normal mechanisms. 
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getMatchingSpan	TokenNameIdentifier	 get Matching Span
(	TokenNameLPAREN	
parentSpan	TokenNameIdentifier	 parent Span
,	TokenNameCOMMA	
srcEntry	TokenNameIdentifier	 src Entry
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dstName	TokenNameIdentifier	 dst Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Span srcSpan = srcEntry.getTextBase().documentSpan(srcDocId).charIndexSubSpan(srcOffset, srcOffset+length); 	TokenNameCOMMENT_LINE	Span srcSpan = srcEntry.getTextBase().documentSpan(srcDocId).charIndexSubSpan(srcOffset, srcOffset+length); 
//return this.getMatchingSpan(srcSpan, srcName, dstName); 	TokenNameCOMMENT_LINE	return this.getMatchingSpan(srcSpan, srcName, dstName); 
}	TokenNameRBRACE	
/** * Finds a mapping path from the source text base to the destination textbase and translates * the specified span through each successive mapping until the coresponding span in the * destination text base is located. */	TokenNameCOMMENT_JAVADOC	 Finds a mapping path from the source text base to the destination textbase and translates the specified span through each successive mapping until the coresponding span in the destination text base is located. 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
getMatchingSpan	TokenNameIdentifier	 get Matching Span
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
srcName	TokenNameIdentifier	 src Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dstName	TokenNameIdentifier	 dst Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
srcEntry	TokenNameIdentifier	 src Entry
=	TokenNameEQUAL	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
srcName	TokenNameIdentifier	 src Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
dstEntry	TokenNameIdentifier	 dst Entry
=	TokenNameEQUAL	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dstName	TokenNameIdentifier	 dst Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcEntry	TokenNameIdentifier	 src Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"There is no text base named: "	TokenNameStringLiteral	There is no text base named: 
+	TokenNamePLUS	
srcName	TokenNameIdentifier	 src Name
+	TokenNamePLUS	
" in this manager."	TokenNameStringLiteral	 in this manager.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstEntry	TokenNameIdentifier	 dst Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"There is no text base named: "	TokenNameStringLiteral	There is no text base named: 
+	TokenNamePLUS	
dstName	TokenNameIdentifier	 dst Name
+	TokenNamePLUS	
" in this manager."	TokenNameStringLiteral	 in this manager.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcEntry	TokenNameIdentifier	 src Entry
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The document that the specified span refers to is not in the source text base."	TokenNameStringLiteral	The document that the specified span refers to is not in the source text base.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Lists to store the path from both text bases to one that is common between them 	TokenNameCOMMENT_LINE	Lists to store the path from both text bases to one that is common between them 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
>	TokenNameGREATER	
srcMapperList	TokenNameIdentifier	 src Mapper List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
>	TokenNameGREATER	
dstMapperList	TokenNameIdentifier	 dst Mapper List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Generate a path of mappers that links from the src text base to the dst text base 	TokenNameCOMMENT_LINE	Generate a path of mappers that links from the src text base to the dst text base 
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
currSrcEntry	TokenNameIdentifier	 curr Src Entry
=	TokenNameEQUAL	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
srcName	TokenNameIdentifier	 src Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
currDstEntry	TokenNameIdentifier	 curr Dst Entry
=	TokenNameEQUAL	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dstName	TokenNameIdentifier	 dst Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
currSrcEntry	TokenNameIdentifier	 curr Src Entry
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
currDstEntry	TokenNameIdentifier	 curr Dst Entry
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currSrcEntry	TokenNameIdentifier	 curr Src Entry
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
currDstEntry	TokenNameIdentifier	 curr Dst Entry
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcMapperList	TokenNameIdentifier	 src Mapper List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
textBaseMappers	TokenNameIdentifier	 text Base Mappers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currSrcEntry	TokenNameIdentifier	 curr Src Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currSrcEntry	TokenNameIdentifier	 curr Src Entry
=	TokenNameEQUAL	
currSrcEntry	TokenNameIdentifier	 curr Src Entry
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dstMapperList	TokenNameIdentifier	 dst Mapper List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
textBaseMappers	TokenNameIdentifier	 text Base Mappers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currDstEntry	TokenNameIdentifier	 curr Dst Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currDstEntry	TokenNameIdentifier	 curr Dst Entry
=	TokenNameEQUAL	
currDstEntry	TokenNameIdentifier	 curr Dst Entry
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
currSrcEntry	TokenNameIdentifier	 curr Src Entry
!=	TokenNameNOT_EQUAL	
currDstEntry	TokenNameIdentifier	 curr Dst Entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcMapperList	TokenNameIdentifier	 src Mapper List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
textBaseMappers	TokenNameIdentifier	 text Base Mappers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currSrcEntry	TokenNameIdentifier	 curr Src Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currSrcEntry	TokenNameIdentifier	 curr Src Entry
=	TokenNameEQUAL	
currSrcEntry	TokenNameIdentifier	 curr Src Entry
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstMapperList	TokenNameIdentifier	 dst Mapper List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
textBaseMappers	TokenNameIdentifier	 text Base Mappers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currDstEntry	TokenNameIdentifier	 curr Dst Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currDstEntry	TokenNameIdentifier	 curr Dst Entry
=	TokenNameEQUAL	
currDstEntry	TokenNameIdentifier	 curr Dst Entry
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now follow that path from src to dst mapping the span to each intermediate text base 	TokenNameCOMMENT_LINE	Now follow that path from src to dst mapping the span to each intermediate text base 
// until we ultimately end up with the span in the dst text base. If at anytime we 	TokenNameCOMMENT_LINE	until we ultimately end up with the span in the dst text base. If at anytime we 
// encounter a null value for a mapped span, this indicates that there is no mapping 	TokenNameCOMMENT_LINE	encounter a null value for a mapped span, this indicates that there is no mapping 
// for this span between the source and destination text bases so return null 	TokenNameCOMMENT_LINE	for this span between the source and destination text bases so return null 
Span	TokenNameIdentifier	 Span
matchingSpan	TokenNameIdentifier	 matching Span
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
>	TokenNameGREATER	
srcIterator	TokenNameIdentifier	 src Iterator
=	TokenNameEQUAL	
srcMapperList	TokenNameIdentifier	 src Mapper List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
srcIterator	TokenNameIdentifier	 src Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
currMapper	TokenNameIdentifier	 curr Mapper
=	TokenNameEQUAL	
srcIterator	TokenNameIdentifier	 src Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchingSpan	TokenNameIdentifier	 matching Span
=	TokenNameEQUAL	
currMapper	TokenNameIdentifier	 curr Mapper
.	TokenNameDOT	
getMappedParentSpan	TokenNameIdentifier	 get Mapped Parent Span
(	TokenNameLPAREN	
matchingSpan	TokenNameIdentifier	 matching Span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingSpan	TokenNameIdentifier	 matching Span
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
>	TokenNameGREATER	
dstIterator	TokenNameIdentifier	 dst Iterator
=	TokenNameEQUAL	
dstMapperList	TokenNameIdentifier	 dst Mapper List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstIterator	TokenNameIdentifier	 dst Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
currMapper	TokenNameIdentifier	 curr Mapper
=	TokenNameEQUAL	
dstIterator	TokenNameIdentifier	 dst Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchingSpan	TokenNameIdentifier	 matching Span
=	TokenNameEQUAL	
currMapper	TokenNameIdentifier	 curr Mapper
.	TokenNameDOT	
getMappedChildSpan	TokenNameIdentifier	 get Mapped Child Span
(	TokenNameLPAREN	
matchingSpan	TokenNameIdentifier	 matching Span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingSpan	TokenNameIdentifier	 matching Span
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
matchingSpan	TokenNameIdentifier	 matching Span
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new TextBase named newLevelName from an existing TextBase named parentLevelName. This * new TextBase has the exact same document set as the parent, but all the docs will be retokenized * using the specified Tokenizer. */	TokenNameCOMMENT_JAVADOC	 Creates a new TextBase named newLevelName from an existing TextBase named parentLevelName. This new TextBase has the exact same document set as the parent, but all the docs will be retokenized using the specified Tokenizer. 
public	TokenNamepublic	
MutableTextBase	TokenNameIdentifier	 Mutable Text Base
retokenize	TokenNameIdentifier	 retokenize
(	TokenNameLPAREN	
Tokenizer	TokenNameIdentifier	 Tokenizer
newTokenizer	TokenNameIdentifier	 new Tokenizer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
parentLevelName	TokenNameIdentifier	 parent Level Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newLevelName	TokenNameIdentifier	 new Level Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
parentEntry	TokenNameIdentifier	 parent Entry
=	TokenNameEQUAL	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
parentLevelName	TokenNameIdentifier	 parent Level Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentEntry	TokenNameIdentifier	 parent Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"There is no text base named: "	TokenNameStringLiteral	There is no text base named: 
+	TokenNamePLUS	
parentLevelName	TokenNameIdentifier	 parent Level Name
+	TokenNamePLUS	
" in this manager."	TokenNameStringLiteral	 in this manager.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
newTextBase	TokenNameIdentifier	 new Text Base
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
newTokenizer	TokenNameIdentifier	 new Tokenizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
newMapper	TokenNameIdentifier	 new Mapper
=	TokenNameEQUAL	
new	TokenNamenew	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
(	TokenNameLPAREN	
parentEntry	TokenNameIdentifier	 parent Entry
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newTextBase	TokenNameIdentifier	 new Text Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addTextBase	TokenNameIdentifier	 add Text Base
(	TokenNameLPAREN	
parentLevelName	TokenNameIdentifier	 parent Level Name
,	TokenNameCOMMA	
newLevelName	TokenNameIdentifier	 new Level Name
,	TokenNameCOMMA	
newTextBase	TokenNameIdentifier	 new Text Base
,	TokenNameCOMMA	
newMapper	TokenNameIdentifier	 new Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
docsLooper	TokenNameIdentifier	 docs Looper
=	TokenNameEQUAL	
textBases	TokenNameIdentifier	 text Bases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
parentLevelName	TokenNameIdentifier	 parent Level Name
)	TokenNameRPAREN	
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
docsLooper	TokenNameIdentifier	 docs Looper
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
currDocSpan	TokenNameIdentifier	 curr Doc Span
=	TokenNameEQUAL	
docsLooper	TokenNameIdentifier	 docs Looper
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newTextBase	TokenNameIdentifier	 new Text Base
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
currDocSpan	TokenNameIdentifier	 curr Doc Span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currDocSpan	TokenNameIdentifier	 curr Doc Span
.	TokenNameDOT	
getDocumentContents	TokenNameIdentifier	 get Document Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Retokenizing does NOT change the underlying document structure so all we need to do is add a single 	TokenNameCOMMENT_LINE	Retokenizing does NOT change the underlying document structure so all we need to do is add a single 
// map entry that maps position 0 from the parent text base to position 0 in the child text base. Also 	TokenNameCOMMENT_LINE	map entry that maps position 0 from the parent text base to position 0 in the child text base. Also 
// the documentIds don't change in the new textbase. 	TokenNameCOMMENT_LINE	the documentIds don't change in the new textbase. 
newMapper	TokenNameIdentifier	 new Mapper
.	TokenNameDOT	
mapPlace	TokenNameIdentifier	 map Place
(	TokenNameLPAREN	
currDocSpan	TokenNameIdentifier	 curr Doc Span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currDocSpan	TokenNameIdentifier	 curr Doc Span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newTextBase	TokenNameIdentifier	 new Text Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new TextBase named newLevelName from an existing TextBase named parentLevelName. This * new TextBase will contain a document for each instance of the provided spanType in the parent * TextBase (specified by parentLabels). For example if a document in the parent TextBase has 3 * instances of the specified spanType, then the new TextBase will have 3 separate documents. All * text that is not part of the specified spanType is filtered out and does not appear in the * new TextBase anywhere. */	TokenNameCOMMENT_JAVADOC	 Creates a new TextBase named newLevelName from an existing TextBase named parentLevelName. This new TextBase will contain a document for each instance of the provided spanType in the parent TextBase (specified by parentLabels). For example if a document in the parent TextBase has 3 instances of the specified spanType, then the new TextBase will have 3 separate documents. All text that is not part of the specified spanType is filtered out and does not appear in the new TextBase anywhere. 
public	TokenNamepublic	
TextBase	TokenNameIdentifier	 Text Base
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
parentLevelName	TokenNameIdentifier	 parent Level Name
,	TokenNameCOMMA	
TextLabels	TokenNameIdentifier	 Text Labels
parentLabels	TokenNameIdentifier	 parent Labels
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newLevelName	TokenNameIdentifier	 new Level Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
spanType	TokenNameIdentifier	 span Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
newTextBase	TokenNameIdentifier	 new Text Base
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
new	TokenNamenew	
FilterTokenizer	TokenNameIdentifier	 Filter Tokenizer
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
newLevelName	TokenNameIdentifier	 new Level Name
,	TokenNameCOMMA	
parentLevelName	TokenNameIdentifier	 parent Level Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
newMapper	TokenNameIdentifier	 new Mapper
=	TokenNameEQUAL	
new	TokenNamenew	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
(	TokenNameLPAREN	
parentLabels	TokenNameIdentifier	 parent Labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newTextBase	TokenNameIdentifier	 new Text Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addTextBase	TokenNameIdentifier	 add Text Base
(	TokenNameLPAREN	
parentLevelName	TokenNameIdentifier	 parent Level Name
,	TokenNameCOMMA	
newLevelName	TokenNameIdentifier	 new Level Name
,	TokenNameCOMMA	
newTextBase	TokenNameIdentifier	 new Text Base
,	TokenNameCOMMA	
newMapper	TokenNameIdentifier	 new Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
typeInstances	TokenNameIdentifier	 type Instances
=	TokenNameEQUAL	
parentLabels	TokenNameIdentifier	 parent Labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
spanType	TokenNameIdentifier	 span Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prevDocId	TokenNameIdentifier	 prev Doc Id
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
//useful for checking whether the next span is in the same doc 	TokenNameCOMMENT_LINE	useful for checking whether the next span is in the same doc 
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//counts how many spans have the type in each document 	TokenNameCOMMENT_LINE	counts how many spans have the type in each document 
while	TokenNamewhile	
(	TokenNameLPAREN	
typeInstances	TokenNameIdentifier	 type Instances
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
currInstance	TokenNameIdentifier	 curr Instance
=	TokenNameEQUAL	
typeInstances	TokenNameIdentifier	 type Instances
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
curDocId	TokenNameIdentifier	 cur Doc Id
=	TokenNameEQUAL	
currInstance	TokenNameIdentifier	 curr Instance
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This code assumes that the TextBase.instanceIterator method returns the spans ordered 	TokenNameCOMMENT_LINE	This code assumes that the TextBase.instanceIterator method returns the spans ordered 
// by document ID. This method makes NO guarantee that this will be true. 	TokenNameCOMMENT_LINE	by document ID. This method makes NO guarantee that this will be true. 
if	TokenNameif	
(	TokenNameLPAREN	
curDocId	TokenNameIdentifier	 cur Doc Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prevDocId	TokenNameIdentifier	 prev Doc Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
docNum	TokenNameIdentifier	 doc Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
else	TokenNameelse	
docNum	TokenNameIdentifier	 doc Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newDocID	TokenNameIdentifier	 new Doc ID
=	TokenNameEQUAL	
"childTB"	TokenNameStringLiteral	childTB
+	TokenNamePLUS	
docNum	TokenNameIdentifier	 doc Num
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
curDocId	TokenNameIdentifier	 cur Doc Id
;	TokenNameSEMICOLON	
// Map the doc span in the old text base to the correct document in the new text base. No offset 	TokenNameCOMMENT_LINE	Map the doc span in the old text base to the correct document in the new text base. No offset 
// is required in the new doc since it we are just chopping up the original doc into pieces. 	TokenNameCOMMENT_LINE	is required in the new doc since it we are just chopping up the original doc into pieces. 
newMapper	TokenNameIdentifier	 new Mapper
.	TokenNameDOT	
mapPlace	TokenNameIdentifier	 map Place
(	TokenNameLPAREN	
curDocId	TokenNameIdentifier	 cur Doc Id
,	TokenNameCOMMA	
currInstance	TokenNameIdentifier	 curr Instance
.	TokenNameDOT	
getLoChar	TokenNameIdentifier	 get Lo Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newDocID	TokenNameIdentifier	 new Doc ID
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevDocId	TokenNameIdentifier	 prev Doc Id
=	TokenNameEQUAL	
curDocId	TokenNameIdentifier	 cur Doc Id
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newDocText	TokenNameIdentifier	 new Doc Text
=	TokenNameEQUAL	
currInstance	TokenNameIdentifier	 curr Instance
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
currInstance	TokenNameIdentifier	 curr Instance
.	TokenNameDOT	
getLoChar	TokenNameIdentifier	 get Lo Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newTextBase	TokenNameIdentifier	 new Text Base
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
newDocID	TokenNameIdentifier	 new Doc ID
,	TokenNameCOMMA	
newDocText	TokenNameIdentifier	 new Doc Text
,	TokenNameCOMMA	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newTextBase	TokenNameIdentifier	 new Text Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Used internally to help manage the set of TextBases 	TokenNameCOMMENT_LINE	Used internally to help manage the set of TextBases 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
class	TokenNameclass	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
entryName	TokenNameIdentifier	 entry Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextBase	TokenNameIdentifier	 Text Base
textBase	TokenNameIdentifier	 text Base
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newEntryName	TokenNameIdentifier	 new Entry Name
,	TokenNameCOMMA	
TextBase	TokenNameIdentifier	 Text Base
newTextBase	TokenNameIdentifier	 new Text Base
,	TokenNameCOMMA	
int	TokenNameint	
newLevel	TokenNameIdentifier	 new Level
,	TokenNameCOMMA	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
newParent	TokenNameIdentifier	 new Parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entryName	TokenNameIdentifier	 entry Name
=	TokenNameEQUAL	
newEntryName	TokenNameIdentifier	 new Entry Name
;	TokenNameSEMICOLON	
textBase	TokenNameIdentifier	 text Base
=	TokenNameEQUAL	
newTextBase	TokenNameIdentifier	 new Text Base
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
newLevel	TokenNameIdentifier	 new Level
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
newParent	TokenNameIdentifier	 new Parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entryName	TokenNameIdentifier	 entry Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextBase	TokenNameIdentifier	 Text Base
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
textBase	TokenNameIdentifier	 text Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextBaseEntry	TokenNameIdentifier	 Text Base Entry
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Used internally to create the map between two textBases. 	TokenNameCOMMENT_LINE	Used internally to create the map between two textBases. 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
class	TokenNameclass	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
TextBase	TokenNameIdentifier	 Text Base
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextBase	TokenNameIdentifier	 Text Base
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>>	TokenNameRIGHT_SHIFT	
parentToChildMap	TokenNameIdentifier	 parent To Child Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>>	TokenNameRIGHT_SHIFT	
childToParentMap	TokenNameIdentifier	 child To Parent Map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TextBaseMapper	TokenNameIdentifier	 Text Base Mapper
(	TokenNameLPAREN	
TextBase	TokenNameIdentifier	 Text Base
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
TextBase	TokenNameIdentifier	 Text Base
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parentToChildMap	TokenNameIdentifier	 parent To Child Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
childToParentMap	TokenNameIdentifier	 child To Parent Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a mapping between two documents. This has the effect of mapping a point in the parent * document to a point in the child document (and vice versa). However, it is assumed that all * following characters up to the next mapped point are also mapped in order. * * For instance: Say the parent document is 20 characters long and there are two children docs * each of which is 10 characters long. If there are mappings from parent:0 to child1:0 and * from parent:11 to child2:0, then what we really have is a mapping of the first 10 chars of the * parent to the first 10 chars in child1 and a mapping of the last 10 chars in parent to the * first 10 chars in child2. */	TokenNameCOMMENT_JAVADOC	 Adds a mapping between two documents. This has the effect of mapping a point in the parent document to a point in the child document (and vice versa). However, it is assumed that all following characters up to the next mapped point are also mapped in order. * For instance: Say the parent document is 20 characters long and there are two children docs each of which is 10 characters long. If there are mappings from parent:0 to child1:0 and from parent:11 to child2:0, then what we really have is a mapping of the first 10 chars of the parent to the first 10 chars in child1 and a mapping of the last 10 chars in parent to the first 10 chars in child2. 
public	TokenNamepublic	
void	TokenNamevoid	
mapPlace	TokenNameIdentifier	 map Place
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
parentDocId	TokenNameIdentifier	 parent Doc Id
,	TokenNameCOMMA	
int	TokenNameint	
parentOffset	TokenNameIdentifier	 parent Offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
childDocId	TokenNameIdentifier	 child Doc Id
,	TokenNameCOMMA	
int	TokenNameint	
childOffset	TokenNameIdentifier	 child Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>	TokenNameGREATER	
parentEntry	TokenNameIdentifier	 parent Entry
=	TokenNameEQUAL	
parentToChildMap	TokenNameIdentifier	 parent To Child Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
parentDocId	TokenNameIdentifier	 parent Doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentEntry	TokenNameIdentifier	 parent Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentEntry	TokenNameIdentifier	 parent Entry
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parentToChildMap	TokenNameIdentifier	 parent To Child Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
parentDocId	TokenNameIdentifier	 parent Doc Id
,	TokenNameCOMMA	
parentEntry	TokenNameIdentifier	 parent Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parentEntry	TokenNameIdentifier	 parent Entry
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
MapEntry	TokenNameIdentifier	 Map Entry
(	TokenNameLPAREN	
parentDocId	TokenNameIdentifier	 parent Doc Id
,	TokenNameCOMMA	
parentOffset	TokenNameIdentifier	 parent Offset
,	TokenNameCOMMA	
childDocId	TokenNameIdentifier	 child Doc Id
,	TokenNameCOMMA	
childOffset	TokenNameIdentifier	 child Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>	TokenNameGREATER	
childEntry	TokenNameIdentifier	 child Entry
=	TokenNameEQUAL	
childToParentMap	TokenNameIdentifier	 child To Parent Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
childDocId	TokenNameIdentifier	 child Doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childEntry	TokenNameIdentifier	 child Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
childEntry	TokenNameIdentifier	 child Entry
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childToParentMap	TokenNameIdentifier	 child To Parent Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
childDocId	TokenNameIdentifier	 child Doc Id
,	TokenNameCOMMA	
childEntry	TokenNameIdentifier	 child Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
childEntry	TokenNameIdentifier	 child Entry
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
MapEntry	TokenNameIdentifier	 Map Entry
(	TokenNameLPAREN	
childDocId	TokenNameIdentifier	 child Doc Id
,	TokenNameCOMMA	
childOffset	TokenNameIdentifier	 child Offset
,	TokenNameCOMMA	
parentDocId	TokenNameIdentifier	 parent Doc Id
,	TokenNameCOMMA	
parentOffset	TokenNameIdentifier	 parent Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the MapEntry for the parent TextBase that includes the position listed in parentOffset */	TokenNameCOMMENT_JAVADOC	 Gets the MapEntry for the parent TextBase that includes the position listed in parentOffset 
public	TokenNamepublic	
MapEntry	TokenNameIdentifier	 Map Entry
getParentMapping	TokenNameIdentifier	 get Parent Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
parentDocId	TokenNameIdentifier	 parent Doc Id
,	TokenNameCOMMA	
int	TokenNameint	
parentOffset	TokenNameIdentifier	 parent Offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>	TokenNameGREATER	
parentDocMap	TokenNameIdentifier	 parent Doc Map
=	TokenNameEQUAL	
parentToChildMap	TokenNameIdentifier	 parent To Child Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
parentDocId	TokenNameIdentifier	 parent Doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentDocMap	TokenNameIdentifier	 parent Doc Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Document containing parent char sequence has no mappings."	TokenNameStringLiteral	Document containing parent char sequence has no mappings.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Iterate through this document's map entries until we find the entry that contains the entire parent span. 	TokenNameCOMMENT_LINE	Iterate through this document's map entries until we find the entry that contains the entire parent span. 
// If there is no entry that contains the parent span, then give an error. The entry is found by finding the 	TokenNameCOMMENT_LINE	If there is no entry that contains the parent span, then give an error. The entry is found by finding the 
// first entry whose offset is greater than both the start and end of the parent, then the previous entry has 	TokenNameCOMMENT_LINE	first entry whose offset is greater than both the start and end of the parent, then the previous entry has 
// the info we need. 	TokenNameCOMMENT_LINE	the info we need. 
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
parentDocMap	TokenNameIdentifier	 parent Doc Map
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MapEntry	TokenNameIdentifier	 Map Entry
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
parentEntry	TokenNameIdentifier	 parent Entry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the current entry is before the start of the parent span update the parentEntry 	TokenNameCOMMENT_LINE	If the current entry is before the start of the parent span update the parentEntry 
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
srcOffset	TokenNameIdentifier	 src Offset
<=	TokenNameLESS_EQUAL	
parentOffset	TokenNameIdentifier	 parent Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentEntry	TokenNameIdentifier	 parent Entry
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
srcOffset	TokenNameIdentifier	 src Offset
<	TokenNameLESS	
(	TokenNameLPAREN	
parentOffset	TokenNameIdentifier	 parent Offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
parentEntry	TokenNameIdentifier	 parent Entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the MapEntry for the child TextBase that includes the position listed in childOffset */	TokenNameCOMMENT_JAVADOC	 Gets the MapEntry for the child TextBase that includes the position listed in childOffset 
public	TokenNamepublic	
MapEntry	TokenNameIdentifier	 Map Entry
getChildMapping	TokenNameIdentifier	 get Child Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
childDocId	TokenNameIdentifier	 child Doc Id
,	TokenNameCOMMA	
int	TokenNameint	
childOffset	TokenNameIdentifier	 child Offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>	TokenNameGREATER	
childDocMap	TokenNameIdentifier	 child Doc Map
=	TokenNameEQUAL	
childToParentMap	TokenNameIdentifier	 child To Parent Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
childDocId	TokenNameIdentifier	 child Doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childDocMap	TokenNameIdentifier	 child Doc Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Document containing child char sequence has no mappings."	TokenNameStringLiteral	Document containing child char sequence has no mappings.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Iterate through this document's map entries until we find the entry that contains the entire parent span. 	TokenNameCOMMENT_LINE	Iterate through this document's map entries until we find the entry that contains the entire parent span. 
// If there is no entry that contains the parent span, then give an error. The entry is found by finding the 	TokenNameCOMMENT_LINE	If there is no entry that contains the parent span, then give an error. The entry is found by finding the 
// first entry whose offset is greater than both the start and end of the parent, then the previous entry has 	TokenNameCOMMENT_LINE	first entry whose offset is greater than both the start and end of the parent, then the previous entry has 
// the info we need. 	TokenNameCOMMENT_LINE	the info we need. 
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
childDocMap	TokenNameIdentifier	 child Doc Map
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MapEntry	TokenNameIdentifier	 Map Entry
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
childEntry	TokenNameIdentifier	 child Entry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the current entry is before the start of the parent span update the childEntry 	TokenNameCOMMENT_LINE	If the current entry is before the start of the parent span update the childEntry 
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
srcOffset	TokenNameIdentifier	 src Offset
<=	TokenNameLESS_EQUAL	
childOffset	TokenNameIdentifier	 child Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
childEntry	TokenNameIdentifier	 child Entry
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
srcOffset	TokenNameIdentifier	 src Offset
<	TokenNameLESS	
(	TokenNameLPAREN	
childOffset	TokenNameIdentifier	 child Offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
childEntry	TokenNameIdentifier	 child Entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds the span in the child TextBase that corresponds to the provided span in the parent TextBase. */	TokenNameCOMMENT_JAVADOC	 Finds the span in the child TextBase that corresponds to the provided span in the parent TextBase. 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
getMappedChildSpan	TokenNameIdentifier	 get Mapped Child Span
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
parentSpan	TokenNameIdentifier	 parent Span
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
parentSpan	TokenNameIdentifier	 parent Span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Document containing parent span not in the child text base of this mapper."	TokenNameStringLiteral	Document containing parent span not in the child text base of this mapper.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
parentLo	TokenNameIdentifier	 parent Lo
=	TokenNameEQUAL	
parentSpan	TokenNameIdentifier	 parent Span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
parentHi	TokenNameIdentifier	 parent Hi
=	TokenNameEQUAL	
parentSpan	TokenNameIdentifier	 parent Span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
parentSpan	TokenNameIdentifier	 parent Span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MapEntry	TokenNameIdentifier	 Map Entry
parentEntry	TokenNameIdentifier	 parent Entry
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getParentMapping	TokenNameIdentifier	 get Parent Mapping
(	TokenNameLPAREN	
parentSpan	TokenNameIdentifier	 parent Span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parentLo	TokenNameIdentifier	 parent Lo
,	TokenNameCOMMA	
parentHi	TokenNameIdentifier	 parent Hi
-	TokenNameMINUS	
parentLo	TokenNameIdentifier	 parent Lo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no approptiate entry was found that maps the parent span, then there is no mapping for this 	TokenNameCOMMENT_LINE	If no approptiate entry was found that maps the parent span, then there is no mapping for this 
// span between these two text bases so just return null. 	TokenNameCOMMENT_LINE	span between these two text bases so just return null. 
if	TokenNameif	
(	TokenNameLPAREN	
parentEntry	TokenNameIdentifier	 parent Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Otherwise compute the index offsets for the new (mapperd) span as follows: 	TokenNameCOMMENT_LINE	Otherwise compute the index offsets for the new (mapperd) span as follows: 
// lo index: the mapped offset (destination) from the entry 	TokenNameCOMMENT_LINE	lo index: the mapped offset (destination) from the entry 
return	TokenNamereturn	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
parentEntry	TokenNameIdentifier	 parent Entry
.	TokenNameDOT	
dstDocId	TokenNameIdentifier	 dst Doc Id
)	TokenNameRPAREN	
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
parentEntry	TokenNameIdentifier	 parent Entry
.	TokenNameDOT	
dstOffset	TokenNameIdentifier	 dst Offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
parentLo	TokenNameIdentifier	 parent Lo
-	TokenNameMINUS	
parentEntry	TokenNameIdentifier	 parent Entry
.	TokenNameDOT	
srcOffset	TokenNameIdentifier	 src Offset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parentEntry	TokenNameIdentifier	 parent Entry
.	TokenNameDOT	
dstOffset	TokenNameIdentifier	 dst Offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
parentHi	TokenNameIdentifier	 parent Hi
-	TokenNameMINUS	
parentEntry	TokenNameIdentifier	 parent Entry
.	TokenNameDOT	
srcOffset	TokenNameIdentifier	 src Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds the span in the parent TextBase that corresponds to the provided span in the child TextBase. */	TokenNameCOMMENT_JAVADOC	 Finds the span in the parent TextBase that corresponds to the provided span in the child TextBase. 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
getMappedParentSpan	TokenNameIdentifier	 get Mapped Parent Span
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
childSpan	TokenNameIdentifier	 child Span
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
childSpan	TokenNameIdentifier	 child Span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Document containing child span not in the parent text base of this mapper."	TokenNameStringLiteral	Document containing child span not in the parent text base of this mapper.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
childLo	TokenNameIdentifier	 child Lo
=	TokenNameEQUAL	
childSpan	TokenNameIdentifier	 child Span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
childHi	TokenNameIdentifier	 child Hi
=	TokenNameEQUAL	
childSpan	TokenNameIdentifier	 child Span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
childSpan	TokenNameIdentifier	 child Span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MapEntry	TokenNameIdentifier	 Map Entry
childEntry	TokenNameIdentifier	 child Entry
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChildMapping	TokenNameIdentifier	 get Child Mapping
(	TokenNameLPAREN	
childSpan	TokenNameIdentifier	 child Span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
childLo	TokenNameIdentifier	 child Lo
,	TokenNameCOMMA	
childHi	TokenNameIdentifier	 child Hi
-	TokenNameMINUS	
childLo	TokenNameIdentifier	 child Lo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no approptiate entry was found that maps the parent span, then there is no mapping for this 	TokenNameCOMMENT_LINE	If no approptiate entry was found that maps the parent span, then there is no mapping for this 
// span between these two text bases so just return null. 	TokenNameCOMMENT_LINE	span between these two text bases so just return null. 
if	TokenNameif	
(	TokenNameLPAREN	
childEntry	TokenNameIdentifier	 child Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Otherwise compute the index offsets for the new (mapped) span as follows: 	TokenNameCOMMENT_LINE	Otherwise compute the index offsets for the new (mapped) span as follows: 
// lo index: the mapped offset (destination) from the entry 	TokenNameCOMMENT_LINE	lo index: the mapped offset (destination) from the entry 
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
childEntry	TokenNameIdentifier	 child Entry
.	TokenNameDOT	
dstDocId	TokenNameIdentifier	 dst Doc Id
)	TokenNameRPAREN	
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
childEntry	TokenNameIdentifier	 child Entry
.	TokenNameDOT	
dstOffset	TokenNameIdentifier	 dst Offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
childLo	TokenNameIdentifier	 child Lo
-	TokenNameMINUS	
childEntry	TokenNameIdentifier	 child Entry
.	TokenNameDOT	
srcOffset	TokenNameIdentifier	 src Offset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
childEntry	TokenNameIdentifier	 child Entry
.	TokenNameDOT	
dstOffset	TokenNameIdentifier	 dst Offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
childHi	TokenNameIdentifier	 child Hi
-	TokenNameMINUS	
childEntry	TokenNameIdentifier	 child Entry
.	TokenNameDOT	
srcOffset	TokenNameIdentifier	 src Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used for debugging purposes. */	TokenNameCOMMENT_JAVADOC	 Used for debugging purposes. 
// public void printMap(){ 	TokenNameCOMMENT_LINE	public void printMap(){ 
// System.out 	TokenNameCOMMENT_LINE	System.out 
// .println("****************************************************"); 	TokenNameCOMMENT_LINE	.println("****************************************************"); 
// System.out.println("*** Mapper Between Parent: "+parent+" and Child: "+ 	TokenNameCOMMENT_LINE	System.out.println("*** Mapper Between Parent: "+parent+" and Child: "+ 
// child+" ***"); 	TokenNameCOMMENT_LINE	child+" ***"); 
// System.out 	TokenNameCOMMENT_LINE	System.out 
// .println("*** ***"); 	TokenNameCOMMENT_LINE	.println("*** ***"); 
// System.out 	TokenNameCOMMENT_LINE	System.out 
// .println("*** Parent To Child mappings: ***"); 	TokenNameCOMMENT_LINE	.println("*** Parent To Child mappings: ***"); 
// 	TokenNameCOMMENT_LINE	 
// Iterator<String> keyIterator=parentToChildMap.keySet().iterator(); 	TokenNameCOMMENT_LINE	Iterator<String> keyIterator=parentToChildMap.keySet().iterator(); 
// while(keyIterator.hasNext()){ 	TokenNameCOMMENT_LINE	while(keyIterator.hasNext()){ 
// String currKey=keyIterator.next(); 	TokenNameCOMMENT_LINE	String currKey=keyIterator.next(); 
// SortedSet<MapEntry> currDocMapings=parentToChildMap.get(currKey); 	TokenNameCOMMENT_LINE	SortedSet<MapEntry> currDocMapings=parentToChildMap.get(currKey); 
// Iterator<MapEntry> mappingsIterator=currDocMapings.iterator(); 	TokenNameCOMMENT_LINE	Iterator<MapEntry> mappingsIterator=currDocMapings.iterator(); 
// while(mappingsIterator.hasNext()){ 	TokenNameCOMMENT_LINE	while(mappingsIterator.hasNext()){ 
// System.out.println("*** "+mappingsIterator.next()+" ***"); 	TokenNameCOMMENT_LINE	System.out.println("*** "+mappingsIterator.next()+" ***"); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// System.out 	TokenNameCOMMENT_LINE	System.out 
// .println("*** ***"); 	TokenNameCOMMENT_LINE	.println("*** ***"); 
// System.out 	TokenNameCOMMENT_LINE	System.out 
// .println("*** Child To Parent mappings: ***"); 	TokenNameCOMMENT_LINE	.println("*** Child To Parent mappings: ***"); 
// 	TokenNameCOMMENT_LINE	 
// keyIterator=childToParentMap.keySet().iterator(); 	TokenNameCOMMENT_LINE	keyIterator=childToParentMap.keySet().iterator(); 
// while(keyIterator.hasNext()){ 	TokenNameCOMMENT_LINE	while(keyIterator.hasNext()){ 
// String currKey=keyIterator.next(); 	TokenNameCOMMENT_LINE	String currKey=keyIterator.next(); 
// SortedSet<MapEntry> currDocMapings=childToParentMap.get(currKey); 	TokenNameCOMMENT_LINE	SortedSet<MapEntry> currDocMapings=childToParentMap.get(currKey); 
// Iterator<MapEntry> mappingsIterator=currDocMapings.iterator(); 	TokenNameCOMMENT_LINE	Iterator<MapEntry> mappingsIterator=currDocMapings.iterator(); 
// while(mappingsIterator.hasNext()){ 	TokenNameCOMMENT_LINE	while(mappingsIterator.hasNext()){ 
// System.out.println("*** "+mappingsIterator.next()+" ***"); 	TokenNameCOMMENT_LINE	System.out.println("*** "+mappingsIterator.next()+" ***"); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// System.out 	TokenNameCOMMENT_LINE	System.out 
// .println("****************************************************\n\n"); 	TokenNameCOMMENT_LINE	.println("****************************************************\n\n"); 
// } 	TokenNameCOMMENT_LINE	} 
/** * A mapping of an offset between documents. This is used by {@link edu.cmu.minorthird.text.TextBaseManager TextBaseManager} * to map spans from one TextBase to one that was derived from it. */	TokenNameCOMMENT_JAVADOC	 A mapping of an offset between documents. This is used by {@link edu.cmu.minorthird.text.TextBaseManager TextBaseManager} to map spans from one TextBase to one that was derived from it. 
public	TokenNamepublic	
class	TokenNameclass	
MapEntry	TokenNameIdentifier	 Map Entry
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
MapEntry	TokenNameIdentifier	 Map Entry
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
srcDocId	TokenNameIdentifier	 src Doc Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
srcOffset	TokenNameIdentifier	 src Offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
dstDocId	TokenNameIdentifier	 dst Doc Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
dstOffset	TokenNameIdentifier	 dst Offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MapEntry	TokenNameIdentifier	 Map Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sid	TokenNameIdentifier	 sid
,	TokenNameCOMMA	
int	TokenNameint	
sos	TokenNameIdentifier	 sos
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
did	TokenNameIdentifier	 did
,	TokenNameCOMMA	
int	TokenNameint	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcDocId	TokenNameIdentifier	 src Doc Id
=	TokenNameEQUAL	
sid	TokenNameIdentifier	 sid
;	TokenNameSEMICOLON	
srcOffset	TokenNameIdentifier	 src Offset
=	TokenNameEQUAL	
sos	TokenNameIdentifier	 sos
;	TokenNameSEMICOLON	
dstDocId	TokenNameIdentifier	 dst Doc Id
=	TokenNameEQUAL	
did	TokenNameIdentifier	 did
;	TokenNameSEMICOLON	
dstOffset	TokenNameIdentifier	 dst Offset
=	TokenNameEQUAL	
dos	TokenNameIdentifier	 dos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
MapEntry	TokenNameIdentifier	 Map Entry
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
srcDocId	TokenNameIdentifier	 src Doc Id
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
srcDocId	TokenNameIdentifier	 src Doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
srcOffset	TokenNameIdentifier	 src Offset
-	TokenNameMINUS	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
srcOffset	TokenNameIdentifier	 src Offset
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
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
srcDocId	TokenNameIdentifier	 src Doc Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
srcOffset	TokenNameIdentifier	 src Offset
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
dstDocId	TokenNameIdentifier	 dst Doc Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
dstOffset	TokenNameIdentifier	 dst Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
