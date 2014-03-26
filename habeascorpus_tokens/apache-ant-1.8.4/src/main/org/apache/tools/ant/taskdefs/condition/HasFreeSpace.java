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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * &lt;hasfreespace&gt; * <p>Condition returns true if selected partition * has the requested space, false otherwise.</p> * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 &lt;hasfreespace&gt; <p>Condition returns true if selected partition has the requested space, false otherwise.</p> @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
HasFreeSpace	TokenNameIdentifier	 Has Free Space
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
partition	TokenNameIdentifier	 partition
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
needed	TokenNameIdentifier	 needed
;	TokenNameSEMICOLON	
/** * Evaluate the condition. * @return true if there enough free space. * @throws BuildException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Evaluate the condition. @return true if there enough free space. @throws BuildException if there is a problem. 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
isAtLeastJavaVersion	TokenNameIdentifier	 is At Least Java Version
(	TokenNameLPAREN	
"1.6"	TokenNameStringLiteral	1.6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//reflection to avoid bootstrap/build problems 	TokenNameCOMMENT_LINE	reflection to avoid bootstrap/build problems 
File	TokenNameIdentifier	 File
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
partition	TokenNameIdentifier	 partition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
(	TokenNameLPAREN	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
free	TokenNameIdentifier	 free
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
"getFreeSpace"	TokenNameStringLiteral	getFreeSpace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
free	TokenNameIdentifier	 free
>=	TokenNameGREATER_EQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
parseHumanSizes	TokenNameIdentifier	 parse Human Sizes
(	TokenNameLPAREN	
needed	TokenNameIdentifier	 needed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"HasFreeSpace condition not supported on Java5 or less."	TokenNameStringLiteral	HasFreeSpace condition not supported on Java5 or less.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
partition	TokenNameIdentifier	 partition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Please set the partition attribute."	TokenNameStringLiteral	Please set the partition attribute.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
needed	TokenNameIdentifier	 needed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Please set the needed attribute."	TokenNameStringLiteral	Please set the needed attribute.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The partition/device to check * @return the partition. */	TokenNameCOMMENT_JAVADOC	 The partition/device to check @return the partition. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPartition	TokenNameIdentifier	 get Partition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partition	TokenNameIdentifier	 partition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the partition name. * @param partition the name to use. */	TokenNameCOMMENT_JAVADOC	 Set the partition name. @param partition the name to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setPartition	TokenNameIdentifier	 set Partition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
partition	TokenNameIdentifier	 partition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
partition	TokenNameIdentifier	 partition
=	TokenNameEQUAL	
partition	TokenNameIdentifier	 partition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The amount of free space required * @return the amount required */	TokenNameCOMMENT_JAVADOC	 The amount of free space required @return the amount required 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNeeded	TokenNameIdentifier	 get Needed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
needed	TokenNameIdentifier	 needed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the amount of space required. * @param needed the amount required. */	TokenNameCOMMENT_JAVADOC	 Set the amount of space required. @param needed the amount required. 
public	TokenNamepublic	
void	TokenNamevoid	
setNeeded	TokenNameIdentifier	 set Needed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
needed	TokenNameIdentifier	 needed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
needed	TokenNameIdentifier	 needed
=	TokenNameEQUAL	
needed	TokenNameIdentifier	 needed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
