package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
pruning	TokenNameIdentifier	 pruning
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * General Definitions for Index Pruning, such as operations to be performed on field data. */	TokenNameCOMMENT_JAVADOC	 General Definitions for Index Pruning, such as operations to be performed on field data. 
public	TokenNamepublic	
class	TokenNameclass	
PruningPolicy	TokenNameIdentifier	 Pruning Policy
{	TokenNameLBRACE	
/** Delete (some or all) postings for this field. */	TokenNameCOMMENT_JAVADOC	 Delete (some or all) postings for this field. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEL_POSTINGS	TokenNameIdentifier	 DEL  POSTINGS
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Delete (some or all) stored values for this field. */	TokenNameCOMMENT_JAVADOC	 Delete (some or all) stored values for this field. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEL_STORED	TokenNameIdentifier	 DEL  STORED
=	TokenNameEQUAL	
0x02	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Delete term frequency vectors for this field (whole vectors or individual terms). */	TokenNameCOMMENT_JAVADOC	 Delete term frequency vectors for this field (whole vectors or individual terms). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEL_VECTOR	TokenNameIdentifier	 DEL  VECTOR
=	TokenNameEQUAL	
0x04	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Delete (some or all) payloads in these fields. */	TokenNameCOMMENT_JAVADOC	 Delete (some or all) payloads in these fields. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEL_PAYLOADS	TokenNameIdentifier	 DEL  PAYLOADS
=	TokenNameEQUAL	
0x08	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Delete all data for this field. */	TokenNameCOMMENT_JAVADOC	 Delete all data for this field. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEL_ALL	TokenNameIdentifier	 DEL  ALL
=	TokenNameEQUAL	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
