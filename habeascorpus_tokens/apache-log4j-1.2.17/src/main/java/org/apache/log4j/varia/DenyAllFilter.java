/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
varia	TokenNameIdentifier	 varia
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** This filter drops all logging events. <p>You can add this filter to the end of a filter chain to switch from the default "accept all unless instructed otherwise" filtering behaviour to a "deny all unless instructed otherwise" behaviour. @author Ceki G&uuml;lc&uuml; @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 This filter drops all logging events. <p>You can add this filter to the end of a filter chain to switch from the default "accept all unless instructed otherwise" filtering behaviour to a "deny all unless instructed otherwise" behaviour. @author Ceki G&uuml;lc&uuml; @since 0.9.0 
public	TokenNamepublic	
class	TokenNameclass	
DenyAllFilter	TokenNameIdentifier	 Deny All Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** Returns <code>null</code> as there are no options. @deprecated We now use JavaBeans introspection to configure components. Options strings are no longer needed. */	TokenNameCOMMENT_JAVADOC	 Returns <code>null</code> as there are no options. @deprecated We now use JavaBeans introspection to configure components. Options strings are no longer needed. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** No options to set. @deprecated Use the setter method for the option directly instead of the generic <code>setOption</code> method. */	TokenNameCOMMENT_JAVADOC	 No options to set. @deprecated Use the setter method for the option directly instead of the generic <code>setOption</code> method. 
public	TokenNamepublic	
void	TokenNamevoid	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Always returns the integer constant {@link Filter#DENY} regardless of the {@link LoggingEvent} parameter. @param event The LoggingEvent to filter. @return Always returns {@link Filter#DENY}. */	TokenNameCOMMENT_JAVADOC	 Always returns the integer constant {@link Filter#DENY} regardless of the {@link LoggingEvent} parameter. @param event The LoggingEvent to filter. @return Always returns {@link Filter#DENY}. 
public	TokenNamepublic	
int	TokenNameint	
decide	TokenNameIdentifier	 decide
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
DENY	TokenNameIdentifier	 DENY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
