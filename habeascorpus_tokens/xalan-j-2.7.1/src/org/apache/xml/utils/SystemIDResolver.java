/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SystemIDResolver.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SystemIDResolver.java 468655 2006-10-28 07:12:06Z minchau $ 
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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
.	TokenNameDOT	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
;	TokenNameSEMICOLON	
/** * This class is used to resolve relative URIs and SystemID * strings into absolute URIs. * * <p>This is a generic utility for resolving URIs, other than the * fact that it's declared to throw TransformerException. Please * see code comments for details on how resolution is performed.</p> * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class is used to resolve relative URIs and SystemID strings into absolute URIs. * <p>This is a generic utility for resolving URIs, other than the fact that it's declared to throw TransformerException. Please see code comments for details on how resolution is performed.</p> @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
{	TokenNameLBRACE	
/** * Get an absolute URI from a given relative URI (local path). * * <p>The relative URI is a local filesystem path. The path can be * absolute or relative. If it is a relative path, it is resolved relative * to the system property "user.dir" if it is available; if not (i.e. in an * Applet perhaps which throws SecurityException) then we just return the * relative path. The space and backslash characters are also replaced to * generate a good absolute URI.</p> * * @param localPath The relative URI to resolve * * @return Resolved absolute URI */	TokenNameCOMMENT_JAVADOC	 Get an absolute URI from a given relative URI (local path). * <p>The relative URI is a local filesystem path. The path can be absolute or relative. If it is a relative path, it is resolved relative to the system property "user.dir" if it is available; if not (i.e. in an Applet perhaps which throws SecurityException) then we just return the relative path. The space and backslash characters are also replaced to generate a good absolute URI.</p> * @param localPath The relative URI to resolve * @return Resolved absolute URI 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAbsoluteURIFromRelative	TokenNameIdentifier	 get Absolute URI From Relative
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
localPath	TokenNameIdentifier	 local Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localPath	TokenNameIdentifier	 local Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
localPath	TokenNameIdentifier	 local Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// If the local path is a relative path, then it is resolved against 	TokenNameCOMMENT_LINE	If the local path is a relative path, then it is resolved against 
// the "user.dir" system property. 	TokenNameCOMMENT_LINE	the "user.dir" system property. 
String	TokenNameIdentifier	 String
absolutePath	TokenNameIdentifier	 absolute Path
=	TokenNameEQUAL	
localPath	TokenNameIdentifier	 local Path
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAbsolutePath	TokenNameIdentifier	 is Absolute Path
(	TokenNameLPAREN	
localPath	TokenNameIdentifier	 local Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
absolutePath	TokenNameIdentifier	 absolute Path
=	TokenNameEQUAL	
getAbsolutePathFromRelativePath	TokenNameIdentifier	 get Absolute Path From Relative Path
(	TokenNameLPAREN	
localPath	TokenNameIdentifier	 local Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// user.dir not accessible from applet 	TokenNameCOMMENT_LINE	user.dir not accessible from applet 
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"file:"	TokenNameStringLiteral	file:
+	TokenNamePLUS	
localPath	TokenNameIdentifier	 local Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
urlString	TokenNameIdentifier	 url String
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
absolutePath	TokenNameIdentifier	 absolute Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
absolutePath	TokenNameIdentifier	 absolute Path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
urlString	TokenNameIdentifier	 url String
=	TokenNameEQUAL	
"file://"	TokenNameStringLiteral	file://
+	TokenNamePLUS	
absolutePath	TokenNameIdentifier	 absolute Path
;	TokenNameSEMICOLON	
else	TokenNameelse	
urlString	TokenNameIdentifier	 url String
=	TokenNameEQUAL	
"file:///"	TokenNameStringLiteral	file:///
+	TokenNamePLUS	
absolutePath	TokenNameIdentifier	 absolute Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
urlString	TokenNameIdentifier	 url String
=	TokenNameEQUAL	
"file:"	TokenNameStringLiteral	file:
+	TokenNamePLUS	
localPath	TokenNameIdentifier	 local Path
;	TokenNameSEMICOLON	
return	TokenNamereturn	
replaceChars	TokenNameIdentifier	 replace Chars
(	TokenNameLPAREN	
urlString	TokenNameIdentifier	 url String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an absolute path from a relative path. * * @param relativePath A relative path * @return The absolute path */	TokenNameCOMMENT_JAVADOC	 Return an absolute path from a relative path. * @param relativePath A relative path @return The absolute path 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAbsolutePathFromRelativePath	TokenNameIdentifier	 get Absolute Path From Relative Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
relativePath	TokenNameIdentifier	 relative Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
relativePath	TokenNameIdentifier	 relative Path
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if the systemId denotes an absolute URI . * * @param systemId The systemId string * @return true if the systemId is an an absolute URI */	TokenNameCOMMENT_JAVADOC	 Return true if the systemId denotes an absolute URI . * @param systemId The systemId string @return true if the systemId is an an absolute URI 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isAbsoluteURI	TokenNameIdentifier	 is Absolute URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** http://www.ietf.org/rfc/rfc2396.txt * Authors should be aware that a path segment which contains a colon * character cannot be used as the first segment of a relative URI path * (e.g., "this:that"), because it would be mistaken for a scheme name. **/	TokenNameCOMMENT_JAVADOC	 http://www.ietf.org/rfc/rfc2396.txt Authors should be aware that a path segment which contains a colon character cannot be used as the first segment of a relative URI path (e.g., "this:that"), because it would be mistaken for a scheme name. *
/** * %REVIEW% Can we assume here that systemId is a valid URI? * It looks like we cannot ( See discussion of this common problem in * Bugzilla Bug 22777 ). **/	TokenNameCOMMENT_JAVADOC	 %REVIEW% Can we assume here that systemId is a valid URI? It looks like we cannot ( See discussion of this common problem in Bugzilla Bug 22777 ). *
//"fix" for Bugzilla Bug 22777 	TokenNameCOMMENT_LINE	"fix" for Bugzilla Bug 22777 
if	TokenNameif	
(	TokenNameLPAREN	
isWindowsAbsolutePath	TokenNameIdentifier	 is Windows Absolute Path
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
fragmentIndex	TokenNameIdentifier	 fragment Index
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
queryIndex	TokenNameIdentifier	 query Index
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
slashIndex	TokenNameIdentifier	 slash Index
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
colonIndex	TokenNameIdentifier	 colon Index
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//finding substring before '#', '?', and '/' 	TokenNameCOMMENT_LINE	finding substring before '#', '?', and '/' 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fragmentIndex	TokenNameIdentifier	 fragment Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fragmentIndex	TokenNameIdentifier	 fragment Index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
queryIndex	TokenNameIdentifier	 query Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
queryIndex	TokenNameIdentifier	 query Index
<	TokenNameLESS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
queryIndex	TokenNameIdentifier	 query Index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
slashIndex	TokenNameIdentifier	 slash Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
slashIndex	TokenNameIdentifier	 slash Index
<	TokenNameLESS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
slashIndex	TokenNameIdentifier	 slash Index
;	TokenNameSEMICOLON	
// return true if there is ':' before '#', '?', and '/' 	TokenNameCOMMENT_LINE	return true if there is ':' before '#', '?', and '/' 
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
colonIndex	TokenNameIdentifier	 colon Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
colonIndex	TokenNameIdentifier	 colon Index
<	TokenNameLESS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if the local path is an absolute path. * * @param systemId The path string * @return true if the path is absolute */	TokenNameCOMMENT_JAVADOC	 Return true if the local path is an absolute path. * @param systemId The path string @return true if the path is absolute 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isAbsolutePath	TokenNameIdentifier	 is Absolute Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isAbsolute	TokenNameIdentifier	 is Absolute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if the local path is a Windows absolute path. * * @param systemId The path string * @return true if the path is a Windows absolute path */	TokenNameCOMMENT_JAVADOC	 Return true if the local path is a Windows absolute path. * @param systemId The path string @return true if the path is a Windows absolute path 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isWindowsAbsolutePath	TokenNameIdentifier	 is Windows Absolute Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAbsolutePath	TokenNameIdentifier	 is Absolute Path
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// On Windows, an absolute path starts with "[drive_letter]:\". 	TokenNameCOMMENT_LINE	On Windows, an absolute path starts with "[drive_letter]:\". 
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replace spaces with "%20" and backslashes with forward slashes in * the input string to generate a well-formed URI string. * * @param str The input string * @return The string after conversion */	TokenNameCOMMENT_JAVADOC	 Replace spaces with "%20" and backslashes with forward slashes in the input string to generate a well-formed URI string. * @param str The input string @return The string after conversion 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
replaceChars	TokenNameIdentifier	 replace Chars
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
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
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Replace space with "%20" 	TokenNameCOMMENT_LINE	Replace space with "%20" 
if	TokenNameif	
(	TokenNameLPAREN	
currentChar	TokenNameIdentifier	 current Char
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Replace backslash with forward slash 	TokenNameCOMMENT_LINE	Replace backslash with forward slash 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currentChar	TokenNameIdentifier	 current Char
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Take a SystemID string and try to turn it into a good absolute URI. * * @param systemId A URI string, which may be absolute or relative. * * @return The resolved absolute URI */	TokenNameCOMMENT_JAVADOC	 Take a SystemID string and try to turn it into a good absolute URI. * @param systemId A URI string, which may be absolute or relative. * @return The resolved absolute URI 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
absoluteURI	TokenNameIdentifier	 absolute URI
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isAbsoluteURI	TokenNameIdentifier	 is Absolute URI
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only process the systemId if it starts with "file:". 	TokenNameCOMMENT_LINE	Only process the systemId if it starts with "file:". 
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:"	TokenNameStringLiteral	file:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Resolve the absolute path if the systemId starts with "file:///" 	TokenNameCOMMENT_LINE	Resolve the absolute path if the systemId starts with "file:///" 
// or "file:/". Don't do anything if it only starts with "file://". 	TokenNameCOMMENT_LINE	or "file:/". Don't do anything if it only starts with "file://". 
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"///"	TokenNameStringLiteral	///
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"//"	TokenNameStringLiteral	//
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A Windows path containing a drive letter can be relative. 	TokenNameCOMMENT_LINE	A Windows path containing a drive letter can be relative. 
// A Unix path starting with "file:/" is always absolute. 	TokenNameCOMMENT_LINE	A Unix path starting with "file:/" is always absolute. 
int	TokenNameint	
secondColonIndex	TokenNameIdentifier	 second Colon Index
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
secondColonIndex	TokenNameIdentifier	 second Colon Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
localPath	TokenNameIdentifier	 local Path
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
secondColonIndex	TokenNameIdentifier	 second Colon Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAbsolutePath	TokenNameIdentifier	 is Absolute Path
(	TokenNameLPAREN	
localPath	TokenNameIdentifier	 local Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
absoluteURI	TokenNameIdentifier	 absolute URI
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
secondColonIndex	TokenNameIdentifier	 second Colon Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getAbsolutePathFromRelativePath	TokenNameIdentifier	 get Absolute Path From Relative Path
(	TokenNameLPAREN	
localPath	TokenNameIdentifier	 local Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAbsoluteURIFromRelative	TokenNameIdentifier	 get Absolute URI From Relative
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
replaceChars	TokenNameIdentifier	 replace Chars
(	TokenNameLPAREN	
absoluteURI	TokenNameIdentifier	 absolute URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
getAbsoluteURIFromRelative	TokenNameIdentifier	 get Absolute URI From Relative
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Take a SystemID string and try to turn it into a good absolute URI. * * @param urlString SystemID string * @param base The URI string used as the base for resolving the systemID * * @return The resolved absolute URI * @throws TransformerException thrown if the string can't be turned into a URI. */	TokenNameCOMMENT_JAVADOC	 Take a SystemID string and try to turn it into a good absolute URI. * @param urlString SystemID string @param base The URI string used as the base for resolving the systemID * @return The resolved absolute URI @throws TransformerException thrown if the string can't be turned into a URI. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlString	TokenNameIdentifier	 url String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
urlString	TokenNameIdentifier	 url String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
absoluteBase	TokenNameIdentifier	 absolute Base
=	TokenNameEQUAL	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URI	TokenNameIdentifier	 URI
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
URI	TokenNameIdentifier	 URI
baseURI	TokenNameIdentifier	 base URI
=	TokenNameEQUAL	
new	TokenNamenew	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
absoluteBase	TokenNameIdentifier	 absolute Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
new	TokenNamenew	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
,	TokenNameCOMMA	
urlString	TokenNameIdentifier	 url String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
replaceChars	TokenNameIdentifier	 replace Chars
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
