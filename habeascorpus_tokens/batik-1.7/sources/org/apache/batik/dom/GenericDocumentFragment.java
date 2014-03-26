/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This class implements {@link org.w3c.dom.DocumentFragment} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GenericDocumentFragment.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link org.w3c.dom.DocumentFragment} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GenericDocumentFragment.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GenericDocumentFragment	TokenNameIdentifier	 Generic Document Fragment
extends	TokenNameextends	
AbstractDocumentFragment	TokenNameIdentifier	 Abstract Document Fragment
{	TokenNameLBRACE	
/** * Is this element immutable? */	TokenNameCOMMENT_JAVADOC	 Is this element immutable? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
/** * Creates a new DocumentFragment object. */	TokenNameCOMMENT_JAVADOC	 Creates a new DocumentFragment object. 
protected	TokenNameprotected	
GenericDocumentFragment	TokenNameIdentifier	 Generic Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new DocumentFragment object. */	TokenNameCOMMENT_JAVADOC	 Creates a new DocumentFragment object. 
public	TokenNamepublic	
GenericDocumentFragment	TokenNameIdentifier	 Generic Document Fragment
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Tests whether this node is readonly. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReadonly	TokenNameIdentifier	 is Readonly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets this node readonly attribute. */	TokenNameCOMMENT_JAVADOC	 Sets this node readonly attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setReadonly	TokenNameIdentifier	 set Readonly
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readonly	TokenNameIdentifier	 readonly
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GenericDocumentFragment	TokenNameIdentifier	 Generic Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
