/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * This interface must be implemented and then registered as the * handler of a {@link ClockParser} instance in order * to be notified of parsing events. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: ClockHandler.java 575200 2007-09-13 07:40:30Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented and then registered as the handler of a {@link ClockParser} instance in order to be notified of parsing events. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: ClockHandler.java 575200 2007-09-13 07:40:30Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ClockHandler	TokenNameIdentifier	 Clock Handler
{	TokenNameLBRACE	
/** * Invoked when a clock value is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a clock value is parsed. 
void	TokenNamevoid	
clockValue	TokenNameIdentifier	 clock Value
(	TokenNameLPAREN	
float	TokenNamefloat	
clockValue	TokenNameIdentifier	 clock Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
