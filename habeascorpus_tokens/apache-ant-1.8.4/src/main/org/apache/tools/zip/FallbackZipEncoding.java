/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
/** * A fallback ZipEncoding, which uses a java.io means to encode names. * * <p>This implementation is not favorable for encodings other than * utf-8, because java.io encodes unmappable character as question * marks leading to unreadable ZIP entries on some operating * systems.</p> * * <p>Furthermore this implementation is unable to tell, whether a * given name can be safely encoded or not.</p> * * <p>This implementation acts as a last resort implementation, when * neither {@link Simple8BitZipEnoding} nor {@link NioZipEncoding} is * available.</p> * * <p>The methods of this class are reentrant.</p> */	TokenNameCOMMENT_JAVADOC	 A fallback ZipEncoding, which uses a java.io means to encode names. * <p>This implementation is not favorable for encodings other than utf-8, because java.io encodes unmappable character as question marks leading to unreadable ZIP entries on some operating systems.</p> * <p>Furthermore this implementation is unable to tell, whether a given name can be safely encoded or not.</p> * <p>This implementation acts as a last resort implementation, when neither {@link Simple8BitZipEnoding} nor {@link NioZipEncoding} is available.</p> * <p>The methods of this class are reentrant.</p> 
class	TokenNameclass	
FallbackZipEncoding	TokenNameIdentifier	 Fallback Zip Encoding
implements	TokenNameimplements	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
/** * Construct a fallback zip encoding, which uses the platform's * default charset. */	TokenNameCOMMENT_JAVADOC	 Construct a fallback zip encoding, which uses the platform's default charset. 
public	TokenNamepublic	
FallbackZipEncoding	TokenNameIdentifier	 Fallback Zip Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a fallback zip encoding, which uses the given charset. * * @param charset The name of the charset or <code>null</code> for * the platform's default character set. */	TokenNameCOMMENT_JAVADOC	 Construct a fallback zip encoding, which uses the given charset. * @param charset The name of the charset or <code>null</code> for the platform's default character set. 
public	TokenNamepublic	
FallbackZipEncoding	TokenNameIdentifier	 Fallback Zip Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see * org.apache.tools.zip.ZipEncoding#canEncode(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.zip.ZipEncoding#canEncode(java.lang.String) 
public	TokenNamepublic	
boolean	TokenNameboolean	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see * org.apache.tools.zip.ZipEncoding#encode(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.zip.ZipEncoding#encode(java.lang.String) 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see * org.apache.tools.zip.ZipEncoding#decode(byte[]) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.zip.ZipEncoding#decode(byte[]) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
