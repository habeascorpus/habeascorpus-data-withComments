/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * A {@link java.net.URL}-like class that supports custom URI schemes * and GZIP encoding. * <p> * This class is used as a replacement for {@link java.net.URL}. * This is done for several reasons. First, unlike {@link java.net.URL} * this class will accept and parse as much of a URL as possible, without * throwing a {@link java.net.MalformedURLException}. This makes it useful * for simply parsing a URL string (hence its name). * </p> * <p> * Second, it allows for extension of the URI schemes supported by the * parser. Batik uses this to support the * <a href='http://www.ietf.org/rfc/rfc2397'><code>data:</code> URL scheme (RFC2397)</a>. * </p> * <p> * Third, by default it checks the streams that it opens to see if they * are GZIP compressed, and if so it automatically uncompresses them * (avoiding opening the stream twice in the process). * </p> * <p> * It is worth noting that most real work is defered to the * {@link ParsedURLData} class to which most methods are forwarded. * This is done because it allows a constructor interface to {@link ParsedURL} * (mostly for compatability with core {@link URL}), in spite of the fact that * the real implemenation uses the protocol handlers as factories for protocol * specific instances of the {@link ParsedURLData} class. * </p> * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: ParsedURL.java 606891 2007-12-26 11:45:26Z cam $ */	TokenNameCOMMENT_JAVADOC	 A {@link java.net.URL}-like class that supports custom URI schemes and GZIP encoding. <p> This class is used as a replacement for {@link java.net.URL}. This is done for several reasons. First, unlike {@link java.net.URL} this class will accept and parse as much of a URL as possible, without throwing a {@link java.net.MalformedURLException}. This makes it useful for simply parsing a URL string (hence its name). </p> <p> Second, it allows for extension of the URI schemes supported by the parser. Batik uses this to support the <a href='http://www.ietf.org/rfc/rfc2397'><code>data:</code> URL scheme (RFC2397)</a>. </p> <p> Third, by default it checks the streams that it opens to see if they are GZIP compressed, and if so it automatically uncompresses them (avoiding opening the stream twice in the process). </p> <p> It is worth noting that most real work is defered to the {@link ParsedURLData} class to which most methods are forwarded. This is done because it allows a constructor interface to {@link ParsedURL} (mostly for compatability with core {@link URL}), in spite of the fact that the real implemenation uses the protocol handlers as factories for protocol specific instances of the {@link ParsedURLData} class. </p> * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: ParsedURL.java 606891 2007-12-26 11:45:26Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ParsedURL	TokenNameIdentifier	 Parsed URL
{	TokenNameLBRACE	
/** * The data class we defer most things to. */	TokenNameCOMMENT_JAVADOC	 The data class we defer most things to. 
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
/** * The user agent to associate with this URL */	TokenNameCOMMENT_JAVADOC	 The user agent to associate with this URL 
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
;	TokenNameSEMICOLON	
/** * This maps between protocol names and ParsedURLProtocolHandler instances. */	TokenNameCOMMENT_JAVADOC	 This maps between protocol names and ParsedURLProtocolHandler instances. 
private	TokenNameprivate	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
handlersMap	TokenNameIdentifier	 handlers Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The default protocol handler. This handler is used when * other handlers fail or no match for a protocol can be * found. */	TokenNameCOMMENT_JAVADOC	 The default protocol handler. This handler is used when other handlers fail or no match for a protocol can be found. 
private	TokenNameprivate	
static	TokenNamestatic	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
defaultHandler	TokenNameIdentifier	 default Handler
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURLDefaultProtocolHandler	TokenNameIdentifier	 Parsed URL Default Protocol Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
globalUserAgent	TokenNameIdentifier	 global User Agent
=	TokenNameEQUAL	
"Batik/"	TokenNameStringLiteral	Batik/
+	TokenNamePLUS	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getGlobalUserAgent	TokenNameIdentifier	 get Global User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
globalUserAgent	TokenNameIdentifier	 global User Agent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setGlobalUserAgent	TokenNameIdentifier	 set Global User Agent
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
globalUserAgent	TokenNameIdentifier	 global User Agent
=	TokenNameEQUAL	
userAgent	TokenNameIdentifier	 user Agent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the shared instance of HandlersMap. This method is * also responsible for initializing the handler map if this is * the first time it has been requested since the class was * loaded. */	TokenNameCOMMENT_JAVADOC	 Returns the shared instance of HandlersMap. This method is also responsible for initializing the handler map if this is the first time it has been requested since the class was loaded. 
private	TokenNameprivate	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
Map	TokenNameIdentifier	 Map
getHandlersMap	TokenNameIdentifier	 get Handlers Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handlersMap	TokenNameIdentifier	 handlers Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
handlersMap	TokenNameIdentifier	 handlers Map
;	TokenNameSEMICOLON	
handlersMap	TokenNameIdentifier	 handlers Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerHandler	TokenNameIdentifier	 register Handler
(	TokenNameLPAREN	
new	TokenNamenew	
ParsedURLDataProtocolHandler	TokenNameIdentifier	 Parsed URL Data Protocol Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerHandler	TokenNameIdentifier	 register Handler
(	TokenNameLPAREN	
new	TokenNamenew	
ParsedURLJarProtocolHandler	TokenNameIdentifier	 Parsed URL Jar Protocol Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
Service	TokenNameIdentifier	 Service
.	TokenNameDOT	
providers	TokenNameIdentifier	 providers
(	TokenNameLPAREN	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Handler: " + handler); 	TokenNameCOMMENT_LINE	System.out.println("Handler: " + handler); 
registerHandler	TokenNameIdentifier	 register Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
handlersMap	TokenNameIdentifier	 handlers Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the handler for a particular protocol. If protocol is * <tt>null</tt> or no match is found in the handlers map it * returns the default protocol handler. * @param protocol The protocol to get a handler for. */	TokenNameCOMMENT_JAVADOC	 Returns the handler for a particular protocol. If protocol is <tt>null</tt> or no match is found in the handlers map it returns the default protocol handler. @param protocol The protocol to get a handler for. 
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
getHandler	TokenNameIdentifier	 get Handler
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
defaultHandler	TokenNameIdentifier	 default Handler
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
handlers	TokenNameIdentifier	 handlers
=	TokenNameEQUAL	
getHandlersMap	TokenNameIdentifier	 get Handlers Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
)	TokenNameRPAREN	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
defaultHandler	TokenNameIdentifier	 default Handler
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Registers a Protocol handler by adding it to the handlers map. * If the given protocol handler returns <tt>null</tt> as it's * supported protocol then it is registered as the default * protocol handler. * @param handler the new Protocol Handler to register */	TokenNameCOMMENT_JAVADOC	 Registers a Protocol handler by adding it to the handlers map. If the given protocol handler returns <tt>null</tt> as it's supported protocol then it is registered as the default protocol handler. @param handler the new Protocol Handler to register 
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
registerHandler	TokenNameIdentifier	 register Handler
(	TokenNameLPAREN	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getProtocolHandled	TokenNameIdentifier	 get Protocol Handled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultHandler	TokenNameIdentifier	 default Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Map	TokenNameIdentifier	 Map
handlers	TokenNameIdentifier	 handlers
=	TokenNameEQUAL	
getHandlersMap	TokenNameIdentifier	 get Handlers Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getProtocolHandled	TokenNameIdentifier	 get Protocol Handled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is a utility function others can call that checks if * is is a GZIP stream if so it returns a GZIPInputStream that * will decode the contents, otherwise it returns (or a * buffered version of is) untouched. * @param is Stream that may potentially be a GZIP stream. */	TokenNameCOMMENT_JAVADOC	 This is a utility function others can call that checks if is is a GZIP stream if so it returns a GZIPInputStream that will decode the contents, otherwise it returns (or a buffered version of is) untouched. @param is Stream that may potentially be a GZIP stream. 
public	TokenNamepublic	
static	TokenNamestatic	
InputStream	TokenNameIdentifier	 Input Stream
checkGZIP	TokenNameIdentifier	 check GZIP
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
.	TokenNameDOT	
checkGZIP	TokenNameIdentifier	 check GZIP
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a ParsedURL from the given url string. * @param urlStr The string to try and parse as a URL */	TokenNameCOMMENT_JAVADOC	 Construct a ParsedURL from the given url string. @param urlStr The string to try and parse as a URL 
public	TokenNamepublic	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userAgent	TokenNameIdentifier	 user Agent
=	TokenNameEQUAL	
getGlobalUserAgent	TokenNameIdentifier	 get Global User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a ParsedURL from the given java.net.URL instance. * This is useful if you already have a valid java.net.URL * instance. This bypasses most of the parsing and hence is * quicker and less prone to reinterpretation than converting the * URL to a string before construction. * * @param url The URL to "mimic". */	TokenNameCOMMENT_JAVADOC	 Construct a ParsedURL from the given java.net.URL instance. This is useful if you already have a valid java.net.URL instance. This bypasses most of the parsing and hence is quicker and less prone to reinterpretation than converting the URL to a string before construction. * @param url The URL to "mimic". 
public	TokenNamepublic	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userAgent	TokenNameIdentifier	 user Agent
=	TokenNameEQUAL	
getGlobalUserAgent	TokenNameIdentifier	 get Global User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a sub URL from two strings. * @param baseStr The 'parent' URL. Should be complete. * @param urlStr The 'sub' URL may be complete or partial. * the missing pieces will be taken from the baseStr. */	TokenNameCOMMENT_JAVADOC	 Construct a sub URL from two strings. @param baseStr The 'parent' URL. Should be complete. @param urlStr The 'sub' URL may be complete or partial. the missing pieces will be taken from the baseStr. 
public	TokenNamepublic	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseStr	TokenNameIdentifier	 base Str
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userAgent	TokenNameIdentifier	 user Agent
=	TokenNameEQUAL	
getGlobalUserAgent	TokenNameIdentifier	 get Global User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseStr	TokenNameIdentifier	 base Str
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
baseStr	TokenNameIdentifier	 base Str
,	TokenNameCOMMA	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a sub URL from a base URL and a string for the sub url. * @param baseURL The 'parent' URL. * @param urlStr The 'sub' URL may be complete or partial. * the missing pieces will be taken from the baseURL. */	TokenNameCOMMENT_JAVADOC	 Construct a sub URL from a base URL and a string for the sub url. @param baseURL The 'parent' URL. @param urlStr The 'sub' URL may be complete or partial. the missing pieces will be taken from the baseURL. 
public	TokenNamepublic	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
baseURL	TokenNameIdentifier	 base URL
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userAgent	TokenNameIdentifier	 user Agent
=	TokenNameEQUAL	
getGlobalUserAgent	TokenNameIdentifier	 get Global User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a sub URL from a base ParsedURL and a string for the sub url. * @param baseURL The 'parent' URL. * @param urlStr The 'sub' URL may be complete or partial. * the missing pieces will be taken from the baseURL. */	TokenNameCOMMENT_JAVADOC	 Construct a sub URL from a base ParsedURL and a string for the sub url. @param baseURL The 'parent' URL. @param urlStr The 'sub' URL may be complete or partial. the missing pieces will be taken from the baseURL. 
public	TokenNamepublic	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
baseURL	TokenNameIdentifier	 base URL
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userAgent	TokenNameIdentifier	 user Agent
=	TokenNameEQUAL	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
,	TokenNameCOMMA	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return a string rep of the URL (can be passed back into the * constructor if desired). */	TokenNameCOMMENT_JAVADOC	 Return a string rep of the URL (can be passed back into the constructor if desired). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implement Object.equals. * Relies heavily on the contained ParsedURLData's implementation * of equals. */	TokenNameCOMMENT_JAVADOC	 Implement Object.equals. Relies heavily on the contained ParsedURLData's implementation of equals. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
ParsedURL	TokenNameIdentifier	 Parsed URL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implement Object.hashCode. * Relies on the contained ParsedURLData's implementation * of hashCode. */	TokenNameCOMMENT_JAVADOC	 Implement Object.hashCode. Relies on the contained ParsedURLData's implementation of hashCode. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the URL looks well formed and complete. * This does not garuntee that the stream can be opened but * is a good indication that things aren't totally messed up. */	TokenNameCOMMENT_JAVADOC	 Returns true if the URL looks well formed and complete. This does not garuntee that the stream can be opened but is a good indication that things aren't totally messed up. 
public	TokenNamepublic	
boolean	TokenNameboolean	
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the user agent current associated with this url (or * null if none). */	TokenNameCOMMENT_JAVADOC	 Return the user agent current associated with this url (or null if none). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userAgent	TokenNameIdentifier	 user Agent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the user agent associated with this url (null clears * any associated user agent). */	TokenNameCOMMENT_JAVADOC	 Sets the user agent associated with this url (null clears any associated user agent). 
public	TokenNamepublic	
void	TokenNamevoid	
setUserAgent	TokenNameIdentifier	 set User Agent
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userAgent	TokenNameIdentifier	 user Agent
=	TokenNameEQUAL	
userAgent	TokenNameIdentifier	 user Agent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the protocol for this URL. * The protocol is everything upto the first ':'. */	TokenNameCOMMENT_JAVADOC	 Returns the protocol for this URL. The protocol is everything upto the first ':'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the host for this URL, if any, <tt>null</tt> if there isn't * one or it doesn't make sense for the protocol. */	TokenNameCOMMENT_JAVADOC	 Returns the host for this URL, if any, <tt>null</tt> if there isn't one or it doesn't make sense for the protocol. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
host	TokenNameIdentifier	 host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the port on the host to connect to, if it was specified * in the url that was parsed, otherwise returns -1. */	TokenNameCOMMENT_JAVADOC	 Returns the port on the host to connect to, if it was specified in the url that was parsed, otherwise returns -1. 
public	TokenNamepublic	
int	TokenNameint	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the path for this URL, if any (where appropriate for * the protocol this also includes the file, not just directory). * Note that getPath appears in JDK 1.3 as a synonym for getFile * from JDK 1.2. */	TokenNameCOMMENT_JAVADOC	 Returns the path for this URL, if any (where appropriate for the protocol this also includes the file, not just directory). Note that getPath appears in JDK 1.3 as a synonym for getFile from JDK 1.2. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the 'fragment' reference in the URL. */	TokenNameCOMMENT_JAVADOC	 Returns the 'fragment' reference in the URL. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the URL up to and include the port number on * the host. Does not include the path or fragment pieces. */	TokenNameCOMMENT_JAVADOC	 Returns the URL up to and include the port number on the host. Does not include the path or fragment pieces. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPortStr	TokenNameIdentifier	 get Port Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getPortStr	TokenNameIdentifier	 get Port Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the content type if available. This is only available * for some protocols. */	TokenNameCOMMENT_JAVADOC	 Returns the content type if available. This is only available for some protocols. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the content type's type/subtype, if available. This is * only available for some protocols. */	TokenNameCOMMENT_JAVADOC	 Returns the content type's type/subtype, if available. This is only available for some protocols. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentTypeMediaType	TokenNameIdentifier	 get Content Type Media Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getContentTypeMediaType	TokenNameIdentifier	 get Content Type Media Type
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the content type's charset parameter, if available. This is * only available for some protocols. */	TokenNameCOMMENT_JAVADOC	 Returns the content type's charset parameter, if available. This is only available for some protocols. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentTypeCharset	TokenNameIdentifier	 get Content Type Charset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getContentTypeCharset	TokenNameIdentifier	 get Content Type Charset
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the Content-Type header has the given parameter. */	TokenNameCOMMENT_JAVADOC	 Returns whether the Content-Type header has the given parameter. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasContentTypeParameter	TokenNameIdentifier	 has Content Type Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
hasContentTypeParameter	TokenNameIdentifier	 has Content Type Parameter
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the content encoding if available. This is only available * for some protocols. */	TokenNameCOMMENT_JAVADOC	 Returns the content encoding if available. This is only available for some protocols. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentEncoding	TokenNameIdentifier	 get Content Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getContentEncoding	TokenNameIdentifier	 get Content Encoding
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempt to open the stream checking for common compression * types, and automatically decompressing them if found. */	TokenNameCOMMENT_JAVADOC	 Attempt to open the stream checking for common compression types, and automatically decompressing them if found. 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempt to open the stream checking for common compression * types, and automatically decompressing them if found. * @param mimeType The expected mime type of the content * in the returned InputStream (mapped to Http accept * header among other possabilities). */	TokenNameCOMMENT_JAVADOC	 Attempt to open the stream checking for common compression types, and automatically decompressing them if found. @param mimeType The expected mime type of the content in the returned InputStream (mapped to Http accept header among other possabilities). 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
mt	TokenNameIdentifier	 mt
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mimeType	TokenNameIdentifier	 mime Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempt to open the stream checking for common compression * types, and automatically decompressing them if found. * @param mimeTypes The expected mime types of the content * in the returned InputStream (mapped to Http accept * header among other possabilities). */	TokenNameCOMMENT_JAVADOC	 Attempt to open the stream checking for common compression types, and automatically decompressing them if found. @param mimeTypes The expected mime types of the content in the returned InputStream (mapped to Http accept header among other possabilities). 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
mt	TokenNameIdentifier	 mt
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempt to open the stream checking for common compression * types, and automatically decompressing them if found. * @param mimeTypes The expected mime types of the content * in the returned InputStream (mapped to Http accept * header among other possabilities). The elements of * the iterator must be strings. */	TokenNameCOMMENT_JAVADOC	 Attempt to open the stream checking for common compression types, and automatically decompressing them if found. @param mimeTypes The expected mime types of the content in the returned InputStream (mapped to Http accept header among other possabilities). The elements of the iterator must be strings. 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempt to open the stream, does no checking for compression * types. */	TokenNameCOMMENT_JAVADOC	 Attempt to open the stream, does no checking for compression types. 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
openStreamRaw	TokenNameIdentifier	 open Stream Raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
openStreamRaw	TokenNameIdentifier	 open Stream Raw
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempt to open the stream, does no checking for compression * types. * @param mimeType The expected mime type of the content * in the returned InputStream (mapped to Http accept * header among other possabilities). */	TokenNameCOMMENT_JAVADOC	 Attempt to open the stream, does no checking for compression types. @param mimeType The expected mime type of the content in the returned InputStream (mapped to Http accept header among other possabilities). 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
openStreamRaw	TokenNameIdentifier	 open Stream Raw
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
mt	TokenNameIdentifier	 mt
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mimeType	TokenNameIdentifier	 mime Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
openStreamRaw	TokenNameIdentifier	 open Stream Raw
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempt to open the stream, does no checking for comression * types. * @param mimeTypes The expected mime types of the content * in the returned InputStream (mapped to Http accept * header among other possabilities). */	TokenNameCOMMENT_JAVADOC	 Attempt to open the stream, does no checking for comression types. @param mimeTypes The expected mime types of the content in the returned InputStream (mapped to Http accept header among other possabilities). 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
openStreamRaw	TokenNameIdentifier	 open Stream Raw
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
mt	TokenNameIdentifier	 mt
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
openStreamRaw	TokenNameIdentifier	 open Stream Raw
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempt to open the stream, does no checking for comression * types. * @param mimeTypes The expected mime types of the content * in the returned InputStream (mapped to Http accept * header among other possabilities). The elements of * the iterator must be strings. */	TokenNameCOMMENT_JAVADOC	 Attempt to open the stream, does no checking for comression types. @param mimeTypes The expected mime types of the content in the returned InputStream (mapped to Http accept header among other possabilities). The elements of the iterator must be strings. 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
openStreamRaw	TokenNameIdentifier	 open Stream Raw
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
openStreamRaw	TokenNameIdentifier	 open Stream Raw
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
sameFile	TokenNameIdentifier	 same File
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
sameFile	TokenNameIdentifier	 same File
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse out the protocol from a url string. Used internally to * select the proper handler, all other parsing is done by * the selected protocol handler. */	TokenNameCOMMENT_JAVADOC	 Parse out the protocol from a url string. Used internally to select the proper handler, all other parsing is done by the selected protocol handler. 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Protocol is only allowed to include -+.a-zA-Z 	TokenNameCOMMENT_LINE	Protocol is only allowed to include -+.a-zA-Z 
// So as soon as we hit something else we know we 	TokenNameCOMMENT_LINE	So as soon as we hit something else we know we 
// are done (if it is a ':' then we have protocol otherwise 	TokenNameCOMMENT_LINE	are done (if it is a ':' then we have protocol otherwise 
// we don't. 	TokenNameCOMMENT_LINE	we don't. 
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// todo this might be more efficient with a long mask 	TokenNameCOMMENT_LINE	todo this might be more efficient with a long mask 
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// which has a bit set for each valid char. 	TokenNameCOMMENT_LINE	which has a bit set for each valid char. 
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// check feasability 	TokenNameCOMMENT_LINE	check feasability 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Has a protocol spec... 	TokenNameCOMMENT_LINE	Has a protocol spec... 
return	TokenNamereturn	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory method to construct an appropriate subclass of ParsedURLData * @param urlStr the string to parse. */	TokenNameCOMMENT_JAVADOC	 Factory method to construct an appropriate subclass of ParsedURLData @param urlStr the string to parse. 
public	TokenNamepublic	
static	TokenNamestatic	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
getHandler	TokenNameIdentifier	 get Handler
(	TokenNameLPAREN	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory method to construct an appropriate subclass of ParsedURLData, * for a sub url. * @param baseStr The base URL string to parse. * @param urlStr the sub URL string to parse. */	TokenNameCOMMENT_JAVADOC	 Factory method to construct an appropriate subclass of ParsedURLData, for a sub url. @param baseStr The base URL string to parse. @param urlStr the sub URL string to parse. 
public	TokenNamepublic	
static	TokenNamestatic	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseStr	TokenNameIdentifier	 base Str
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseStr	TokenNameIdentifier	 base Str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
baseStr	TokenNameIdentifier	 base Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
,	TokenNameCOMMA	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory method to construct an appropriate subclass of ParsedURLData, * for a sub url. * @param baseURL The base ParsedURL to parse. * @param urlStr the sub URL string to parse. */	TokenNameCOMMENT_JAVADOC	 Factory method to construct an appropriate subclass of ParsedURLData, for a sub url. @param baseURL The base ParsedURL to parse. @param urlStr the sub URL string to parse. 
public	TokenNamepublic	
static	TokenNamestatic	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
baseURL	TokenNameIdentifier	 base URL
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParsedURLProtocolHandler	TokenNameIdentifier	 Parsed URL Protocol Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
getHandler	TokenNameIdentifier	 get Handler
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
,	TokenNameCOMMA	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
