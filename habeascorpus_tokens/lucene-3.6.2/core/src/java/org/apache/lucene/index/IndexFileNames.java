package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * This class contains useful constants representing filenames and extensions * used by lucene, as well as convenience methods for querying whether a file * name matches an extension ({@link #matchesExtension(String, String) * matchesExtension}), as well as generating file names from a segment name, * generation and extension ( * {@link #fileNameFromGeneration(String, String, long) fileNameFromGeneration}, * {@link #segmentFileName(String, String) segmentFileName}). * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 This class contains useful constants representing filenames and extensions used by lucene, as well as convenience methods for querying whether a file name matches an extension ({@link #matchesExtension(String, String) matchesExtension}), as well as generating file names from a segment name, generation and extension ( {@link #fileNameFromGeneration(String, String, long) fileNameFromGeneration}, {@link #segmentFileName(String, String) segmentFileName}). * @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
IndexFileNames	TokenNameIdentifier	 Index File Names
{	TokenNameLBRACE	
/** Name of the index segment file */	TokenNameCOMMENT_JAVADOC	 Name of the index segment file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SEGMENTS	TokenNameIdentifier	 SEGMENTS
=	TokenNameEQUAL	
"segments"	TokenNameStringLiteral	segments
;	TokenNameSEMICOLON	
/** Name of the generation reference file name */	TokenNameCOMMENT_JAVADOC	 Name of the generation reference file name 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SEGMENTS_GEN	TokenNameIdentifier	 SEGMENTS  GEN
=	TokenNameEQUAL	
"segments.gen"	TokenNameStringLiteral	segments.gen
;	TokenNameSEMICOLON	
/** Name of the index deletable file (only used in * pre-lockless indices) */	TokenNameCOMMENT_JAVADOC	 Name of the index deletable file (only used in pre-lockless indices) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DELETABLE	TokenNameIdentifier	 DELETABLE
=	TokenNameEQUAL	
"deletable"	TokenNameStringLiteral	deletable
;	TokenNameSEMICOLON	
/** Extension of norms file */	TokenNameCOMMENT_JAVADOC	 Extension of norms file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NORMS_EXTENSION	TokenNameIdentifier	 NORMS  EXTENSION
=	TokenNameEQUAL	
"nrm"	TokenNameStringLiteral	nrm
;	TokenNameSEMICOLON	
/** Extension of freq postings file */	TokenNameCOMMENT_JAVADOC	 Extension of freq postings file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FREQ_EXTENSION	TokenNameIdentifier	 FREQ  EXTENSION
=	TokenNameEQUAL	
"frq"	TokenNameStringLiteral	frq
;	TokenNameSEMICOLON	
/** Extension of prox postings file */	TokenNameCOMMENT_JAVADOC	 Extension of prox postings file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROX_EXTENSION	TokenNameIdentifier	 PROX  EXTENSION
=	TokenNameEQUAL	
"prx"	TokenNameStringLiteral	prx
;	TokenNameSEMICOLON	
/** Extension of terms file */	TokenNameCOMMENT_JAVADOC	 Extension of terms file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TERMS_EXTENSION	TokenNameIdentifier	 TERMS  EXTENSION
=	TokenNameEQUAL	
"tis"	TokenNameStringLiteral	tis
;	TokenNameSEMICOLON	
/** Extension of terms index file */	TokenNameCOMMENT_JAVADOC	 Extension of terms index file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TERMS_INDEX_EXTENSION	TokenNameIdentifier	 TERMS  INDEX  EXTENSION
=	TokenNameEQUAL	
"tii"	TokenNameStringLiteral	tii
;	TokenNameSEMICOLON	
/** Extension of stored fields index file */	TokenNameCOMMENT_JAVADOC	 Extension of stored fields index file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FIELDS_INDEX_EXTENSION	TokenNameIdentifier	 FIELDS  INDEX  EXTENSION
=	TokenNameEQUAL	
"fdx"	TokenNameStringLiteral	fdx
;	TokenNameSEMICOLON	
/** Extension of stored fields file */	TokenNameCOMMENT_JAVADOC	 Extension of stored fields file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FIELDS_EXTENSION	TokenNameIdentifier	 FIELDS  EXTENSION
=	TokenNameEQUAL	
"fdt"	TokenNameStringLiteral	fdt
;	TokenNameSEMICOLON	
/** Extension of vectors fields file */	TokenNameCOMMENT_JAVADOC	 Extension of vectors fields file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VECTORS_FIELDS_EXTENSION	TokenNameIdentifier	 VECTORS  FIELDS  EXTENSION
=	TokenNameEQUAL	
"tvf"	TokenNameStringLiteral	tvf
;	TokenNameSEMICOLON	
/** Extension of vectors documents file */	TokenNameCOMMENT_JAVADOC	 Extension of vectors documents file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
=	TokenNameEQUAL	
"tvd"	TokenNameStringLiteral	tvd
;	TokenNameSEMICOLON	
/** Extension of vectors index file */	TokenNameCOMMENT_JAVADOC	 Extension of vectors index file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
=	TokenNameEQUAL	
"tvx"	TokenNameStringLiteral	tvx
;	TokenNameSEMICOLON	
/** Extension of compound file */	TokenNameCOMMENT_JAVADOC	 Extension of compound file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPOUND_FILE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  EXTENSION
=	TokenNameEQUAL	
"cfs"	TokenNameStringLiteral	cfs
;	TokenNameSEMICOLON	
/** Extension of compound file for doc store files*/	TokenNameCOMMENT_JAVADOC	 Extension of compound file for doc store files
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPOUND_FILE_STORE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  STORE  EXTENSION
=	TokenNameEQUAL	
"cfx"	TokenNameStringLiteral	cfx
;	TokenNameSEMICOLON	
/** Extension of deletes */	TokenNameCOMMENT_JAVADOC	 Extension of deletes 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DELETES_EXTENSION	TokenNameIdentifier	 DELETES  EXTENSION
=	TokenNameEQUAL	
"del"	TokenNameStringLiteral	del
;	TokenNameSEMICOLON	
/** Extension of field infos */	TokenNameCOMMENT_JAVADOC	 Extension of field infos 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FIELD_INFOS_EXTENSION	TokenNameIdentifier	 FIELD  INFOS  EXTENSION
=	TokenNameEQUAL	
"fnm"	TokenNameStringLiteral	fnm
;	TokenNameSEMICOLON	
/** Extension of plain norms */	TokenNameCOMMENT_JAVADOC	 Extension of plain norms 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PLAIN_NORMS_EXTENSION	TokenNameIdentifier	 PLAIN  NORMS  EXTENSION
=	TokenNameEQUAL	
"f"	TokenNameStringLiteral	f
;	TokenNameSEMICOLON	
/** Extension of separate norms */	TokenNameCOMMENT_JAVADOC	 Extension of separate norms 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SEPARATE_NORMS_EXTENSION	TokenNameIdentifier	 SEPARATE  NORMS  EXTENSION
=	TokenNameEQUAL	
"s"	TokenNameStringLiteral	s
;	TokenNameSEMICOLON	
/** Extension of gen file */	TokenNameCOMMENT_JAVADOC	 Extension of gen file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GEN_EXTENSION	TokenNameIdentifier	 GEN  EXTENSION
=	TokenNameEQUAL	
"gen"	TokenNameStringLiteral	gen
;	TokenNameSEMICOLON	
/** * This array contains all filename extensions used by * Lucene's index files, with two exceptions, namely the * extension made up from <code>.f</code> + a number and * from <code>.s</code> + a number. Also note that * Lucene's <code>segments_N</code> files do not have any * filename extension. */	TokenNameCOMMENT_JAVADOC	 This array contains all filename extensions used by Lucene's index files, with two exceptions, namely the extension made up from <code>.f</code> + a number and from <code>.s</code> + a number. Also note that Lucene's <code>segments_N</code> files do not have any filename extension. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INDEX_EXTENSIONS	TokenNameIdentifier	 INDEX  EXTENSIONS
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
COMPOUND_FILE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  EXTENSION
,	TokenNameCOMMA	
FIELD_INFOS_EXTENSION	TokenNameIdentifier	 FIELD  INFOS  EXTENSION
,	TokenNameCOMMA	
FIELDS_INDEX_EXTENSION	TokenNameIdentifier	 FIELDS  INDEX  EXTENSION
,	TokenNameCOMMA	
FIELDS_EXTENSION	TokenNameIdentifier	 FIELDS  EXTENSION
,	TokenNameCOMMA	
TERMS_INDEX_EXTENSION	TokenNameIdentifier	 TERMS  INDEX  EXTENSION
,	TokenNameCOMMA	
TERMS_EXTENSION	TokenNameIdentifier	 TERMS  EXTENSION
,	TokenNameCOMMA	
FREQ_EXTENSION	TokenNameIdentifier	 FREQ  EXTENSION
,	TokenNameCOMMA	
PROX_EXTENSION	TokenNameIdentifier	 PROX  EXTENSION
,	TokenNameCOMMA	
DELETES_EXTENSION	TokenNameIdentifier	 DELETES  EXTENSION
,	TokenNameCOMMA	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
,	TokenNameCOMMA	
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
,	TokenNameCOMMA	
VECTORS_FIELDS_EXTENSION	TokenNameIdentifier	 VECTORS  FIELDS  EXTENSION
,	TokenNameCOMMA	
GEN_EXTENSION	TokenNameIdentifier	 GEN  EXTENSION
,	TokenNameCOMMA	
NORMS_EXTENSION	TokenNameIdentifier	 NORMS  EXTENSION
,	TokenNameCOMMA	
COMPOUND_FILE_STORE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  STORE  EXTENSION
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** File extensions that are added to a compound file * (same as above, minus "del", "gen", "cfs"). */	TokenNameCOMMENT_JAVADOC	 File extensions that are added to a compound file (same as above, minus "del", "gen", "cfs"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
INDEX_EXTENSIONS_IN_COMPOUND_FILE	TokenNameIdentifier	 INDEX  EXTENSIONS  IN  COMPOUND  FILE
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
FIELD_INFOS_EXTENSION	TokenNameIdentifier	 FIELD  INFOS  EXTENSION
,	TokenNameCOMMA	
FIELDS_INDEX_EXTENSION	TokenNameIdentifier	 FIELDS  INDEX  EXTENSION
,	TokenNameCOMMA	
FIELDS_EXTENSION	TokenNameIdentifier	 FIELDS  EXTENSION
,	TokenNameCOMMA	
TERMS_INDEX_EXTENSION	TokenNameIdentifier	 TERMS  INDEX  EXTENSION
,	TokenNameCOMMA	
TERMS_EXTENSION	TokenNameIdentifier	 TERMS  EXTENSION
,	TokenNameCOMMA	
FREQ_EXTENSION	TokenNameIdentifier	 FREQ  EXTENSION
,	TokenNameCOMMA	
PROX_EXTENSION	TokenNameIdentifier	 PROX  EXTENSION
,	TokenNameCOMMA	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
,	TokenNameCOMMA	
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
,	TokenNameCOMMA	
VECTORS_FIELDS_EXTENSION	TokenNameIdentifier	 VECTORS  FIELDS  EXTENSION
,	TokenNameCOMMA	
NORMS_EXTENSION	TokenNameIdentifier	 NORMS  EXTENSION
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
STORE_INDEX_EXTENSIONS	TokenNameIdentifier	 STORE  INDEX  EXTENSIONS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
,	TokenNameCOMMA	
VECTORS_FIELDS_EXTENSION	TokenNameIdentifier	 VECTORS  FIELDS  EXTENSION
,	TokenNameCOMMA	
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
,	TokenNameCOMMA	
FIELDS_INDEX_EXTENSION	TokenNameIdentifier	 FIELDS  INDEX  EXTENSION
,	TokenNameCOMMA	
FIELDS_EXTENSION	TokenNameIdentifier	 FIELDS  EXTENSION
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NON_STORE_INDEX_EXTENSIONS	TokenNameIdentifier	 NON  STORE  INDEX  EXTENSIONS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
FIELD_INFOS_EXTENSION	TokenNameIdentifier	 FIELD  INFOS  EXTENSION
,	TokenNameCOMMA	
FREQ_EXTENSION	TokenNameIdentifier	 FREQ  EXTENSION
,	TokenNameCOMMA	
PROX_EXTENSION	TokenNameIdentifier	 PROX  EXTENSION
,	TokenNameCOMMA	
TERMS_EXTENSION	TokenNameIdentifier	 TERMS  EXTENSION
,	TokenNameCOMMA	
TERMS_INDEX_EXTENSION	TokenNameIdentifier	 TERMS  INDEX  EXTENSION
,	TokenNameCOMMA	
NORMS_EXTENSION	TokenNameIdentifier	 NORMS  EXTENSION
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** File extensions of old-style index files */	TokenNameCOMMENT_JAVADOC	 File extensions of old-style index files 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPOUND_EXTENSIONS	TokenNameIdentifier	 COMPOUND  EXTENSIONS
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
FIELD_INFOS_EXTENSION	TokenNameIdentifier	 FIELD  INFOS  EXTENSION
,	TokenNameCOMMA	
FREQ_EXTENSION	TokenNameIdentifier	 FREQ  EXTENSION
,	TokenNameCOMMA	
PROX_EXTENSION	TokenNameIdentifier	 PROX  EXTENSION
,	TokenNameCOMMA	
FIELDS_INDEX_EXTENSION	TokenNameIdentifier	 FIELDS  INDEX  EXTENSION
,	TokenNameCOMMA	
FIELDS_EXTENSION	TokenNameIdentifier	 FIELDS  EXTENSION
,	TokenNameCOMMA	
TERMS_INDEX_EXTENSION	TokenNameIdentifier	 TERMS  INDEX  EXTENSION
,	TokenNameCOMMA	
TERMS_EXTENSION	TokenNameIdentifier	 TERMS  EXTENSION
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** File extensions for term vector support */	TokenNameCOMMENT_JAVADOC	 File extensions for term vector support 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VECTOR_EXTENSIONS	TokenNameIdentifier	 VECTOR  EXTENSIONS
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
,	TokenNameCOMMA	
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
,	TokenNameCOMMA	
VECTORS_FIELDS_EXTENSION	TokenNameIdentifier	 VECTORS  FIELDS  EXTENSION
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Computes the full file name from base, extension and generation. If the * generation is -1, the file name is null. If it's 0, the file name is * &lt;base&gt;.&lt;ext&gt;. If it's > 0, the file name is * &lt;base&gt;_&lt;gen&gt;.&lt;ext&gt;.<br> * <b>NOTE:</b> .&lt;ext&gt; is added to the name only if <code>ext</code> is * not an empty string. * * @param base main part of the file name * @param ext extension of the filename * @param gen generation */	TokenNameCOMMENT_JAVADOC	 Computes the full file name from base, extension and generation. If the generation is -1, the file name is null. If it's 0, the file name is &lt;base&gt;.&lt;ext&gt;. If it's > 0, the file name is &lt;base&gt;_&lt;gen&gt;.&lt;ext&gt;.<br> <b>NOTE:</b> .&lt;ext&gt; is added to the name only if <code>ext</code> is not an empty string. * @param base main part of the file name @param ext extension of the filename @param gen generation 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileNameFromGeneration	TokenNameIdentifier	 file Name From Generation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
long	TokenNamelong	
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
==	TokenNameEQUAL_EQUAL	
SegmentInfo	TokenNameIdentifier	 Segment Info
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
==	TokenNameEQUAL_EQUAL	
SegmentInfo	TokenNameIdentifier	 Segment Info
.	TokenNameDOT	
WITHOUT_GEN	TokenNameIdentifier	 WITHOUT  GEN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// The '6' part in the length is: 1 for '.', 1 for '_' and 4 as estimate 	TokenNameCOMMENT_LINE	The '6' part in the length is: 1 for '.', 1 for '_' and 4 as estimate 
// to the gen length as string (hopefully an upper limit so SB won't 	TokenNameCOMMENT_LINE	to the gen length as string (hopefully an upper limit so SB won't 
// expand in the middle. 	TokenNameCOMMENT_LINE	expand in the middle. 
StringBuilder	TokenNameIdentifier	 String Builder
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MAX_RADIX	TokenNameIdentifier	 MAX  RADIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if the provided filename is one of the doc store files (ends * with an extension in {@link #STORE_INDEX_EXTENSIONS}). */	TokenNameCOMMENT_JAVADOC	 Returns true if the provided filename is one of the doc store files (ends with an extension in {@link #STORE_INDEX_EXTENSIONS}). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isDocStoreFile	TokenNameIdentifier	 is Doc Store File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
COMPOUND_FILE_STORE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  STORE  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
:	TokenNameCOLON	
STORE_INDEX_EXTENSIONS	TokenNameIdentifier	 STORE  INDEX  EXTENSIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the file name that matches the given segment name and extension. * This method takes care to return the full file name in the form * &lt;segmentName&gt;.&lt;ext&gt;, therefore you don't need to prefix the * extension with a '.'.<br> * <b>NOTE:</b> .&lt;ext&gt; is added to the result file name only if * <code>ext</code> is not empty. */	TokenNameCOMMENT_JAVADOC	 Returns the file name that matches the given segment name and extension. This method takes care to return the full file name in the form &lt;segmentName&gt;.&lt;ext&gt;, therefore you don't need to prefix the extension with a '.'.<br> <b>NOTE:</b> .&lt;ext&gt; is added to the result file name only if <code>ext</code> is not empty. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
segmentName	TokenNameIdentifier	 segment Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
segmentName	TokenNameIdentifier	 segment Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
segmentName	TokenNameIdentifier	 segment Name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
segmentName	TokenNameIdentifier	 segment Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if the given filename ends with the given extension. One * should provide a <i>pure</i> extension, without '.'. */	TokenNameCOMMENT_JAVADOC	 Returns true if the given filename ends with the given extension. One should provide a <i>pure</i> extension, without '.'. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
matchesExtension	TokenNameIdentifier	 matches Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It doesn't make a difference whether we allocate a StringBuilder ourself 	TokenNameCOMMENT_LINE	It doesn't make a difference whether we allocate a StringBuilder ourself 
// or not, since there's only 1 '+' operator. 	TokenNameCOMMENT_LINE	or not, since there's only 1 '+' operator. 
return	TokenNamereturn	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Strips the segment file name out of the given one. If you used * {@link #segmentFileName} or {@link #fileNameFromGeneration} to create your * files, then this method simply removes whatever comes before the first '.', * or the second '_' (excluding both), in case of deleted docs. * * @return the filename with the segment name removed, or the given filename * if it does not contain a '.' and '_'. */	TokenNameCOMMENT_JAVADOC	 Strips the segment file name out of the given one. If you used {@link #segmentFileName} or {@link #fileNameFromGeneration} to create your files, then this method simply removes whatever comes before the first '.', or the second '_' (excluding both), in case of deleted docs. * @return the filename with the segment name removed, or the given filename if it does not contain a '.' and '_'. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
stripSegmentName	TokenNameIdentifier	 strip Segment Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If it is a .del file, there's an '_' after the first character 	TokenNameCOMMENT_LINE	If it is a .del file, there's an '_' after the first character 
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'_'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If it's not, strip everything that's before the '.' 	TokenNameCOMMENT_LINE	If it's not, strip everything that's before the '.' 
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the given filename ends with the separate norms file * pattern: {@code SEPARATE_NORMS_EXTENSION + "[0-9]+"}. */	TokenNameCOMMENT_JAVADOC	 Returns true if the given filename ends with the separate norms file pattern: {@code SEPARATE_NORMS_EXTENSION + "[0-9]+"}. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSeparateNormsFile	TokenNameIdentifier	 is Separate Norms File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
SEPARATE_NORMS_EXTENSION	TokenNameIdentifier	 SEPARATE  NORMS  EXTENSION
+	TokenNamePLUS	
"[0-9]+"	TokenNameStringLiteral	[0-9]+
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
