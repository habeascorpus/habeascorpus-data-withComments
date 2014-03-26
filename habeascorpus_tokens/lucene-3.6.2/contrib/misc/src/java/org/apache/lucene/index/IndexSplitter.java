/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriter	TokenNameIdentifier	 Index Writer
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
FSDirectory	TokenNameIdentifier	 FS Directory
;	TokenNameSEMICOLON	
/** * Command-line tool that enables listing segments in an * index, copying specific segments to another index, and * deleting segments from an index. * * <p>This tool does file-level copying of segments files. * This means it's unable to split apart a single segment * into multiple segments. For example if your index is a * single segment, this tool won't help. Also, it does basic * file-level copying (using simple * File{In,Out}putStream) so it will not work with non * FSDirectory Directory impls.</p> * * @lucene.experimental You can easily * accidentally remove segments from your index so be * careful! * * <p><b>NOTE</b>: this tool is unaware of documents added * atomically via {@link IndexWriter#addDocuments} or {@link * IndexWriter#updateDocuments}, which means it can easily * break up such document groups. */	TokenNameCOMMENT_JAVADOC	 Command-line tool that enables listing segments in an index, copying specific segments to another index, and deleting segments from an index. * <p>This tool does file-level copying of segments files. This means it's unable to split apart a single segment into multiple segments. For example if your index is a single segment, this tool won't help. Also, it does basic file-level copying (using simple File{In,Out}putStream) so it will not work with non FSDirectory Directory impls.</p> * @lucene.experimental You can easily accidentally remove segments from your index so be careful! * <p><b>NOTE</b>: this tool is unaware of documents added atomically via {@link IndexWriter#addDocuments} or {@link IndexWriter#updateDocuments}, which means it can easily break up such document groups. 
public	TokenNamepublic	
class	TokenNameclass	
IndexSplitter	TokenNameIdentifier	 Index Splitter
{	TokenNameLBRACE	
public	TokenNamepublic	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
;	TokenNameSEMICOLON	
FSDirectory	TokenNameIdentifier	 FS Directory
fsDir	TokenNameIdentifier	 fs Dir
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
/** * @param args */	TokenNameCOMMENT_JAVADOC	 @param args 
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
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: IndexSplitter <srcDir> -l (list the segments and their sizes)"	TokenNameStringLiteral	Usage: IndexSplitter <srcDir> -l (list the segments and their sizes)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"IndexSplitter <srcDir> <destDir> <segments>+"	TokenNameStringLiteral	IndexSplitter <srcDir> <destDir> <segments>+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"IndexSplitter <srcDir> -d (delete the following segments)"	TokenNameStringLiteral	IndexSplitter <srcDir> -d (delete the following segments)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
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
IndexSplitter	TokenNameIdentifier	 Index Splitter
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSplitter	TokenNameIdentifier	 Index Splitter
(	TokenNameLPAREN	
srcDir	TokenNameIdentifier	 src Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
srcDir	TokenNameIdentifier	 src Dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"srcdir:"	TokenNameStringLiteral	srcdir:
+	TokenNamePLUS	
srcDir	TokenNameIdentifier	 src Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't exist"	TokenNameStringLiteral	 doesn't exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-l"	TokenNameStringLiteral	-l
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
listSegments	TokenNameIdentifier	 list Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-d"	TokenNameStringLiteral	-d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
segs	TokenNameIdentifier	 segs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segs	TokenNameIdentifier	 segs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
segs	TokenNameIdentifier	 segs
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
targetDir	TokenNameIdentifier	 target Dir
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
segs	TokenNameIdentifier	 segs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segs	TokenNameIdentifier	 segs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
targetDir	TokenNameIdentifier	 target Dir
,	TokenNameCOMMA	
segs	TokenNameIdentifier	 segs
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
IndexSplitter	TokenNameIdentifier	 Index Splitter
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
fsDir	TokenNameIdentifier	 fs Dir
=	TokenNameEQUAL	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
infos	TokenNameIdentifier	 infos
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
fsDir	TokenNameIdentifier	 fs Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
listSegments	TokenNameIdentifier	 list Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DecimalFormat	TokenNameIdentifier	 Decimal Format
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
"###,###.###"	TokenNameStringLiteral	###,###.###
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sizeStr	TokenNameIdentifier	 size Str
=	TokenNameEQUAL	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
sizeStr	TokenNameIdentifier	 size Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getIdx	TokenNameIdentifier	 get Idx
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SegmentInfo	TokenNameIdentifier	 Segment Info
getInfo	TokenNameIdentifier	 get Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segs	TokenNameIdentifier	 segs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
:	TokenNameCOLON	
segs	TokenNameIdentifier	 segs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getIdx	TokenNameIdentifier	 get Idx
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
changed	TokenNameIdentifier	 changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
fsDir	TokenNameIdentifier	 fs Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segs	TokenNameIdentifier	 segs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
destDir	TokenNameIdentifier	 dest Dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FSDirectory	TokenNameIdentifier	 FS Directory
destFSDir	TokenNameIdentifier	 dest FS Dir
=	TokenNameEQUAL	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
destDir	TokenNameIdentifier	 dest Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfos	TokenNameIdentifier	 Segment Infos
destInfos	TokenNameIdentifier	 dest Infos
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destInfos	TokenNameIdentifier	 dest Infos
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
:	TokenNameCOLON	
segs	TokenNameIdentifier	 segs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
getInfo	TokenNameIdentifier	 get Info
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destInfos	TokenNameIdentifier	 dest Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now copy files over 	TokenNameCOMMENT_LINE	now copy files over 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
srcName	TokenNameIdentifier	 src Name
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
srcFile	TokenNameIdentifier	 src File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
srcName	TokenNameIdentifier	 src Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
destFile	TokenNameIdentifier	 dest File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
srcName	TokenNameIdentifier	 src Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
srcFile	TokenNameIdentifier	 src File
,	TokenNameCOMMA	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
destInfos	TokenNameIdentifier	 dest Infos
.	TokenNameDOT	
changed	TokenNameIdentifier	 changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destInfos	TokenNameIdentifier	 dest Infos
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
destFSDir	TokenNameIdentifier	 dest FS Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("destDir:"+destDir.getAbsolutePath()); 	TokenNameCOMMENT_LINE	System.out.println("destDir:"+destDir.getAbsolutePath()); 
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
copyBuffer	TokenNameIdentifier	 copy Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
32	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dst	TokenNameIdentifier	 dst
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
dst	TokenNameIdentifier	 dst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
copyBuffer	TokenNameIdentifier	 copy Buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
copyBuffer	TokenNameIdentifier	 copy Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
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
}	TokenNameRBRACE	
