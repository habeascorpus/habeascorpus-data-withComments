/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
;	TokenNameSEMICOLON	
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
IOError	TokenNameIdentifier	 IO Error
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FSError	TokenNameIdentifier	 FS Error
extends	TokenNameextends	
IOError	TokenNameIdentifier	 IO Error
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FSError	TokenNameIdentifier	 FS Error
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Unwraps the Throwable cause chain looking for an FSError instance * @param top the top-level Throwable to unwrap * @return FSError if found any, null otherwise */	TokenNameCOMMENT_JAVADOC	 Unwraps the Throwable cause chain looking for an FSError instance @param top the top-level Throwable to unwrap @return FSError if found any, null otherwise 
public	TokenNamepublic	
static	TokenNamestatic	
FSError	TokenNameIdentifier	 FS Error
findNested	TokenNameIdentifier	 find Nested
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
FSError	TokenNameIdentifier	 FS Error
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
FSError	TokenNameIdentifier	 FS Error
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
