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
renderer	TokenNameIdentifier	 renderer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics2D	TokenNameIdentifier	 Graphics2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
TextLayout	TokenNameIdentifier	 Text Layout
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
TextNode	TokenNameIdentifier	 Text Node
;	TokenNameSEMICOLON	
/** * Renders the attributed character iterator of a <tt>TextNode</tt>. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ConcreteTextPainter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Renders the attributed character iterator of a <tt>TextNode</tt>. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ConcreteTextPainter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ConcreteTextPainter	TokenNameIdentifier	 Concrete Text Painter
extends	TokenNameextends	
BasicTextPainter	TokenNameIdentifier	 Basic Text Painter
{	TokenNameLBRACE	
/** * Paints the specified attributed character iterator using the * specified Graphics2D and context and font context. * @param aci the AttributedCharacterIterator containing the text * @param location the location to paint the text * @param anchor the text anchor position * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints the specified attributed character iterator using the specified Graphics2D and context and font context. @param aci the AttributedCharacterIterator containing the text @param location the location to paint the text @param anchor the text anchor position @param g2d the Graphics2D to use 
public	TokenNamepublic	
void	TokenNamevoid	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
TextNode	TokenNameIdentifier	 Text Node
.	TokenNameDOT	
Anchor	TokenNameIdentifier	 Anchor
anchor	TokenNameIdentifier	 anchor
,	TokenNameCOMMA	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute aci size to be able to draw it 	TokenNameCOMMENT_LINE	Compute aci size to be able to draw it 
TextLayout	TokenNameIdentifier	 Text Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
TextLayout	TokenNameIdentifier	 Text Layout
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
fontRenderContext	TokenNameIdentifier	 font Render Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
advance	TokenNameIdentifier	 advance
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getAdvance	TokenNameIdentifier	 get Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
anchor	TokenNameIdentifier	 anchor
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TextNode	TokenNameIdentifier	 Text Node
.	TokenNameDOT	
Anchor	TokenNameIdentifier	 Anchor
.	TokenNameDOT	
ANCHOR_MIDDLE	TokenNameIdentifier	 ANCHOR  MIDDLE
:	TokenNameCOLON	
tx	TokenNameIdentifier	 tx
=	TokenNameEQUAL	
-	TokenNameMINUS	
advance	TokenNameIdentifier	 advance
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TextNode	TokenNameIdentifier	 Text Node
.	TokenNameDOT	
Anchor	TokenNameIdentifier	 Anchor
.	TokenNameDOT	
ANCHOR_END	TokenNameIdentifier	 ANCHOR  END
:	TokenNameCOLON	
tx	TokenNameIdentifier	 tx
=	TokenNameEQUAL	
-	TokenNameMINUS	
advance	TokenNameIdentifier	 advance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
tx	TokenNameIdentifier	 tx
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
