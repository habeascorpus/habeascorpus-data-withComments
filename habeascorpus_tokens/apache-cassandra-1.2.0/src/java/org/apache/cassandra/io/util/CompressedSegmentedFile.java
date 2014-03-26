/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
CompressedRandomAccessReader	TokenNameIdentifier	 Compressed Random Access Reader
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
public	TokenNamepublic	
class	TokenNameclass	
CompressedSegmentedFile	TokenNameIdentifier	 Compressed Segmented File
extends	TokenNameextends	
SegmentedFile	TokenNameIdentifier	 Segmented File
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompressedSegmentedFile	TokenNameIdentifier	 Compressed Segmented File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
dataLength	TokenNameIdentifier	 data Length
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
compressedFileLength	TokenNameIdentifier	 compressed File Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
=	TokenNameEQUAL	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Builder	TokenNameIdentifier	 Builder
extends	TokenNameextends	
SegmentedFile	TokenNameIdentifier	 Segmented File
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
{	TokenNameLBRACE	
/** * Adds a position that would be a safe place for a segment boundary in the file. For a block/row based file * format, safe boundaries are block/row edges. * @param boundary The absolute position of the potential boundary in the file. */	TokenNameCOMMENT_JAVADOC	 Adds a position that would be a safe place for a segment boundary in the file. For a block/row based file format, safe boundaries are block/row edges. @param boundary The absolute position of the potential boundary in the file. 
public	TokenNamepublic	
void	TokenNamevoid	
addPotentialBoundary	TokenNameIdentifier	 add Potential Boundary
(	TokenNameLPAREN	
long	TokenNamelong	
boundary	TokenNameIdentifier	 boundary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only one segment in a standard-io file 	TokenNameCOMMENT_LINE	only one segment in a standard-io file 
}	TokenNameRBRACE	
/** * Called after all potential boundaries have been added to apply this Builder to a concrete file on disk. * @param path The file on disk. */	TokenNameCOMMENT_JAVADOC	 Called after all potential boundaries have been added to apply this Builder to a concrete file on disk. @param path The file on disk. 
public	TokenNamepublic	
SegmentedFile	TokenNameIdentifier	 Segmented File
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompressedSegmentedFile	TokenNameIdentifier	 Compressed Segmented File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
FileDataInput	TokenNameIdentifier	 File Data Input
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
long	TokenNamelong	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
CompressedRandomAccessReader	TokenNameIdentifier	 Compressed Random Access Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
