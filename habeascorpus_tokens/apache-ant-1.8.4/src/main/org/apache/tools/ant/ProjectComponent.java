/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
/** * Base class for components of a project, including tasks and data types. * Provides common facilities. * */	TokenNameCOMMENT_JAVADOC	 Base class for components of a project, including tasks and data types. Provides common facilities. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ProjectComponent	TokenNameIdentifier	 Project Component
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * Project object of this component. * @deprecated since 1.6.x. * You should not be directly accessing this variable directly. * You should access project object via the getProject() * or setProject() accessor/mutators. */	TokenNameCOMMENT_JAVADOC	 Project object of this component. @deprecated since 1.6.x. You should not be directly accessing this variable directly. You should access project object via the getProject() or setProject() accessor/mutators. 
protected	TokenNameprotected	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/** * Location within the build file of this task definition. * @deprecated since 1.6.x. * You should not be accessing this variable directly. * Please use the {@link #getLocation()} method. */	TokenNameCOMMENT_JAVADOC	 Location within the build file of this task definition. @deprecated since 1.6.x. You should not be accessing this variable directly. Please use the {@link #getLocation()} method. 
protected	TokenNameprotected	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
Location	TokenNameIdentifier	 Location
.	TokenNameDOT	
UNKNOWN_LOCATION	TokenNameIdentifier	 UNKNOWN  LOCATION
;	TokenNameSEMICOLON	
/** * Description of this component, if any. * @deprecated since 1.6.x. * You should not be accessing this variable directly. */	TokenNameCOMMENT_JAVADOC	 Description of this component, if any. @deprecated since 1.6.x. You should not be accessing this variable directly. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** Sole constructor. */	TokenNameCOMMENT_JAVADOC	 Sole constructor. 
public	TokenNamepublic	
ProjectComponent	TokenNameIdentifier	 Project Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets the project object of this component. This method is used by * Project when a component is added to it so that the component has * access to the functions of the project. It should not be used * for any other purpose. * * @param project Project in whose scope this component belongs. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the project object of this component. This method is used by Project when a component is added to it so that the component has access to the functions of the project. It should not be used for any other purpose. * @param project Project in whose scope this component belongs. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the project to which this component belongs. * * @return the components's project. */	TokenNameCOMMENT_JAVADOC	 Returns the project to which this component belongs. * @return the components's project. 
public	TokenNamepublic	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the file/location where this task was defined. * * @return the file/location where this task was defined. * Should not return <code>null</code>. Location.UNKNOWN_LOCATION * is used for unknown locations. * * @see Location#UNKNOWN_LOCATION */	TokenNameCOMMENT_JAVADOC	 Returns the file/location where this task was defined. * @return the file/location where this task was defined. Should not return <code>null</code>. Location.UNKNOWN_LOCATION is used for unknown locations. * @see Location#UNKNOWN_LOCATION 
public	TokenNamepublic	
Location	TokenNameIdentifier	 Location
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the file/location where this task was defined. * * @param location The file/location where this task was defined. * Should not be <code>null</code>--use * Location.UNKNOWN_LOCATION if the location isn't known. * * @see Location#UNKNOWN_LOCATION */	TokenNameCOMMENT_JAVADOC	 Sets the file/location where this task was defined. * @param location The file/location where this task was defined. Should not be <code>null</code>--use Location.UNKNOWN_LOCATION if the location isn't known. * @see Location#UNKNOWN_LOCATION 
public	TokenNamepublic	
void	TokenNamevoid	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a description of the current action. This may be used for logging * purposes. * * @param desc Description of the current action. * May be <code>null</code>, indicating that no description is * available. * */	TokenNameCOMMENT_JAVADOC	 Sets a description of the current action. This may be used for logging purposes. * @param desc Description of the current action. May be <code>null</code>, indicating that no description is available. 
public	TokenNamepublic	
void	TokenNamevoid	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
description	TokenNameIdentifier	 description
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the description of the current action. * * @return the description of the current action, or <code>null</code> if * no description is available. */	TokenNameCOMMENT_JAVADOC	 Returns the description of the current action. * @return the description of the current action, or <code>null</code> if no description is available. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Logs a message with the default (INFO) priority. * * @param msg The message to be logged. Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Logs a message with the default (INFO) priority. * @param msg The message to be logged. Should not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Logs a message with the given priority. * * @param msg The message to be logged. Should not be <code>null</code>. * @param msgLevel the message priority at which this message is * to be logged. */	TokenNameCOMMENT_JAVADOC	 Logs a message with the given priority. * @param msg The message to be logged. Should not be <code>null</code>. @param msgLevel the message priority at which this message is to be logged. 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
int	TokenNameint	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// 'reasonable' default, if the component is used without 	TokenNameCOMMENT_LINE	'reasonable' default, if the component is used without 
// a Project ( for example as a standalone Bean ). 	TokenNameCOMMENT_LINE	a Project ( for example as a standalone Bean ). 
// Most ant components can be used this way. 	TokenNameCOMMENT_LINE	Most ant components can be used this way. 
if	TokenNameif	
(	TokenNameLPAREN	
msgLevel	TokenNameIdentifier	 msg Level
<=	TokenNameLESS_EQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @since Ant 1.7 * @return a shallow copy of this projectcomponent. * @throws CloneNotSupportedException does not happen, * but is declared to allow subclasses to do so. */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.7 @return a shallow copy of this projectcomponent. @throws CloneNotSupportedException does not happen, but is declared to allow subclasses to do so. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
ProjectComponent	TokenNameIdentifier	 Project Component
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pc	TokenNameIdentifier	 pc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
