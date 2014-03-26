/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
/** FormattingInfo instances contain the information obtained when parsing formatting modifiers in conversion modifiers. @author <a href=mailto:jim_cakalic@na.biomerieux.com>Jim Cakalic</a> @author Ceki G&uuml;lc&uuml; @since 0.8.2 */	TokenNameCOMMENT_JAVADOC	 FormattingInfo instances contain the information obtained when parsing formatting modifiers in conversion modifiers. @author <a href=mailto:jim_cakalic@na.biomerieux.com>Jim Cakalic</a> @author Ceki G&uuml;lc&uuml; @since 0.8.2 
public	TokenNamepublic	
class	TokenNameclass	
FormattingInfo	TokenNameIdentifier	 Formatting Info
{	TokenNameLBRACE	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
leftAlign	TokenNameIdentifier	 left Align
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
leftAlign	TokenNameIdentifier	 left Align
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
dump	TokenNameIdentifier	 dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"min="	TokenNameStringLiteral	min=
+	TokenNamePLUS	
min	TokenNameIdentifier	 min
+	TokenNamePLUS	
", max="	TokenNameStringLiteral	, max=
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
+	TokenNamePLUS	
", leftAlign="	TokenNameStringLiteral	, leftAlign=
+	TokenNamePLUS	
leftAlign	TokenNameIdentifier	 left Align
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
