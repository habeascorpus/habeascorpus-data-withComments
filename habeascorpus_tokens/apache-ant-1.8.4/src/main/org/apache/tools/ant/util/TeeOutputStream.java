/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * A simple T-piece to replicate an output stream into two separate streams * */	TokenNameCOMMENT_JAVADOC	 A simple T-piece to replicate an output stream into two separate streams 
public	TokenNamepublic	
class	TokenNameclass	
TeeOutputStream	TokenNameIdentifier	 Tee Output Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
/** * Constructor for TeeOutputStream. * @param left one of the output streams. * @param right the other output stream. */	TokenNameCOMMENT_JAVADOC	 Constructor for TeeOutputStream. @param left one of the output streams. @param right the other output stream. 
public	TokenNamepublic	
TeeOutputStream	TokenNameIdentifier	 Tee Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close both output streams. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Close both output streams. @throws IOException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Flush both output streams. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Flush both output streams. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a byte array to both output streams. * @param b an array of bytes. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Write a byte array to both output streams. @param b an array of bytes. @throws IOException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a byte array to both output streams. * @param b the data. * @param off the start offset in the data. * @param len the number of bytes to write. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Write a byte array to both output streams. @param b the data. @param off the start offset in the data. @param len the number of bytes to write. @throws IOException on error. 
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
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a byte to both output streams. * @param b the byte to write. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Write a byte to both output streams. @param b the byte to write. @throws IOException on error. 
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
left	TokenNameIdentifier	 left
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
