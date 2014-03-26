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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
/** * Handles deserialization of a model from some kind of textual format like XML. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Handles deserialization of a model from some kind of textual format like XML. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ModelReader	TokenNameIdentifier	 Model Reader
{	TokenNameLBRACE	
/** * The key for the option to enable strict parsing. This option is of type {@link Boolean} and defaults to {@code * true}. If {@code false}, unknown elements will be ignored instead of causing a failure. */	TokenNameCOMMENT_JAVADOC	 The key for the option to enable strict parsing. This option is of type {@link Boolean} and defaults to {@code true}. If {@code false}, unknown elements will be ignored instead of causing a failure. 
String	TokenNameIdentifier	 String
IS_STRICT	TokenNameIdentifier	 IS  STRICT
=	TokenNameEQUAL	
"org.apache.maven.model.io.isStrict"	TokenNameStringLiteral	org.apache.maven.model.io.isStrict
;	TokenNameSEMICOLON	
/** * The key for the option to enable tracking of line/column numbers. This option is of type * {@link org.apache.maven.model.InputSource} and defaults to {@code null}. Providing an input source enables * location tracking. */	TokenNameCOMMENT_JAVADOC	 The key for the option to enable tracking of line/column numbers. This option is of type {@link org.apache.maven.model.InputSource} and defaults to {@code null}. Providing an input source enables location tracking. 
String	TokenNameIdentifier	 String
INPUT_SOURCE	TokenNameIdentifier	 INPUT  SOURCE
=	TokenNameEQUAL	
"org.apache.maven.model.io.inputSource"	TokenNameStringLiteral	org.apache.maven.model.io.inputSource
;	TokenNameSEMICOLON	
/** * Reads the model from the specified file. * * @param input The file to deserialize the model from, must not be {@code null}. * @param options The options to use for deserialization, may be {@code null} to use the default values. * @return The deserialized model, never {@code null}. * @throws IOException If the model could not be deserialized. * @throws ModelParseException If the input format could not be parsed. */	TokenNameCOMMENT_JAVADOC	 Reads the model from the specified file. * @param input The file to deserialize the model from, must not be {@code null}. @param options The options to use for deserialization, may be {@code null} to use the default values. @return The deserialized model, never {@code null}. @throws IOException If the model could not be deserialized. @throws ModelParseException If the input format could not be parsed. 
Model	TokenNameIdentifier	 Model
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ModelParseException	TokenNameIdentifier	 Model Parse Exception
;	TokenNameSEMICOLON	
/** * Reads the model from the specified character reader. The reader will be automatically closed before the method * returns. * * @param input The reader to deserialize the model from, must not be {@code null}. * @param options The options to use for deserialization, may be {@code null} to use the default values. * @return The deserialized model, never {@code null}. * @throws IOException If the model could not be deserialized. * @throws ModelParseException If the input format could not be parsed. */	TokenNameCOMMENT_JAVADOC	 Reads the model from the specified character reader. The reader will be automatically closed before the method returns. * @param input The reader to deserialize the model from, must not be {@code null}. @param options The options to use for deserialization, may be {@code null} to use the default values. @return The deserialized model, never {@code null}. @throws IOException If the model could not be deserialized. @throws ModelParseException If the input format could not be parsed. 
Model	TokenNameIdentifier	 Model
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ModelParseException	TokenNameIdentifier	 Model Parse Exception
;	TokenNameSEMICOLON	
/** * Reads the model from the specified byte stream. The stream will be automatically closed before the method * returns. * * @param input The stream to deserialize the model from, must not be {@code null}. * @param options The options to use for deserialization, may be {@code null} to use the default values. * @return The deserialized model, never {@code null}. * @throws IOException If the model could not be deserialized. * @throws ModelParseException If the input format could not be parsed. */	TokenNameCOMMENT_JAVADOC	 Reads the model from the specified byte stream. The stream will be automatically closed before the method returns. * @param input The stream to deserialize the model from, must not be {@code null}. @param options The options to use for deserialization, may be {@code null} to use the default values. @return The deserialized model, never {@code null}. @throws IOException If the model could not be deserialized. @throws ModelParseException If the input format could not be parsed. 
Model	TokenNameIdentifier	 Model
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ModelParseException	TokenNameIdentifier	 Model Parse Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
