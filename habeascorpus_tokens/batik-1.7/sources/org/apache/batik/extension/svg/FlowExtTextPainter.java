/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
TextNode	TokenNameIdentifier	 Text Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
TextPainter	TokenNameIdentifier	 Text Painter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
StrokingTextPainter	TokenNameIdentifier	 Stroking Text Painter
;	TokenNameSEMICOLON	
/** * One line Class Desc * * Complete Class Desc * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: FlowExtTextPainter.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 One line Class Desc * Complete Class Desc * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: FlowExtTextPainter.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
FlowExtTextPainter	TokenNameIdentifier	 Flow Ext Text Painter
extends	TokenNameextends	
StrokingTextPainter	TokenNameIdentifier	 Stroking Text Painter
{	TokenNameLBRACE	
/** * A unique instance of this class. */	TokenNameCOMMENT_JAVADOC	 A unique instance of this class. 
protected	TokenNameprotected	
static	TokenNamestatic	
TextPainter	TokenNameIdentifier	 Text Painter
singleton	TokenNameIdentifier	 singleton
=	TokenNameEQUAL	
new	TokenNamenew	
FlowExtTextPainter	TokenNameIdentifier	 Flow Ext Text Painter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a unique instance of this class. */	TokenNameCOMMENT_JAVADOC	 Returns a unique instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
TextPainter	TokenNameIdentifier	 Text Painter
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
singleton	TokenNameIdentifier	 singleton
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getTextRuns	TokenNameIdentifier	 get Text Runs
(	TokenNameLPAREN	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
textRuns	TokenNameIdentifier	 text Runs
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getTextRuns	TokenNameIdentifier	 get Text Runs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
textRuns	TokenNameIdentifier	 text Runs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
textRuns	TokenNameIdentifier	 text Runs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunkACIs	TokenNameIdentifier	 chunk AC Is
=	TokenNameEQUAL	
getTextChunkACIs	TokenNameIdentifier	 get Text Chunk AC Is
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textRuns	TokenNameIdentifier	 text Runs
=	TokenNameEQUAL	
computeTextRuns	TokenNameIdentifier	 compute Text Runs
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
chunkACIs	TokenNameIdentifier	 chunk AC Is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
rgns	TokenNameIdentifier	 rgns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
FLOW_REGIONS	TokenNameIdentifier	 FLOW  REGIONS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rgns	TokenNameIdentifier	 rgns
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
textRuns	TokenNameIdentifier	 text Runs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
chunkLayouts	TokenNameIdentifier	 chunk Layouts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextRun	TokenNameIdentifier	 Text Run
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TextRun	TokenNameIdentifier	 Text Run
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
layouts	TokenNameIdentifier	 layouts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunkLayouts	TokenNameIdentifier	 chunk Layouts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
layouts	TokenNameIdentifier	 layouts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layouts	TokenNameIdentifier	 layouts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TextRun	TokenNameIdentifier	 Text Run
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
isFirstRunInChunk	TokenNameIdentifier	 is First Run In Chunk
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
layouts	TokenNameIdentifier	 layouts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunkLayouts	TokenNameIdentifier	 chunk Layouts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
layouts	TokenNameIdentifier	 layouts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
layouts	TokenNameIdentifier	 layouts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FlowExtGlyphLayout	TokenNameIdentifier	 Flow Ext Glyph Layout
.	TokenNameDOT	
textWrapTextChunk	TokenNameIdentifier	 text Wrap Text Chunk
(	TokenNameLPAREN	
chunkACIs	TokenNameIdentifier	 chunk AC Is
,	TokenNameCOMMA	
chunkLayouts	TokenNameIdentifier	 chunk Layouts
,	TokenNameCOMMA	
rgns	TokenNameIdentifier	 rgns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
setTextRuns	TokenNameIdentifier	 set Text Runs
(	TokenNameLPAREN	
textRuns	TokenNameIdentifier	 text Runs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
textRuns	TokenNameIdentifier	 text Runs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
