/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StringOutputBuffer.java 468652 2006-10-28 07:05:17Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StringOutputBuffer.java 468652 2006-10-28 07:05:17Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
/** * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Santiago Pericas-Geertsen 
class	TokenNameclass	
StringOutputBuffer	TokenNameIdentifier	 String Output Buffer
implements	TokenNameimplements	
OutputBuffer	TokenNameIdentifier	 Output Buffer
{	TokenNameLBRACE	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
_buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StringOutputBuffer	TokenNameIdentifier	 String Output Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OutputBuffer	TokenNameIdentifier	 Output Buffer
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OutputBuffer	TokenNameIdentifier	 Output Buffer
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
int	TokenNameint	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OutputBuffer	TokenNameIdentifier	 Output Buffer
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
