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
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilterOutputStream	TokenNameIdentifier	 Filter Output Stream
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
OutputStream	TokenNameIdentifier	 Output Stream
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
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
LinkedList	TokenNameIdentifier	 Linked List
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
Deflater	TokenNameIdentifier	 Deflater
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
/** * Reimplementation of {@link java.util.zip.ZipOutputStream * java.util.zip.ZipOutputStream} that does handle the extended * functionality of this package, especially internal/external file * attributes and extra fields with different layouts for local file * data and central directory entries. * * <p>This class will try to use {@link java.io.RandomAccessFile * RandomAccessFile} when you know that the output is going to go to a * file.</p> * * <p>If RandomAccessFile cannot be used, this implementation will use * a Data Descriptor to store size and CRC information for {@link * #DEFLATED DEFLATED} entries, this means, you don't need to * calculate them yourself. Unfortunately this is not possible for * the {@link #STORED STORED} method, here setting the CRC and * uncompressed size information is required before {@link * #putNextEntry putNextEntry} can be called.</p> * */	TokenNameCOMMENT_JAVADOC	 Reimplementation of {@link java.util.zip.ZipOutputStream java.util.zip.ZipOutputStream} that does handle the extended functionality of this package, especially internal/external file attributes and extra fields with different layouts for local file data and central directory entries. * <p>This class will try to use {@link java.io.RandomAccessFile RandomAccessFile} when you know that the output is going to go to a file.</p> * <p>If RandomAccessFile cannot be used, this implementation will use a Data Descriptor to store size and CRC information for {@link #DEFLATED DEFLATED} entries, this means, you don't need to calculate them yourself. Unfortunately this is not possible for the {@link #STORED STORED} method, here setting the CRC and uncompressed size information is required before {@link #putNextEntry putNextEntry} can be called.</p> 
public	TokenNamepublic	
class	TokenNameclass	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
extends	TokenNameextends	
FilterOutputStream	TokenNameIdentifier	 Filter Output Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
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
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
512	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * Apparently Deflater.setInput gets slowed down a lot on Sun JVMs * when it gets handed a really big buffer. See * https://issues.apache.org/bugzilla/show_bug.cgi?id=45396 * * Using a buffer size of 8 kB proved to be a good compromise */	TokenNameCOMMENT_BLOCK	 Apparently Deflater.setInput gets slowed down a lot on Sun JVMs when it gets handed a really big buffer. See https://issues.apache.org/bugzilla/show_bug.cgi?id=45396 * Using a buffer size of 8 kB proved to be a good compromise 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFLATER_BLOCK_SIZE	TokenNameIdentifier	 DEFLATER  BLOCK  SIZE
=	TokenNameEQUAL	
8192	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Compression method for deflated entries. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Compression method for deflated entries. * @since 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFLATED	TokenNameIdentifier	 DEFLATED
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
.	TokenNameDOT	
DEFLATED	TokenNameIdentifier	 DEFLATED
;	TokenNameSEMICOLON	
/** * Default compression level for deflated entries. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Default compression level for deflated entries. * @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_COMPRESSION	TokenNameIdentifier	 DEFAULT  COMPRESSION
=	TokenNameEQUAL	
Deflater	TokenNameIdentifier	 Deflater
.	TokenNameDOT	
DEFAULT_COMPRESSION	TokenNameIdentifier	 DEFAULT  COMPRESSION
;	TokenNameSEMICOLON	
/** * Compression method for stored entries. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Compression method for stored entries. * @since 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STORED	TokenNameIdentifier	 STORED
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
.	TokenNameDOT	
STORED	TokenNameIdentifier	 STORED
;	TokenNameSEMICOLON	
/** * default encoding for file names and comment. */	TokenNameCOMMENT_JAVADOC	 default encoding for file names and comment. 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * General purpose flag, which indicates that filenames are * written in utf-8. */	TokenNameCOMMENT_JAVADOC	 General purpose flag, which indicates that filenames are written in utf-8. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UFT8_NAMES_FLAG	TokenNameIdentifier	 UF T8  NAMES  FLAG
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * General purpose flag, which indicates that filenames are * written in utf-8. * @deprecated use {@link #UFT8_NAMES_FLAG} instead */	TokenNameCOMMENT_JAVADOC	 General purpose flag, which indicates that filenames are written in utf-8. @deprecated use {@link #UFT8_NAMES_FLAG} instead 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EFS_FLAG	TokenNameIdentifier	 EFS  FLAG
=	TokenNameEQUAL	
UFT8_NAMES_FLAG	TokenNameIdentifier	 UF T8  NAMES  FLAG
;	TokenNameSEMICOLON	
/** * Current entry. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Current entry. * @since 1.1 
private	TokenNameprivate	
ZipEntry	TokenNameIdentifier	 Zip Entry
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
/** * The file comment. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 The file comment. * @since 1.1 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Compression level for next entry. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Compression level for next entry. * @since 1.1 
private	TokenNameprivate	
int	TokenNameint	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
DEFAULT_COMPRESSION	TokenNameIdentifier	 DEFAULT  COMPRESSION
;	TokenNameSEMICOLON	
/** * Has the compression level changed when compared to the last * entry? * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Has the compression level changed when compared to the last entry? * @since 1.5 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasCompressionLevelChanged	TokenNameIdentifier	 has Compression Level Changed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Default compression method for next entry. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Default compression method for next entry. * @since 1.1 
private	TokenNameprivate	
int	TokenNameint	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
.	TokenNameDOT	
DEFLATED	TokenNameIdentifier	 DEFLATED
;	TokenNameSEMICOLON	
/** * List of ZipEntries written so far. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 List of ZipEntries written so far. * @since 1.1 
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * CRC instance to avoid parsing DEFLATED data twice. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 CRC instance to avoid parsing DEFLATED data twice. * @since 1.1 
private	TokenNameprivate	
final	TokenNamefinal	
CRC32	TokenNameIdentifier	 CR C32
crc	TokenNameIdentifier	 crc
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Count the bytes written to out. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Count the bytes written to out. * @since 1.1 
private	TokenNameprivate	
long	TokenNamelong	
written	TokenNameIdentifier	 written
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Data for local header data * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Data for local header data * @since 1.1 
private	TokenNameprivate	
long	TokenNamelong	
dataStart	TokenNameIdentifier	 data Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Offset for CRC entry in the local file header data for the * current entry starts here. * * @since 1.15 */	TokenNameCOMMENT_JAVADOC	 Offset for CRC entry in the local file header data for the current entry starts here. * @since 1.15 
private	TokenNameprivate	
long	TokenNamelong	
localDataStart	TokenNameIdentifier	 local Data Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Start of central directory. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Start of central directory. * @since 1.1 
private	TokenNameprivate	
long	TokenNamelong	
cdOffset	TokenNameIdentifier	 cd Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Length of central directory. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Length of central directory. * @since 1.1 
private	TokenNameprivate	
long	TokenNamelong	
cdLength	TokenNameIdentifier	 cd Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Helper, a 0 as ZipShort. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Helper, a 0 as ZipShort. * @since 1.1 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ZERO	TokenNameIdentifier	 ZERO
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Helper, a 0 as ZipLong. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Helper, a 0 as ZipLong. * @since 1.1 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
LZERO	TokenNameIdentifier	 LZERO
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Holds the offsets of the LFH starts for each entry. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Holds the offsets of the LFH starts for each entry. * @since 1.1 
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The encoding to use for filenames and the file comment. * * <p>For a list of possible values see <a * href="http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html">http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html</a>. * Defaults to the platform's default character encoding.</p> * * @since 1.3 */	TokenNameCOMMENT_JAVADOC	 The encoding to use for filenames and the file comment. * <p>For a list of possible values see <a href="http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html">http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html</a>. Defaults to the platform's default character encoding.</p> * @since 1.3 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The zip encoding to use for filenames and the file comment. * * This field is of internal use and will be set in {@link * #setEncoding(String)}. */	TokenNameCOMMENT_JAVADOC	 The zip encoding to use for filenames and the file comment. * This field is of internal use and will be set in {@link #setEncoding(String)}. 
private	TokenNameprivate	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
zipEncoding	TokenNameIdentifier	 zip Encoding
=	TokenNameEQUAL	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
getZipEncoding	TokenNameIdentifier	 get Zip Encoding
(	TokenNameLPAREN	
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * This Deflater object is used for output. * * <p>This attribute is only protected to provide a level of API * backwards compatibility. This class used to extend {@link * java.util.zip.DeflaterOutputStream DeflaterOutputStream} up to * Revision 1.13.</p> * * @since 1.14 */	TokenNameCOMMENT_JAVADOC	 This Deflater object is used for output. * <p>This attribute is only protected to provide a level of API backwards compatibility. This class used to extend {@link java.util.zip.DeflaterOutputStream DeflaterOutputStream} up to Revision 1.13.</p> * @since 1.14 
protected	TokenNameprotected	
Deflater	TokenNameIdentifier	 Deflater
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
new	TokenNamenew	
Deflater	TokenNameIdentifier	 Deflater
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This buffer servers as a Deflater. * * <p>This attribute is only protected to provide a level of API * backwards compatibility. This class used to extend {@link * java.util.zip.DeflaterOutputStream DeflaterOutputStream} up to * Revision 1.13.</p> * * @since 1.14 */	TokenNameCOMMENT_JAVADOC	 This buffer servers as a Deflater. * <p>This attribute is only protected to provide a level of API backwards compatibility. This class used to extend {@link java.util.zip.DeflaterOutputStream DeflaterOutputStream} up to Revision 1.13.</p> * @since 1.14 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Optional random access output. * * @since 1.14 */	TokenNameCOMMENT_JAVADOC	 Optional random access output. * @since 1.14 
private	TokenNameprivate	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * whether to use the general purpose bit flag when writing UTF-8 * filenames or not. */	TokenNameCOMMENT_JAVADOC	 whether to use the general purpose bit flag when writing UTF-8 filenames or not. 
private	TokenNameprivate	
boolean	TokenNameboolean	
useUTF8Flag	TokenNameIdentifier	 use UT F8 Flag
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Whether to encode non-encodable file names as UTF-8. */	TokenNameCOMMENT_JAVADOC	 Whether to encode non-encodable file names as UTF-8. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fallbackToUTF8	TokenNameIdentifier	 fallback To UT F8
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * whether to create UnicodePathExtraField-s for each entry. */	TokenNameCOMMENT_JAVADOC	 whether to create UnicodePathExtraField-s for each entry. 
private	TokenNameprivate	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
createUnicodeExtraFields	TokenNameIdentifier	 create Unicode Extra Fields
=	TokenNameEQUAL	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
.	TokenNameDOT	
NEVER	TokenNameIdentifier	 NEVER
;	TokenNameSEMICOLON	
/** * Creates a new ZIP OutputStream filtering the underlying stream. * @param out the outputstream to zip * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Creates a new ZIP OutputStream filtering the underlying stream. @param out the outputstream to zip @since 1.1 
public	TokenNamepublic	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new ZIP OutputStream writing to a File. Will use * random access if possible. * @param file the file to zip to * @since 1.14 * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Creates a new ZIP OutputStream writing to a File. Will use random access if possible. @param file the file to zip to @since 1.14 @throws IOException on error 
public	TokenNamepublic	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
"rw"	TokenNameStringLiteral	rw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
inner	TokenNameIdentifier	 inner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
raf	TokenNameIdentifier	 raf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method indicates whether this archive is writing to a * seekable stream (i.e., to a random access file). * * <p>For seekable streams, you don't need to calculate the CRC or * uncompressed size for {@link #STORED} entries before * invoking {@link #putNextEntry}. * @return true if seekable * @since 1.17 */	TokenNameCOMMENT_JAVADOC	 This method indicates whether this archive is writing to a seekable stream (i.e., to a random access file). * <p>For seekable streams, you don't need to calculate the CRC or uncompressed size for {@link #STORED} entries before invoking {@link #putNextEntry}. @return true if seekable @since 1.17 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSeekable	TokenNameIdentifier	 is Seekable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
raf	TokenNameIdentifier	 raf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The encoding to use for filenames and the file comment. * * <p>For a list of possible values see <a * href="http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html">http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html</a>. * Defaults to the platform's default character encoding.</p> * @param encoding the encoding value * @since 1.3 */	TokenNameCOMMENT_JAVADOC	 The encoding to use for filenames and the file comment. * <p>For a list of possible values see <a href="http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html">http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html</a>. Defaults to the platform's default character encoding.</p> @param encoding the encoding value @since 1.3 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
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
useUTF8Flag	TokenNameIdentifier	 use UT F8 Flag
&=	TokenNameAND_EQUAL	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
isUTF8	TokenNameIdentifier	 is UT F8
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The encoding to use for filenames and the file comment. * * @return null if using the platform's default character encoding. * * @since 1.3 */	TokenNameCOMMENT_JAVADOC	 The encoding to use for filenames and the file comment. * @return null if using the platform's default character encoding. * @since 1.3 
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
/** * Whether to set the language encoding flag if the file name * encoding is UTF-8. * * <p>Defaults to true.</p> */	TokenNameCOMMENT_JAVADOC	 Whether to set the language encoding flag if the file name encoding is UTF-8. * <p>Defaults to true.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
setUseLanguageEncodingFlag	TokenNameIdentifier	 set Use Language Encoding Flag
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
useUTF8Flag	TokenNameIdentifier	 use UT F8 Flag
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
&&	TokenNameAND_AND	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
isUTF8	TokenNameIdentifier	 is UT F8
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to create Unicode Extra Fields. * * <p>Defaults to NEVER.</p> */	TokenNameCOMMENT_JAVADOC	 Whether to create Unicode Extra Fields. * <p>Defaults to NEVER.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
setCreateUnicodeExtraFields	TokenNameIdentifier	 set Create Unicode Extra Fields
(	TokenNameLPAREN	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createUnicodeExtraFields	TokenNameIdentifier	 create Unicode Extra Fields
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to fall back to UTF and the language encoding flag if * the file name cannot be encoded using the specified encoding. * * <p>Defaults to false.</p> */	TokenNameCOMMENT_JAVADOC	 Whether to fall back to UTF and the language encoding flag if the file name cannot be encoded using the specified encoding. * <p>Defaults to false.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
setFallbackToUTF8	TokenNameIdentifier	 set Fallback To UT F8
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fallbackToUTF8	TokenNameIdentifier	 fallback To UT F8
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finishs writing the contents and closes this as well as the * underlying stream. * * @since 1.1 * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Finishs writing the contents and closes this as well as the underlying stream. * @since 1.1 @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cdOffset	TokenNameIdentifier	 cd Offset
=	TokenNameEQUAL	
written	TokenNameIdentifier	 written
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
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
writeCentralFileHeader	TokenNameIdentifier	 write Central File Header
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cdLength	TokenNameIdentifier	 cd Length
=	TokenNameEQUAL	
written	TokenNameIdentifier	 written
-	TokenNameMINUS	
cdOffset	TokenNameIdentifier	 cd Offset
;	TokenNameSEMICOLON	
writeCentralDirectoryEnd	TokenNameIdentifier	 write Central Directory End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes all necessary data for this entry. * * @since 1.1 * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Writes all necessary data for this entry. * @since 1.1 @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
realCrc	TokenNameIdentifier	 real Crc
=	TokenNameEQUAL	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DEFLATED	TokenNameIdentifier	 DEFLATED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deflate	TokenNameIdentifier	 deflate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
adjustToLong	TokenNameIdentifier	 adjust To Long
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getTotalIn	TokenNameIdentifier	 get Total In
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setCompressedSize	TokenNameIdentifier	 set Compressed Size
(	TokenNameLPAREN	
adjustToLong	TokenNameIdentifier	 adjust To Long
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getTotalOut	TokenNameIdentifier	 get Total Out
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setCrc	TokenNameIdentifier	 set Crc
(	TokenNameLPAREN	
realCrc	TokenNameIdentifier	 real Crc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getCompressedSize	TokenNameIdentifier	 get Compressed Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getCrc	TokenNameIdentifier	 get Crc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
realCrc	TokenNameIdentifier	 real Crc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"bad CRC checksum for entry "	TokenNameStringLiteral	bad CRC checksum for entry 
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getCrc	TokenNameIdentifier	 get Crc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" instead of "	TokenNameStringLiteral	 instead of 
+	TokenNamePLUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
realCrc	TokenNameIdentifier	 real Crc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
written	TokenNameIdentifier	 written
-	TokenNameMINUS	
dataStart	TokenNameIdentifier	 data Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"bad size for entry "	TokenNameStringLiteral	bad size for entry 
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" instead of "	TokenNameStringLiteral	 instead of 
+	TokenNamePLUS	
(	TokenNameLPAREN	
written	TokenNameIdentifier	 written
-	TokenNameMINUS	
dataStart	TokenNameIdentifier	 data Start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* method is STORED and we used RandomAccessFile */	TokenNameCOMMENT_BLOCK	 method is STORED and we used RandomAccessFile 
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
written	TokenNameIdentifier	 written
-	TokenNameMINUS	
dataStart	TokenNameIdentifier	 data Start
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setCompressedSize	TokenNameIdentifier	 set Compressed Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setCrc	TokenNameIdentifier	 set Crc
(	TokenNameLPAREN	
realCrc	TokenNameIdentifier	 real Crc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If random access output, write the local file header containing 	TokenNameCOMMENT_LINE	If random access output, write the local file header containing 
// the correct CRC and compressed/uncompressed sizes 	TokenNameCOMMENT_LINE	the correct CRC and compressed/uncompressed sizes 
if	TokenNameif	
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
save	TokenNameIdentifier	 save
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
localDataStart	TokenNameIdentifier	 local Data Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getCrc	TokenNameIdentifier	 get Crc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getCompressedSize	TokenNameIdentifier	 get Compressed Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
save	TokenNameIdentifier	 save
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeDataDescriptor	TokenNameIdentifier	 write Data Descriptor
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Begin writing next entry. * @param ze the entry to write * @since 1.1 * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Begin writing next entry. @param ze the entry to write @since 1.1 @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
putNextEntry	TokenNameIdentifier	 put Next Entry
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not specified 	TokenNameCOMMENT_LINE	not specified 
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not specified 	TokenNameCOMMENT_LINE	not specified 
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Size/CRC not required if RandomAccessFile is used 	TokenNameCOMMENT_LINE	Size/CRC not required if RandomAccessFile is used 
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
STORED	TokenNameIdentifier	 STORED
&&	TokenNameAND_AND	
raf	TokenNameIdentifier	 raf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"uncompressed size is required for"	TokenNameStringLiteral	uncompressed size is required for
+	TokenNamePLUS	
" STORED method when not writing to a"	TokenNameStringLiteral	 STORED method when not writing to a
+	TokenNamePLUS	
" file"	TokenNameStringLiteral	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getCrc	TokenNameIdentifier	 get Crc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"crc checksum is required for STORED"	TokenNameStringLiteral	crc checksum is required for STORED
+	TokenNamePLUS	
" method when not writing to a file"	TokenNameStringLiteral	 method when not writing to a file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setCompressedSize	TokenNameIdentifier	 set Compressed Size
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DEFLATED	TokenNameIdentifier	 DEFLATED
&&	TokenNameAND_AND	
hasCompressionLevelChanged	TokenNameIdentifier	 has Compression Level Changed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasCompressionLevelChanged	TokenNameIdentifier	 has Compression Level Changed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeLocalFileHeader	TokenNameIdentifier	 write Local File Header
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the file comment. * @param comment the comment * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Set the file comment. @param comment the comment @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the compression level for subsequent entries. * * <p>Default is Deflater.DEFAULT_COMPRESSION.</p> * @param level the compression level. * @throws IllegalArgumentException if an invalid compression * level is specified. * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Sets the compression level for subsequent entries. * <p>Default is Deflater.DEFAULT_COMPRESSION.</p> @param level the compression level. @throws IllegalArgumentException if an invalid compression level is specified. @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
<	TokenNameLESS	
Deflater	TokenNameIdentifier	 Deflater
.	TokenNameDOT	
DEFAULT_COMPRESSION	TokenNameIdentifier	 DEFAULT  COMPRESSION
||	TokenNameOR_OR	
level	TokenNameIdentifier	 level
>	TokenNameGREATER	
Deflater	TokenNameIdentifier	 Deflater
.	TokenNameDOT	
BEST_COMPRESSION	TokenNameIdentifier	 BEST  COMPRESSION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid compression level: "	TokenNameStringLiteral	Invalid compression level: 
+	TokenNamePLUS	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasCompressionLevelChanged	TokenNameIdentifier	 has Compression Level Changed
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
!=	TokenNameNOT_EQUAL	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the default compression method for subsequent entries. * * <p>Default is DEFLATED.</p> * @param method an <code>int</code> from java.util.zip.ZipEntry * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Sets the default compression method for subsequent entries. * <p>Default is DEFLATED.</p> @param method an <code>int</code> from java.util.zip.ZipEntry @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
int	TokenNameint	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes bytes to ZIP entry. * @param b the byte array to write * @param offset the start position to write from * @param length the number of bytes to write * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Writes bytes to ZIP entry. @param b the byte array to write @param offset the start position to write from @param length the number of bytes to write @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DEFLATED	TokenNameIdentifier	 DEFLATED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
DEFLATER_BLOCK_SIZE	TokenNameIdentifier	 DEFLATER  BLOCK  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deflateUntilInputIsNeeded	TokenNameIdentifier	 deflate Until Input Is Needed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
fullblocks	TokenNameIdentifier	 fullblocks
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
/	TokenNameDIVIDE	
DEFLATER_BLOCK_SIZE	TokenNameIdentifier	 DEFLATER  BLOCK  SIZE
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
fullblocks	TokenNameIdentifier	 fullblocks
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
DEFLATER_BLOCK_SIZE	TokenNameIdentifier	 DEFLATER  BLOCK  SIZE
,	TokenNameCOMMA	
DEFLATER_BLOCK_SIZE	TokenNameIdentifier	 DEFLATER  BLOCK  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deflateUntilInputIsNeeded	TokenNameIdentifier	 deflate Until Input Is Needed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
fullblocks	TokenNameIdentifier	 fullblocks
*	TokenNameMULTIPLY	
DEFLATER_BLOCK_SIZE	TokenNameIdentifier	 DEFLATER  BLOCK  SIZE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
done	TokenNameIdentifier	 done
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
done	TokenNameIdentifier	 done
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deflateUntilInputIsNeeded	TokenNameIdentifier	 deflate Until Input Is Needed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes a single byte to ZIP entry. * * <p>Delegates to the three arg method.</p> * @param b the byte to write * @since 1.14 * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Writes a single byte to ZIP entry. * <p>Delegates to the three arg method.</p> @param b the byte to write @since 1.14 @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buff	TokenNameIdentifier	 buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes this output stream and releases any system resources * associated with the stream. * * @exception IOException if an I/O error occurs. * @since 1.14 */	TokenNameCOMMENT_JAVADOC	 Closes this output stream and releases any system resources associated with the stream. * @exception IOException if an I/O error occurs. @since 1.14 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Flushes this output stream and forces any buffered output bytes * to be written out to the stream. * * @exception IOException if an I/O error occurs. * @since 1.14 */	TokenNameCOMMENT_JAVADOC	 Flushes this output stream and forces any buffered output bytes to be written out to the stream. * @exception IOException if an I/O error occurs. @since 1.14 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Various ZIP constants */	TokenNameCOMMENT_BLOCK	 Various ZIP constants 
/** * local file header signature * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 local file header signature * @since 1.1 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
LFH_SIG	TokenNameIdentifier	 LFH  SIG
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
0X04034B50L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * data descriptor signature * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 data descriptor signature * @since 1.1 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DD_SIG	TokenNameIdentifier	 DD  SIG
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
0X08074B50L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * central file header signature * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 central file header signature * @since 1.1 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
CFH_SIG	TokenNameIdentifier	 CFH  SIG
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
0X02014B50L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * end of central dir signature * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 end of central dir signature * @since 1.1 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EOCD_SIG	TokenNameIdentifier	 EOCD  SIG
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
0X06054B50L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Writes next block of compressed data to the output stream. * @throws IOException on error * * @since 1.14 */	TokenNameCOMMENT_JAVADOC	 Writes next block of compressed data to the output stream. @throws IOException on error * @since 1.14 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
deflate	TokenNameIdentifier	 deflate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
deflate	TokenNameIdentifier	 deflate
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Writes the local file header entry * @param ze the entry to write * @throws IOException on error * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Writes the local file header entry @param ze the entry to write @throws IOException on error * @since 1.1 
protected	TokenNameprotected	
void	TokenNamevoid	
writeLocalFileHeader	TokenNameIdentifier	 write Local File Header
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
encodable	TokenNameIdentifier	 encodable
=	TokenNameEQUAL	
zipEncoding	TokenNameIdentifier	 zip Encoding
.	TokenNameDOT	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
entryEncoding	TokenNameIdentifier	 entry Encoding
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
encodable	TokenNameIdentifier	 encodable
&&	TokenNameAND_AND	
fallbackToUTF8	TokenNameIdentifier	 fallback To UT F8
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entryEncoding	TokenNameIdentifier	 entry Encoding
=	TokenNameEQUAL	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
UTF8_ZIP_ENCODING	TokenNameIdentifier	 UT F8  ZIP  ENCODING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
entryEncoding	TokenNameIdentifier	 entry Encoding
=	TokenNameEQUAL	
zipEncoding	TokenNameIdentifier	 zip Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
entryEncoding	TokenNameIdentifier	 entry Encoding
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
createUnicodeExtraFields	TokenNameIdentifier	 create Unicode Extra Fields
!=	TokenNameNOT_EQUAL	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
.	TokenNameDOT	
NEVER	TokenNameIdentifier	 NEVER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
createUnicodeExtraFields	TokenNameIdentifier	 create Unicode Extra Fields
==	TokenNameEQUAL_EQUAL	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
.	TokenNameDOT	
ALWAYS	TokenNameIdentifier	 ALWAYS
||	TokenNameOR_OR	
!	TokenNameNOT	
encodable	TokenNameIdentifier	 encodable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
addExtraField	TokenNameIdentifier	 add Extra Field
(	TokenNameLPAREN	
new	TokenNamenew	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
comm	TokenNameIdentifier	 comm
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comm	TokenNameIdentifier	 comm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
comm	TokenNameIdentifier	 comm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
commentEncodable	TokenNameIdentifier	 comment Encodable
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
zipEncoding	TokenNameIdentifier	 zip Encoding
.	TokenNameDOT	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
comm	TokenNameIdentifier	 comm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
createUnicodeExtraFields	TokenNameIdentifier	 create Unicode Extra Fields
==	TokenNameEQUAL_EQUAL	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
.	TokenNameDOT	
ALWAYS	TokenNameIdentifier	 ALWAYS
||	TokenNameOR_OR	
!	TokenNameNOT	
commentEncodable	TokenNameIdentifier	 comment Encodable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
commentB	TokenNameIdentifier	 comment B
=	TokenNameEQUAL	
entryEncoding	TokenNameIdentifier	 entry Encoding
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
comm	TokenNameIdentifier	 comm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
addExtraField	TokenNameIdentifier	 add Extra Field
(	TokenNameLPAREN	
new	TokenNamenew	
UnicodeCommentExtraField	TokenNameIdentifier	 Unicode Comment Extra Field
(	TokenNameLPAREN	
comm	TokenNameIdentifier	 comm
,	TokenNameCOMMA	
commentB	TokenNameIdentifier	 comment B
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
commentB	TokenNameIdentifier	 comment B
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
commentB	TokenNameIdentifier	 comment B
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
,	TokenNameCOMMA	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
written	TokenNameIdentifier	 written
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
LFH_SIG	TokenNameIdentifier	 LFH  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
//store method in local variable to prevent multiple method calls 	TokenNameCOMMENT_LINE	store method in local variable to prevent multiple method calls 
final	TokenNamefinal	
int	TokenNameint	
zipMethod	TokenNameIdentifier	 zip Method
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeVersionNeededToExtractAndGeneralPurposeBits	TokenNameIdentifier	 write Version Needed To Extract And General Purpose Bits
(	TokenNameLPAREN	
zipMethod	TokenNameIdentifier	 zip Method
,	TokenNameCOMMA	
!	TokenNameNOT	
encodable	TokenNameIdentifier	 encodable
&&	TokenNameAND_AND	
fallbackToUTF8	TokenNameIdentifier	 fallback To UT F8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
// compression method 	TokenNameCOMMENT_LINE	compression method 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
zipMethod	TokenNameIdentifier	 zip Method
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// last mod. time and date 	TokenNameCOMMENT_LINE	last mod. time and date 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
toDosTime	TokenNameIdentifier	 to Dos Time
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
// CRC 	TokenNameCOMMENT_LINE	CRC 
// compressed length 	TokenNameCOMMENT_LINE	compressed length 
// uncompressed length 	TokenNameCOMMENT_LINE	uncompressed length 
localDataStart	TokenNameIdentifier	 local Data Start
=	TokenNameEQUAL	
written	TokenNameIdentifier	 written
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
zipMethod	TokenNameIdentifier	 zip Method
==	TokenNameEQUAL_EQUAL	
DEFLATED	TokenNameIdentifier	 DEFLATED
||	TokenNameOR_OR	
raf	TokenNameIdentifier	 raf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
LZERO	TokenNameIdentifier	 LZERO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
LZERO	TokenNameIdentifier	 LZERO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
LZERO	TokenNameIdentifier	 LZERO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getCrc	TokenNameIdentifier	 get Crc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
// file name length 	TokenNameCOMMENT_LINE	file name length 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// extra field length 	TokenNameCOMMENT_LINE	extra field length 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getLocalFileDataExtra	TokenNameIdentifier	 get Local File Data Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
extra	TokenNameIdentifier	 extra
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// file name 	TokenNameCOMMENT_LINE	file name 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// extra field 	TokenNameCOMMENT_LINE	extra field 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
extra	TokenNameIdentifier	 extra
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
extra	TokenNameIdentifier	 extra
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
dataStart	TokenNameIdentifier	 data Start
=	TokenNameEQUAL	
written	TokenNameIdentifier	 written
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the data descriptor entry. * @param ze the entry to write * @throws IOException on error * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Writes the data descriptor entry. @param ze the entry to write @throws IOException on error * @since 1.1 
protected	TokenNameprotected	
void	TokenNamevoid	
writeDataDescriptor	TokenNameIdentifier	 write Data Descriptor
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DEFLATED	TokenNameIdentifier	 DEFLATED
||	TokenNameOR_OR	
raf	TokenNameIdentifier	 raf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
DD_SIG	TokenNameIdentifier	 DD  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getCrc	TokenNameIdentifier	 get Crc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getCompressedSize	TokenNameIdentifier	 get Compressed Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
}	TokenNameRBRACE	
/** * Writes the central file header entry. * @param ze the entry to write * @throws IOException on error * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Writes the central file header entry. @param ze the entry to write @throws IOException on error * @since 1.1 
protected	TokenNameprotected	
void	TokenNamevoid	
writeCentralFileHeader	TokenNameIdentifier	 write Central File Header
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
CFH_SIG	TokenNameIdentifier	 CFH  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
// version made by 	TokenNameCOMMENT_LINE	version made by 
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getPlatform	TokenNameIdentifier	 get Platform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
zipMethod	TokenNameIdentifier	 zip Method
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
encodable	TokenNameIdentifier	 encodable
=	TokenNameEQUAL	
zipEncoding	TokenNameIdentifier	 zip Encoding
.	TokenNameDOT	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeVersionNeededToExtractAndGeneralPurposeBits	TokenNameIdentifier	 write Version Needed To Extract And General Purpose Bits
(	TokenNameLPAREN	
zipMethod	TokenNameIdentifier	 zip Method
,	TokenNameCOMMA	
!	TokenNameNOT	
encodable	TokenNameIdentifier	 encodable
&&	TokenNameAND_AND	
fallbackToUTF8	TokenNameIdentifier	 fallback To UT F8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
// compression method 	TokenNameCOMMENT_LINE	compression method 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
zipMethod	TokenNameIdentifier	 zip Method
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// last mod. time and date 	TokenNameCOMMENT_LINE	last mod. time and date 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
toDosTime	TokenNameIdentifier	 to Dos Time
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
// CRC 	TokenNameCOMMENT_LINE	CRC 
// compressed length 	TokenNameCOMMENT_LINE	compressed length 
// uncompressed length 	TokenNameCOMMENT_LINE	uncompressed length 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getCrc	TokenNameIdentifier	 get Crc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getCompressedSize	TokenNameIdentifier	 get Compressed Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
// file name length 	TokenNameCOMMENT_LINE	file name length 
final	TokenNamefinal	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
entryEncoding	TokenNameIdentifier	 entry Encoding
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
encodable	TokenNameIdentifier	 encodable
&&	TokenNameAND_AND	
fallbackToUTF8	TokenNameIdentifier	 fallback To UT F8
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entryEncoding	TokenNameIdentifier	 entry Encoding
=	TokenNameEQUAL	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
UTF8_ZIP_ENCODING	TokenNameIdentifier	 UT F8  ZIP  ENCODING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
entryEncoding	TokenNameIdentifier	 entry Encoding
=	TokenNameEQUAL	
zipEncoding	TokenNameIdentifier	 zip Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
entryEncoding	TokenNameIdentifier	 entry Encoding
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// extra field length 	TokenNameCOMMENT_LINE	extra field length 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getCentralDirectoryExtra	TokenNameIdentifier	 get Central Directory Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
extra	TokenNameIdentifier	 extra
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// file comment length 	TokenNameCOMMENT_LINE	file comment length 
String	TokenNameIdentifier	 String
comm	TokenNameIdentifier	 comm
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comm	TokenNameIdentifier	 comm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comm	TokenNameIdentifier	 comm
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
commentB	TokenNameIdentifier	 comment B
=	TokenNameEQUAL	
entryEncoding	TokenNameIdentifier	 entry Encoding
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
comm	TokenNameIdentifier	 comm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
commentB	TokenNameIdentifier	 comment B
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// disk number start 	TokenNameCOMMENT_LINE	disk number start 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// internal file attributes 	TokenNameCOMMENT_LINE	internal file attributes 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getInternalAttributes	TokenNameIdentifier	 get Internal Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
SHORT	TokenNameIdentifier	 SHORT
;	TokenNameSEMICOLON	
// external file attributes 	TokenNameCOMMENT_LINE	external file attributes 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
// relative offset of LFH 	TokenNameCOMMENT_LINE	relative offset of LFH 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
// file name 	TokenNameCOMMENT_LINE	file name 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// extra field 	TokenNameCOMMENT_LINE	extra field 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
extra	TokenNameIdentifier	 extra
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
extra	TokenNameIdentifier	 extra
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// file comment 	TokenNameCOMMENT_LINE	file comment 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
commentB	TokenNameIdentifier	 comment B
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
commentB	TokenNameIdentifier	 comment B
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
commentB	TokenNameIdentifier	 comment B
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
commentB	TokenNameIdentifier	 comment B
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the &quot;End of central dir record&quot;. * @throws IOException on error * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Writes the &quot;End of central dir record&quot;. @throws IOException on error * @since 1.1 
protected	TokenNameprotected	
void	TokenNamevoid	
writeCentralDirectoryEnd	TokenNameIdentifier	 write Central Directory End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
EOCD_SIG	TokenNameIdentifier	 EOCD  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// disk numbers 	TokenNameCOMMENT_LINE	disk numbers 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// number of entries 	TokenNameCOMMENT_LINE	number of entries 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// length and location of CD 	TokenNameCOMMENT_LINE	length and location of CD 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
cdLength	TokenNameIdentifier	 cd Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
cdOffset	TokenNameIdentifier	 cd Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ZIP file comment 	TokenNameCOMMENT_LINE	ZIP file comment 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
zipEncoding	TokenNameIdentifier	 zip Encoding
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Smallest date/time ZIP can handle. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Smallest date/time ZIP can handle. * @since 1.1 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DOS_TIME_MIN	TokenNameIdentifier	 DOS  TIME  MIN
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
0x00002100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convert a Date object to a DOS date/time field. * @param time the <code>Date</code> to convert * @return the date as a <code>ZipLong</code> * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Convert a Date object to a DOS date/time field. @param time the <code>Date</code> to convert @return the date as a <code>ZipLong</code> @since 1.1 
protected	TokenNameprotected	
static	TokenNamestatic	
ZipLong	TokenNameIdentifier	 Zip Long
toDosTime	TokenNameIdentifier	 to Dos Time
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ZipLong	TokenNameIdentifier	 Zip Long
(	TokenNameLPAREN	
toDosTime	TokenNameIdentifier	 to Dos Time
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a Date object to a DOS date/time field. * * <p>Stolen from InfoZip's <code>fileio.c</code></p> * @param t number of milliseconds since the epoch * @return the date as a byte array * @since 1.26 */	TokenNameCOMMENT_JAVADOC	 Convert a Date object to a DOS date/time field. * <p>Stolen from InfoZip's <code>fileio.c</code></p> @param t number of milliseconds since the epoch @return the date as a byte array @since 1.26 
protected	TokenNameprotected	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toDosTime	TokenNameIdentifier	 to Dos Time
(	TokenNameLPAREN	
long	TokenNamelong	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Date	TokenNameIdentifier	 Date
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumberCheck OFF - I do not think that using constants 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumberCheck OFF - I do not think that using constants 
// here will improve the readablity 	TokenNameCOMMENT_LINE	here will improve the readablity 
int	TokenNameint	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
getYear	TokenNameIdentifier	 get Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1900	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
<	TokenNameLESS	
1980	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DOS_TIME_MIN	TokenNameIdentifier	 DOS  TIME  MIN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
-	TokenNameMINUS	
1980	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
25	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
<<	TokenNameLEFT_SHIFT	
21	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
getHours	TokenNameIdentifier	 get Hours
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
getMinutes	TokenNameIdentifier	 get Minutes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
getSeconds	TokenNameIdentifier	 get Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumberCheck ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumberCheck ON 
}	TokenNameRBRACE	
/** * Retrieve the bytes for the given String in the encoding set for * this Stream. * @param name the string to get bytes from * @return the bytes as a byte array * @throws ZipException on error * * @since 1.3 */	TokenNameCOMMENT_JAVADOC	 Retrieve the bytes for the given String in the encoding set for this Stream. @param name the string to get bytes from @return the bytes as a byte array @throws ZipException on error * @since 1.3 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ZipException	TokenNameIdentifier	 Zip Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
getZipEncoding	TokenNameIdentifier	 get Zip Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
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
"Failed to encode name: "	TokenNameStringLiteral	Failed to encode name: 
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
/** * Write bytes to output or random access file. * @param data the byte array to write * @throws IOException on error * * @since 1.14 */	TokenNameCOMMENT_JAVADOC	 Write bytes to output or random access file. @param data the byte array to write @throws IOException on error * @since 1.14 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write bytes to output or random access file. * @param data the byte array to write * @param offset the start position to write from * @param length the number of bytes to write * @throws IOException on error * * @since 1.14 */	TokenNameCOMMENT_JAVADOC	 Write bytes to output or random access file. @param data the byte array to write @param offset the start position to write from @param length the number of bytes to write @throws IOException on error * @since 1.14 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Assumes a negative integer really is a positive integer that * has wrapped around and re-creates the original value. * @param i the value to treat as unsigned int. * @return the unsigned int as a long. * @since 1.34 */	TokenNameCOMMENT_JAVADOC	 Assumes a negative integer really is a positive integer that has wrapped around and re-creates the original value. @param i the value to treat as unsigned int. @return the unsigned int as a long. @since 1.34 
protected	TokenNameprotected	
static	TokenNamestatic	
long	TokenNamelong	
adjustToLong	TokenNameIdentifier	 adjust To Long
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
deflateUntilInputIsNeeded	TokenNameIdentifier	 deflate Until Input Is Needed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
needsInput	TokenNameIdentifier	 needs Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deflate	TokenNameIdentifier	 deflate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
writeVersionNeededToExtractAndGeneralPurposeBits	TokenNameIdentifier	 write Version Needed To Extract And General Purpose Bits
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
zipMethod	TokenNameIdentifier	 zip Method
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
utfFallback	TokenNameIdentifier	 utf Fallback
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
int	TokenNameint	
versionNeededToExtract	TokenNameIdentifier	 version Needed To Extract
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
generalPurposeFlag	TokenNameIdentifier	 general Purpose Flag
=	TokenNameEQUAL	
(	TokenNameLPAREN	
useUTF8Flag	TokenNameIdentifier	 use UT F8 Flag
||	TokenNameOR_OR	
utfFallback	TokenNameIdentifier	 utf Fallback
)	TokenNameRPAREN	
?	TokenNameQUESTION	
UFT8_NAMES_FLAG	TokenNameIdentifier	 UF T8  NAMES  FLAG
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
zipMethod	TokenNameIdentifier	 zip Method
==	TokenNameEQUAL_EQUAL	
DEFLATED	TokenNameIdentifier	 DEFLATED
&&	TokenNameAND_AND	
raf	TokenNameIdentifier	 raf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// requires version 2 as we are going to store length info 	TokenNameCOMMENT_LINE	requires version 2 as we are going to store length info 
// in the data descriptor 	TokenNameCOMMENT_LINE	in the data descriptor 
versionNeededToExtract	TokenNameIdentifier	 version Needed To Extract
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// bit3 set to signal, we use a data descriptor 	TokenNameCOMMENT_LINE	bit3 set to signal, we use a data descriptor 
generalPurposeFlag	TokenNameIdentifier	 general Purpose Flag
|=	TokenNameOR_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
// version needed to extract 	TokenNameCOMMENT_LINE	version needed to extract 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
versionNeededToExtract	TokenNameIdentifier	 version Needed To Extract
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// general purpose bit flag 	TokenNameCOMMENT_LINE	general purpose bit flag 
writeOut	TokenNameIdentifier	 write Out
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
generalPurposeFlag	TokenNameIdentifier	 general Purpose Flag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * enum that represents the possible policies for creating Unicode * extra fields. */	TokenNameCOMMENT_JAVADOC	 enum that represents the possible policies for creating Unicode extra fields. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
{	TokenNameLBRACE	
/** * Always create Unicode extra fields. */	TokenNameCOMMENT_JAVADOC	 Always create Unicode extra fields. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
ALWAYS	TokenNameIdentifier	 ALWAYS
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
(	TokenNameLPAREN	
"always"	TokenNameStringLiteral	always
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Never create Unicode extra fields. */	TokenNameCOMMENT_JAVADOC	 Never create Unicode extra fields. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
NEVER	TokenNameIdentifier	 NEVER
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
(	TokenNameLPAREN	
"never"	TokenNameStringLiteral	never
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create Unicode extra fields for filenames that cannot be * encoded using the specified encoding. */	TokenNameCOMMENT_JAVADOC	 Create Unicode extra fields for filenames that cannot be encoded using the specified encoding. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
NOT_ENCODEABLE	TokenNameIdentifier	 NOT  ENCODEABLE
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
(	TokenNameLPAREN	
"not encodeable"	TokenNameStringLiteral	not encodeable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
