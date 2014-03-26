/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
auth	TokenNameIdentifier	 auth
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Objects	TokenNameIdentifier	 Objects
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
ComparisonChain	TokenNameIdentifier	 Comparison Chain
;	TokenNameSEMICOLON	
/** * Sets of instances of this class are returned by IAuthorizer.listPermissions() method for LIST PERMISSIONS query. * None of the fields are nullable. */	TokenNameCOMMENT_JAVADOC	 Sets of instances of this class are returned by IAuthorizer.listPermissions() method for LIST PERMISSIONS query. None of the fields are nullable. 
public	TokenNamepublic	
class	TokenNameclass	
PermissionDetails	TokenNameIdentifier	 Permission Details
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
PermissionDetails	TokenNameIdentifier	 Permission Details
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
IResource	TokenNameIdentifier	 I Resource
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Permission	TokenNameIdentifier	 Permission
permission	TokenNameIdentifier	 permission
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PermissionDetails	TokenNameIdentifier	 Permission Details
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
IResource	TokenNameIdentifier	 I Resource
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
permission	TokenNameIdentifier	 permission
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
username	TokenNameIdentifier	 username
=	TokenNameEQUAL	
username	TokenNameIdentifier	 username
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
permission	TokenNameIdentifier	 permission
=	TokenNameEQUAL	
permission	TokenNameIdentifier	 permission
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
PermissionDetails	TokenNameIdentifier	 Permission Details
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ComparisonChain	TokenNameIdentifier	 Comparison Chain
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
permission	TokenNameIdentifier	 permission
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
permission	TokenNameIdentifier	 permission
)	TokenNameRPAREN	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"<PermissionDetails username:%s resource:%s permission:%s>"	TokenNameStringLiteral	<PermissionDetails username:%s resource:%s permission:%s>
,	TokenNameCOMMA	
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
permission	TokenNameIdentifier	 permission
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
equal	TokenNameIdentifier	 equal
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
permission	TokenNameIdentifier	 permission
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
