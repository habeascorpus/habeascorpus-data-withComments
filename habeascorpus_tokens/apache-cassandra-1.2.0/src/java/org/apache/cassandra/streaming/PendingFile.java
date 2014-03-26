/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
TypeSizes	TokenNameIdentifier	 Type Sizes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
.	TokenNameDOT	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
Descriptor	TokenNameIdentifier	 Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
SSTableReader	TokenNameIdentifier	 SS Table Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
.	TokenNameDOT	
CompressionInfo	TokenNameIdentifier	 Compression Info
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
/** * Represents portions of a file to be streamed between nodes. */	TokenNameCOMMENT_JAVADOC	 Represents portions of a file to be streamed between nodes. 
public	TokenNamepublic	
class	TokenNameclass	
PendingFile	TokenNameIdentifier	 Pending File
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
PendingFileSerializer	TokenNameIdentifier	 Pending File Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
PendingFileSerializer	TokenNameIdentifier	 Pending File Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NB: this reference is used to be able to release the acquired reference upon completion 	TokenNameCOMMENT_LINE	NB: this reference is used to be able to release the acquired reference upon completion 
public	TokenNamepublic	
final	TokenNamefinal	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
component	TokenNameIdentifier	 component
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
sections	TokenNameIdentifier	 sections
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** total length of data to transfer */	TokenNameCOMMENT_JAVADOC	 total length of data to transfer 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
/** estimated number of keys to transfer */	TokenNameCOMMENT_JAVADOC	 estimated number of keys to transfer 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
estimatedKeys	TokenNameIdentifier	 estimated Keys
;	TokenNameSEMICOLON	
/** compression information. null if data is not compressed */	TokenNameCOMMENT_JAVADOC	 compression information. null if data is not compressed 
public	TokenNamepublic	
final	TokenNamefinal	
CompressionInfo	TokenNameIdentifier	 Compression Info
compressionInfo	TokenNameIdentifier	 compression Info
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
progress	TokenNameIdentifier	 progress
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PendingFile	TokenNameIdentifier	 Pending File
(	TokenNameLPAREN	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
PendingFile	TokenNameIdentifier	 Pending File
pf	TokenNameIdentifier	 pf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
component	TokenNameIdentifier	 component
,	TokenNameCOMMA	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
sections	TokenNameIdentifier	 sections
,	TokenNameCOMMA	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
estimatedKeys	TokenNameIdentifier	 estimated Keys
,	TokenNameCOMMA	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
compressionInfo	TokenNameIdentifier	 compression Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PendingFile	TokenNameIdentifier	 Pending File
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
component	TokenNameIdentifier	 component
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
sections	TokenNameIdentifier	 sections
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
component	TokenNameIdentifier	 component
,	TokenNameCOMMA	
sections	TokenNameIdentifier	 sections
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PendingFile	TokenNameIdentifier	 Pending File
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
component	TokenNameIdentifier	 component
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
sections	TokenNameIdentifier	 sections
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
long	TokenNamelong	
estimatedKeys	TokenNameIdentifier	 estimated Keys
,	TokenNameCOMMA	
CompressionInfo	TokenNameIdentifier	 Compression Info
compressionInfo	TokenNameIdentifier	 compression Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
component	TokenNameIdentifier	 component
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sections	TokenNameIdentifier	 sections
=	TokenNameEQUAL	
sections	TokenNameIdentifier	 sections
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
long	TokenNamelong	
tempSize	TokenNameIdentifier	 temp Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compressionInfo	TokenNameIdentifier	 compression Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
section	TokenNameIdentifier	 section
:	TokenNameCOLON	
sections	TokenNameIdentifier	 sections
)	TokenNameRPAREN	
tempSize	TokenNameIdentifier	 temp Size
+=	TokenNamePLUS_EQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
right	TokenNameIdentifier	 right
-	TokenNameMINUS	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// calculate total length of transferring chunks 	TokenNameCOMMENT_LINE	calculate total length of transferring chunks 
for	TokenNamefor	
(	TokenNameLPAREN	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
chunk	TokenNameIdentifier	 chunk
:	TokenNameCOLON	
compressionInfo	TokenNameIdentifier	 compression Info
.	TokenNameDOT	
chunks	TokenNameIdentifier	 chunks
)	TokenNameRPAREN	
tempSize	TokenNameIdentifier	 temp Size
+=	TokenNamePLUS_EQUAL	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 4 bytes for CRC 	TokenNameCOMMENT_LINE	4 bytes for CRC 
}	TokenNameRBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
tempSize	TokenNameIdentifier	 temp Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
estimatedKeys	TokenNameIdentifier	 estimated Keys
=	TokenNameEQUAL	
estimatedKeys	TokenNameIdentifier	 estimated Keys
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compressionInfo	TokenNameIdentifier	 compression Info
=	TokenNameEQUAL	
compressionInfo	TokenNameIdentifier	 compression Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
PendingFile	TokenNameIdentifier	 Pending File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
PendingFile	TokenNameIdentifier	 Pending File
rhs	TokenNameIdentifier	 rhs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PendingFile	TokenNameIdentifier	 Pending File
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" sections="	TokenNameStringLiteral	 sections=
+	TokenNamePLUS	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" progress="	TokenNameStringLiteral	 progress=
+	TokenNamePLUS	
progress	TokenNameIdentifier	 progress
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
progress	TokenNameIdentifier	 progress
*	TokenNameMULTIPLY	
100	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
"%"	TokenNameStringLiteral	%
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
PendingFileSerializer	TokenNameIdentifier	 Pending File Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
PendingFile	TokenNameIdentifier	 Pending File
sc	TokenNameIdentifier	 sc
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
section	TokenNameIdentifier	 section
:	TokenNameCOLON	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
sections	TokenNameIdentifier	 sections
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
estimatedKeys	TokenNameIdentifier	 estimated Keys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
>	TokenNameGREATER	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_11	TokenNameIdentifier	 VERSION 11
)	TokenNameRPAREN	
CompressionInfo	TokenNameIdentifier	 Compression Info
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
compressionInfo	TokenNameIdentifier	 compression Info
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PendingFile	TokenNameIdentifier	 Pending File
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
sections	TokenNameIdentifier	 sections
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this controls the way indexes are rebuilt when streaming in. 	TokenNameCOMMENT_LINE	this controls the way indexes are rebuilt when streaming in. 
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
RESTORE_REPLICA_COUNT	TokenNameIdentifier	 RESTORE  REPLICA  COUNT
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
estimatedKeys	TokenNameIdentifier	 estimated Keys
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompressionInfo	TokenNameIdentifier	 Compression Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
>	TokenNameGREATER	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_11	TokenNameIdentifier	 VERSION 11
)	TokenNameRPAREN	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
CompressionInfo	TokenNameIdentifier	 Compression Info
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
PendingFile	TokenNameIdentifier	 Pending File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
component	TokenNameIdentifier	 component
,	TokenNameCOMMA	
sections	TokenNameIdentifier	 sections
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
estimatedKeys	TokenNameIdentifier	 estimated Keys
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
PendingFile	TokenNameIdentifier	 Pending File
pf	TokenNameIdentifier	 pf
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pf	TokenNameIdentifier	 pf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
section	TokenNameIdentifier	 section
:	TokenNameCOLON	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
sections	TokenNameIdentifier	 sections
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
estimatedKeys	TokenNameIdentifier	 estimated Keys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
>	TokenNameGREATER	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_11	TokenNameIdentifier	 VERSION 11
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
CompressionInfo	TokenNameIdentifier	 Compression Info
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
compressionInfo	TokenNameIdentifier	 compression Info
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
