package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Describes the required task segment as provided on the maven command line; i.e. "clean jetty:run install" * * @since 3.0 * @author Benjamin Bentmann * @author Kristian Rosenvold (extracted class only) * <p/> * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 Describes the required task segment as provided on the maven command line; i.e. "clean jetty:run install" * @since 3.0 @author Benjamin Bentmann @author Kristian Rosenvold (extracted class only) <p/> NOTE: This class is not part of any public api and can be changed or deleted without prior notice. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TaskSegment	TokenNameIdentifier	 Task Segment
{	TokenNameLBRACE	
// Can be both "LifeCycleTask" (clean/install) and "GoalTask" (org.mortbay.jetty:maven-jetty-plugin:6.1.19:run) 	TokenNameCOMMENT_LINE	Can be both "LifeCycleTask" (clean/install) and "GoalTask" (org.mortbay.jetty:maven-jetty-plugin:6.1.19:run) 
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
tasks	TokenNameIdentifier	 tasks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
aggregating	TokenNameIdentifier	 aggregating
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TaskSegment	TokenNameIdentifier	 Task Segment
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aggregating	TokenNameIdentifier	 aggregating
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
aggregating	TokenNameIdentifier	 aggregating
=	TokenNameEQUAL	
aggregating	TokenNameIdentifier	 aggregating
;	TokenNameSEMICOLON	
tasks	TokenNameIdentifier	 tasks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TaskSegment	TokenNameIdentifier	 Task Segment
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aggregating	TokenNameIdentifier	 aggregating
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
...	TokenNameELLIPSIS	
tasks	TokenNameIdentifier	 tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
aggregating	TokenNameIdentifier	 aggregating
=	TokenNameEQUAL	
aggregating	TokenNameIdentifier	 aggregating
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
tasks	TokenNameIdentifier	 tasks
)	TokenNameRPAREN	
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
getTasks	TokenNameIdentifier	 get Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
getTasks	TokenNameIdentifier	 get Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tasks	TokenNameIdentifier	 tasks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAggregating	TokenNameIdentifier	 is Aggregating
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aggregating	TokenNameIdentifier	 aggregating
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: Consider throwing UnsupprtedSomething on hashCode/equals 	TokenNameCOMMENT_LINE	TODO: Consider throwing UnsupprtedSomething on hashCode/equals 
}	TokenNameRBRACE	
