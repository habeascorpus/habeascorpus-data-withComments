/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
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
RandomAccessFile	TokenNameIdentifier	 Random Access File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
Enumeration	TokenNameIdentifier	 Enumeration
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
HashSet	TokenNameIdentifier	 Hash Set
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
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
CRC32	TokenNameIdentifier	 CR C32
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Inflater	TokenNameIdentifier	 Inflater
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
InflaterInputStream	TokenNameIdentifier	 Inflater Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipException	TokenNameIdentifier	 Zip Exception
;	TokenNameSEMICOLON	
/** * Replacement for <code>java.util.ZipFile</code>. * * <p>This class adds support for file name encodings other than UTF-8 * (which is required to work on ZIP files created by native zip tools * and is able to skip a preamble like the one found in self * extracting archives. Furthermore it returns instances of * <code>org.apache.tools.zip.ZipEntry</code> instead of * <code>java.util.zip.ZipEntry</code>.</p> * * <p>It doesn't extend <code>java.util.zip.ZipFile</code> as it would * have to reimplement all methods anyway. Like * <code>java.util.ZipFile</code>, it uses RandomAccessFile under the * covers and supports compressed and uncompressed entries.</p> * * <p>The method signatures mimic the ones of * <code>java.util.zip.ZipFile</code>, with a couple of exceptions: * * <ul> * <li>There is no getName method.</li> * <li>entries has been renamed to getEntries.</li> * <li>getEntries and getEntry return * <code>org.apache.tools.zip.ZipEntry</code> instances.</li> * <li>close is allowed to throw IOException.</li> * </ul> * */	TokenNameCOMMENT_JAVADOC	 Replacement for <code>java.util.ZipFile</code>. * <p>This class adds support for file name encodings other than UTF-8 (which is required to work on ZIP files created by native zip tools and is able to skip a preamble like the one found in self extracting archives. Furthermore it returns instances of <code>org.apache.tools.zip.ZipEntry</code> instead of <code>java.util.zip.ZipEntry</code>.</p> * <p>It doesn't extend <code>java.util.zip.ZipFile</code> as it would have to reimplement all methods anyway. Like <code>java.util.ZipFile</code>, it uses RandomAccessFile under the covers and supports compressed and uncompressed entries.</p> * <p>The method signatures mimic the ones of <code>java.util.zip.ZipFile</code>, with a couple of exceptions: * <ul> <li>There is no getName method.</li> <li>entries has been renamed to getEntries.</li> <li>getEntries and getEntry return <code>org.apache.tools.zip.ZipEntry</code> instances.</li> <li>close is allowed to throw IOException.</li> </ul> 
public	TokenNamepublic	
class	TokenNameclass	
ZipFile	TokenNameIdentifier	 Zip File
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HASH_SIZE	TokenNameIdentifier	 HASH  SIZE
=	TokenNameEQUAL	
509	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHORT	TokenNameIdentifier	 SHORT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WORD	TokenNameIdentifier	 WORD
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NIBLET_MASK	TokenNameIdentifier	 NIBLET  MASK
=	TokenNameEQUAL	
0x0f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_SHIFT	TokenNameIdentifier	 BYTE  SHIFT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_0	TokenNameIdentifier	 POS 0
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_1	TokenNameIdentifier	 POS 1
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_2	TokenNameIdentifier	 POS 2
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_3	TokenNameIdentifier	 POS 3
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Maps ZipEntrys to Longs, recording the offsets of the local * file headers. */	TokenNameCOMMENT_JAVADOC	 Maps ZipEntrys to Longs, recording the offsets of the local file headers. 
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
HASH_SIZE	TokenNameIdentifier	 HASH  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Maps String to ZipEntrys, name -> actual entry. */	TokenNameCOMMENT_JAVADOC	 Maps String to ZipEntrys, name -> actual entry. 
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
nameMap	TokenNameIdentifier	 name Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
HASH_SIZE	TokenNameIdentifier	 HASH  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
OffsetEntry	TokenNameIdentifier	 Offset Entry
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
headerOffset	TokenNameIdentifier	 header Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
dataOffset	TokenNameIdentifier	 data Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The encoding to use for filenames and the file comment. * * <p>For a list of possible values see <a * href="http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html">http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html</a>. * Defaults to the platform's default character encoding.</p> */	TokenNameCOMMENT_JAVADOC	 The encoding to use for filenames and the file comment. * <p>For a list of possible values see <a href="http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html">http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html</a>. Defaults to the platform's default character encoding.</p> 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The zip encoding to use for filenames and the file comment. */	TokenNameCOMMENT_JAVADOC	 The zip encoding to use for filenames and the file comment. 
private	TokenNameprivate	
final	TokenNamefinal	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
zipEncoding	TokenNameIdentifier	 zip Encoding
;	TokenNameSEMICOLON	
/** * The actual data source. */	TokenNameCOMMENT_JAVADOC	 The actual data source. 
private	TokenNameprivate	
RandomAccessFile	TokenNameIdentifier	 Random Access File
archive	TokenNameIdentifier	 archive
;	TokenNameSEMICOLON	
/** * Whether to look for and use Unicode extra fields. */	TokenNameCOMMENT_JAVADOC	 Whether to look for and use Unicode extra fields. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
useUnicodeExtraFields	TokenNameIdentifier	 use Unicode Extra Fields
;	TokenNameSEMICOLON	
/** * Opens the given file for reading, assuming the platform's * native encoding for file names. * * @param f the archive. * * @throws IOException if an error occurs while reading the file. */	TokenNameCOMMENT_JAVADOC	 Opens the given file for reading, assuming the platform's native encoding for file names. * @param f the archive. * @throws IOException if an error occurs while reading the file. 
public	TokenNamepublic	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Opens the given file for reading, assuming the platform's * native encoding for file names. * * @param name name of the archive. * * @throws IOException if an error occurs while reading the file. */	TokenNameCOMMENT_JAVADOC	 Opens the given file for reading, assuming the platform's native encoding for file names. * @param name name of the archive. * @throws IOException if an error occurs while reading the file. 
public	TokenNamepublic	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Opens the given file for reading, assuming the specified * encoding for file names, scanning unicode extra fields. * * @param name name of the archive. * @param encoding the encoding to use for file names * * @throws IOException if an error occurs while reading the file. */	TokenNameCOMMENT_JAVADOC	 Opens the given file for reading, assuming the specified encoding for file names, scanning unicode extra fields. * @param name name of the archive. @param encoding the encoding to use for file names * @throws IOException if an error occurs while reading the file. 
public	TokenNamepublic	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Opens the given file for reading, assuming the specified * encoding for file names and scanning for unicode extra fields. * * @param f the archive. * @param encoding the encoding to use for file names, use null * for the platform's default encoding * * @throws IOException if an error occurs while reading the file. */	TokenNameCOMMENT_JAVADOC	 Opens the given file for reading, assuming the specified encoding for file names and scanning for unicode extra fields. * @param f the archive. @param encoding the encoding to use for file names, use null for the platform's default encoding * @throws IOException if an error occurs while reading the file. 
public	TokenNamepublic	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Opens the given file for reading, assuming the specified * encoding for file names. * * @param f the archive. * @param encoding the encoding to use for file names, use null * for the platform's default encoding * @param useUnicodeExtraFields whether to use InfoZIP Unicode * Extra Fields (if present) to set the file names. * * @throws IOException if an error occurs while reading the file. */	TokenNameCOMMENT_JAVADOC	 Opens the given file for reading, assuming the specified encoding for file names. * @param f the archive. @param encoding the encoding to use for file names, use null for the platform's default encoding @param useUnicodeExtraFields whether to use InfoZIP Unicode Extra Fields (if present) to set the file names. * @throws IOException if an error occurs while reading the file. 
public	TokenNamepublic	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useUnicodeExtraFields	TokenNameIdentifier	 use Unicode Extra Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
zipEncoding	TokenNameIdentifier	 zip Encoding
=	TokenNameEQUAL	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
getZipEncoding	TokenNameIdentifier	 get Zip Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
useUnicodeExtraFields	TokenNameIdentifier	 use Unicode Extra Fields
=	TokenNameEQUAL	
useUnicodeExtraFields	TokenNameIdentifier	 use Unicode Extra Fields
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"r"	TokenNameStringLiteral	r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
entriesWithoutUTF8Flag	TokenNameIdentifier	 entries Without UT F8 Flag
=	TokenNameEQUAL	
populateFromCentralDirectory	TokenNameIdentifier	 populate From Central Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resolveLocalFileHeaderData	TokenNameIdentifier	 resolve Local File Header Data
(	TokenNameLPAREN	
entriesWithoutUTF8Flag	TokenNameIdentifier	 entries Without UT F8 Flag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// swallow, throw the original exception instead 	TokenNameCOMMENT_LINE	swallow, throw the original exception instead 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The encoding to use for filenames and the file comment. * * @return null if using the platform's default character encoding. */	TokenNameCOMMENT_JAVADOC	 The encoding to use for filenames and the file comment. * @return null if using the platform's default character encoding. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes the archive. * @throws IOException if an error occurs closing the archive. */	TokenNameCOMMENT_JAVADOC	 Closes the archive. @throws IOException if an error occurs closing the archive. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * close a zipfile quietly; throw no io fault, do nothing * on a null parameter * @param zipfile file to close, can be null */	TokenNameCOMMENT_JAVADOC	 close a zipfile quietly; throw no io fault, do nothing on a null parameter @param zipfile file to close, can be null 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
ZipFile	TokenNameIdentifier	 Zip File
zipfile	TokenNameIdentifier	 zipfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
zipfile	TokenNameIdentifier	 zipfile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
zipfile	TokenNameIdentifier	 zipfile
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
//ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns all entries. * @return all entries as {@link ZipEntry} instances */	TokenNameCOMMENT_JAVADOC	 Returns all entries. @return all entries as {@link ZipEntry} instances 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getEntries	TokenNameIdentifier	 get Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a named entry - or <code>null</code> if no entry by * that name exists. * @param name name of the entry. * @return the ZipEntry corresponding to the given name - or * <code>null</code> if not present. */	TokenNameCOMMENT_JAVADOC	 Returns a named entry - or <code>null</code> if no entry by that name exists. @param name name of the entry. @return the ZipEntry corresponding to the given name - or <code>null</code> if not present. 
public	TokenNamepublic	
ZipEntry	TokenNameIdentifier	 Zip Entry
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
)	TokenNameRPAREN	
nameMap	TokenNameIdentifier	 name Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an InputStream for reading the contents of the given entry. * @param ze the entry to get the stream for. * @return a stream to read the entry from. * @throws IOException if unable to create an input stream from the zipenty * @throws ZipException if the zipentry has an unsupported * compression method */	TokenNameCOMMENT_JAVADOC	 Returns an InputStream for reading the contents of the given entry. @param ze the entry to get the stream for. @return a stream to read the entry from. @throws IOException if unable to create an input stream from the zipenty @throws ZipException if the zipentry has an unsupported compression method 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ZipException	TokenNameIdentifier	 Zip Exception
{	TokenNameLBRACE	
OffsetEntry	TokenNameIdentifier	 Offset Entry
offsetEntry	TokenNameIdentifier	 offset Entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OffsetEntry	TokenNameIdentifier	 Offset Entry
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsetEntry	TokenNameIdentifier	 offset Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
offsetEntry	TokenNameIdentifier	 offset Entry
.	TokenNameDOT	
dataOffset	TokenNameIdentifier	 data Offset
;	TokenNameSEMICOLON	
BoundedInputStream	TokenNameIdentifier	 Bounded Input Stream
bis	TokenNameIdentifier	 bis
=	TokenNameEQUAL	
new	TokenNamenew	
BoundedInputStream	TokenNameIdentifier	 Bounded Input Stream
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getCompressedSize	TokenNameIdentifier	 get Compressed Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ZipEntry	TokenNameIdentifier	 Zip Entry
.	TokenNameDOT	
STORED	TokenNameIdentifier	 STORED
:	TokenNameCOLON	
return	TokenNamereturn	
bis	TokenNameIdentifier	 bis
;	TokenNameSEMICOLON	
case	TokenNamecase	
ZipEntry	TokenNameIdentifier	 Zip Entry
.	TokenNameDOT	
DEFLATED	TokenNameIdentifier	 DEFLATED
:	TokenNameCOLON	
bis	TokenNameIdentifier	 bis
.	TokenNameDOT	
addDummy	TokenNameIdentifier	 add Dummy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Inflater	TokenNameIdentifier	 Inflater
inflater	TokenNameIdentifier	 inflater
=	TokenNameEQUAL	
new	TokenNamenew	
Inflater	TokenNameIdentifier	 Inflater
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
InflaterInputStream	TokenNameIdentifier	 Inflater Input Stream
(	TokenNameLPAREN	
bis	TokenNameIdentifier	 bis
,	TokenNameCOMMA	
inflater	TokenNameIdentifier	 inflater
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inflater	TokenNameIdentifier	 inflater
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"Found unsupported compression method "	TokenNameStringLiteral	Found unsupported compression method 
+	TokenNamePLUS	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CFH_LEN	TokenNameIdentifier	 CFH  LEN
=	TokenNameEQUAL	
/* version made by */	TokenNameCOMMENT_BLOCK	 version made by 
SHORT	TokenNameIdentifier	 SHORT
/* version needed to extract */	TokenNameCOMMENT_BLOCK	 version needed to extract 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* general purpose bit flag */	TokenNameCOMMENT_BLOCK	 general purpose bit flag 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* compression method */	TokenNameCOMMENT_BLOCK	 compression method 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* last mod file time */	TokenNameCOMMENT_BLOCK	 last mod file time 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* last mod file date */	TokenNameCOMMENT_BLOCK	 last mod file date 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* crc-32 */	TokenNameCOMMENT_BLOCK	 crc-32 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
/* compressed size */	TokenNameCOMMENT_BLOCK	 compressed size 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
/* uncompressed size */	TokenNameCOMMENT_BLOCK	 uncompressed size 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
/* filename length */	TokenNameCOMMENT_BLOCK	 filename length 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* extra field length */	TokenNameCOMMENT_BLOCK	 extra field length 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* file comment length */	TokenNameCOMMENT_BLOCK	 file comment length 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* disk number start */	TokenNameCOMMENT_BLOCK	 disk number start 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* internal file attributes */	TokenNameCOMMENT_BLOCK	 internal file attributes 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* external file attributes */	TokenNameCOMMENT_BLOCK	 external file attributes 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
/* relative offset of local header */	TokenNameCOMMENT_BLOCK	 relative offset of local header 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
/** * Reads the central directory of the given archive and populates * the internal tables with ZipEntry instances. * * <p>The ZipEntrys will know all data that can be obtained from * the central directory alone, but not the data that requires the * local file header or additional data to be read.</p> * * @return a Map&lt;ZipEntry, NameAndComment>&gt; of * zipentries that didn't have the language encoding flag set when * read. */	TokenNameCOMMENT_JAVADOC	 Reads the central directory of the given archive and populates the internal tables with ZipEntry instances. * <p>The ZipEntrys will know all data that can be obtained from the central directory alone, but not the data that requires the local file header or additional data to be read.</p> * @return a Map&lt;ZipEntry, NameAndComment>&gt; of zipentries that didn't have the language encoding flag set when read. 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
populateFromCentralDirectory	TokenNameIdentifier	 populate From Central Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
HashMap	TokenNameIdentifier	 Hash Map
noUTF8Flag	TokenNameIdentifier	 no UT F8 Flag
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positionAtCentralDirectory	TokenNameIdentifier	 position At Central Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cfh	TokenNameIdentifier	 cfh
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
CFH_LEN	TokenNameIdentifier	 CFH  LEN
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
signatureBytes	TokenNameIdentifier	 signature Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
WORD	TokenNameIdentifier	 WORD
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
signatureBytes	TokenNameIdentifier	 signature Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
sig	TokenNameIdentifier	 sig
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
signatureBytes	TokenNameIdentifier	 signature Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
cfhSig	TokenNameIdentifier	 cfh Sig
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
.	TokenNameDOT	
CFH_SIG	TokenNameIdentifier	 CFH  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sig	TokenNameIdentifier	 sig
!=	TokenNameNOT_EQUAL	
cfhSig	TokenNameIdentifier	 cfh Sig
&&	TokenNameAND_AND	
startsWithLocalFileHeader	TokenNameIdentifier	 starts With Local File Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"central directory is empty, can't expand"	TokenNameStringLiteral	central directory is empty, can't expand
+	TokenNamePLUS	
" corrupt archive."	TokenNameStringLiteral	 corrupt archive.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
sig	TokenNameIdentifier	 sig
==	TokenNameEQUAL_EQUAL	
cfhSig	TokenNameIdentifier	 cfh Sig
)	TokenNameRPAREN	
{	TokenNameLBRACE	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
versionMadeBy	TokenNameIdentifier	 version Made By
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setPlatform	TokenNameIdentifier	 set Platform
(	TokenNameLPAREN	
(	TokenNameLPAREN	
versionMadeBy	TokenNameIdentifier	 version Made By
>>	TokenNameRIGHT_SHIFT	
BYTE_SHIFT	TokenNameIdentifier	 BYTE  SHIFT
)	TokenNameRPAREN	
&	TokenNameAND	
NIBLET_MASK	TokenNameIdentifier	 NIBLET  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// skip version info 	TokenNameCOMMENT_LINE	skip version info 
final	TokenNamefinal	
int	TokenNameint	
generalPurposeFlag	TokenNameIdentifier	 general Purpose Flag
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasUTF8Flag	TokenNameIdentifier	 has UT F8 Flag
=	TokenNameEQUAL	
(	TokenNameLPAREN	
generalPurposeFlag	TokenNameIdentifier	 general Purpose Flag
&	TokenNameAND	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
.	TokenNameDOT	
UFT8_NAMES_FLAG	TokenNameIdentifier	 UF T8  NAMES  FLAG
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
entryEncoding	TokenNameIdentifier	 entry Encoding
=	TokenNameEQUAL	
hasUTF8Flag	TokenNameIdentifier	 has UT F8 Flag
?	TokenNameQUESTION	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
UTF8_ZIP_ENCODING	TokenNameIdentifier	 UT F8  ZIP  ENCODING
:	TokenNameCOLON	
zipEncoding	TokenNameIdentifier	 zip Encoding
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// FIXME this is actually not very cpu cycles friendly as we are converting from 	TokenNameCOMMENT_LINE	FIXME this is actually not very cpu cycles friendly as we are converting from 
// dos to java while the underlying Sun implementation will convert 	TokenNameCOMMENT_LINE	dos to java while the underlying Sun implementation will convert 
// from java to dos time for internal storage... 	TokenNameCOMMENT_LINE	from java to dos time for internal storage... 
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
dosToJavaTime	TokenNameIdentifier	 dos To Java Time
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setCrc	TokenNameIdentifier	 set Crc
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setCompressedSize	TokenNameIdentifier	 set Compressed Size
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
int	TokenNameint	
fileNameLen	TokenNameIdentifier	 file Name Len
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
int	TokenNameint	
extraLen	TokenNameIdentifier	 extra Len
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
int	TokenNameint	
commentLen	TokenNameIdentifier	 comment Len
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// disk number 	TokenNameCOMMENT_LINE	disk number 
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setInternalAttributes	TokenNameIdentifier	 set Internal Attributes
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setExternalAttributes	TokenNameIdentifier	 set External Attributes
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
fileNameLen	TokenNameIdentifier	 file Name Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
entryEncoding	TokenNameIdentifier	 entry Encoding
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// LFH offset, 	TokenNameCOMMENT_LINE	LFH offset, 
OffsetEntry	TokenNameIdentifier	 Offset Entry
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
new	TokenNamenew	
OffsetEntry	TokenNameIdentifier	 Offset Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
.	TokenNameDOT	
headerOffset	TokenNameIdentifier	 header Offset
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfh	TokenNameIdentifier	 cfh
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// data offset will be filled later 	TokenNameCOMMENT_LINE	data offset will be filled later 
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nameMap	TokenNameIdentifier	 name Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cdExtraData	TokenNameIdentifier	 cd Extra Data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
extraLen	TokenNameIdentifier	 extra Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
cdExtraData	TokenNameIdentifier	 cd Extra Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setCentralDirectoryExtra	TokenNameIdentifier	 set Central Directory Extra
(	TokenNameLPAREN	
cdExtraData	TokenNameIdentifier	 cd Extra Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
commentLen	TokenNameIdentifier	 comment Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
entryEncoding	TokenNameIdentifier	 entry Encoding
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
signatureBytes	TokenNameIdentifier	 signature Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sig	TokenNameIdentifier	 sig
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
signatureBytes	TokenNameIdentifier	 signature Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasUTF8Flag	TokenNameIdentifier	 has UT F8 Flag
&&	TokenNameAND_AND	
useUnicodeExtraFields	TokenNameIdentifier	 use Unicode Extra Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noUTF8Flag	TokenNameIdentifier	 no UT F8 Flag
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
,	TokenNameCOMMA	
new	TokenNamenew	
NameAndComment	TokenNameIdentifier	 Name And Comment
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
noUTF8Flag	TokenNameIdentifier	 no UT F8 Flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MIN_EOCD_SIZE	TokenNameIdentifier	 MIN  EOCD  SIZE
=	TokenNameEQUAL	
/* end of central dir signature */	TokenNameCOMMENT_BLOCK	 end of central dir signature 
WORD	TokenNameIdentifier	 WORD
/* number of this disk */	TokenNameCOMMENT_BLOCK	 number of this disk 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* number of the disk with the */	TokenNameCOMMENT_BLOCK	 number of the disk with the 
/* start of the central directory */	TokenNameCOMMENT_BLOCK	 start of the central directory 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* total number of entries in */	TokenNameCOMMENT_BLOCK	 total number of entries in 
/* the central dir on this disk */	TokenNameCOMMENT_BLOCK	 the central dir on this disk 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* total number of entries in */	TokenNameCOMMENT_BLOCK	 total number of entries in 
/* the central dir */	TokenNameCOMMENT_BLOCK	 the central dir 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* size of the central directory */	TokenNameCOMMENT_BLOCK	 size of the central directory 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
/* offset of start of central */	TokenNameCOMMENT_BLOCK	 offset of start of central 
/* directory with respect to */	TokenNameCOMMENT_BLOCK	 directory with respect to 
/* the starting disk number */	TokenNameCOMMENT_BLOCK	 the starting disk number 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
/* zipfile comment length */	TokenNameCOMMENT_BLOCK	 zipfile comment length 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_EOCD_SIZE	TokenNameIdentifier	 MAX  EOCD  SIZE
=	TokenNameEQUAL	
MIN_EOCD_SIZE	TokenNameIdentifier	 MIN  EOCD  SIZE
/* maximum length of zipfile comment */	TokenNameCOMMENT_BLOCK	 maximum length of zipfile comment 
+	TokenNamePLUS	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CFD_LOCATOR_OFFSET	TokenNameIdentifier	 CFD  LOCATOR  OFFSET
=	TokenNameEQUAL	
/* end of central dir signature */	TokenNameCOMMENT_BLOCK	 end of central dir signature 
WORD	TokenNameIdentifier	 WORD
/* number of this disk */	TokenNameCOMMENT_BLOCK	 number of this disk 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* number of the disk with the */	TokenNameCOMMENT_BLOCK	 number of the disk with the 
/* start of the central directory */	TokenNameCOMMENT_BLOCK	 start of the central directory 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* total number of entries in */	TokenNameCOMMENT_BLOCK	 total number of entries in 
/* the central dir on this disk */	TokenNameCOMMENT_BLOCK	 the central dir on this disk 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* total number of entries in */	TokenNameCOMMENT_BLOCK	 total number of entries in 
/* the central dir */	TokenNameCOMMENT_BLOCK	 the central dir 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* size of the central directory */	TokenNameCOMMENT_BLOCK	 size of the central directory 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
/** * Searches for the &quot;End of central dir record&quot;, parses * it and positions the stream at the first central directory * record. */	TokenNameCOMMENT_JAVADOC	 Searches for the &quot;End of central dir record&quot;, parses it and positions the stream at the first central directory record. 
private	TokenNameprivate	
void	TokenNamevoid	
positionAtCentralDirectory	TokenNameIdentifier	 position At Central Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
long	TokenNamelong	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
MIN_EOCD_SIZE	TokenNameIdentifier	 MIN  EOCD  SIZE
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
stopSearching	TokenNameIdentifier	 stop Searching
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
MAX_EOCD_SIZE	TokenNameIdentifier	 MAX  EOCD  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sig	TokenNameIdentifier	 sig
=	TokenNameEQUAL	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
.	TokenNameDOT	
EOCD_SIG	TokenNameIdentifier	 EOCD  SIG
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
>=	TokenNameGREATER_EQUAL	
stopSearching	TokenNameIdentifier	 stop Searching
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
==	TokenNameEQUAL_EQUAL	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
POS_0	TokenNameIdentifier	 POS 0
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
==	TokenNameEQUAL_EQUAL	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
POS_1	TokenNameIdentifier	 POS 1
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
==	TokenNameEQUAL_EQUAL	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
POS_2	TokenNameIdentifier	 POS 2
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
==	TokenNameEQUAL_EQUAL	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
POS_3	TokenNameIdentifier	 POS 3
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"archive is not a ZIP archive"	TokenNameStringLiteral	archive is not a ZIP archive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
CFD_LOCATOR_OFFSET	TokenNameIdentifier	 CFD  LOCATOR  OFFSET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cfdOffset	TokenNameIdentifier	 cfd Offset
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
WORD	TokenNameIdentifier	 WORD
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
cfdOffset	TokenNameIdentifier	 cfd Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
cfdOffset	TokenNameIdentifier	 cfd Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Number of bytes in local file header up to the &quot;length of * filename&quot; entry. */	TokenNameCOMMENT_JAVADOC	 Number of bytes in local file header up to the &quot;length of filename&quot; entry. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
LFH_OFFSET_FOR_FILENAME_LENGTH	TokenNameIdentifier	 LFH  OFFSET  FOR  FILENAME  LENGTH
=	TokenNameEQUAL	
/* local file header signature */	TokenNameCOMMENT_BLOCK	 local file header signature 
WORD	TokenNameIdentifier	 WORD
/* version needed to extract */	TokenNameCOMMENT_BLOCK	 version needed to extract 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* general purpose bit flag */	TokenNameCOMMENT_BLOCK	 general purpose bit flag 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* compression method */	TokenNameCOMMENT_BLOCK	 compression method 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* last mod file time */	TokenNameCOMMENT_BLOCK	 last mod file time 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* last mod file date */	TokenNameCOMMENT_BLOCK	 last mod file date 
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
/* crc-32 */	TokenNameCOMMENT_BLOCK	 crc-32 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
/* compressed size */	TokenNameCOMMENT_BLOCK	 compressed size 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
/* uncompressed size */	TokenNameCOMMENT_BLOCK	 uncompressed size 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
/** * Walks through all recorded entries and adds the data available * from the local file header. * * <p>Also records the offsets for the data to read from the * entries.</p> */	TokenNameCOMMENT_JAVADOC	 Walks through all recorded entries and adds the data available from the local file header. * <p>Also records the offsets for the data to read from the entries.</p> 
private	TokenNameprivate	
void	TokenNamevoid	
resolveLocalFileHeaderData	TokenNameIdentifier	 resolve Local File Header Data
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
entriesWithoutUTF8Flag	TokenNameIdentifier	 entries Without UT F8 Flag
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
(	TokenNameLPAREN	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OffsetEntry	TokenNameIdentifier	 Offset Entry
offsetEntry	TokenNameIdentifier	 offset Entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OffsetEntry	TokenNameIdentifier	 Offset Entry
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offsetEntry	TokenNameIdentifier	 offset Entry
.	TokenNameDOT	
headerOffset	TokenNameIdentifier	 header Offset
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
LFH_OFFSET_FOR_FILENAME_LENGTH	TokenNameIdentifier	 LFH  OFFSET  FOR  FILENAME  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
SHORT	TokenNameIdentifier	 SHORT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fileNameLen	TokenNameIdentifier	 file Name Len
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
extraFieldLen	TokenNameIdentifier	 extra Field Len
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lenToSkip	TokenNameIdentifier	 len To Skip
=	TokenNameEQUAL	
fileNameLen	TokenNameIdentifier	 file Name Len
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lenToSkip	TokenNameIdentifier	 len To Skip
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
skipped	TokenNameIdentifier	 skipped
=	TokenNameEQUAL	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
skipBytes	TokenNameIdentifier	 skip Bytes
(	TokenNameLPAREN	
lenToSkip	TokenNameIdentifier	 len To Skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skipped	TokenNameIdentifier	 skipped
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"failed to skip file name in"	TokenNameStringLiteral	failed to skip file name in
+	TokenNamePLUS	
" local file header"	TokenNameStringLiteral	 local file header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lenToSkip	TokenNameIdentifier	 len To Skip
-=	TokenNameMINUS_EQUAL	
skipped	TokenNameIdentifier	 skipped
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
localExtraData	TokenNameIdentifier	 local Extra Data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
extraFieldLen	TokenNameIdentifier	 extra Field Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
localExtraData	TokenNameIdentifier	 local Extra Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
localExtraData	TokenNameIdentifier	 local Extra Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*dataOffsets.put(ze, new Long(offset + LFH_OFFSET_FOR_FILENAME_LENGTH + SHORT + SHORT + fileNameLen + extraFieldLen)); */	TokenNameCOMMENT_BLOCK	dataOffsets.put(ze, new Long(offset + LFH_OFFSET_FOR_FILENAME_LENGTH + SHORT + SHORT + fileNameLen + extraFieldLen)); 
offsetEntry	TokenNameIdentifier	 offset Entry
.	TokenNameDOT	
dataOffset	TokenNameIdentifier	 data Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
LFH_OFFSET_FOR_FILENAME_LENGTH	TokenNameIdentifier	 LFH  OFFSET  FOR  FILENAME  LENGTH
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
+	TokenNamePLUS	
SHORT	TokenNameIdentifier	 SHORT
+	TokenNamePLUS	
fileNameLen	TokenNameIdentifier	 file Name Len
+	TokenNamePLUS	
extraFieldLen	TokenNameIdentifier	 extra Field Len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entriesWithoutUTF8Flag	TokenNameIdentifier	 entries Without UT F8 Flag
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// changing the name of a ZipEntry is going to change 	TokenNameCOMMENT_LINE	changing the name of a ZipEntry is going to change 
// the hashcode 	TokenNameCOMMENT_LINE	the hashcode 
// - see https://issues.apache.org/jira/browse/COMPRESS-164 	TokenNameCOMMENT_LINE	- see https://issues.apache.org/jira/browse/COMPRESS-164 
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNameAndCommentFromExtraFields	TokenNameIdentifier	 set Name And Comment From Extra Fields
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
,	TokenNameCOMMA	
(	TokenNameLPAREN	
NameAndComment	TokenNameIdentifier	 Name And Comment
)	TokenNameRPAREN	
entriesWithoutUTF8Flag	TokenNameIdentifier	 entries Without UT F8 Flag
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
,	TokenNameCOMMA	
offsetEntry	TokenNameIdentifier	 offset Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Convert a DOS date/time field to a Date object. * * @param zipDosTime contains the stored DOS time. * @return a Date instance corresponding to the given time. */	TokenNameCOMMENT_JAVADOC	 Convert a DOS date/time field to a Date object. * @param zipDosTime contains the stored DOS time. @return a Date instance corresponding to the given time. 
protected	TokenNameprotected	
static	TokenNamestatic	
Date	TokenNameIdentifier	 Date
fromDosTime	TokenNameIdentifier	 from Dos Time
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
zipDosTime	TokenNameIdentifier	 zip Dos Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
dosTime	TokenNameIdentifier	 dos Time
=	TokenNameEQUAL	
zipDosTime	TokenNameIdentifier	 zip Dos Time
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
dosToJavaTime	TokenNameIdentifier	 dos To Java Time
(	TokenNameLPAREN	
dosTime	TokenNameIdentifier	 dos Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Converts DOS time to Java time (number of milliseconds since epoch). */	TokenNameCOMMENT_BLOCK	 Converts DOS time to Java time (number of milliseconds since epoch). 
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
dosToJavaTime	TokenNameIdentifier	 dos To Java Time
(	TokenNameLPAREN	
long	TokenNamelong	
dosTime	TokenNameIdentifier	 dos Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumberCheck OFF - no point 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumberCheck OFF - no point 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dosTime	TokenNameIdentifier	 dos Time
>>	TokenNameRIGHT_SHIFT	
25	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1980	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dosTime	TokenNameIdentifier	 dos Time
>>	TokenNameRIGHT_SHIFT	
21	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
dosTime	TokenNameIdentifier	 dos Time
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x1f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
dosTime	TokenNameIdentifier	 dos Time
>>	TokenNameRIGHT_SHIFT	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x1f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
dosTime	TokenNameIdentifier	 dos Time
>>	TokenNameRIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
dosTime	TokenNameIdentifier	 dos Time
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3e	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumberCheck ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumberCheck ON 
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve a String from the given bytes using the encoding set * for this ZipFile. * * @param bytes the byte array to transform * @return String obtained by using the given encoding * @throws ZipException if the encoding cannot be recognized. */	TokenNameCOMMENT_JAVADOC	 Retrieve a String from the given bytes using the encoding set for this ZipFile. * @param bytes the byte array to transform @return String obtained by using the given encoding @throws ZipException if the encoding cannot be recognized. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
ZipException	TokenNameIdentifier	 Zip Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
getZipEncoding	TokenNameIdentifier	 get Zip Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"Failed to decode name: "	TokenNameStringLiteral	Failed to decode name: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks whether the archive starts with a LFH. If it doesn't, * it may be an empty archive. */	TokenNameCOMMENT_JAVADOC	 Checks whether the archive starts with a LFH. If it doesn't, it may be an empty archive. 
private	TokenNameprivate	
boolean	TokenNameboolean	
startsWithLocalFileHeader	TokenNameIdentifier	 starts With Local File Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
WORD	TokenNameIdentifier	 WORD
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
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
start	TokenNameIdentifier	 start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
.	TokenNameDOT	
LFH_SIG	TokenNameIdentifier	 LFH  SIG
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the entry has Unicode*ExtraFields and the CRCs of the * names/comments match those of the extra fields, transfer the * known Unicode values from the extra field. */	TokenNameCOMMENT_JAVADOC	 If the entry has Unicode*ExtraFields and the CRCs of the names/comments match those of the extra fields, transfer the known Unicode values from the extra field. 
private	TokenNameprivate	
void	TokenNamevoid	
setNameAndCommentFromExtraFields	TokenNameIdentifier	 set Name And Comment From Extra Fields
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
,	TokenNameCOMMA	
NameAndComment	TokenNameIdentifier	 Name And Comment
nc	TokenNameIdentifier	 nc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraField	TokenNameIdentifier	 get Extra Field
(	TokenNameLPAREN	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
.	TokenNameDOT	
UPATH_ID	TokenNameIdentifier	 UPATH  ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
originalName	TokenNameIdentifier	 original Name
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newName	TokenNameIdentifier	 new Name
=	TokenNameEQUAL	
getUnicodeStringIfOriginalMatches	TokenNameIdentifier	 get Unicode String If Original Matches
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
nc	TokenNameIdentifier	 nc
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newName	TokenNameIdentifier	 new Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
originalName	TokenNameIdentifier	 original Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
newName	TokenNameIdentifier	 new Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
newName	TokenNameIdentifier	 new Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nameMap	TokenNameIdentifier	 name Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
originalName	TokenNameIdentifier	 original Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nameMap	TokenNameIdentifier	 name Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
newName	TokenNameIdentifier	 new Name
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nc	TokenNameIdentifier	 nc
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nc	TokenNameIdentifier	 nc
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnicodeCommentExtraField	TokenNameIdentifier	 Unicode Comment Extra Field
cmt	TokenNameIdentifier	 cmt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnicodeCommentExtraField	TokenNameIdentifier	 Unicode Comment Extra Field
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraField	TokenNameIdentifier	 get Extra Field
(	TokenNameLPAREN	
UnicodeCommentExtraField	TokenNameIdentifier	 Unicode Comment Extra Field
.	TokenNameDOT	
UCOM_ID	TokenNameIdentifier	 UCOM  ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newComment	TokenNameIdentifier	 new Comment
=	TokenNameEQUAL	
getUnicodeStringIfOriginalMatches	TokenNameIdentifier	 get Unicode String If Original Matches
(	TokenNameLPAREN	
cmt	TokenNameIdentifier	 cmt
,	TokenNameCOMMA	
nc	TokenNameIdentifier	 nc
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newComment	TokenNameIdentifier	 new Comment
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
newComment	TokenNameIdentifier	 new Comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If the stored CRC matches the one of the given name, return the * Unicode name of the given field. * * <p>If the field is null or the CRCs don't match, return null * instead.</p> */	TokenNameCOMMENT_JAVADOC	 If the stored CRC matches the one of the given name, return the Unicode name of the given field. * <p>If the field is null or the CRCs don't match, return null instead.</p> 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getUnicodeStringIfOriginalMatches	TokenNameIdentifier	 get Unicode String If Original Matches
(	TokenNameLPAREN	
AbstractUnicodeExtraField	TokenNameIdentifier	 Abstract Unicode Extra Field
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
orig	TokenNameIdentifier	 orig
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CRC32	TokenNameIdentifier	 CR C32
crc32	TokenNameIdentifier	 crc32
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crc32	TokenNameIdentifier	 crc32
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
orig	TokenNameIdentifier	 orig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
origCRC32	TokenNameIdentifier	 orig CR C32
=	TokenNameEQUAL	
crc32	TokenNameIdentifier	 crc32
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
origCRC32	TokenNameIdentifier	 orig CR C32
==	TokenNameEQUAL_EQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getNameCRC32	TokenNameIdentifier	 get Name CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
UTF8_ZIP_ENCODING	TokenNameIdentifier	 UT F8  ZIP  ENCODING
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getUnicodeName	TokenNameIdentifier	 get Unicode Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// UTF-8 unsupported? should be impossible the 	TokenNameCOMMENT_LINE	UTF-8 unsupported? should be impossible the 
// Unicode*ExtraField must contain some bad bytes 	TokenNameCOMMENT_LINE	Unicode*ExtraField must contain some bad bytes 
// TODO log this anywhere? 	TokenNameCOMMENT_LINE	TODO log this anywhere? 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * InputStream that delegates requests to the underlying * RandomAccessFile, making sure that only bytes from a certain * range can be read. */	TokenNameCOMMENT_JAVADOC	 InputStream that delegates requests to the underlying RandomAccessFile, making sure that only bytes from a certain range can be read. 
private	TokenNameprivate	
class	TokenNameclass	
BoundedInputStream	TokenNameIdentifier	 Bounded Input Stream
extends	TokenNameextends	
InputStream	TokenNameIdentifier	 Input Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
remaining	TokenNameIdentifier	 remaining
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
loc	TokenNameIdentifier	 loc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
addDummyByte	TokenNameIdentifier	 add Dummy Byte
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
BoundedInputStream	TokenNameIdentifier	 Bounded Input Stream
(	TokenNameLPAREN	
long	TokenNamelong	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
long	TokenNamelong	
remaining	TokenNameIdentifier	 remaining
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
=	TokenNameEQUAL	
remaining	TokenNameIdentifier	 remaining
;	TokenNameSEMICOLON	
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
--	TokenNameMINUS_MINUS	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addDummyByte	TokenNameIdentifier	 add Dummy Byte
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addDummyByte	TokenNameIdentifier	 add Dummy Byte
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
archive	TokenNameIdentifier	 archive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addDummyByte	TokenNameIdentifier	 add Dummy Byte
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addDummyByte	TokenNameIdentifier	 add Dummy Byte
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
remaining	TokenNameIdentifier	 remaining
)	TokenNameRPAREN	
{	TokenNameLBRACE	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
remaining	TokenNameIdentifier	 remaining
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
archive	TokenNameIdentifier	 archive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loc	TokenNameIdentifier	 loc
+=	TokenNamePLUS_EQUAL	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
remaining	TokenNameIdentifier	 remaining
-=	TokenNameMINUS_EQUAL	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inflater needs an extra dummy byte for nowrap - see * Inflater's javadocs. */	TokenNameCOMMENT_JAVADOC	 Inflater needs an extra dummy byte for nowrap - see Inflater's javadocs. 
void	TokenNamevoid	
addDummy	TokenNameIdentifier	 add Dummy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addDummyByte	TokenNameIdentifier	 add Dummy Byte
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
NameAndComment	TokenNameIdentifier	 Name And Comment
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NameAndComment	TokenNameIdentifier	 Name And Comment
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
