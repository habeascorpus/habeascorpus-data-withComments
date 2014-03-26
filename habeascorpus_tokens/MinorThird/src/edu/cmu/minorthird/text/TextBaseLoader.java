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
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
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
Arrays	TokenNameIdentifier	 Arrays
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
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Matcher	TokenNameIdentifier	 Matcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
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
/** * Configurable Text Loader. * <p> * Usage: Configure a loader object using the constructors. Call .load(File) * with the file object to your data (could be a directory) load(File) returns * the TextBase object for the data. * <p> * * <pre> * Default: * TextBaseLoader tbl = new TextBaseLoader(); * Loads One Document per File and uses embedded labels * ------------------------------------------------------ * Specify Document Style * TextBaseLoader tbl = new TextBaseLoader(TextBaseLoader.DOC_PER_LINE); // Loads One document per line * TextBaseLoader tbl = new TextBaseLoader(TextBaseLoader.DOC_PER_FILE); // Loads One document per file * ------------------------------------------------------ * Specify document type and whether to use embedded Labels * // ex: Loads one doc per line and ignores embedded labels * TextBaseLoader tbl = new TextBaseLoader(TextBaseLoader.DOC_PER_LINE, false); * ------------------------------------------------------ * Specify document type and whether to use embedded Labels * // ex: Loads one doc per file, uses embedded labels, and recurses directories * TextBaseLoader tbl = new TextBaseLoader(TextBaseLoader.DOC_PER_FILE, true, true); * <p> * In ALL cases use: * tbl.load(FILE); * </pre> * * @author William Cohen * @author Kevin Steppe * @author Cameron Williams * @author Quinten Mercer */	TokenNameCOMMENT_JAVADOC	 Configurable Text Loader. <p> Usage: Configure a loader object using the constructors. Call .load(File) with the file object to your data (could be a directory) load(File) returns the TextBase object for the data. <p> * <pre> Default: TextBaseLoader tbl = new TextBaseLoader(); Loads One Document per File and uses embedded labels ------------------------------------------------------ Specify Document Style TextBaseLoader tbl = new TextBaseLoader(TextBaseLoader.DOC_PER_LINE); // Loads One document per line TextBaseLoader tbl = new TextBaseLoader(TextBaseLoader.DOC_PER_FILE); // Loads One document per file ------------------------------------------------------ Specify document type and whether to use embedded Labels // ex: Loads one doc per line and ignores embedded labels TextBaseLoader tbl = new TextBaseLoader(TextBaseLoader.DOC_PER_LINE, false); ------------------------------------------------------ Specify document type and whether to use embedded Labels // ex: Loads one doc per file, uses embedded labels, and recurses directories TextBaseLoader tbl = new TextBaseLoader(TextBaseLoader.DOC_PER_FILE, true, true); <p> In ALL cases use: tbl.load(FILE); </pre> * @author William Cohen @author Kevin Steppe @author Cameron Williams @author Quinten Mercer 
public	TokenNamepublic	
class	TokenNameclass	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
{	TokenNameLBRACE	
// style/location for IDs, groupID, Category of doc 	TokenNameCOMMENT_LINE	style/location for IDs, groupID, Category of doc 
// Kept to support the old TextBaseLoader api 	TokenNameCOMMENT_LINE	Kept to support the old TextBaseLoader api 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NONE	TokenNameIdentifier	 NONE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// could be given as a param at some point 	TokenNameCOMMENT_LINE	could be given as a param at some point 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DIRECTORY_NAME	TokenNameIdentifier	 DIRECTORY  NAME
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FILE_NAME	TokenNameIdentifier	 FILE  NAME
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IN_FILE	TokenNameIdentifier	 IN  FILE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// document style 	TokenNameCOMMENT_LINE	document style 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOC_PER_LINE	TokenNameIdentifier	 DOC  PER  LINE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOC_PER_FILE	TokenNameIdentifier	 DOC  PER  FILE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// XML tags 	TokenNameCOMMENT_LINE	XML tags 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
USE_XML	TokenNameIdentifier	 USE  XML
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
IGNORE_XML	TokenNameIdentifier	 IGNORE  XML
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Parameters for loading 	TokenNameCOMMENT_LINE	Parameters for loading 
// One document per line in a file or One document per file 	TokenNameCOMMENT_LINE	One document per line in a file or One document per file 
private	TokenNameprivate	
int	TokenNameint	
documentStyle	TokenNameIdentifier	 document Style
=	TokenNameEQUAL	
DOC_PER_FILE	TokenNameIdentifier	 DOC  PER  FILE
;	TokenNameSEMICOLON	
// tagging -- whether to use embedded XML tags 	TokenNameCOMMENT_LINE	tagging -- whether to use embedded XML tags 
private	TokenNameprivate	
boolean	TokenNameboolean	
use_markup	TokenNameIdentifier	 use markup
=	TokenNameEQUAL	
USE_XML	TokenNameIdentifier	 USE  XML
;	TokenNameSEMICOLON	
// recursion -- if loading from a directory should subdirectories be loaded 	TokenNameCOMMENT_LINE	recursion -- if loading from a directory should subdirectories be loaded 
// too? 	TokenNameCOMMENT_LINE	too? 
private	TokenNameprivate	
boolean	TokenNameboolean	
recurseDirectories	TokenNameIdentifier	 recurse Directories
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// internal structure 	TokenNameCOMMENT_LINE	internal structure 
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
closurePolicy	TokenNameIdentifier	 closure Policy
=	TokenNameEQUAL	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
.	TokenNameDOT	
CLOSE_ALL_TYPES	TokenNameIdentifier	 CLOSE  ALL  TYPES
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
StackEntry	TokenNameIdentifier	 Stack Entry
>	TokenNameGREATER	
stack	TokenNameIdentifier	 stack
;	TokenNameSEMICOLON	
// xml tag stack 	TokenNameCOMMENT_LINE	xml tag stack 
// saves labels associated with last set of files loaded 	TokenNameCOMMENT_LINE	saves labels associated with last set of files loaded 
private	TokenNameprivate	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MutableTextBase	TokenNameIdentifier	 Mutable Text Base
textBase	TokenNameIdentifier	 text Base
;	TokenNameSEMICOLON	
// --------------------- Constructors 	TokenNameCOMMENT_LINE	--------------------- Constructors 
// ----------------------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------------------- 
/** * Default constructor. It will load each file as a single document, use XML * markup, and NOT recurse recurse. */	TokenNameCOMMENT_JAVADOC	 Default constructor. It will load each file as a single document, use XML markup, and NOT recurse recurse. 
public	TokenNamepublic	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Specifies the document style to use, but leaves all other properties to * their defaults. */	TokenNameCOMMENT_JAVADOC	 Specifies the document style to use, but leaves all other properties to their defaults. 
public	TokenNamepublic	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
(	TokenNameLPAREN	
int	TokenNameint	
documentStyle	TokenNameIdentifier	 document Style
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentStyle	TokenNameIdentifier	 document Style
=	TokenNameEQUAL	
documentStyle	TokenNameIdentifier	 document Style
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
(	TokenNameLPAREN	
int	TokenNameint	
documentStyle	TokenNameIdentifier	 document Style
,	TokenNameCOMMA	
boolean	TokenNameboolean	
use_markup	TokenNameIdentifier	 use markup
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentStyle	TokenNameIdentifier	 document Style
=	TokenNameEQUAL	
documentStyle	TokenNameIdentifier	 document Style
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
use_markup	TokenNameIdentifier	 use markup
=	TokenNameEQUAL	
use_markup	TokenNameIdentifier	 use markup
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
(	TokenNameLPAREN	
int	TokenNameint	
documentStyle	TokenNameIdentifier	 document Style
,	TokenNameCOMMA	
boolean	TokenNameboolean	
use_markup	TokenNameIdentifier	 use markup
,	TokenNameCOMMA	
boolean	TokenNameboolean	
recurseDirectories	TokenNameIdentifier	 recurse Directories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentStyle	TokenNameIdentifier	 document Style
=	TokenNameEQUAL	
documentStyle	TokenNameIdentifier	 document Style
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
use_markup	TokenNameIdentifier	 use markup
=	TokenNameEQUAL	
use_markup	TokenNameIdentifier	 use markup
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
recurseDirectories	TokenNameIdentifier	 recurse Directories
=	TokenNameEQUAL	
recurseDirectories	TokenNameIdentifier	 recurse Directories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// --------------------- Constructors 	TokenNameCOMMENT_LINE	--------------------- Constructors 
// ----------------------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------------------- 
// --------------------- Public methods 	TokenNameCOMMENT_LINE	--------------------- Public methods 
// --------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------- 
/** * Load data from the given location according to configuration and whether * location is a directory or not * * Calling load a second time will load into the same text base (thus the * second call returns documents from both the first and second locations). * Use setTextBase(null) to reset the text base. * * * @param dataLocation * File representation of location (single file or directory) * @return the loaded TextBase * @throws IOException - * problem reading the file * @throws ParseException - * problem with xml of internal tagging */	TokenNameCOMMENT_JAVADOC	 Load data from the given location according to configuration and whether location is a directory or not * Calling load a second time will load into the same text base (thus the second call returns documents from both the first and second locations). Use setTextBase(null) to reset the text base. * @param dataLocation File representation of location (single file or directory) @return the loaded TextBase @throws IOException - problem reading the file @throws ParseException - problem with xml of internal tagging 
public	TokenNamepublic	
MutableTextBase	TokenNameIdentifier	 Mutable Text Base
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dataLocation	TokenNameIdentifier	 data Location
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// Create new TextBase and TextLabels to hold the data 	TokenNameCOMMENT_LINE	Create new TextBase and TextLabels to hold the data 
this	TokenNamethis	
.	TokenNameDOT	
textBase	TokenNameIdentifier	 text Base
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
textBase	TokenNameIdentifier	 text Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check whether it's a dir or single dataLocation 	TokenNameCOMMENT_LINE	check whether it's a dir or single dataLocation 
if	TokenNameif	
(	TokenNameLPAREN	
dataLocation	TokenNameIdentifier	 data Location
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
loadDirectory	TokenNameIdentifier	 load Directory
(	TokenNameLPAREN	
dataLocation	TokenNameIdentifier	 data Location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
loadFile	TokenNameIdentifier	 load File
(	TokenNameLPAREN	
dataLocation	TokenNameIdentifier	 data Location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
textBase	TokenNameIdentifier	 text Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load data from the given location according to configuration and whether * location is a directory or not * * Calling load a second time will load into the same text base (thus the * second call returns documents from both the first and second locations). * Use setTextBase(null) to reset the text base. * * * @param dataLocation * File representation of location (single file or directory) * @return the loaded TextBase * @throws IOException - * problem reading the file * @throws ParseException - * problem with xml of internal tagging */	TokenNameCOMMENT_JAVADOC	 Load data from the given location according to configuration and whether location is a directory or not * Calling load a second time will load into the same text base (thus the second call returns documents from both the first and second locations). Use setTextBase(null) to reset the text base. * @param dataLocation File representation of location (single file or directory) @return the loaded TextBase @throws IOException - problem reading the file @throws ParseException - problem with xml of internal tagging 
public	TokenNamepublic	
MutableTextBase	TokenNameIdentifier	 Mutable Text Base
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dataLocation	TokenNameIdentifier	 data Location
,	TokenNameCOMMA	
Tokenizer	TokenNameIdentifier	 Tokenizer
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// Create new TextBase and TextLabels to hold the data 	TokenNameCOMMENT_LINE	Create new TextBase and TextLabels to hold the data 
this	TokenNamethis	
.	TokenNameDOT	
textBase	TokenNameIdentifier	 text Base
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
textBase	TokenNameIdentifier	 text Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check whether it's a dir or single dataLocation 	TokenNameCOMMENT_LINE	check whether it's a dir or single dataLocation 
if	TokenNameif	
(	TokenNameLPAREN	
dataLocation	TokenNameIdentifier	 data Location
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
loadDirectory	TokenNameIdentifier	 load Directory
(	TokenNameLPAREN	
dataLocation	TokenNameIdentifier	 data Location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
loadFile	TokenNameIdentifier	 load File
(	TokenNameLPAREN	
dataLocation	TokenNameIdentifier	 data Location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
textBase	TokenNameIdentifier	 text Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load a document where each word has it's own line and is follwed by three * desscriptor words. The first item on each line is a word, the second a * part-of-speech (POS) tag, the third a syntactic chunk tag and the fourth * the named entity tag. */	TokenNameCOMMENT_JAVADOC	 Load a document where each word has it's own line and is follwed by three desscriptor words. The first item on each line is a word, the second a part-of-speech (POS) tag, the third a syntactic chunk tag and the fourth the named entity tag. 
public	TokenNamepublic	
MutableTextBase	TokenNameIdentifier	 Mutable Text Base
loadWordPerLineFile	TokenNameIdentifier	 load Word Per Line File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
// Create the new TextBase and TextLabels that will contain this data. 	TokenNameCOMMENT_LINE	Create the new TextBase and TextLabels that will contain this data. 
this	TokenNamethis	
.	TokenNameDOT	
textBase	TokenNameIdentifier	 text Base
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
new	TokenNamenew	
SplitTokenizer	TokenNameIdentifier	 Split Tokenizer
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
textBase	TokenNameIdentifier	 text Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Buffer to temporarily hold the contents of each doc read in. 	TokenNameCOMMENT_LINE	Buffer to temporarily hold the contents of each doc read in. 
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Each doc in the file needs a unique documentId 	TokenNameCOMMENT_LINE	Each doc in the file needs a unique documentId 
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
curDocID	TokenNameIdentifier	 cur Doc ID
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
docNum	TokenNameIdentifier	 doc Num
;	TokenNameSEMICOLON	
// Lists of spans and properties that are included in the data file 	TokenNameCOMMENT_LINE	Lists of spans and properties that are included in the data file 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CharSpan	TokenNameIdentifier	 Char Span
>	TokenNameGREATER	
spanList	TokenNameIdentifier	 span List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CharSpan	TokenNameIdentifier	 Char Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
tokenPropList	TokenNameIdentifier	 token Prop List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Read in the file line by line 	TokenNameCOMMENT_LINE	Read in the file line by line 
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
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
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
words	TokenNameIdentifier	 words
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s"	TokenNameStringLiteral	\s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we're in the middle of a doc, just keep adding to its buffer 	TokenNameCOMMENT_LINE	If we're in the middle of a doc, just keep adding to its buffer 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-DOCSTART-"	TokenNameStringLiteral	-DOCSTART-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
words	TokenNameIdentifier	 words
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tokenPropList	TokenNameIdentifier	 token Prop List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"O"	TokenNameStringLiteral	O
)	TokenNameRPAREN	
)	TokenNameRPAREN	
spanList	TokenNameIdentifier	 span List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CharSpan	TokenNameIdentifier	 Char Span
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
curDocID	TokenNameIdentifier	 cur Doc ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Otherwise we're at the end of a doc, so add it to the TextBase and 	TokenNameCOMMENT_LINE	Otherwise we're at the end of a doc, so add it to the TextBase and 
// continue 	TokenNameCOMMENT_LINE	continue 
else	TokenNameelse	
{	TokenNameLBRACE	
// Add the finished doc to the TextBase 	TokenNameCOMMENT_LINE	Add the finished doc to the TextBase 
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
curDocID	TokenNameIdentifier	 cur Doc ID
,	TokenNameCOMMA	
spanList	TokenNameIdentifier	 span List
,	TokenNameCOMMA	
tokenPropList	TokenNameIdentifier	 token Prop List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Clear out the doc info variables 	TokenNameCOMMENT_LINE	Clear out the doc info variables 
spanList	TokenNameIdentifier	 span List
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenPropList	TokenNameIdentifier	 token Prop List
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Increment the document id. 	TokenNameCOMMENT_LINE	Increment the document id. 
docNum	TokenNameIdentifier	 doc Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
curDocID	TokenNameIdentifier	 cur Doc ID
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
docNum	TokenNameIdentifier	 doc Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
textBase	TokenNameIdentifier	 text Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets whether the loader should use or ignore XML markup in the files. <br> * <br> * Valid values are: TextBaseLoader.IGNORE_XML and TextBaseLoader.USE_XML */	TokenNameCOMMENT_JAVADOC	 Sets whether the loader should use or ignore XML markup in the files. <br> <br> Valid values are: TextBaseLoader.IGNORE_XML and TextBaseLoader.USE_XML 
public	TokenNamepublic	
void	TokenNamevoid	
setLabelsInFile	TokenNameIdentifier	 set Labels In File
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
use_markup	TokenNameIdentifier	 use markup
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the document style for loaded documents. <br> * <br> * Valid styles are: TextBaseLoader.DOC_PER_LINE and * TextBaseLoader.DOC_PER_FILE */	TokenNameCOMMENT_JAVADOC	 Sets the document style for loaded documents. <br> <br> Valid styles are: TextBaseLoader.DOC_PER_LINE and TextBaseLoader.DOC_PER_FILE 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentStyle	TokenNameIdentifier	 set Document Style
(	TokenNameLPAREN	
int	TokenNameint	
style	TokenNameIdentifier	 style
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentStyle	TokenNameIdentifier	 document Style
=	TokenNameEQUAL	
style	TokenNameIdentifier	 style
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets whether the loader should recurse directories when loading docs. */	TokenNameCOMMENT_JAVADOC	 Sets whether the loader should recurse directories when loading docs. 
public	TokenNamepublic	
void	TokenNamevoid	
setRecurseDirectories	TokenNameIdentifier	 set Recurse Directories
(	TokenNameLPAREN	
boolean	TokenNameboolean	
rec	TokenNameIdentifier	 rec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
recurseDirectories	TokenNameIdentifier	 recurse Directories
=	TokenNameEQUAL	
rec	TokenNameIdentifier	 rec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get labeling generated by tags in data file */	TokenNameCOMMENT_JAVADOC	 get labeling generated by tags in data file 
public	TokenNamepublic	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------Old Methods kept to support old 	TokenNameCOMMENT_LINE	---------------Old Methods kept to support old 
// api------------------------------- 	TokenNameCOMMENT_LINE	api------------------------------- 
// WARNING: These are all deprecated. How long have they been this way, should 	TokenNameCOMMENT_LINE	WARNING: These are all deprecated. How long have they been this way, should 
// we delete them? 	TokenNameCOMMENT_LINE	we delete them? 
// /** 	TokenNameCOMMENT_LINE	/** 
// * One document per file in a directory, labels are embedded in the data as 	TokenNameCOMMENT_LINE	* One document per file in a directory, labels are embedded in the data as 
// * xml tags NB: Don't use this if the data isn't labbed - it will remove 	TokenNameCOMMENT_LINE	* xml tags NB: Don't use this if the data isn't labbed - it will remove 
// * things that look like <just a note> which could cause problems. 	TokenNameCOMMENT_LINE	* things that look like <just a note> which could cause problems. 
// * 	TokenNameCOMMENT_LINE	* 
// * Returns the TextLabels object, the textbase is embedded 	TokenNameCOMMENT_LINE	* Returns the TextLabels object, the textbase is embedded 
// * 	TokenNameCOMMENT_LINE	* 
// * @deprecated 	TokenNameCOMMENT_LINE	* @deprecated 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public static MutableTextLabels loadDirOfTaggedFiles(File dir) 	TokenNameCOMMENT_LINE	public static MutableTextLabels loadDirOfTaggedFiles(File dir) 
// throws ParseException,IOException{ 	TokenNameCOMMENT_LINE	throws ParseException,IOException{ 
// TextBaseLoader loader=new TextBaseLoader(DOC_PER_FILE,true); 	TokenNameCOMMENT_LINE	TextBaseLoader loader=new TextBaseLoader(DOC_PER_FILE,true); 
// loader.load(dir); 	TokenNameCOMMENT_LINE	loader.load(dir); 
// 	TokenNameCOMMENT_LINE	 
// return loader.getLabels(); 	TokenNameCOMMENT_LINE	return loader.getLabels(); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// /** @deprecated */ 	TokenNameCOMMENT_LINE	/** @deprecated */ 
// public void loadTaggedFiles(TextBase base,File dir) throws IOException, 	TokenNameCOMMENT_LINE	public void loadTaggedFiles(TextBase base,File dir) throws IOException, 
// FileNotFoundException{ 	TokenNameCOMMENT_LINE	FileNotFoundException{ 
// try{ 	TokenNameCOMMENT_LINE	try{ 
// TextBaseLoader loader=new TextBaseLoader(DOC_PER_FILE,true); 	TokenNameCOMMENT_LINE	TextBaseLoader loader=new TextBaseLoader(DOC_PER_FILE,true); 
// loader.load(dir); 	TokenNameCOMMENT_LINE	loader.load(dir); 
// }catch(Exception e){ 	TokenNameCOMMENT_LINE	}catch(Exception e){ 
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// /** @deprecated */ 	TokenNameCOMMENT_LINE	/** @deprecated */ 
// public static TextBase loadDocPerLine(File file,boolean hasGroupID) 	TokenNameCOMMENT_LINE	public static TextBase loadDocPerLine(File file,boolean hasGroupID) 
// throws ParseException,IOException{ 	TokenNameCOMMENT_LINE	throws ParseException,IOException{ 
// try{ 	TokenNameCOMMENT_LINE	try{ 
// TextBaseLoader loader=new TextBaseLoader(DOC_PER_LINE); 	TokenNameCOMMENT_LINE	TextBaseLoader loader=new TextBaseLoader(DOC_PER_LINE); 
// return loader.load(file); 	TokenNameCOMMENT_LINE	return loader.load(file); 
// }catch(Exception e){ 	TokenNameCOMMENT_LINE	}catch(Exception e){ 
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
// } 	TokenNameCOMMENT_LINE	} 
// return null; 	TokenNameCOMMENT_LINE	return null; 
// } 	TokenNameCOMMENT_LINE	} 
// --------------------- Public methods 	TokenNameCOMMENT_LINE	--------------------- Public methods 
// --------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------- 
// --------------------- Private methods 	TokenNameCOMMENT_LINE	--------------------- Private methods 
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
private	TokenNameprivate	
void	TokenNamevoid	
loadDirectory	TokenNameIdentifier	 load Directory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// loop on files in directory or loop on directories? 	TokenNameCOMMENT_LINE	loop on files in directory or loop on directories? 
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't list directory "	TokenNameStringLiteral	can't list directory 
+	TokenNamePLUS	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"loading directory "	TokenNameStringLiteral	loading directory 
+	TokenNamePLUS	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// skip CVS directories 	TokenNameCOMMENT_LINE	skip CVS directories 
if	TokenNameif	
(	TokenNameLPAREN	
"CVS"	TokenNameStringLiteral	CVS
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
recurseDirectories	TokenNameIdentifier	 recurse Directories
)	TokenNameRPAREN	
loadDirectory	TokenNameIdentifier	 load Directory
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
loadFile	TokenNameIdentifier	 load File
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
/** * Load the given single file according the current settings * * @param file * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Load the given single file according the current settings * @param file @throws IOException 
private	TokenNameprivate	
void	TokenNamevoid	
loadFile	TokenNameIdentifier	 load File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"loadFile: "	TokenNameStringLiteral	loadFile: 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// build the correct reader 	TokenNameCOMMENT_LINE	build the correct reader 
BufferedReader	TokenNameIdentifier	 Buffered Reader
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
documentStyle	TokenNameIdentifier	 document Style
==	TokenNameEQUAL_EQUAL	
DOC_PER_LINE	TokenNameIdentifier	 DOC  PER  LINE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set the docid 	TokenNameCOMMENT_LINE	set the docid 
String	TokenNameIdentifier	 String
curDocID	TokenNameIdentifier	 cur Doc ID
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// list of labeled spans if internally tagged 	TokenNameCOMMENT_LINE	list of labeled spans if internally tagged 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CharSpan	TokenNameIdentifier	 Char Span
>	TokenNameGREATER	
spanList	TokenNameIdentifier	 span List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CharSpan	TokenNameIdentifier	 Char Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Clear the xml tag stack 	TokenNameCOMMENT_LINE	Clear the xml tag stack 
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
StackEntry	TokenNameIdentifier	 Stack Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loop through the file 	TokenNameCOMMENT_LINE	loop through the file 
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// in.ready may cause problems on Macintosh 	TokenNameCOMMENT_LINE	in.ready may cause problems on Macintosh 
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// BUG: THIS METHOD ADDS BLANK LINES AS DOCS FOR DOC_PER_LINE STYLE FILES 	TokenNameCOMMENT_LINE	BUG: THIS METHOD ADDS BLANK LINES AS DOCS FOR DOC_PER_LINE STYLE FILES 
// appends to the buffer internally 	TokenNameCOMMENT_LINE	appends to the buffer internally 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
use_markup	TokenNameIdentifier	 use markup
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
labelLine	TokenNameIdentifier	 label Line
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
curDocID	TokenNameIdentifier	 cur Doc ID
,	TokenNameCOMMA	
spanList	TokenNameIdentifier	 span List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If this reader is set to create a doc for each line then add the doc 	TokenNameCOMMENT_LINE	If this reader is set to create a doc for each line then add the doc 
// now 	TokenNameCOMMENT_LINE	now 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
documentStyle	TokenNameIdentifier	 document Style
==	TokenNameEQUAL_EQUAL	
DOC_PER_LINE	TokenNameIdentifier	 DOC  PER  LINE
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
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curDocID	TokenNameIdentifier	 cur Doc ID
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"@line:"	TokenNameStringLiteral	@line:
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
)	TokenNameRPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
curDocID	TokenNameIdentifier	 cur Doc ID
,	TokenNameCOMMA	
spanList	TokenNameIdentifier	 span List
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spanList	TokenNameIdentifier	 span List
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Otherwise add the line to the buffer and continue reading 	TokenNameCOMMENT_LINE	Otherwise add the line to the buffer and continue reading 
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
use_markup	TokenNameIdentifier	 use markup
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// need line feed 	TokenNameCOMMENT_LINE	need line feed 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
documentStyle	TokenNameIdentifier	 document Style
==	TokenNameEQUAL_EQUAL	
DOC_PER_FILE	TokenNameIdentifier	 DOC  PER  FILE
)	TokenNameRPAREN	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
curDocID	TokenNameIdentifier	 cur Doc ID
,	TokenNameCOMMA	
spanList	TokenNameIdentifier	 span List
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add this text to the textBase as a new document, including group id and * categorization * * @param docText * String version of text */	TokenNameCOMMENT_JAVADOC	 Add this text to the textBase as a new document, including group id and categorization * @param docText String version of text 
private	TokenNameprivate	
void	TokenNamevoid	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
docText	TokenNameIdentifier	 doc Text
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CharSpan	TokenNameIdentifier	 Char Span
>	TokenNameGREATER	
spans	TokenNameIdentifier	 spans
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
tokenProps	TokenNameIdentifier	 token Props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Blank documents are dropped 	TokenNameCOMMENT_LINE	Blank documents are dropped 
if	TokenNameif	
(	TokenNameLPAREN	
docText	TokenNameIdentifier	 doc Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Text for document "	TokenNameStringLiteral	Text for document 
+	TokenNamePLUS	
documentId	TokenNameIdentifier	 document Id
+	TokenNamePLUS	
" is length zero or all white space, it will not be added to the text base."	TokenNameStringLiteral	 is length zero or all white space, it will not be added to the text base.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"add document "	TokenNameStringLiteral	add document 
+	TokenNamePLUS	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the document to the TextBase 	TokenNameCOMMENT_LINE	Add the document to the TextBase 
textBase	TokenNameIdentifier	 text Base
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
docText	TokenNameIdentifier	 doc Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now add all of the extracted spans to the labels set 	TokenNameCOMMENT_LINE	Now add all of the extracted spans to the labels set 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CharSpan	TokenNameIdentifier	 Char Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
spans	TokenNameIdentifier	 spans
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
CharSpan	TokenNameIdentifier	 Char Span
charSpan	TokenNameIdentifier	 char Span
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
approxSpan	TokenNameIdentifier	 approx Span
;	TokenNameSEMICOLON	
// = 	TokenNameCOMMENT_LINE	= 
// textBase.documentSpan(documentId).subSpan(charSpan.lo, 	TokenNameCOMMENT_LINE	textBase.documentSpan(documentId).subSpan(charSpan.lo, 
// charSpan.hi-charSpan.lo-1); 	TokenNameCOMMENT_LINE	charSpan.hi-charSpan.lo-1); 
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
charSpan	TokenNameIdentifier	 char Span
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
charSpan	TokenNameIdentifier	 char Span
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docText	TokenNameIdentifier	 doc Text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
docText	TokenNameIdentifier	 doc Text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
flag	TokenNameIdentifier	 flag
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
approxSpan	TokenNameIdentifier	 approx Span
=	TokenNameEQUAL	
textBase	TokenNameIdentifier	 text Base
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
charSpan	TokenNameIdentifier	 char Span
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
charSpan	TokenNameIdentifier	 char Span
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
approxSpan	TokenNameIdentifier	 approx Span
=	TokenNameEQUAL	
textBase	TokenNameIdentifier	 text Base
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
charSpan	TokenNameIdentifier	 char Span
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
charSpan	TokenNameIdentifier	 char Span
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
.	TokenNameDOT	
getLeftBoundary	TokenNameIdentifier	 get Left Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
charSpan	TokenNameIdentifier	 char Span
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
>	TokenNameGREATER	
docText	TokenNameIdentifier	 doc Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
docText	TokenNameIdentifier	 doc Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"approximating "	TokenNameStringLiteral	approximating 
+	TokenNamePLUS	
charSpan	TokenNameIdentifier	 char Span
.	TokenNameDOT	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" span '"	TokenNameStringLiteral	 span '
+	TokenNamePLUS	
docText	TokenNameIdentifier	 doc Text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
charSpan	TokenNameIdentifier	 char Span
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' with token span '"	TokenNameStringLiteral	' with token span '
+	TokenNamePLUS	
approxSpan	TokenNameIdentifier	 approx Span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
approxSpan	TokenNameIdentifier	 approx Span
,	TokenNameCOMMA	
charSpan	TokenNameIdentifier	 char Span
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Next add all extracted token properties to the labels set 	TokenNameCOMMENT_LINE	Next add all extracted token properties to the labels set 
if	TokenNameif	
(	TokenNameLPAREN	
tokenProps	TokenNameIdentifier	 token Props
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tokenProps	TokenNameIdentifier	 token Props
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
textBase	TokenNameIdentifier	 text Base
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
itr	TokenNameIdentifier	 itr
=	TokenNameEQUAL	
tokenProps	TokenNameIdentifier	 token Props
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
nextPOS	TokenNameIdentifier	 next POS
=	TokenNameEQUAL	
itr	TokenNameIdentifier	 itr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextPOS	TokenNameIdentifier	 next POS
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
"POS"	TokenNameStringLiteral	POS
,	TokenNameCOMMA	
nextPOS	TokenNameIdentifier	 next POS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Close the labels set 	TokenNameCOMMENT_LINE	Close the labels set 
new	TokenNamenew	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
closeLabels	TokenNameIdentifier	 close Labels
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
closurePolicy	TokenNameIdentifier	 closure Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Takes a single line of text. Uses the markupPattern field to remove * labelings (must be xml styled). These labelling are added to the span list * * @param line - * String of a single line to have it's labels parsed * @param spanList - * List of span labelings * @return a String with the labelings removed * @throws ParseException * improper xml format will cause a parse exception */	TokenNameCOMMENT_JAVADOC	 Takes a single line of text. Uses the markupPattern field to remove labelings (must be xml styled). These labelling are added to the span list * @param line - String of a single line to have it's labels parsed @param spanList - List of span labelings @return a String with the labelings removed @throws ParseException improper xml format will cause a parse exception 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
labelLine	TokenNameIdentifier	 label Line
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
docBuffer	TokenNameIdentifier	 doc Buffer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CharSpan	TokenNameIdentifier	 Char Span
>	TokenNameGREATER	
spanList	TokenNameIdentifier	 span List
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// stack of open tags 	TokenNameCOMMENT_LINE	stack of open tags 
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
StackEntry	TokenNameIdentifier	 Stack Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create the matcher to find any XML marked up tags 	TokenNameCOMMENT_LINE	Create the matcher to find any XML marked up tags 
Pattern	TokenNameIdentifier	 Pattern
markupPattern	TokenNameIdentifier	 markup Pattern
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"</?([^ ><]+)( [^<>]+)?>"	TokenNameStringLiteral	</?([^ ><]+)( [^<>]+)?>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Matcher	TokenNameIdentifier	 Matcher
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
markupPattern	TokenNameIdentifier	 markup Pattern
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
=	TokenNameEQUAL	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isOpenTag	TokenNameIdentifier	 is Open Tag
=	TokenNameEQUAL	
!	TokenNameNOT	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"</"	TokenNameStringLiteral	</
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"matcher.group='"	TokenNameStringLiteral	matcher.group='
+	TokenNamePLUS	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"found '"	TokenNameStringLiteral	found '
+	TokenNamePLUS	
tag	TokenNameIdentifier	 tag
+	TokenNamePLUS	
"' tag ,open="	TokenNameStringLiteral	' tag ,open=
+	TokenNamePLUS	
isOpenTag	TokenNameIdentifier	 is Open Tag
+	TokenNamePLUS	
", at "	TokenNameStringLiteral	, at 
+	TokenNamePLUS	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" in: "	TokenNameStringLiteral	 in: 
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// copy stuff up to tag into buffer 	TokenNameCOMMENT_LINE	copy stuff up to tag into buffer 
docBuffer	TokenNameIdentifier	 doc Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
currentChar	TokenNameIdentifier	 current Char
,	TokenNameCOMMA	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isOpenTag	TokenNameIdentifier	 is Open Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
StackEntry	TokenNameIdentifier	 Stack Entry
(	TokenNameLPAREN	
docBuffer	TokenNameIdentifier	 doc Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// pop the corresponding open off the stack 	TokenNameCOMMENT_LINE	pop the corresponding open off the stack 
StackEntry	TokenNameIdentifier	 Stack Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
markupTag	TokenNameIdentifier	 markup Tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"close '"	TokenNameStringLiteral	close '
+	TokenNamePLUS	
tag	TokenNameIdentifier	 tag
+	TokenNamePLUS	
"' tag with no open in "	TokenNameStringLiteral	' tag with no open in 
+	TokenNamePLUS	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tag	TokenNameIdentifier	 tag
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
markupTag	TokenNameIdentifier	 markup Tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"close '"	TokenNameStringLiteral	close '
+	TokenNamePLUS	
tag	TokenNameIdentifier	 tag
+	TokenNamePLUS	
"' tag paired with open '"	TokenNameStringLiteral	' tag paired with open '
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
markupTag	TokenNameIdentifier	 markup Tag
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"adding a "	TokenNameStringLiteral	adding a 
+	TokenNamePLUS	
tag	TokenNameIdentifier	 tag
+	TokenNamePLUS	
" span from "	TokenNameStringLiteral	 span from 
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
docBuffer	TokenNameIdentifier	 doc Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": '"	TokenNameStringLiteral	: '
+	TokenNamePLUS	
docBuffer	TokenNameIdentifier	 doc Buffer
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// spanList.add( new CharSpan(entry.index, docBuffer.length()-1, tag) ); 	TokenNameCOMMENT_LINE	spanList.add( new CharSpan(entry.index, docBuffer.length()-1, tag) ); 
spanList	TokenNameIdentifier	 span List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CharSpan	TokenNameIdentifier	 Char Span
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
docBuffer	TokenNameIdentifier	 doc Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// append stuff from end of last tag to end of line into the buffer 	TokenNameCOMMENT_LINE	append stuff from end of last tag to end of line into the buffer 
docBuffer	TokenNameIdentifier	 doc Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
currentChar	TokenNameIdentifier	 current Char
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// BUG: THIS IS CAUSING BLANK LINES IN FILES TO BE ADDED AS DOCUMENTS WHEN 	TokenNameCOMMENT_LINE	BUG: THIS IS CAUSING BLANK LINES IN FILES TO BE ADDED AS DOCUMENTS WHEN 
// LOADED in DOC_PER_LINE FORMAT 	TokenNameCOMMENT_LINE	LOADED in DOC_PER_LINE FORMAT 
// HOWEVER, SIMPLY REMOVING IT BREAKS BASIC FUNCTIONALITY 	TokenNameCOMMENT_LINE	HOWEVER, SIMPLY REMOVING IT BREAKS BASIC FUNCTIONALITY 
docBuffer	TokenNameIdentifier	 doc Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docBuffer	TokenNameIdentifier	 doc Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
StackEntry	TokenNameIdentifier	 Stack Entry
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
markupTag	TokenNameIdentifier	 markup Tag
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StackEntry	TokenNameIdentifier	 Stack Entry
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
markupTag	TokenNameIdentifier	 markup Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
markupTag	TokenNameIdentifier	 markup Tag
=	TokenNameEQUAL	
markupTag	TokenNameIdentifier	 markup Tag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
CharSpan	TokenNameIdentifier	 Char Span
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
// String docID; 	TokenNameCOMMENT_LINE	String docID; 
public	TokenNamepublic	
CharSpan	TokenNameIdentifier	 Char Span
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
// this.docID=docID; 	TokenNameCOMMENT_LINE	this.docID=docID; 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// --------------------- End Private methods 	TokenNameCOMMENT_LINE	--------------------- End Private methods 
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
}	TokenNameRBRACE	
