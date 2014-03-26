/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
/** * Build a potentially composite column name. */	TokenNameCOMMENT_JAVADOC	 Build a potentially composite column name. 
public	TokenNamepublic	
interface	TokenNameinterface	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
{	TokenNameLBRACE	
/** * Add a new ByteBuffer as the next component for this name. * @param bb the ByteBuffer to add * @throws IllegalStateException if the builder if full, i.e. if enough component has been added. * @return this builder */	TokenNameCOMMENT_JAVADOC	 Add a new ByteBuffer as the next component for this name. @param bb the ByteBuffer to add @throws IllegalStateException if the builder if full, i.e. if enough component has been added. @return this builder 
public	TokenNamepublic	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a new Term as the next component for this name. * @param t the Term to add * @param op the relationship this component should respect. * @param variables the variables corresponding to prepared markers * @throws IllegalStateException if the builder if full, i.e. if enough component has been added. * @return this builder */	TokenNameCOMMENT_JAVADOC	 Add a new Term as the next component for this name. @param t the Term to add @param op the relationship this component should respect. @param variables the variables corresponding to prepared markers @throws IllegalStateException if the builder if full, i.e. if enough component has been added. @return this builder 
public	TokenNamepublic	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Relation	TokenNameIdentifier	 Relation
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
variables	TokenNameIdentifier	 variables
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
/** * Returns the number of component already added to this builder. * @return the number of component in this Builder */	TokenNameCOMMENT_JAVADOC	 Returns the number of component already added to this builder. @return the number of component in this Builder 
public	TokenNamepublic	
int	TokenNameint	
componentCount	TokenNameIdentifier	 component Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the maximum number of component that can still be added to this Builder */	TokenNameCOMMENT_JAVADOC	 @return the maximum number of component that can still be added to this Builder 
public	TokenNamepublic	
int	TokenNameint	
remainingCount	TokenNameIdentifier	 remaining Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Build the column name. * @return the built column name */	TokenNameCOMMENT_JAVADOC	 Build the column name. @return the built column name 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Build the column name so that the result sorts at the end of the range * represented by this (uncomplete) column name. * @throws IllegalStateException if the builder is empty or full. */	TokenNameCOMMENT_JAVADOC	 Build the column name so that the result sorts at the end of the range represented by this (uncomplete) column name. @throws IllegalStateException if the builder is empty or full. 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buildAsEndOfRange	TokenNameIdentifier	 build As End Of Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Clone this builder. * @return the cloned builder. */	TokenNameCOMMENT_JAVADOC	 Clone this builder. @return the cloned builder. 
public	TokenNamepublic	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
