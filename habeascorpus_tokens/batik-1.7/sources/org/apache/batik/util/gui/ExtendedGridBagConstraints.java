/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
;	TokenNameSEMICOLON	
/** * This class extends the java.awt.GridBagConstraints in order to * provide some utility methods. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ExtendedGridBagConstraints.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class extends the java.awt.GridBagConstraints in order to provide some utility methods. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ExtendedGridBagConstraints.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ExtendedGridBagConstraints	TokenNameIdentifier	 Extended Grid Bag Constraints
extends	TokenNameextends	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
{	TokenNameLBRACE	
/** * Modifies gridx, gridy, gridwidth, gridheight. * * @param x The value for gridx. * @param y The value for gridy. * @param width The value for gridwidth. * @param height The value for gridheight. */	TokenNameCOMMENT_JAVADOC	 Modifies gridx, gridy, gridwidth, gridheight. * @param x The value for gridx. @param y The value for gridy. @param width The value for gridwidth. @param height The value for gridheight. 
public	TokenNamepublic	
void	TokenNamevoid	
setGridBounds	TokenNameIdentifier	 set Grid Bounds
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
gridwidth	TokenNameIdentifier	 gridwidth
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
gridheight	TokenNameIdentifier	 gridheight
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Modifies the weightx and weighty. * * @param weightx The value for weightx * @param weighty The value for weighty */	TokenNameCOMMENT_JAVADOC	 Modifies the weightx and weighty. * @param weightx The value for weightx @param weighty The value for weighty 
public	TokenNamepublic	
void	TokenNamevoid	
setWeight	TokenNameIdentifier	 set Weight
(	TokenNameLPAREN	
double	TokenNamedouble	
weightx	TokenNameIdentifier	 weightx
,	TokenNameCOMMA	
double	TokenNamedouble	
weighty	TokenNameIdentifier	 weighty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
weightx	TokenNameIdentifier	 weightx
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
weighty	TokenNameIdentifier	 weighty
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
