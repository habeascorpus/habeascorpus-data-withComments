/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
;	TokenNameSEMICOLON	
/** * This class defines the Batik version number. * * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: Version.java 568875 2007-08-23 08:12:11Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class defines the Batik version number. * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: Version.java 568875 2007-08-23 08:12:11Z cam $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Version	TokenNameIdentifier	 Version
{	TokenNameLBRACE	
/** * Returns the Batik version. * <p> * This is based on the Implementation-Version attribute in the * batik-util.jar (which is where this Version class lives) and * the 'HeadURL' SVN keyword. The keyword be substituted with * the URL of this file, which is then inspected to determine if this * file was compiled from the trunk, a tag (a release version), or a * branch. The format of the returned string will be one of the * following: * </p> * <table> * <tr> * <th>Source</th> * <th>Version string</th> * </tr> * <tr> * <td>Release version</td> * <td><em>version</em></td> * </tr> * <tr> * <td>Trunk</td> * <td><em>version</em>+r<em>revision</em></td> * </tr> * <tr> * <td>Branch</td> * <td><em>version</em>+r<em>revision</em>; <em>branch-name</em></td> * </tr> * <tr> * <td>Unknown</td> * <td>development version</td> * </tr> * </table> * <p> * Prior to release 1.7, the version string would * be the straight tag (e.g. <code>"batik-1_6"</code>) or the * string <code>"development.version"</code>. <em>revision</em> is the * Subversion working copy's revision number. * </p> */	TokenNameCOMMENT_JAVADOC	 Returns the Batik version. <p> This is based on the Implementation-Version attribute in the batik-util.jar (which is where this Version class lives) and the 'HeadURL' SVN keyword. The keyword be substituted with the URL of this file, which is then inspected to determine if this file was compiled from the trunk, a tag (a release version), or a branch. The format of the returned string will be one of the following: </p> <table> <tr> <th>Source</th> <th>Version string</th> </tr> <tr> <td>Release version</td> <td><em>version</em></td> </tr> <tr> <td>Trunk</td> <td><em>version</em>+r<em>revision</em></td> </tr> <tr> <td>Branch</td> <td><em>version</em>+r<em>revision</em>; <em>branch-name</em></td> </tr> <tr> <td>Unknown</td> <td>development version</td> </tr> </table> <p> Prior to release 1.7, the version string would be the straight tag (e.g. <code>"batik-1_6"</code>) or the string <code>"development.version"</code>. <em>revision</em> is the Subversion working copy's revision number. </p> 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Package	TokenNameIdentifier	 Package
pkg	TokenNameIdentifier	 pkg
=	TokenNameEQUAL	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getPackage	TokenNameIdentifier	 get Package
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pkg	TokenNameIdentifier	 pkg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
pkg	TokenNameIdentifier	 pkg
.	TokenNameDOT	
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
headURL	TokenNameIdentifier	 head URL
=	TokenNameEQUAL	
"$HeadURL: https://svn.apache.org/repos/asf/xmlgraphics/batik/tags/batik-1_7/sources/org/apache/batik/Version.java $"	TokenNameStringLiteral	$HeadURL: https://svn.apache.org/repos/asf/xmlgraphics/batik/tags/batik-1_7/sources/org/apache/batik/Version.java $
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
"$HeadURL: "	TokenNameStringLiteral	$HeadURL: 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
"/sources/org/apache/batik/Version.java $"	TokenNameStringLiteral	/sources/org/apache/batik/Version.java $
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
headURL	TokenNameIdentifier	 head URL
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
headURL	TokenNameIdentifier	 head URL
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
headURL	TokenNameIdentifier	 head URL
=	TokenNameEQUAL	
headURL	TokenNameIdentifier	 head URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
headURL	TokenNameIdentifier	 head URL
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
headURL	TokenNameIdentifier	 head URL
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/trunk"	TokenNameStringLiteral	/trunk
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index1	TokenNameIdentifier	 index1
=	TokenNameEQUAL	
headURL	TokenNameIdentifier	 head URL
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index2	TokenNameIdentifier	 index2
=	TokenNameEQUAL	
headURL	TokenNameIdentifier	 head URL
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
index1	TokenNameIdentifier	 index1
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
headURL	TokenNameIdentifier	 head URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index1	TokenNameIdentifier	 index1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
headURL	TokenNameIdentifier	 head URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index2	TokenNameIdentifier	 index2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index1	TokenNameIdentifier	 index1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tagPrefix	TokenNameIdentifier	 tag Prefix
=	TokenNameEQUAL	
"batik-"	TokenNameStringLiteral	batik-
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"tags"	TokenNameStringLiteral	tags
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
tagPrefix	TokenNameIdentifier	 tag Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Release, just use the tag name 	TokenNameCOMMENT_LINE	Release, just use the tag name 
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
tagPrefix	TokenNameIdentifier	 tag Prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'_'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"branches"	TokenNameStringLiteral	branches
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// SVN branch 	TokenNameCOMMENT_LINE	SVN branch 
version	TokenNameIdentifier	 version
+=	TokenNamePLUS_EQUAL	
"; "	TokenNameStringLiteral	; 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
"development version"	TokenNameStringLiteral	development version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
