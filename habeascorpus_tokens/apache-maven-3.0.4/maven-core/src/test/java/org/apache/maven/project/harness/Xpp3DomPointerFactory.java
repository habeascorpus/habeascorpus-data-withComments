package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
harness	TokenNameIdentifier	 harness
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
NodePointer	TokenNameIdentifier	 Node Pointer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
NodePointerFactory	TokenNameIdentifier	 Node Pointer Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
;	TokenNameSEMICOLON	
/** * A node pointer factory for JXPath to support <code>Xpp3Dom</code>. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A node pointer factory for JXPath to support <code>Xpp3Dom</code>. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
Xpp3DomPointerFactory	TokenNameIdentifier	 Xpp3 Dom Pointer Factory
implements	TokenNameimplements	
NodePointerFactory	TokenNameIdentifier	 Node Pointer Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
getOrder	TokenNameIdentifier	 get Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodePointer	TokenNameIdentifier	 Node Pointer
createNodePointer	TokenNameIdentifier	 create Node Pointer
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
instanceof	TokenNameinstanceof	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Xpp3DomNodePointer	TokenNameIdentifier	 Xpp3 Dom Node Pointer
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodePointer	TokenNameIdentifier	 Node Pointer
createNodePointer	TokenNameIdentifier	 create Node Pointer
(	TokenNameLPAREN	
NodePointer	TokenNameIdentifier	 Node Pointer
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
instanceof	TokenNameinstanceof	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Xpp3DomNodePointer	TokenNameIdentifier	 Xpp3 Dom Node Pointer
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
