/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
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
public	TokenNamepublic	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
