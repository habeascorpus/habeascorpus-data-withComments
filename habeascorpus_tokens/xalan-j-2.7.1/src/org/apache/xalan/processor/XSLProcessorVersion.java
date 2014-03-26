/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLProcessorVersion.src 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLProcessorVersion.src 468640 2006-10-28 06:53:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
/** * Administrative class to keep track of the version number of * the Xalan release. * <P>See also: org/apache/xalan/res/XSLTInfo.properties</P> * @deprecated To be replaced by org.apache.xalan.Version.getVersion() * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 Administrative class to keep track of the version number of the Xalan release. <P>See also: org/apache/xalan/res/XSLTInfo.properties</P> @deprecated To be replaced by org.apache.xalan.Version.getVersion() @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
XSLProcessorVersion	TokenNameIdentifier	 XSL Processor Version
{	TokenNameLBRACE	
/** * Print the processor version to the command line. * * @param argv command line arguments, unused. */	TokenNameCOMMENT_JAVADOC	 Print the processor version to the command line. * @param argv command line arguments, unused. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
S_VERSION	TokenNameIdentifier	 S  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constant name of product. */	TokenNameCOMMENT_JAVADOC	 Constant name of product. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PRODUCT	TokenNameIdentifier	 PRODUCT
=	TokenNameEQUAL	
"Xalan"	TokenNameStringLiteral	Xalan
;	TokenNameSEMICOLON	
/** * Implementation Language. */	TokenNameCOMMENT_JAVADOC	 Implementation Language. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LANGUAGE	TokenNameIdentifier	 LANGUAGE
=	TokenNameEQUAL	
"Java"	TokenNameStringLiteral	Java
;	TokenNameSEMICOLON	
/** * Major version number. * Version number. This changes only when there is a * significant, externally apparent enhancement from * the previous release. 'n' represents the n'th * version. * * Clients should carefully consider the implications * of new versions as external interfaces and behaviour * may have changed. */	TokenNameCOMMENT_JAVADOC	 Major version number. Version number. This changes only when there is a significant, externally apparent enhancement from the previous release. 'n' represents the n'th version. * Clients should carefully consider the implications of new versions as external interfaces and behaviour may have changed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION	TokenNameIdentifier	 VERSION
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Release Number. * Release number. This changes when: * - a new set of functionality is to be added, eg, * implementation of a new W3C specification. * - API or behaviour change. * - its designated as a reference release. */	TokenNameCOMMENT_JAVADOC	 Release Number. Release number. This changes when: - a new set of functionality is to be added, eg, implementation of a new W3C specification. - API or behaviour change. - its designated as a reference release. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RELEASE	TokenNameIdentifier	 RELEASE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Maintenance Drop Number. * Optional identifier used to designate maintenance * drop applied to a specific release and contains * fixes for defects reported. It maintains compatibility * with the release and contains no API changes. * When missing, it designates the final and complete * development drop for a release. */	TokenNameCOMMENT_JAVADOC	 Maintenance Drop Number. Optional identifier used to designate maintenance drop applied to a specific release and contains fixes for defects reported. It maintains compatibility with the release and contains no API changes. When missing, it designates the final and complete development drop for a release. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAINTENANCE	TokenNameIdentifier	 MAINTENANCE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Development Drop Number. * Optional identifier designates development drop of * a specific release. D01 is the first development drop * of a new release. * * Development drops are works in progress towards a * compeleted, final release. A specific development drop * may not completely implement all aspects of a new * feature, which may take several development drops to * complete. At the point of the final drop for the * release, the D suffix will be omitted. * * Each 'D' drops can contain functional enhancements as * well as defect fixes. 'D' drops may not be as stable as * the final releases. */	TokenNameCOMMENT_JAVADOC	 Development Drop Number. Optional identifier designates development drop of a specific release. D01 is the first development drop of a new release. * Development drops are works in progress towards a compeleted, final release. A specific development drop may not completely implement all aspects of a new feature, which may take several development drops to complete. At the point of the final drop for the release, the D suffix will be omitted. * Each 'D' drops can contain functional enhancements as well as defect fixes. 'D' drops may not be as stable as the final releases. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEVELOPMENT	TokenNameIdentifier	 DEVELOPMENT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Version String like <CODE>"<B>Xalan</B> <B>Language</B> * v.r[.dd| <B>D</B>nn]"</CODE>. * <P>Semantics of the version string are identical to the Xerces project.</P> */	TokenNameCOMMENT_JAVADOC	 Version String like <CODE>"<B>Xalan</B> <B>Language</B> v.r[.dd| <B>D</B>nn]"</CODE>. <P>Semantics of the version string are identical to the Xerces project.</P> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_VERSION	TokenNameIdentifier	 S  VERSION
=	TokenNameEQUAL	
PRODUCT	TokenNameIdentifier	 PRODUCT
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
LANGUAGE	TokenNameIdentifier	 LANGUAGE
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
RELEASE	TokenNameIdentifier	 RELEASE
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
(	TokenNameLPAREN	
DEVELOPMENT	TokenNameIdentifier	 DEVELOPMENT
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
"D"	TokenNameStringLiteral	D
+	TokenNamePLUS	
DEVELOPMENT	TokenNameIdentifier	 DEVELOPMENT
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
MAINTENANCE	TokenNameIdentifier	 MAINTENANCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
