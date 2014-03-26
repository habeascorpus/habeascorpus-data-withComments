/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: URI.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: URI.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
/** * A class to represent a Uniform Resource Identifier (URI). This class * is designed to handle the parsing of URIs and provide access to * the various components (scheme, host, port, userinfo, path, query * string and fragment) that may constitute a URI. * <p> * Parsing of a URI specification is done according to the URI * syntax described in RFC 2396 * <http://www.ietf.org/rfc/rfc2396.txt?number=2396>. Every URI consists * of a scheme, followed by a colon (':'), followed by a scheme-specific * part. For URIs that follow the "generic URI" syntax, the scheme- * specific part begins with two slashes ("//") and may be followed * by an authority segment (comprised of user information, host, and * port), path segment, query segment and fragment. Note that RFC 2396 * no longer specifies the use of the parameters segment and excludes * the "user:password" syntax as part of the authority segment. If * "user:password" appears in a URI, the entire user/password string * is stored as userinfo. * <p> * For URIs that do not follow the "generic URI" syntax (e.g. mailto), * the entire scheme-specific part is treated as the "path" portion * of the URI. * <p> * Note that, unlike the java.net.URL class, this class does not provide * any built-in network access functionality nor does it provide any * scheme-specific functionality (for example, it does not know a * default port for a specific scheme). Rather, it only knows the * grammar and basic set of operations that can be applied to a URI. * * */	TokenNameCOMMENT_JAVADOC	 A class to represent a Uniform Resource Identifier (URI). This class is designed to handle the parsing of URIs and provide access to the various components (scheme, host, port, userinfo, path, query string and fragment) that may constitute a URI. <p> Parsing of a URI specification is done according to the URI syntax described in RFC 2396 <http://www.ietf.org/rfc/rfc2396.txt?number=2396>. Every URI consists of a scheme, followed by a colon (':'), followed by a scheme-specific part. For URIs that follow the "generic URI" syntax, the scheme- specific part begins with two slashes ("//") and may be followed by an authority segment (comprised of user information, host, and port), path segment, query segment and fragment. Note that RFC 2396 no longer specifies the use of the parameters segment and excludes the "user:password" syntax as part of the authority segment. If "user:password" appears in a URI, the entire user/password string is stored as userinfo. <p> For URIs that do not follow the "generic URI" syntax (e.g. mailto), the entire scheme-specific part is treated as the "path" portion of the URI. <p> Note that, unlike the java.net.URL class, this class does not provide any built-in network access functionality nor does it provide any scheme-specific functionality (for example, it does not know a default port for a specific scheme). Rather, it only knows the grammar and basic set of operations that can be applied to a URI. * 
public	TokenNamepublic	
class	TokenNameclass	
URI	TokenNameIdentifier	 URI
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
7096266377907081897L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * MalformedURIExceptions are thrown in the process of building a URI * or setting fields on a URI when an operation would result in an * invalid URI specification. * */	TokenNameCOMMENT_JAVADOC	 MalformedURIExceptions are thrown in the process of building a URI or setting fields on a URI when an operation would result in an invalid URI specification. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
extends	TokenNameextends	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/** * Constructs a <code>MalformedURIException</code> with no specified * detail message. */	TokenNameCOMMENT_JAVADOC	 Constructs a <code>MalformedURIException</code> with no specified detail message. 
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
/** * Constructs a <code>MalformedURIException</code> with the * specified detail message. * * @param p_msg the detail message. */	TokenNameCOMMENT_JAVADOC	 Constructs a <code>MalformedURIException</code> with the specified detail message. * @param p_msg the detail message. 
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
/** reserved characters */	TokenNameCOMMENT_JAVADOC	 reserved characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
=	TokenNameEQUAL	
";/?:@&=+$,"	TokenNameStringLiteral	;/?:@&=+$,
;	TokenNameSEMICOLON	
/** * URI punctuation mark characters - these, combined with * alphanumerics, constitute the "unreserved" characters */	TokenNameCOMMENT_JAVADOC	 URI punctuation mark characters - these, combined with alphanumerics, constitute the "unreserved" characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
=	TokenNameEQUAL	
"-_.!~*'() "	TokenNameStringLiteral	-_.!~*'() 
;	TokenNameSEMICOLON	
/** scheme can be composed of alphanumerics and these characters */	TokenNameCOMMENT_JAVADOC	 scheme can be composed of alphanumerics and these characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEME_CHARACTERS	TokenNameIdentifier	 SCHEME  CHARACTERS
=	TokenNameEQUAL	
"+-."	TokenNameStringLiteral	+-.
;	TokenNameSEMICOLON	
/** * userinfo can be composed of unreserved, escaped and these * characters */	TokenNameCOMMENT_JAVADOC	 userinfo can be composed of unreserved, escaped and these characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
=	TokenNameEQUAL	
";:&=+$,"	TokenNameStringLiteral	;:&=+$,
;	TokenNameSEMICOLON	
/** Stores the scheme (usually the protocol) for this URI. * @serial */	TokenNameCOMMENT_JAVADOC	 Stores the scheme (usually the protocol) for this URI. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_scheme	TokenNameIdentifier	 m scheme
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If specified, stores the userinfo for this URI; otherwise null. * @serial */	TokenNameCOMMENT_JAVADOC	 If specified, stores the userinfo for this URI; otherwise null. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_userinfo	TokenNameIdentifier	 m userinfo
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If specified, stores the host for this URI; otherwise null. * @serial */	TokenNameCOMMENT_JAVADOC	 If specified, stores the host for this URI; otherwise null. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If specified, stores the port for this URI; otherwise -1. * @serial */	TokenNameCOMMENT_JAVADOC	 If specified, stores the port for this URI; otherwise -1. @serial 
private	TokenNameprivate	
int	TokenNameint	
m_port	TokenNameIdentifier	 m port
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** If specified, stores the path for this URI; otherwise null. * @serial */	TokenNameCOMMENT_JAVADOC	 If specified, stores the path for this URI; otherwise null. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_path	TokenNameIdentifier	 m path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * If specified, stores the query string for this URI; otherwise * null. * @serial */	TokenNameCOMMENT_JAVADOC	 If specified, stores the query string for this URI; otherwise null. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_queryString	TokenNameIdentifier	 m query String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If specified, stores the fragment for this URI; otherwise null. * @serial */	TokenNameCOMMENT_JAVADOC	 If specified, stores the fragment for this URI; otherwise null. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_fragment	TokenNameIdentifier	 m fragment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Indicate whether in DEBUG mode */	TokenNameCOMMENT_JAVADOC	 Indicate whether in DEBUG mode 
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
/** * Construct a new URI from a URI specification string. If the * specification follows the "generic URI" syntax, (two slashes * following the first colon), the specification will be parsed * accordingly - setting the scheme, userinfo, host,port, path, query * string and fragment fields as necessary. If the specification does * not follow the "generic URI" syntax, the specification is parsed * into a scheme and scheme-specific part (stored as the path) only. * * @param p_uriSpec the URI specification string (cannot be null or * empty) * * @throws MalformedURIException if p_uriSpec violates any syntax * rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI from a URI specification string. If the specification follows the "generic URI" syntax, (two slashes following the first colon), the specification will be parsed accordingly - setting the scheme, userinfo, host,port, path, query string and fragment fields as necessary. If the specification does not follow the "generic URI" syntax, the specification is parsed into a scheme and scheme-specific part (stored as the path) only. * @param p_uriSpec the URI specification string (cannot be null or empty) * @throws MalformedURIException if p_uriSpec violates any syntax rules 
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
/** * Construct a new URI from a base URI and a URI specification string. * The URI specification string may be a relative URI. * * @param p_base the base URI (cannot be null if p_uriSpec is null or * empty) * @param p_uriSpec the URI specification string (cannot be null or * empty if p_base is null) * * @throws MalformedURIException if p_uriSpec violates any syntax * rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI from a base URI and a URI specification string. The URI specification string may be a relative URI. * @param p_base the base URI (cannot be null if p_uriSpec is null or empty) @param p_uriSpec the URI specification string (cannot be null or empty if p_base is null) * @throws MalformedURIException if p_uriSpec violates any syntax rules 
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
/** * Construct a new URI that does not follow the generic URI syntax. * Only the scheme and scheme-specific part (stored as the path) are * initialized. * * @param p_scheme the URI scheme (cannot be null or empty) * @param p_schemeSpecificPart the scheme-specific part (cannot be * null or empty) * * @throws MalformedURIException if p_scheme violates any * syntax rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI that does not follow the generic URI syntax. Only the scheme and scheme-specific part (stored as the path) are initialized. * @param p_scheme the URI scheme (cannot be null or empty) @param p_schemeSpecificPart the scheme-specific part (cannot be null or empty) * @throws MalformedURIException if p_scheme violates any syntax rules 
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
/** * Construct a new URI that follows the generic URI syntax from its * component parts. Each component is validated for syntax and some * basic semantic checks are performed as well. See the individual * setter methods for specifics. * * @param p_scheme the URI scheme (cannot be null or empty) * @param p_host the hostname or IPv4 address for the URI * @param p_path the URI path - if the path contains '?' or '#', * then the query string and/or fragment will be * set from the path; however, if the query and * fragment are specified both in the path and as * separate parameters, an exception is thrown * @param p_queryString the URI query string (cannot be specified * if path is null) * @param p_fragment the URI fragment (cannot be specified if path * is null) * * @throws MalformedURIException if any of the parameters violates * syntax rules or semantic rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI that follows the generic URI syntax from its component parts. Each component is validated for syntax and some basic semantic checks are performed as well. See the individual setter methods for specifics. * @param p_scheme the URI scheme (cannot be null or empty) @param p_host the hostname or IPv4 address for the URI @param p_path the URI path - if the path contains '?' or '#', then the query string and/or fragment will be set from the path; however, if the query and fragment are specified both in the path and as separate parameters, an exception is thrown @param p_queryString the URI query string (cannot be specified if path is null) @param p_fragment the URI fragment (cannot be specified if path is null) * @throws MalformedURIException if any of the parameters violates syntax rules or semantic rules 
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
/** * Construct a new URI that follows the generic URI syntax from its * component parts. Each component is validated for syntax and some * basic semantic checks are performed as well. See the individual * setter methods for specifics. * * @param p_scheme the URI scheme (cannot be null or empty) * @param p_userinfo the URI userinfo (cannot be specified if host * is null) * @param p_host the hostname or IPv4 address for the URI * @param p_port the URI port (may be -1 for "unspecified"; cannot * be specified if host is null) * @param p_path the URI path - if the path contains '?' or '#', * then the query string and/or fragment will be * set from the path; however, if the query and * fragment are specified both in the path and as * separate parameters, an exception is thrown * @param p_queryString the URI query string (cannot be specified * if path is null) * @param p_fragment the URI fragment (cannot be specified if path * is null) * * @throws MalformedURIException if any of the parameters violates * syntax rules or semantic rules */	TokenNameCOMMENT_JAVADOC	 Construct a new URI that follows the generic URI syntax from its component parts. Each component is validated for syntax and some basic semantic checks are performed as well. See the individual setter methods for specifics. * @param p_scheme the URI scheme (cannot be null or empty) @param p_userinfo the URI userinfo (cannot be specified if host is null) @param p_host the hostname or IPv4 address for the URI @param p_port the URI port (may be -1 for "unspecified"; cannot be specified if host is null) @param p_path the URI path - if the path contains '?' or '#', then the query string and/or fragment will be set from the path; however, if the query and fragment are specified both in the path and as separate parameters, an exception is thrown @param p_queryString the URI query string (cannot be specified if path is null) @param p_fragment the URI fragment (cannot be specified if path is null) * @throws MalformedURIException if any of the parameters violates syntax rules or semantic rules 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Scheme is required!"); 	TokenNameCOMMENT_LINE	"Scheme is required!"); 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier	 ER  NO  USERINFO  IF  NO  HOST
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Userinfo may not be specified if host is not specified!"); 	TokenNameCOMMENT_LINE	"Userinfo may not be specified if host is not specified!"); 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Port may not be specified if host is not specified!"); 	TokenNameCOMMENT_LINE	"Port may not be specified if host is not specified!"); 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  QUERY  STRING  IN  PATH
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Query string cannot be specified in path and query string!"); 	TokenNameCOMMENT_LINE	"Query string cannot be specified in path and query string!"); 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Fragment cannot be specified in both the path and fragment!"); 	TokenNameCOMMENT_LINE	"Fragment cannot be specified in both the path and fragment!"); 
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
/** * Initializes this URI from a base URI and a URI specification string. * See RFC 2396 Section 4 and Appendix B for specifications on parsing * the URI and Section 5 for specifications on resolving relative URIs * and relative paths. * * @param p_base the base URI (may be null if p_uriSpec is an absolute * URI) * @param p_uriSpec the URI spec string which may be an absolute or * relative URI (can only be null/empty if p_base * is not null) * * @throws MalformedURIException if p_base is null and p_uriSpec * is not an absolute URI or if * p_uriSpec violates syntax rules */	TokenNameCOMMENT_JAVADOC	 Initializes this URI from a base URI and a URI specification string. See RFC 2396 Section 4 and Appendix B for specifications on parsing the URI and Section 5 for specifications on resolving relative URIs and relative paths. * @param p_base the base URI (may be null if p_uriSpec is an absolute URI) @param p_uriSpec the URI spec string which may be an absolute or relative URI (can only be null/empty if p_base is not null) * @throws MalformedURIException if p_base is null and p_uriSpec is not an absolute URI or if p_uriSpec violates syntax rules 
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
if	TokenNameif	
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
p_uriSpec	TokenNameIdentifier	 p uri Spec
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier	 ER  CANNOT  INIT  URI  EMPTY  PARMS
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Cannot initialize URI with empty parameters."); 	TokenNameCOMMENT_LINE	"Cannot initialize URI with empty parameters."); 
}	TokenNameRBRACE	
// just make a copy of the base if spec is empty 	TokenNameCOMMENT_LINE	just make a copy of the base if spec is empty 
if	TokenNameif	
(	TokenNameLPAREN	
p_uriSpec	TokenNameIdentifier	 p uri Spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
p_uriSpec	TokenNameIdentifier	 p uri Spec
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
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
uriSpec	TokenNameIdentifier	 uri Spec
=	TokenNameEQUAL	
p_uriSpec	TokenNameIdentifier	 p uri Spec
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
uriSpecLen	TokenNameIdentifier	 uri Spec Len
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
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
// check for scheme 	TokenNameCOMMENT_LINE	check for scheme 
int	TokenNameint	
colonIndex	TokenNameIdentifier	 colon Index
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
colonIndex	TokenNameIdentifier	 colon Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uriSpec	TokenNameIdentifier	 uri Spec
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"No scheme found in URI: "+uriSpec); 	TokenNameCOMMENT_LINE	"No scheme found in URI: "+uriSpec); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
initializeScheme	TokenNameIdentifier	 initialize Scheme
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uriSpec	TokenNameIdentifier	 uri Spec
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
colonIndex	TokenNameIdentifier	 colon Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This is a fix for XALANJ-2059. 	TokenNameCOMMENT_LINE	This is a fix for XALANJ-2059. 
if	TokenNameif	
(	TokenNameLPAREN	
m_scheme	TokenNameIdentifier	 m scheme
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
p_base	TokenNameIdentifier	 p base
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a) If <uriSpec> starts with a slash (/), it means <uriSpec> is absolute 	TokenNameCOMMENT_LINE	a) If <uriSpec> starts with a slash (/), it means <uriSpec> is absolute 
// and p_base can be ignored. 	TokenNameCOMMENT_LINE	and p_base can be ignored. 
// For example, 	TokenNameCOMMENT_LINE	For example, 
// uriSpec = file:/myDIR/myXSLFile.xsl 	TokenNameCOMMENT_LINE	uriSpec = file:/myDIR/myXSLFile.xsl 
// p_base = file:/myWork/ 	TokenNameCOMMENT_LINE	p_base = file:/myWork/ 
// 	TokenNameCOMMENT_LINE	 
// Here, uriSpec has absolute path after scheme file and : 	TokenNameCOMMENT_LINE	Here, uriSpec has absolute path after scheme file and : 
// Hence p_base can be ignored. 	TokenNameCOMMENT_LINE	Hence p_base can be ignored. 
// 	TokenNameCOMMENT_LINE	 
// b) Similarily, according to RFC 2396, uri is resolved for <uriSpec> relative to <p_base> 	TokenNameCOMMENT_LINE	b) Similarily, according to RFC 2396, uri is resolved for <uriSpec> relative to <p_base> 
// if scheme in <uriSpec> is same as scheme in <p_base>, else p_base can be ignored. 	TokenNameCOMMENT_LINE	if scheme in <uriSpec> is same as scheme in <p_base>, else p_base can be ignored. 
// 	TokenNameCOMMENT_LINE	 
// c) if <p_base> is not hierarchical, it can be ignored. 	TokenNameCOMMENT_LINE	c) if <p_base> is not hierarchical, it can be ignored. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
m_scheme	TokenNameIdentifier	 m scheme
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
m_scheme	TokenNameIdentifier	 m scheme
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
p_base	TokenNameIdentifier	 p base
.	TokenNameDOT	
getSchemeSpecificPart	TokenNameIdentifier	 get Scheme Specific Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p_base	TokenNameIdentifier	 p base
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Fix for XALANJ-2059 	TokenNameCOMMENT_LINE	Fix for XALANJ-2059 
uriSpecLen	TokenNameIdentifier	 uri Spec Len
=	TokenNameEQUAL	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// two slashes means generic URI syntax, so we get the authority 	TokenNameCOMMENT_LINE	two slashes means generic URI syntax, so we get the authority 
if	TokenNameif	
(	TokenNameLPAREN	
uriSpec	TokenNameIdentifier	 uri Spec
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"//"	TokenNameStringLiteral	//
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
// get authority - everything up to path, query or fragment 	TokenNameCOMMENT_LINE	get authority - everything up to path, query or fragment 
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
// if we found authority, parse it out, otherwise we set the 	TokenNameCOMMENT_LINE	if we found authority, parse it out, otherwise we set the 
// host to empty string 	TokenNameCOMMENT_LINE	host to empty string 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
;	TokenNameSEMICOLON	
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
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
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
// check for authority - RFC 2396 5.2 #4 	TokenNameCOMMENT_LINE	check for authority - RFC 2396 5.2 #4 
// if we found a host, then we've got a network path, so we're done 	TokenNameCOMMENT_LINE	if we found a host, then we've got a network path, so we're done 
if	TokenNameif	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
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
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
-	TokenNameMINUS	
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
++	TokenNamePLUS_PLUS	
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
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
/** * Initialize the scheme for this URI from a URI string spec. * * @param p_uriSpec the URI specification (cannot be null) * * @throws MalformedURIException if URI does not have a conformant * scheme */	TokenNameCOMMENT_JAVADOC	 Initialize the scheme for this URI from a URI string spec. * @param p_uriSpec the URI specification (cannot be null) * @throws MalformedURIException if URI does not have a conformant scheme 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NO_SCHEME_INURI	TokenNameIdentifier	 ER  NO  SCHEME  INURI
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"No scheme found in URI."); 	TokenNameCOMMENT_LINE	"No scheme found in URI."); 
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
/** * Initialize the authority (userinfo, host and port) for this * URI from a URI string spec. * * @param p_uriSpec the URI specification (cannot be null) * * @throws MalformedURIException if p_uriSpec violates syntax rules */	TokenNameCOMMENT_JAVADOC	 Initialize the authority (userinfo, host and port) for this URI from a URI string spec. * @param p_uriSpec the URI specification (cannot be null) * @throws MalformedURIException if p_uriSpec violates syntax rules 
private	TokenNameprivate	
void	TokenNamevoid	
initializeAuthority	TokenNameIdentifier	 initialize Authority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
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
// userinfo is everything up @ 	TokenNameCOMMENT_LINE	userinfo is everything up @ 
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
// host is everything up to ':' 	TokenNameCOMMENT_LINE	host is everything up to ':' 
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
null	TokenNamenull	
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
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
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
testChar	TokenNameIdentifier	 test Char
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
portStr	TokenNameIdentifier	 port Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
portStr	TokenNameIdentifier	 port Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
portStr	TokenNameIdentifier	 port Str
+	TokenNamePLUS	
" is invalid. Port should only contain digits!"	TokenNameStringLiteral	 is invalid. Port should only contain digits!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't happen 	TokenNameCOMMENT_LINE	can't happen 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setHost	TokenNameIdentifier	 set Host
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setUserinfo	TokenNameIdentifier	 set Userinfo
(	TokenNameLPAREN	
userinfo	TokenNameIdentifier	 userinfo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the path for this URI from a URI string spec. * * @param p_uriSpec the URI specification (cannot be null) * * @throws MalformedURIException if p_uriSpec violates syntax rules */	TokenNameCOMMENT_JAVADOC	 Initialize the path for this URI from a URI string spec. * @param p_uriSpec the URI specification (cannot be null) * @throws MalformedURIException if p_uriSpec violates syntax rules 
private	TokenNameprivate	
void	TokenNamevoid	
initializePath	TokenNameIdentifier	 initialize Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_uriSpec	TokenNameIdentifier	 p uri Spec
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
// path - everything up to query string or fragment 	TokenNameCOMMENT_LINE	path - everything up to query string or fragment 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Path contains invalid escape sequence!"); 	TokenNameCOMMENT_LINE	"Path contains invalid escape sequence!"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReservedCharacter	TokenNameIdentifier	 is Reserved Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isUnreservedCharacter	TokenNameIdentifier	 is Unreserved Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
!=	TokenNameNOT_EQUAL	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Path contains invalid character: " 	TokenNameCOMMENT_LINE	"Path contains invalid character: " 
//+ testChar); 	TokenNameCOMMENT_LINE	+ testChar); 
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReservedCharacter	TokenNameIdentifier	 is Reserved Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isUnreservedCharacter	TokenNameIdentifier	 is Unreserved Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Query string contains invalid character:"	TokenNameStringLiteral	Query string contains invalid character:
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
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReservedCharacter	TokenNameIdentifier	 is Reserved Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isUnreservedCharacter	TokenNameIdentifier	 is Unreserved Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
(	TokenNameLPAREN	
"Fragment contains invalid character:"	TokenNameStringLiteral	Fragment contains invalid character:
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
m_userinfo	TokenNameIdentifier	 m userinfo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
m_host	TokenNameIdentifier	 m host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
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
"//"	TokenNameStringLiteral	//
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemespec	TokenNameIdentifier	 schemespec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_host	TokenNameIdentifier	 m host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Set the scheme for this URI. The scheme is converted to lowercase * before it is set. * * @param p_scheme the scheme for this URI (cannot be null) * * @throws MalformedURIException if p_scheme is not a conformant * scheme name */	TokenNameCOMMENT_JAVADOC	 Set the scheme for this URI. The scheme is converted to lowercase before it is set. * @param p_scheme the scheme for this URI (cannot be null) * @throws MalformedURIException if p_scheme is not a conformant scheme name 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier	 ER  SCHEME  FROM  NULL  STRING
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Cannot set scheme from null string!"); 	TokenNameCOMMENT_LINE	"Cannot set scheme from null string!"); 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"The scheme is not conformant."); 	TokenNameCOMMENT_LINE	"The scheme is not conformant."); 
}	TokenNameRBRACE	
m_scheme	TokenNameIdentifier	 m scheme
=	TokenNameEQUAL	
p_scheme	TokenNameIdentifier	 p scheme
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the userinfo for this URI. If a non-null value is passed in and * the host value is null, then an exception is thrown. * * @param p_userinfo the userinfo for this URI * * @throws MalformedURIException if p_userinfo contains invalid * characters */	TokenNameCOMMENT_JAVADOC	 Set the userinfo for this URI. If a non-null value is passed in and the host value is null, then an exception is thrown. * @param p_userinfo the userinfo for this URI * @throws MalformedURIException if p_userinfo contains invalid characters 
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
isUnreservedCharacter	TokenNameIdentifier	 is Unreserved Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
USERINFO_CHARACTERS	TokenNameIdentifier	 USERINFO  CHARACTERS
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
/** * Set the host for this URI. If null is passed in, the userinfo * field is also set to null and the port is set to -1. * * @param p_host the host for this URI * * @throws MalformedURIException if p_host is not a valid IP * address or DNS hostname. */	TokenNameCOMMENT_JAVADOC	 Set the host for this URI. If null is passed in, the userinfo field is also set to null and the port is set to -1. * @param p_host the host for this URI * @throws MalformedURIException if p_host is not a valid IP address or DNS hostname. 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier	 ER  HOST  ADDRESS  NOT  WELLFORMED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Host is not a well formed address!"); 	TokenNameCOMMENT_LINE	"Host is not a well formed address!"); 
}	TokenNameRBRACE	
m_host	TokenNameIdentifier	 m host
=	TokenNameEQUAL	
p_host	TokenNameIdentifier	 p host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the port for this URI. -1 is used to indicate that the port is * not specified, otherwise valid port numbers are between 0 and 65535. * If a valid port number is passed in and the host field is null, * an exception is thrown. * * @param p_port the port number for this URI * * @throws MalformedURIException if p_port is not -1 and not a * valid port number */	TokenNameCOMMENT_JAVADOC	 Set the port for this URI. -1 is used to indicate that the port is not specified, otherwise valid port numbers are between 0 and 65535. If a valid port number is passed in and the host field is null, an exception is thrown. * @param p_port the port number for this URI * @throws MalformedURIException if p_port is not -1 and not a valid port number 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Port cannot be set when host is null!"); 	TokenNameCOMMENT_LINE	"Port cannot be set when host is null!"); 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_INVALID_PORT	TokenNameIdentifier	 ER  INVALID  PORT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Invalid port number!"); 	TokenNameCOMMENT_LINE	"Invalid port number!"); 
}	TokenNameRBRACE	
m_port	TokenNameIdentifier	 m port
=	TokenNameEQUAL	
p_port	TokenNameIdentifier	 p port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the path for this URI. If the supplied path is null, then the * query string and fragment are set to null as well. If the supplied * path includes a query string and/or fragment, these fields will be * parsed and set as well. Note that, for URIs following the "generic * URI" syntax, the path specified should start with a slash. * For URIs that do not follow the generic URI syntax, this method * sets the scheme-specific part. * * @param p_path the path for this URI (may be null) * * @throws MalformedURIException if p_path contains invalid * characters */	TokenNameCOMMENT_JAVADOC	 Set the path for this URI. If the supplied path is null, then the query string and fragment are set to null as well. If the supplied path includes a query string and/or fragment, these fields will be parsed and set as well. Note that, for URIs following the "generic URI" syntax, the path specified should start with a slash. For URIs that do not follow the generic URI syntax, this method sets the scheme-specific part. * @param p_path the path for this URI (may be null) * @throws MalformedURIException if p_path contains invalid characters 
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append to the end of the path of this URI. If the current path does * not end in a slash and the path to be appended does not begin with * a slash, a slash will be appended to the current path before the * new segment is added. Also, if the current path ends in a slash * and the new segment begins with a slash, the extra slash will be * removed before the new segment is appended. * * @param p_addToPath the new segment to be added to the current path * * @throws MalformedURIException if p_addToPath contains syntax * errors */	TokenNameCOMMENT_JAVADOC	 Append to the end of the path of this URI. If the current path does not end in a slash and the path to be appended does not begin with a slash, a slash will be appended to the current path before the new segment is added. Also, if the current path ends in a slash and the new segment begins with a slash, the extra slash will be removed before the new segment is appended. * @param p_addToPath the new segment to be added to the current path * @throws MalformedURIException if p_addToPath contains syntax errors 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
p_addToPath	TokenNameIdentifier	 p add To Path
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Path contains invalid character!"); 	TokenNameCOMMENT_LINE	"Path contains invalid character!"); 
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
/** * Set the query string for this URI. A non-null value is valid only * if this is an URI conforming to the generic URI syntax and * the path value is not null. * * @param p_queryString the query string for this URI * * @throws MalformedURIException if p_queryString is not null and this * URI does not conform to the generic * URI syntax or if the path is null */	TokenNameCOMMENT_JAVADOC	 Set the query string for this URI. A non-null value is valid only if this is an URI conforming to the generic URI syntax and the path value is not null. * @param p_queryString the query string for this URI * @throws MalformedURIException if p_queryString is not null and this URI does not conform to the generic URI syntax or if the path is null 
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
/** * Set the fragment for this URI. A non-null value is valid only * if this is a URI conforming to the generic URI syntax and * the path value is not null. * * @param p_fragment the fragment for this URI * * @throws MalformedURIException if p_fragment is not null and this * URI does not conform to the generic * URI syntax or if the path is null */	TokenNameCOMMENT_JAVADOC	 Set the fragment for this URI. A non-null value is valid only if this is a URI conforming to the generic URI syntax and the path value is not null. * @param p_fragment the fragment for this URI * @throws MalformedURIException if p_fragment is not null and this URI does not conform to the generic URI syntax or if the path is null 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier	 ER  FRAG  FOR  GENERIC  URI
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Fragment can only be set for a generic URI!"); 	TokenNameCOMMENT_LINE	"Fragment can only be set for a generic URI!"); 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Fragment cannot be set when path is null!"); 	TokenNameCOMMENT_LINE	"Fragment cannot be set when path is null!"); 
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
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_FRAG_INVALID_CHAR	TokenNameIdentifier	 ER  FRAG  INVALID  CHAR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Fragment contains invalid character!"); 	TokenNameCOMMENT_LINE	"Fragment contains invalid character!"); 
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
/** * Determine whether a scheme conforms to the rules for a scheme name. * A scheme is conformant if it starts with an alphanumeric, and * contains only alphanumerics, '+','-' and '.'. * * * @param p_scheme The sheme name to check * @return true if the scheme is conformant, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a scheme conforms to the rules for a scheme name. A scheme is conformant if it starts with an alphanumeric, and contains only alphanumerics, '+','-' and '.'. * @param p_scheme The sheme name to check @return true if the scheme is conformant, false otherwise 
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
p_scheme	TokenNameIdentifier	 p scheme
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
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
isAlphanum	TokenNameIdentifier	 is Alphanum
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
SCHEME_CHARACTERS	TokenNameIdentifier	 SCHEME  CHARACTERS
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
/** * Determine whether a string is syntactically capable of representing * a valid IPv4 address or the domain name of a network host. A valid * IPv4 address consists of four decimal digit groups separated by a * '.'. A hostname consists of domain labels (each of which must * begin and end with an alphanumeric but may contain '-') separated * & by a '.'. See RFC 2396 Section 3.2.2. * * * @param p_address The address string to check * @return true if the string is a syntactically valid IPv4 address * or hostname */	TokenNameCOMMENT_JAVADOC	 Determine whether a string is syntactically capable of representing a valid IPv4 address or the domain name of a network host. A valid IPv4 address consists of four decimal digit groups separated by a '.'. A hostname consists of domain labels (each of which must begin and end with an alphanumeric but may contain '-') separated & by a '.'. See RFC 2396 Section 3.2.2. * @param p_address The address string to check @return true if the string is a syntactically valid IPv4 address or hostname 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isWellFormedAddress	TokenNameIdentifier	 is Well Formed Address
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p_address	TokenNameIdentifier	 p address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p_address	TokenNameIdentifier	 p address
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
p_address	TokenNameIdentifier	 p address
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
||	TokenNameOR_OR	
addrLength	TokenNameIdentifier	 addr Length
>	TokenNameGREATER	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
p_address	TokenNameIdentifier	 p address
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
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
;	TokenNameSEMICOLON	
int	TokenNameint	
numDots	TokenNameIdentifier	 num Dots
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// make sure that 1) we see only digits and dot separators, 2) that 	TokenNameCOMMENT_LINE	make sure that 1) we see only digits and dot separators, 2) that 
// any dot separator is preceded and followed by a digit and 	TokenNameCOMMENT_LINE	any dot separator is preceded and followed by a digit and 
// 3) that we find 3 dots 	TokenNameCOMMENT_LINE	3) that we find 3 dots 
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
numDots	TokenNameIdentifier	 num Dots
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numDots	TokenNameIdentifier	 num Dots
!=	TokenNameNOT_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// domain labels can contain alphanumerics and '-" 	TokenNameCOMMENT_LINE	domain labels can contain alphanumerics and '-" 
// but must start and end with an alphanumeric 	TokenNameCOMMENT_LINE	but must start and end with an alphanumeric 
char	TokenNamechar	
testChar	TokenNameIdentifier	 test Char
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is a digit. * * * @param p_char the character to check * @return true if the char is betweeen '0' and '9', false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is a digit. * @param p_char the character to check @return true if the char is betweeen '0' and '9', false otherwise 
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
/** * Determine whether a character is a hexadecimal character. * * * @param p_char the character to check * @return true if the char is betweeen '0' and '9', 'a' and 'f' * or 'A' and 'F', false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a character is a hexadecimal character. * @param p_char the character to check @return true if the char is betweeen '0' and '9', 'a' and 'f' or 'A' and 'F', false otherwise 
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
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
p_char	TokenNameIdentifier	 p char
<=	TokenNameLESS_EQUAL	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is an alphabetic character: a-z or A-Z * * * @param p_char the character to check * @return true if the char is alphabetic, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is an alphabetic character: a-z or A-Z * @param p_char the character to check @return true if the char is alphabetic, false otherwise 
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
/** * Determine whether a char is an alphanumeric: 0-9, a-z or A-Z * * * @param p_char the character to check * @return true if the char is alphanumeric, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is an alphanumeric: 0-9, a-z or A-Z * @param p_char the character to check @return true if the char is alphanumeric, false otherwise 
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
isAlpha	TokenNameIdentifier	 is Alpha
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a character is a reserved character: * ';', '/', '?', ':', '@', '&', '=', '+', '$' or ',' * * * @param p_char the character to check * @return true if the string contains any reserved characters */	TokenNameCOMMENT_JAVADOC	 Determine whether a character is a reserved character: ';', '/', '?', ':', '@', '&', '=', '+', '$' or ',' * @param p_char the character to check @return true if the string contains any reserved characters 
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
RESERVED_CHARACTERS	TokenNameIdentifier	 RESERVED  CHARACTERS
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a char is an unreserved character. * * * @param p_char the character to check * @return true if the char is unreserved, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a char is an unreserved character. * @param p_char the character to check @return true if the char is unreserved, false otherwise 
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
isAlphanum	TokenNameIdentifier	 is Alphanum
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
||	TokenNameOR_OR	
MARK_CHARACTERS	TokenNameIdentifier	 MARK  CHARACTERS
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
p_char	TokenNameIdentifier	 p char
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether a given string contains only URI characters (also * called "uric" in RFC 2396). uric consist of all reserved * characters, unreserved characters and escaped characters. * * * @param p_uric URI string * @return true if the string is comprised of uric, false otherwise */	TokenNameCOMMENT_JAVADOC	 Determine whether a given string contains only URI characters (also called "uric" in RFC 2396). uric consist of all reserved characters, unreserved characters and escaped characters. * @param p_uric URI string @return true if the string is comprised of uric, false otherwise 
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
isReservedCharacter	TokenNameIdentifier	 is Reserved Character
(	TokenNameLPAREN	
testChar	TokenNameIdentifier	 test Char
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isUnreservedCharacter	TokenNameIdentifier	 is Unreserved Character
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
