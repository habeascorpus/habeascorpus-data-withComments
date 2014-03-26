/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformHome.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformHome.java 470245 2006-11-02 06:34:33Z minchau $ 
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
CreateException	TokenNameIdentifier	 Create Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
ejb	TokenNameIdentifier	 ejb
.	TokenNameDOT	
EJBHome	TokenNameIdentifier	 EJB Home
;	TokenNameSEMICOLON	
/** * XSL transformation bean home interface * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 XSL transformation bean home interface @author Morten Jorgensen 
public	TokenNamepublic	
interface	TokenNameinterface	
TransformHome	TokenNameIdentifier	 Transform Home
extends	TokenNameextends	
EJBHome	TokenNameIdentifier	 EJB Home
{	TokenNameLBRACE	
TransformRemote	TokenNameIdentifier	 Transform Remote
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CreateException	TokenNameIdentifier	 Create Exception
,	TokenNameCOMMA	
RemoteException	TokenNameIdentifier	 Remote Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
