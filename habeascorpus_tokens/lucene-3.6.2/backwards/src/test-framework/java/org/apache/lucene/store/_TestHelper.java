package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
SimpleFSDirectory	TokenNameIdentifier	 Simple FS Directory
.	TokenNameDOT	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
;	TokenNameSEMICOLON	
/** This class provides access to package-level features defined in the * store package. It is used for testing only. */	TokenNameCOMMENT_JAVADOC	 This class provides access to package-level features defined in the store package. It is used for testing only. 
public	TokenNamepublic	
class	TokenNameclass	
_TestHelper	TokenNameIdentifier	 Test Helper
{	TokenNameLBRACE	
/** Returns true if the instance of the provided input stream is actually * an SimpleFSIndexInput. */	TokenNameCOMMENT_JAVADOC	 Returns true if the instance of the provided input stream is actually an SimpleFSIndexInput. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSimpleFSIndexInput	TokenNameIdentifier	 is Simple FS Index Input
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
is	TokenNameIdentifier	 is
instanceof	TokenNameinstanceof	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if the provided input stream is an SimpleFSIndexInput and * is a clone, that is it does not own its underlying file descriptor. */	TokenNameCOMMENT_JAVADOC	 Returns true if the provided input stream is an SimpleFSIndexInput and is a clone, that is it does not own its underlying file descriptor. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSimpleFSIndexInputClone	TokenNameIdentifier	 is Simple FS Index Input Clone
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSimpleFSIndexInput	TokenNameIdentifier	 is Simple FS Index Input
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
.	TokenNameDOT	
isClone	TokenNameIdentifier	 is Clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Given an instance of SimpleFSDirectory.SimpleFSIndexInput, this method returns * true if the underlying file descriptor is valid, and false otherwise. * This can be used to determine if the OS file has been closed. * The descriptor becomes invalid when the non-clone instance of the * SimpleFSIndexInput that owns this descriptor is closed. However, the * descriptor may possibly become invalid in other ways as well. */	TokenNameCOMMENT_JAVADOC	 Given an instance of SimpleFSDirectory.SimpleFSIndexInput, this method returns true if the underlying file descriptor is valid, and false otherwise. This can be used to determine if the OS file has been closed. The descriptor becomes invalid when the non-clone instance of the SimpleFSIndexInput that owns this descriptor is closed. However, the descriptor may possibly become invalid in other ways as well. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSimpleFSIndexInputOpen	TokenNameIdentifier	 is Simple FS Index Input Open
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSimpleFSIndexInput	TokenNameIdentifier	 is Simple FS Index Input
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
isFDValid	TokenNameIdentifier	 is FD Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
