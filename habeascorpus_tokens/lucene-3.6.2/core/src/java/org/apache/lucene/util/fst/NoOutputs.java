package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
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
DataOutput	TokenNameIdentifier	 Data Output
;	TokenNameSEMICOLON	
/** * A null FST {@link Outputs} implementation; use this if * you just want to build an FSA. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A null FST {@link Outputs} implementation; use this if you just want to build an FSA. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NoOutputs	TokenNameIdentifier	 No Outputs
extends	TokenNameextends	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NodeHash calls hashCode for this output; we fix this 	TokenNameCOMMENT_LINE	NodeHash calls hashCode for this output; we fix this 
// so we get deterministic hashing. 	TokenNameCOMMENT_LINE	so we get deterministic hashing. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
NoOutputs	TokenNameIdentifier	 No Outputs
singleton	TokenNameIdentifier	 singleton
=	TokenNameEQUAL	
new	TokenNamenew	
NoOutputs	TokenNameIdentifier	 No Outputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NoOutputs	TokenNameIdentifier	 No Outputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
NoOutputs	TokenNameIdentifier	 No Outputs
getSingleton	TokenNameIdentifier	 get Singleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
singleton	TokenNameIdentifier	 singleton
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
output1	TokenNameIdentifier	 output1
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
assert	TokenNameassert	
output2	TokenNameIdentifier	 output2
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
inc	TokenNameIdentifier	 inc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
output	TokenNameIdentifier	 output
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
assert	TokenNameassert	
inc	TokenNameIdentifier	 inc
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
:	TokenNameCOLON	
"got "	TokenNameStringLiteral	got 
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
assert	TokenNameassert	
output	TokenNameIdentifier	 output
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//assert false; 	TokenNameCOMMENT_LINE	assert false; 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//assert false; 	TokenNameCOMMENT_LINE	assert false; 
//return null; 	TokenNameCOMMENT_LINE	return null; 
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
outputToString	TokenNameIdentifier	 output To String
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
