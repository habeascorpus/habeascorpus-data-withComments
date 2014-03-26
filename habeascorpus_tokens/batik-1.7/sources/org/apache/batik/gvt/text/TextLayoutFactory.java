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
text	TokenNameIdentifier	 text
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
/** * Interface implemented by factory instances that can return * TextSpanLayouts appropriate to AttributedCharacterIterator * instances. * * @see org.apache.batik.gvt.text.TextSpanLayout * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @version $Id: TextLayoutFactory.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Interface implemented by factory instances that can return TextSpanLayouts appropriate to AttributedCharacterIterator instances. * @see org.apache.batik.gvt.text.TextSpanLayout @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @version $Id: TextLayoutFactory.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
TextLayoutFactory	TokenNameIdentifier	 Text Layout Factory
{	TokenNameLBRACE	
/** * Returns an instance of TextSpanLayout suitable for rendering the * AttributedCharacterIterator. * @param aci the character iterator to be laid out * @param charMap Indicates how chars in aci map to original * text char array. * @param offset The offset position for the text layout. * @param frc the rendering context for the fonts used. */	TokenNameCOMMENT_JAVADOC	 Returns an instance of TextSpanLayout suitable for rendering the AttributedCharacterIterator. @param aci the character iterator to be laid out @param charMap Indicates how chars in aci map to original text char array. @param offset The offset position for the text layout. @param frc the rendering context for the fonts used. 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
