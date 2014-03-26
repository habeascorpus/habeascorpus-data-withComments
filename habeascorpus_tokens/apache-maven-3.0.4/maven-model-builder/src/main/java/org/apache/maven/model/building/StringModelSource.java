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
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
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
/** * Wraps an ordinary {@link CharSequence} as a model source. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Wraps an ordinary {@link CharSequence} as a model source. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
StringModelSource	TokenNameIdentifier	 String Model Source
implements	TokenNameimplements	
ModelSource	TokenNameIdentifier	 Model Source
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pom	TokenNameIdentifier	 pom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
/** * Creates a new model source backed by the specified string. * * @param pom The POM's string representation, may be empty or {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new model source backed by the specified string. * @param pom The POM's string representation, may be empty or {@code null}. 
public	TokenNamepublic	
StringModelSource	TokenNameIdentifier	 String Model Source
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new model source backed by the specified string. * * @param pom The POM's string representation, may be empty or {@code null}. * @param location The location to report for this use, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new model source backed by the specified string. * @param pom The POM's string representation, may be empty or {@code null}. @param location The location to report for this use, may be {@code null}. 
public	TokenNamepublic	
StringModelSource	TokenNameIdentifier	 String Model Source
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pom	TokenNameIdentifier	 pom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
pom	TokenNameIdentifier	 pom
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
location	TokenNameIdentifier	 location
:	TokenNameCOLON	
"(memory)"	TokenNameStringLiteral	(memory)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the character sequence of this model source. * * @return The underlying character stream, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the character sequence of this model source. * @return The underlying character stream, never {@code null}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pom	TokenNameIdentifier	 pom
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
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
