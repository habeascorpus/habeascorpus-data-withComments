package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
categorypolicy	TokenNameIdentifier	 categorypolicy
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
CategoryParentsStream	TokenNameIdentifier	 Category Parents Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Filtering category paths in {@link CategoryParentsStream}, where a given * category is added to the stream, and than all its parents are being * added one after the other by successively removing the last component. <br> * That loop should have a stop point - the default approach (excluding the * ROOT) is implemented in {@link DefaultOrdinalPolicy}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Filtering category paths in {@link CategoryParentsStream}, where a given category is added to the stream, and than all its parents are being added one after the other by successively removing the last component. <br> That loop should have a stop point - the default approach (excluding the ROOT) is implemented in {@link DefaultOrdinalPolicy}. * @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
PathPolicy	TokenNameIdentifier	 Path Policy
extends	TokenNameextends	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * Check whether a given category path should be added to the stream. * * @param categoryPath * A given category path which is to be tested for stream * addition. * @return <code>true</code> if the category path should be added. * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Check whether a given category path should be added to the stream. * @param categoryPath A given category path which is to be tested for stream addition. @return <code>true</code> if the category path should be added. <code>false</code> otherwise. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
shouldAdd	TokenNameIdentifier	 should Add
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
