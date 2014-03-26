/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * Class to hold a reference to another object in the project. * */	TokenNameCOMMENT_JAVADOC	 Class to hold a reference to another object in the project. 
public	TokenNamepublic	
class	TokenNameclass	
Reference	TokenNameIdentifier	 Reference
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
refid	TokenNameIdentifier	 refid
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/** * Create a reference. * @deprecated since 1.7. * Please use {@link Reference#Reference(Project,String)} * instead. */	TokenNameCOMMENT_JAVADOC	 Create a reference. @deprecated since 1.7. Please use {@link Reference#Reference(Project,String)} instead. 
public	TokenNamepublic	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Create a reference to a named ID. * @param id the name of this reference * @deprecated since 1.7. * Please use {@link Reference#Reference(Project,String)} * instead. */	TokenNameCOMMENT_JAVADOC	 Create a reference to a named ID. @param id the name of this reference @deprecated since 1.7. Please use {@link Reference#Reference(Project,String)} instead. 
public	TokenNamepublic	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setRefId	TokenNameIdentifier	 set Ref Id
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a reference to a named ID in a particular project. * @param p the project this reference is associated with * @param id the name of this reference * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Create a reference to a named ID in a particular project. @param p the project this reference is associated with @param id the name of this reference @since Ant 1.6.3 
public	TokenNamepublic	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setRefId	TokenNameIdentifier	 set Ref Id
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the reference id. Should not normally be necessary; * use {@link Reference#Reference(Project, String)}. * @param id the reference id to use */	TokenNameCOMMENT_JAVADOC	 Set the reference id. Should not normally be necessary; use {@link Reference#Reference(Project, String)}. @param id the reference id to use 
public	TokenNamepublic	
void	TokenNamevoid	
setRefId	TokenNameIdentifier	 set Ref Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refid	TokenNameIdentifier	 refid
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the reference id of this reference. * @return the reference id */	TokenNameCOMMENT_JAVADOC	 Get the reference id of this reference. @return the reference id 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRefId	TokenNameIdentifier	 get Ref Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
refid	TokenNameIdentifier	 refid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the associated project. Should not normally be necessary; * use {@link Reference#Reference(Project,String)}. * @param p the project to use * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Set the associated project. Should not normally be necessary; use {@link Reference#Reference(Project,String)}. @param p the project to use @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the associated project, if any; may be null. * @return the associated project * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Get the associated project, if any; may be null. @return the associated project @since Ant 1.6.3 
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
/** * Resolve the reference, using the associated project if * it set, otherwise use the passed in project. * @param fallback the fallback project to use if the project attribute of * reference is not set. * @return the dereferenced object. * @throws BuildException if the reference cannot be dereferenced. */	TokenNameCOMMENT_JAVADOC	 Resolve the reference, using the associated project if it set, otherwise use the passed in project. @param fallback the fallback project to use if the project attribute of reference is not set. @return the dereferenced object. @throws BuildException if the reference cannot be dereferenced. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
fallback	TokenNameIdentifier	 fallback
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refid	TokenNameIdentifier	 refid
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No reference specified"	TokenNameStringLiteral	No reference specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
fallback	TokenNameIdentifier	 fallback
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
refid	TokenNameIdentifier	 refid
)	TokenNameRPAREN	
:	TokenNameCOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
refid	TokenNameIdentifier	 refid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Reference "	TokenNameStringLiteral	Reference 
+	TokenNamePLUS	
refid	TokenNameIdentifier	 refid
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolve the reference, looking in the associated project. * @see Project#getReference * @return the dereferenced object. * @throws BuildException if the project is null or the reference cannot be dereferenced * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Resolve the reference, looking in the associated project. @see Project#getReference @return the dereferenced object. @throws BuildException if the project is null or the reference cannot be dereferenced @since Ant 1.6.3 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No project set on reference to "	TokenNameStringLiteral	No project set on reference to 
+	TokenNamePLUS	
refid	TokenNameIdentifier	 refid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
