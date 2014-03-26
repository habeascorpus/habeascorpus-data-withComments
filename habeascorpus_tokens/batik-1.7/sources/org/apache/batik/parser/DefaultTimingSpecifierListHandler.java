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
/** * An adapter class for {@link TimingSpecifierListHandler}. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: DefaultTimingSpecifierListHandler.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An adapter class for {@link TimingSpecifierListHandler}. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: DefaultTimingSpecifierListHandler.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultTimingSpecifierListHandler	TokenNameIdentifier	 Default Timing Specifier List Handler
extends	TokenNameextends	
DefaultTimingSpecifierHandler	TokenNameIdentifier	 Default Timing Specifier Handler
implements	TokenNameimplements	
TimingSpecifierListHandler	TokenNameIdentifier	 Timing Specifier List Handler
{	TokenNameLBRACE	
/** * The default handler. */	TokenNameCOMMENT_JAVADOC	 The default handler. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TimingSpecifierListHandler	TokenNameIdentifier	 Timing Specifier List Handler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultTimingSpecifierListHandler	TokenNameIdentifier	 Default Timing Specifier List Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DefaultTimingSpecifierListHandler	TokenNameIdentifier	 Default Timing Specifier List Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when parsing of a timing specifier list commences. */	TokenNameCOMMENT_JAVADOC	 Invoked when parsing of a timing specifier list commences. 
public	TokenNamepublic	
void	TokenNamevoid	
startTimingSpecifierList	TokenNameIdentifier	 start Timing Specifier List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when parsing of a timing specifier list ends. */	TokenNameCOMMENT_JAVADOC	 Invoked when parsing of a timing specifier list ends. 
public	TokenNamepublic	
void	TokenNamevoid	
endTimingSpecifierList	TokenNameIdentifier	 end Timing Specifier List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
