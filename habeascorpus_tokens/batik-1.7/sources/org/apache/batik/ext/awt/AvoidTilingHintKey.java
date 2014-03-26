/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
;	TokenNameSEMICOLON	
/** * A transcoding Key represented as a boolean to indicate whether tiling of * bitmaps is undesired by the destination. * * @version $Id: AvoidTilingHintKey.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 A transcoding Key represented as a boolean to indicate whether tiling of bitmaps is undesired by the destination. * @version $Id: AvoidTilingHintKey.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AvoidTilingHintKey	TokenNameIdentifier	 Avoid Tiling Hint Key
extends	TokenNameextends	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
{	TokenNameLBRACE	
AvoidTilingHintKey	TokenNameIdentifier	 Avoid Tiling Hint Key
(	TokenNameLPAREN	
int	TokenNameint	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatibleValue	TokenNameIdentifier	 is Compatible Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
RenderingHintsKeyExt	TokenNameIdentifier	 Rendering Hints Key Ext
.	TokenNameDOT	
VALUE_AVOID_TILE_PAINTING_ON	TokenNameIdentifier	 VALUE  AVOID  TILE  PAINTING  ON
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
RenderingHintsKeyExt	TokenNameIdentifier	 Rendering Hints Key Ext
.	TokenNameDOT	
VALUE_AVOID_TILE_PAINTING_OFF	TokenNameIdentifier	 VALUE  AVOID  TILE  PAINTING  OFF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
RenderingHintsKeyExt	TokenNameIdentifier	 Rendering Hints Key Ext
.	TokenNameDOT	
VALUE_AVOID_TILE_PAINTING_DEFAULT	TokenNameIdentifier	 VALUE  AVOID  TILE  PAINTING  DEFAULT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
