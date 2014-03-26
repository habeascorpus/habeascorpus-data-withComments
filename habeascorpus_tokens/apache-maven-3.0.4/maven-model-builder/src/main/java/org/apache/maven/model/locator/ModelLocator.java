package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Locates a POM file within a project base directory. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Locates a POM file within a project base directory. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ModelLocator	TokenNameIdentifier	 Model Locator
{	TokenNameLBRACE	
/** * Locates the POM file within the specified project directory. In case the given project directory does not exist * or does not contain a POM file, the return value indicates the expected path to the POM file. Sub directories of * the project directory will not be considered when locating the POM file. The return value will be an absolute * path if the project directory is given as an absolute path. * * @param projectDirectory The (possibly non-existent) base directory to locate the POM file in, must not be {@code * null}. * @return The path to the (possibly non-existent) POM file, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Locates the POM file within the specified project directory. In case the given project directory does not exist or does not contain a POM file, the return value indicates the expected path to the POM file. Sub directories of the project directory will not be considered when locating the POM file. The return value will be an absolute path if the project directory is given as an absolute path. * @param projectDirectory The (possibly non-existent) base directory to locate the POM file in, must not be {@code null}. @return The path to the (possibly non-existent) POM file, never {@code null}. 
File	TokenNameIdentifier	 File
locatePom	TokenNameIdentifier	 locate Pom
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
projectDirectory	TokenNameIdentifier	 project Directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
