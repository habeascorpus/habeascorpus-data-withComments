package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
;	TokenNameSEMICOLON	
/* * Copyright 2001-2005 The Apache Software Foundation. * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Copyright 2001-2005 The Apache Software Foundation. * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URLConnection	TokenNameIdentifier	 URL Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
TimeZone	TokenNameIdentifier	 Time Zone
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
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
/** * Generates a file containing JFlex macros to accept valid ASCII TLDs * (top level domains), for inclusion in JFlex grammars that can accept * domain names. * <p/> * The IANA Root Zone Database is queried via HTTP from URL cmdline arg #0, the * response is parsed, and the results are written out to a file containing * a JFlex macro that will accept all valid ASCII-only TLDs, including punycode * forms of internationalized TLDs (output file cmdline arg #1). */	TokenNameCOMMENT_JAVADOC	 Generates a file containing JFlex macros to accept valid ASCII TLDs (top level domains), for inclusion in JFlex grammars that can accept domain names. <p/> The IANA Root Zone Database is queried via HTTP from URL cmdline arg #0, the response is parsed, and the results are written out to a file containing a JFlex macro that will accept all valid ASCII-only TLDs, including punycode forms of internationalized TLDs (output file cmdline arg #1). 
public	TokenNamepublic	
class	TokenNameclass	
GenerateJflexTLDMacros	TokenNameIdentifier	 Generate Jflex TLD Macros
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"--help"	TokenNameStringLiteral	--help
)	TokenNameRPAREN	
||	TokenNameOR_OR	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-help"	TokenNameStringLiteral	-help
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Cmd line params:"	TokenNameStringLiteral	Cmd line params:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" java "	TokenNameStringLiteral	 java 
+	TokenNamePLUS	
GenerateJflexTLDMacros	TokenNameIdentifier	 Generate Jflex TLD Macros
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"<ZoneFileURL> <JFlexOutputFile>"	TokenNameStringLiteral	<ZoneFileURL> <JFlexOutputFile>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
new	TokenNamenew	
GenerateJflexTLDMacros	TokenNameIdentifier	 Generate Jflex TLD Macros
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NL	TokenNameIdentifier	 NL
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
APACHE_LICENSE	TokenNameIdentifier	 APACHE  LICENSE
=	TokenNameEQUAL	
"/*"	TokenNameStringLiteral	/*
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * Copyright 2001-2005 The Apache Software Foundation."	TokenNameStringLiteral	 * Copyright 2001-2005 The Apache Software Foundation.
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" *"	TokenNameStringLiteral	 *
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * Licensed under the Apache License, Version 2.0 (the "License");"	TokenNameStringLiteral	 * Licensed under the Apache License, Version 2.0 (the "License");
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * you may not use this file except in compliance with the License."	TokenNameStringLiteral	 * you may not use this file except in compliance with the License.
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * You may obtain a copy of the License at"	TokenNameStringLiteral	 * You may obtain a copy of the License at
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" *"	TokenNameStringLiteral	 *
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * http://www.apache.org/licenses/LICENSE-2.0"	TokenNameStringLiteral	 * http://www.apache.org/licenses/LICENSE-2.0
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" *"	TokenNameStringLiteral	 *
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * Unless required by applicable law or agreed to in writing, software"	TokenNameStringLiteral	 * Unless required by applicable law or agreed to in writing, software
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * distributed under the License is distributed on an "AS IS" BASIS,"	TokenNameStringLiteral	 * distributed under the License is distributed on an "AS IS" BASIS,
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied."	TokenNameStringLiteral	 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * See the License for the specific language governing permissions and"	TokenNameStringLiteral	 * See the License for the specific language governing permissions and
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * limitations under the License."	TokenNameStringLiteral	 * limitations under the License.
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" */"	TokenNameStringLiteral	 */
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Pattern	TokenNameIdentifier	 Pattern
TLD_PATTERN_1	TokenNameIdentifier	 TLD  PATTERN 1
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"([-A-Za-z0-9]+)\.\s+NS\s+.*"	TokenNameStringLiteral	([-A-Za-z0-9]+)\.\s+NS\s+.*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Pattern	TokenNameIdentifier	 Pattern
TLD_PATTERN_2	TokenNameIdentifier	 TLD  PATTERN 2
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"([-A-Za-z0-9]+)\.\s+\d+\s+IN\s+NS\s+.*"	TokenNameStringLiteral	([-A-Za-z0-9]+)\.\s+\d+\s+IN\s+NS\s+.*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
URL	TokenNameIdentifier	 URL
tldFileURL	TokenNameIdentifier	 tld File URL
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
tldFileLastModified	TokenNameIdentifier	 tld File Last Modified
=	TokenNameEQUAL	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
outputFile	TokenNameIdentifier	 output File
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GenerateJflexTLDMacros	TokenNameIdentifier	 Generate Jflex TLD Macros
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tldFileURL	TokenNameIdentifier	 tld File URL
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
outputFile	TokenNameIdentifier	 output File
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tldFileURL	TokenNameIdentifier	 tld File URL
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
tldFileURL	TokenNameIdentifier	 tld File URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outputFile	TokenNameIdentifier	 output File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
outputFile	TokenNameIdentifier	 output File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Downloads the IANA Root Zone Database, extracts the ASCII TLDs, then * writes a JFlex macro accepting any of them case-insensitively out to * the specified output file. * * @throws IOException if there is a problem either downloading the database * or writing out the output file. */	TokenNameCOMMENT_JAVADOC	 Downloads the IANA Root Zone Database, extracts the ASCII TLDs, then writes a JFlex macro accepting any of them case-insensitively out to the specified output file. * @throws IOException if there is a problem either downloading the database or writing out the output file. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
TLDs	TokenNameIdentifier	 TL Ds
=	TokenNameEQUAL	
getIANARootZoneDatabase	TokenNameIdentifier	 get IANA Root Zone Database
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOutput	TokenNameIdentifier	 write Output
(	TokenNameLPAREN	
TLDs	TokenNameIdentifier	 TL Ds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Wrote "	TokenNameStringLiteral	Wrote 
+	TokenNamePLUS	
TLDs	TokenNameIdentifier	 TL Ds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" top level domains to '"	TokenNameStringLiteral	 top level domains to '
+	TokenNamePLUS	
outputFile	TokenNameIdentifier	 output File
+	TokenNamePLUS	
"'."	TokenNameStringLiteral	'.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Downloads the IANA Root Zone Database. * @return downcased sorted set of ASCII TLDs * @throws java.io.IOException if there is a problem downloading the database */	TokenNameCOMMENT_JAVADOC	 Downloads the IANA Root Zone Database. @return downcased sorted set of ASCII TLDs @throws java.io.IOException if there is a problem downloading the database 
private	TokenNameprivate	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getIANARootZoneDatabase	TokenNameIdentifier	 get IANA Root Zone Database
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
TLDs	TokenNameIdentifier	 TL Ds
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
URLConnection	TokenNameIdentifier	 URL Connection
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
tldFileURL	TokenNameIdentifier	 tld File URL
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
setUseCaches	TokenNameIdentifier	 set Use Caches
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
addRequestProperty	TokenNameIdentifier	 add Request Property
(	TokenNameLPAREN	
"Cache-Control"	TokenNameStringLiteral	Cache-Control
,	TokenNameCOMMA	
"no-cache"	TokenNameStringLiteral	no-cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tldFileLastModified	TokenNameIdentifier	 tld File Last Modified
=	TokenNameEQUAL	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Matcher	TokenNameIdentifier	 Matcher
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
TLD_PATTERN_1	TokenNameIdentifier	 TLD  PATTERN 1
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TLDs	TokenNameIdentifier	 TL Ds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
TLD_PATTERN_2	TokenNameIdentifier	 TLD  PATTERN 2
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TLDs	TokenNameIdentifier	 TL Ds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
TLDs	TokenNameIdentifier	 TL Ds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes a file containing a JFlex macro that will accept any of the given * TLDs case-insensitively. * * @param ASCIITLDs The downcased sorted set of top level domains to accept * @throws IOException if there is an error writing the output file */	TokenNameCOMMENT_JAVADOC	 Writes a file containing a JFlex macro that will accept any of the given TLDs case-insensitively. * @param ASCIITLDs The downcased sorted set of top level domains to accept @throws IOException if there is an error writing the output file 
private	TokenNameprivate	
void	TokenNamevoid	
writeOutput	TokenNameIdentifier	 write Output
(	TokenNameLPAREN	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
ASCIITLDs	TokenNameIdentifier	 ASCIITL Ds
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
getDateTimeInstance	TokenNameIdentifier	 get Date Time Instance
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
FULL	TokenNameIdentifier	 FULL
,	TokenNameCOMMA	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
FULL	TokenNameIdentifier	 FULL
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"UTC"	TokenNameStringLiteral	UTC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
outputFile	TokenNameIdentifier	 output File
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
APACHE_LICENSE	TokenNameIdentifier	 APACHE  LICENSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"// Generated from IANA Root Zone Database <"	TokenNameStringLiteral	// Generated from IANA Root Zone Database <
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
tldFileURL	TokenNameIdentifier	 tld File URL
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
NL	TokenNameIdentifier	 NL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tldFileLastModified	TokenNameIdentifier	 tld File Last Modified
>	TokenNameGREATER	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"// file version from "	TokenNameStringLiteral	// file version from 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
tldFileLastModified	TokenNameIdentifier	 tld File Last Modified
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
NL	TokenNameIdentifier	 NL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"// generated on "	TokenNameStringLiteral	// generated on 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
NL	TokenNameIdentifier	 NL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"// by "	TokenNameStringLiteral	// by 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
NL	TokenNameIdentifier	 NL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
NL	TokenNameIdentifier	 NL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"ASCIITLD = "." ("	TokenNameStringLiteral	ASCIITLD = "." (
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
NL	TokenNameIdentifier	 NL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isFirst	TokenNameIdentifier	 is First
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ASCIITLD	TokenNameIdentifier	 ASCIITLD
:	TokenNameCOLON	
ASCIITLDs	TokenNameIdentifier	 ASCIITL Ds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isFirst	TokenNameIdentifier	 is First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFirst	TokenNameIdentifier	 is First
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"| "	TokenNameStringLiteral	| 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
getCaseInsensitiveRegex	TokenNameIdentifier	 get Case Insensitive Regex
(	TokenNameLPAREN	
ASCIITLD	TokenNameIdentifier	 ASCIITLD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
NL	TokenNameIdentifier	 NL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" ) "."? // Accept trailing root (empty) domain"	TokenNameStringLiteral	 ) "."? // Accept trailing root (empty) domain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
NL	TokenNameIdentifier	 NL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
NL	TokenNameIdentifier	 NL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a regex that will accept the given ASCII TLD case-insensitively. * * @param ASCIITLD The ASCII TLD to generate a regex for * @return a regex that will accept the given ASCII TLD case-insensitively */	TokenNameCOMMENT_JAVADOC	 Returns a regex that will accept the given ASCII TLD case-insensitively. * @param ASCIITLD The ASCII TLD to generate a regex for @return a regex that will accept the given ASCII TLD case-insensitively 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getCaseInsensitiveRegex	TokenNameIdentifier	 get Case Insensitive Regex
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ASCIITLD	TokenNameIdentifier	 ASCIITLD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
ASCIITLD	TokenNameIdentifier	 ASCIITLD
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
ASCIITLD	TokenNameIdentifier	 ASCIITLD
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
