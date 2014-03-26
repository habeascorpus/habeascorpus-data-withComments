package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
UScript	TokenNameIdentifier	 U Script
;	TokenNameSEMICOLON	
// javadoc @link 	TokenNameCOMMENT_LINE	javadoc @link 
/** * This attribute stores the UTR #24 script value for a token of text. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This attribute stores the UTR #24 script value for a token of text. @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
ScriptAttribute	TokenNameIdentifier	 Script Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
/** * Get the numeric code for this script value. * This is the constant value from {@link UScript}. * @return numeric code */	TokenNameCOMMENT_JAVADOC	 Get the numeric code for this script value. This is the constant value from {@link UScript}. @return numeric code 
public	TokenNamepublic	
int	TokenNameint	
getCode	TokenNameIdentifier	 get Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the numeric code for this script value. * This is the constant value from {@link UScript}. * @param code numeric code */	TokenNameCOMMENT_JAVADOC	 Set the numeric code for this script value. This is the constant value from {@link UScript}. @param code numeric code 
public	TokenNamepublic	
void	TokenNamevoid	
setCode	TokenNameIdentifier	 set Code
(	TokenNameLPAREN	
int	TokenNameint	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the full name. * @return UTR #24 full name. */	TokenNameCOMMENT_JAVADOC	 Get the full name. @return UTR #24 full name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the abbreviated name. * @return UTR #24 abbreviated name. */	TokenNameCOMMENT_JAVADOC	 Get the abbreviated name. @return UTR #24 abbreviated name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getShortName	TokenNameIdentifier	 get Short Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
