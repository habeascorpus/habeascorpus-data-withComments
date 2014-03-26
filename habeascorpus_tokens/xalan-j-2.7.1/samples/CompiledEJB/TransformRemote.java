/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformRemote.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformRemote.java 470245 2006-11-02 06:34:33Z minchau $ 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
RemoteException	TokenNameIdentifier	 Remote Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
ejb	TokenNameIdentifier	 ejb
.	TokenNameDOT	
EJBObject	TokenNameIdentifier	 EJB Object
;	TokenNameSEMICOLON	
/** * XSL transformation bean remote interface * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 XSL transformation bean remote interface @author Morten Jorgensen 
public	TokenNamepublic	
interface	TokenNameinterface	
TransformRemote	TokenNameIdentifier	 Transform Remote
extends	TokenNameextends	
EJBObject	TokenNameIdentifier	 EJB Object
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
transletName	TokenNameIdentifier	 translet Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
RemoteException	TokenNameIdentifier	 Remote Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
