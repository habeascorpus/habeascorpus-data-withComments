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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
/** * This class is here to workaround a javadoc problem. It is only used by * <code>GraphicsNode</code>. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: AreaOfInterestHintKey.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class is here to workaround a javadoc problem. It is only used by <code>GraphicsNode</code>. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: AreaOfInterestHintKey.java 475477 2006-11-15 22:44:28Z cam $ 
final	TokenNamefinal	
class	TokenNameclass	
AreaOfInterestHintKey	TokenNameIdentifier	 Area Of Interest Hint Key
extends	TokenNameextends	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
{	TokenNameLBRACE	
AreaOfInterestHintKey	TokenNameIdentifier	 Area Of Interest Hint Key
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
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isCompatible	TokenNameIdentifier	 is Compatible
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
instanceof	TokenNameinstanceof	
Shape	TokenNameIdentifier	 Shape
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isCompatible	TokenNameIdentifier	 is Compatible
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isCompatible	TokenNameIdentifier	 is Compatible
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
