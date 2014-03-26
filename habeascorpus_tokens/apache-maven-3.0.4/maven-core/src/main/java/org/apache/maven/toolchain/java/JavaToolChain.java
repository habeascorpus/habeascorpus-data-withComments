package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
toolchain	TokenNameIdentifier	 toolchain
.	TokenNameDOT	
java	TokenNameIdentifier	 java
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
toolchain	TokenNameIdentifier	 toolchain
.	TokenNameDOT	
Toolchain	TokenNameIdentifier	 Toolchain
;	TokenNameSEMICOLON	
/** * @author Jason van Zyl * @author Milos Kleint */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl @author Milos Kleint 
public	TokenNamepublic	
interface	TokenNameinterface	
JavaToolChain	TokenNameIdentifier	 Java Tool Chain
extends	TokenNameextends	
Toolchain	TokenNameIdentifier	 Toolchain
{	TokenNameLBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns a list of {@link java.io.File}s which represents the bootstrap libraries for the 	TokenNameCOMMENT_LINE	* Returns a list of {@link java.io.File}s which represents the bootstrap libraries for the 
// * runtime environment. The Bootstrap libraries include libraries in JRE's 	TokenNameCOMMENT_LINE	* runtime environment. The Bootstrap libraries include libraries in JRE's 
// * extension directory, if there are any. 	TokenNameCOMMENT_LINE	* extension directory, if there are any. 
// * 	TokenNameCOMMENT_LINE	* 
// * @return List 	TokenNameCOMMENT_LINE	* @return List 
// */ 	TokenNameCOMMENT_LINE	*/ 
// List getBootstrapLibraries(); 	TokenNameCOMMENT_LINE	List getBootstrapLibraries(); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns a list of {@link java.io.File}s which represent the libraries recognized by 	TokenNameCOMMENT_LINE	* Returns a list of {@link java.io.File}s which represent the libraries recognized by 
// * default by the platform. Usually it corresponds to contents of CLASSPATH 	TokenNameCOMMENT_LINE	* default by the platform. Usually it corresponds to contents of CLASSPATH 
// * environment variable. 	TokenNameCOMMENT_LINE	* environment variable. 
// * 	TokenNameCOMMENT_LINE	* 
// * @return List 	TokenNameCOMMENT_LINE	* @return List 
// */ 	TokenNameCOMMENT_LINE	*/ 
// List getStandardLibraries(); 	TokenNameCOMMENT_LINE	List getStandardLibraries(); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns a {@link java.io.File}s which represent the locations of the source of the JDK, 	TokenNameCOMMENT_LINE	* Returns a {@link java.io.File}s which represent the locations of the source of the JDK, 
// * or an empty collection when the location is not set or is invalid. 	TokenNameCOMMENT_LINE	* or an empty collection when the location is not set or is invalid. 
// * 	TokenNameCOMMENT_LINE	* 
// * @return List 	TokenNameCOMMENT_LINE	* @return List 
// */ 	TokenNameCOMMENT_LINE	*/ 
// List getSourceDirectories(); 	TokenNameCOMMENT_LINE	List getSourceDirectories(); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns a {@link java.io.File}s which represent the locations of the Javadoc for this platform, 	TokenNameCOMMENT_LINE	* Returns a {@link java.io.File}s which represent the locations of the Javadoc for this platform, 
// * or empty collection if the location is not set or invalid 	TokenNameCOMMENT_LINE	* or empty collection if the location is not set or invalid 
// * 	TokenNameCOMMENT_LINE	* 
// * @return List 	TokenNameCOMMENT_LINE	* @return List 
// */ 	TokenNameCOMMENT_LINE	*/ 
// List getJavadocFolders(); 	TokenNameCOMMENT_LINE	List getJavadocFolders(); 
}	TokenNameRBRACE	
