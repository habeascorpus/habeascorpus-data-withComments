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
/** * This interface represents objects which creates Shape objects. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ShapeProducer.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface represents objects which creates Shape objects. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ShapeProducer.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ShapeProducer	TokenNameIdentifier	 Shape Producer
{	TokenNameLBRACE	
/** * Returns the Shape object initialized during the last parsing. * @return the shape or null if this handler has not been used to * parse a path. */	TokenNameCOMMENT_JAVADOC	 Returns the Shape object initialized during the last parsing. @return the shape or null if this handler has not been used to parse a path. 
Shape	TokenNameIdentifier	 Shape
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the winding rule used to construct the path. */	TokenNameCOMMENT_JAVADOC	 Sets the winding rule used to construct the path. 
void	TokenNamevoid	
setWindingRule	TokenNameIdentifier	 set Winding Rule
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the current winding rule. */	TokenNameCOMMENT_JAVADOC	 Returns the current winding rule. 
int	TokenNameint	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
