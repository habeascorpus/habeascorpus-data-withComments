package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Interface that exceptions should implement to support lazy loading of messages. * * For Native Language Support (NLS), system of software internationalization. * * This Interface should be implemented by all exceptions that require * translation * @deprecated Will be moved to a private package inside flexible query parser (Lucene 4.0). */	TokenNameCOMMENT_JAVADOC	 Interface that exceptions should implement to support lazy loading of messages. * For Native Language Support (NLS), system of software internationalization. * This Interface should be implemented by all exceptions that require translation @deprecated Will be moved to a private package inside flexible query parser (Lucene 4.0). 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
NLSException	TokenNameIdentifier	 NLS Exception
{	TokenNameLBRACE	
/** * @return a instance of a class that implements the Message interface */	TokenNameCOMMENT_JAVADOC	 @return a instance of a class that implements the Message interface 
public	TokenNamepublic	
Message	TokenNameIdentifier	 Message
getMessageObject	TokenNameIdentifier	 get Message Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
