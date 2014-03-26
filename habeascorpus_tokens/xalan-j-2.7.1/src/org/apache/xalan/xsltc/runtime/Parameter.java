/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Parameter.java 468652 2006-10-28 07:05:17Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Parameter.java 468652 2006-10-28 07:05:17Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
public	TokenNamepublic	
class	TokenNameclass	
Parameter	TokenNameIdentifier	 Parameter
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
_name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
_isDefault	TokenNameIdentifier	 is Default
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Parameter	TokenNameIdentifier	 Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
_value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
_isDefault	TokenNameIdentifier	 is Default
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Parameter	TokenNameIdentifier	 Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isDefault	TokenNameIdentifier	 is Default
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
_value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
_isDefault	TokenNameIdentifier	 is Default
=	TokenNameEQUAL	
isDefault	TokenNameIdentifier	 is Default
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
