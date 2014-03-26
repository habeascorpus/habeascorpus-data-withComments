/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
klopotek	TokenNameIdentifier	 klopotek
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
log	TokenNameIdentifier	 log
;	TokenNameSEMICOLON	
/** This interface has to be implemented to provide ID-columns with unique IDs and its used in class JDBCLogger. <p><b>Author : </b><A HREF="mailto:t.fenner@klopotek.de">Thomas Fenner</A></p> @since 1.0 */	TokenNameCOMMENT_JAVADOC	 This interface has to be implemented to provide ID-columns with unique IDs and its used in class JDBCLogger. <p><b>Author : </b><A HREF="mailto:t.fenner@klopotek.de">Thomas Fenner</A></p> @since 1.0 
public	TokenNamepublic	
interface	TokenNameinterface	
JDBCIDHandler	TokenNameIdentifier	 JDBCID Handler
{	TokenNameLBRACE	
/**Get a unique ID*/	TokenNameCOMMENT_JAVADOC	Get a unique ID
Object	TokenNameIdentifier	 Object
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
