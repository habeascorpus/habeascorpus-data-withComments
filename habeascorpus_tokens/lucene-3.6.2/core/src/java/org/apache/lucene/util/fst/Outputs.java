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
/** * Represents the outputs for an FST, providing the basic * algebra required for building and traversing the FST. * * <p>Note that any operation that returns NO_OUTPUT must * return the same singleton object from {@link * #getNoOutput}.</p> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Represents the outputs for an FST, providing the basic algebra required for building and traversing the FST. * <p>Note that any operation that returns NO_OUTPUT must return the same singleton object from {@link #getNoOutput}.</p> * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
// TODO: maybe change this API to allow for re-use of the 	TokenNameCOMMENT_LINE	TODO: maybe change this API to allow for re-use of the 
// output instances -- this is an insane amount of garbage 	TokenNameCOMMENT_LINE	output instances -- this is an insane amount of garbage 
// (new object per byte/char/int) if eg used during 	TokenNameCOMMENT_LINE	(new object per byte/char/int) if eg used during 
// analysis 	TokenNameCOMMENT_LINE	analysis 
/** Eg common("foo", "foobar") -> "foo" */	TokenNameCOMMENT_JAVADOC	 Eg common("foo", "foobar") -> "foo" 
public	TokenNamepublic	
abstract	TokenNameabstract	
T	TokenNameIdentifier	 T
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Eg subtract("foobar", "foo") -> "bar" */	TokenNameCOMMENT_JAVADOC	 Eg subtract("foobar", "foo") -> "bar" 
public	TokenNamepublic	
abstract	TokenNameabstract	
T	TokenNameIdentifier	 T
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
inc	TokenNameIdentifier	 inc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Eg add("foo", "bar") -> "foobar" */	TokenNameCOMMENT_JAVADOC	 Eg add("foo", "bar") -> "foobar" 
public	TokenNamepublic	
abstract	TokenNameabstract	
T	TokenNameIdentifier	 T
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
T	TokenNameIdentifier	 T
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** NOTE: this output is compared with == so you must * ensure that all methods return the single object if * it's really no output */	TokenNameCOMMENT_JAVADOC	 NOTE: this output is compared with == so you must ensure that all methods return the single object if it's really no output 
public	TokenNamepublic	
abstract	TokenNameabstract	
T	TokenNameIdentifier	 T
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
outputToString	TokenNameIdentifier	 output To String
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: maybe make valid(T output) public...? for asserts 	TokenNameCOMMENT_LINE	TODO: maybe make valid(T output) public...? for asserts 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
