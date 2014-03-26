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
/** * * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> * @version $Id: GposTable.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> @version $Id: GposTable.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GposTable	TokenNameIdentifier	 Gpos Table
implements	TokenNameimplements	
Table	TokenNameIdentifier	 Table
{	TokenNameLBRACE	
protected	TokenNameprotected	
GposTable	TokenNameIdentifier	 Gpos Table
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
// GPOS Header 	TokenNameCOMMENT_LINE	GPOS Header 
/* int version = */	TokenNameCOMMENT_BLOCK	 int version = 
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* int scriptList = */	TokenNameCOMMENT_BLOCK	 int scriptList = 
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* int featureList = */	TokenNameCOMMENT_BLOCK	 int featureList = 
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* int lookupList = */	TokenNameCOMMENT_BLOCK	 int lookupList = 
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* for (int i = 0; i < t_maxp.getNumGlyphs(); i++) { raf.seek(tde.getOffset() + t_loca.getOffset(i)); int len = t_loca.getOffset((short)(i + 1)) - t_loca.getOffset(i); if (len > 0) { short numberOfContours = raf.readShort(); if (numberOfContours < 0) { // descript[i] = new TableGlyfCompositeDescript(this, raf); } else { descript[i] = new TableGlyfSimpleDescript(this, numberOfContours, raf); } } else { descript[i] = null; } } for (int i = 0; i < t_maxp.getNumGlyphs(); i++) { raf.seek(tde.getOffset() + t_loca.getOffset(i)); int len = t_loca.getOffset((short)(i + 1)) - t_loca.getOffset(i); if (len > 0) { short numberOfContours = raf.readShort(); if (numberOfContours < 0) { descript[i] = new TableGlyfCompositeDescript(this, raf); } } } */	TokenNameCOMMENT_BLOCK	 for (int i = 0; i < t_maxp.getNumGlyphs(); i++) { raf.seek(tde.getOffset() + t_loca.getOffset(i)); int len = t_loca.getOffset((short)(i + 1)) - t_loca.getOffset(i); if (len > 0) { short numberOfContours = raf.readShort(); if (numberOfContours < 0) { // descript[i] = new TableGlyfCompositeDescript(this, raf); } else { descript[i] = new TableGlyfSimpleDescript(this, numberOfContours, raf); } } else { descript[i] = null; } } for (int i = 0; i < t_maxp.getNumGlyphs(); i++) { raf.seek(tde.getOffset() + t_loca.getOffset(i)); int len = t_loca.getOffset((short)(i + 1)) - t_loca.getOffset(i); if (len > 0) { short numberOfContours = raf.readShort(); if (numberOfContours < 0) { descript[i] = new TableGlyfCompositeDescript(this, raf); } } } 
}	TokenNameRBRACE	
/** Get the table type, as a table directory value. * @return The table type */	TokenNameCOMMENT_JAVADOC	 Get the table type, as a table directory value. @return The table type 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
GPOS	TokenNameIdentifier	 GPOS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"GPOS"	TokenNameStringLiteral	GPOS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
