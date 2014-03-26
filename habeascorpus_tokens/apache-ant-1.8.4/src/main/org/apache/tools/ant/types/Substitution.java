/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/*** * A regular expression substitution datatype. It is an expression * that is meant to replace a regular expression. * * <pre> * &lt;substitution [ [id="id"] expression="expression" | refid="id" ] * /&gt; * </pre> * * @see org.apache.oro.text.regex.Perl5Substitution */	TokenNameCOMMENT_JAVADOC	* A regular expression substitution datatype. It is an expression that is meant to replace a regular expression. * <pre> &lt;substitution [ [id="id"] expression="expression" | refid="id" ] /&gt; </pre> * @see org.apache.oro.text.regex.Perl5Substitution 
public	TokenNamepublic	
class	TokenNameclass	
Substitution	TokenNameIdentifier	 Substitution
extends	TokenNameextends	
DataType	TokenNameIdentifier	 Data Type
{	TokenNameLBRACE	
/** The name of this data type */	TokenNameCOMMENT_JAVADOC	 The name of this data type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATA_TYPE_NAME	TokenNameIdentifier	 DATA  TYPE  NAME
=	TokenNameEQUAL	
"substitution"	TokenNameStringLiteral	substitution
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
;	TokenNameSEMICOLON	
/** Constructor for Substitution. */	TokenNameCOMMENT_JAVADOC	 Constructor for Substitution. 
public	TokenNamepublic	
Substitution	TokenNameIdentifier	 Substitution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the pattern string for this regular expression substitution. * @param expression the regular expression to use */	TokenNameCOMMENT_JAVADOC	 Set the pattern string for this regular expression substitution. @param expression the regular expression to use 
public	TokenNamepublic	
void	TokenNamevoid	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
expression	TokenNameIdentifier	 expression
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** * Gets the pattern string for this RegularExpression in the * given project. * @param p the project to look for the regular expression if this object is * a reference * @return the pattern string */	TokenNameCOMMENT_JAVADOC	* Gets the pattern string for this RegularExpression in the given project. @param p the project to look for the regular expression if this object is a reference @return the pattern string 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** * Get the RegularExpression this reference refers to in * the given project. Check for circular references too. * @param p the project to look for the regular expression reference * @return the resolved reference */	TokenNameCOMMENT_JAVADOC	* Get the RegularExpression this reference refers to in the given project. Check for circular references too. @param p the project to look for the regular expression reference @return the resolved reference 
public	TokenNamepublic	
Substitution	TokenNameIdentifier	 Substitution
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Substitution	TokenNameIdentifier	 Substitution
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
