package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * Copyright 2005 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2005 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
FileFilter	TokenNameIdentifier	 File Filter
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
FileWriter	TokenNameIdentifier	 File Writer
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
/** * Split the Reuters SGML documents into Simple Text files containing: Title, * Date, Dateline, Body */	TokenNameCOMMENT_JAVADOC	 Split the Reuters SGML documents into Simple Text files containing: Title, Date, Dateline, Body 
public	TokenNamepublic	
class	TokenNameclass	
ExtractReuters	TokenNameIdentifier	 Extract Reuters
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
reutersDir	TokenNameIdentifier	 reuters Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
outputDir	TokenNameIdentifier	 output Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LINE_SEPARATOR	TokenNameIdentifier	 LINE  SEPARATOR
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExtractReuters	TokenNameIdentifier	 Extract Reuters
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
reutersDir	TokenNameIdentifier	 reuters Dir
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
outputDir	TokenNameIdentifier	 output Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reutersDir	TokenNameIdentifier	 reuters Dir
=	TokenNameEQUAL	
reutersDir	TokenNameIdentifier	 reuters Dir
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outputDir	TokenNameIdentifier	 output Dir
=	TokenNameEQUAL	
outputDir	TokenNameIdentifier	 output Dir
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Deleting all files in "	TokenNameStringLiteral	Deleting all files in 
+	TokenNamePLUS	
outputDir	TokenNameIdentifier	 output Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
outputDir	TokenNameIdentifier	 output Dir
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sgmFiles	TokenNameIdentifier	 sgm Files
=	TokenNameEQUAL	
reutersDir	TokenNameIdentifier	 reuters Dir
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
new	TokenNamenew	
FileFilter	TokenNameIdentifier	 File Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".sgm"	TokenNameStringLiteral	.sgm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sgmFiles	TokenNameIdentifier	 sgm Files
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
sgmFiles	TokenNameIdentifier	 sgm Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
sgmFile	TokenNameIdentifier	 sgm File
:	TokenNameCOLON	
sgmFiles	TokenNameIdentifier	 sgm Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extractFile	TokenNameIdentifier	 extract File
(	TokenNameLPAREN	
sgmFile	TokenNameIdentifier	 sgm File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"No .sgm files in "	TokenNameStringLiteral	No .sgm files in 
+	TokenNamePLUS	
reutersDir	TokenNameIdentifier	 reuters Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Pattern	TokenNameIdentifier	 Pattern
EXTRACTION_PATTERN	TokenNameIdentifier	 EXTRACTION  PATTERN
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"<TITLE>(.*?)</TITLE>|<DATE>(.*?)</DATE>|<BODY>(.*?)</BODY>"	TokenNameStringLiteral	<TITLE>(.*?)</TITLE>|<DATE>(.*?)</DATE>|<BODY>(.*?)</BODY>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
META_CHARS	TokenNameIdentifier	 META  CHARS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"&"	TokenNameStringLiteral	&
,	TokenNameCOMMA	
"<"	TokenNameStringLiteral	<
,	TokenNameCOMMA	
">"	TokenNameStringLiteral	>
,	TokenNameCOMMA	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
"'"	TokenNameStringLiteral	'
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
META_CHARS_SERIALIZATIONS	TokenNameIdentifier	 META  CHARS  SERIALIZATIONS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"&amp;"	TokenNameStringLiteral	&amp;
,	TokenNameCOMMA	
"&lt;"	TokenNameStringLiteral	&lt;
,	TokenNameCOMMA	
"&gt;"	TokenNameStringLiteral	&gt;
,	TokenNameCOMMA	
"&quot;"	TokenNameStringLiteral	&quot;
,	TokenNameCOMMA	
"&apos;"	TokenNameStringLiteral	&apos;
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Override if you wish to change what is extracted * * @param sgmFile */	TokenNameCOMMENT_JAVADOC	 Override if you wish to change what is extracted * @param sgmFile 
protected	TokenNameprotected	
void	TokenNamevoid	
extractFile	TokenNameIdentifier	 extract File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
sgmFile	TokenNameIdentifier	 sgm File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
sgmFile	TokenNameIdentifier	 sgm File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
outBuffer	TokenNameIdentifier	 out Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// when we see a closing reuters tag, flush the file 	TokenNameCOMMENT_LINE	when we see a closing reuters tag, flush the file 
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"</REUTERS"	TokenNameStringLiteral	</REUTERS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Replace the SGM escape sequences 	TokenNameCOMMENT_LINE	Replace the SGM escape sequences 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// accumulate the strings for now, 	TokenNameCOMMENT_LINE	accumulate the strings for now, 
// then apply regular expression to 	TokenNameCOMMENT_LINE	then apply regular expression to 
// get the pieces, 	TokenNameCOMMENT_LINE	get the pieces, 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Extract the relevant pieces and write to a file in the output dir 	TokenNameCOMMENT_LINE	Extract the relevant pieces and write to a file in the output dir 
Matcher	TokenNameIdentifier	 Matcher
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
EXTRACTION_PATTERN	TokenNameIdentifier	 EXTRACTION  PATTERN
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
groupCount	TokenNameIdentifier	 group Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outBuffer	TokenNameIdentifier	 out Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
outBuffer	TokenNameIdentifier	 out Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LINE_SEPARATOR	TokenNameIdentifier	 LINE  SEPARATOR
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LINE_SEPARATOR	TokenNameIdentifier	 LINE  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
outBuffer	TokenNameIdentifier	 out Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
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
META_CHARS_SERIALIZATIONS	TokenNameIdentifier	 META  CHARS  SERIALIZATIONS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
META_CHARS_SERIALIZATIONS	TokenNameIdentifier	 META  CHARS  SERIALIZATIONS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
META_CHARS	TokenNameIdentifier	 META  CHARS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
outFile	TokenNameIdentifier	 out File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
outputDir	TokenNameIdentifier	 output Dir
,	TokenNameCOMMA	
sgmFile	TokenNameIdentifier	 sgm File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".txt"	TokenNameStringLiteral	.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Writing " + outFile); 	TokenNameCOMMENT_LINE	System.out.println("Writing " + outFile); 
FileWriter	TokenNameIdentifier	 File Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
outFile	TokenNameIdentifier	 out File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outBuffer	TokenNameIdentifier	 out Buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Wrong number of arguments ("	TokenNameStringLiteral	Wrong number of arguments (
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
reutersDir	TokenNameIdentifier	 reuters Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
reutersDir	TokenNameIdentifier	 reuters Dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Cannot find Path to Reuters SGM files ("	TokenNameStringLiteral	Cannot find Path to Reuters SGM files (
+	TokenNamePLUS	
reutersDir	TokenNameIdentifier	 reuters Dir
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// First, extract to a tmp directory and only if everything succeeds, rename 	TokenNameCOMMENT_LINE	First, extract to a tmp directory and only if everything succeeds, rename 
// to output directory. 	TokenNameCOMMENT_LINE	to output directory. 
File	TokenNameIdentifier	 File
outputDir	TokenNameIdentifier	 output Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputDir	TokenNameIdentifier	 output Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
outputDir	TokenNameIdentifier	 output Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"-tmp"	TokenNameStringLiteral	-tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputDir	TokenNameIdentifier	 output Dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtractReuters	TokenNameIdentifier	 Extract Reuters
extractor	TokenNameIdentifier	 extractor
=	TokenNameEQUAL	
new	TokenNamenew	
ExtractReuters	TokenNameIdentifier	 Extract Reuters
(	TokenNameLPAREN	
reutersDir	TokenNameIdentifier	 reuters Dir
,	TokenNameCOMMA	
outputDir	TokenNameIdentifier	 output Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extractor	TokenNameIdentifier	 extractor
.	TokenNameDOT	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now rename to requested output dir 	TokenNameCOMMENT_LINE	Now rename to requested output dir 
outputDir	TokenNameIdentifier	 output Dir
.	TokenNameDOT	
renameTo	TokenNameIdentifier	 rename To
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: "	TokenNameStringLiteral	Usage: 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" :: java -cp <...> org.apache.lucene.benchmark.utils.ExtractReuters <Path to Reuters SGM files> <Output Path>"	TokenNameStringLiteral	 :: java -cp <...> org.apache.lucene.benchmark.utils.ExtractReuters <Path to Reuters SGM files> <Output Path>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
