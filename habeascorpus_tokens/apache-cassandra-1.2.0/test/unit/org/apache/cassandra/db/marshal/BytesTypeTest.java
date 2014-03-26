/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
BytesTypeTest	TokenNameIdentifier	 Bytes Type Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_HEX	TokenNameIdentifier	 INVALID  HEX
=	TokenNameEQUAL	
"33AG45F"	TokenNameStringLiteral	33AG45F
;	TokenNameSEMICOLON	
// Invalid (has a G) 	TokenNameCOMMENT_LINE	Invalid (has a G) 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALID_HEX	TokenNameIdentifier	 VALID  HEX
=	TokenNameEQUAL	
"33A45F"	TokenNameStringLiteral	33A45F
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
MarshalException	TokenNameIdentifier	 Marshal Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testFromStringWithInvalidString	TokenNameIdentifier	 test From String With Invalid String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
INVALID_HEX	TokenNameIdentifier	 INVALID  HEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFromStringWithValidString	TokenNameIdentifier	 test From String With Valid String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
VALID_HEX	TokenNameIdentifier	 VALID  HEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
