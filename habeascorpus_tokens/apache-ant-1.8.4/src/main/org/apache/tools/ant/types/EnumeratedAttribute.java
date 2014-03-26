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
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Helper class for attributes that can only take one of a fixed list * of values. * * <p>See {@link org.apache.tools.ant.taskdefs.FixCRLF FixCRLF} for an * example. * */	TokenNameCOMMENT_JAVADOC	 Helper class for attributes that can only take one of a fixed list of values. * <p>See {@link org.apache.tools.ant.taskdefs.FixCRLF FixCRLF} for an example. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * The selected value in this enumeration. */	TokenNameCOMMENT_JAVADOC	 The selected value in this enumeration. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * the index of the selected value in the array. */	TokenNameCOMMENT_JAVADOC	 the index of the selected value in the array. 
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This is the only method a subclass needs to implement. * * @return an array holding all possible values of the enumeration. * The order of elements must be fixed so that <tt>indexOfValue(String)</tt> * always return the same index for the same value. */	TokenNameCOMMENT_JAVADOC	 This is the only method a subclass needs to implement. * @return an array holding all possible values of the enumeration. The order of elements must be fixed so that <tt>indexOfValue(String)</tt> always return the same index for the same value. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** bean constructor */	TokenNameCOMMENT_JAVADOC	 bean constructor 
protected	TokenNameprotected	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Factory method for instantiating EAs via API in a more * developer friendly way. * @param clazz Class, extending EA, which to instantiate * @param value The value to set on that EA * @return Configured EA * @throws BuildException If the class could not be found or the value * is not valid for the given EA-class. * @see <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=14831"> * http://issues.apache.org/bugzilla/show_bug.cgi?id=14831</a> */	TokenNameCOMMENT_JAVADOC	 Factory method for instantiating EAs via API in a more developer friendly way. @param clazz Class, extending EA, which to instantiate @param value The value to set on that EA @return Configured EA @throws BuildException If the class could not be found or the value is not valid for the given EA-class. @see <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=14831"> http://issues.apache.org/bugzilla/show_bug.cgi?id=14831</a> 
public	TokenNamepublic	
static	TokenNamestatic	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
/*<? extends EnumeratedAttribute>*/	TokenNameCOMMENT_BLOCK	<? extends EnumeratedAttribute>
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"You have to provide a subclass from EnumeratedAttribut as clazz-parameter."	TokenNameStringLiteral	You have to provide a subclass from EnumeratedAttribut as clazz-parameter.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
ea	TokenNameIdentifier	 ea
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ea	TokenNameIdentifier	 ea
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
)	TokenNameRPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ea	TokenNameIdentifier	 ea
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ea	TokenNameIdentifier	 ea
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked by {@link org.apache.tools.ant.IntrospectionHelper IntrospectionHelper}. * @param value the <code>String</code> value of the attribute * @throws BuildException if the value is not valid for the attribute */	TokenNameCOMMENT_JAVADOC	 Invoked by {@link org.apache.tools.ant.IntrospectionHelper IntrospectionHelper}. @param value the <code>String</code> value of the attribute @throws BuildException if the value is not valid for the attribute 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
indexOfValue	TokenNameIdentifier	 index Of Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
" is not a legal value for this attribute"	TokenNameStringLiteral	 is not a legal value for this attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Is this value included in the enumeration? * @param value the <code>String</code> value to look up * @return true if the value is valid */	TokenNameCOMMENT_JAVADOC	 Is this value included in the enumeration? @param value the <code>String</code> value to look up @return true if the value is valid 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
containsValue	TokenNameIdentifier	 contains Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
indexOfValue	TokenNameIdentifier	 index Of Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the index of a value in this enumeration. * @param value the string value to look for. * @return the index of the value in the array of strings * or -1 if it cannot be found. * @see #getValues() */	TokenNameCOMMENT_JAVADOC	 get the index of a value in this enumeration. @param value the string value to look for. @return the index of the value in the array of strings or -1 if it cannot be found. @see #getValues() 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
indexOfValue	TokenNameIdentifier	 index Of Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the selected value. */	TokenNameCOMMENT_JAVADOC	 @return the selected value. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the index of the selected value in the array. * @see #getValues() */	TokenNameCOMMENT_JAVADOC	 @return the index of the selected value in the array. @see #getValues() 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert the value to its string form. * * @return the string form of the value. */	TokenNameCOMMENT_JAVADOC	 Convert the value to its string form. * @return the string form of the value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
