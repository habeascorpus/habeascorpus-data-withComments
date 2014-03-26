/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TFramedTransport	TokenNameIdentifier	 T Framed Transport
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TTransport	TokenNameIdentifier	 T Transport
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
FramedTransportFactory	TokenNameIdentifier	 Framed Transport Factory
extends	TokenNameextends	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_FRAME_SIZE	TokenNameIdentifier	 DEFAULT  MAX  FRAME  SIZE
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 15 MiB 	TokenNameCOMMENT_LINE	15 MiB 
public	TokenNamepublic	
TTransport	TokenNameIdentifier	 T Transport
getTransport	TokenNameIdentifier	 get Transport
(	TokenNameLPAREN	
TTransport	TokenNameIdentifier	 T Transport
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TFramedTransport	TokenNameIdentifier	 T Framed Transport
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
DEFAULT_MAX_FRAME_SIZE	TokenNameIdentifier	 DEFAULT  MAX  FRAME  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
