/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
flow	TokenNameIdentifier	 flow
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
FontRenderContext	TokenNameIdentifier	 Font Render Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Point2D	TokenNameIdentifier	 Point2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextLayoutFactory	TokenNameIdentifier	 Text Layout Factory
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextSpanLayout	TokenNameIdentifier	 Text Span Layout
;	TokenNameSEMICOLON	
/** * Factory instance that returns TextSpanLayouts appropriate to * FlowRoot instances. * * @see org.apache.batik.gvt.text.TextSpanLayout * @author <a href="mailto:dewese@apache.org">Thomas DeWeese</a> * @version $Id: FlowTextLayoutFactory.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Factory instance that returns TextSpanLayouts appropriate to FlowRoot instances. * @see org.apache.batik.gvt.text.TextSpanLayout @author <a href="mailto:dewese@apache.org">Thomas DeWeese</a> @version $Id: FlowTextLayoutFactory.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
FlowTextLayoutFactory	TokenNameIdentifier	 Flow Text Layout Factory
implements	TokenNameimplements	
TextLayoutFactory	TokenNameIdentifier	 Text Layout Factory
{	TokenNameLBRACE	
/** * Returns an instance of TextSpanLayout suitable for rendering the * AttributedCharacterIterator. * * @param aci The character iterator to be laid out * @param charMap Indicates how chars in aci map to original * text char array. * @param offset The offset position for the text layout. * @param frc The font render context to use when creating the text layout. */	TokenNameCOMMENT_JAVADOC	 Returns an instance of TextSpanLayout suitable for rendering the AttributedCharacterIterator. * @param aci The character iterator to be laid out @param charMap Indicates how chars in aci map to original text char array. @param offset The offset position for the text layout. @param frc The font render context to use when creating the text layout. 
public	TokenNamepublic	
TextSpanLayout	TokenNameIdentifier	 Text Span Layout
createTextLayout	TokenNameIdentifier	 create Text Layout
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charMap	TokenNameIdentifier	 char Map
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FlowGlyphLayout	TokenNameIdentifier	 Flow Glyph Layout
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
charMap	TokenNameIdentifier	 char Map
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
