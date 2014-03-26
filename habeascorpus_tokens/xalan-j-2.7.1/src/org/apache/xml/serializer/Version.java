/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Version.src 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Version.src 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
/** * Administrative class to keep track of the version number of * the Serializer release. * <P>This class implements the upcoming standard of having * org.apache.project-name.Version.getVersion() be a standard way * to get version information.</P> * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 Administrative class to keep track of the version number of the Serializer release. <P>This class implements the upcoming standard of having org.apache.project-name.Version.getVersion() be a standard way to get version information.</P> @xsl.usage general 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Version	TokenNameIdentifier	 Version
{	TokenNameLBRACE	
/** * Get the basic version string for the current Serializer. * Version String formatted like * <CODE>"<B>Serializer</B> <B>Java</B> v.r[.dd| <B>D</B>nn]"</CODE>. * * Futurework: have this read version info from jar manifest. * * @return String denoting our current version */	TokenNameCOMMENT_JAVADOC	 Get the basic version string for the current Serializer. Version String formatted like <CODE>"<B>Serializer</B> <B>Java</B> v.r[.dd| <B>D</B>nn]"</CODE>. * Futurework: have this read version info from jar manifest. * @return String denoting our current version 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProduct	TokenNameIdentifier	 get Product
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
getImplementationLanguage	TokenNameIdentifier	 get Implementation Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
getMajorVersionNum	TokenNameIdentifier	 get Major Version Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
getReleaseVersionNum	TokenNameIdentifier	 get Release Version Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
getDevelopmentVersionNum	TokenNameIdentifier	 get Development Version Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
"D"	TokenNameStringLiteral	D
+	TokenNamePLUS	
getDevelopmentVersionNum	TokenNameIdentifier	 get Development Version Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
getMaintenanceVersionNum	TokenNameIdentifier	 get Maintenance Version Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Name of product: Serializer. */	TokenNameCOMMENT_JAVADOC	 Name of product: Serializer. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getProduct	TokenNameIdentifier	 get Product
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Serializer"	TokenNameStringLiteral	Serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implementation Language: Java. */	TokenNameCOMMENT_JAVADOC	 Implementation Language: Java. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getImplementationLanguage	TokenNameIdentifier	 get Implementation Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Java"	TokenNameStringLiteral	Java
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Major version number. * Version number. This changes only when there is a * significant, externally apparent enhancement from * the previous release. 'n' represents the n'th * version. * * Clients should carefully consider the implications * of new versions as external interfaces and behaviour * may have changed. */	TokenNameCOMMENT_JAVADOC	 Major version number. Version number. This changes only when there is a significant, externally apparent enhancement from the previous release. 'n' represents the n'th version. * Clients should carefully consider the implications of new versions as external interfaces and behaviour may have changed. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getMajorVersionNum	TokenNameIdentifier	 get Major Version Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Release Number. * Release number. This changes when: * - a new set of functionality is to be added, eg, * implementation of a new W3C specification. * - API or behaviour change. * - its designated as a reference release. */	TokenNameCOMMENT_JAVADOC	 Release Number. Release number. This changes when: - a new set of functionality is to be added, eg, implementation of a new W3C specification. - API or behaviour change. - its designated as a reference release. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getReleaseVersionNum	TokenNameIdentifier	 get Release Version Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Maintenance Drop Number. * Optional identifier used to designate maintenance * drop applied to a specific release and contains * fixes for defects reported. It maintains compatibility * with the release and contains no API changes. * When missing, it designates the final and complete * development drop for a release. */	TokenNameCOMMENT_JAVADOC	 Maintenance Drop Number. Optional identifier used to designate maintenance drop applied to a specific release and contains fixes for defects reported. It maintains compatibility with the release and contains no API changes. When missing, it designates the final and complete development drop for a release. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getMaintenanceVersionNum	TokenNameIdentifier	 get Maintenance Version Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Development Drop Number. * Optional identifier designates development drop of * a specific release. D01 is the first development drop * of a new release. * * Development drops are works in progress towards a * compeleted, final release. A specific development drop * may not completely implement all aspects of a new * feature, which may take several development drops to * complete. At the point of the final drop for the * release, the D suffix will be omitted. * * Each 'D' drops can contain functional enhancements as * well as defect fixes. 'D' drops may not be as stable as * the final releases. */	TokenNameCOMMENT_JAVADOC	 Development Drop Number. Optional identifier designates development drop of a specific release. D01 is the first development drop of a new release. * Development drops are works in progress towards a compeleted, final release. A specific development drop may not completely implement all aspects of a new feature, which may take several development drops to complete. At the point of the final drop for the release, the D suffix will be omitted. * Each 'D' drops can contain functional enhancements as well as defect fixes. 'D' drops may not be as stable as the final releases. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getDevelopmentVersionNum	TokenNameIdentifier	 get Development Version Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
