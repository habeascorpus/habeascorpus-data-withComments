/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StringBufferPool.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StringBufferPool.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * This class pools string buffers, since they are reused so often. * String buffers are good candidates for pooling, because of * their supporting character arrays. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class pools string buffers, since they are reused so often. String buffers are good candidates for pooling, because of their supporting character arrays. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
StringBufferPool	TokenNameIdentifier	 String Buffer Pool
{	TokenNameLBRACE	
/** The global pool of string buffers. */	TokenNameCOMMENT_JAVADOC	 The global pool of string buffers. 
private	TokenNameprivate	
static	TokenNamestatic	
ObjectPool	TokenNameIdentifier	 Object Pool
m_stringBufPool	TokenNameIdentifier	 m string Buf Pool
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectPool	TokenNameIdentifier	 Object Pool
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the first free instance of a string buffer, or create one * if there are no free instances. * * @return A string buffer ready for use. */	TokenNameCOMMENT_JAVADOC	 Get the first free instance of a string buffer, or create one if there are no free instances. * @return A string buffer ready for use. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
static	TokenNamestatic	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
)	TokenNameRPAREN	
m_stringBufPool	TokenNameIdentifier	 m string Buf Pool
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a string buffer back to the pool. * * @param sb Must be a non-null reference to a string buffer. */	TokenNameCOMMENT_JAVADOC	 Return a string buffer back to the pool. * @param sb Must be a non-null reference to a string buffer. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
static	TokenNamestatic	
void	TokenNamevoid	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since this isn't synchronized, setLength must be 	TokenNameCOMMENT_LINE	Since this isn't synchronized, setLength must be 
// done before the instance is freed. 	TokenNameCOMMENT_LINE	done before the instance is freed. 
// Fix attributed to Peter Speck <speck@ruc.dk>. 	TokenNameCOMMENT_LINE	Fix attributed to Peter Speck <speck@ruc.dk>. 
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_stringBufPool	TokenNameIdentifier	 m string Buf Pool
.	TokenNameDOT	
freeInstance	TokenNameIdentifier	 free Instance
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
