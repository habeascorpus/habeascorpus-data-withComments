/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
/** * Context class for the SVG path element to support extra * methods. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: SVGPathContext.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Context class for the SVG path element to support extra methods. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: SVGPathContext.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGPathContext	TokenNameIdentifier	 SVG Path Context
extends	TokenNameextends	
SVGContext	TokenNameIdentifier	 SVG Context
{	TokenNameLBRACE	
/** * Returns the total length of the path. */	TokenNameCOMMENT_JAVADOC	 Returns the total length of the path. 
float	TokenNamefloat	
getTotalLength	TokenNameIdentifier	 get Total Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the point at the given distance along the path. */	TokenNameCOMMENT_JAVADOC	 Returns the point at the given distance along the path. 
Point2D	TokenNameIdentifier	 Point2 D
getPointAtLength	TokenNameIdentifier	 get Point At Length
(	TokenNameLPAREN	
float	TokenNamefloat	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the index of the path segment at the given distance along the * path. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the path segment at the given distance along the path. 
int	TokenNameint	
getPathSegAtLength	TokenNameIdentifier	 get Path Seg At Length
(	TokenNameLPAREN	
float	TokenNamefloat	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
