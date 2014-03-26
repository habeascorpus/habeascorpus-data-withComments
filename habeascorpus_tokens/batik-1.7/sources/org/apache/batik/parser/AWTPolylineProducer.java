/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
/** * This class produces a polyline shape from a reader. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AWTPolylineProducer.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class produces a polyline shape from a reader. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AWTPolylineProducer.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AWTPolylineProducer	TokenNameIdentifier	 AWT Polyline Producer
implements	TokenNameimplements	
PointsHandler	TokenNameIdentifier	 Points Handler
,	TokenNameCOMMA	
ShapeProducer	TokenNameIdentifier	 Shape Producer
{	TokenNameLBRACE	
/** * The current path. */	TokenNameCOMMENT_JAVADOC	 The current path. 
protected	TokenNameprotected	
GeneralPath	TokenNameIdentifier	 General Path
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
/** * Is the current path a new one? */	TokenNameCOMMENT_JAVADOC	 Is the current path a new one? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
newPath	TokenNameIdentifier	 new Path
;	TokenNameSEMICOLON	
/** * The winding rule to use to construct the path. */	TokenNameCOMMENT_JAVADOC	 The winding rule to use to construct the path. 
protected	TokenNameprotected	
int	TokenNameint	
windingRule	TokenNameIdentifier	 winding Rule
;	TokenNameSEMICOLON	
/** * Utility method for creating an ExtendedGeneralPath. * @param r The reader used to read the path specification. * @param wr The winding rule to use for creating the path. */	TokenNameCOMMENT_JAVADOC	 Utility method for creating an ExtendedGeneralPath. @param r The reader used to read the path specification. @param wr The winding rule to use for creating the path. 
public	TokenNamepublic	
static	TokenNamestatic	
Shape	TokenNameIdentifier	 Shape
createShape	TokenNameIdentifier	 create Shape
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
PointsParser	TokenNameIdentifier	 Points Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
PointsParser	TokenNameIdentifier	 Points Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AWTPolylineProducer	TokenNameIdentifier	 AWT Polyline Producer
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
new	TokenNamenew	
AWTPolylineProducer	TokenNameIdentifier	 AWT Polyline Producer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
setWindingRule	TokenNameIdentifier	 set Winding Rule
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setPointsHandler	TokenNameIdentifier	 set Points Handler
(	TokenNameLPAREN	
ph	TokenNameIdentifier	 ph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the winding rule used to construct the path. */	TokenNameCOMMENT_JAVADOC	 Sets the winding rule used to construct the path. 
public	TokenNamepublic	
void	TokenNamevoid	
setWindingRule	TokenNameIdentifier	 set Winding Rule
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
windingRule	TokenNameIdentifier	 winding Rule
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current winding rule. */	TokenNameCOMMENT_JAVADOC	 Returns the current winding rule. 
public	TokenNamepublic	
int	TokenNameint	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
windingRule	TokenNameIdentifier	 winding Rule
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Shape object initialized during the last parsing. * @return the shape or null if this handler has not been used by * a parser. */	TokenNameCOMMENT_JAVADOC	 Returns the Shape object initialized during the last parsing. @return the shape or null if this handler has not been used by a parser. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PointsHandler#startPoints()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PointsHandler#startPoints()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startPoints	TokenNameIdentifier	 start Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
windingRule	TokenNameIdentifier	 winding Rule
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newPath	TokenNameIdentifier	 new Path
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PointsHandler#point(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PointsHandler#point(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
point	TokenNameIdentifier	 point
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newPath	TokenNameIdentifier	 new Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newPath	TokenNameIdentifier	 new Path
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
moveTo	TokenNameIdentifier	 move To
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PointsHandler#endPoints()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PointsHandler#endPoints()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endPoints	TokenNameIdentifier	 end Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
