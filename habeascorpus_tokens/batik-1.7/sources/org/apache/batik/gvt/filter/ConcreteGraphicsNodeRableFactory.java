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
filter	TokenNameIdentifier	 filter
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
GraphicsNode	TokenNameIdentifier	 Graphics Node
;	TokenNameSEMICOLON	
/** * This interface lets <tt>GraphicsNode</tt> create instances of * <tt>GraphicsNodeRable</tt> appropriate for the filter module * implementation. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ConcreteGraphicsNodeRableFactory.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface lets <tt>GraphicsNode</tt> create instances of <tt>GraphicsNodeRable</tt> appropriate for the filter module implementation. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ConcreteGraphicsNodeRableFactory.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ConcreteGraphicsNodeRableFactory	TokenNameIdentifier	 Concrete Graphics Node Rable Factory
implements	TokenNameimplements	
GraphicsNodeRableFactory	TokenNameIdentifier	 Graphics Node Rable Factory
{	TokenNameLBRACE	
/** * Returns a <tt>GraphicsNodeRable</tt> initialized with the * input <tt>GraphicsNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Returns a <tt>GraphicsNodeRable</tt> initialized with the input <tt>GraphicsNode</tt>. 
public	TokenNamepublic	
GraphicsNodeRable	TokenNameIdentifier	 Graphics Node Rable
createGraphicsNodeRable	TokenNameIdentifier	 create Graphics Node Rable
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
GraphicsNodeRable	TokenNameIdentifier	 Graphics Node Rable
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getGraphicsNodeRable	TokenNameIdentifier	 get Graphics Node Rable
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
