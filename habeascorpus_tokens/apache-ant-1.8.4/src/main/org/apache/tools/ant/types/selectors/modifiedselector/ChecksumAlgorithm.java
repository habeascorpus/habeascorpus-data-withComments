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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Checksum	TokenNameIdentifier	 Checksum
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
Adler32	TokenNameIdentifier	 Adler32
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
CheckedInputStream	TokenNameIdentifier	 Checked Input Stream
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
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
NoSuchAlgorithmException	TokenNameIdentifier	 No Such Algorithm Exception
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
/** * Computes a 'checksum' for the content of file using * java.util.zip.CRC32 and java.util.zip.Adler32. * Use of this algorithm doesn't require any additional nested <param>s. * Supported <param>s are: * <table> * <tr> * <th>name</th><th>values</th><th>description</th><th>required</th> * </tr> * <tr> * <td> algorithm.algorithm </td> * <td> ADLER | CRC ( default ) </td> * <td> name of the algorithm the checksum should use </td> * <td> no, defaults to CRC </td> * </tr> * </table> * * @version 2004-06-17 * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Computes a 'checksum' for the content of file using java.util.zip.CRC32 and java.util.zip.Adler32. Use of this algorithm doesn't require any additional nested <param>s. Supported <param>s are: <table> <tr> <th>name</th><th>values</th><th>description</th><th>required</th> </tr> <tr> <td> algorithm.algorithm </td> <td> ADLER | CRC ( default ) </td> <td> name of the algorithm the checksum should use </td> <td> no, defaults to CRC </td> </tr> </table> * @version 2004-06-17 @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
ChecksumAlgorithm	TokenNameIdentifier	 Checksum Algorithm
implements	TokenNameimplements	
Algorithm	TokenNameIdentifier	 Algorithm
{	TokenNameLBRACE	
// ----- member variables ----- 	TokenNameCOMMENT_LINE	----- member variables ----- 
/** * Checksum algorithm to be used. */	TokenNameCOMMENT_JAVADOC	 Checksum algorithm to be used. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
algorithm	TokenNameIdentifier	 algorithm
=	TokenNameEQUAL	
"CRC"	TokenNameStringLiteral	CRC
;	TokenNameSEMICOLON	
/** * Checksum interface instance */	TokenNameCOMMENT_JAVADOC	 Checksum interface instance 
private	TokenNameprivate	
Checksum	TokenNameIdentifier	 Checksum
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// ----- Algorithm-Configuration ----- 	TokenNameCOMMENT_LINE	----- Algorithm-Configuration ----- 
/** * Specifies the algorithm to be used to compute the checksum. * Defaults to "CRC". Other popular algorithms like "ADLER" may be used as well. * @param algorithm the digest algorithm to use */	TokenNameCOMMENT_JAVADOC	 Specifies the algorithm to be used to compute the checksum. Defaults to "CRC". Other popular algorithms like "ADLER" may be used as well. @param algorithm the digest algorithm to use 
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
/** Initialize the checksum interface. */	TokenNameCOMMENT_JAVADOC	 Initialize the checksum interface. 
public	TokenNamepublic	
void	TokenNamevoid	
initChecksum	TokenNameIdentifier	 init Checksum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
checksum	TokenNameIdentifier	 checksum
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"CRC"	TokenNameStringLiteral	CRC
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"ADLER"	TokenNameStringLiteral	ADLER
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
new	TokenNamenew	
Adler32	TokenNameIdentifier	 Adler32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
new	TokenNamenew	
NoSuchAlgorithmException	TokenNameIdentifier	 No Such Algorithm Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ----- Logic ----- 	TokenNameCOMMENT_LINE	----- Logic ----- 
/** * This algorithm supports only CRC and Adler. * @return <i>true</i> if all is ok, otherwise <i>false</i>. */	TokenNameCOMMENT_JAVADOC	 This algorithm supports only CRC and Adler. @return <i>true</i> if all is ok, otherwise <i>false</i>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"CRC"	TokenNameStringLiteral	CRC
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"ADLER"	TokenNameStringLiteral	ADLER
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes a value for a file content with the specified checksum algorithm. * @param file File object for which the value should be evaluated. * @return The value for that file */	TokenNameCOMMENT_JAVADOC	 Computes a value for a file content with the specified checksum algorithm. @param file File object for which the value should be evaluated. @return The value for that file 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initChecksum	TokenNameIdentifier	 init Checksum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rval	TokenNameIdentifier	 rval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CheckedInputStream	TokenNameIdentifier	 Checked Input Stream
check	TokenNameIdentifier	 check
=	TokenNameEQUAL	
new	TokenNamenew	
CheckedInputStream	TokenNameIdentifier	 Checked Input Stream
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
checksum	TokenNameIdentifier	 checksum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
check	TokenNameIdentifier	 check
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Read the file 	TokenNameCOMMENT_LINE	Read the file 
}	TokenNameRBRACE	
rval	TokenNameIdentifier	 rval
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
check	TokenNameIdentifier	 check
.	TokenNameDOT	
getChecksum	TokenNameIdentifier	 get Checksum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rval	TokenNameIdentifier	 rval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
rval	TokenNameIdentifier	 rval
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
"<ChecksumAlgorithm:"	TokenNameStringLiteral	<ChecksumAlgorithm:
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
