package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
io	TokenNameIdentifier	 io
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
;	TokenNameSEMICOLON	
/** * Handles serialization of a model into some kind of textual format like XML. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Handles serialization of a model into some kind of textual format like XML. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ModelWriter	TokenNameIdentifier	 Model Writer
{	TokenNameLBRACE	
/** * Writes the supplied model to the specified file. Any non-existing parent directories of the output file will be * created automatically. * * @param output The file to serialize the model to, must not be {@code null}. * @param options The options to use for serialization, may be {@code null} to use the default values. * @param model The model to serialize, must not be {@code null}. * @throws IOException If the model could not be serialized. */	TokenNameCOMMENT_JAVADOC	 Writes the supplied model to the specified file. Any non-existing parent directories of the output file will be created automatically. * @param output The file to serialize the model to, must not be {@code null}. @param options The options to use for serialization, may be {@code null} to use the default values. @param model The model to serialize, must not be {@code null}. @throws IOException If the model could not be serialized. 
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Writes the supplied model to the specified character writer. The writer will be automatically closed before the * method returns. * * @param output The writer to serialize the model to, must not be {@code null}. * @param options The options to use for serialization, may be {@code null} to use the default values. * @param model The model to serialize, must not be {@code null}. * @throws IOException If the model could not be serialized. */	TokenNameCOMMENT_JAVADOC	 Writes the supplied model to the specified character writer. The writer will be automatically closed before the method returns. * @param output The writer to serialize the model to, must not be {@code null}. @param options The options to use for serialization, may be {@code null} to use the default values. @param model The model to serialize, must not be {@code null}. @throws IOException If the model could not be serialized. 
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Writes the supplied model to the specified byte stream. The stream will be automatically closed before the method * returns. * * @param output The stream to serialize the model to, must not be {@code null}. * @param options The options to use for serialization, may be {@code null} to use the default values. * @param model The model to serialize, must not be {@code null}. * @throws IOException If the model could not be serialized. */	TokenNameCOMMENT_JAVADOC	 Writes the supplied model to the specified byte stream. The stream will be automatically closed before the method returns. * @param output The stream to serialize the model to, must not be {@code null}. @param options The options to use for serialization, may be {@code null} to use the default values. @param model The model to serialize, must not be {@code null}. @throws IOException If the model could not be serialized. 
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
