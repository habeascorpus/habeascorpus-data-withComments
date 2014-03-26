package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Interface for classes that can be saved to disk in one or more * class-specific, human-readable format. The format is determined by * file extensions. */	TokenNameCOMMENT_JAVADOC	 Interface for classes that can be saved to disk in one or more class-specific, human-readable format. The format is determined by file extensions. 
public	TokenNamepublic	
interface	TokenNameinterface	
Saveable	TokenNameIdentifier	 Saveable
{	TokenNameLBRACE	
/** List of formats in which the object can be saved. */	TokenNameCOMMENT_JAVADOC	 List of formats in which the object can be saved. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFormatNames	TokenNameIdentifier	 get Format Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Recomended extension for the format with the given name. */	TokenNameCOMMENT_JAVADOC	 Recomended extension for the format with the given name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExtensionFor	TokenNameIdentifier	 get Extension For
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
formatName	TokenNameIdentifier	 format Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Save this object to the given file, in the given format. */	TokenNameCOMMENT_JAVADOC	 Save this object to the given file, in the given format. 
public	TokenNamepublic	
void	TokenNamevoid	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
formatName	TokenNameIdentifier	 format Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Restore the object from a file. */	TokenNameCOMMENT_JAVADOC	 Restore the object from a file. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
restore	TokenNameIdentifier	 restore
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
