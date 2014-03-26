/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ComponentEvent	TokenNameIdentifier	 Component Event
;	TokenNameSEMICOLON	
/** * An interface for listeners of {@link JGVTComponent} events. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: JGVTComponentListener.java 478176 2006-11-22 14:50:50Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An interface for listeners of {@link JGVTComponent} events. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: JGVTComponentListener.java 478176 2006-11-22 14:50:50Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
JGVTComponentListener	TokenNameIdentifier	 JGVT Component Listener
{	TokenNameLBRACE	
int	TokenNameint	
COMPONENT_TRANSFORM_CHANGED	TokenNameIdentifier	 COMPONENT  TRANSFORM  CHANGED
=	TokenNameEQUAL	
ComponentEvent	TokenNameIdentifier	 Component Event
.	TokenNameDOT	
COMPONENT_LAST	TokenNameIdentifier	 COMPONENT  LAST
+	TokenNamePLUS	
1234	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Called when the rendering transform * changes on the JGVTComponentListener */	TokenNameCOMMENT_JAVADOC	 Called when the rendering transform changes on the JGVTComponentListener 
void	TokenNamevoid	
componentTransformChanged	TokenNameIdentifier	 component Transform Changed
(	TokenNameLPAREN	
ComponentEvent	TokenNameIdentifier	 Component Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
