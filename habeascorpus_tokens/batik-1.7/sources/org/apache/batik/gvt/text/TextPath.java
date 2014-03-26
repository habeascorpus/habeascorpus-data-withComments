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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
GeneralPath	TokenNameIdentifier	 General Path
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
PathLength	TokenNameIdentifier	 Path Length
;	TokenNameSEMICOLON	
/** * A text path describes a path along which some text will be rendered. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: TextPath.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A text path describes a path along which some text will be rendered. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: TextPath.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TextPath	TokenNameIdentifier	 Text Path
{	TokenNameLBRACE	
private	TokenNameprivate	
PathLength	TokenNameIdentifier	 Path Length
pathLength	TokenNameIdentifier	 path Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
/** * Constructs a TextPath based on the specified path. * * @param path The general path along which text is to be laid. */	TokenNameCOMMENT_JAVADOC	 Constructs a TextPath based on the specified path. * @param path The general path along which text is to be laid. 
public	TokenNamepublic	
TextPath	TokenNameIdentifier	 Text Path
(	TokenNameLPAREN	
GeneralPath	TokenNameIdentifier	 General Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pathLength	TokenNameIdentifier	 path Length
=	TokenNameEQUAL	
new	TokenNamenew	
PathLength	TokenNameIdentifier	 Path Length
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the offset along the path where the first glyph should be rendered. * * @param startOffset An offset from the start of the path. */	TokenNameCOMMENT_JAVADOC	 Sets the offset along the path where the first glyph should be rendered. * @param startOffset An offset from the start of the path. 
public	TokenNamepublic	
void	TokenNamevoid	
setStartOffset	TokenNameIdentifier	 set Start Offset
(	TokenNameLPAREN	
float	TokenNamefloat	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the start offset of this text path. * * @return The start offset of this text path. */	TokenNameCOMMENT_JAVADOC	 Returns the start offset of this text path. * @return The start offset of this text path. 
public	TokenNamepublic	
float	TokenNamefloat	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the total length of the path. * * @return The lenght of the path. */	TokenNameCOMMENT_JAVADOC	 Returns the total length of the path. * @return The lenght of the path. 
public	TokenNamepublic	
float	TokenNamefloat	
lengthOfPath	TokenNameIdentifier	 length Of Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathLength	TokenNameIdentifier	 path Length
.	TokenNameDOT	
lengthOfPath	TokenNameIdentifier	 length Of Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the angle at the specified length * along the path. * * @param length The length along the path. * @return The angle. */	TokenNameCOMMENT_JAVADOC	 Returns the angle at the specified length along the path. * @param length The length along the path. @return The angle. 
public	TokenNamepublic	
float	TokenNamefloat	
angleAtLength	TokenNameIdentifier	 angle At Length
(	TokenNameLPAREN	
float	TokenNamefloat	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathLength	TokenNameIdentifier	 path Length
.	TokenNameDOT	
angleAtLength	TokenNameIdentifier	 angle At Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the point that is at the specified length * along the path. * * @param length The length along the path. * @return The point. */	TokenNameCOMMENT_JAVADOC	 Returns the point that is at the specified length along the path. * @param length The length along the path. @return The point. 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
pointAtLength	TokenNameIdentifier	 point At Length
(	TokenNameLPAREN	
float	TokenNamefloat	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathLength	TokenNameIdentifier	 path Length
.	TokenNameDOT	
pointAtLength	TokenNameIdentifier	 point At Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
