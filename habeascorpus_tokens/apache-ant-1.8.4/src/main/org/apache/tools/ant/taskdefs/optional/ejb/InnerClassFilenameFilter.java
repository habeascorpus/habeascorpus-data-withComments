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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
ejb	TokenNameIdentifier	 ejb
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
FilenameFilter	TokenNameIdentifier	 Filename Filter
;	TokenNameSEMICOLON	
/** * A filename filter for inner class files of a particular class. */	TokenNameCOMMENT_JAVADOC	 A filename filter for inner class files of a particular class. 
public	TokenNamepublic	
class	TokenNameclass	
InnerClassFilenameFilter	TokenNameIdentifier	 Inner Class Filename Filter
implements	TokenNameimplements	
FilenameFilter	TokenNameIdentifier	 Filename Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
baseClassName	TokenNameIdentifier	 base Class Name
;	TokenNameSEMICOLON	
/** * Constructor of filter. * @param baseclass the class to filter inner classes on. */	TokenNameCOMMENT_JAVADOC	 Constructor of filter. @param baseclass the class to filter inner classes on. 
InnerClassFilenameFilter	TokenNameIdentifier	 Inner Class Filename Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseclass	TokenNameIdentifier	 baseclass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
extidx	TokenNameIdentifier	 extidx
=	TokenNameEQUAL	
baseclass	TokenNameIdentifier	 baseclass
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extidx	TokenNameIdentifier	 extidx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extidx	TokenNameIdentifier	 extidx
=	TokenNameEQUAL	
baseclass	TokenNameIdentifier	 baseclass
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
baseClassName	TokenNameIdentifier	 base Class Name
=	TokenNameEQUAL	
baseclass	TokenNameIdentifier	 baseclass
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
extidx	TokenNameIdentifier	 extidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if the file name passes the filter. * @param dir not used. * @param filename the filename to filter on. * @return true if the filename is an inner class of the base class. */	TokenNameCOMMENT_JAVADOC	 Check if the file name passes the filter. @param dir not used. @param filename the filename to filter on. @return true if the filename is an inner class of the base class. 
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
baseClassName	TokenNameIdentifier	 base Class Name
+	TokenNamePLUS	
"$"	TokenNameStringLiteral	$
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
