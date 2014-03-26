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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Selector that filters files based on whether they are newer than * a matching file in another directory tree. It can contain a mapper * element, so isn't available as an ExtendSelector (since those * parameters can't hold other elements). * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Selector that filters files based on whether they are newer than a matching file in another directory tree. It can contain a mapper element, so isn't available as an ExtendSelector (since those parameters can't hold other elements). * @since 1.5 
public	TokenNamepublic	
class	TokenNameclass	
DependSelector	TokenNameIdentifier	 Depend Selector
extends	TokenNameextends	
MappingSelector	TokenNameIdentifier	 Mapping Selector
{	TokenNameLBRACE	
/** * Creates a new <code>DependSelector</code> instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>DependSelector</code> instance. 
public	TokenNamepublic	
DependSelector	TokenNameIdentifier	 Depend Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @return a string describing this object */	TokenNameCOMMENT_JAVADOC	 @return a string describing this object 
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
"{dependselector targetdir: "	TokenNameStringLiteral	{dependselector targetdir: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetdir	TokenNameIdentifier	 targetdir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"NOT YET SET"	TokenNameStringLiteral	NOT YET SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
targetdir	TokenNameIdentifier	 targetdir
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" granularity: "	TokenNameStringLiteral	 granularity: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" mapper: "	TokenNameStringLiteral	 mapper: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
mapperElement	TokenNameIdentifier	 mapper Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" mapper: "	TokenNameStringLiteral	 mapper: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mapperElement	TokenNameIdentifier	 mapper Element
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
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
/** * this test is our selection test that compared the file with the destfile * @param srcfile the source file * @param destfile the destination file * @return true if destination is out of date */	TokenNameCOMMENT_JAVADOC	 this test is our selection test that compared the file with the destfile @param srcfile the source file @param destfile the destination file @return true if destination is out of date 
public	TokenNamepublic	
boolean	TokenNameboolean	
selectionTest	TokenNameIdentifier	 selection Test
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
srcfile	TokenNameIdentifier	 srcfile
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destfile	TokenNameIdentifier	 destfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
=	TokenNameEQUAL	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
isOutOfDate	TokenNameIdentifier	 is Out Of Date
(	TokenNameLPAREN	
srcfile	TokenNameIdentifier	 srcfile
,	TokenNameCOMMA	
destfile	TokenNameIdentifier	 destfile
,	TokenNameCOMMA	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
selected	TokenNameIdentifier	 selected
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
