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
loader	TokenNameIdentifier	 loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
;	TokenNameSEMICOLON	
/** * Overrides getResources which became non-final in Java5 and * implements Closeable */	TokenNameCOMMENT_JAVADOC	 Overrides getResources which became non-final in Java5 and implements Closeable 
public	TokenNamepublic	
class	TokenNameclass	
AntClassLoader5	TokenNameIdentifier	 Ant Class Loader5
extends	TokenNameextends	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
/** * Creates a classloader for the given project using the classpath given. * * @param parent The parent classloader to which unsatisfied loading * attempts are delegated. May be <code>null</code>, * in which case the classloader which loaded this * class is used as the parent. * @param project The project to which this classloader is to belong. * Must not be <code>null</code>. * @param classpath the classpath to use to load the classes. * May be <code>null</code>, in which case no path * elements are set up to start with. * @param parentFirst If <code>true</code>, indicates that the parent * classloader should be consulted before trying to * load the a class through this loader. */	TokenNameCOMMENT_JAVADOC	 Creates a classloader for the given project using the classpath given. * @param parent The parent classloader to which unsatisfied loading attempts are delegated. May be <code>null</code>, in which case the classloader which loaded this class is used as the parent. @param project The project to which this classloader is to belong. Must not be <code>null</code>. @param classpath the classpath to use to load the classes. May be <code>null</code>, in which case no path elements are set up to start with. @param parentFirst If <code>true</code>, indicates that the parent classloader should be consulted before trying to load the a class through this loader. 
public	TokenNamepublic	
AntClassLoader5	TokenNameIdentifier	 Ant Class Loader5
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
,	TokenNameCOMMA	
boolean	TokenNameboolean	
parentFirst	TokenNameIdentifier	 parent First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
classpath	TokenNameIdentifier	 classpath
,	TokenNameCOMMA	
parentFirst	TokenNameIdentifier	 parent First
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getNamedResources	TokenNameIdentifier	 get Named Resources
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
