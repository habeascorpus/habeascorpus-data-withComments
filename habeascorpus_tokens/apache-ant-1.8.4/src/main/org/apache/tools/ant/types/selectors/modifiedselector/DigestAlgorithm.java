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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
modifiedselector	TokenNameIdentifier	 modifiedselector
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
DigestInputStream	TokenNameIdentifier	 Digest Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
MessageDigest	TokenNameIdentifier	 Message Digest
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
NoSuchAlgorithmException	TokenNameIdentifier	 No Such Algorithm Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
NoSuchProviderException	TokenNameIdentifier	 No Such Provider Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Computes a 'hashvalue' for the content of file using * java.security.MessageDigest. * Use of this algorithm doesn't require any additional nested <param>s. * Supported <param>s are: * <table> * <tr> * <th>name</th><th>values</th><th>description</th><th>required</th> * </tr> * <tr> * <td> algorithm.algorithm </td> * <td> MD5 | SHA (default provider) </td> * <td> name of the algorithm the provider should use </td> * <td> no, defaults to MD5 </td> * </tr> * <tr> * <td> algorithm.provider </td> * <td> </td> * <td> name of the provider to use </td> * <td> no, defaults to <i>null</i> </td> * </tr> * </table> * * @version 2004-07-08 * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Computes a 'hashvalue' for the content of file using java.security.MessageDigest. Use of this algorithm doesn't require any additional nested <param>s. Supported <param>s are: <table> <tr> <th>name</th><th>values</th><th>description</th><th>required</th> </tr> <tr> <td> algorithm.algorithm </td> <td> MD5 | SHA (default provider) </td> <td> name of the algorithm the provider should use </td> <td> no, defaults to MD5 </td> </tr> <tr> <td> algorithm.provider </td> <td> </td> <td> name of the provider to use </td> <td> no, defaults to <i>null</i> </td> </tr> </table> * @version 2004-07-08 @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
DigestAlgorithm	TokenNameIdentifier	 Digest Algorithm
implements	TokenNameimplements	
Algorithm	TokenNameIdentifier	 Algorithm
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
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
8192	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ----- member variables ----- 	TokenNameCOMMENT_LINE	----- member variables ----- 
/** * MessageDigest algorithm to be used. */	TokenNameCOMMENT_JAVADOC	 MessageDigest algorithm to be used. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
algorithm	TokenNameIdentifier	 algorithm
=	TokenNameEQUAL	
"MD5"	TokenNameStringLiteral	MD5
;	TokenNameSEMICOLON	
/** * MessageDigest Algorithm provider */	TokenNameCOMMENT_JAVADOC	 MessageDigest Algorithm provider 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
provider	TokenNameIdentifier	 provider
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Message Digest instance */	TokenNameCOMMENT_JAVADOC	 Message Digest instance 
private	TokenNameprivate	
MessageDigest	TokenNameIdentifier	 Message Digest
messageDigest	TokenNameIdentifier	 message Digest
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Size of the read buffer to use. */	TokenNameCOMMENT_JAVADOC	 Size of the read buffer to use. 
private	TokenNameprivate	
int	TokenNameint	
readBufferSize	TokenNameIdentifier	 read Buffer Size
=	TokenNameEQUAL	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
;	TokenNameSEMICOLON	
// ----- Algorithm-Configuration ----- 	TokenNameCOMMENT_LINE	----- Algorithm-Configuration ----- 
/** * Specifies the algorithm to be used to compute the checksum. * Defaults to "MD5". Other popular algorithms like "SHA" may be used as well. * @param algorithm the digest algorithm to use */	TokenNameCOMMENT_JAVADOC	 Specifies the algorithm to be used to compute the checksum. Defaults to "MD5". Other popular algorithms like "SHA" may be used as well. @param algorithm the digest algorithm to use 
public	TokenNamepublic	
void	TokenNamevoid	
setAlgorithm	TokenNameIdentifier	 set Algorithm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
algorithm	TokenNameIdentifier	 algorithm
=	TokenNameEQUAL	
algorithm	TokenNameIdentifier	 algorithm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
algorithm	TokenNameIdentifier	 algorithm
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the MessageDigest algorithm provider to be used * to calculate the checksum. * @param provider provider to use */	TokenNameCOMMENT_JAVADOC	 Sets the MessageDigest algorithm provider to be used to calculate the checksum. @param provider provider to use 
public	TokenNamepublic	
void	TokenNamevoid	
setProvider	TokenNameIdentifier	 set Provider
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
provider	TokenNameIdentifier	 provider
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
provider	TokenNameIdentifier	 provider
=	TokenNameEQUAL	
provider	TokenNameIdentifier	 provider
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Initialize the security message digest. */	TokenNameCOMMENT_JAVADOC	 Initialize the security message digest. 
public	TokenNamepublic	
void	TokenNamevoid	
initMessageDigest	TokenNameIdentifier	 init Message Digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
messageDigest	TokenNameIdentifier	 message Digest
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
provider	TokenNameIdentifier	 provider
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
provider	TokenNameIdentifier	 provider
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"null"	TokenNameStringLiteral	null
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
provider	TokenNameIdentifier	 provider
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
messageDigest	TokenNameIdentifier	 message Digest
=	TokenNameEQUAL	
MessageDigest	TokenNameIdentifier	 Message Digest
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
,	TokenNameCOMMA	
provider	TokenNameIdentifier	 provider
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchAlgorithmException	TokenNameIdentifier	 No Such Algorithm Exception
noalgo	TokenNameIdentifier	 noalgo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
noalgo	TokenNameIdentifier	 noalgo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchProviderException	TokenNameIdentifier	 No Such Provider Exception
noprovider	TokenNameIdentifier	 noprovider
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
noprovider	TokenNameIdentifier	 noprovider
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
messageDigest	TokenNameIdentifier	 message Digest
=	TokenNameEQUAL	
MessageDigest	TokenNameIdentifier	 Message Digest
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchAlgorithmException	TokenNameIdentifier	 No Such Algorithm Exception
noalgo	TokenNameIdentifier	 noalgo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
noalgo	TokenNameIdentifier	 noalgo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ----- Logic ----- 	TokenNameCOMMENT_LINE	----- Logic ----- 
/** * This algorithm supports only MD5 and SHA. * @return <i>true</i> if all is ok, otherwise <i>false</i>. */	TokenNameCOMMENT_JAVADOC	 This algorithm supports only MD5 and SHA. @return <i>true</i> if all is ok, otherwise <i>false</i>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"SHA"	TokenNameStringLiteral	SHA
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"MD5"	TokenNameStringLiteral	MD5
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes a value for a file content with the specified digest algorithm. * @param file File object for which the value should be evaluated. * @return The value for that file */	TokenNameCOMMENT_JAVADOC	 Computes a value for a file content with the specified digest algorithm. @param file File object for which the value should be evaluated. @return The value for that file 
// implementation adapted from ...taskdefs.Checksum, thanks to Magesh for hint 	TokenNameCOMMENT_LINE	implementation adapted from ...taskdefs.Checksum, thanks to Magesh for hint 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initMessageDigest	TokenNameIdentifier	 init Message Digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
readBufferSize	TokenNameIdentifier	 read Buffer Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
messageDigest	TokenNameIdentifier	 message Digest
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DigestInputStream	TokenNameIdentifier	 Digest Input Stream
dis	TokenNameIdentifier	 dis
=	TokenNameEQUAL	
new	TokenNamenew	
DigestInputStream	TokenNameIdentifier	 Digest Input Stream
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
messageDigest	TokenNameIdentifier	 message Digest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fileDigest	TokenNameIdentifier	 file Digest
=	TokenNameEQUAL	
messageDigest	TokenNameIdentifier	 message Digest
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
checksumSb	TokenNameIdentifier	 checksum Sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
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
fileDigest	TokenNameIdentifier	 file Digest
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
hexStr	TokenNameIdentifier	 hex Str
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
&	TokenNameAND	
fileDigest	TokenNameIdentifier	 file Digest
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hexStr	TokenNameIdentifier	 hex Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checksumSb	TokenNameIdentifier	 checksum Sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checksumSb	TokenNameIdentifier	 checksum Sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hexStr	TokenNameIdentifier	 hex Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
checksumSb	TokenNameIdentifier	 checksum Sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
checksum	TokenNameIdentifier	 checksum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override Object.toString(). * @return some information about this algorithm. */	TokenNameCOMMENT_JAVADOC	 Override Object.toString(). @return some information about this algorithm. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<DigestAlgorithm:"	TokenNameStringLiteral	<DigestAlgorithm:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"algorithm="	TokenNameStringLiteral	algorithm=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
";provider="	TokenNameStringLiteral	;provider=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
provider	TokenNameIdentifier	 provider
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
