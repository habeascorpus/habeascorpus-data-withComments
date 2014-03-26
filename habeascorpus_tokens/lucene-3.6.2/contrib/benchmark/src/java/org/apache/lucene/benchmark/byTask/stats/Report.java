package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
stats	TokenNameIdentifier	 stats
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Textual report of current statistics. */	TokenNameCOMMENT_JAVADOC	 Textual report of current statistics. 
public	TokenNamepublic	
class	TokenNameclass	
Report	TokenNameIdentifier	 Report
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
outOf	TokenNameIdentifier	 out Of
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
reported	TokenNameIdentifier	 reported
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Report	TokenNameIdentifier	 Report
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
int	TokenNameint	
reported	TokenNameIdentifier	 reported
,	TokenNameCOMMA	
int	TokenNameint	
outOf	TokenNameIdentifier	 out Of
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reported	TokenNameIdentifier	 reported
=	TokenNameEQUAL	
reported	TokenNameIdentifier	 reported
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outOf	TokenNameIdentifier	 out Of
=	TokenNameEQUAL	
outOf	TokenNameIdentifier	 out Of
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns total number of stats points when this report was created. */	TokenNameCOMMENT_JAVADOC	 Returns total number of stats points when this report was created. 
public	TokenNamepublic	
int	TokenNameint	
getOutOf	TokenNameIdentifier	 get Out Of
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outOf	TokenNameIdentifier	 out Of
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns number of lines in the report. */	TokenNameCOMMENT_JAVADOC	 Returns number of lines in the report. 
public	TokenNamepublic	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the report text. */	TokenNameCOMMENT_JAVADOC	 Returns the report text. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns number of stats points represented in this report. */	TokenNameCOMMENT_JAVADOC	 Returns number of stats points represented in this report. 
public	TokenNamepublic	
int	TokenNameint	
getReported	TokenNameIdentifier	 get Reported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reported	TokenNameIdentifier	 reported
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
