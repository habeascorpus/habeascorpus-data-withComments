/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
/** * CharReader is a Reader wrapper. It reads chars from * Reader and outputs {@link CharStream}, defining an * identify function {@link #correctOffset} method that * simply returns the provided offset. */	TokenNameCOMMENT_JAVADOC	 CharReader is a Reader wrapper. It reads chars from Reader and outputs {@link CharStream}, defining an identify function {@link #correctOffset} method that simply returns the provided offset. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CharReader	TokenNameIdentifier	 Char Reader
extends	TokenNameextends	
CharStream	TokenNameIdentifier	 Char Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
CharStream	TokenNameIdentifier	 Char Stream
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
input	TokenNameIdentifier	 input
instanceof	TokenNameinstanceof	
CharStream	TokenNameIdentifier	 Char Stream
?	TokenNameQUESTION	
(	TokenNameLPAREN	
CharStream	TokenNameIdentifier	 Char Stream
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
:	TokenNameCOLON	
new	TokenNamenew	
CharReader	TokenNameIdentifier	 Char Reader
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CharReader	TokenNameIdentifier	 Char Reader
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
int	TokenNameint	
currentOff	TokenNameIdentifier	 current Off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentOff	TokenNameIdentifier	 current Off
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
int	TokenNameint	
readAheadLimit	TokenNameIdentifier	 read Ahead Limit
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
readAheadLimit	TokenNameIdentifier	 read Ahead Limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
