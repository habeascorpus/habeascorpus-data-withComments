/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
table	TokenNameIdentifier	 table
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
RandomAccessFile	TokenNameIdentifier	 Random Access File
;	TokenNameSEMICOLON	
/** * * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> * @version $Id: GsubTable.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> @version $Id: GsubTable.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GsubTable	TokenNameIdentifier	 Gsub Table
implements	TokenNameimplements	
Table	TokenNameIdentifier	 Table
,	TokenNameCOMMA	
LookupSubtableFactory	TokenNameIdentifier	 Lookup Subtable Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
ScriptList	TokenNameIdentifier	 Script List
scriptList	TokenNameIdentifier	 script List
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FeatureList	TokenNameIdentifier	 Feature List
featureList	TokenNameIdentifier	 feature List
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LookupList	TokenNameIdentifier	 Lookup List
lookupList	TokenNameIdentifier	 lookup List
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
GsubTable	TokenNameIdentifier	 Gsub Table
(	TokenNameLPAREN	
DirectoryEntry	TokenNameIdentifier	 Directory Entry
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// GSUB Header 	TokenNameCOMMENT_LINE	GSUB Header 
/* int version = */	TokenNameCOMMENT_BLOCK	 int version = 
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
scriptListOffset	TokenNameIdentifier	 script List Offset
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
featureListOffset	TokenNameIdentifier	 feature List Offset
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lookupListOffset	TokenNameIdentifier	 lookup List Offset
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Script List 	TokenNameCOMMENT_LINE	Script List 
scriptList	TokenNameIdentifier	 script List
=	TokenNameEQUAL	
new	TokenNamenew	
ScriptList	TokenNameIdentifier	 Script List
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
scriptListOffset	TokenNameIdentifier	 script List Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Feature List 	TokenNameCOMMENT_LINE	Feature List 
featureList	TokenNameIdentifier	 feature List
=	TokenNameEQUAL	
new	TokenNamenew	
FeatureList	TokenNameIdentifier	 Feature List
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
featureListOffset	TokenNameIdentifier	 feature List Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Lookup List 	TokenNameCOMMENT_LINE	Lookup List 
lookupList	TokenNameIdentifier	 lookup List
=	TokenNameEQUAL	
new	TokenNamenew	
LookupList	TokenNameIdentifier	 Lookup List
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
lookupListOffset	TokenNameIdentifier	 lookup List Offset
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * 1 - Single - Replace one glyph with one glyph * 2 - Multiple - Replace one glyph with more than one glyph * 3 - Alternate - Replace one glyph with one of many glyphs * 4 - Ligature - Replace multiple glyphs with one glyph * 5 - Context - Replace one or more glyphs in context * 6 - Chaining - Context Replace one or more glyphs in chained context */	TokenNameCOMMENT_JAVADOC	 1 - Single - Replace one glyph with one glyph 2 - Multiple - Replace one glyph with more than one glyph 3 - Alternate - Replace one glyph with one of many glyphs 4 - Ligature - Replace multiple glyphs with one glyph 5 - Context - Replace one or more glyphs in context 6 - Chaining - Context Replace one or more glyphs in chained context 
public	TokenNamepublic	
LookupSubtable	TokenNameIdentifier	 Lookup Subtable
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
LookupSubtable	TokenNameIdentifier	 Lookup Subtable
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
SingleSubst	TokenNameIdentifier	 Single Subst
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// s = MultipleSubst.read(raf, offset); 	TokenNameCOMMENT_LINE	s = MultipleSubst.read(raf, offset); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// s = AlternateSubst.read(raf, offset); 	TokenNameCOMMENT_LINE	s = AlternateSubst.read(raf, offset); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
LigatureSubst	TokenNameIdentifier	 Ligature Subst
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// s = ContextSubst.read(raf, offset); 	TokenNameCOMMENT_LINE	s = ContextSubst.read(raf, offset); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// s = ChainingSubst.read(raf, offset); 	TokenNameCOMMENT_LINE	s = ChainingSubst.read(raf, offset); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the table type, as a table directory value. * @return The table type */	TokenNameCOMMENT_JAVADOC	 Get the table type, as a table directory value. @return The table type 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
GSUB	TokenNameIdentifier	 GSUB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ScriptList	TokenNameIdentifier	 Script List
getScriptList	TokenNameIdentifier	 get Script List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scriptList	TokenNameIdentifier	 script List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FeatureList	TokenNameIdentifier	 Feature List
getFeatureList	TokenNameIdentifier	 get Feature List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
featureList	TokenNameIdentifier	 feature List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LookupList	TokenNameIdentifier	 Lookup List
getLookupList	TokenNameIdentifier	 get Lookup List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lookupList	TokenNameIdentifier	 lookup List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"GSUB"	TokenNameStringLiteral	GSUB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
