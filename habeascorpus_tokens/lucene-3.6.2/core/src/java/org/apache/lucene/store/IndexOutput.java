package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
/** Abstract base class for output to a file in a Directory. A random-access * output stream. Used for all Lucene index output operations. * @see Directory * @see IndexInput */	TokenNameCOMMENT_JAVADOC	 Abstract base class for output to a file in a Directory. A random-access output stream. Used for all Lucene index output operations. @see Directory @see IndexInput 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
IndexOutput	TokenNameIdentifier	 Index Output
extends	TokenNameextends	
DataOutput	TokenNameIdentifier	 Data Output
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
/** Forces any buffered output to be written. */	TokenNameCOMMENT_JAVADOC	 Forces any buffered output to be written. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Closes this stream to further operations. */	TokenNameCOMMENT_JAVADOC	 Closes this stream to further operations. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns the current position in this file, where the next write will * occur. * @see #seek(long) */	TokenNameCOMMENT_JAVADOC	 Returns the current position in this file, where the next write will occur. @see #seek(long) 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Sets current position in this file, where the next write will occur. * @see #getFilePointer() */	TokenNameCOMMENT_JAVADOC	 Sets current position in this file, where the next write will occur. @see #getFilePointer() 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** The number of bytes in the file. */	TokenNameCOMMENT_JAVADOC	 The number of bytes in the file. 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Set the file length. By default, this method does * nothing (it's optional for a Directory to implement * it). But, certain Directory implementations (for * example @see FSDirectory) can use this to inform the * underlying IO system to pre-allocate the file to the * specified size. If the length is longer than the * current file length, the bytes added to the file are * undefined. Otherwise the file is truncated. * @param length file length */	TokenNameCOMMENT_JAVADOC	 Set the file length. By default, this method does nothing (it's optional for a Directory to implement it). But, certain Directory implementations (for example @see FSDirectory) can use this to inform the underlying IO system to pre-allocate the file to the specified size. If the length is longer than the current file length, the bytes added to the file are undefined. Otherwise the file is truncated. @param length file length 
public	TokenNamepublic	
void	TokenNamevoid	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
long	TokenNamelong	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
