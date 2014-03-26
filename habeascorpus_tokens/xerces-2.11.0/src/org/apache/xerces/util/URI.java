/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/********************************************************************** * A class to represent a Uniform Resource Identifier (URI). This class * is designed to handle the parsing of URIs and provide access to * the various components (scheme, host, port, userinfo, path, query * string and fragment) that may constitute a URI. * <p> * Parsing of a URI specification is done according to the URI * syntax described in * <a href="http://www.ietf.org/rfc/rfc2396.txt?number=2396">RFC 2396</a>, * and amended by * <a href="http://www.ietf.org/rfc/rfc2732.txt?number=2732">RFC 2732</a>. * <p> * Every absolute URI consists of a scheme, followed by a colon (':'), * followed by a scheme-specific part. For URIs that follow the * "generic URI" syntax, the scheme-specific part begins with two * slashes ("//") and may be followed by an authority segment (comprised * of user information, host, and port), path segment, query segment * and fragment. Note that RFC 2396 no longer specifies the use of the * parameters segment and excludes the "user:password" syntax as part of * the authority segment. If "user:password" appears in a URI, the entire * user/password string is stored as userinfo. * <p> * For URIs that do not follow the "generic URI" syntax (e.g. mailto), * the entire scheme-specific part is treated as the "path" portion * of the URI. * <p> * Note that, unlike the java.net.URL class, this class does not provide * any built-in network access functionality nor does it provide any * scheme-specific functionality (for example, it does not know a * default port for a specific scheme). Rather, it only knows the * grammar and basic set of operations that can be applied to a URI. * * @version $Id: URI.java 712351 2008-11-08 05:45:12Z mrglavas $ * **********************************************************************/	TokenNameCOMMENT_JAVADOC	******************************************************************** A class to represent a Uniform Resource Identifier (URI). This class is designed to handle the parsing of URIs and provide access to the various components (scheme, host, port, userinfo, path, query string and fragment) that may constitute a URI. <p> Parsing of a URI specification is done according to the URI syntax described in <a href="http://www.ietf.org/rfc/rfc2396.txt?number=2396">RFC 2396</a>, and amended by <a href="http://www.ietf.org/rfc/rfc2732.txt?number=2732">RFC 2732</a>. <p> Every absolute URI consists of a scheme, followed by a colon (':'), followed by a scheme-specific part. For URIs that follow the "generic URI" syntax, the scheme-specific part begins with two slashes ("//") and may be followed by an authority segment (comprised of user information, host, and port), path segment, query segment and fragment. Note that RFC 2396 no longer specifies the use of the parameters segment and excludes the "user:password" syntax as part of the authority segment. If "user:password" appears in a URI, the entire user/password string is stored as userinfo. <p> For URIs that do not follow the "generic URI" syntax (e.g. mailto), the entire scheme-specific part is treated as the "path" portion of the URI. <p> Note that, unlike the java.net.URL class, this class does not provide any built-in network access functionality nor does it provide any scheme-specific functionality (for example, it does not know a default port for a specific scheme). Rather, it only knows the grammar and basic set of operations that can be applied to a URI. * @version $Id: URI.java 712351 2008-11-08 05:45:12Z mrglavas $ *********************************************************************
public	TokenNamepublic	
class	TokenNameclass	
URI	TokenNameIdentifier	 URI
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/******************************************************************* * MalformedURIExceptions are thrown in the process of building a URI * or setting fields on a URI when an operation would result in an * invalid URI specification. * ********************************************************************/	TokenNameCOMMENT_JAVADOC	***************************************************************** MalformedURIExceptions are thrown in the process of building a URI or setting fields on a URI when an operation would result in an invalid URI specification. *******************************************************************
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
extends	TokenNameextends	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6695054834342951930L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/****************************************************************** * Constructs a <code>MalformedURIException</code> with no specified * detail message. ******************************************************************/	TokenNameCOMMENT_JAVADOC	**************************************************************** Constructs a <code>MalformedURIException</code> with no specified detail message. *****************************************************************
public	TokenNamepublic	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/***************************************************************** * Constructs a <code>MalformedURIException</code> with the * specified detail message. * * @param p_msg the detail message. ******************************************************************/	TokenNameCOMMENT_JAVADOC	*************************************************************** Constructs a <code>MalformedURIException</code> with the specified detail message. * @param p_msg the detail message. *****************************************************************
public	TokenNamepublic	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_msg	TokenNameIdentifier	 p msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
p_msg	TokenNameIdentifier	 p msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1601921774685357214L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Character Classes */	TokenNameCOMMENT_JAVADOC	 Character Classes 
/** reserved characters ;/?:@&=+$,[] */	TokenNameCOMMENT_JAVADOC	 reserved characters ;/?:@&=+$,[] 
//RFC 2732 added '[' and ']' as reserved characters 	TokenNameCOMMENT_LINE	RFC 2732 added '[' and ']' as reserved characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** URI punctuation mark characters: -_.!~*'() - these, combined with alphanumerics, constitute the "unreserved" characters */	TokenNameCOMMENT_JAVADOC	 URI punctuation mark characters: -_.!~*'() - these, combined with alphanumerics, constitute the "unreserved" characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
=	TokenNameEQUAL	
0x02	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** scheme can be composed of alphanumerics and these characters: +-. */	TokenNameCOMMENT_JAVADOC	 scheme can be composed of alphanumerics and these characters: +-. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SCHEME_CHARACTERS	TokenNameIdentifier	 SCHEME  CHARACTERS
=	TokenNameEQUAL	
0x04	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** userinfo can be composed of unreserved, escaped and these characters: ;:&=+$, */	TokenNameCOMMENT_JAVADOC	 userinfo can be composed of unreserved, escaped and these characters: ;:&=+$, 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
=	TokenNameEQUAL	
0x08	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** ASCII letter characters */	TokenNameCOMMENT_JAVADOC	 ASCII letter characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ASCII_ALPHA_CHARACTERS	TokenNameIdentifier	 ASCII  ALPHA  CHARACTERS
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** ASCII digit characters */	TokenNameCOMMENT_JAVADOC	 ASCII digit characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ASCII_DIGIT_CHARACTERS	TokenNameIdentifier	 ASCII  DIGIT  CHARACTERS
=	TokenNameEQUAL	
0x20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** ASCII hex characters */	TokenNameCOMMENT_JAVADOC	 ASCII hex characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ASCII_HEX_CHARACTERS	TokenNameIdentifier	 ASCII  HEX  CHARACTERS
=	TokenNameEQUAL	
0x40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Path characters */	TokenNameCOMMENT_JAVADOC	 Path characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
=	TokenNameEQUAL	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Mask for alpha-numeric characters */	TokenNameCOMMENT_JAVADOC	 Mask for alpha-numeric characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_ALPHA_NUMERIC	TokenNameIdentifier	 MASK  ALPHA  NUMERIC
=	TokenNameEQUAL	
ASCII_ALPHA_CHARACTERS	TokenNameIdentifier	 ASCII  ALPHA  CHARACTERS
|	TokenNameOR	
ASCII_DIGIT_CHARACTERS	TokenNameIdentifier	 ASCII  DIGIT  CHARACTERS
;	TokenNameSEMICOLON	
/** Mask for unreserved characters */	TokenNameCOMMENT_JAVADOC	 Mask for unreserved characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_UNRESERVED_MASK	TokenNameIdentifier	 MASK  UNRESERVED  MASK
=	TokenNameEQUAL	
MASK_ALPHA_NUMERIC	TokenNameIdentifier	 MASK  ALPHA  NUMERIC
|	TokenNameOR	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
;	TokenNameSEMICOLON	
/** Mask for URI allowable characters except for % */	TokenNameCOMMENT_JAVADOC	 Mask for URI allowable characters except for % 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_URI_CHARACTER	TokenNameIdentifier	 MASK  URI  CHARACTER
=	TokenNameEQUAL	
MASK_UNRESERVED_MASK	TokenNameIdentifier	 MASK  UNRESERVED  MASK
|	TokenNameOR	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
/** Mask for scheme characters */	TokenNameCOMMENT_JAVADOC	 Mask for scheme characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_SCHEME_CHARACTER	TokenNameIdentifier	 MASK  SCHEME  CHARACTER
=	TokenNameEQUAL	
MASK_ALPHA_NUMERIC	TokenNameIdentifier	 MASK  ALPHA  NUMERIC
|	TokenNameOR	
SCHEME_CHARACTERS	TokenNameIdentifier	 SCHEME  CHARACTERS
;	TokenNameSEMICOLON	
/** Mask for userinfo characters */	TokenNameCOMMENT_JAVADOC	 Mask for userinfo characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_USERINFO_CHARACTER	TokenNameIdentifier	 MASK  USERINFO  CHARACTER
=	TokenNameEQUAL	
MASK_UNRESERVED_MASK	TokenNameIdentifier	 MASK  UNRESERVED  MASK
|	TokenNameOR	
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
;	TokenNameSEMICOLON	
/** Mask for path characters */	TokenNameCOMMENT_JAVADOC	 Mask for path characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK_PATH_CHARACTER	TokenNameIdentifier	 MASK  PATH  CHARACTER
=	TokenNameEQUAL	
MASK_UNRESERVED_MASK	TokenNameIdentifier	 MASK  UNRESERVED  MASK
|	TokenNameOR	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// Add ASCII Digits and ASCII Hex Numbers 	TokenNameCOMMENT_LINE	Add ASCII Digits and ASCII Hex Numbers 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
ASCII_DIGIT_CHARACTERS	TokenNameIdentifier	 ASCII  DIGIT  CHARACTERS
|	TokenNameOR	
ASCII_HEX_CHARACTERS	TokenNameIdentifier	 ASCII  HEX  CHARACTERS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add ASCII Letters and ASCII Hex Numbers 	TokenNameCOMMENT_LINE	Add ASCII Letters and ASCII Hex Numbers 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
'F'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
ASCII_ALPHA_CHARACTERS	TokenNameIdentifier	 ASCII  ALPHA  CHARACTERS
|	TokenNameOR	
ASCII_HEX_CHARACTERS	TokenNameIdentifier	 ASCII  HEX  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
0x00000020	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
ASCII_ALPHA_CHARACTERS	TokenNameIdentifier	 ASCII  ALPHA  CHARACTERS
|	TokenNameOR	
ASCII_HEX_CHARACTERS	TokenNameIdentifier	 ASCII  HEX  CHARACTERS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add ASCII Letters 	TokenNameCOMMENT_LINE	Add ASCII Letters 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
'G'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
ASCII_ALPHA_CHARACTERS	TokenNameIdentifier	 ASCII  ALPHA  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
0x00000020	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
ASCII_ALPHA_CHARACTERS	TokenNameIdentifier	 ASCII  ALPHA  CHARACTERS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add Reserved Characters 	TokenNameCOMMENT_LINE	Add Reserved Characters 
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
';'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'/'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'?'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
':'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'@'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'&'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'='	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'+'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'$'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
','	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'['	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
']'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
;	TokenNameSEMICOLON	
// Add Mark Characters 	TokenNameCOMMENT_LINE	Add Mark Characters 
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'-'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'_'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'.'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'!'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'~'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'*'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'\''	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'('	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
')'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
;	TokenNameSEMICOLON	
// Add Scheme Characters 	TokenNameCOMMENT_LINE	Add Scheme Characters 
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'+'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
SCHEME_CHARACTERS	TokenNameIdentifier	 SCHEME  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'-'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
SCHEME_CHARACTERS	TokenNameIdentifier	 SCHEME  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'.'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
SCHEME_CHARACTERS	TokenNameIdentifier	 SCHEME  CHARACTERS
;	TokenNameSEMICOLON	
// Add Userinfo Characters 	TokenNameCOMMENT_LINE	Add Userinfo Characters 
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
';'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
':'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'&'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'='	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'+'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'$'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
','	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
;	TokenNameSEMICOLON	
// Add Path Characters 	TokenNameCOMMENT_LINE	Add Path Characters 
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
';'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'/'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
':'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'@'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'&'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'='	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'+'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
'$'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
;	TokenNameSEMICOLON	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
','	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
PATH_CHARACTERS	TokenNameIdentifier	 PATH  CHARACTERS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Stores the scheme (usually the protocol) for this URI. */	TokenNameCOMMENT_JAVADOC	 Stores the scheme (usually the protocol) for this URI. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_scheme	TokenNameIdentifier	 m scheme
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If specified, stores the userinfo for this URI; otherwise null */	TokenNameCOMMENT_JAVADOC	 If specified, stores the userinfo for this URI; otherwise null 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_userinfo	TokenNameIdentifier	 m userinfo
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If specified, stores the host for this URI; otherwise null */	TokenNameCOMMENT_JAVADOC	 If specified, stores the host for this URI; otherwise null 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If specified, stores the port for this URI; otherwise -1 */	TokenNameCOMMENT_JAVADOC	 If specified, stores the port for this URI; otherwise -1 
private	TokenNameprivate	
int	TokenNameint	
m_port	TokenNameIdentifier	 m port
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** If specified, stores the registry based authority for this URI; otherwise -1 */	TokenNameCOMMENT_JAVADOC	 If specified, stores the registry based authority for this URI; otherwise -1 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_regAuthority	TokenNameIdentifier	 m reg Authority
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If specified, stores the path for this URI; otherwise null */	TokenNameCOMMENT_JAVADOC	 If specified, stores the path for this URI; otherwise null 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If specified, stores the query string for this URI; otherwise null. */	TokenNameCOMMENT_JAVADOC	 If specified, stores the query string for this URI; otherwise null. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_queryString	TokenNameIdentifier	 m query String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If specified, stores the fragment for this URI; otherwise null */	TokenNameCOMMENT_JAVADOC	 If specified, stores the fragment for this URI; otherwise null 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_fragment	TokenNameIdentifier	 m fragment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Construct a new and uninitialized URI. */	TokenNameCOMMENT_JAVADOC	 Construct a new and uninitialized URI. 
public	TokenNamepublic	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct a new URI from another URI. All fields for this URI are * set equal to the fields of the URI passed in. * * @param p_other the URI to copy (cannot be null) */	TokenNameCOMMENT_JAVADOC	 Construct a new URI from another URI. All fields for this URI are set equal to the fields of the URI passed in. * @param p_other the URI to copy (cannot be null) 
public	TokenNamepublic	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
p_other	TokenNameIdentifier	 p other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
p_other	TokenNameIdentifier	 p other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new URI from a URI specification string. If the * specification follows the "generic URI" syntax, (two slashes * following the first colon), the specification will be parsed * accordingly - setting the scheme, userinfo, host,port, path, query * string and fragment fields as necessary. If the specification does * not follow the "generic URI" syntax, the specification is parsed * into a scheme and scheme-specific part (stored as the path) only. * * @param p_uriSpec the URI specification string (cannot be null or * empty) * * @exception MalformedURIException if p_uriSpec violates any syntax * rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI from a URI specification string. If the specification follows the "generic URI" syntax, (two slashes following the first colon), the specification will be parsed accordingly - setting the scheme, userinfo, host,port, path, query string and fragment fields as necessary. If the specification does not follow the "generic URI" syntax, the specification is parsed into a scheme and scheme-specific part (stored as the path) only. * @param p_uriSpec the URI specification string (cannot be null or empty) * @exception MalformedURIException if p_uriSpec violates any syntax rules 
public	TokenNamepublic	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
p_uriSpec	TokenNameIdentifier	 p uri Spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new URI from a URI specification string. If the * specification follows the "generic URI" syntax, (two slashes * following the first colon), the specification will be parsed * accordingly - setting the scheme, userinfo, host,port, path, query * string and fragment fields as necessary. If the specification does * not follow the "generic URI" syntax, the specification is parsed * into a scheme and scheme-specific part (stored as the path) only. * Construct a relative URI if boolean is assigned to "true" * and p_uriSpec is not valid absolute URI, instead of throwing an exception. * * @param p_uriSpec the URI specification string (cannot be null or * empty) * @param allowNonAbsoluteURI true to permit non-absolute URIs, * false otherwise. * * @exception MalformedURIException if p_uriSpec violates any syntax * rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI from a URI specification string. If the specification follows the "generic URI" syntax, (two slashes following the first colon), the specification will be parsed accordingly - setting the scheme, userinfo, host,port, path, query string and fragment fields as necessary. If the specification does not follow the "generic URI" syntax, the specification is parsed into a scheme and scheme-specific part (stored as the path) only. Construct a relative URI if boolean is assigned to "true" and p_uriSpec is not valid absolute URI, instead of throwing an exception. * @param p_uriSpec the URI specification string (cannot be null or empty) @param allowNonAbsoluteURI true to permit non-absolute URIs, false otherwise. * @exception MalformedURIException if p_uriSpec violates any syntax rules 
public	TokenNamepublic	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
,	TokenNameCOMMA	
boolean	TokenNameboolean	
allowNonAbsoluteURI	TokenNameIdentifier	 allow Non Absolute URI
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
p_uriSpec	TokenNameIdentifier	 p uri Spec
,	TokenNameCOMMA	
allowNonAbsoluteURI	TokenNameIdentifier	 allow Non Absolute URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new URI from a base URI and a URI specification string. * The URI specification string may be a relative URI. * * @param p_base the base URI (cannot be null if p_uriSpec is null or * empty) * @param p_uriSpec the URI specification string (cannot be null or * empty if p_base is null) * * @exception MalformedURIException if p_uriSpec violates any syntax * rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI from a base URI and a URI specification string. The URI specification string may be a relative URI. * @param p_base the base URI (cannot be null if p_uriSpec is null or empty) @param p_uriSpec the URI specification string (cannot be null or empty if p_base is null) * @exception MalformedURIException if p_uriSpec violates any syntax rules 
public	TokenNamepublic	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
p_base	TokenNameIdentifier	 p base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
,	TokenNameCOMMA	
p_uriSpec	TokenNameIdentifier	 p uri Spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new URI from a base URI and a URI specification string. * The URI specification string may be a relative URI. * Construct a relative URI if boolean is assigned to "true" * and p_uriSpec is not valid absolute URI and p_base is null * instead of throwing an exception. * * @param p_base the base URI (cannot be null if p_uriSpec is null or * empty) * @param p_uriSpec the URI specification string (cannot be null or * empty if p_base is null) * @param allowNonAbsoluteURI true to permit non-absolute URIs, * false otherwise. * * @exception MalformedURIException if p_uriSpec violates any syntax * rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI from a base URI and a URI specification string. The URI specification string may be a relative URI. Construct a relative URI if boolean is assigned to "true" and p_uriSpec is not valid absolute URI and p_base is null instead of throwing an exception. * @param p_base the base URI (cannot be null if p_uriSpec is null or empty) @param p_uriSpec the URI specification string (cannot be null or empty if p_base is null) @param allowNonAbsoluteURI true to permit non-absolute URIs, false otherwise. * @exception MalformedURIException if p_uriSpec violates any syntax rules 
public	TokenNamepublic	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
p_base	TokenNameIdentifier	 p base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
,	TokenNameCOMMA	
boolean	TokenNameboolean	
allowNonAbsoluteURI	TokenNameIdentifier	 allow Non Absolute URI
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
,	TokenNameCOMMA	
p_uriSpec	TokenNameIdentifier	 p uri Spec
,	TokenNameCOMMA	
allowNonAbsoluteURI	TokenNameIdentifier	 allow Non Absolute URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new URI that does not follow the generic URI syntax. * Only the scheme and scheme-specific part (stored as the path) are * initialized. * * @param p_scheme the URI scheme (cannot be null or empty) * @param p_schemeSpecificPart the scheme-specific part (cannot be * null or empty) * * @exception MalformedURIException if p_scheme violates any * syntax rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI that does not follow the generic URI syntax. Only the scheme and scheme-specific part (stored as the path) are initialized. * @param p_scheme the URI scheme (cannot be null or empty) @param p_schemeSpecificPart the scheme-specific part (cannot be null or empty) * @exception MalformedURIException if p_scheme violates any syntax rules 
public	TokenNamepublic	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_scheme	TokenNameIdentifier	 p scheme
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_schemeSpecificPart	TokenNameIdentifier	 p scheme Specific Part
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_scheme	TokenNameIdentifier	 p scheme
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
p_scheme	TokenNameIdentifier	 p scheme
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Cannot construct URI with null/empty scheme!"	TokenNameStringLiteral	Cannot construct URI with null/empty scheme!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_schemeSpecificPart	TokenNameIdentifier	 p scheme Specific Part
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
p_schemeSpecificPart	TokenNameIdentifier	 p scheme Specific Part
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Cannot construct URI with null/empty scheme-specific part!"	TokenNameStringLiteral	Cannot construct URI with null/empty scheme-specific part!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setScheme	TokenNameIdentifier	 set Scheme
(	TokenNameLPAREN	
p_scheme	TokenNameIdentifier	 p scheme
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
p_schemeSpecificPart	TokenNameIdentifier	 p scheme Specific Part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new URI that follows the generic URI syntax from its * component parts. Each component is validated for syntax and some * basic semantic checks are performed as well. See the individual * setter methods for specifics. * * @param p_scheme the URI scheme (cannot be null or empty) * @param p_host the hostname, IPv4 address or IPv6 reference for the URI * @param p_path the URI path - if the path contains '?' or '#', * then the query string and/or fragment will be * set from the path; however, if the query and * fragment are specified both in the path and as * separate parameters, an exception is thrown * @param p_queryString the URI query string (cannot be specified * if path is null) * @param p_fragment the URI fragment (cannot be specified if path * is null) * * @exception MalformedURIException if any of the parameters violates * syntax rules or semantic rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI that follows the generic URI syntax from its component parts. Each component is validated for syntax and some basic semantic checks are performed as well. See the individual setter methods for specifics. * @param p_scheme the URI scheme (cannot be null or empty) @param p_host the hostname, IPv4 address or IPv6 reference for the URI @param p_path the URI path - if the path contains '?' or '#', then the query string and/or fragment will be set from the path; however, if the query and fragment are specified both in the path and as separate parameters, an exception is thrown @param p_queryString the URI query string (cannot be specified if path is null) @param p_fragment the URI fragment (cannot be specified if path is null) * @exception MalformedURIException if any of the parameters violates syntax rules or semantic rules 
public	TokenNamepublic	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_scheme	TokenNameIdentifier	 p scheme
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_host	TokenNameIdentifier	 p host
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_path	TokenNameIdentifier	 p path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_queryString	TokenNameIdentifier	 p query String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_fragment	TokenNameIdentifier	 p fragment
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
p_scheme	TokenNameIdentifier	 p scheme
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
p_host	TokenNameIdentifier	 p host
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p_path	TokenNameIdentifier	 p path
,	TokenNameCOMMA	
p_queryString	TokenNameIdentifier	 p query String
,	TokenNameCOMMA	
p_fragment	TokenNameIdentifier	 p fragment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new URI that follows the generic URI syntax from its * component parts. Each component is validated for syntax and some * basic semantic checks are performed as well. See the individual * setter methods for specifics. * * @param p_scheme the URI scheme (cannot be null or empty) * @param p_userinfo the URI userinfo (cannot be specified if host * is null) * @param p_host the hostname, IPv4 address or IPv6 reference for the URI * @param p_port the URI port (may be -1 for "unspecified"; cannot * be specified if host is null) * @param p_path the URI path - if the path contains '?' or '#', * then the query string and/or fragment will be * set from the path; however, if the query and * fragment are specified both in the path and as * separate parameters, an exception is thrown * @param p_queryString the URI query string (cannot be specified * if path is null) * @param p_fragment the URI fragment (cannot be specified if path * is null) * * @exception MalformedURIException if any of the parameters violates * syntax rules or semantic rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI that follows the generic URI syntax from its component parts. Each component is validated for syntax and some basic semantic checks are performed as well. See the individual setter methods for specifics. * @param p_scheme the URI scheme (cannot be null or empty) @param p_userinfo the URI userinfo (cannot be specified if host is null) @param p_host the hostname, IPv4 address or IPv6 reference for the URI @param p_port the URI port (may be -1 for "unspecified"; cannot be specified if host is null) @param p_path the URI path - if the path contains '?' or '#', then the query string and/or fragment will be set from the path; however, if the query and fragment are specified both in the path and as separate parameters, an exception is thrown @param p_queryString the URI query string (cannot be specified if path is null) @param p_fragment the URI fragment (cannot be specified if path is null) * @exception MalformedURIException if any of the parameters violates syntax rules or semantic rules 
public	TokenNamepublic	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_scheme	TokenNameIdentifier	 p scheme
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_userinfo	TokenNameIdentifier	 p userinfo
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_host	TokenNameIdentifier	 p host
,	TokenNameCOMMA	
int	TokenNameint	
p_port	TokenNameIdentifier	 p port
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_path	TokenNameIdentifier	 p path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_queryString	TokenNameIdentifier	 p query String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_fragment	TokenNameIdentifier	 p fragment
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_scheme	TokenNameIdentifier	 p scheme
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
p_scheme	TokenNameIdentifier	 p scheme
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Scheme is required!"	TokenNameStringLiteral	Scheme is required!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_host	TokenNameIdentifier	 p host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_userinfo	TokenNameIdentifier	 p userinfo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Userinfo may not be specified if host is not specified!"	TokenNameStringLiteral	Userinfo may not be specified if host is not specified!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_port	TokenNameIdentifier	 p port
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Port may not be specified if host is not specified!"	TokenNameStringLiteral	Port may not be specified if host is not specified!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_path	TokenNameIdentifier	 p path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_path	TokenNameIdentifier	 p path
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
p_queryString	TokenNameIdentifier	 p query String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Query string cannot be specified in path and query string!"	TokenNameStringLiteral	Query string cannot be specified in path and query string!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_path	TokenNameIdentifier	 p path
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
p_fragment	TokenNameIdentifier	 p fragment
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Fragment cannot be specified in both the path and fragment!"	TokenNameStringLiteral	Fragment cannot be specified in both the path and fragment!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setScheme	TokenNameIdentifier	 set Scheme
(	TokenNameLPAREN	
p_scheme	TokenNameIdentifier	 p scheme
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setHost	TokenNameIdentifier	 set Host
(	TokenNameLPAREN	
p_host	TokenNameIdentifier	 p host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
p_port	TokenNameIdentifier	 p port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setUserinfo	TokenNameIdentifier	 set Userinfo
(	TokenNameLPAREN	
p_userinfo	TokenNameIdentifier	 p userinfo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
p_path	TokenNameIdentifier	 p path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setQueryString	TokenNameIdentifier	 set Query String
(	TokenNameLPAREN	
p_queryString	TokenNameIdentifier	 p query String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFragment	TokenNameIdentifier	 set Fragment
(	TokenNameLPAREN	
p_fragment	TokenNameIdentifier	 p fragment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize all fields of this URI from another URI. * * @param p_other the URI to copy (cannot be null) */	TokenNameCOMMENT_JAVADOC	 Initialize all fields of this URI from another URI. * @param p_other the URI to copy (cannot be null) 
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
p_other	TokenNameIdentifier	 p other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_scheme	TokenNameIdentifier	 m scheme
=	TokenNameEQUAL	
p_other	TokenNameIdentifier	 p other
.	TokenNameDOT	
getScheme	TokenNameIdentifier	 get Scheme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_userinfo	TokenNameIdentifier	 m userinfo
=	TokenNameEQUAL	
p_other	TokenNameIdentifier	 p other
.	TokenNameDOT	
getUserinfo	TokenNameIdentifier	 get Userinfo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
p_other	TokenNameIdentifier	 p other
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_port	TokenNameIdentifier	 m port
=	TokenNameEQUAL	
p_other	TokenNameIdentifier	 p other
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_regAuthority	TokenNameIdentifier	 m reg Authority
=	TokenNameEQUAL	
p_other	TokenNameIdentifier	 p other
.	TokenNameDOT	
getRegBasedAuthority	TokenNameIdentifier	 get Reg Based Authority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
p_other	TokenNameIdentifier	 p other
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_queryString	TokenNameIdentifier	 m query String
=	TokenNameEQUAL	
p_other	TokenNameIdentifier	 p other
.	TokenNameDOT	
getQueryString	TokenNameIdentifier	 get Query String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_fragment	TokenNameIdentifier	 m fragment
=	TokenNameEQUAL	
p_other	TokenNameIdentifier	 p other
.	TokenNameDOT	
getFragment	TokenNameIdentifier	 get Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this URI from a base URI and a URI specification string. * See RFC 2396 Section 4 and Appendix B for specifications on parsing * the URI and Section 5 for specifications on resolving relative URIs * and relative paths. * * @param p_base the base URI (may be null if p_uriSpec is an absolute * URI) * @param p_uriSpec the URI spec string which may be an absolute or * relative URI (can only be null/empty if p_base * is not null) * @param allowNonAbsoluteURI true to permit non-absolute URIs, * in case of relative URI, false otherwise. * * @exception MalformedURIException if p_base is null and p_uriSpec * is not an absolute URI or if * p_uriSpec violates syntax rules */	TokenNameCOMMENT_JAVADOC	 Initializes this URI from a base URI and a URI specification string. See RFC 2396 Section 4 and Appendix B for specifications on parsing the URI and Section 5 for specifications on resolving relative URIs and relative paths. * @param p_base the base URI (may be null if p_uriSpec is an absolute URI) @param p_uriSpec the URI spec string which may be an absolute or relative URI (can only be null/empty if p_base is not null) @param allowNonAbsoluteURI true to permit non-absolute URIs, in case of relative URI, false otherwise. * @exception MalformedURIException if p_base is null and p_uriSpec is not an absolute URI or if p_uriSpec violates syntax rules 
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
p_base	TokenNameIdentifier	 p base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
,	TokenNameCOMMA	
boolean	TokenNameboolean	
allowNonAbsoluteURI	TokenNameIdentifier	 allow Non Absolute URI
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uriSpec	TokenNameIdentifier	 uri Spec
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
;	TokenNameSEMICOLON	
int	TokenNameint	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
allowNonAbsoluteURI	TokenNameIdentifier	 allow Non Absolute URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Cannot initialize URI with empty parameters."	TokenNameStringLiteral	Cannot initialize URI with empty parameters.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// just make a copy of the base if spec is empty 	TokenNameCOMMENT_LINE	just make a copy of the base if spec is empty 
if	TokenNameif	
(	TokenNameLPAREN	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Check for scheme, which must be before '/', '?' or '#'. 	TokenNameCOMMENT_LINE	Check for scheme, which must be before '/', '?' or '#'. 
int	TokenNameint	
colonIdx	TokenNameIdentifier	 colon Idx
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colonIdx	TokenNameIdentifier	 colon Idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
searchFrom	TokenNameIdentifier	 search From
=	TokenNameEQUAL	
colonIdx	TokenNameIdentifier	 colon Idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// search backwards starting from character before ':'. 	TokenNameCOMMENT_LINE	search backwards starting from character before ':'. 
int	TokenNameint	
slashIdx	TokenNameIdentifier	 slash Idx
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
searchFrom	TokenNameIdentifier	 search From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
queryIdx	TokenNameIdentifier	 query Idx
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
searchFrom	TokenNameIdentifier	 search From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fragmentIdx	TokenNameIdentifier	 fragment Idx
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
searchFrom	TokenNameIdentifier	 search From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colonIdx	TokenNameIdentifier	 colon Idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
slashIdx	TokenNameIdentifier	 slash Idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
queryIdx	TokenNameIdentifier	 query Idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
fragmentIdx	TokenNameIdentifier	 fragment Idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A standalone base is a valid URI according to spec 	TokenNameCOMMENT_LINE	A standalone base is a valid URI according to spec 
if	TokenNameif	
(	TokenNameLPAREN	
colonIdx	TokenNameIdentifier	 colon Idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fragmentIdx	TokenNameIdentifier	 fragment Idx
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
allowNonAbsoluteURI	TokenNameIdentifier	 allow Non Absolute URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"No scheme found in URI."	TokenNameStringLiteral	No scheme found in URI.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
initializeScheme	TokenNameIdentifier	 initialize Scheme
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_scheme	TokenNameIdentifier	 m scheme
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Neither 'scheme:' or 'scheme:#fragment' are valid URIs. 	TokenNameCOMMENT_LINE	Neither 'scheme:' or 'scheme:#fragment' are valid URIs. 
if	TokenNameif	
(	TokenNameLPAREN	
colonIdx	TokenNameIdentifier	 colon Idx
==	TokenNameEQUAL_EQUAL	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
colonIdx	TokenNameIdentifier	 colon Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Scheme specific part cannot be empty."	TokenNameStringLiteral	Scheme specific part cannot be empty.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
allowNonAbsoluteURI	TokenNameIdentifier	 allow Non Absolute URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"No scheme found in URI."	TokenNameStringLiteral	No scheme found in URI.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Two slashes means we may have authority, but definitely means we're either 	TokenNameCOMMENT_LINE	Two slashes means we may have authority, but definitely means we're either 
// matching net_path or abs_path. These two productions are ambiguous in that 	TokenNameCOMMENT_LINE	matching net_path or abs_path. These two productions are ambiguous in that 
// every net_path (except those containing an IPv6Reference) is an abs_path. 	TokenNameCOMMENT_LINE	every net_path (except those containing an IPv6Reference) is an abs_path. 
// RFC 2396 resolves this ambiguity by applying a greedy left most matching rule. 	TokenNameCOMMENT_LINE	RFC 2396 resolves this ambiguity by applying a greedy left most matching rule. 
// Try matching net_path first, and if that fails we don't have authority so 	TokenNameCOMMENT_LINE	Try matching net_path first, and if that fails we don't have authority so 
// then attempt to match abs_path. 	TokenNameCOMMENT_LINE	then attempt to match abs_path. 
// 	TokenNameCOMMENT_LINE	 
// net_path = "//" authority [ abs_path ] 	TokenNameCOMMENT_LINE	net_path = "//" authority [ abs_path ] 
// abs_path = "/" path_segments 	TokenNameCOMMENT_LINE	abs_path = "/" path_segments 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// Authority will be everything up to path, query or fragment 	TokenNameCOMMENT_LINE	Authority will be everything up to path, query or fragment 
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
'\0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Attempt to parse authority. If the section is an empty string 	TokenNameCOMMENT_LINE	Attempt to parse authority. If the section is an empty string 
// this is a valid server based authority, so set the host to this 	TokenNameCOMMENT_LINE	this is a valid server based authority, so set the host to this 
// value. 	TokenNameCOMMENT_LINE	value. 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we didn't find authority we need to back up. Attempt to 	TokenNameCOMMENT_LINE	If we didn't find authority we need to back up. Attempt to 
// match against abs_path next. 	TokenNameCOMMENT_LINE	match against abs_path next. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initializeAuthority	TokenNameIdentifier	 initialize Authority
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startPos	TokenNameIdentifier	 start Pos
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
startPos	TokenNameIdentifier	 start Pos
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
initializePath	TokenNameIdentifier	 initialize Path
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Resolve relative URI to base URI - see RFC 2396 Section 5.2 	TokenNameCOMMENT_LINE	Resolve relative URI to base URI - see RFC 2396 Section 5.2 
// In some cases, it might make more sense to throw an exception 	TokenNameCOMMENT_LINE	In some cases, it might make more sense to throw an exception 
// (when scheme is specified is the string spec and the base URI 	TokenNameCOMMENT_LINE	(when scheme is specified is the string spec and the base URI 
// is also specified, for example), but we're just following the 	TokenNameCOMMENT_LINE	is also specified, for example), but we're just following the 
// RFC specifications 	TokenNameCOMMENT_LINE	RFC specifications 
if	TokenNameif	
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
absolutize	TokenNameIdentifier	 absolutize
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Initializes this URI from a base URI and a URI specification string. * See RFC 2396 Section 4 and Appendix B for specifications on parsing * the URI and Section 5 for specifications on resolving relative URIs * and relative paths. * * @param p_base the base URI (may be null if p_uriSpec is an absolute * URI) * @param p_uriSpec the URI spec string which may be an absolute or * relative URI (can only be null/empty if p_base * is not null) * * @exception MalformedURIException if p_base is null and p_uriSpec * is not an absolute URI or if * p_uriSpec violates syntax rules */	TokenNameCOMMENT_JAVADOC	 Initializes this URI from a base URI and a URI specification string. See RFC 2396 Section 4 and Appendix B for specifications on parsing the URI and Section 5 for specifications on resolving relative URIs and relative paths. * @param p_base the base URI (may be null if p_uriSpec is an absolute URI) @param p_uriSpec the URI spec string which may be an absolute or relative URI (can only be null/empty if p_base is not null) * @exception MalformedURIException if p_base is null and p_uriSpec is not an absolute URI or if p_uriSpec violates syntax rules 
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
p_base	TokenNameIdentifier	 p base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uriSpec	TokenNameIdentifier	 uri Spec
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
;	TokenNameSEMICOLON	
int	TokenNameint	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Cannot initialize URI with empty parameters."	TokenNameStringLiteral	Cannot initialize URI with empty parameters.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// just make a copy of the base if spec is empty 	TokenNameCOMMENT_LINE	just make a copy of the base if spec is empty 
if	TokenNameif	
(	TokenNameLPAREN	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Check for scheme, which must be before '/', '?' or '#'. 	TokenNameCOMMENT_LINE	Check for scheme, which must be before '/', '?' or '#'. 
int	TokenNameint	
colonIdx	TokenNameIdentifier	 colon Idx
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colonIdx	TokenNameIdentifier	 colon Idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
searchFrom	TokenNameIdentifier	 search From
=	TokenNameEQUAL	
colonIdx	TokenNameIdentifier	 colon Idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// search backwards starting from character before ':'. 	TokenNameCOMMENT_LINE	search backwards starting from character before ':'. 
int	TokenNameint	
slashIdx	TokenNameIdentifier	 slash Idx
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
searchFrom	TokenNameIdentifier	 search From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
queryIdx	TokenNameIdentifier	 query Idx
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
searchFrom	TokenNameIdentifier	 search From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fragmentIdx	TokenNameIdentifier	 fragment Idx
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
searchFrom	TokenNameIdentifier	 search From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colonIdx	TokenNameIdentifier	 colon Idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
slashIdx	TokenNameIdentifier	 slash Idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
queryIdx	TokenNameIdentifier	 query Idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
fragmentIdx	TokenNameIdentifier	 fragment Idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A standalone base is a valid URI according to spec 	TokenNameCOMMENT_LINE	A standalone base is a valid URI according to spec 
if	TokenNameif	
(	TokenNameLPAREN	
colonIdx	TokenNameIdentifier	 colon Idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fragmentIdx	TokenNameIdentifier	 fragment Idx
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"No scheme found in URI."	TokenNameStringLiteral	No scheme found in URI.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
initializeScheme	TokenNameIdentifier	 initialize Scheme
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_scheme	TokenNameIdentifier	 m scheme
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Neither 'scheme:' or 'scheme:#fragment' are valid URIs. 	TokenNameCOMMENT_LINE	Neither 'scheme:' or 'scheme:#fragment' are valid URIs. 
if	TokenNameif	
(	TokenNameLPAREN	
colonIdx	TokenNameIdentifier	 colon Idx
==	TokenNameEQUAL_EQUAL	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
colonIdx	TokenNameIdentifier	 colon Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Scheme specific part cannot be empty."	TokenNameStringLiteral	Scheme specific part cannot be empty.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"No scheme found in URI."	TokenNameStringLiteral	No scheme found in URI.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Two slashes means we may have authority, but definitely means we're either 	TokenNameCOMMENT_LINE	Two slashes means we may have authority, but definitely means we're either 
// matching net_path or abs_path. These two productions are ambiguous in that 	TokenNameCOMMENT_LINE	matching net_path or abs_path. These two productions are ambiguous in that 
// every net_path (except those containing an IPv6Reference) is an abs_path. 	TokenNameCOMMENT_LINE	every net_path (except those containing an IPv6Reference) is an abs_path. 
// RFC 2396 resolves this ambiguity by applying a greedy left most matching rule. 	TokenNameCOMMENT_LINE	RFC 2396 resolves this ambiguity by applying a greedy left most matching rule. 
// Try matching net_path first, and if that fails we don't have authority so 	TokenNameCOMMENT_LINE	Try matching net_path first, and if that fails we don't have authority so 
// then attempt to match abs_path. 	TokenNameCOMMENT_LINE	then attempt to match abs_path. 
// 	TokenNameCOMMENT_LINE	 
// net_path = "//" authority [ abs_path ] 	TokenNameCOMMENT_LINE	net_path = "//" authority [ abs_path ] 
// abs_path = "/" path_segments 	TokenNameCOMMENT_LINE	abs_path = "/" path_segments 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// Authority will be everything up to path, query or fragment 	TokenNameCOMMENT_LINE	Authority will be everything up to path, query or fragment 
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
'\0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Attempt to parse authority. If the section is an empty string 	TokenNameCOMMENT_LINE	Attempt to parse authority. If the section is an empty string 
// this is a valid server based authority, so set the host to this 	TokenNameCOMMENT_LINE	this is a valid server based authority, so set the host to this 
// value. 	TokenNameCOMMENT_LINE	value. 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we didn't find authority we need to back up. Attempt to 	TokenNameCOMMENT_LINE	If we didn't find authority we need to back up. Attempt to 
// match against abs_path next. 	TokenNameCOMMENT_LINE	match against abs_path next. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initializeAuthority	TokenNameIdentifier	 initialize Authority
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startPos	TokenNameIdentifier	 start Pos
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
startPos	TokenNameIdentifier	 start Pos
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
initializePath	TokenNameIdentifier	 initialize Path
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Resolve relative URI to base URI - see RFC 2396 Section 5.2 	TokenNameCOMMENT_LINE	Resolve relative URI to base URI - see RFC 2396 Section 5.2 
// In some cases, it might make more sense to throw an exception 	TokenNameCOMMENT_LINE	In some cases, it might make more sense to throw an exception 
// (when scheme is specified is the string spec and the base URI 	TokenNameCOMMENT_LINE	(when scheme is specified is the string spec and the base URI 
// is also specified, for example), but we're just following the 	TokenNameCOMMENT_LINE	is also specified, for example), but we're just following the 
// RFC specifications 	TokenNameCOMMENT_LINE	RFC specifications 
if	TokenNameif	
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
absolutize	TokenNameIdentifier	 absolutize
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Absolutize URI with given base URI. * * @param p_base base URI for absolutization */	TokenNameCOMMENT_JAVADOC	 Absolutize URI with given base URI. * @param p_base base URI for absolutization 
public	TokenNamepublic	
void	TokenNamevoid	
absolutize	TokenNameIdentifier	 absolutize
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
p_base	TokenNameIdentifier	 p base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check to see if this is the current doc - RFC 2396 5.2 #2 	TokenNameCOMMENT_LINE	check to see if this is the current doc - RFC 2396 5.2 #2 
// note that this is slightly different from the RFC spec in that 	TokenNameCOMMENT_LINE	note that this is slightly different from the RFC spec in that 
// we don't include the check for query string being null 	TokenNameCOMMENT_LINE	we don't include the check for query string being null 
// - this handles cases where the urispec is just a query 	TokenNameCOMMENT_LINE	- this handles cases where the urispec is just a query 
// string or a fragment (e.g. "?y" or "#s") - 	TokenNameCOMMENT_LINE	string or a fragment (e.g. "?y" or "#s") - 
// see <http://www.ics.uci.edu/~fielding/url/test1.html> which 	TokenNameCOMMENT_LINE	see <http://www.ics.uci.edu/~fielding/url/test1.html> which 
// identified this as a bug in the RFC 	TokenNameCOMMENT_LINE	identified this as a bug in the RFC 
if	TokenNameif	
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_scheme	TokenNameIdentifier	 m scheme
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_host	TokenNameIdentifier	 m host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_regAuthority	TokenNameIdentifier	 m reg Authority
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_scheme	TokenNameIdentifier	 m scheme
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getScheme	TokenNameIdentifier	 get Scheme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_userinfo	TokenNameIdentifier	 m userinfo
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getUserinfo	TokenNameIdentifier	 get Userinfo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_port	TokenNameIdentifier	 m port
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_regAuthority	TokenNameIdentifier	 m reg Authority
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getRegBasedAuthority	TokenNameIdentifier	 get Reg Based Authority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_queryString	TokenNameIdentifier	 m query String
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_queryString	TokenNameIdentifier	 m query String
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getQueryString	TokenNameIdentifier	 get Query String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_fragment	TokenNameIdentifier	 m fragment
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_fragment	TokenNameIdentifier	 m fragment
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getFragment	TokenNameIdentifier	 get Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check for scheme - RFC 2396 5.2 #3 	TokenNameCOMMENT_LINE	check for scheme - RFC 2396 5.2 #3 
// if we found a scheme, it means absolute URI, so we're done 	TokenNameCOMMENT_LINE	if we found a scheme, it means absolute URI, so we're done 
if	TokenNameif	
(	TokenNameLPAREN	
m_scheme	TokenNameIdentifier	 m scheme
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_scheme	TokenNameIdentifier	 m scheme
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getScheme	TokenNameIdentifier	 get Scheme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check for authority - RFC 2396 5.2 #4 	TokenNameCOMMENT_LINE	check for authority - RFC 2396 5.2 #4 
// if we found a host, then we've got a network path, so we're done 	TokenNameCOMMENT_LINE	if we found a host, then we've got a network path, so we're done 
if	TokenNameif	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_regAuthority	TokenNameIdentifier	 m reg Authority
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_userinfo	TokenNameIdentifier	 m userinfo
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getUserinfo	TokenNameIdentifier	 get Userinfo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_port	TokenNameIdentifier	 m port
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_regAuthority	TokenNameIdentifier	 m reg Authority
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getRegBasedAuthority	TokenNameIdentifier	 get Reg Based Authority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check for absolute path - RFC 2396 5.2 #5 	TokenNameCOMMENT_LINE	check for absolute path - RFC 2396 5.2 #5 
if	TokenNameif	
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if we get to this point, we need to resolve relative path 	TokenNameCOMMENT_LINE	if we get to this point, we need to resolve relative path 
// RFC 2396 5.2 #6 	TokenNameCOMMENT_LINE	RFC 2396 5.2 #6 
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
basePath	TokenNameIdentifier	 base Path
=	TokenNameEQUAL	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 6a - get all but the last segment of the base URI path 	TokenNameCOMMENT_LINE	6a - get all but the last segment of the base URI path 
if	TokenNameif	
(	TokenNameLPAREN	
basePath	TokenNameIdentifier	 base Path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
basePath	TokenNameIdentifier	 base Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lastSlash	TokenNameIdentifier	 last Slash
=	TokenNameEQUAL	
basePath	TokenNameIdentifier	 base Path
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastSlash	TokenNameIdentifier	 last Slash
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
basePath	TokenNameIdentifier	 base Path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastSlash	TokenNameIdentifier	 last Slash
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
"/"	TokenNameStringLiteral	/
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 6b - append the relative URI path 	TokenNameCOMMENT_LINE	6b - append the relative URI path 
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 6c - remove all "./" where "." is a complete path segment 	TokenNameCOMMENT_LINE	6c - remove all "./" where "." is a complete path segment 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"/./"	TokenNameStringLiteral	/./
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 6d - remove "." if path ends with "." as a complete path segment 	TokenNameCOMMENT_LINE	6d - remove "." if path ends with "." as a complete path segment 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/."	TokenNameStringLiteral	/.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 6e - remove all "<segment>/../" where "<segment>" is a complete 	TokenNameCOMMENT_LINE	6e - remove all "<segment>/../" where "<segment>" is a complete 
// path segment not equal to ".." 	TokenNameCOMMENT_LINE	path segment not equal to ".." 
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
segIndex	TokenNameIdentifier	 seg Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tempString	TokenNameIdentifier	 temp String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"/../"	TokenNameStringLiteral	/../
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempString	TokenNameIdentifier	 temp String
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"/../"	TokenNameStringLiteral	/../
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segIndex	TokenNameIdentifier	 seg Index
=	TokenNameEQUAL	
tempString	TokenNameIdentifier	 temp String
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segIndex	TokenNameIdentifier	 seg Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tempString	TokenNameIdentifier	 temp String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
segIndex	TokenNameIdentifier	 seg Index
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
".."	TokenNameStringLiteral	..
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
segIndex	TokenNameIdentifier	 seg Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
segIndex	TokenNameIdentifier	 seg Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 6f - remove ending "<segment>/.." where "<segment>" is a 	TokenNameCOMMENT_LINE	6f - remove ending "<segment>/.." where "<segment>" is a 
// complete path segment 	TokenNameCOMMENT_LINE	complete path segment 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/.."	TokenNameStringLiteral	/..
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempString	TokenNameIdentifier	 temp String
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segIndex	TokenNameIdentifier	 seg Index
=	TokenNameEQUAL	
tempString	TokenNameIdentifier	 temp String
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segIndex	TokenNameIdentifier	 seg Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
segIndex	TokenNameIdentifier	 seg Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the scheme for this URI from a URI string spec. * * @param p_uriSpec the URI specification (cannot be null) * * @exception MalformedURIException if URI does not have a conformant * scheme */	TokenNameCOMMENT_JAVADOC	 Initialize the scheme for this URI from a URI string spec. * @param p_uriSpec the URI specification (cannot be null) * @exception MalformedURIException if URI does not have a conformant scheme 
private	TokenNameprivate	
void	TokenNamevoid	
initializeScheme	TokenNameIdentifier	 initialize Scheme
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
int	TokenNameint	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
scheme	TokenNameIdentifier	 scheme
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
'\0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scheme	TokenNameIdentifier	 scheme
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scheme	TokenNameIdentifier	 scheme
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"No scheme found in URI."	TokenNameStringLiteral	No scheme found in URI.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setScheme	TokenNameIdentifier	 set Scheme
(	TokenNameLPAREN	
scheme	TokenNameIdentifier	 scheme
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Initialize the authority (either server or registry based) * for this URI from a URI string spec. * * @param p_uriSpec the URI specification (cannot be null) * * @return true if the given string matched server or registry * based authority */	TokenNameCOMMENT_JAVADOC	 Initialize the authority (either server or registry based) for this URI from a URI string spec. * @param p_uriSpec the URI specification (cannot be null) * @return true if the given string matched server or registry based authority 
private	TokenNameprivate	
boolean	TokenNameboolean	
initializeAuthority	TokenNameIdentifier	 initialize Authority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
'\0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
userinfo	TokenNameIdentifier	 userinfo
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// userinfo is everything up to @ 	TokenNameCOMMENT_LINE	userinfo is everything up to @ 
if	TokenNameif	
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
userinfo	TokenNameIdentifier	 userinfo
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// host is everything up to last ':', or up to 	TokenNameCOMMENT_LINE	host is everything up to last ':', or up to 
// and including ']' if followed by ':'. 	TokenNameCOMMENT_LINE	and including ']' if followed by ':'. 
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasPort	TokenNameIdentifier	 has Port
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bracketIndex	TokenNameIdentifier	 bracket Index
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bracketIndex	TokenNameIdentifier	 bracket Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
bracketIndex	TokenNameIdentifier	 bracket Index
:	TokenNameCOLON	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
end	TokenNameIdentifier	 end
&&	TokenNameAND_AND	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
hasPort	TokenNameIdentifier	 has Port
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
colonIndex	TokenNameIdentifier	 colon Index
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
colonIndex	TokenNameIdentifier	 colon Index
>	TokenNameGREATER	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
?	TokenNameQUESTION	
colonIndex	TokenNameIdentifier	 colon Index
:	TokenNameCOLON	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
hasPort	TokenNameIdentifier	 has Port
=	TokenNameEQUAL	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// port 	TokenNameCOMMENT_LINE	port 
if	TokenNameif	
(	TokenNameLPAREN	
hasPort	TokenNameIdentifier	 has Port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
portStr	TokenNameIdentifier	 port Str
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
portStr	TokenNameIdentifier	 port Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: Remove this code. 	TokenNameCOMMENT_LINE	REVISIT: Remove this code. 
/** for (int i = 0; i < portStr.length(); i++) { if (!isDigit(portStr.charAt(i))) { throw new MalformedURIException( portStr + " is invalid. Port should only contain digits!"); } }**/	TokenNameCOMMENT_JAVADOC	 for (int i = 0; i < portStr.length(); i++) { if (!isDigit(portStr.charAt(i))) { throw new MalformedURIException( portStr + " is invalid. Port should only contain digits!"); } }*
// REVISIT: Remove this code. 	TokenNameCOMMENT_LINE	REVISIT: Remove this code. 
// Store port value as string instead of integer. 	TokenNameCOMMENT_LINE	Store port value as string instead of integer. 
try	TokenNametry	
{	TokenNameLBRACE	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
portStr	TokenNameIdentifier	 port Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
--	TokenNameMINUS_MINUS	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isValidServerBasedAuthority	TokenNameIdentifier	 is Valid Server Based Authority
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
userinfo	TokenNameIdentifier	 userinfo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
m_port	TokenNameIdentifier	 m port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
m_userinfo	TokenNameIdentifier	 m userinfo
=	TokenNameEQUAL	
userinfo	TokenNameIdentifier	 userinfo
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Note: Registry based authority is being removed from a 	TokenNameCOMMENT_LINE	Note: Registry based authority is being removed from a 
// new spec for URI which would obsolete RFC 2396. If the 	TokenNameCOMMENT_LINE	new spec for URI which would obsolete RFC 2396. If the 
// spec is added to XML errata, processing of reg_name 	TokenNameCOMMENT_LINE	spec is added to XML errata, processing of reg_name 
// needs to be removed. - mrglavas. 	TokenNameCOMMENT_LINE	needs to be removed. - mrglavas. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isValidRegistryBasedAuthority	TokenNameIdentifier	 is Valid Registry Based Authority
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_regAuthority	TokenNameIdentifier	 m reg Authority
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines whether the components host, port, and user info * are valid as a server authority. * * @param host the host component of authority * @param port the port number component of authority * @param userinfo the user info component of authority * * @return true if the given host, port, and userinfo compose * a valid server authority */	TokenNameCOMMENT_JAVADOC	 Determines whether the components host, port, and user info are valid as a server authority. * @param host the host component of authority @param port the port number component of authority @param userinfo the user info component of authority * @return true if the given host, port, and userinfo compose a valid server authority 
private	TokenNameprivate	
boolean	TokenNameboolean	
isValidServerBasedAuthority	TokenNameIdentifier	 is Valid Server Based Authority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
userinfo	TokenNameIdentifier	 userinfo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check if the host is well formed. 	TokenNameCOMMENT_LINE	Check if the host is well formed. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWellFormedAddress	TokenNameIdentifier	 is Well Formed Address
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check that port is well formed if it exists. 	TokenNameCOMMENT_LINE	Check that port is well formed if it exists. 
// REVISIT: There's no restriction on port value ranges, but 	TokenNameCOMMENT_LINE	REVISIT: There's no restriction on port value ranges, but 
// perform the same check as in setPort to be consistent. Pass 	TokenNameCOMMENT_LINE	perform the same check as in setPort to be consistent. Pass 
// in a string to this method instead of an integer. 	TokenNameCOMMENT_LINE	in a string to this method instead of an integer. 
if	TokenNameif	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
<	TokenNameLESS	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
port	TokenNameIdentifier	 port
>	TokenNameGREATER	
65535	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check that userinfo is well formed if it exists. 	TokenNameCOMMENT_LINE	Check that userinfo is well formed if it exists. 
if	TokenNameif	
(	TokenNameLPAREN	
userinfo	TokenNameIdentifier	 userinfo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Userinfo can contain alphanumerics, mark characters, escaped 	TokenNameCOMMENT_LINE	Userinfo can contain alphanumerics, mark characters, escaped 
// and ';',':','&','=','+','$',',' 	TokenNameCOMMENT_LINE	and ';',':','&','=','+','$',',' 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
userinfo	TokenNameIdentifier	 userinfo
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
'\0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
userinfo	TokenNameIdentifier	 userinfo
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
userinfo	TokenNameIdentifier	 userinfo
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
userinfo	TokenNameIdentifier	 userinfo
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isUserinfoCharacter	TokenNameIdentifier	 is Userinfo Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines whether the given string is a registry based authority. * * @param authority the authority component of a URI * * @return true if the given string is a registry based authority */	TokenNameCOMMENT_JAVADOC	 Determines whether the given string is a registry based authority. * @param authority the authority component of a URI * @return true if the given string is a registry based authority 
private	TokenNameprivate	
boolean	TokenNameboolean	
isValidRegistryBasedAuthority	TokenNameIdentifier	 is Valid Registry Based Authority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
authority	TokenNameIdentifier	 authority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for valid escape sequence 	TokenNameCOMMENT_LINE	check for valid escape sequence 
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// can check against path characters because the set 	TokenNameCOMMENT_LINE	can check against path characters because the set 
// is the same except for '/' which we've already excluded. 	TokenNameCOMMENT_LINE	is the same except for '/' which we've already excluded. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isPathCharacter	TokenNameIdentifier	 is Path Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the path for this URI from a URI string spec. * * @param p_uriSpec the URI specification (cannot be null) * @param p_nStartIndex the index to begin scanning from * * @exception MalformedURIException if p_uriSpec violates syntax rules */	TokenNameCOMMENT_JAVADOC	 Initialize the path for this URI from a URI string spec. * @param p_uriSpec the URI specification (cannot be null) @param p_nStartIndex the index to begin scanning from * @exception MalformedURIException if p_uriSpec violates syntax rules 
private	TokenNameprivate	
void	TokenNamevoid	
initializePath	TokenNameIdentifier	 initialize Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
,	TokenNameCOMMA	
int	TokenNameint	
p_nStartIndex	TokenNameIdentifier	 p n Start Index
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Cannot initialize path from null string!"	TokenNameStringLiteral	Cannot initialize path from null string!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
p_nStartIndex	TokenNameIdentifier	 p n Start Index
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
p_nStartIndex	TokenNameIdentifier	 p n Start Index
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
'\0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// path - everything up to query string or fragment 	TokenNameCOMMENT_LINE	path - everything up to query string or fragment 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// RFC 2732 only allows '[' and ']' to appear in the opaque part. 	TokenNameCOMMENT_LINE	RFC 2732 only allows '[' and ']' to appear in the opaque part. 
if	TokenNameif	
(	TokenNameLPAREN	
getScheme	TokenNameIdentifier	 get Scheme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Scan path. 	TokenNameCOMMENT_LINE	Scan path. 
// abs_path = "/" path_segments 	TokenNameCOMMENT_LINE	abs_path = "/" path_segments 
// rel_path = rel_segment [ abs_path ] 	TokenNameCOMMENT_LINE	rel_path = rel_segment [ abs_path ] 
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for valid escape sequence 	TokenNameCOMMENT_LINE	check for valid escape sequence 
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Path contains invalid escape sequence!"	TokenNameStringLiteral	Path contains invalid escape sequence!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Path segments cannot contain '[' or ']' since pchar 	TokenNameCOMMENT_LINE	Path segments cannot contain '[' or ']' since pchar 
// production was not changed by RFC 2732. 	TokenNameCOMMENT_LINE	production was not changed by RFC 2732. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isPathCharacter	TokenNameIdentifier	 is Path Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Path contains invalid character: "	TokenNameStringLiteral	Path contains invalid character: 
+	TokenNamePLUS	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Scan opaque part. 	TokenNameCOMMENT_LINE	Scan opaque part. 
// opaque_part = uric_no_slash *uric 	TokenNameCOMMENT_LINE	opaque_part = uric_no_slash *uric 
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check for valid escape sequence 	TokenNameCOMMENT_LINE	check for valid escape sequence 
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Opaque part contains invalid escape sequence!"	TokenNameStringLiteral	Opaque part contains invalid escape sequence!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the scheme specific part is opaque, it can contain '[' 	TokenNameCOMMENT_LINE	If the scheme specific part is opaque, it can contain '[' 
// and ']'. uric_no_slash wasn't modified by RFC 2732, which 	TokenNameCOMMENT_LINE	and ']'. uric_no_slash wasn't modified by RFC 2732, which 
// I've interpreted as an error in the spec, since the 	TokenNameCOMMENT_LINE	I've interpreted as an error in the spec, since the 
// production should be equivalent to (uric - '/'), and uric 	TokenNameCOMMENT_LINE	production should be equivalent to (uric - '/'), and uric 
// contains '[' and ']'. - mrglavas 	TokenNameCOMMENT_LINE	contains '[' and ']'. - mrglavas 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isURICharacter	TokenNameIdentifier	 is URI Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Opaque part contains invalid character: "	TokenNameStringLiteral	Opaque part contains invalid character: 
+	TokenNamePLUS	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// query - starts with ? and up to fragment or end 	TokenNameCOMMENT_LINE	query - starts with ? and up to fragment or end 
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Query string contains invalid escape sequence!"	TokenNameStringLiteral	Query string contains invalid escape sequence!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isURICharacter	TokenNameIdentifier	 is URI Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Query string contains invalid character: "	TokenNameStringLiteral	Query string contains invalid character: 
+	TokenNamePLUS	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_queryString	TokenNameIdentifier	 m query String
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fragment - starts with # 	TokenNameCOMMENT_LINE	fragment - starts with # 
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Fragment contains invalid escape sequence!"	TokenNameStringLiteral	Fragment contains invalid escape sequence!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isURICharacter	TokenNameIdentifier	 is URI Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Fragment contains invalid character: "	TokenNameStringLiteral	Fragment contains invalid character: 
+	TokenNamePLUS	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_fragment	TokenNameIdentifier	 m fragment
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the scheme for this URI. * * @return the scheme for this URI */	TokenNameCOMMENT_JAVADOC	 Get the scheme for this URI. * @return the scheme for this URI 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getScheme	TokenNameIdentifier	 get Scheme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_scheme	TokenNameIdentifier	 m scheme
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the scheme-specific part for this URI (everything following the * scheme and the first colon). See RFC 2396 Section 5.2 for spec. * * @return the scheme-specific part for this URI */	TokenNameCOMMENT_JAVADOC	 Get the scheme-specific part for this URI (everything following the scheme and the first colon). See RFC 2396 Section 5.2 for spec. * @return the scheme-specific part for this URI 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemeSpecificPart	TokenNameIdentifier	 get Scheme Specific Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
schemespec	TokenNameIdentifier	 schemespec
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
m_regAuthority	TokenNameIdentifier	 m reg Authority
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"//"	TokenNameStringLiteral	//
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Server based authority. 	TokenNameCOMMENT_LINE	Server based authority. 
if	TokenNameif	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_userinfo	TokenNameIdentifier	 m userinfo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_userinfo	TokenNameIdentifier	 m userinfo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_port	TokenNameIdentifier	 m port
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_port	TokenNameIdentifier	 m port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Registry based authority. 	TokenNameCOMMENT_LINE	Registry based authority. 
else	TokenNameelse	
{	TokenNameLBRACE	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_regAuthority	TokenNameIdentifier	 m reg Authority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_queryString	TokenNameIdentifier	 m query String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_queryString	TokenNameIdentifier	 m query String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_fragment	TokenNameIdentifier	 m fragment
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_fragment	TokenNameIdentifier	 m fragment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the userinfo for this URI. * * @return the userinfo for this URI (null if not specified). */	TokenNameCOMMENT_JAVADOC	 Get the userinfo for this URI. * @return the userinfo for this URI (null if not specified). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserinfo	TokenNameIdentifier	 get Userinfo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_userinfo	TokenNameIdentifier	 m userinfo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the host for this URI. * * @return the host for this URI (null if not specified). */	TokenNameCOMMENT_JAVADOC	 Get the host for this URI. * @return the host for this URI (null if not specified). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_host	TokenNameIdentifier	 m host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the port for this URI. * * @return the port for this URI (-1 if not specified). */	TokenNameCOMMENT_JAVADOC	 Get the port for this URI. * @return the port for this URI (-1 if not specified). 
public	TokenNamepublic	
int	TokenNameint	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_port	TokenNameIdentifier	 m port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the registry based authority for this URI. * * @return the registry based authority (null if not specified). */	TokenNameCOMMENT_JAVADOC	 Get the registry based authority for this URI. * @return the registry based authority (null if not specified). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRegBasedAuthority	TokenNameIdentifier	 get Reg Based Authority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_regAuthority	TokenNameIdentifier	 m reg Authority
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the authority for this URI. * * @return the authority */	TokenNameCOMMENT_JAVADOC	 Get the authority for this URI. * @return the authority 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAuthority	TokenNameIdentifier	 get Authority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
authority	TokenNameIdentifier	 authority
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
m_regAuthority	TokenNameIdentifier	 m reg Authority
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"//"	TokenNameStringLiteral	//
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Server based authority. 	TokenNameCOMMENT_LINE	Server based authority. 
if	TokenNameif	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_userinfo	TokenNameIdentifier	 m userinfo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_userinfo	TokenNameIdentifier	 m userinfo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_port	TokenNameIdentifier	 m port
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_port	TokenNameIdentifier	 m port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Registry based authority. 	TokenNameCOMMENT_LINE	Registry based authority. 
else	TokenNameelse	
{	TokenNameLBRACE	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_regAuthority	TokenNameIdentifier	 m reg Authority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the path for this URI (optionally with the query string and * fragment). * * @param p_includeQueryString if true (and query string is not null), * then a "?" followed by the query string * will be appended * @param p_includeFragment if true (and fragment is not null), * then a "#" followed by the fragment * will be appended * * @return the path for this URI possibly including the query string * and fragment */	TokenNameCOMMENT_JAVADOC	 Get the path for this URI (optionally with the query string and fragment). * @param p_includeQueryString if true (and query string is not null), then a "?" followed by the query string will be appended @param p_includeFragment if true (and fragment is not null), then a "#" followed by the fragment will be appended * @return the path for this URI possibly including the query string and fragment 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
boolean	TokenNameboolean	
p_includeQueryString	TokenNameIdentifier	 p include Query String
,	TokenNameCOMMA	
boolean	TokenNameboolean	
p_includeFragment	TokenNameIdentifier	 p include Fragment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
pathString	TokenNameIdentifier	 path String
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p_includeQueryString	TokenNameIdentifier	 p include Query String
&&	TokenNameAND_AND	
m_queryString	TokenNameIdentifier	 m query String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_queryString	TokenNameIdentifier	 m query String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_includeFragment	TokenNameIdentifier	 p include Fragment
&&	TokenNameAND_AND	
m_fragment	TokenNameIdentifier	 m fragment
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_fragment	TokenNameIdentifier	 m fragment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the path for this URI. Note that the value returned is the path * only and does not include the query string or fragment. * * @return the path for this URI. */	TokenNameCOMMENT_JAVADOC	 Get the path for this URI. Note that the value returned is the path only and does not include the query string or fragment. * @return the path for this URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_path	TokenNameIdentifier	 m path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the query string for this URI. * * @return the query string for this URI. Null is returned if there * was no "?" in the URI spec, empty string if there was a * "?" but no query string following it. */	TokenNameCOMMENT_JAVADOC	 Get the query string for this URI. * @return the query string for this URI. Null is returned if there was no "?" in the URI spec, empty string if there was a "?" but no query string following it. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getQueryString	TokenNameIdentifier	 get Query String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_queryString	TokenNameIdentifier	 m query String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the fragment for this URI. * * @return the fragment for this URI. Null is returned if there * was no "#" in the URI spec, empty string if there was a * "#" but no fragment following it. */	TokenNameCOMMENT_JAVADOC	 Get the fragment for this URI. * @return the fragment for this URI. Null is returned if there was no "#" in the URI spec, empty string if there was a "#" but no fragment following it. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFragment	TokenNameIdentifier	 get Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_fragment	TokenNameIdentifier	 m fragment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the scheme for this URI. The scheme is converted to lowercase * before it is set. * * @param p_scheme the scheme for this URI (cannot be null) * * @exception MalformedURIException if p_scheme is not a conformant * scheme name */	TokenNameCOMMENT_JAVADOC	 Set the scheme for this URI. The scheme is converted to lowercase before it is set. * @param p_scheme the scheme for this URI (cannot be null) * @exception MalformedURIException if p_scheme is not a conformant scheme name 
public	TokenNamepublic	
void	TokenNamevoid	
setScheme	TokenNameIdentifier	 set Scheme
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_scheme	TokenNameIdentifier	 p scheme
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_scheme	TokenNameIdentifier	 p scheme
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Cannot set scheme from null string!"	TokenNameStringLiteral	Cannot set scheme from null string!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isConformantSchemeName	TokenNameIdentifier	 is Conformant Scheme Name
(	TokenNameLPAREN	
p_scheme	TokenNameIdentifier	 p scheme
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"The scheme is not conformant."	TokenNameStringLiteral	The scheme is not conformant.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_scheme	TokenNameIdentifier	 m scheme
=	TokenNameEQUAL	
p_scheme	TokenNameIdentifier	 p scheme
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the userinfo for this URI. If a non-null value is passed in and * the host value is null, then an exception is thrown. * * @param p_userinfo the userinfo for this URI * * @exception MalformedURIException if p_userinfo contains invalid * characters */	TokenNameCOMMENT_JAVADOC	 Set the userinfo for this URI. If a non-null value is passed in and the host value is null, then an exception is thrown. * @param p_userinfo the userinfo for this URI * @exception MalformedURIException if p_userinfo contains invalid characters 
public	TokenNamepublic	
void	TokenNamevoid	
setUserinfo	TokenNameIdentifier	 set Userinfo
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_userinfo	TokenNameIdentifier	 p userinfo
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_userinfo	TokenNameIdentifier	 p userinfo
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_userinfo	TokenNameIdentifier	 m userinfo
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Userinfo cannot be set when host is null!"	TokenNameStringLiteral	Userinfo cannot be set when host is null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// userinfo can contain alphanumerics, mark characters, escaped 	TokenNameCOMMENT_LINE	userinfo can contain alphanumerics, mark characters, escaped 
// and ';',':','&','=','+','$',',' 	TokenNameCOMMENT_LINE	and ';',':','&','=','+','$',',' 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
p_userinfo	TokenNameIdentifier	 p userinfo
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
'\0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
p_userinfo	TokenNameIdentifier	 p userinfo
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_userinfo	TokenNameIdentifier	 p userinfo
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_userinfo	TokenNameIdentifier	 p userinfo
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Userinfo contains invalid escape sequence!"	TokenNameStringLiteral	Userinfo contains invalid escape sequence!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isUserinfoCharacter	TokenNameIdentifier	 is Userinfo Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Userinfo contains invalid character:"	TokenNameStringLiteral	Userinfo contains invalid character:
+	TokenNamePLUS	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_userinfo	TokenNameIdentifier	 m userinfo
=	TokenNameEQUAL	
p_userinfo	TokenNameIdentifier	 p userinfo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set the host for this URI. If null is passed in, the userinfo * field is also set to null and the port is set to -1.</p> * * <p>Note: This method overwrites registry based authority if it * previously existed in this URI.</p> * * @param p_host the host for this URI * * @exception MalformedURIException if p_host is not a valid IP * address or DNS hostname. */	TokenNameCOMMENT_JAVADOC	 <p>Set the host for this URI. If null is passed in, the userinfo field is also set to null and the port is set to -1.</p> * <p>Note: This method overwrites registry based authority if it previously existed in this URI.</p> * @param p_host the host for this URI * @exception MalformedURIException if p_host is not a valid IP address or DNS hostname. 
public	TokenNamepublic	
void	TokenNamevoid	
setHost	TokenNameIdentifier	 set Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_host	TokenNameIdentifier	 p host
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_host	TokenNameIdentifier	 p host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
p_host	TokenNameIdentifier	 p host
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_host	TokenNameIdentifier	 p host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_regAuthority	TokenNameIdentifier	 m reg Authority
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
p_host	TokenNameIdentifier	 p host
;	TokenNameSEMICOLON	
m_userinfo	TokenNameIdentifier	 m userinfo
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_port	TokenNameIdentifier	 m port
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWellFormedAddress	TokenNameIdentifier	 is Well Formed Address
(	TokenNameLPAREN	
p_host	TokenNameIdentifier	 p host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Host is not a well formed address!"	TokenNameStringLiteral	Host is not a well formed address!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
p_host	TokenNameIdentifier	 p host
;	TokenNameSEMICOLON	
m_regAuthority	TokenNameIdentifier	 m reg Authority
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the port for this URI. -1 is used to indicate that the port is * not specified, otherwise valid port numbers are between 0 and 65535. * If a valid port number is passed in and the host field is null, * an exception is thrown. * * @param p_port the port number for this URI * * @exception MalformedURIException if p_port is not -1 and not a * valid port number */	TokenNameCOMMENT_JAVADOC	 Set the port for this URI. -1 is used to indicate that the port is not specified, otherwise valid port numbers are between 0 and 65535. If a valid port number is passed in and the host field is null, an exception is thrown. * @param p_port the port number for this URI * @exception MalformedURIException if p_port is not -1 and not a valid port number 
public	TokenNamepublic	
void	TokenNamevoid	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
int	TokenNameint	
p_port	TokenNameIdentifier	 p port
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_port	TokenNameIdentifier	 p port
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
p_port	TokenNameIdentifier	 p port
<=	TokenNameLESS_EQUAL	
65535	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Port cannot be set when host is null!"	TokenNameStringLiteral	Port cannot be set when host is null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
p_port	TokenNameIdentifier	 p port
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Invalid port number!"	TokenNameStringLiteral	Invalid port number!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_port	TokenNameIdentifier	 m port
=	TokenNameEQUAL	
p_port	TokenNameIdentifier	 p port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Sets the registry based authority for this URI.</p> * * <p>Note: This method overwrites server based authority * if it previously existed in this URI.</p> * * @param authority the registry based authority for this URI * * @exception MalformedURIException it authority is not a * well formed registry based authority */	TokenNameCOMMENT_JAVADOC	 <p>Sets the registry based authority for this URI.</p> * <p>Note: This method overwrites server based authority if it previously existed in this URI.</p> * @param authority the registry based authority for this URI * @exception MalformedURIException it authority is not a well formed registry based authority 
public	TokenNamepublic	
void	TokenNamevoid	
setRegBasedAuthority	TokenNameIdentifier	 set Reg Based Authority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
authority	TokenNameIdentifier	 authority
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
authority	TokenNameIdentifier	 authority
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_regAuthority	TokenNameIdentifier	 m reg Authority
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reg_name = 1*( unreserved | escaped | "$" | "," | 	TokenNameCOMMENT_LINE	reg_name = 1*( unreserved | escaped | "$" | "," | 
// ";" | ":" | "@" | "&" | "=" | "+" ) 	TokenNameCOMMENT_LINE	";" | ":" | "@" | "&" | "=" | "+" ) 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
isValidRegistryBasedAuthority	TokenNameIdentifier	 is Valid Registry Based Authority
(	TokenNameLPAREN	
authority	TokenNameIdentifier	 authority
)	TokenNameRPAREN	
||	TokenNameOR_OR	
authority	TokenNameIdentifier	 authority
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Registry based authority is not well formed."	TokenNameStringLiteral	Registry based authority is not well formed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_regAuthority	TokenNameIdentifier	 m reg Authority
=	TokenNameEQUAL	
authority	TokenNameIdentifier	 authority
;	TokenNameSEMICOLON	
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_userinfo	TokenNameIdentifier	 m userinfo
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_port	TokenNameIdentifier	 m port
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the path for this URI. If the supplied path is null, then the * query string and fragment are set to null as well. If the supplied * path includes a query string and/or fragment, these fields will be * parsed and set as well. Note that, for URIs following the "generic * URI" syntax, the path specified should start with a slash. * For URIs that do not follow the generic URI syntax, this method * sets the scheme-specific part. * * @param p_path the path for this URI (may be null) * * @exception MalformedURIException if p_path contains invalid * characters */	TokenNameCOMMENT_JAVADOC	 Set the path for this URI. If the supplied path is null, then the query string and fragment are set to null as well. If the supplied path includes a query string and/or fragment, these fields will be parsed and set as well. Note that, for URIs following the "generic URI" syntax, the path specified should start with a slash. For URIs that do not follow the generic URI syntax, this method sets the scheme-specific part. * @param p_path the path for this URI (may be null) * @exception MalformedURIException if p_path contains invalid characters 
public	TokenNamepublic	
void	TokenNamevoid	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_path	TokenNameIdentifier	 p path
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_path	TokenNameIdentifier	 p path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_queryString	TokenNameIdentifier	 m query String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_fragment	TokenNameIdentifier	 m fragment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
initializePath	TokenNameIdentifier	 initialize Path
(	TokenNameLPAREN	
p_path	TokenNameIdentifier	 p path
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append to the end of the path of this URI. If the current path does * not end in a slash and the path to be appended does not begin with * a slash, a slash will be appended to the current path before the * new segment is added. Also, if the current path ends in a slash * and the new segment begins with a slash, the extra slash will be * removed before the new segment is appended. * * @param p_addToPath the new segment to be added to the current path * * @exception MalformedURIException if p_addToPath contains syntax * errors */	TokenNameCOMMENT_JAVADOC	 Append to the end of the path of this URI. If the current path does not end in a slash and the path to be appended does not begin with a slash, a slash will be appended to the current path before the new segment is added. Also, if the current path ends in a slash and the new segment begins with a slash, the extra slash will be removed before the new segment is appended. * @param p_addToPath the new segment to be added to the current path * @exception MalformedURIException if p_addToPath contains syntax errors 
public	TokenNamepublic	
void	TokenNamevoid	
appendPath	TokenNameIdentifier	 append Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_addToPath	TokenNameIdentifier	 p add To Path
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_addToPath	TokenNameIdentifier	 p add To Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
p_addToPath	TokenNameIdentifier	 p add To Path
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isURIString	TokenNameIdentifier	 is URI String
(	TokenNameLPAREN	
p_addToPath	TokenNameIdentifier	 p add To Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Path contains invalid character!"	TokenNameStringLiteral	Path contains invalid character!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_addToPath	TokenNameIdentifier	 p add To Path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
p_addToPath	TokenNameIdentifier	 p add To Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
p_addToPath	TokenNameIdentifier	 p add To Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_addToPath	TokenNameIdentifier	 p add To Path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
p_addToPath	TokenNameIdentifier	 p add To Path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
p_addToPath	TokenNameIdentifier	 p add To Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_addToPath	TokenNameIdentifier	 p add To Path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
p_addToPath	TokenNameIdentifier	 p add To Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
p_addToPath	TokenNameIdentifier	 p add To Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the query string for this URI. A non-null value is valid only * if this is an URI conforming to the generic URI syntax and * the path value is not null. * * @param p_queryString the query string for this URI * * @exception MalformedURIException if p_queryString is not null and this * URI does not conform to the generic * URI syntax or if the path is null */	TokenNameCOMMENT_JAVADOC	 Set the query string for this URI. A non-null value is valid only if this is an URI conforming to the generic URI syntax and the path value is not null. * @param p_queryString the query string for this URI * @exception MalformedURIException if p_queryString is not null and this URI does not conform to the generic URI syntax or if the path is null 
public	TokenNamepublic	
void	TokenNamevoid	
setQueryString	TokenNameIdentifier	 set Query String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_queryString	TokenNameIdentifier	 p query String
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_queryString	TokenNameIdentifier	 p query String
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_queryString	TokenNameIdentifier	 m query String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isGenericURI	TokenNameIdentifier	 is Generic URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Query string can only be set for a generic URI!"	TokenNameStringLiteral	Query string can only be set for a generic URI!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Query string cannot be set when path is null!"	TokenNameStringLiteral	Query string cannot be set when path is null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isURIString	TokenNameIdentifier	 is URI String
(	TokenNameLPAREN	
p_queryString	TokenNameIdentifier	 p query String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Query string contains invalid character!"	TokenNameStringLiteral	Query string contains invalid character!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_queryString	TokenNameIdentifier	 m query String
=	TokenNameEQUAL	
p_queryString	TokenNameIdentifier	 p query String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the fragment for this URI. A non-null value is valid only * if this is a URI conforming to the generic URI syntax and * the path value is not null. * * @param p_fragment the fragment for this URI * * @exception MalformedURIException if p_fragment is not null and this * URI does not conform to the generic * URI syntax or if the path is null */	TokenNameCOMMENT_JAVADOC	 Set the fragment for this URI. A non-null value is valid only if this is a URI conforming to the generic URI syntax and the path value is not null. * @param p_fragment the fragment for this URI * @exception MalformedURIException if p_fragment is not null and this URI does not conform to the generic URI syntax or if the path is null 
public	TokenNamepublic	
void	TokenNamevoid	
setFragment	TokenNameIdentifier	 set Fragment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_fragment	TokenNameIdentifier	 p fragment
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_fragment	TokenNameIdentifier	 p fragment
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_fragment	TokenNameIdentifier	 m fragment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isGenericURI	TokenNameIdentifier	 is Generic URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Fragment can only be set for a generic URI!"	TokenNameStringLiteral	Fragment can only be set for a generic URI!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Fragment cannot be set when path is null!"	TokenNameStringLiteral	Fragment cannot be set when path is null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isURIString	TokenNameIdentifier	 is URI String
(	TokenNameLPAREN	
p_fragment	TokenNameIdentifier	 p fragment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Fragment contains invalid character!"	TokenNameStringLiteral	Fragment contains invalid character!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_fragment	TokenNameIdentifier	 m fragment
=	TokenNameEQUAL	
p_fragment	TokenNameIdentifier	 p fragment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Determines if the passed-in Object is equivalent to this URI. * * @param p_test the Object to test for equality. * * @return true if p_test is a URI with all values equal to this * URI, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determines if the passed-in Object is equivalent to this URI. * @param p_test the Object to test for equality. * @return true if p_test is a URI with all values equal to this URI, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
p_test	TokenNameIdentifier	 p test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_test	TokenNameIdentifier	 p test
instanceof	TokenNameinstanceof	
URI	TokenNameIdentifier	 URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URI	TokenNameIdentifier	 URI
testURI	TokenNameIdentifier	 test URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
)	TokenNameRPAREN	
p_test	TokenNameIdentifier	 p test
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_scheme	TokenNameIdentifier	 m scheme
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_scheme	TokenNameIdentifier	 m scheme
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_scheme	TokenNameIdentifier	 m scheme
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_scheme	TokenNameIdentifier	 m scheme
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_scheme	TokenNameIdentifier	 m scheme
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_scheme	TokenNameIdentifier	 m scheme
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_userinfo	TokenNameIdentifier	 m userinfo
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_userinfo	TokenNameIdentifier	 m userinfo
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_userinfo	TokenNameIdentifier	 m userinfo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_userinfo	TokenNameIdentifier	 m userinfo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_userinfo	TokenNameIdentifier	 m userinfo
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_userinfo	TokenNameIdentifier	 m userinfo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_host	TokenNameIdentifier	 m host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_host	TokenNameIdentifier	 m host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_host	TokenNameIdentifier	 m host
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_host	TokenNameIdentifier	 m host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_port	TokenNameIdentifier	 m port
==	TokenNameEQUAL_EQUAL	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_port	TokenNameIdentifier	 m port
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_path	TokenNameIdentifier	 m path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_path	TokenNameIdentifier	 m path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_path	TokenNameIdentifier	 m path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_path	TokenNameIdentifier	 m path
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_path	TokenNameIdentifier	 m path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_queryString	TokenNameIdentifier	 m query String
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_queryString	TokenNameIdentifier	 m query String
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_queryString	TokenNameIdentifier	 m query String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_queryString	TokenNameIdentifier	 m query String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_queryString	TokenNameIdentifier	 m query String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_queryString	TokenNameIdentifier	 m query String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_fragment	TokenNameIdentifier	 m fragment
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_fragment	TokenNameIdentifier	 m fragment
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_fragment	TokenNameIdentifier	 m fragment
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_fragment	TokenNameIdentifier	 m fragment
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_fragment	TokenNameIdentifier	 m fragment
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testURI	TokenNameIdentifier	 test URI
.	TokenNameDOT	
m_fragment	TokenNameIdentifier	 m fragment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the URI as a string specification. See RFC 2396 Section 5.2. * * @return the URI string specification */	TokenNameCOMMENT_JAVADOC	 Get the URI as a string specification. See RFC 2396 Section 5.2. * @return the URI string specification 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
uriSpecString	TokenNameIdentifier	 uri Spec String
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_scheme	TokenNameIdentifier	 m scheme
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uriSpecString	TokenNameIdentifier	 uri Spec String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_scheme	TokenNameIdentifier	 m scheme
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uriSpecString	TokenNameIdentifier	 uri Spec String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
uriSpecString	TokenNameIdentifier	 uri Spec String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getSchemeSpecificPart	TokenNameIdentifier	 get Scheme Specific Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
uriSpecString	TokenNameIdentifier	 uri Spec String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the indicator as to whether this URI uses the "generic URI" * syntax. * * @return true if this URI uses the "generic URI" syntax, false * otherwise */	TokenNameCOMMENT_JAVADOC	 Get the indicator as to whether this URI uses the "generic URI" syntax. * @return true if this URI uses the "generic URI" syntax, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isGenericURI	TokenNameIdentifier	 is Generic URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// presence of the host (whether valid or empty) means 	TokenNameCOMMENT_LINE	presence of the host (whether valid or empty) means 
// double-slashes which means generic uri 	TokenNameCOMMENT_LINE	double-slashes which means generic uri 
return	TokenNamereturn	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this URI represents an absolute URI. * * @return true if this URI represents an absolute URI, false * otherwise */	TokenNameCOMMENT_JAVADOC	 Returns whether this URI represents an absolute URI. * @return true if this URI represents an absolute URI, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAbsoluteURI	TokenNameIdentifier	 is Absolute URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// presence of the scheme means absolute uri 	TokenNameCOMMENT_LINE	presence of the scheme means absolute uri 
return	TokenNamereturn	
(	TokenNameLPAREN	
m_scheme	TokenNameIdentifier	 m scheme
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a scheme conforms to the rules for a scheme name. * A scheme is conformant if it starts with an alphanumeric, and * contains only alphanumerics, '+','-' and '.'. * * @return true if the scheme is conformant, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a scheme conforms to the rules for a scheme name. A scheme is conformant if it starts with an alphanumeric, and contains only alphanumerics, '+','-' and '.'. * @return true if the scheme is conformant, false otherwise 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isConformantSchemeName	TokenNameIdentifier	 is Conformant Scheme Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_scheme	TokenNameIdentifier	 p scheme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_scheme	TokenNameIdentifier	 p scheme
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
p_scheme	TokenNameIdentifier	 p scheme
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAlpha	TokenNameIdentifier	 is Alpha
(	TokenNameLPAREN	
p_scheme	TokenNameIdentifier	 p scheme
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
;	TokenNameSEMICOLON	
int	TokenNameint	
schemeLength	TokenNameIdentifier	 scheme Length
=	TokenNameEQUAL	
p_scheme	TokenNameIdentifier	 p scheme
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
schemeLength	TokenNameIdentifier	 scheme Length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
p_scheme	TokenNameIdentifier	 p scheme
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSchemeCharacter	TokenNameIdentifier	 is Scheme Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
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
/** * Determine whether a string is syntactically capable of representing * a valid IPv4 address, IPv6 reference or the domain name of a network host. * A valid IPv4 address consists of four decimal digit groups separated by a * '.'. Each group must consist of one to three digits. See RFC 2732 Section 3, * and RFC 2373 Section 2.2, for the definition of IPv6 references. A hostname * consists of domain labels (each of which must begin and end with an alphanumeric * but may contain '-') separated & by a '.'. See RFC 2396 Section 3.2.2. * * @return true if the string is a syntactically valid IPv4 address, * IPv6 reference or hostname */	TokenNameCOMMENT_JAVADOC	 Determine whether a string is syntactically capable of representing a valid IPv4 address, IPv6 reference or the domain name of a network host. A valid IPv4 address consists of four decimal digit groups separated by a '.'. Each group must consist of one to three digits. See RFC 2732 Section 3, and RFC 2373 Section 2.2, for the definition of IPv6 references. A hostname consists of domain labels (each of which must begin and end with an alphanumeric but may contain '-') separated & by a '.'. See RFC 2396 Section 3.2.2. * @return true if the string is a syntactically valid IPv4 address, IPv6 reference or hostname 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isWellFormedAddress	TokenNameIdentifier	 is Well Formed Address
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
addrLength	TokenNameIdentifier	 addr Length
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
addrLength	TokenNameIdentifier	 addr Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check if the host is a valid IPv6reference. 	TokenNameCOMMENT_LINE	Check if the host is a valid IPv6reference. 
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isWellFormedIPv6Reference	TokenNameIdentifier	 is Well Formed I Pv6 Reference
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Cannot start with a '.', '-', or end with a '-'. 	TokenNameCOMMENT_LINE	Cannot start with a '.', '-', or end with a '-'. 
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
||	TokenNameOR_OR	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
||	TokenNameOR_OR	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// rightmost domain label starting with digit indicates IP address 	TokenNameCOMMENT_LINE	rightmost domain label starting with digit indicates IP address 
// since top level domain label can only start with an alpha 	TokenNameCOMMENT_LINE	since top level domain label can only start with an alpha 
// see RFC 2396 Section 3.2.2 	TokenNameCOMMENT_LINE	see RFC 2396 Section 3.2.2 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
addrLength	TokenNameIdentifier	 addr Length
&&	TokenNameAND_AND	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isWellFormedIPv4Address	TokenNameIdentifier	 is Well Formed I Pv4 Address
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// hostname = *( domainlabel "." ) toplabel [ "." ] 	TokenNameCOMMENT_LINE	hostname = *( domainlabel "." ) toplabel [ "." ] 
// domainlabel = alphanum | alphanum *( alphanum | "-" ) alphanum 	TokenNameCOMMENT_LINE	domainlabel = alphanum | alphanum *( alphanum | "-" ) alphanum 
// toplabel = alpha | alpha *( alphanum | "-" ) alphanum 	TokenNameCOMMENT_LINE	toplabel = alpha | alpha *( alphanum | "-" ) alphanum 
// RFC 2396 states that hostnames take the form described in 	TokenNameCOMMENT_LINE	RFC 2396 states that hostnames take the form described in 
// RFC 1034 (Section 3) and RFC 1123 (Section 2.1). According 	TokenNameCOMMENT_LINE	RFC 1034 (Section 3) and RFC 1123 (Section 2.1). According 
// to RFC 1034, hostnames are limited to 255 characters. 	TokenNameCOMMENT_LINE	to RFC 1034, hostnames are limited to 255 characters. 
if	TokenNameif	
(	TokenNameLPAREN	
addrLength	TokenNameIdentifier	 addr Length
>	TokenNameGREATER	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// domain labels can contain alphanumerics and '-" 	TokenNameCOMMENT_LINE	domain labels can contain alphanumerics and '-" 
// but must start and end with an alphanumeric 	TokenNameCOMMENT_LINE	but must start and end with an alphanumeric 
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
;	TokenNameSEMICOLON	
int	TokenNameint	
labelCharCount	TokenNameIdentifier	 label Char Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
addrLength	TokenNameIdentifier	 addr Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAlphanum	TokenNameIdentifier	 is Alphanum
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
addrLength	TokenNameIdentifier	 addr Length
&&	TokenNameAND_AND	
!	TokenNameNOT	
isAlphanum	TokenNameIdentifier	 is Alphanum
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
labelCharCount	TokenNameIdentifier	 label Char Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAlphanum	TokenNameIdentifier	 is Alphanum
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
testChar	TokenNameIdentifier	 test Char
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// RFC 1034: Labels must be 63 characters or less. 	TokenNameCOMMENT_LINE	RFC 1034: Labels must be 63 characters or less. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
labelCharCount	TokenNameIdentifier	 label Char Count
>	TokenNameGREATER	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Determines whether a string is an IPv4 address as defined by * RFC 2373, and under the further constraint that it must be a 32-bit * address. Though not expressed in the grammar, in order to satisfy * the 32-bit address constraint, each segment of the address cannot * be greater than 255 (8 bits of information).</p> * * <p><code>IPv4address = 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT</code></p> * * @return true if the string is a syntactically valid IPv4 address */	TokenNameCOMMENT_JAVADOC	 <p>Determines whether a string is an IPv4 address as defined by RFC 2373, and under the further constraint that it must be a 32-bit address. Though not expressed in the grammar, in order to satisfy the 32-bit address constraint, each segment of the address cannot be greater than 255 (8 bits of information).</p> * <p><code>IPv4address = 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT</code></p> * @return true if the string is a syntactically valid IPv4 address 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isWellFormedIPv4Address	TokenNameIdentifier	 is Well Formed I Pv4 Address
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
addrLength	TokenNameIdentifier	 addr Length
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
;	TokenNameSEMICOLON	
int	TokenNameint	
numDots	TokenNameIdentifier	 num Dots
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDigits	TokenNameIdentifier	 num Digits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// make sure that 1) we see only digits and dot separators, 2) that 	TokenNameCOMMENT_LINE	make sure that 1) we see only digits and dot separators, 2) that 
// any dot separator is preceded and followed by a digit and 	TokenNameCOMMENT_LINE	any dot separator is preceded and followed by a digit and 
// 3) that we find 3 dots 	TokenNameCOMMENT_LINE	3) that we find 3 dots 
// 	TokenNameCOMMENT_LINE	 
// RFC 2732 amended RFC 2396 by replacing the definition 	TokenNameCOMMENT_LINE	RFC 2732 amended RFC 2396 by replacing the definition 
// of IPv4address with the one defined by RFC 2373. - mrglavas 	TokenNameCOMMENT_LINE	of IPv4address with the one defined by RFC 2373. - mrglavas 
// 	TokenNameCOMMENT_LINE	 
// IPv4address = 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT 	TokenNameCOMMENT_LINE	IPv4address = 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT 
// 	TokenNameCOMMENT_LINE	 
// One to three digits must be in each segment. 	TokenNameCOMMENT_LINE	One to three digits must be in each segment. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
addrLength	TokenNameIdentifier	 addr Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
addrLength	TokenNameIdentifier	 addr Length
&&	TokenNameAND_AND	
!	TokenNameNOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numDigits	TokenNameIdentifier	 num Digits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
numDots	TokenNameIdentifier	 num Dots
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check that that there are no more than three digits 	TokenNameCOMMENT_LINE	Check that that there are no more than three digits 
// in this segment. 	TokenNameCOMMENT_LINE	in this segment. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
numDigits	TokenNameIdentifier	 num Digits
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check that this segment is not greater than 255. 	TokenNameCOMMENT_LINE	Check that this segment is not greater than 255. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
numDigits	TokenNameIdentifier	 num Digits
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
<	TokenNameLESS	
'2'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
'2'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
<	TokenNameLESS	
'5'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
'5'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
testChar	TokenNameIdentifier	 test Char
<=	TokenNameLESS_EQUAL	
'5'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
numDots	TokenNameIdentifier	 num Dots
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Determines whether a string is an IPv6 reference as defined * by RFC 2732, where IPv6address is defined in RFC 2373. The * IPv6 address is parsed according to Section 2.2 of RFC 2373, * with the additional constraint that the address be composed of * 128 bits of information.</p> * * <p><code>IPv6reference = "[" IPv6address "]"</code></p> * * <p>Note: The BNF expressed in RFC 2373 Appendix B does not * accurately describe section 2.2, and was in fact removed from * RFC 3513, the successor of RFC 2373.</p> * * @return true if the string is a syntactically valid IPv6 reference */	TokenNameCOMMENT_JAVADOC	 <p>Determines whether a string is an IPv6 reference as defined by RFC 2732, where IPv6address is defined in RFC 2373. The IPv6 address is parsed according to Section 2.2 of RFC 2373, with the additional constraint that the address be composed of 128 bits of information.</p> * <p><code>IPv6reference = "[" IPv6address "]"</code></p> * <p>Note: The BNF expressed in RFC 2373 Appendix B does not accurately describe section 2.2, and was in fact removed from RFC 3513, the successor of RFC 2373.</p> * @return true if the string is a syntactically valid IPv6 reference 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isWellFormedIPv6Reference	TokenNameIdentifier	 is Well Formed I Pv6 Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
addrLength	TokenNameIdentifier	 addr Length
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
addrLength	TokenNameIdentifier	 addr Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Check if string is a potential match for IPv6reference. 	TokenNameCOMMENT_LINE	Check if string is a potential match for IPv6reference. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
addrLength	TokenNameIdentifier	 addr Length
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'['	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Counter for the number of 16-bit sections read in the address. 	TokenNameCOMMENT_LINE	Counter for the number of 16-bit sections read in the address. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Scan hex sequence before possible '::' or IPv4 address. 	TokenNameCOMMENT_LINE	Scan hex sequence before possible '::' or IPv4 address. 
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
scanHexSequence	TokenNameIdentifier	 scan Hex Sequence
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Address must contain 128-bits of information. 	TokenNameCOMMENT_LINE	Address must contain 128-bits of information. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
end	TokenNameIdentifier	 end
&&	TokenNameAND_AND	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// '::' represents at least one 16-bit group of zeros. 	TokenNameCOMMENT_LINE	'::' represents at least one 16-bit group of zeros. 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
counter	TokenNameIdentifier	 counter
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Trailing zeros will fill out the rest of the address. 	TokenNameCOMMENT_LINE	Trailing zeros will fill out the rest of the address. 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If the second character wasn't ':', in order to be valid, 	TokenNameCOMMENT_LINE	If the second character wasn't ':', in order to be valid, 
// the remainder of the string must match IPv4Address, 	TokenNameCOMMENT_LINE	the remainder of the string must match IPv4Address, 
// and we must have read exactly 6 16-bit groups. 	TokenNameCOMMENT_LINE	and we must have read exactly 6 16-bit groups. 
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isWellFormedIPv4Address	TokenNameIdentifier	 is Well Formed I Pv4 Address
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 3. Scan hex sequence after '::'. 	TokenNameCOMMENT_LINE	3. Scan hex sequence after '::'. 
int	TokenNameint	
prevCount	TokenNameIdentifier	 prev Count
=	TokenNameEQUAL	
counter	TokenNameIdentifier	 counter
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
scanHexSequence	TokenNameIdentifier	 scan Hex Sequence
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We've either reached the end of the string, the address ends in 	TokenNameCOMMENT_LINE	We've either reached the end of the string, the address ends in 
// an IPv4 address, or it is invalid. scanHexSequence has already 	TokenNameCOMMENT_LINE	an IPv4 address, or it is invalid. scanHexSequence has already 
// made sure that we have the right number of bits. 	TokenNameCOMMENT_LINE	made sure that we have the right number of bits. 
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isWellFormedIPv4Address	TokenNameIdentifier	 is Well Formed I Pv4 Address
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
prevCount	TokenNameIdentifier	 prev Count
)	TokenNameRPAREN	
?	TokenNameQUESTION	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper method for isWellFormedIPv6Reference which scans the * hex sequences of an IPv6 address. It returns the index of the * next character to scan in the address, or -1 if the string * cannot match a valid IPv6 address. * * @param address the string to be scanned * @param index the beginning index (inclusive) * @param end the ending index (exclusive) * @param counter a counter for the number of 16-bit sections read * in the address * * @return the index of the next character to scan, or -1 if the * string cannot match a valid IPv6 address */	TokenNameCOMMENT_JAVADOC	 Helper method for isWellFormedIPv6Reference which scans the hex sequences of an IPv6 address. It returns the index of the next character to scan in the address, or -1 if the string cannot match a valid IPv6 address. * @param address the string to be scanned @param index the beginning index (inclusive) @param end the ending index (exclusive) @param counter a counter for the number of 16-bit sections read in the address * @return the index of the next character to scan, or -1 if the string cannot match a valid IPv6 address 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
scanHexSequence	TokenNameIdentifier	 scan Hex Sequence
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
;	TokenNameSEMICOLON	
int	TokenNameint	
numDigits	TokenNameIdentifier	 num Digits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// Trying to match the following productions: 	TokenNameCOMMENT_LINE	Trying to match the following productions: 
// hexseq = hex4 *( ":" hex4) 	TokenNameCOMMENT_LINE	hexseq = hex4 *( ":" hex4) 
// hex4 = 1*4HEXDIG 	TokenNameCOMMENT_LINE	hex4 = 1*4HEXDIG 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// IPv6 addresses are 128-bit, so there can be at most eight sections. 	TokenNameCOMMENT_LINE	IPv6 addresses are 128-bit, so there can be at most eight sections. 
if	TokenNameif	
(	TokenNameLPAREN	
numDigits	TokenNameIdentifier	 num Digits
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
++	TokenNamePLUS_PLUS	
counter	TokenNameIdentifier	 counter
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This could be '::'. 	TokenNameCOMMENT_LINE	This could be '::'. 
if	TokenNameif	
(	TokenNameLPAREN	
numDigits	TokenNameIdentifier	 num Digits
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numDigits	TokenNameIdentifier	 num Digits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This might be invalid or an IPv4address. If it's potentially an IPv4address, 	TokenNameCOMMENT_LINE	This might be invalid or an IPv4address. If it's potentially an IPv4address, 
// backup to just after the last valid character that matches hexseq. 	TokenNameCOMMENT_LINE	backup to just after the last valid character that matches hexseq. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
numDigits	TokenNameIdentifier	 num Digits
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
numDigits	TokenNameIdentifier	 num Digits
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
counter	TokenNameIdentifier	 counter
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
back	TokenNameIdentifier	 back
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
numDigits	TokenNameIdentifier	 num Digits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
back	TokenNameIdentifier	 back
>=	TokenNameGREATER_EQUAL	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
?	TokenNameQUESTION	
back	TokenNameIdentifier	 back
:	TokenNameCOLON	
(	TokenNameLPAREN	
back	TokenNameIdentifier	 back
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// There can be at most 4 hex digits per group. 	TokenNameCOMMENT_LINE	There can be at most 4 hex digits per group. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
numDigits	TokenNameIdentifier	 num Digits
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
numDigits	TokenNameIdentifier	 num Digits
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
++	TokenNamePLUS_PLUS	
counter	TokenNameIdentifier	 counter
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
end	TokenNameIdentifier	 end
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is a digit. * * @return true if the char is betweeen '0' and '9', false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is a digit. * @return true if the char is betweeen '0' and '9', false otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
char	TokenNamechar	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
p_char	TokenNameIdentifier	 p char
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a character is a hexadecimal character. * * @return true if the char is betweeen '0' and '9', 'a' and 'f' * or 'A' and 'F', false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a character is a hexadecimal character. * @return true if the char is betweeen '0' and '9', 'a' and 'f' or 'A' and 'F', false otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
char	TokenNamechar	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'f'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
p_char	TokenNameIdentifier	 p char
]	TokenNameRBRACKET	
&	TokenNameAND	
ASCII_HEX_CHARACTERS	TokenNameIdentifier	 ASCII  HEX  CHARACTERS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is an alphabetic character: a-z or A-Z * * @return true if the char is alphabetic, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is an alphabetic character: a-z or A-Z * @return true if the char is alphabetic, false otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isAlpha	TokenNameIdentifier	 is Alpha
(	TokenNameLPAREN	
char	TokenNamechar	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is an alphanumeric: 0-9, a-z or A-Z * * @return true if the char is alphanumeric, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is an alphanumeric: 0-9, a-z or A-Z * @return true if the char is alphanumeric, false otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isAlphanum	TokenNameIdentifier	 is Alphanum
(	TokenNameLPAREN	
char	TokenNamechar	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
p_char	TokenNameIdentifier	 p char
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_ALPHA_NUMERIC	TokenNameIdentifier	 MASK  ALPHA  NUMERIC
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a character is a reserved character: * ';', '/', '?', ':', '@', '&', '=', '+', '$', ',', '[', or ']' * * @return true if the string contains any reserved characters */	TokenNameCOMMENT_JAVADOC	 Determine whether a character is a reserved character: ';', '/', '?', ':', '@', '&', '=', '+', '$', ',', '[', or ']' * @return true if the string contains any reserved characters 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isReservedCharacter	TokenNameIdentifier	 is Reserved Character
(	TokenNameLPAREN	
char	TokenNamechar	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
']'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
p_char	TokenNameIdentifier	 p char
]	TokenNameRBRACKET	
&	TokenNameAND	
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is an unreserved character. * * @return true if the char is unreserved, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is an unreserved character. * @return true if the char is unreserved, false otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isUnreservedCharacter	TokenNameIdentifier	 is Unreserved Character
(	TokenNameLPAREN	
char	TokenNamechar	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'~'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
p_char	TokenNameIdentifier	 p char
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_UNRESERVED_MASK	TokenNameIdentifier	 MASK  UNRESERVED  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is a URI character (reserved or * unreserved, not including '%' for escaped octets). * * @return true if the char is a URI character, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is a URI character (reserved or unreserved, not including '%' for escaped octets). * @return true if the char is a URI character, false otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isURICharacter	TokenNameIdentifier	 is URI Character
(	TokenNameLPAREN	
char	TokenNamechar	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'~'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
p_char	TokenNameIdentifier	 p char
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_URI_CHARACTER	TokenNameIdentifier	 MASK  URI  CHARACTER
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is a scheme character. * * @return true if the char is a scheme character, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is a scheme character. * @return true if the char is a scheme character, false otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSchemeCharacter	TokenNameIdentifier	 is Scheme Character
(	TokenNameLPAREN	
char	TokenNamechar	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
p_char	TokenNameIdentifier	 p char
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_SCHEME_CHARACTER	TokenNameIdentifier	 MASK  SCHEME  CHARACTER
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is a userinfo character. * * @return true if the char is a userinfo character, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is a userinfo character. * @return true if the char is a userinfo character, false otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isUserinfoCharacter	TokenNameIdentifier	 is Userinfo Character
(	TokenNameLPAREN	
char	TokenNamechar	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
p_char	TokenNameIdentifier	 p char
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_USERINFO_CHARACTER	TokenNameIdentifier	 MASK  USERINFO  CHARACTER
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is a path character. * * @return true if the char is a path character, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is a path character. * @return true if the char is a path character, false otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isPathCharacter	TokenNameIdentifier	 is Path Character
(	TokenNameLPAREN	
char	TokenNamechar	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'~'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fgLookupTable	TokenNameIdentifier	 fg Lookup Table
[	TokenNameLBRACKET	
p_char	TokenNameIdentifier	 p char
]	TokenNameRBRACKET	
&	TokenNameAND	
MASK_PATH_CHARACTER	TokenNameIdentifier	 MASK  PATH  CHARACTER
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a given string contains only URI characters (also * called "uric" in RFC 2396). uric consist of all reserved * characters, unreserved characters and escaped characters. * * @return true if the string is comprised of uric, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a given string contains only URI characters (also called "uric" in RFC 2396). uric consist of all reserved characters, unreserved characters and escaped characters. * @return true if the string is comprised of uric, false otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isURIString	TokenNameIdentifier	 is URI String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_uric	TokenNameIdentifier	 p uric
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_uric	TokenNameIdentifier	 p uric
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
p_uric	TokenNameIdentifier	 p uric
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
'\0'	TokenNameCharacterLiteral	
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
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testChar	TokenNameIdentifier	 test Char
=	TokenNameEQUAL	
p_uric	TokenNameIdentifier	 p uric
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_uric	TokenNameIdentifier	 p uric
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isHex	TokenNameIdentifier	 is Hex
(	TokenNameLPAREN	
p_uric	TokenNameIdentifier	 p uric
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isURICharacter	TokenNameIdentifier	 is URI Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
}	TokenNameRBRACE	
