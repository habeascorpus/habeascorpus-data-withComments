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
/** * This class implements the {@link org.w3c.dom.Node} interface with support * for parent and siblings. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractChildNode.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.dom.Node} interface with support for parent and siblings. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractChildNode.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractChildNode	TokenNameIdentifier	 Abstract Child Node
extends	TokenNameextends	
AbstractNode	TokenNameIdentifier	 Abstract Node
{	TokenNameLBRACE	
/** * The parent node of this node. */	TokenNameCOMMENT_JAVADOC	 The parent node of this node. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
;	TokenNameSEMICOLON	
/** * The previous sibling. */	TokenNameCOMMENT_JAVADOC	 The previous sibling. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
previousSibling	TokenNameIdentifier	 previous Sibling
;	TokenNameSEMICOLON	
/** * Returns the next sibling. */	TokenNameCOMMENT_JAVADOC	 Returns the next sibling. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getParentNode()}. * @return {@link #parentNode} */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getParentNode()}. @return {@link #parentNode} 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parentNode	TokenNameIdentifier	 parent Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the parent node. */	TokenNameCOMMENT_JAVADOC	 Sets the parent node. 
public	TokenNamepublic	
void	TokenNamevoid	
setParentNode	TokenNameIdentifier	 set Parent Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentNode	TokenNameIdentifier	 parent Node
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the node immediately preceding this node. */	TokenNameCOMMENT_JAVADOC	 Sets the node immediately preceding this node. 
public	TokenNamepublic	
void	TokenNamevoid	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getPreviousSibling()}. * @return {@link #previousSibling}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getPreviousSibling()}. @return {@link #previousSibling}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
previousSibling	TokenNameIdentifier	 previous Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the node immediately following this node. */	TokenNameCOMMENT_JAVADOC	 Sets the node immediately following this node. 
public	TokenNamepublic	
void	TokenNamevoid	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNextSibling()}. * @return {@link #nextSibling}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNextSibling()}. @return {@link #nextSibling}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
