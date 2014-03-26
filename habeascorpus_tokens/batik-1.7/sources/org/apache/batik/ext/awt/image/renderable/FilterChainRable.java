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
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
/** * Implements a filter operation. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: FilterChainRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Implements a filter operation. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: FilterChainRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
FilterChainRable	TokenNameIdentifier	 Filter Chain Rable
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** * Returns the resolution along the X axis. */	TokenNameCOMMENT_JAVADOC	 Returns the resolution along the X axis. 
int	TokenNameint	
getFilterResolutionX	TokenNameIdentifier	 get Filter Resolution X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the resolution along the X axis, i.e., the maximum * size for intermediate images along that axis. * The value should be greater than zero to have an effect. */	TokenNameCOMMENT_JAVADOC	 Sets the resolution along the X axis, i.e., the maximum size for intermediate images along that axis. The value should be greater than zero to have an effect. 
void	TokenNamevoid	
setFilterResolutionX	TokenNameIdentifier	 set Filter Resolution X
(	TokenNameLPAREN	
int	TokenNameint	
filterResolutionX	TokenNameIdentifier	 filter Resolution X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the resolution along the Y axis. */	TokenNameCOMMENT_JAVADOC	 Returns the resolution along the Y axis. 
int	TokenNameint	
getFilterResolutionY	TokenNameIdentifier	 get Filter Resolution Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the resolution along the Y axis, i.e., the maximum * size for intermediate images along that axis. * The value should be greater than zero to have an effect. */	TokenNameCOMMENT_JAVADOC	 Sets the resolution along the Y axis, i.e., the maximum size for intermediate images along that axis. The value should be greater than zero to have an effect. 
void	TokenNamevoid	
setFilterResolutionY	TokenNameIdentifier	 set Filter Resolution Y
(	TokenNameLPAREN	
int	TokenNameint	
filterResolutionY	TokenNameIdentifier	 filter Resolution Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the filter output area, in user space. */	TokenNameCOMMENT_JAVADOC	 Sets the filter output area, in user space. 
void	TokenNamevoid	
setFilterRegion	TokenNameIdentifier	 set Filter Region
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
filterRegion	TokenNameIdentifier	 filter Region
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the filter output area, in user space */	TokenNameCOMMENT_JAVADOC	 Returns the filter output area, in user space 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getFilterRegion	TokenNameIdentifier	 get Filter Region
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the source for this chain. Should not be null */	TokenNameCOMMENT_JAVADOC	 Sets the source for this chain. Should not be null 
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns this filter's source. */	TokenNameCOMMENT_JAVADOC	 Returns this filter's source. 
Filter	TokenNameIdentifier	 Filter
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	