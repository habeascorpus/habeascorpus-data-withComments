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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
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
ProgressCounter	TokenNameIdentifier	 Progress Counter
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
/** * Loads and saves the contents of a TextLabels into a file. * * Labels can be loaded from operations (see importOps) or from a serialized * TextLabels object. Labels can be serialized or types can be saved as * operations, xml, or plain lists. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Loads and saves the contents of a TextLabels into a file. * Labels can be loaded from operations (see importOps) or from a serialized TextLabels object. Labels can be serialized or types can be saved as operations, xml, or plain lists. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Spans in labels are a complete list of all spans. */	TokenNameCOMMENT_JAVADOC	 Spans in labels are a complete list of all spans. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
int	TokenNameint	
CLOSE_ALL_TYPES	TokenNameIdentifier	 CLOSE  ALL  TYPES
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * If a document has been labeled for a type, assume all spans of that type * are there. */	TokenNameCOMMENT_JAVADOC	 If a document has been labeled for a type, assume all spans of that type are there. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
int	TokenNameint	
CLOSE_TYPES_IN_LABELED_DOCS	TokenNameIdentifier	 CLOSE  TYPES  IN  LABELED  DOCS
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Make no assumptions about closure. */	TokenNameCOMMENT_JAVADOC	 Make no assumptions about closure. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
int	TokenNameint	
DONT_CLOSE_TYPES	TokenNameIdentifier	 DONT  CLOSE  TYPES
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
int	TokenNameint	
CLOSE_BY_OPERATION	TokenNameIdentifier	 CLOSE  BY  OPERATION
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
CLOSURE_NAMES	TokenNameIdentifier	 CLOSURE  NAMES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"CLOSE_ALL_TYPES"	TokenNameStringLiteral	CLOSE_ALL_TYPES
,	TokenNameCOMMA	
"CLOSE_TYPES_IN_LABELED_DOCS"	TokenNameStringLiteral	CLOSE_TYPES_IN_LABELED_DOCS
,	TokenNameCOMMA	
"DONT_CLOSE_TYPES"	TokenNameStringLiteral	DONT_CLOSE_TYPES
,	TokenNameCOMMA	
"CLOSE_BY_OPERATION"	TokenNameStringLiteral	CLOSE_BY_OPERATION
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
closurePolicy	TokenNameIdentifier	 closure Policy
=	TokenNameEQUAL	
CLOSE_BY_OPERATION	TokenNameIdentifier	 CLOSE  BY  OPERATION
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
warnings	TokenNameIdentifier	 warnings
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
MAX_WARNINGS	TokenNameIdentifier	 MAX  WARNINGS
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Set the closure policy. * * @param policy * one of CLOSE_ALL_TYPES, CLOSE_TYPES_IN_LABELED_DOCS, * DONT_CLOSE_TYPES */	TokenNameCOMMENT_JAVADOC	 Set the closure policy. * @param policy one of CLOSE_ALL_TYPES, CLOSE_TYPES_IN_LABELED_DOCS, DONT_CLOSE_TYPES 
public	TokenNamepublic	
void	TokenNamevoid	
setClosurePolicy	TokenNameIdentifier	 set Closure Policy
(	TokenNameLPAREN	
int	TokenNameint	
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
closurePolicy	TokenNameIdentifier	 closure Policy
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new labeling by importing from a file with importOps. */	TokenNameCOMMENT_JAVADOC	 Create a new labeling by importing from a file with importOps. 
public	TokenNamepublic	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
loadOps	TokenNameIdentifier	 load Ops
(	TokenNameLPAREN	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
importOps	TokenNameIdentifier	 import Ops
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load lines modifying a TextLabels from a file. There are four allowed * operations: addToType, closeType, closeAllTypes, setClosure * * For addToType: The lines must be of the form: * <code>addToType ID LOW LENGTH TYPE</code> where ID is a documentID in the * given TextBase, LOW is a character index into that document, and LENGTH is * the length in characters of the span that will be created as given type * TYPE. If LENGTH==-1, then the created span will go to the end of the * document. * * For closeType: Lines must be <code>closeType ID TYPE</code> where ID is a * documentID in the given TextBase and TYPE is the label type to close over * that document. * * For closeAllTypes: Lines must be <code>closeAllType ID</code> where ID is * a documentID in the given TextBase. The document will be closed for all * types present in the TextLabels <em>after all operations</em> are * performed. * * For setClosure: Lines must be <code>setClosure POLICY</code> where POLICY * is one of the policy types defined in this class. It will immediately * change the closure policy for the loader. This is best used at the * beginning of the file to indicate one of the generic policies or the * CLOSE_BY_OPERATION (default) policy. */	TokenNameCOMMENT_JAVADOC	 Load lines modifying a TextLabels from a file. There are four allowed operations: addToType, closeType, closeAllTypes, setClosure * For addToType: The lines must be of the form: <code>addToType ID LOW LENGTH TYPE</code> where ID is a documentID in the given TextBase, LOW is a character index into that document, and LENGTH is the length in characters of the span that will be created as given type TYPE. If LENGTH==-1, then the created span will go to the end of the document. * For closeType: Lines must be <code>closeType ID TYPE</code> where ID is a documentID in the given TextBase and TYPE is the label type to close over that document. * For closeAllTypes: Lines must be <code>closeAllType ID</code> where ID is a documentID in the given TextBase. The document will be closed for all types present in the TextLabels <em>after all operations</em> are performed. * For setClosure: Lines must be <code>setClosure POLICY</code> where POLICY is one of the policy types defined in this class. It will immediately change the closure policy for the loader. This is best used at the beginning of the file to indicate one of the generic policies or the CLOSE_BY_OPERATION (default) policy. 
public	TokenNamepublic	
void	TokenNamevoid	
importOps	TokenNameIdentifier	 import Ops
(	TokenNameLPAREN	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"TextBase attached to labels must not be null"	TokenNameStringLiteral	TextBase attached to labels must not be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
docList	TokenNameIdentifier	 doc List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"read line #"	TokenNameStringLiteral	read line #
+	TokenNamePLUS	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
getNewException	TokenNameIdentifier	 get New Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
", failed to find operation."	TokenNameStringLiteral	, failed to find operation.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"addToType"	TokenNameStringLiteral	addToType
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"setSpanProp"	TokenNameStringLiteral	setSpanProp
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSpanProp	TokenNameIdentifier	 set Span Prop
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"closeType"	TokenNameStringLiteral	closeType
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docId	TokenNameIdentifier	 doc Id
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
closeTypeInside	TokenNameIdentifier	 close Type Inside
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"closed "	TokenNameStringLiteral	closed 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" on "	TokenNameStringLiteral	 on 
+	TokenNamePLUS	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
warnings	TokenNameIdentifier	 warnings
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
warnings	TokenNameIdentifier	 warnings
<	TokenNameLESS	
MAX_WARNINGS	TokenNameIdentifier	 MAX  WARNINGS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"unknown id '"	TokenNameStringLiteral	unknown id '
+	TokenNamePLUS	
docId	TokenNameIdentifier	 doc Id
+	TokenNamePLUS	
"' in closeType"	TokenNameStringLiteral	' in closeType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
warnings	TokenNameIdentifier	 warnings
==	TokenNameEQUAL_EQUAL	
MAX_WARNINGS	TokenNameIdentifier	 MAX  WARNINGS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"there will be no more warnings of this sort given"	TokenNameStringLiteral	there will be no more warnings of this sort given
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"closeAllTypes"	TokenNameStringLiteral	closeAllTypes
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docId	TokenNameIdentifier	 doc Id
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docList	TokenNameIdentifier	 doc List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"error on line "	TokenNameStringLiteral	error on line 
+	TokenNamePLUS	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" of "	TokenNameStringLiteral	 of 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// close over the doc list for all types seen 	TokenNameCOMMENT_LINE	close over the doc list for all types seen 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
docList	TokenNameIdentifier	 doc List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docId	TokenNameIdentifier	 doc Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
docList	TokenNameIdentifier	 doc List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closeLabels	TokenNameIdentifier	 close Labels
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
getNewException	TokenNameIdentifier	 get New Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
" on line: "	TokenNameStringLiteral	 on line: 
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closeLabels	TokenNameIdentifier	 close Labels
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
closurePolicy	TokenNameIdentifier	 closure Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
loStr	TokenNameIdentifier	 lo Str
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lenStr	TokenNameIdentifier	 len Str
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
confidence	TokenNameIdentifier	 confidence
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
loStr	TokenNameIdentifier	 lo Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
lenStr	TokenNameIdentifier	 len Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
warnings	TokenNameIdentifier	 warnings
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
warnings	TokenNameIdentifier	 warnings
<	TokenNameLESS	
MAX_WARNINGS	TokenNameIdentifier	 MAX  WARNINGS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"unknown id '"	TokenNameStringLiteral	unknown id '
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
"' in addToType "	TokenNameStringLiteral	' in addToType 
+	TokenNamePLUS	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
warnings	TokenNameIdentifier	 warnings
==	TokenNameEQUAL_EQUAL	
MAX_WARNINGS	TokenNameIdentifier	 MAX  WARNINGS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"there will be no more warnings of this sort given"	TokenNameStringLiteral	there will be no more warnings of this sort given
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Details	TokenNameIdentifier	 Details
details	TokenNameIdentifier	 details
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
confidence	TokenNameIdentifier	 confidence
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
details	TokenNameIdentifier	 details
=	TokenNameEQUAL	
new	TokenNamenew	
Details	TokenNameIdentifier	 Details
(	TokenNameLPAREN	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
atof	TokenNameIdentifier	 atof
(	TokenNameLPAREN	
confidence	TokenNameIdentifier	 confidence
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
labels	TokenNameIdentifier	 labels
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
else	TokenNameelse	
{	TokenNameLBRACE	
// shortcut: char offsets "0 -1" means the whole document 	TokenNameCOMMENT_LINE	shortcut: char offsets "0 -1" means the whole document 
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"bad number on line "	TokenNameStringLiteral	bad number on line 
+	TokenNamePLUS	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" of "	TokenNameStringLiteral	 of 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setSpanProp	TokenNameIdentifier	 set Span Prop
(	TokenNameLPAREN	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
loStr	TokenNameIdentifier	 lo Str
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lenStr	TokenNameIdentifier	 len Str
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
loStr	TokenNameIdentifier	 lo Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
lenStr	TokenNameIdentifier	 len Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
warnings	TokenNameIdentifier	 warnings
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
warnings	TokenNameIdentifier	 warnings
<	TokenNameLESS	
MAX_WARNINGS	TokenNameIdentifier	 MAX  WARNINGS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"unknown id '"	TokenNameStringLiteral	unknown id '
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
warnings	TokenNameIdentifier	 warnings
==	TokenNameEQUAL_EQUAL	
MAX_WARNINGS	TokenNameIdentifier	 MAX  WARNINGS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"there will be no more warnings of this sort given"	TokenNameStringLiteral	there will be no more warnings of this sort given
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
labels	TokenNameIdentifier	 labels
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
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"bad number on line "	TokenNameStringLiteral	bad number on line 
+	TokenNamePLUS	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" of "	TokenNameStringLiteral	 of 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
getNewException	TokenNameIdentifier	 get New Exception
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
addToMsg	TokenNameIdentifier	 add To Msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
addToMsg	TokenNameIdentifier	 add To Msg
;	TokenNameSEMICOLON	
StackTraceElement	TokenNameIdentifier	 Stack Trace Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
trace	TokenNameIdentifier	 trace
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getStackTrace	TokenNameIdentifier	 get Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
setStackTrace	TokenNameIdentifier	 set Stack Trace
(	TokenNameLPAREN	
trace	TokenNameIdentifier	 trace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"error on line "	TokenNameStringLiteral	error on line 
+	TokenNamePLUS	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" of "	TokenNameStringLiteral	 of 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" failed to find token"	TokenNameStringLiteral	 failed to find token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close labels on the labels according to the policy. This applies the same * policy to all documents and types in the labels. To get finer control of * closure use closeLabels(Set, MutableTextLabels, Span) or * MutableTextLabels.closeTypeInside(...) * * @param labels * @param policy */	TokenNameCOMMENT_JAVADOC	 Close labels on the labels according to the policy. This applies the same policy to all documents and types in the labels. To get finer control of closure use closeLabels(Set, MutableTextLabels, Span) or MutableTextLabels.closeTypeInside(...) * @param labels @param policy 
public	TokenNamepublic	
void	TokenNamevoid	
closeLabels	TokenNameIdentifier	 close Labels
(	TokenNameLPAREN	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
int	TokenNameint	
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
types	TokenNameIdentifier	 types
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CLOSE_ALL_TYPES	TokenNameIdentifier	 CLOSE  ALL  TYPES
:	TokenNameCOLON	
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
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closeLabels	TokenNameIdentifier	 close Labels
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLOSE_TYPES_IN_LABELED_DOCS	TokenNameIdentifier	 CLOSE  TYPES  IN  LABELED  DOCS
:	TokenNameCOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
labeledDocs	TokenNameIdentifier	 labeled Docs
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
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
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
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
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labeledDocs	TokenNameIdentifier	 labeled Docs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
labeledDocs	TokenNameIdentifier	 labeled Docs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closeLabels	TokenNameIdentifier	 close Labels
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DONT_CLOSE_TYPES	TokenNameIdentifier	 DONT  CLOSE  TYPES
:	TokenNameCOLON	
// do nothing for this 	TokenNameCOMMENT_LINE	do nothing for this 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLOSE_BY_OPERATION	TokenNameIdentifier	 CLOSE  BY  OPERATION
:	TokenNameCOLON	
// already closed in theory 	TokenNameCOMMENT_LINE	already closed in theory 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"closure policy("	TokenNameStringLiteral	closure policy(
+	TokenNamePLUS	
policy	TokenNameIdentifier	 policy
+	TokenNamePLUS	
") not recognized"	TokenNameStringLiteral	) not recognized
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Close all types in the typeSet on the given document * * @param typeSet * set of types to close for this document * @param labels * TextLabels holding the types * @param document * Span to close types over */	TokenNameCOMMENT_JAVADOC	 Close all types in the typeSet on the given document * @param typeSet set of types to close for this document @param labels TextLabels holding the types @param document Span to close types over 
private	TokenNameprivate	
void	TokenNamevoid	
closeLabels	TokenNameIdentifier	 close Labels
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
closeTypeInside	TokenNameIdentifier	 close Type Inside
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Read in a serialized TextLabels. */	TokenNameCOMMENT_JAVADOC	 Read in a serialized TextLabels. 
public	TokenNamepublic	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
loadSerialized	TokenNameIdentifier	 load Serialized
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
)	TokenNameRPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
setTextBase	TokenNameIdentifier	 set Text Base
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't read TextLabels from "	TokenNameStringLiteral	can't read TextLabels from 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Serialize a TextLabels. */	TokenNameCOMMENT_JAVADOC	 Serialize a TextLabels. 
public	TokenNamepublic	
void	TokenNamevoid	
saveSerialized	TokenNameIdentifier	 save Serialized
(	TokenNameLPAREN	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Save extracted data in a format readable with loadOps. */	TokenNameCOMMENT_JAVADOC	 Save extracted data in a format readable with loadOps. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
printTypesAsOps	TokenNameIdentifier	 print Types As Ops
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"saving labels"	TokenNameStringLiteral	saving labels
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc2	TokenNameIdentifier	 pc2
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"saving type "	TokenNameStringLiteral	saving type 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
"span"	TokenNameStringLiteral	span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
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
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
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
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
Details	TokenNameIdentifier	 Details
details	TokenNameIdentifier	 details
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getDetails	TokenNameIdentifier	 get Details
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
details	TokenNameIdentifier	 details
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
details	TokenNameIdentifier	 details
==	TokenNameEQUAL_EQUAL	
Details	TokenNameIdentifier	 Details
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"addToType "	TokenNameStringLiteral	addToType 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"addToType "	TokenNameStringLiteral	addToType 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
details	TokenNameIdentifier	 details
.	TokenNameDOT	
getConfidence	TokenNameIdentifier	 get Confidence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
warnings	TokenNameIdentifier	 warnings
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
warnings	TokenNameIdentifier	 warnings
<	TokenNameLESS	
MAX_WARNINGS	TokenNameIdentifier	 MAX  WARNINGS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"forgetting label on empty span type "	TokenNameStringLiteral	forgetting label on empty span type 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
warnings	TokenNameIdentifier	 warnings
==	TokenNameEQUAL_EQUAL	
MAX_WARNINGS	TokenNameIdentifier	 MAX  WARNINGS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"there will be no more warnings of this sort given"	TokenNameStringLiteral	there will be no more warnings of this sort given
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pc2	TokenNameIdentifier	 pc2
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pc2	TokenNameIdentifier	 pc2
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
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
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"can't save environment with closureSpans!=docSpans"	TokenNameStringLiteral	can't save environment with closureSpans!=docSpans
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"closeType "	TokenNameStringLiteral	closeType 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc3	TokenNameIdentifier	 pc3
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"saving labels"	TokenNameStringLiteral	saving labels
,	TokenNameCOMMA	
"property"	TokenNameStringLiteral	property
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
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
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
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
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"setSpanProp "	TokenNameStringLiteral	setSpanProp 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
prop	TokenNameIdentifier	 prop
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pc3	TokenNameIdentifier	 pc3
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pc3	TokenNameIdentifier	 pc3
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Save extracted data in a format readable with loadOps. */	TokenNameCOMMENT_JAVADOC	 Save extracted data in a format readable with loadOps. 
public	TokenNamepublic	
void	TokenNamevoid	
saveTypesAsOps	TokenNameIdentifier	 save Types As Ops
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
printTypesAsOps	TokenNameIdentifier	 print Types As Ops
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Save spans of given type into the file, one per line. Linefeeds in strings * are replaced with spaces. */	TokenNameCOMMENT_JAVADOC	 Save spans of given type into the file, one per line. Linefeeds in strings are replaced with spaces. 
public	TokenNamepublic	
void	TokenNamevoid	
saveTypesAsStrings	TokenNameIdentifier	 save Types As Strings
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeOffset	TokenNameIdentifier	 include Offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Do types 	TokenNameCOMMENT_LINE	Do types 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
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
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
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
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
includeOffset	TokenNameIdentifier	 include Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Do props 	TokenNameCOMMENT_LINE	Do props 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"_prediction"	TokenNameStringLiteral	_prediction
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
includeOffset	TokenNameIdentifier	 include Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Save documents to specified directory with extracted types embedded as xml. */	TokenNameCOMMENT_JAVADOC	 Save documents to specified directory with extracted types embedded as xml. 
public	TokenNamepublic	
void	TokenNamevoid	
saveDocsWithEmbeddedTypes	TokenNameIdentifier	 save Docs With Embedded Types
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
currDoc	TokenNameIdentifier	 curr Doc
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
looper	TokenNameIdentifier	 looper
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
" already exists, some files may be overwritten."	TokenNameStringLiteral	 already exists, some files may be overwritten.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Could not create directory named: "	TokenNameStringLiteral	Could not create directory named: 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
looper	TokenNameIdentifier	 looper
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this call returns the entire document with all labels embedded as xml 	TokenNameCOMMENT_LINE	this call returns the entire document with all labels embedded as xml 
currDoc	TokenNameIdentifier	 curr Doc
=	TokenNameEQUAL	
looper	TokenNameIdentifier	 looper
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
currDoc	TokenNameIdentifier	 curr Doc
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
createXMLmarkup	TokenNameIdentifier	 create XM Lmarkup
(	TokenNameLPAREN	
currDoc	TokenNameIdentifier	 curr Doc
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Save extracted data in an XML format. Convert to string * &lt;root>..&lt;type>...&lt;/type>..&lt;/root>. <br> * <br> * In the even that labels overlap such as [A (B C] D)E an * IllegalArgumentException is thrown because a well-formed XML document * cannot be created. */	TokenNameCOMMENT_JAVADOC	 Save extracted data in an XML format. Convert to string &lt;root>..&lt;type>...&lt;/type>..&lt;/root>. <br> <br> In the even that labels overlap such as [A (B C] D)E an IllegalArgumentException is thrown because a well-formed XML document cannot be created. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
createXMLmarkup	TokenNameIdentifier	 create XM Lmarkup
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
docSpan	TokenNameIdentifier	 doc Span
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
docString	TokenNameIdentifier	 doc String
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentContents	TokenNameIdentifier	 get Document Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Put all labels and their info in a list 	TokenNameCOMMENT_LINE	Put all labels and their info in a list 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
LabelInfo	TokenNameIdentifier	 Label Info
>	TokenNameGREATER	
unsortedLabels	TokenNameIdentifier	 unsorted Labels
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
LabelInfo	TokenNameIdentifier	 Label Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Do types 	TokenNameCOMMENT_LINE	Do types 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
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
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
unsortedLabels	TokenNameIdentifier	 unsorted Labels
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
LabelInfo	TokenNameIdentifier	 Label Info
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Do props 	TokenNameCOMMENT_LINE	Do props 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
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
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"_prediction"	TokenNameStringLiteral	_prediction
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unsortedLabels	TokenNameIdentifier	 unsorted Labels
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
LabelInfo	TokenNameIdentifier	 Label Info
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
unsortedLabels	TokenNameIdentifier	 unsorted Labels
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
LabelInfo	TokenNameIdentifier	 Label Info
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Sort the labels. If two spans are overlapping then throw an exception 	TokenNameCOMMENT_LINE	Sort the labels. If two spans are overlapping then throw an exception 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
LabelInfo	TokenNameIdentifier	 Label Info
>	TokenNameGREATER	
sortedLabels	TokenNameIdentifier	 sorted Labels
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
LabelInfo	TokenNameIdentifier	 Label Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
unsortedLabels	TokenNameIdentifier	 unsorted Labels
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
unsortedLabels	TokenNameIdentifier	 unsorted Labels
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LabelInfo	TokenNameIdentifier	 Label Info
curLabel	TokenNameIdentifier	 cur Label
=	TokenNameEQUAL	
unsortedLabels	TokenNameIdentifier	 unsorted Labels
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
overlap	TokenNameIdentifier	 overlap
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Iterate through sortedLabels 	TokenNameCOMMENT_LINE	Iterate through sortedLabels 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
sortedLabels	TokenNameIdentifier	 sorted Labels
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LabelInfo	TokenNameIdentifier	 Label Info
compLabel	TokenNameIdentifier	 comp Label
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LabelInfo	TokenNameIdentifier	 Label Info
)	TokenNameRPAREN	
sortedLabels	TokenNameIdentifier	 sorted Labels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Find if there is an overlap 	TokenNameCOMMENT_LINE	Find if there is an overlap 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
curLabel	TokenNameIdentifier	 cur Label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
compLabel	TokenNameIdentifier	 comp Label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
&&	TokenNameAND_AND	
curLabel	TokenNameIdentifier	 cur Label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
compLabel	TokenNameIdentifier	 comp Label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
curLabel	TokenNameIdentifier	 cur Label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
<	TokenNameLESS	
compLabel	TokenNameIdentifier	 comp Label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
overlap	TokenNameIdentifier	 overlap
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
curLabel	TokenNameIdentifier	 cur Label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
>	TokenNameGREATER	
compLabel	TokenNameIdentifier	 comp Label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
&&	TokenNameAND_AND	
curLabel	TokenNameIdentifier	 cur Label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
compLabel	TokenNameIdentifier	 comp Label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
curLabel	TokenNameIdentifier	 cur Label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
compLabel	TokenNameIdentifier	 comp Label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
overlap	TokenNameIdentifier	 overlap
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Find position 	TokenNameCOMMENT_LINE	Find position 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
curLabel	TokenNameIdentifier	 cur Label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
compLabel	TokenNameIdentifier	 comp Label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
curLabel	TokenNameIdentifier	 cur Label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
compLabel	TokenNameIdentifier	 comp Label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
curLabel	TokenNameIdentifier	 cur Label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
>=	TokenNameGREATER_EQUAL	
compLabel	TokenNameIdentifier	 comp Label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If the label overlapped with another label, then throw an exception 	TokenNameCOMMENT_LINE	If the label overlapped with another label, then throw an exception 
if	TokenNameif	
(	TokenNameLPAREN	
overlap	TokenNameIdentifier	 overlap
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Labels contain overalpping spans, cannot save as XML format."	TokenNameStringLiteral	Labels contain overalpping spans, cannot save as XML format.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Otherwise add the label to the proper position in the sorted list. 	TokenNameCOMMENT_LINE	Otherwise add the label to the proper position in the sorted list. 
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sortedLabels	TokenNameIdentifier	 sorted Labels
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
curLabel	TokenNameIdentifier	 cur Label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
sortedLabels	TokenNameIdentifier	 sorted Labels
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
curLabel	TokenNameIdentifier	 cur Label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create sorted list of tags 	TokenNameCOMMENT_LINE	Create sorted list of tags 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TagInfo	TokenNameIdentifier	 Tag Info
>	TokenNameGREATER	
sortedTags	TokenNameIdentifier	 sorted Tags
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TagInfo	TokenNameIdentifier	 Tag Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
sortedLabels	TokenNameIdentifier	 sorted Labels
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
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
sortedLabels	TokenNameIdentifier	 sorted Labels
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LabelInfo	TokenNameIdentifier	 Label Info
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
sortedLabels	TokenNameIdentifier	 sorted Labels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortedTags	TokenNameIdentifier	 sorted Tags
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TagInfo	TokenNameIdentifier	 Tag Info
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sortedLabels	TokenNameIdentifier	 sorted Labels
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LabelInfo	TokenNameIdentifier	 Label Info
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
sortedLabels	TokenNameIdentifier	 sorted Labels
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
sortedTags	TokenNameIdentifier	 sorted Tags
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TagInfo	TokenNameIdentifier	 Tag Info
tag	TokenNameIdentifier	 tag
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TagInfo	TokenNameIdentifier	 Tag Info
)	TokenNameRPAREN	
sortedTags	TokenNameIdentifier	 sorted Tags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
<	TokenNameLESS	
tag	TokenNameIdentifier	 tag
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortedTags	TokenNameIdentifier	 sorted Tags
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
new	TokenNamenew	
TagInfo	TokenNameIdentifier	 Tag Info
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
"</"	TokenNameStringLiteral	</
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
added	TokenNameIdentifier	 added
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortedTags	TokenNameIdentifier	 sorted Tags
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TagInfo	TokenNameIdentifier	 Tag Info
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
"</"	TokenNameStringLiteral	</
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Create markedup StringBuffer 	TokenNameCOMMENT_LINE	Create markedup StringBuffer 
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<root>"	TokenNameStringLiteral	<root>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
docPos	TokenNameIdentifier	 doc Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sortedTags	TokenNameIdentifier	 sorted Tags
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TagInfo	TokenNameIdentifier	 Tag Info
curTag	TokenNameIdentifier	 cur Tag
=	TokenNameEQUAL	
sortedTags	TokenNameIdentifier	 sorted Tags
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curTag	TokenNameIdentifier	 cur Tag
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
docSpan	TokenNameIdentifier	 doc Span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curTag	TokenNameIdentifier	 cur Tag
.	TokenNameDOT	
isOpenTag	TokenNameIdentifier	 is Open Tag
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
docSpan	TokenNameIdentifier	 doc Span
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
curTag	TokenNameIdentifier	 cur Tag
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
else	TokenNameelse	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
docSpan	TokenNameIdentifier	 doc Span
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
curTag	TokenNameIdentifier	 cur Tag
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
docString	TokenNameIdentifier	 doc String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
docString	TokenNameIdentifier	 doc String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
docPos	TokenNameIdentifier	 doc Pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
curTag	TokenNameIdentifier	 cur Tag
.	TokenNameDOT	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docPos	TokenNameIdentifier	 doc Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
docString	TokenNameIdentifier	 doc String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
docPos	TokenNameIdentifier	 doc Pos
,	TokenNameCOMMA	
docString	TokenNameIdentifier	 doc String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</root>"	TokenNameStringLiteral	</root>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
TagInfo	TokenNameIdentifier	 Tag Info
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isOpenTag	TokenNameIdentifier	 is Open Tag
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TagInfo	TokenNameIdentifier	 Tag Info
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isOpenTag	TokenNameIdentifier	 is Open Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tag	TokenNameIdentifier	 tag
=	TokenNameEQUAL	
tag	TokenNameIdentifier	 tag
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isOpenTag	TokenNameIdentifier	 is Open Tag
=	TokenNameEQUAL	
isOpenTag	TokenNameIdentifier	 is Open Tag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
LabelInfo	TokenNameIdentifier	 Label Info
{	TokenNameLBRACE	
// public Span span; 	TokenNameCOMMENT_LINE	public Span span; 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LabelInfo	TokenNameIdentifier	 Label Info
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this.span=span; 	TokenNameCOMMENT_LINE	this.span=span; 
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// // Helper method used to maintain a set of tag boundaries 	TokenNameCOMMENT_LINE	// Helper method used to maintain a set of tag boundaries 
// private void setBoundary(SortedMap<Span,Set<String[]>> boundaries, 	TokenNameCOMMENT_LINE	private void setBoundary(SortedMap<Span,Set<String[]>> boundaries, 
// String beginOrEnd,String type,Span s){ 	TokenNameCOMMENT_LINE	String beginOrEnd,String type,Span s){ 
// Set<String[]> ops=boundaries.get(s); 	TokenNameCOMMENT_LINE	Set<String[]> ops=boundaries.get(s); 
// if(ops==null) 	TokenNameCOMMENT_LINE	if(ops==null) 
// boundaries.put(s,(ops=new HashSet<String[]>())); 	TokenNameCOMMENT_LINE	boundaries.put(s,(ops=new HashSet<String[]>())); 
// ops.add(new String[]{beginOrEnd,type}); 	TokenNameCOMMENT_LINE	ops.add(new String[]{beginOrEnd,type}); 
// } 	TokenNameCOMMENT_LINE	} 
/** Save extracted data in an XML format */	TokenNameCOMMENT_JAVADOC	 Save extracted data in an XML format 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
saveTypesAsXML	TokenNameIdentifier	 save Types As XML
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"<extractions> "	TokenNameStringLiteral	<extractions> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
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
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
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
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" <"	TokenNameStringLiteral	 <
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" lo="	TokenNameStringLiteral	 lo=
+	TokenNamePLUS	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
" hi="	TokenNameStringLiteral	 hi=
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"</"	TokenNameStringLiteral	</
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
"> "	TokenNameStringLiteral	> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</extractions> "	TokenNameStringLiteral	</extractions> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
