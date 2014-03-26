package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
/** * Provides access to the contents of a POM independently of the backing store (e.g. file system, database, memory). * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Provides access to the contents of a POM independently of the backing store (e.g. file system, database, memory). * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ModelSource	TokenNameIdentifier	 Model Source
{	TokenNameLBRACE	
/** * Gets a byte stream to the POM contents. Closing the returned stream is the responsibility of the caller. * * @return A byte stream to the POM contents, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets a byte stream to the POM contents. Closing the returned stream is the responsibility of the caller. * @return A byte stream to the POM contents, never {@code null}. 
InputStream	TokenNameIdentifier	 Input Stream
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Provides a user-friendly hint about the location of the POM. This could be a local file path, a URI or just an * empty string. The intention is to assist users during error reporting. * * @return A user-friendly hint about the location of the POM, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Provides a user-friendly hint about the location of the POM. This could be a local file path, a URI or just an empty string. The intention is to assist users during error reporting. * @return A user-friendly hint about the location of the POM, never {@code null}. 
String	TokenNameIdentifier	 String
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
